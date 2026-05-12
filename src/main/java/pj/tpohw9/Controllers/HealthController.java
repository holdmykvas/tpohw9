package pj.tpohw9.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pj.tpohw9.DTOs.BmiDto;
import pj.tpohw9.DTOs.BmrDto;
import pj.tpohw9.Services.BmiBmrService;


@RestController
@RequestMapping(
        path = "/api/v1",
        produces = {
                org.springframework.http.MediaType.APPLICATION_JSON_VALUE,
                org.springframework.http.MediaType.APPLICATION_XML_VALUE
        }
)
public class HealthController {

    private final BmiBmrService service;

    public HealthController(BmiBmrService service) {
        this.service = service;
    }


    @GetMapping("/BMI")
    public ResponseEntity<BmiDto> getBmi(@RequestParam float weight, @RequestParam float height) {
        try {
            return ResponseEntity.ok(service.CalculateBMI(weight, height));
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.status(400)
                    .header("reason", "invalid data, weight, height and age parameters must be positive numbers")
                    .build();
        }
    }

    @GetMapping("/BMR/{gender}")
    public ResponseEntity<BmrDto> getBmr(@PathVariable String gender, @RequestParam float weight, @RequestParam float height, @RequestParam int age) {
        try {
            return ResponseEntity.ok(service.CalculateBMR(gender,weight,height,age));
        } catch (IllegalArgumentException ex) {
            if (ex.getMessage().contains("gender")) {
                return ResponseEntity
                        .status(400)
                        .header("reason", "invalid gender data")
                        .build();
            } else {
                return ResponseEntity.status(499)
                        .header("reason", "invalid data, weight, height and age parameters must be positive numbers")
                        .build();
            }


        }
    }
}

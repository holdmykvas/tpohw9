package pj.tpohw9.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pj.tpohw9.DTOs.BmiDto;
import pj.tpohw9.DTOs.BmrDto;


@RestController
@RequestMapping("/api/v1")
public class ExchangeController {

    @GetMapping("/BMI")
    public ResponseEntity<BmiDto> getBmi(@RequestParam float weight, @RequestParam float height) {
        return null;
    }

    @GetMapping("/BMR/{gender}")
    public ResponseEntity<BmrDto> getBmr(@PathVariable String gender, @RequestParam float weight, @RequestParam float height, @RequestParam int age) {
        return null;
    }
}

package pj.tpohw9.Controllers;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class ExchangeController {

    @GetMapping("/BMI")
    @ResponseBody
    public String getBmi(@RequestParam float weight, @RequestParam float height) {
        return null;
    }

    @GetMapping("/BRM/{gender}")
    @ResponseBody
    public String getBrmGender(@PathVariable String gender,@RequestParam float weight,@RequestParam float height,@RequestParam int age) {
        return null;
    }
}

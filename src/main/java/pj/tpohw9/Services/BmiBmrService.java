package pj.tpohw9.Services;

import org.springframework.stereotype.Service;
import pj.tpohw9.BmiCategory;
import pj.tpohw9.DTOs.BmiDto;
import pj.tpohw9.DTOs.BmrDto;

@Service
public class BmiBmrService {

    public BmiDto CalculateBMI(float weight, float height) {
        if (weight <= 0.0) throw new IllegalArgumentException("Weight can't be negative");

        if (height <= 0.0) throw new IllegalArgumentException("Height can't be negative");

        var heightConversed = height / 100;
        var bmi = (float) (weight / Math.pow(heightConversed, 2));
        var type = BmiCategory.classify(bmi).toString();

        BmiDto dto = new BmiDto();
        dto.setWeight(weight);
        dto.setHeight(height);
        dto.setBmi(bmi);
        dto.setBmiCategory(type);
        return dto;
    }

    public BmrDto CalculateBMR(String gender, float weight, float height, int age) {
        if (weight <= 0.0) throw new IllegalArgumentException("Weight can't be negative");

        if (height <= 0.0) throw new IllegalArgumentException("Height can't be negative");

        if (age <= 0) throw new IllegalArgumentException("Age can't be negative");

        float brm;
        if (gender.equalsIgnoreCase("man")) {
            brm = (float) ( 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age));
        } else if (gender.equalsIgnoreCase("woman")) {
            brm = (float) ( 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age));
        } else {
            throw new IllegalArgumentException("The gender is not right");
        }

        BmrDto dto = new BmrDto();
        dto.setAge(age);
        dto.setGender(gender);
        dto.setWeight(weight);
        dto.setHeight(height);
        dto.setBmr(brm);
        return dto;
    }
}

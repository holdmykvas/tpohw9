package pj.tpohw9.Services;

import org.springframework.stereotype.Service;
import pj.tpohw9.BmiCategory;

@Service
public class BriBrmService {

    public void CalculateBMI(float weight, float height) {
        var heightConversed = height / 100;
        var bmi = (int) (weight / Math.pow(heightConversed, 2));
        var type = BmiCategory.classify(bmi).toString();
    }

    public void CalculateBMR(String gender, float weight, float height, int age) {

        if (gender.equalsIgnoreCase("man")) {
            var brm = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        } else if (gender.equalsIgnoreCase("woman")) {
            var brm = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        } else {
            throw new IllegalArgumentException("The gender is not right");
        }
    }
}

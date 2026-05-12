package pj.tpohw9;

public enum BmiCategory {
    Underweight, Normal, Overweight, Obese;
    public static BmiCategory classify(double bmi) {
        if (bmi < 18.5) {
            return Underweight;
        } else if (18.5 < bmi && bmi < 24.9) {
            return Normal;
        } else if (25 < bmi && bmi < 29.9) {
            return Overweight;
        } else {
            return Obese;
        }
    }
}

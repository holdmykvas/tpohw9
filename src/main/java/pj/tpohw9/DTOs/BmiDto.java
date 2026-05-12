package pj.tpohw9.DTOs;

public class BmiDto {
    float weight;
    float height;
    float bmi;
    String bmiCategory;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }

    public String getBmiCategory() {
        return bmiCategory;
    }

    public void setBmiCategory(String bmiCategory) {
        this.bmiCategory = bmiCategory;
    }
}

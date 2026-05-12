package pj.tpohw9.DTOs;

public class BmiDto {
    float weight;
    float height;
    int bmi;
    String type;

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

    public int getBmi() {
        return bmi;
    }

    public void setBmi(int bmi) {
        this.bmi = bmi;
    }

    public String getBmiCategory() {
        return type;
    }

    public void setBmiCategory(String bmiCategory) {
        this.type = bmiCategory;
    }
}

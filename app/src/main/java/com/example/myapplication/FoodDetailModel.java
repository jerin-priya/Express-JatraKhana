package com.example.myapplication;

public class FoodDetailModel {
    int img, foodPrice;
<<<<<<< Updated upstream
    String foodName;

    public FoodDetailModel(int img, int foodPrice, String foodName) {
        this.img = img;
        this.foodPrice = foodPrice;
        this.foodName = foodName;
=======
    String foodName, foodType;

    public FoodDetailModel(int img, int foodPrice, String foodName, String foodType) {
        this.img = img;
        this.foodPrice = foodPrice;
        this.foodName = foodName;
        this.foodType = foodType;
    }
    public FoodDetailModel(){}

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
>>>>>>> Stashed changes
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}

package org.example.Pet;

public class Tool {
    private int shampoo=8;
    private int water =10;
    private int brush =2;
    private int dryer =10;
    private int scissors =1;

    public void setDryer(int dryer){
        this.dryer = dryer;
    }
    public int getDryer(){
        return this.dryer;
    }

    public int setShampoo(int shampoo){
        return this.shampoo = shampoo;
    }
    public int getShampoo(){
        return this.shampoo;
    }

    public int setBrush(int brush){
        return this.brush = brush;
    }
    public int getBrush(){
        return this.brush;
    }
    public int setWater(int water){
        return this.water = water;
    }
    public int getWater(){
        return this.water;
    }

    public int getScissors(){
        return this.scissors;
    }
//    public void setScissors(int scissors){
//        this.scissors = scissors;
//    }


}

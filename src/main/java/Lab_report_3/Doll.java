package Lab_report_3;

import java.util.Random;

public class Doll{
    private String name;
    private String hair_colour;
    private String wear;
    private String hair_style;
    
    private String[] colour_option = {"Red", "Orange", "Yellow","Green","Blue","Black"};
    private String[] wear_option = {"shirt", "dress", "jacket"};
    private String[] hair_option = {"short", "long"};

    public Doll(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHair_colour() {
        return hair_colour;
    }

    public void setHair_colour(String hair_colour) {
        this.hair_colour = hair_colour;
    }

    public String getWear() {
        return wear;
    }

    public void setWear(String wear) {
        this.wear = wear;
    }

    public String getHair_style() {
        return hair_style;
    }

    public void setHair_style(String hair_style) {
        this.hair_style = hair_style;
    }

    Random r=new Random();
    
    public void randomGenerator(){
        hair_colour=colour_option[r.nextInt(6)];
        wear=wear_option[r.nextInt(3)];
        hair_style=hair_option[r.nextInt(2)];
       
    }
    
    public void ChangeHairColour(){
        for (int i=0; i<colour_option.length; i++){
            if(!hair_colour.equals(colour_option[i])){
                hair_colour = colour_option[i];
                System.out.println("Doll hair change to " + getHair_colour() + " colour!");
                System.out.println("Hair Colour: " + getHair_colour());
                break;
            }
        }
    }
    
    public void cutHair(){
        if(hair_style.equals(hair_option[1])){
            hair_style = hair_option[0];
            System.out.println("Doll hair are cutted to short!");
            System.out.println("Hair: " + getHair_style());
        }
        else
            System.out.println("Doll hair are still short!");
    }
    
}
package Lab_report_3;


import Lab_report_3.Doll;


public class Doll_Tester {
    public static void main(String[]args){
        Doll a=new Doll("Barbie");
        a.randomGenerator();
        System.out.println("The doll name is "+a.getName()+".");
        System.out.println("The doll hair is "+a.getHair_colour()+ " colour.");
        System.out.println("The doll wears "+a.getWear()+".");
        System.out.println("The doll has "+a.getHair_style()+" hair.");
        System.out.println("--------------------------------------------------------------");
        a.ChangeHairColour();
        System.out.println("");
        a.cutHair();
        System.out.println("--------------------------------------------------------------");
        
        
        
        
        
        
        
        
    }
}

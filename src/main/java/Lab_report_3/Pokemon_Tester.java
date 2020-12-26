package Lab_report_3;


import Lab_report_3.Pokemon;


public class Pokemon_Tester {
    public static void main(String[]args){
        //Sample test 1
        Pokemon p = new Pokemon("25","Pikachu","Electric");
        p.randomGenerator();
        System.out.println("Level 1 ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Unique ID of the Pokemon: " + p.getID());
        System.out.println("Pokemon Name: " + p.getPokemon_Name());
        System.out.println("Element Type: " + p.getElement_Type());
        System.out.println("Hit Point(HP): " + p.getHit_Point());
        System.out.println("Attack: " + p.getAttack());
        System.out.println("Defense: " + p.getDefense());
        System.out.println("Speed: " + p.getSpeed());
        System.out.println("Special: " + p.getSpecial());
        System.out.println("Level: " + p.getLevel() + "\n");

        p.levelUp(3);
        System.out.println("Level 4 ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Unique ID of the Pokemon: " + p.getID());
        System.out.println("Pokemon Name: " + p.getPokemon_Name());
        System.out.println("Element Type: " + p.getElement_Type());
        System.out.println("Hit Point(HP): " + p.getHit_Point());
        System.out.println("Attack: " + p.getAttack());
        System.out.println("Defense: " + p.getDefense());
        System.out.println("Speed: " + p.getSpeed());
        System.out.println("Special: " + p.getSpecial());
        System.out.println("Level: " + p.getLevel());
    
        // Sample test 2
        Pokemon d = new Pokemon("1","Donald_Duck","Fire");
        d.randomGenerator();
        System.out.println("Level 1 ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Unique ID of the Pokemon: " + d.getID());
        System.out.println("Pokemon Name: " + d.getPokemon_Name());
        System.out.println("Element Type: " + d.getElement_Type());
        System.out.println("Hit Point(HP): " + d.getHit_Point());
        System.out.println("Attack: " + d.getAttack());
        System.out.println("Defense: " + d.getDefense());
        System.out.println("Speed: " + d.getSpeed());
        System.out.println("Special: " + d.getSpecial());
        System.out.println("Level: " + d.getLevel() + "\n");

        p.levelUp(3);
        System.out.println("Level 4 ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Unique ID of the Pokemon: " + d.getID());
        System.out.println("Pokemon Name: " + d.getPokemon_Name());
        System.out.println("Element Type: " + d.getElement_Type());
        System.out.println("Hit Point(HP): " + d.getHit_Point());
        System.out.println("Attack: " + d.getAttack());
        System.out.println("Defense: " + d.getDefense());
        System.out.println("Speed: " + d.getSpeed());
        System.out.println("Special: " + d.getSpecial());
        System.out.println("Level: " + d.getLevel());
    
    
    }
     
    
}


//PalmerPenguins.java
//Daniel Rojas
//5/17/2026
//This program will uses System.out.println to to get familer with the Java environment

public class PalmerPenguins {
   
   static final String SP_CHINSTRAP = "Chinstrap";
   static final String SP_GENTOO = "Gentoo";
   static final String SP_ADELIE = "Adelie";
   
   static final int TOTAL_SPECIES = 3;
   
   public static void main(String[] args) {
   
   //out line species name and text
   System.out.println("Introducing the Palmer Peguins: ");
   System.out.println("\t" + SP_CHINSTRAP + "!");
   System.out.println("\t" + SP_GENTOO + "!");
   System.out.println("and last but not least...");
   System.out.println("\t" + SP_ADELIE + "!");
   System.out.println("There are a total of " + TOTAL_SPECIES +
                      " penguin species in the this dataset.");
   }
}
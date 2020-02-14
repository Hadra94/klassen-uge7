import java.util.Scanner;

public class BMI {
  public static void main(String[] args) {
    // lav en scanner
    Scanner ms = new Scanner(System.in);

    // bed om højde
   System.out.println("Hvor høj er du? (meter)") ;
    // hent til scanner
   double h = ms.nextDouble();
   
    
    // bed om vægt
   System.out.println("Hvad vejer du? (kg)") ;
    
    // hent til scanner
   double w = ms.nextDouble();
    
    // bed om navn
   System.out.println("Hvad hedder du?") ;
    
    // hent til scanner
   ms.nextLine(); 
   String navn = ms.nextLine(); 
    // OBS: pas på scanner-buggen
    
   double bmi = w/Math.pow(h,2);
   System.out.println("Din bmi er: " + bmi) ;
    // gem format-linjen i en streng-variabel for sig
    // udregn bmi og udskriv vha printf(format,navn,bmi)

   String format = "Hej %s ";
   System.out.printf(format,bmi);
    
  
  }


}

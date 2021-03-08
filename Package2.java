import java.util.Scanner;   

   public class Package2 {

      public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         // Enter the weight of the package
         System.out.print("Enter the weight of the package: ");
         double weight = input.nextDouble();

         if (weight > 20)
            System.out.println("The package cannot be shipped.");
         // Calculate the cost of shipping
         else
         {
            double costPerPound; 
            if (weight > 0 && weight <= 2)
               costPerPound = 2.5;
            else if (weight <= 2)
               costPerPound = 4.5;
            else if (weight <= 10)
               costPerPound = 7.5;
            else
               costPerPound = 10.5;
            System.out.println("Shipping cost of package is $" +
               costPerPound * weight);
         }
        }
       }


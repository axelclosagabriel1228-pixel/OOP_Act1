// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Canteen {
   public Canteen() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      double[] var2 = new double[]{(double)80.0F, (double)120.0F, (double)100.0F, (double)70.0F, (double)90.0F};
      int var3 = 0;
      double var4 = (double)0.0F;
      double var6 = (double)0.0F;
      char var8 = 'Y';
      System.out.println("=====   M E N U   =====");
      System.out.println("1. Burger      - $80.00");
      System.out.println("2. Pizza       - $120.00");
      System.out.println("3. Pasta       - $100.00");
      System.out.println("4. Sandwich    - $70.00");
      System.out.println("5. Milk Tea    - $90.00");
      System.out.println();

      do {
         System.out.print("Enter item number: ");
         int var9 = var1.nextInt();
         if (var9 >= 1 && var9 <= 5) {
            System.out.print("Enter quantity: ");
            int var10 = var1.nextInt();
            if (var10 >= 1 && var10 <= 10) {
               System.out.print("Are you a student? (Y/N): ");
               char var11 = var1.next().toUpperCase().charAt(0);
               double var12 = var2[var9 - 1] * (double)var10;
               double var14 = (double)0.0F;
               boolean var16 = var11 == 'Y';
               if (var16 && var12 >= (double)500.0F) {
                  var14 = 0.15;
               } else if (var16) {
                  var14 = 0.1;
               } else if (var12 >= (double)500.0F) {
                  var14 = 0.05;
               }

               double var17 = var12 * var14;
               double var19 = var12 - var17;
               System.out.printf("\nSubtotal: $%.2f\n", var12);
               System.out.printf("Discount: $%.2f\n", var17);
               System.out.printf("Order total: $%.2f\n\n", var19);
               var3 += var10;
               var4 += var12;
               var6 += var17;
               System.out.print("Do you want to order again? (Y/N): ");
               var8 = var1.next().toUpperCase().charAt(0);
               System.out.println();
            } else {
               System.out.println("\nInvalid order! Please enter a valid item and quantity.\n");
               System.out.print("Do you want to order again? (Y/N): ");
               var8 = var1.next().toUpperCase().charAt(0);
               System.out.println();
            }
         } else {
            System.out.println("\nInvalid order! Please enter a valid item and quantity.\n");
            System.out.print("Do you want to order again? (Y/N): ");
            var8 = var1.next().toUpperCase().charAt(0);
            System.out.println();
         }
      } while(var8 == 'Y');

      double var22 = var4 - var6;
      System.out.println("===== ORDER SUMMARY =====");
      System.out.println("Total items: " + var3);
      System.out.printf("Total before discount: $%.2f\n", var4);
      System.out.printf("Total discount: $%.2f\n", var6);
      System.out.printf("Final amount: $%.2f\n", var22);
      System.out.println("Thank you for ordering!");
      var1.close();
   }
}

/*
 *Alessandro Paselli
 *04/26/22
 *A powers related program
 */
package powers;

/**
 *
 * @author Alessandro
 */
import java.util.Scanner;
public class Powers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int ans=0;
        while(ans!=4){
         System.out.println("Please, select an option");
         System.out.println("1… Find the value of a number squared");
         System.out.println("2… Find the value of a number cubed");
         System.out.println("3… Find the value of a number, to any power");
         System.out.println("4… Exit");
         ans=scan.nextInt();
         if(ans==1){
             System.out.println("Please, enter a double");
             double n1=scan.nextDouble();
             System.out.println(Math.pow(n1,2));
         }
         else if(ans==2){
             System.out.println("Please, enter a double");
             double n2=scan.nextDouble();
             System.out.println(Math.pow(n2,3)); 
         }
         else if(ans==3){
             System.out.println("Please, enter a double and an exponent");
             double n3=scan.nextDouble();
             double ex=scan.nextDouble();
             System.out.println(Math.pow(n3,ex)); 
         }
        }
        System.out.println("Thank you for using this program");
    }
    
}

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
        double ans1=1;
        double ans2=1;
        double ans3=1;
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
             for(int y=0;y<2;y++){
                ans1=ans1*n1; 
             }
             System.out.println(ans1);
         }
         else if(ans==2){
             System.out.println("Please, enter a double");
             double n2=scan.nextDouble();
             for(int y=0;y<3;y++){
                ans2=ans2*n2; 
             }
             System.out.println(ans2); 
         }
         else if(ans==3){
             System.out.println("Please, enter a double and an exponent");
             double n3=scan.nextDouble();
             double ex=scan.nextDouble();
             for(int y=0;y<ex;y++){
                ans3=ans3*n3; 
             }
             System.out.println(ans3); 
         }
        }
        System.out.println("Thank you for using this program");
    }
    
}

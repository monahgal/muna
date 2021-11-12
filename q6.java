import java.util.Scanner;
public class q6 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter perfomance level ");
        double perfomance = input.nextDouble();
        System.out.println("Enter base salary ");
        double base = input.nextDouble();
        double bonus = 0.03*base;
        double salary = bonus + base ;
        if (perfomance >= 90){
            System.out.println("Salary is " +salary);
        }
        else{
            System.out.println("salary is " +base);
        
        }
    }
}




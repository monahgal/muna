import java.util.Scanner;
public class q3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of participant");
        int parti = input.nextInt();
        int rev = 2500 * parti;
        System.out.println("The revenue of the company that will generate for the tour is " +rev);
        
    }

}
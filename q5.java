import java.util.Scanner;
public class q5 {
    public static void main(String[]args){
        System.out.println("How many eggs do you have");
        Scanner input = new Scanner(System.in);
        int num_of_eggs = input.nextInt();
        int gross = num_of_eggs / 144;
        int Dozen = (num_of_eggs % 144)/12;
        int remainder = num_of_eggs% 12;
        System.out.println("You have " +gross+ " Gross," +Dozen+ " Dozens  and " +remainder+ " eggs. "  );
    }

}
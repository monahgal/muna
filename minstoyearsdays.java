import java.util.Scanner;
public class minstoyearsdays {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter minutes ");
    int min = input.nextInt();

    int h = 60;
    int d = 60*24;
    int y = d*365;

    int years = min/y;
    int days = (min % y) /d;

    System.out.printf("%d  minutes is approximately %d years and %d days.", min,years, days);
    }

}
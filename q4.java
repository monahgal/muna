import java.util.Scanner;
public class q4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of gallon");
        int gallon = input.nextInt();
        System.out.println("Enter number of miles per gallon");
        int miles = input.nextInt();
        System.out.println("Please enter price");
        int price = input.nextInt();
        int distance = (gallon * miles);
        int cost = (250/gallon);
        System.out.println("The car can travel with the gas in miles " +distance);
        System.out.println("The cost of traveling with miles per car is " +cost);
    }

}
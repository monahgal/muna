import java.util.*;
class q2{
    public static void main(String[]args){
        System.out.println("Word Game");
        System.out.println("Enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("what city were you born in?");
        input.nextLine();
        String city = input.nextLine();
        System.out.println("Which collage did you finish");
        String collage = input.nextLine();
        System.out.println("what is yor proffesion");
        String proffesion = input.nextLine();
        System.out.println("What is your favorite animal");
        String animal = input.nextLine();
        System.out.println("what is your petname name");
        String petname = input.nextLine();
        System.out.println("There was a person " + name + " who lived in a city " + city + " at the age of " + age + " went to collage " + collage + " graduated and went to work as " + proffesion + " adopted animal " + animal + " named " + petname + " they both lived happily ever after " );
    }
}




        
    
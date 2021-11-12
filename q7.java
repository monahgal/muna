import java.util.Scanner;
public class q7 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter first number ");
    int f_num = input.nextInt();
    System.out.println("Please enter second number ");
    int s_num = input.nextInt();
    int hcf, lcm, a, b, c;
    a = f_num;
    b = s_num;
    while(b!=0){
        c = b;
        b = a%b;
        a = c;
    }
    hcf = a;
    lcm = (f_num*s_num)/hcf;

    System.out.println("The HCF of input number is " +hcf);
    System.out.println("The LCM of input number is " +lcm);
    }
}



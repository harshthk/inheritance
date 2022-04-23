import java.util.Scanner;

class calculator{
    public int addition(int a , int b){
        return a+b;
    }
}
class advcalculator extends calculator{
    public int subtraction (int a , int b){
        return a-b;
    }
}
class veryadvcalculator extends advcalculator{
    public int multiplication(int a, int b) {
        return a*b;
    }
}
public class Main {
    public static void main(String[] args) {
        veryadvcalculator c1 = new veryadvcalculator();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a:- ");
        int a = scan.nextInt();
        System.out.print("Enter the value of b:- ");
        int b = scan.nextInt();
        System.out.println(c1.multiplication(a,b));
        System.out.println(c1.addition(a,b));
        System.out.println(c1.subtraction(a,b));
    }
}
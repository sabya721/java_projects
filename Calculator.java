import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Please choose the calculation you want to perform:");
        System.out.println("1-Add");
        System.out.println("2-Subtract");
        System.out.println("3-Multiply");
        System.out.println("4-Divide");
        System.out.println("5-Mod");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        int c=0;
        switch (s){
            case 1://FOR ADDITION
                c=a+b;
                System.out.println("The output is " +c);
                break;
            case 2://FOR SUBSTRACTION
                c=a-b;
                System.out.println("The output is "+c);
                break;
            case 3://FOR PRODUCT
                c=a*b;
                System.out.println("The output is "+c);
                break;
            case 4://FOR DIVISON
                c=a/b;
                System.out.println("The output is "+c);
            case 5://FOR MODULO
                c=a%b;
                System.out.println("The output is "+c);
                break;
            default:
                System.out.println("Input error");
        }
    }
}

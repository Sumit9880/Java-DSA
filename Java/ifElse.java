import java.util.Scanner;

public class ifElse {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter a number: ");
        // int num = scanner.nextInt();
        System.out.print("Enter a Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Your Name is " + name);
        // if(num > 0){
        //     System.out.println("The give number is Positive");
        // }else if(num < 0){
        //     System.out.println("The give number is Negative");
        // }else{
        //     System.out.println("The give number is Zero");
        // }

        scanner.close();
    }
}
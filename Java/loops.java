import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number for see its Table :");
        int num = scanner.nextInt();
        int i = 1;

        // for loop
        // for(int i=0; i<10; i++){
        //     System.out.println(num * (i + 1));
        // }

        // while loop
        // while(i <= 10){
        //     System.out.println(num * i);
        //     i++;
        // }

        // do while
        do{
            System.out.println(num * i);
            i++;
        } while(i <= 10);
        
        scanner.close();
    }
}
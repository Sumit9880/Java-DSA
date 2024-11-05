public class methods{

    public static void main(String[] args){
        int a = 2;
        int b = 2;
        int sum = addition(a,b);
        System.out.println("Sum is : "+ sum);
        isPrime(sum);
    }

    public static int addition(int a,int b){
        return a+b ;
    }

    public static void isPrime(int a){
        boolean is = false;

        for(int i = 2; i < a ; i++){
            if(a % i == 0){
                is = true;
            }
        }

        if(is){
            System.out.println("Given numer is Not Prime");
        }else{
            System.out.println("Given numer is Prime");
        }

    }
}
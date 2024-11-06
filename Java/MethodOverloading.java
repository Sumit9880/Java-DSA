class Calculator{

    public int sum(int a,int b){
        return a + b;
    }

    public int sum(int a, int b, int c){
        return a + b + c;
    }

}

public class MethodOverloading{
    public static void main (String[] args){
        Calculator cal = new Calculator();

        int a = 2;
        int b = 5;
        int c = 8;
        
        System.out.println("method 1 :"+ cal.sum(a,b));
        System.out.println("method 2 :"+ cal.sum(a,b,c));
    }
}
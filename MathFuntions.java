package OOP_method_overlaoding;

public class MathFuntions {

    public  int add(int a, int b){
        return a + b;
    }

    public int substarct(int a , int b){
        return a - b;
    }

    public  int multiply(int a, int b){
        return  a * b;
    }

    public double divide(int a , int b){
        return (double) a / b;
    }

    public int abs(int num){
        if (num < 0){
            return num * -1;
        }
        else {
            return  num;
        }
    }

    public int POW(int num){
        return  num * num;
    }

    public static void main(String[] args) {
        MathFuntions function = new MathFuntions();
        System.out.println(function.add(4, 5));
        System.out.println(function.abs(-12));
        System.out.println(function.divide(3, 2));
        System.out.println(function.POW(3));
        System.out.println(function.substarct(4, 5));
        System.out.println(function.multiply(3 , 2));
    }

}

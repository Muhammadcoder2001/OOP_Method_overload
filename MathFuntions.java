package OOP_method_overlaoding;

public class MathFuntions {

    public  void add(int a, int b){
        System.out.println(a + b);
    }

    public int substarct(int a , int b){
        return a - b;
    }

    public  double multiply(int a, int b){
        return  a * b;
    }

    public double divide(int a , int b){
        return a / b;
    }

    public int abs(int num){
        if (num < 0){
            return num * -1;
        }
        else {
            return  num;
        }
    }

    public double POW(int num){
        return  num * num;
    }



}

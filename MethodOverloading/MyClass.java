package MethodOverloading;

public class MyClass {
    public void Add(){
        System.out.println("Use void type");
    }
    public int Add(int a, int b){
        return a+b;
    }
    public int Add(int a, int b,int c){
        return a+b+c;
    }
    public double Add(double a, double b){
        return a+b;
    }
    public String Add(String a,String b){
        return a+b;
    }
}

package Inheritance;

public class SuperClass {
    public  int a;
    public  int b;

    public static int c = 10;
    public int Addition(){
        return a+b;
    }
    public int Subtraction(){
        return a-b;
    }
    public int Multiapplication(){
        return a*b;
    }
    public int Division(){
        return a/b;
    }
    public static String fullName(String s,String k){
        return s+k;
    }
}

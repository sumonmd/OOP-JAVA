package OOP;

public class Operation {
    public  int a;
    public  int b;
    public static int c = 10;
    Operation(int a,int b){
        this.a=a;
        this.b=b;
    }
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

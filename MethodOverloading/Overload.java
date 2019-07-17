package MethodOverloading;

public class Overload {
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.Add();
        System.out.println(mc.Add(5,6));
        System.out.println(mc.Add(5,6,4));
        System.out.println(mc.Add(2.33444,3.34444));
        System.out.println(mc.Add("Md ","Sumon"));
    }
}

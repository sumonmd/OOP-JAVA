package Interface;

public class MyClass implements ABC{
    public void hello(){
        System.out.println("Hello Interface");
    }
    public static void main(String args[]){
        MyClass my = new MyClass();
        my.hello();

    }
}

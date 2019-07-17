package OOP;

public class HelloWorld {
    public static void main(String args[])
    {
        Operation op = new Operation(4,5);
        int x = op.Addition();
        System.out.println("Addition is "+ op.Addition());
        System.out.println("Addition is "+ op.Division());
        System.out.println("Addition is "+ op.Subtraction());
        System.out.println("Hello, World "+Operation.c );
        System.out.println(Operation.fullName("Md ","Sumon") );
    }
}

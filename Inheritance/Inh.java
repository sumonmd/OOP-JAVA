package Inheritance;

public class Inh {

    public static void main(String args[]) {
        SubClass sb = new SubClass(15,10);
        System.out.println("Addition is : "+sb.Addition());
        System.out.println("Subtraction is : "+sb.Subtraction());
        System.out.println("Multiplication is : "+sb.Multiapplication());
        System.out.println("Division is : "+sb.Division());
        System.out.println("Modulas is : " +sb.Modulus());
    }

}

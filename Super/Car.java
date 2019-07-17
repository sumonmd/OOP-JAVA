package Super;

public class Car extends Vehicle {

    public String str = " Car ";

    public void sound(){
        super.sound();
        System.out.println(super.str);
    }
}

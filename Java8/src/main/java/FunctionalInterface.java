
interface  calculator{
//    void switchOn();
    void sum(int a , int b);
}
public class FunctionalInterface
{
    public static void main(String[] args) {
//        calculator Cal = () -> System.out.println("SwitchOn");
//        Cal.switchOn();

        calculator sum = (a , b) -> System.out.println(a+b);
        sum.sum(10,22);
    }

}



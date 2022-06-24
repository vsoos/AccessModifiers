package pckg2;
import pckg1.*;

public class Asub extends A {
    // public static void main(String[] args) {
        // C c = new C();
        // b System.out.println(c.defaultMessage);
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);

    }
}

public class ArvTest {

    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();
        A ba = new B();
        A ca = new C();
        B bc = new C();

        a.skrivKlasse();
        b.skrivKlasse();

        ba.skrivKlasse();

        ca.skrivKlasse();

        bc.skrivKlasse();
        

    }
}
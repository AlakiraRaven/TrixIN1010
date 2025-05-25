// Trix 2.07
public class TestBaathus {
    
    public static void main(String[] args) {
        Baathus hus = new Baathus(3);

        Baat b1 = new Baat("Triton");
        Baat b2 = new Baat("Chaparral");
        Baat b3 = new Baat("Mercury");
        Baat b4 = new Baat("Mercury");

        hus.settInn(b1);
        hus.settInn(b2);
        hus.settInn(b3);
        hus.settInn(b4);

        hus.skrivBaater();
    }
}
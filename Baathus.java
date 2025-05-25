//Trix 2.07
public class Baathus {

    int antPlasser;
    Baat[] baater;

    public Baathus(int antallPlasser) {
        antPlasser = antallPlasser;
        baater = new Baat[antPlasser];
    }

    public void settInn(Baat båt) {
        for (int i = 0; i < baater.length; i++) {
            if (baater[i] == null) {
                baater[i] = båt;
                break;
            } else if (i == baater.length-1) {
                System.out.println("Out of range");
            }
        }
    }

    public void skrivBaater() {
        for (int i = 0; i < baater.length; i++) {
            System.out.println(baater[i].hentInfo());
        }
    }
}
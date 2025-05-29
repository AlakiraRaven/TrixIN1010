//Trix 6.02

import org.w3c.dom.Node;

public class KvadratStabel {
    Node start;
    Node end;
    int size = 0;

    public boolean erTom() { //returnerer sant hvis, og bare hvis, stabelen er tom.
        return start == null;
    }


    public void leggPaa(Kvadrat k) {
        if (erTom()) {
            start = new Node(k);
        } else {
            Node next = start;

        }


    }
}
//leggPaa() - et element dyttes på toppen av stabelen.
//taAv() - et element tas av toppen av stabelen og returneres. Hvis stabelen er tom skal den returnere null.

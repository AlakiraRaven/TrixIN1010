//Trix 6.02

import org.w3c.dom.Node;

public class KvadratStabel {
    Node start = null;
    Node end = null;

    public boolean erTom() { //returnerer sant hvis, og bare hvis, stabelen er tom.
        return start == null;
    }
}
//leggPaa() - et element dyttes på toppen av stabelen.
//taAv() - et element tas av toppen av stabelen og returneres. Hvis stabelen er tom skal den returnere null.

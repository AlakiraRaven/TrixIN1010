import java.util.HashMap;

public class Telefonbok {

    public static void main(String[] args) {
        HashMap<String, String> bok = new HashMap<>();

        bok.put("Arne", "22334455");
        bok.put("Lisa", "95959595");
        bok.put("Jonas", "97959795");
        bok.put("Peder", "12345678");


        for (String string : bok.keySet()) {
            System.out.println("Navn: " + string + ", tlf: " + bok.get(string));
        }


    }
}
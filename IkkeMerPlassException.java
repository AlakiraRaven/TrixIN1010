public class IkkeMerPlassException extends Exception {
    public IkkeMerPlassException(String boken) {
        super("Ikke mer plass til: " + boken);
    }    
}
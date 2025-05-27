public class DuplikatExeption extends Exception {
    public DuplikatExeption(String boken) {
        super("Du har mer en enn av: " + boken);
    }
}
package People;

public class Show {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Lehi", 1.65f, 58.6f);
        String result = p1.status();
        System.out.println(result);
    }
}

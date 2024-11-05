package Trying;

public class Show {
    public static void main(String[] args) {
        Mesa c1 = new Mesa("Rolim", 0.9f, "bah");
        String r = c1.status();
        System.out.println(r);
    }
}

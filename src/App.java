import br.edu.iftm.heranca.Gerente;

public class App {
    public static void main(String[] args) throws Exception {
        Gerente g = new Gerente("Maria", "123456789", 5000d, 100, 10);
        g.autentica(100);
        System.out.println(g.getBonificacao());
    }
}

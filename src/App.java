import br.edu.iftm.heranca.ControleDeBonificacao;
import br.edu.iftm.heranca.Funcionario;
import br.edu.iftm.heranca.Gerente;
import br.edu.iftm.heranca.Secretaria;

public class App {
    public static void main(String[] args) throws Exception {
        Gerente g = new Gerente("Maria", "123456789", 5000d, 100, 10);
        //g.autentica(100);
        //System.out.println(g.getBonificacao());
        //Funcionario f= g;
        //System.out.println(f.getBonificacao());
        Secretaria s = new Secretaria("Julia", "987654321", 2000d);
        ControleDeBonificacao cb = new ControleDeBonificacao();
        cb.registra(g);
        cb.registra(s);
        System.out.println(cb.getTotalDeBonificacoes());
        Funcionario[] vet = new Funcionario[2];
        vet[0] = s;
        vet[1] = g;

    }
}

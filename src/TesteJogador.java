public class TesteJogador {

    public static void main(String[] args) {
        Humano h = new Humano("Pedro",'X');
        Computador c = new Computador("CPU",'O');
        //h.setSimbolo('X');
        //c.setSimbolo('O');

        Jogo j = new Jogo();
        j.realizarJogado(h, 2, 2);
        j.realizarJogado(c, 1, 1);

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                /*if(j.tabuleiro[i][k] == ' '){
                    System.out.print(" * ");
                }else{*/
                    System.out.print((j.tabuleiro[i][k])+" ");
               // }
                
            }
            System.out.println();
        }
        
    }
    
}

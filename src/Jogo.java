public class Jogo {

    public char[][] tabuleiro = {{'_','_','_'},{'_','_','_'},{'_','_','_'}}; 

    public void realizarJogado(Jogador j, int posicaoL, int posicaoC){
            if(posicaoC < 3 && posicaoC >=0){
                tabuleiro[posicaoL][posicaoC] = j.getSimbolo();
            }
    }    
}

//olá Prazer sou thiago Stepanenko de sousa
//apresento aqui um jogo da velha
//após entregar ele como trabalho para a faculdade entregarei 
//ele a disposição de quem quiser continuar a desenvolvera partir de onde parei.



package jogodavelha;

import java.util.Scanner;

public class JogodaVelha {

    // A seguir a função principal do código
    // Permite jogar 2 pessoas.
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      Tabuleiros t = new Tabuleiros();
      int jogadorAtual = 0;
      String[] simbolos = {"O","X"};
      int l,c;
      
      while(t.verificarGanhador().equals("N")){
          System.out.println("--JOGADOR ATUAL: " + simbolos[jogadorAtual] + " --");
          System.out.println("Digite a linha a ser jogada: ");
          l = leitor.nextInt();
          System.out.println("Dite a coluna a serjogada: ");
          c = leitor.nextInt();
          if(!t.setSimbolo(l, c, simbolos[jogadorAtual])){
              System.out.println("Jogada inválida!");
              continue;
          }
          System.out.println(t);
          
          if(jogadorAtual == 0){
             jogadorAtual = 1;
          }else{
             jogadorAtual = 0;
          }
      }
      
      System.out.println("Ganhador: " + t.verificarGanhador());
    }
 }
    


/**
 * Created by Amanda on 05/01/2016.
 */

import java.util.Scanner;

public class Interface {
    Jogador1 jogador;
    Jogador1 jogador2;
    FabricaDeBaralho baralho = new FabricaDeBaralho();
    Carta jogadaA;
    Carta jogadaB;
    Carta carta1 = new Carta();
    Carta carta2 = new Carta();

    Scanner teclado = new Scanner(System.in);
    //sc.Next();

    void iniciaJogo() {
        System.out.println("Bem vindo ao truco! gostaria de iniciar o jogo? favor digite o nome do seu jogador: ");
        jogador = new Jogador1();
        jogador2 = new Jogador1();
        jogador.setName(teclado.next());
        System.out.println("muito bem, " + jogador.getName() + " vamos começar!");
        jogador2.setName("maquina");
        baralho.criaBaralho();
        baralho.embaralha();
        for (int i = 1; i < 4; i++) {
            jogador.guardaCartas(baralho.daCartas());

        }
        for (int i = 1; i < 4; i++) {
            jogador2.guardaCartas(baralho.daCartas());

        }


        for (int i = 1; i < 4; i++) {
            jogador.getCartas();
            jogadaA = jogador.jogaCarta();
            System.out.println("Sua jogada:");
            baralho.revelaCarta(jogadaA);
            jogadaB = jogador2.maquinaJogaCarta();
            System.out.println("Jogada máquina:");
            baralho.revelaCarta(jogadaB);
            if (jogadaA.value == jogadaB.value) {
                System.out.println("empate");
                jogador.setPontuacao();
                jogador2.setPontuacao();
            } else if (jogadaA.value > jogadaB.value) {
                System.out.println("você venceu essa rodada!");
                jogador.setPontuacao();
            } else {
                System.out.println("a maquina venceu essa rodada!");
                jogador2.setPontuacao();
            }


        }
        avaliaPontuacao();
    }


    void avaliaPontuacao() {
        if (jogador.getPontuacao() == jogador2.getPontuacao()) {
            System.out.println("EMPATE!!");
        } else if (jogador.getPontuacao() > jogador2.getPontuacao()) {
            System.out.println("VITORIA SUA! " + jogador.getName());
        } else {
            System.out.println("vitoria da maquina ;/ #xatiadu");
        }
    }


}

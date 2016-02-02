/**
 * Created by Amanda on 04/01/2016.
 */

import java.util.Scanner;

public class Jogador1 {
    private String name;
    Carta[] cartas = new Carta[3];
    FabricaDeBaralho baralho = new FabricaDeBaralho();
    int posicaoCarta = 0;
    int aux = 0;
    private int pontuacao = 0;

    Scanner digita = new Scanner(System.in);

    Jogador1() {
        iniciaCartas();
    }

    void setName(String name) {

        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setPontuacao() {
        pontuacao = pontuacao + 1;
    }

    int getPontuacao() {
        return pontuacao;
    }


    private void iniciaCartas() {
        for (int i = 0; i < 3; i++) {
            cartas[i] = new Carta();
        }


    }

    void guardaCartas(Carta carta) {
        cartas[posicaoCarta] = carta;
        posicaoCarta = posicaoCarta + 1;

    }

    void getCartas() {
        System.out.println("Suas cartas sao: ");
        for (int i = 0; i < cartas.length; i++) {
            int num = i + 1;
            System.out.println(" carta na posicao " + i + " -> naipe: " + cartas[i].naipe + "/ de numero: " + cartas[i].numero + " e de valor: " + cartas[i].value);
        }
    }

    public Carta jogaCarta() {

        System.out.println("digite a posição da carta que voce deseja jogar: ");
        Carta[] newCartas = new Carta[cartas.length - 1];
        int posicao = digita.nextInt();

        int cont = 0;
        for (int i = 0; i < cartas.length; i++) {
            if (i != posicao) {
                newCartas[cont] = cartas[i];
                cont++;
            }
        }

        Carta carta = cartas[posicao];
        cartas = newCartas;

        return carta;

    }


    public Carta maquinaJogaCarta() {
        Carta[] cartasAposJogada = new Carta[cartas.length - 1];
        Carta jogada;
        jogada = cartas[cartas.length - 1];
        for (int i = 0; i < cartasAposJogada.length; i++) {
            cartasAposJogada[i] = cartas[i];
        }
        cartas = cartasAposJogada;
        return jogada;

    }


}




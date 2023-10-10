package ProvaLP;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class JogoMontyHall {
    public static void main(String[] args) {
        menu();

    }

    private static void menu() {
        Scanner scn = new Scanner(System.in);
        Random rdn = new Random();

        int portaEscolhida;
        int portaPremiada;
        int portaVazia;
        int novaPorta = 0;

        System.out.println("Bem-vindo ao jogo Monty Hall!");
        System.out.print("Escolha uma porta --> 1, 2 ou 3: ");
        portaEscolhida = scn.nextInt();

        portaPremiada = rdn.nextInt(3) + 1;

        do {
            portaVazia = rdn.nextInt(3) + 1;
        } while (portaVazia == portaPremiada || portaVazia == portaEscolhida);

        System.out.println("A porta " + portaVazia + " foi aberta e está vazia.");
        System.out.print("Você deseja trocar a porta escolhida? (Digite S para sim e N para não) ");
        String escolha = scn.next();

        if (Objects.equals(escolha, "n") || Objects.equals(escolha, "N")) {
            portaEscolhida = portaEscolhida;
        } else if (Objects.equals(escolha, "s") || Objects.equals(escolha, "S")) {
            do {
                novaPorta = rdn.nextInt(3) + 1;
            } while (novaPorta == portaVazia || novaPorta == portaEscolhida);


        }

        if (portaEscolhida == portaPremiada && novaPorta == 0 || novaPorta == portaPremiada) {
            System.out.println("Você ganhou! Parabéns!");
        } else {
            System.out.println("Que pena! A porta premiada era a " + portaPremiada);
        }

        System.out.println("\nPorta Premiada = " + portaPremiada);
        System.out.println("Porta Vazia = " + portaVazia);
        System.out.println("Porta Escolhida = " + portaEscolhida);
        System.out.println("Porta nova escolhida = " +novaPorta);

    }


}
import domain.StrategyType;

import java.util.Random;
import java.util.Scanner;
import static domain.StrategyType.*;

public class Main {
    // Remoção de números mágicos


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, 4-LAGARTO, 5-SPOCK ]\n");
        int player = in.nextInt();
        StrategyType strategyPlayer = StrategyType.getById(player);
        int computer = new Random().nextInt(5) + 1;
        StrategyType strategyComputer = StrategyType.getById(computer);
        System.out.println("O COMPUTADOR escolheu: " + strategyComputer);
        System.out.println("O JOGADOR escolheu: " + strategyPlayer);


        if (strategyPlayer == PAPEL && strategyComputer == PAPEL) {
            System.out.println("Empate. Papel empata com papel!");
        } else if (strategyPlayer == PAPEL && strategyComputer == TESOURA) {
            System.out.println("Perdeu! Tesoura corta o papel!");
        } else if (strategyPlayer == PAPEL && strategyComputer == PEDRA) {
            System.out.println("Ganhou! Pedra embrulha o papel!");
        } else if (strategyPlayer == PAPEL && strategyComputer == LAGARTO) {
            System.out.println("Perdeu! Lagarto come o papel!");
        }

        else if (strategyPlayer == PAPEL) {
            System.out.println("Ganhou! Papel refuta o Spock!");
        } else if (strategyPlayer == TESOURA && strategyComputer == PAPEL) {
            System.out.println("Ganhou. Tesoura corta o papel!");
        } else if (strategyPlayer == TESOURA && strategyComputer == TESOURA) {
            System.out.println("Empate! Tesoura empata com tesoura!");
        } else if (strategyPlayer == TESOURA && strategyComputer == PEDRA) {
            System.out.println("Perdeu! Pedra quebra a tesoura!");
        } else if (strategyPlayer == TESOURA && strategyComputer == LAGARTO) {
            System.out.println("Ganhou! Tesoura decapta o lagarto!");
        }

        else if (strategyPlayer == TESOURA) {
            System.out.println("Perdeu! Spock derrete a tesoura!");
        } else if (strategyPlayer == PEDRA && strategyComputer == PAPEL) {
            System.out.println("Perdeu. Papel embrulha a pedar!");
        } else if (strategyPlayer == PEDRA && strategyComputer == TESOURA) {
            System.out.println("Empate! Tesoura empata com tesoura!");
        } else if (strategyPlayer == PEDRA && strategyComputer == PEDRA) {
            System.out.println("Empatou! Pedra empata com pedra!");
        } else if (strategyPlayer == PEDRA && strategyComputer == LAGARTO) {
            System.out.println("Ganhou! Pedra esmaga o lagarto!");
        } else if (strategyPlayer == PEDRA) {
            System.out.println("Perdeu! Spock vaporiza a apedra!");
        } else if (strategyPlayer == LAGARTO && strategyComputer == PAPEL) {
            System.out.println("Ganhou. Lagarto come papel!");
        } else if (strategyPlayer == LAGARTO && strategyComputer == TESOURA) {
            System.out.println("Perdeu! Tesoura decapta o lagarto!");
        } else if (strategyPlayer == LAGARTO && strategyComputer == PEDRA) {
            System.out.println("Perdeu! Pedra esmaga lagarto!");
        } else if (strategyPlayer == LAGARTO && strategyComputer == LAGARTO) {
            System.out.println("Empatou! Lagarto empata com lagarto!");
        } else if (strategyPlayer == LAGARTO) {
            System.out.println("Ganhou! Lagarto envenena o Spock!");
        } else if (strategyPlayer == SPOCK && strategyComputer == PAPEL) {
            System.out.println("Perdeu. Papel refuta Spock!");
        } else if (strategyPlayer == SPOCK && strategyComputer == TESOURA) {
            System.out.println("Ganhou! Spock derrete a tesoura!");
        } else if (strategyPlayer == SPOCK && strategyComputer == PEDRA) {
            System.out.println("Ganhou! Spock vaporiza a pedra!");
        } else if (strategyPlayer == SPOCK && strategyComputer == LAGARTO) {
            System.out.println("Perdeu! Lagarto envenena Spock!");
        } else if (strategyPlayer == SPOCK) {
            System.out.println("Empatou! Spock empata com Spock!");
        }

        in.close();
    }
}
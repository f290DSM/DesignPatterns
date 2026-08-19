import domain.*;

import java.util.Random;
import java.util.Scanner;

import static domain.StrategyType.*;

public class Main {

    /**
     * Método principal do programa.
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, 4-LAGARTO, 5-SPOCK ]\n");
        int player = in.nextInt();

        StrategyType strategyPlayer = StrategyType.getById(player);

        int computer = new Random().nextInt(5) + 1;
        StrategyType strategyComputer = StrategyType.getById(computer);

        System.out.println("O COMPUTADOR escolheu: " + strategyComputer);
        System.out.println("O JOGADOR escolheu: " + strategyPlayer);

        //Implementar a lógica de execução das estratégias com base na escolha do jogador e do computador.

        //TODO: Instanciar a estratégia correta com base na escolha do jogador.

        //TODO: Criar instandia do contexto, uma instancia da classe Jokenpo

        //TODO: Confirurar o contexto com a estratégia do jogador e executar a lógica do jogo, passando a escolha do computador como parâmetro.

        in.close();
    }

    /**
     * Método para instanciar a estratégia correta com base na escolha do jogador.
     * @param player A escolha do jogador.
     * @return A estratégia correspondente à escolha do jogador.
     */
    private static Strategy getStrategy(StrategyType player) {
        switch (player) {
            case PAPEL -> {
                return new PapelStrategy();
            }
            case TESOURA -> {
                return new TesouraStrategy();
            }
            case PEDRA -> {
                return new PedraStrategy();
            }
            case LAGARTO -> {
                return new LagartoStrategy();
            }
            case SPOCK -> {
                return new SpockStrategy();
            }
            default -> throw new IllegalArgumentException("Estratégia não implementada para: " + player);

        }
    }
}
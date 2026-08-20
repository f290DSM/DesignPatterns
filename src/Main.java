import domain.designpattern.*;
import domain.revisao.Aluno;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * Método principal do programa.
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        //TODO: Exemplos de código para revisão de conceitos de programação orientada a objetos
        Aluno aluno = new Aluno();
        aluno.setEmail("joao@example.com");
    }



    //TODO: Reftorar para Model View Controller
    private static void jogarJokenpo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção: PEDRA, PAPEL, TESOURA, LAGARTO, SPOCK");
        String playerChoice = scanner.nextLine().toUpperCase();

        StrategyType playerStrategyType;
        try {
            playerStrategyType = StrategyType.valueOf(playerChoice);
        } catch (IllegalArgumentException e) {
            System.out.println("Escolha inválida. Tente novamente.");
            return;
        }

        Strategy playerStrategy = getStrategy(playerStrategyType);
        Jokenpo jokenpo = new Jokenpo(playerStrategy);

        // Gerar escolha aleatória para o computador
        StrategyType[] strategies = StrategyType.values();
        Random random = new Random();
        StrategyType computerChoice = strategies[random.nextInt(strategies.length)];
        Strategy computerStrategy = getStrategy(computerChoice);

        System.out.println("Computador escolheu: " + computerChoice);

        // Executar a lógica do jogo para o jogador e o computador
        jokenpo.jogar(computerChoice);
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
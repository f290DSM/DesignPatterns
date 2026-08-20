package domain.designpattern;

public class TesouraStrategy implements Strategy {
    @Override
    public void execute(StrategyType type) {
        switch (type) {
            case PAPEL -> System.out.println("Ganhou. Tesoura corta o Papel!");
            case PEDRA ->  System.out.println("Perdeu. Pedra quebra a Tesoura!");
            case LAGARTO ->  System.out.println("Ganhou. Tesoura decapita o Lagarto!");
            case SPOCK -> System.out.println("Perdeu. Spock esmaga a Tesoura!");
            default -> System.out.println("Empatou!");
        }
    }
}

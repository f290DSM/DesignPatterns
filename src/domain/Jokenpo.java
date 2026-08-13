package domain;

public class Jokenpo {
    private Strategy strategy;

    public Jokenpo(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void jogar(StrategyType type) {
        strategy.execute(type);
    }
}

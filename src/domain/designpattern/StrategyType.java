package domain.designpattern;

public enum StrategyType {
    PAPEL(1), TESOURA(2), PEDRA(3), LAGARTO(4), SPOCK(5);

    private final Integer id;

    StrategyType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public static StrategyType getById(Integer id) {
        for (StrategyType type : StrategyType.values()) {
            if (type.getId().equals(id)) return type;
        }
        throw new RuntimeException("Invalid StrategyType id: " + id);
    }
}

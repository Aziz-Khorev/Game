package main.java.com.RockPaperScissors;

public enum PlayerSymbol {
    R("rock"),
    P("paper"),
    S("scissors"),
    BLANK("*");

    private final String value;

    PlayerSymbol (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

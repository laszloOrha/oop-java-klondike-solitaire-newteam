package com.codecool.klondike;

public enum Rank {
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JUMBO(11), QUEEN(12), KING(13), ACE(1);

    private final int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return (Integer.toString(value));
    }
}

package org.example;

import java.util.Objects;

public class Token implements Comparable<Token> {
    String symbols;
    boolean isNegative;

    public Token(String symbols, boolean isNegative) {
        this.symbols = symbols;
        this.isNegative = isNegative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Token token = (Token) o;
        return Objects.equals(symbols, token.symbols);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbols, isNegative);
    }

    @Override
    public int compareTo(Token o) {
        return this.symbols.compareTo(o.symbols);
    }

    @Override
    public String toString() {
        return "Token{" + (isNegative ? "¬" : "")  + symbols + "}";
    }
}

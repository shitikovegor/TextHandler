package com.shitikov.handling.component.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.component.impl.type.SymbolType;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;

public class Symbol implements TextComponent {
    private static Logger logger = LogManager.getLogger();
    private char symbol;
    private SymbolType type;

    public Symbol(char symbol, SymbolType type) {
        this.symbol = symbol;
        this.type = type;
    }

    @Override
    public boolean add(TextComponent component) {
        logger.log(Level.WARN, "Element does not support operation.");
        return false;
    }

    @Override
    public boolean remove(TextComponent component) {
        logger.log(Level.WARN, "Element does not support operation.");
        return false;
    }

    @Override
    public List<TextComponent> getComponents() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<TextComponent> getChild(int index) {
        return Optional.empty();
    }

    public char getSymbol() {
        return symbol;
    }

    public Symbol setSymbol(char symbol) {
        this.symbol = symbol;
        return this;
    }

    public SymbolType getType() {
        return type;
    }

    public Symbol setType(SymbolType type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Symbol other = (Symbol) obj;

        if (symbol != other.symbol)
            return false;
        return type == other.type;
    }

    @Override
    public int hashCode() {
        int result = symbol;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}

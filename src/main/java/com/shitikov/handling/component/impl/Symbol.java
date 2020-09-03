package com.shitikov.handling.component.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.component.impl.type.SymbolType;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

public class Symbol implements TextComponent {
    private char symbol;
    private SymbolType type;

    private static Logger logger = LogManager.getLogger();

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
    public Optional<TextComponent> getChild(int index) {
        return Optional.empty();
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

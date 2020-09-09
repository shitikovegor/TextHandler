package com.shitikov.handling.component.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.component.impl.type.ComponentType;
import com.shitikov.handling.component.impl.type.SymbolType;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TextComposite implements TextComponent {
    private static final String DELIMITER = " ";
    private static final String PARAGRAPH_DELIMITER = "\t";

    List<TextComponent> components;
    private ComponentType componentType;

    public TextComposite(List<TextComponent> components, ComponentType componentType) {
        this.components = components;
        this.componentType = componentType;
    }

    @Override
    public boolean add(TextComponent component) {
        return components.add(component);
    }

    @Override
    public boolean remove(TextComponent component) {
        return components.remove(component);
    }

    @Override
    public Optional<TextComponent> getChild(int index) {
        Optional<TextComponent> child = (index >= 0 && index < components.size())
                ? Optional.of(components.get(index)) : Optional.empty();
        return child;
    }

    @Override
    public List<TextComponent> getComponents() {
        return components;
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    public TextComposite setComponentType(ComponentType componentType) {
        this.componentType = componentType;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        TextComposite other = (TextComposite) obj;

        if (components != null ? !components.equals(other.components) : other.components != null)
            return false;
        return componentType == other.componentType;
    }

    @Override
    public int hashCode() {
        int result = components != null ? components.hashCode() : 0;
        result = 31 * result + (componentType != null ? componentType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        String delimiter = (componentType == ComponentType.TEXT)
                ? PARAGRAPH_DELIMITER : DELIMITER;

        StringBuilder result = new StringBuilder();

        if (componentType == ComponentType.LEXEME) {
            for (TextComponent component : components) {
                result.append(component);
            }
        } else {
            for (int i = 0; i < components.size() - 1; i++) {
                result.append(components.get(i));
                result.append(delimiter);
            }
            result.append(components.get(components.size() - 1));
        }
        return result.toString();
    }

    public static class ComponentNumberComparator implements Comparator<TextComponent> {

        @Override
        public int compare(TextComponent o1, TextComponent o2) {

            int o1ComponentsSize = o1.getComponents().size();
            int o2ComponentsSize = o2.getComponents().size();

            if (o1ComponentsSize == o2ComponentsSize) {
                return 0;
            }
            return o1ComponentsSize > o2ComponentsSize ? 1 : -1;
        }
    }

    public static class WordLengthComparator implements Comparator<TextComponent> {

        @Override
        public int compare(TextComponent o1, TextComponent o2) {
            int o1WordSize = calcWordSize(o1.getComponents());
            int o2WordSize = calcWordSize(o2.getComponents());

            if (o1WordSize == o2WordSize) {
                return 0;
            }
            return o1WordSize > o2WordSize ? 1 : -1;
        }

        private int calcWordSize(List<TextComponent> components) {
            int wordSize = 0;

            for (int i = 0; i < components.size(); i++) {
                Symbol element = (Symbol) components.get(i);
                wordSize += (element.getType() == SymbolType.LETTER)
                        ? 1 : 0;
            }
            return wordSize;
        }
    }

    public static class LexemeComparator implements Comparator<TextComponent> {

        @Override
        public int compare(TextComponent o1, TextComponent o2) {
            List<TextComponent> symbols1 = o1.getComponents();
            List<TextComponent> symbols2 = o2.getComponents();
            int minLength = Math.min(symbols1.size(), symbols2.size());
            int result = 0;

            int index = 0;
            while (result == 0 && index < minLength) {
                Symbol symbol1 = (Symbol) symbols1.get(index);
                Symbol symbol2 = (Symbol) symbols2.get(index);

                result = Character.compare(symbol1.getSymbol(), symbol2.getSymbol());
                index++;
            }

            return (result == 0) ? Integer.compare(symbols1.size(), symbols2.size()) : result;
        }
    }
}

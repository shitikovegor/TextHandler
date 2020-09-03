package com.shitikov.handling.component.impl;

import com.shitikov.handling.component.TextComponent;
import com.shitikov.handling.component.impl.type.ComponentType;

import java.util.ArrayList;
import java.util.Collections;
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

    public List<TextComponent> getComponents() {
        return Collections.unmodifiableList(components);
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    public TextComposite setComponentType(ComponentType componentType) {
        this.componentType = componentType;
        return this;
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
            for (TextComponent component: components) {
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
}

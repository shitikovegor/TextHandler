package com.shitikov.handling.component;

import java.util.List;
import java.util.Optional;

public interface TextComponent {
    boolean add(TextComponent component);

    boolean remove(TextComponent component);

    List<TextComponent> getComponents();

    Optional<TextComponent> getChild(int index);
}

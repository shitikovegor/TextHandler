package com.shitikov.handling.component;

import java.util.Optional;

public interface TextComponent {
    boolean add(TextComponent component);

    boolean remove(TextComponent component);

    Optional<TextComponent> getChild(int index);
}

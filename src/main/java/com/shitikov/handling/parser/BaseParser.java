package com.shitikov.handling.parser;

import com.shitikov.handling.component.TextComponent;

public interface BaseParser {
    TextComponent parse(String text);
}

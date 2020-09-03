package com.shitikov.handling.parser;

import com.shitikov.handling.component.TextComponent;

import java.util.List;

public interface BaseParser {
    TextComponent parse(String text);
}

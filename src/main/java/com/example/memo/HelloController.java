package com.example.memo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    public int position = 0;
    public String[] texto = {"primeiro texto", "segundo texto"};
    @FXML
    private Label storyLine;

    @FXML
    protected void next() {
        if (position <= texto.length - 1)
        storyLine.setText(texto[position]);
        position++;
    }
}
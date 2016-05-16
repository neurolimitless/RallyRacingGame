package com.game.view;

import javafx.scene.control.Button;

public class ButtonFactory {
    public static Button getButton(String param) {
        return new Button(param);
    }

    public static Button[] getArrayOfButtons(String... params) {
        Button[] output = new Button[params.length];
        int counter = 0;
        for (String param : params) {
            output[counter] = new Button(param);
            counter++;
        }
        return output;
    }
}

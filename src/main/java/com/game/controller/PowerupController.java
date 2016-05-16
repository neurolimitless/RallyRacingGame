package com.game.controller;


import com.game.Main;
import com.game.model.enums.PowerupType;
import com.game.model.objects.PowerUp;
import javafx.scene.image.Image;

import java.util.Random;

public class PowerupController {

    private static PowerUp BOOSTER;
    private static PowerUp PUNCHER;
    private static PowerUp OFFROAD;

    private static void initialize() {
        try {
            BOOSTER = new PowerUp(PowerupType.BOOSTER, new Image(Main.class.getResource("/boost.png").toURI().toString()));
            PUNCHER = new PowerUp(PowerupType.PUNCHER, new Image(Main.class.getResource("/puncher.png").toURI().toString()));
            OFFROAD = new PowerUp(PowerupType.OFFROAD, new Image(Main.class.getResource("/offroad.png").toURI().toString()));
        } catch (Exception e) {
            DataController.exLogger.log(e.getMessage());
        }
    }

    public static PowerUp randomGenerate() {
        if (null == BOOSTER) initialize();
        Random random = new Random();
        int number = random.nextInt(100);
        if (number <= 33) return BOOSTER;
        if (number >= 33 && 66 <= number) return PUNCHER;
        else return OFFROAD;
    }
}


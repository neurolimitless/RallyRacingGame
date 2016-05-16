package com.game.model.objects;

import com.game.model.enums.PowerupType;
import javafx.scene.image.Image;

public class PowerUp extends GameObject {

    private PowerupType type;
    private Image image;
    private boolean onMap;

    public PowerUp(PowerupType type, Image image) {
        this.type = type;
        this.image = image;
        onMap = false;
    }

    public boolean isOnMap() {
        return onMap;
    }

    public void setOnMap(boolean onMap) {
        this.onMap = onMap;
    }

    public PowerupType getType() {
        return type;
    }

    public Image getImage() {
        return image;
    }

}

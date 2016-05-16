package com.game.model.objects;

import javafx.scene.image.Image;

public class Map {
    private int length;
    private String name;
    private Image mapImage;

    @Override
    public String toString() {
        return "Map{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", mapImage=" + mapImage +
                '}';
    }

    public Map(int length, String name, Image mapImage) {
        this.length = length;
        this.name = name;
        this.mapImage = mapImage;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public Image getMapImage() {
        return mapImage;
    }
}

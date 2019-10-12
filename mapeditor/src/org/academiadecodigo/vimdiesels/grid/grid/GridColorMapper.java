package org.academiadecodigo.vimdiesels.grid.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class GridColorMapper {

    private static final Color colors[] = {
            Color.BLACK,
            Color.WHITE,
            Color.BLUE
    };

    public static Color getColor(GridColor color) {

        Color myColor = null;
        switch (color) {
            case BLUE:
                myColor = colors[2];
                break;
            case BLACK:
                myColor = colors[0];
                break;
            case WHITE:
                myColor = colors[1];
                break;
            default:
                System.out.println("Something went wrong!");
        }

        return myColor;

    }

    public enum GridColor {
        BLACK,
        WHITE,
        BLUE
    }

}

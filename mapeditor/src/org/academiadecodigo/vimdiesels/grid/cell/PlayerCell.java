package org.academiadecodigo.vimdiesels.grid.cell;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.vimdiesels.grid.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.grid.GridColorMapper;
import org.academiadecodigo.vimdiesels.grid.grid.GridPosition;

import java.awt.*;

public class PlayerCell implements KeyboardHandler {

    private Keyboard keyboard;
    private Rectangle rectangle;
    private GridPosition pos;
    private Grid myGrid;

    public PlayerCell(Grid myGrid) {
        this.pos = new GridPosition(1, 1, myGrid);
        this.keyboard = new Keyboard(this);
        pos.setColor(GridColorMapper.GridColor.BLUE);
    }

    public void init() {
        pos.fill();

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(space);
        keyboard.addEventListener(left);
        keyboard.addEventListener(right);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
    }

    private void paint(GridPosition pos) {
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                pos.moveRectangle(GridPosition.GridDirection.LEFT);
                break;
            case KeyboardEvent.KEY_RIGHT:
                pos.moveRectangle(GridPosition.GridDirection.RIGHT);
                break;
            case KeyboardEvent.KEY_UP:
                pos.moveRectangle(GridPosition.GridDirection.UP);
                break;
            case KeyboardEvent.KEY_DOWN:
                pos.moveRectangle(GridPosition.GridDirection.DOWN);
                break;
            case KeyboardEvent.KEY_SPACE:
                this.paint(this.pos);
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

package org.academiadecodigo.vimdiesels.grid.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.HashMap;

public class GridPosition {

    private int col;
    private int row;
    private Rectangle rectangle;
    private Grid myGrid;

    public GridPosition(int col, int row, Grid myGrid) {
        this.myGrid = myGrid;
        this.col = col;
        this.row = row;

        int x = myGrid.colToX(col);
        int y = myGrid.rowToY(row);

        this.rectangle = new Rectangle(x, y, myGrid.getCellSize(), myGrid.getCellSize());
        show();

    }

    public void setColor(GridColorMapper.GridColor color){
        this.rectangle.setColor(GridColorMapper.getColor(color));
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void show(){
        this.rectangle.draw();
    }

    public void fill(){
        this.rectangle.fill();
    }

    public void hide(){
        this.rectangle.delete();
    }

    public void moveRectangle(GridDirection direction){
        int initialCol = getCol();
        int initialRow = getRow();

        switch (direction){
            case UP:
                moveUp();
                break;
            case DOWN:
                moveDown();
                break;
            case LEFT:
                moveLeft();
                break;
            case RIGHT:
                moveRight();
                break;

        }

        int dx = myGrid.colToX(getCol()) - myGrid.colToX(initialCol);
        int dy = myGrid.rowToY(getRow()) - myGrid.rowToY(initialRow);

        this.rectangle.translate(dx, dy);

    }

    private void moveTo(int col, int row){
            this.col = col;
            this.row = row;
            fill();
    }


    private void moveUp() {
        int maxRowsUp = Math.min(1, getRow());
        moveTo(getCol(), getRow() - maxRowsUp);
    }

    private void moveDown() {
        int maxRowsDown = Math.min(myGrid.getRows() - (getRow() + 1), 1);
        moveTo(getCol(), getRow() + maxRowsDown);
    }

    private void moveLeft() {
        int maxRowsLeft = Math.min(1, getCol());
        moveTo(getCol() - maxRowsLeft, getRow());
    }

    private void moveRight() {
        int maxRowsRight = Math.min(myGrid.getCols() - (getCol() + 1), 1);
        moveTo(getCol() + maxRowsRight, getRow());
    }



    public enum GridDirection{
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

}




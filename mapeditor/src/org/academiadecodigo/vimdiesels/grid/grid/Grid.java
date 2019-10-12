package org.academiadecodigo.vimdiesels.grid.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.vimdiesels.grid.cell.CellFactory;
import org.academiadecodigo.vimdiesels.grid.cell.PlayerCell;

public class Grid {

    private final int PADDING = 10;
    private int cols;
    private int rows;
    private int cellSize = 15;
    private Rectangle field;

    public Grid(int cols, int rows){
        this.cols = cols;
        this.rows = rows;

    }

    public int getCols() {
        return this.cols;
    }

    public int getRows() {
        return this.rows;
    }

    public int getCellSize() {
        return this.cellSize;
    }

    public int getWidth(){
        return this.field.getWidth();
    }

    public int getHeight(){
        return this.field.getHeight();
    }

    public void init(){
        this.field = new Rectangle(PADDING, PADDING, cols*cellSize,rows*cellSize);
        this.field.draw();
        CellFactory.generateCells(this);

    }

    public GridPosition makeGridPosition(int col, int row){
        return new GridPosition(col, row, this);
    }

    public int rowToY(int row){
        return PADDING + cellSize * row;
    }

    public int colToX(int col){
        return PADDING + cellSize * col;
    }


}

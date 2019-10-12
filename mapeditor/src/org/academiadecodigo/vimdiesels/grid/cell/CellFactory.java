package org.academiadecodigo.vimdiesels.grid.cell;

import org.academiadecodigo.vimdiesels.grid.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.grid.GridPosition;

import java.util.HashMap;

public class CellFactory {

    private static HashMap<GridPosition, Cell> hashMap;

    public static void generateCells(Grid myGrid){
        int cols = myGrid.getCols();
        int rows = myGrid.getRows();
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                    new Cell(myGrid.makeGridPosition(i, j));
            }

        }

    }

}

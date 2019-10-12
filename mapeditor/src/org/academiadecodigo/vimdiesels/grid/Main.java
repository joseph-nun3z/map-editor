package org.academiadecodigo.vimdiesels.grid;

import org.academiadecodigo.vimdiesels.grid.cell.CellFactory;
import org.academiadecodigo.vimdiesels.grid.cell.PlayerCell;
import org.academiadecodigo.vimdiesels.grid.grid.Grid;

public class Main {
    public static void main(String[] args) {

        Grid myGrid = new Grid(25, 25);
        PlayerCell player = new PlayerCell(myGrid);

        myGrid.init();
        player.init();


    }
}

package org.academiadecodigo.vimdiesels.grid.cell;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.vimdiesels.grid.grid.GridColorMapper;
import org.academiadecodigo.vimdiesels.grid.grid.GridPosition;

import java.util.HashMap;
import java.util.Hashtable;

public class Cell{

    private boolean dark;
    private GridPosition pos;


    public Cell(GridPosition pos) {
        this.pos = pos;
        pos.setColor(GridColorMapper.GridColor.BLACK);
        this.dark = false;
    }

    public GridPosition getPos(){
        return pos;
    }

    public boolean isDark(){
        return dark;
    }

    public void paint(){
        this.dark = true;
        pos.setColor(GridColorMapper.GridColor.BLACK);
        pos.fill();
    }

}

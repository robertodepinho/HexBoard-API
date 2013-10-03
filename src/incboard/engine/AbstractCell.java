/*
 * 
    Copyright 2008 RobertoPinho. All rights reserved.

    This file is part of incboard.api.

    incboard.api is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    incboard.api is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with incboard.api.  If not, see <http://www.gnu.org/licenses/>.

    For academic use, please cite:
    
    Pinho, R, de Oliveira, M.C. and Lopes, A. A. 2009. 
    Incremental Board: A grid-based space for visualizing dynamic data sets. 
    In Proceedings of the 2009 ACM Symposium on Applied Computing 
    (Honolulu, Hawaii, USA, March 8 - 12, 2009). SAC '09. ACM, New York, NY. 
    (to appear)
 */

package incboard.engine;

import java.util.LinkedList;

/**
 *
 * @author robertopinho
 */
public abstract class AbstractCell implements CellItemInterface {
    private Integer col = 0;
    private Integer row = 0;
    //private Integer zed = 0;  //HEX Board third axis
    private LinkedList<itemDistanceRn> closeNeighbors = new LinkedList<itemDistanceRn>();
    private LinkedList<itemDistanceRn> randomNeighbors = new LinkedList<itemDistanceRn>();
    private boolean onBoard;
    

    

    public LinkedList<itemDistanceRn> getCloseNeighbors() {
        return closeNeighbors;
    }

    public LinkedList<itemDistanceRn> getRandomNeighbors() {
        return randomNeighbors;
    }

    public boolean isOnBoard(){
        return this.onBoard;
    }
    
    public void setOnBoard(boolean b) {
        this.onBoard = b;
    }

    public void setRow(Integer i) {
        this.row=i;
    }

    public void setCol(Integer j) {
        this.col=j;
    }

    public Integer getRow() {
        return this.row;
    }

    public Integer getCol() {
        return this.col;
    }

    
    

}

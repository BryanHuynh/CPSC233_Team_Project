package entity;

import utils.Point;

import java.io.Serializable;

public abstract class Entity implements Serializable{

    protected int x, y;
    protected char symbol = ' ';
    private boolean visable = true;

    /**
     * anything that can be visually represented on a grid
     * @param x
     * @param y
     * @param symbol
     */
    public Entity(int x, int y, char symbol) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }

    public Entity(){
        x = 0;
        y = 0;
    }


    @Override
    public String toString() {
        return "x:" + x + " y:" + y + " symbol:" + symbol;
    }


    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point getPosition(){
        return new Point(x,y);
    }

    public abstract void update(double delta);



    public boolean equals(Entity enemy) {

        if (x != enemy.getX()) return false;
        if (y != enemy.getY()) return false;
        return true;

    }


    /**
     * Returns value of x
     *
     * @return
     */
    public int getX() {
        return this.x;
    }

    /**
     * Sets new value of x
     *
     * @param
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Returns value of y
     *
     * @return
     */
    public int getY() {
        return this.y;
    }

    /**
     * Sets new value of y
     *
     * @param
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Returns value of symbol
     *
     * @return
     */
    public char getSymbol() {
        return this.symbol;
    }

    /**
     * Sets new value of symbol
     *
     * @param
     */
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }


    public boolean isVisable() {
        return visable;
    }

    public void setVisable(boolean visable) {
        this.visable = visable;
    }
}

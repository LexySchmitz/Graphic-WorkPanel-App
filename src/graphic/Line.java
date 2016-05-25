/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import java.awt.Graphics;
import static java.lang.Math.atan2;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

/**
 *
 * @author Alexander Schmitz
 */
public class Line extends DocObject {
    
    protected int x1;
    protected int y1;
    
    protected int x2;
    protected int y2;
    
    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public int getX1() {
        return x1;
    }
    
    public int getY1() {
        return y1;
    }
    
    public int getX2() {
        return x2;
    }
    
    public int getY2() {
        return y2;
    }
    
    @Override
    public int getX() {
        return x1 + (x2 - x1);
    }
    
    @Override
    public int getY() {
        return y1 + (y2 - y1);
    }
    
    @Override
    public void setX(int x) {
        this.x1 = x - (this.x2 - this.x1);
        this.x2 = x + (this.x2 - this.x1);
    }
    
    @Override
    public void setY(int y) {
        this.y1 = y - (this.y2 - this.y1);
        this.y2 = y + (this.y2 - this.y1);
    }
    
    @Override
    public boolean isOver(int x, int y) {
        double l = (double) this.x2 - this.x1;
        double h = (double) this.y2 - this.y1;
        
        int posX = (int) (l / 2);
        int posY = (int) (h / 2);
        int height = 3;
        int width = (int) sqrt(l * l + h * h);
        double direction = atan2(l, h);
        
        x = x - posX;
        y = y - posY;
        
        double xr = cos(direction) * x - sin(direction) * y;
        double yr = sin(direction) * x + cos(direction) * y;
        
        x = (int) xr;
        y = (int) yr;
        
        return x > -width / 2 
                && x < width / 2 
                && y > -height / 2 
                && y < height / 2;
    }
    
    @Override
    public void draw(Graphics g) {
        g.drawLine(this.x1, this.y1, this.x2, this.y2);
    }
    
    @Override
    public void drawSelectFrame(Graphics g) {
        g.drawLine(this.x1, this.y1, this.x2, this.y2);
    }
}

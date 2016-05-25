/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.lang.Math.atan2;
import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

/**
 *
 * @author Alexander Schmitz
 */
public class Area extends DocObject {
    
    protected int x;
    protected int y;
    
    protected int height;
    protected int width;
    
    protected double direction;
    
    protected Color color;
    
    public Area(int x, int y, int height, int width, double direction, Color color) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.direction = direction;
        this.color = color;
    }
    
    @Override
    public int getX() {
        return x;
    }
    
    @Override
    public int getY() {
        return y;
    }
    
    @Override
    public void setX(int x) {
        this.x = x;
    }
    
    @Override
    public void setY(int y) {
        this.y = y;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public double getDirection() {
        return direction;
    }
    
    @Override
    public boolean isOver(int x, int y) {
        double xr = (double) (x - this.x);
        double yr = (double) (y - this.y);
        
        xr = cos(-this.direction) * xr - sin(-this.direction) * yr;
        yr = sin(-this.direction) * xr + cos(-this.direction) * yr;
        
        x = (int) xr;
        y = (int) yr;
        
        return x > -this.width / 2 
                && x < this.width / 2 
                && y > -this.height / 2 
                && y < this.height / 2;
    }
    

    public boolean isOverRightHandle(int x, int y) {
        double xr = (double) (x - this.x);
        double yr = (double) (y - this.y);
        
        xr = cos(-this.direction) * xr - sin(-this.direction) * yr;
        yr = sin(-this.direction) * xr + cos(-this.direction) * yr;
        
        x = (int) xr;
        y = (int) yr;
        
        return x > this.width / 2 + 2 - 8 
                && x < this.width / 2 + 2 + 8
                && y > -8
                && y < 8;
    }
    
    public boolean isOverLeftHandle(int x, int y) {
        double xr = (double) (x - this.x);
        double yr = (double) (y - this.y);
        
        xr = cos(-this.direction) * xr - sin(-this.direction) * yr;
        yr = sin(-this.direction) * xr + cos(-this.direction) * yr;
        
        x = (int) xr;
        y = (int) yr;
        
        return x > -this.width / 2 - 2 - 8 
                && x < -this.width / 2 - 2 + 8
                && y > -8
                && y < 8;
    }
    
    public boolean isOverTopHandle(int x, int y) {
        double xr = (double) (x - this.x);
        double yr = (double) (y - this.y);
        
        xr = cos(-this.direction) * xr - sin(-this.direction) * yr;
        yr = sin(-this.direction) * xr + cos(-this.direction) * yr;
        
        x = (int) xr;
        y = (int) yr;
        
        return x > -8
                && x < 8
                && y > -this.height / 2 - 2 - 8
                && y < -this.height / 2 - 2 + 8;
    }
    
    public boolean isOverBottomHandle(int x, int y) {
        double xr = (double) (x - this.x);
        double yr = (double) (y - this.y);
        
        xr = cos(-this.direction) * xr - sin(-this.direction) * yr;
        yr = sin(-this.direction) * xr + cos(-this.direction) * yr;
        
        x = (int) xr;
        y = (int) yr;
        
        return x > -8
                && x < 8
                && y > this.height / 2 + 2 - 8
                && y < this.height / 2 + 2 + 8;
    }
    
    public boolean isOverRightTopHandle(int x, int y) {
        double xr = (double) (x - this.x);
        double yr = (double) (y - this.y);
        
        xr = cos(-this.direction) * xr - sin(-this.direction) * yr;
        yr = sin(-this.direction) * xr + cos(-this.direction) * yr;
        
        x = (int) xr;
        y = (int) yr;
        
        return x > this.width / 2 + 2 - 8 
                && x < this.width / 2 + 2 + 8
                && y > -this.height / 2 - 2 - 8
                && y < -this.height / 2 - 2 + 8;
    }
    
    public boolean isOverLeftTopHandle(int x, int y) {
        double xr = (double) (x - this.x);
        double yr = (double) (y - this.y);
        
        xr = cos(-this.direction) * xr - sin(-this.direction) * yr;
        yr = sin(-this.direction) * xr + cos(-this.direction) * yr;
        
        x = (int) xr;
        y = (int) yr;
        
        return x > -this.width / 2 - 2 - 8 
                && x < -this.width / 2 - 2 + 8
                && y > -this.height / 2 - 2 - 8
                && y < -this.height / 2 - 2 + 8;
    }
    
    public boolean isOverRightBottomHandle(int x, int y) {
        double xr = (double) (x - this.x);
        double yr = (double) (y - this.y);
        
        xr = cos(-this.direction) * xr - sin(-this.direction) * yr;
        yr = sin(-this.direction) * xr + cos(-this.direction) * yr;
        
        x = (int) xr;
        y = (int) yr;
        
        return x > this.width / 2 + 2 - 8 
                && x < this.width / 2 + 2 + 8
                && y > this.height / 2 + 2 - 8
                && y < this.height / 2 + 2 + 8;
    }
    
    public boolean isOverLeftBottomHandle(int x, int y) {
        double xr = (double) (x - this.x);
        double yr = (double) (y - this.y);
        
        xr = cos(-this.direction) * xr - sin(-this.direction) * yr;
        yr = sin(-this.direction) * xr + cos(-this.direction) * yr;
        
        x = (int) xr;
        y = (int) yr;
        
        return x > -this.width / 2 - 2 - 8 
                && x < -this.width / 2 - 2 + 8
                && y > this.height / 2 + 2 - 8
                && y < this.height / 2 + 2 + 8;
    }
    
    public boolean isOverDirectionHandle(int x, int y) {
        double xr = (double) (x - this.x);
        double yr = (double) (y - this.y);
        
        xr = cos(-this.direction) * xr - sin(-this.direction) * yr;
        yr = sin(-this.direction) * xr + cos(-this.direction) * yr;
        
        x = (int) xr;
        y = (int) yr;
        
        return x > this.width / 2 + 20 - 4 
                && x < this.width / 2 + 20 + 4
                && y > -4
                && y < 4;
    }
    
    
    public void setRightHandle(int x, int y) {
        int rel = (int) sqrt(pow(cos(this.direction) * x, 2) + pow(sin(this.direction) * y, 2)); 
        int dist = rel - this.x - (this.width / 2);
        
        if (dist % 2 == 0) {
            this.width = this.width + dist ;
            this.x = this.x + dist / 2;
        }
    }
    
    public void setLeftHandle(int x, int y) {    
        int rel = (int) sqrt(pow(cos(this.direction) * x, 2) + pow(sin(this.direction) * y, 2));
        int dist = this.x - rel - (this.width / 2);
        
        if (dist % 2 == 0) {
            this.width = this.width + dist ;
            this.x = this.x - dist / 2;
        }
    }
    
    public void setTopHandle(int x, int y) {       
        int rel = (int) sqrt(pow(sin(this.direction) * x, 2) + pow(cos(this.direction) * y, 2));
        int dist = this.y - rel - (this.height / 2);
        
        if (dist % 2 == 0) {
            this.height = this.height + dist ;
            this.y = this.y - dist / 2;
        }
    }
    
    public void setBottomHandle(int x, int y) {  
        int rel = (int) sqrt(pow(sin(this.direction) * x, 2) + pow(cos(this.direction) * y, 2));
        int dist = rel - this.y - (this.height / 2);
        
        if (dist % 2 == 0) {
            this.height = this.height + dist ;
            this.y = this.y + dist / 2;
        }
    }
    
    public void setRightTopHandle(int x, int y) {
        this.setRightHandle(x, y);
        this.setTopHandle(x, y);
    }
    
    public void setLeftTopHandle(int x, int y) {
        this.setLeftHandle(x, y);
        this.setTopHandle(x, y);
    }
    
    public void setRightBottomHandle(int x, int y) {
        this.setRightHandle(x, y);
        this.setBottomHandle(x, y);
    }
    
    public void setLeftBottomHandle(int x, int y) {
        this.setLeftHandle(x, y);
        this.setBottomHandle(x, y);
    }
    
    public void setDirectionHandle(int x, int y) {        
        this.direction = atan2(y - this.y, x - this.x);
    }
    
    
    
    @Override
    public void draw(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(this.color);
        g2D.translate(this.x, this.y);
        g2D.rotate(this.direction);
        g2D.drawRect(-(this.width / 2), -(this.height / 2), this.width, this.height);
        g2D.rotate(-this.direction);
        g2D.translate(-this.x, -this.y);
        
    }
    
    @Override
    public void drawSelectFrame(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.GRAY);
        g2D.translate(this.x, this.y);
        g2D.rotate(this.direction);
        g2D.drawRect(-(this.width / 2) - 2, -(this.height / 2) - 2, this.width + 4, this.height + 4);
        
        g2D.fillRect(-(this.width / 2) - 2 - 8, -8, 16, 16);
        g2D.fillRect((this.width / 2) + 2 - 8, -8, 16, 16);
        g2D.fillRect(-8, -(this.height / 2) - 2 - 8, 16, 16);
        g2D.fillRect(-8, (this.height / 2) + 2 - 8, 16, 16);
        
        g2D.fillRect(-(this.width / 2) - 2 - 8, -(this.height / 2) - 2 - 8, 16, 16);
        g2D.fillRect(-(this.width / 2) - 2 - 8, (this.height / 2) + 2 - 8, 16, 16);
        g2D.fillRect((this.width / 2) + 2 - 8, -(this.height / 2) - 2 - 8, 16, 16);
        g2D.fillRect((this.width / 2) + 2 - 8, (this.height / 2) + 2 - 8, 16, 16);
        
        g2D.fillOval((this.width / 2) + 20 - 4, -4, 8, 8);
        g2D.rotate(-this.direction);
        g2D.translate(-this.x, -this.y);
        
    }
}

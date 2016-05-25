/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import java.awt.Graphics;

/**
 *
 * @author Alexander Schmitz
 */
public abstract class DocObject {
    
    public abstract boolean isOver(int x, int y);
    
    public abstract void draw(Graphics g);
    
    public abstract void drawSelectFrame(Graphics g);
    
    public abstract int getX();
    
    public abstract int getY();
    
    public abstract void setX(int x);
    
    public abstract void setY(int y);
}

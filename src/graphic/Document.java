/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alexander Schmitz
 */
public class Document {
    
    private List<DocObject> objects;
    
    public Document() {
        this.objects = new LinkedList<DocObject>();
    }
    
    public void addObject(DocObject obj) {
        this.objects.add(obj);
    }
    
    public boolean isThereAnObject(int x, int y) {
        for (int i = this.objects.size() - 1; i >= 0 ; i--) {
            if (this.objects.get(i).isOver(x, y)) {
                return true;
            } 
        }
        return false;
    }
    
    public DocObject getObject(int x, int y) {
        for (int i = this.objects.size() - 1; i >= 0 ; i--) {
            if (this.objects.get(i).isOver(x, y)) {
                return this.objects.get(i);            
            }
        }
        return null;
    }
    
    public DocObject getObject(int zIndex) {
        return this.objects.get(zIndex);
    }
    
    public int getZIndexOfObject(int x, int y) {
        for (int i = this.objects.size() - 1; i >= 0 ; i--) {
            if (this.objects.get(i).isOver(x, y)) {
                return i;           
            }
        }
        return -1;
    }
    
    public int getNumberOfObjects() {
        return this.objects.size();
    }
    
    public void changeObjectZIndex(int oldZIndex, int newZIndex) {
        DocObject obj = this.objects.get(oldZIndex);
        this.objects.remove(oldZIndex);
        this.objects.add(newZIndex, obj);
    }
    
    public void increaseObjectZIndex(int ZIndex) {
        DocObject obj = this.objects.get(ZIndex);
        this.objects.remove(ZIndex);
        this.objects.add(ZIndex + 1, obj);
    }
    
    public void decreaseObjectZIndex(int ZIndex) {
        DocObject obj = this.objects.get(ZIndex);
        this.objects.remove(ZIndex);
        this.objects.add(ZIndex - 1, obj);
    }
    
    public void putObjectOnHighestZIndex(int ZIndex) {
        DocObject obj = this.objects.get(ZIndex);
        this.objects.remove(ZIndex);
        this.objects.add(obj);
    }
    
    public void putObjectOnLowestZIndex(int ZIndex) {
        DocObject obj = this.objects.get(ZIndex);
        this.objects.remove(ZIndex);
        this.objects.add(0, obj);
    }
    
    public void draw(Graphics g) {
        g.drawRect(0, 0, 1000, 1000);
        for (int i = 0; i < this.objects.size(); i++) {
            this.objects.get(i).draw(g);
        }
    }
}

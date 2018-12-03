package image;

import javafx.scene.paint.Color;

import java.util.List;

public class VectorImage implements Image {

    public List<Shape> shapes;
    public int width;
    public int height;

    public VectorImage(List<Shape> shapes, int width , int height){
        setHeight(height);
        setWidth(width);
        this.shapes=shapes;
    }

    public Color getPixelColor(int x, int y){
        for (Shape shape: shapes) {
            if(shape.contains(new Point(x,y))){
                return shape.getColor();
            }
        }
        return null;
    }

    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    protected void setWidth(int width){ this.width=width; }
    protected void setHeight(int height){ this.height=height; }
}
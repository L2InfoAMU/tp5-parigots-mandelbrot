package image;

import javafx.scene.paint.Color;
import util.Matrices;

public abstract class RasterImage<E> implements Image{
    private int width,height;
    private E[][] matrix;

    public abstract Color getPixelColor(int x, int y);

    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
}

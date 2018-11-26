package image;


import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image{
    private int width,height;
    private Color[][] pixels;

    public BruteRasterImage(Color color,int width,int height){
        setWidth(width);
        setHeight(height);

        createRepresentation();
        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] pixels){
        Matrices.requiresNonNull(pixels);
        Matrices.requiresNonZeroDimensions(pixels);
        Matrices.requiresRectangularMatrix(pixels);

        setWidth(pixels.length);
        setHeight(pixels[0].length);
        createRepresentation();
        setPixelsColor(pixels);
    }

    public void createRepresentation(){
        this.pixels=new Color[width][height];
    }

    public void setPixelColor(Color color,int x,int y){
        this.pixels[x][y]=color;
    }

    @Override
    public Color getPixelColor(int x,int y) {
        return pixels[x][y];
    }

    private void setPixelsColor(Color[][] pixels){

        for (int x=0;x<this.width;x++){
            for (int y=0;y<this.height;y++) {
                setPixelColor(pixels[x][y],x,y);
            }
        }
    }

    private void setPixelsColor(Color color){

        for (int x=0;x<this.width;x++){
            for (int y=0;y<this.height;y++){
                setPixelColor(color,x,y);
            }
        }
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height) {
        this.height = height;
    }
}

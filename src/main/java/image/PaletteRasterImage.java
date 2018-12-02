package image;

import javafx.scene.paint.Color;

public class PaletteRasterImage implements Image{
    private int width,height;
    public PaletteRasterImage(Color color, int width, int height){

    }
    public PaletteRasterImage(Color[][] pixels){

    }
    public void createRepresentation(){

    }
    public void setPixelColor(Color color, int x, int y){

    }
    @Override
    public Color getPixelColor(int x, int y){
        return null;
    }
    public void setPixelsColor(Color[][] pixels){

    }
    private void setPixelsColor(Color color){

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

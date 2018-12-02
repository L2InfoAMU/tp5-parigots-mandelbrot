package image;

import javafx.scene.paint.Color;

import java.util.List;

public class PaletteRasterImage implements Image{
    private int width,height;
    private List<Color> palette;
    private int[][] indexesOfColor;

    public PaletteRasterImage(Color color, int width, int height){

    }
    public PaletteRasterImage(Color[][] pixels){

    }
    public void createRepresentation(){

    }
    public void setPixelColor(Color color, int x, int y){
        if(!palette.contains(color)){
            palette.add(color);
        }
        indexesOfColor[x][y]=palette.indexOf(color);
    }
    @Override
    public Color getPixelColor(int x, int y){
        return palette.get(indexesOfColor[x][y]);
    }
    public void setPixelsColor(Color[][] pixels){
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

package image;


import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage extends RasterImage{
    private Color[][] pixels;

    public BruteRasterImage(Color color,int width,int height){
        super(color,width,height);
    }

    public BruteRasterImage(Color[][] pixels){
        super(pixels);
    }
    @Override
    public void createRepresentation(){
        this.pixels=new Color[getWidth()][getHeight()];
    }
    @Override
    public void setPixelColor(Color color,int x,int y){
        this.pixels[x][y]=color;
    }
    @Override
    public Color getPixelColor(int x,int y) {
        return pixels[x][y];
    }
}

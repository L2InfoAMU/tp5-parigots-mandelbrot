package image;


import javafx.scene.paint.Color;

public class BruteRasterImage implements Image{
    private int width,height;
    private Color[][] pixels;

    public BruteRasterImage(Color color,int width,int height){
        this.width=width;
        this.height=height;
        this.pixels=new Color[width][height];
        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] pixels){
        this.width=pixels.length;
        this.height=pixels[0].length;
        this.pixels=pixels;
    }

    public void setPixelColor(Color color,int x,int y){
        this.pixels[x][y]=color;
    }

    @Override
    public Color getPixelColor(int x,int y) {
        return pixels[x][y];
    }

    public void setPixelsColor(Color[][] pixels){
        setWidth(pixels.length);
        setHeight(pixels[0].length);
        this.pixels=pixels;
    }

    public void setPixelsColor(Color color){
        for (int x=0;x<this.width;x++){
            for (int y=0;y<this.height;y++){
                this.pixels[x][y]=color;
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

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

package image;


import javafx.scene.paint.Color;

public class BruteRasterImage implements Image{
    private int width,height;
    private Color[][] pixels;

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public Color getPixelColor(int x,int y) {
        return pixels[x][y];
    }

}

package image;

import javafx.scene.paint.Color;

public class Rectangle implements Shape {

    private int coordx;
    private int coordy;
    private int height;
    private int width;
    private Color color;
    private Pixel[][] pixels;


    public Rectangle(int x, int y, int width, int height, Color color){
        setColor(color);
        setCoordx(x);
        setCoordy(y);
        setHeight(height);
        setWidth(width);

        int i,j;
        for(i=x-width;i<=x;i++) {
            for(j=y-height;j<=height;j++){
                pixels[i][j] = new Pixel(i,j,color);
            }
        }


    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCoordx(int coordx) {
        this.coordx = coordx;
    }

    public void setCoordy(int coordy) {
        this.coordy = coordy;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public int getCoordx() {
        return coordx;
    }

    public int getCoordy() {
        return coordy;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean contains(Point point){
        return(point.x <= getCoordx() && point.x >= getCoordx()-getWidth() && point.y >= getCoordy()-getHeight() && point.y <= getCoordy());
    }


}
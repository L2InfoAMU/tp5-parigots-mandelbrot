package image;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterImage {
    private Map<Point,Color> pixelsMap;


    public SparseRasterImage(Color color, int width, int height){
        super(color,width,height);
    }
    public SparseRasterImage(Color[][] pixels){
        super(pixels);
    }
    @Override
    public void createRepresentation(){
        this.pixelsMap = new HashMap<Point,Color>();
    }
    @Override
    public void setPixelColor(Color color, int x, int y){

    }
    @Override
    public Color getPixelColor(int x, int y){
        if (this.pixelsMap.containsKey(new Point(x,y))) {
            return this.pixelsMap.get(new Point(x, y));
        }
        return Color.WHITE;
    }
}

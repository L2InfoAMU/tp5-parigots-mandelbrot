package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage{
    private int width,height;
    private List<Color> palette;
    private int[][] indexesOfColor;

    public PaletteRasterImage(Color color, int width, int height){
        super(color,width,height);
    }
    public PaletteRasterImage(Color[][] pixels){
        super(pixels);
    }
    @Override
    public void createRepresentation(){
        this.palette = new ArrayList<>();
        this.indexesOfColor = new int[getWidth()][getHeight()];

    }
    @Override
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

}

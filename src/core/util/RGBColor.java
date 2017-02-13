package core.util;


public class RGBColor  {
    public final double R;
    public final double G;
    public final double B;
    public final double opacity;

    public RGBColor(double red, double green, double blue, double opacity) {
        R = red;
        G = green;
        B = blue;
        this.opacity = opacity;
    }
}

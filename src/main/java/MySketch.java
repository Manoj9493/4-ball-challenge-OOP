import processing.core.PApplet;

public class MySketch extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int diameter = 10;
    int x1=0,x2=0,x3=0,x4=0;

    public static void main(String[] args) {
        PApplet.main("MySketch");
        System.out.println("Sketch using Procedural Approach");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

    }

    @Override
    public void draw() {
        getEllipse((HEIGHT / 5),x1);
        getEllipse((HEIGHT / 5)*2,x2);
        getEllipse((HEIGHT / 5)*3,x3);
        getEllipse((HEIGHT / 5)*4,x4);
        x1=x1+1;
        x2=x2+2;
        x3=x3+3;
        x4=x4+4;
    }

    private void getEllipse(int vheight,int xval) {
        ellipse(xval, vheight, diameter, diameter);
    }
}

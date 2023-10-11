import processing.core.PApplet;

public class MySketchOop extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int balls=4;
    public static void main(String[] args) {
        PApplet.main("MySketchOop");
        System.out.println("Sketch Using OOP Approach");
    }

    Ellipse[] ellipses= new Ellipse[balls];

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        get_ellipse();

    }
    public void get_ellipse(){
        for(int i=0;i<balls;i++){
            ellipses[i] = new Ellipse((HEIGHT/5)*(i+1), i+1);
        }

    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        for (Ellipse e : ellipses) {
            e.display();
            e.move();
        }
    }

    class Ellipse {
        int vheight;
        int xval;
        int diameter;
        int speed;

        Ellipse(int vheight, int speed) {
            this.vheight = vheight;
            this.xval = 0;
            this.diameter = 10;
            this.speed = speed;
        }

        void move() {
            xval += speed;
        }

        void display() {
            ellipse(xval, vheight, diameter, diameter);
        }
    }
}

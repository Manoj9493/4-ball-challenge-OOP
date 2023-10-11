import processing.core.PApplet;

public class MySketchOop extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static void main(String[] args) {
        PApplet.main("MySketchOop");
        System.out.println("Sketch Using OOP Approach");
    }

    Ellipse[] ellipses= new Ellipse[4];

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        ellipses[0] = new Ellipse(HEIGHT / 5, 1);
        ellipses[1] = new Ellipse((HEIGHT / 5) * 2, 2);
        ellipses[2] = new Ellipse((HEIGHT / 5) * 3, 3);
        ellipses[3] = new Ellipse((HEIGHT / 5) * 4, 4);
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

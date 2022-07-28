package Home7;


public class Main {
    public static void main(String[] args) {
        Triangle[] figures = new Triangle[]{
                new Triangle(new Dot(250., 90.), new Dot(180., 90.), new Dot(215., 29.38)),
                        new Triangle(new Dot(270., 190.), new Dot(200., 90.), new Dot(240., 30.)),
                                new Triangle(new Dot(150., 180.), new Dot(180., 120.), new Dot(60., 140.)),
                                        new Triangle(new Dot(240., 100.), new Dot(150., 80.), new Dot(220., 129.)),
                                                new Triangle(new Dot(190.,40.) ,new Dot(140., 90.), new Dot(155., 100.)),
                                                        new Triangle(new Dot(100.,200.) ,new Dot(50., 150.), new Dot(150., 250))};
    Proccesor proccesor = new Proccesor(figures);
    proccesor.findArbitrary();
    proccesor.findEquilateral();
    proccesor.findEquinox();
    proccesor.findRectangular();
    }
}

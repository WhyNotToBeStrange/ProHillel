package Home7;

import java.util.Objects;

public class Proccesor {
    public static Triangle[] figures;

    public Proccesor(Triangle[] figures) {
        this.figures = figures;
    }


    public static int getEquinox() {
        int rb = 0;
        for (Triangle triangle : figures) {
            if (Objects.equals(triangle.findType(), "Equinox")) {
                rb++;
            }
        }
        return rb;
    }
    public static int getEquilateral() {
        int rs = 0;
        for (Triangle triangle : figures) {
            if (Objects.equals(triangle.findType(), "Equilateral")) {
                rs++;
            }
        }
        return rs;
    }


    public static int getRectangular() {
        int pg = 0;
        for (Triangle triangle : figures) {
            if (Objects.equals(triangle.findType(), "Rectangular")) {
                pg++;
            }
        }
        return pg;
    }



    public static int getArbitrary() {
        int pv = 0;
        for (Triangle triangle : figures) {
            if (Objects.equals(triangle.findType(), "Arbitrary")) {
                pv++;
            }
        }
        return pv;
    }

    public double findMaxPerimeter() {
        double maxPerimeter = figures[0].perimetr;
        for (Triangle triangle : figures) {
            if (triangle.perimetr > maxPerimeter) {
                maxPerimeter = triangle.perimetr;
            }
        }
        return maxPerimeter;
    }

    public double findMinPerimeter() {
        double minPerimeter = figures[0].perimetr;
        for (Triangle triangle : figures) {
            if (triangle.perimetr < minPerimeter) {
                minPerimeter = triangle.perimetr;
            }
        }
        return minPerimeter;
    }

    public double findMaxArea() {
        double maxArea = figures[0].perimetr;
        for (Triangle triangle : figures) {
            if (triangle.area > maxArea) {
                maxArea = triangle.perimetr;
            }
        }
        return maxArea;
    }

    public double findMinArea() {
        double minArea = figures[0].perimetr;
        for (Triangle triangle : figures) {
            if (triangle.area < minArea) {
                minArea = triangle.perimetr;
            }
        }
        return minArea;
    }

    public void findEquilateral( ){
 Triangle[] Equilateral = new Triangle[getEquilateral()];
 Proccesor proccesor = new Proccesor(Equilateral);
        if (Equilateral.length != 0) {
            for (int i = 0; i < Equilateral.length; ) {
                for (Triangle triangle : figures) {
                    if (Objects.equals(triangle.findType(), "Equilateral")) {
                        Equilateral[i] = triangle;
                        i++;
                    }
                }
            }
            System.out.println("Type: Equilateral"+" Quantity: "+Equilateral.length+" Perimeter: " + "minimal "
                    +proccesor.findMinPerimeter()+" maximal "+ proccesor.findMaxPerimeter()+
                    " Area: "+" minimal "+proccesor.findMinArea()+" maximal"+proccesor.findMaxArea() );
        }else System.out.println("Error");
    }
    public void findEquinox(){
        Triangle[] Equinox = new Triangle[getEquinox()];
        Proccesor proccesor = new Proccesor(Equinox);
        if (Equinox.length != 0) {
            for (int i = 0; i < Equinox.length; ) {
                for (Triangle triangle : figures) {
                    if (Objects.equals(triangle.findType(), "Equilateral")) {
                        Equinox[i] = triangle;
                        i++;
                    }
                }
            }
            System.out.println("Type: Equinox"+" Quantity: "+Equinox.length+" Perimeter: " + "minimal "
                    +proccesor.findMinPerimeter()+" maximal "+ proccesor.findMaxPerimeter()+
                    " Area: "+" minimal "+proccesor.findMinArea()+" maximal"+proccesor.findMaxArea() );
        }else System.out.println("Error");
    }
    public void findRectangular(){
        Triangle[] Rectangular = new Triangle[getRectangular()];
        Proccesor proccesor = new Proccesor(Rectangular);
        if (Rectangular.length != 0) {
            for (int i = 0; i < Rectangular.length; ) {
                for (Triangle triangle : figures) {
                    if (Objects.equals(triangle.findType(), "Equilateral")) {
                        Rectangular[i] = triangle;
                        i++;
                    }
                }
            }
            System.out.println("Type: Rectangular "+" Quantity: "+Rectangular.length+" Perimeter: " + "minimal "
                    +proccesor.findMinPerimeter()+" maximal "+ proccesor.findMaxPerimeter()+
                    " Area: "+" minimal "+proccesor.findMinArea()+" maximal"+proccesor.findMaxArea() );
        }else System.out.println("Error");
    }
    public void findArbitrary( ){
        Triangle[] Arbitrary = new Triangle[getArbitrary()];
        Proccesor proccesor = new Proccesor(Arbitrary);
        if (Arbitrary.length != 0) {
            for (int i = 0; i < Arbitrary.length; ) {
                for (Triangle triangle : figures) {
                    if (Objects.equals(triangle.findType(), "Equilateral")) {
                        Arbitrary[i] = triangle;
                        i++;
                    }
                }
            }
            System.out.println("Type: Arbitrary"+" Quantity: "+Arbitrary.length+" Perimeter: " + "minimal "
                    +proccesor.findMinPerimeter()+" maximal "+ proccesor.findMaxPerimeter()+
                    " Area: "+" minimal "+proccesor.findMinArea()+" maximal"+proccesor.findMaxArea() );
        }else System.out.println("Error");
    }
}





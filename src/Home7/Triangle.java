package Home7;

public class Triangle {
    public static double perimetr;
    public static double semiPerimetr;
    public static double area;
    private Dot a;
    private Dot b;
    private Dot c;
    private static double ac;
    private static double ab;
    private static double bc;
    private String type;

    public Triangle(Dot a, Dot b, Dot c) {
        this.perimetr= findPerimeter();
        this.semiPerimetr= findSemiPerimetr();
        this.area= findPerimeter();
        this.a = a;
        this.b = b;
        this.c = c;
        this.ac = findDistance(this.a ,this.c);
        this.ab = findDistance(this.a ,this.b);
        this.bc = findDistance(this.b ,this.c);
        this.type = findType();

    }

    public Dot getA() {
        return a;
    }

    public void setA(Dot a) {
        this.a = a;
    }

    public Dot getB() {
        return b;
    }

    public void setB(Dot b) {
        this.b = b;
    }

    public Dot getC() {
        return c;
    }

    public void setC(Dot c) {
        this.c = c;
    }


    public static double findDistance(Dot first,Dot second){
        return Math.sqrt(Math.pow((second.getX() - first.getX()), 2) +
                Math.pow((second.getY() - first.getY()), 2));
    }
    public static double findPerimeter() {
        return ab + ac + bc;
    }
    public static double findSemiPerimetr(){
        return perimetr /2;
    }

    public static double findArea(){
        return Math.sqrt(semiPerimetr * (semiPerimetr - ab) * (semiPerimetr - ac) * (semiPerimetr - bc));
    }
    public String findType(){
        if(ab == bc && ab == ac){
            return "Equilateral";
        }else if(ab == bc || ab == ac || bc == ac){
            return "Equinox";
        }else if(((ab * ab) == bc * bc + ac * ac) ||
                ((bc * bc) == ab * ab + ac * ac) ||
                ((ac * ac) == ab * ab + bc * bc)){
            return "Rectangular";
        }else {
            return "Arbitrary";
        }
    }


    public String toString(){
return ("Треугольник-"+"1x"+a.getX()+
        "1y"+a.getY()+"2x"+b.getX()+"2y" +
        ""+b.getY()+"3x"+c.getX()+"3y"
        +c.getY()+"Вид треугольника"+type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


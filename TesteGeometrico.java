public class TesteGeometrico {
    public static void main(String [] args){
        Rectangle r1 = new Rectangle (7,14);

        Circle c1 = new Circle(10);

        System.out.println(c1);
        System.out.println(r1);

        System.out.println("Area do circulo: " + c1.getArea());
        System.out.println("Perimetro do circulo: " + c1.getPerimeter());

        System.out.println("Area do retangulo" + r1.getArea());
        System.out.println("Perimetro do retangulo" + r1.getPerimeter());

    }
}

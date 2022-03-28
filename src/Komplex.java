public class Komplex {
    double a;
    double b;


    public Komplex(double v, double v1) {

    }


    public Komplex add(Komplex b) {
        Komplex c = new Komplex( a + b.a, this.b + b.b);
        return  c;
    }

    public Komplex multiply(Komplex b) {

        return b;
    }

    public Double arg() {
        return a;
    }
}
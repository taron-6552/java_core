package chapter6;

public class Constructor1 {
    double width;
    double height;
    double depth;

    Constructor1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

}




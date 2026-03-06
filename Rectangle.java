public class Rectangle {

    int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public boolean equals(Object obj) {

        if (!(obj instanceof Rectangle)) {
            return false;
        }

        Rectangle r = (Rectangle) obj;

        return width == r.width && height == r.height;
    }
}

public class Pro2_64010806_5{
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon1 Perimeter: " + polygon1.getPerimeter());
        System.out.println("Polygon1 Area: " + polygon1.getArea());

        System.out.println("Polygon2 Perimeter: " + polygon2.getPerimeter());
        System.out.println("Polygon2 Area: " + polygon2.getArea());

        System.out.println("Polygon3 Perimeter: " + polygon3.getPerimeter());
        System.out.println("Polygon3 Area: " + polygon3.getArea());
    }
}
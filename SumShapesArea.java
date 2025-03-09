public class SumShapesArea {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(2),
                new Triangle(2,3),
                new Square(4),
        };
        System.out.println("Сумарна площа всіх фігур у цьому масиві: " + calculateTotalArea(shapes));
    }
    public static double calculateTotalArea(Shape[] shapes){
        double totalArea = 0;
        for (Shape shape:shapes){
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}

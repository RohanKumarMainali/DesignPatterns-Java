public class ShapeFactory {
  public Shape getShape(String ShapeType) {
    if (ShapeType.equalsIgnoreCase("CIRCLE"))
      return new Circle();

    if (ShapeType.equalsIgnoreCase("RECTANGLE"))
      return new Rectangle();

    if (ShapeType.equalsIgnoreCase("SQUARE"))
      return new Circle();
    return null;
  }

}

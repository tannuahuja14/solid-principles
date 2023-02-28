import java.util.Scanner;
abstract class Shape
{
    int m_height;
    int m_width;
    abstract void setWidth(int width);
    abstract void setHeight(int height);
    abstract int calculateArea(int m_width, int m_height);
}


class Rectangle extends Shape
{
    public void setWidth(int width)
    {
        m_width = width;
    }

    public void setHeight(int height)
    {
        m_height = height;
    }

    public int getWidth()
    {
        return m_width;
    }

    public int getHeight()
    {
        return m_height;
    }

    public int calculateArea(int m_width, int m_height)
    {
        return m_width * m_height;
    }
}

class Square extends Shape
{
    public void setWidth(int width)
    {
        m_width = width;
    }

    public void setHeight(int height)
    {
        m_height = height;
    }

    public int getWidth()
    {
        return m_width;
    }

    public int getHeight()
    {
        return m_height;
    }
    public int calculateArea(int m_width, int m_height)
    {
        return m_width * m_height;
    }

}

class ShapeArea {
    public static void main(String args[]) {
        int width, height;
        Rectangle newRectangle = new Rectangle();
        Square newSquare = new Square();
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter the width of rectangle: ");
        width = takeInput.nextInt();
        System.out.println("Enter the Height of rectangle: ");
        height = takeInput.nextInt();
        newRectangle.setWidth(width);
        newRectangle.setHeight(height);
        int rectangleWidth = newRectangle.getWidth();
        int rectangleHeight = newRectangle.getHeight();
        System.out.println("width of rectangle: " + rectangleWidth);
        System.out.println("height of rectangle: " + rectangleHeight);
        int rectangleArea = newRectangle.calculateArea(rectangleWidth, rectangleHeight);
        System.out.println("area of rectangle: " + rectangleArea);

        System.out.println("Enter the width of square: ");
        width = takeInput.nextInt();
        System.out.println("Enter the Height of square: ");
        height = takeInput.nextInt();

        newSquare.setWidth(width);
        newSquare.setHeight(height);
        int squareWidth = newSquare.getWidth();
        int squareHeight = newSquare.getHeight();
        System.out.println("width of square: " + squareWidth);
        System.out.println("height of square: " + squareHeight);

        int squareArea = newSquare.calculateArea(squareWidth, squareHeight);
        System.out.println("area of square: " + squareArea);

    }
}
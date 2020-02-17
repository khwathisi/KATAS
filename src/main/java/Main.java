import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static even_or_odd even_or_odd = new even_or_odd();
    public static square square = new square();
    public static rightTriangle rightTriangle = new rightTriangle();
    public static triangle triangle = new triangle();
    public static longString longString = new longString();
    public static arrayCombine arrayCombine = new arrayCombine();
    public static frameText frameText = new frameText();
    public static Hello hello = new Hello();

    public static void main(String[] args){

        //Hello
        System.out.println("Please enter your name");
        String name = in.nextLine();
        System.out.println(hello.Hello(name));

        //even or odd
        System.out.println("Even and odd numbers, please enter a number");
        while(!in.hasNextInt()) {
            System.out.println("Enter a number");
            in.next();
        }
        int number = in.nextInt();
        System.out.println(even_or_odd.even_or_odd(number));

        //Square
        System.out.println("Please enter the size number of square");
        while(!in.hasNextInt()) {
            System.out.println("Enter a number");
            in.next();
        }
        int sizeSquare = in.nextInt();
        System.out.println(square.square(sizeSquare));

        //rightTriangle
        System.out.println("Please enter the size number of the right angled triangle");
        while(!in.hasNextInt()) {
            System.out.println("Enter a number");
            in.next();
        }
        int sizeTriangle = in.nextInt();
        System.out.println(rightTriangle.rightTriangle(sizeTriangle));

        //triangle (isosceles)
        System.out.println("Please enter the size number of the triangle");
        while(!in.hasNextInt()) {
            System.out.println("Enter a number");
            in.next();
        }
        int size = in.nextInt();
        System.out.println(triangle.triangle(size));

        //longest String
        System.out.println(longString.longString());

        //arrayCombine
        System.out.println(arrayCombine.arrayCombine());

        //frameText
        System.out.println(frameText.frameText());
    }
}

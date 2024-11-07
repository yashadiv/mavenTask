package org.example;

import org.example.figures.Rectangle;
import org.example.figures.Trinagle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Rectangle rectangle = new Rectangle();
        System.out.println("Периметр прямоугльника равен " + rectangle.perimetr(2,2));
        System.out.println("Площадь прямоугльника равен " + rectangle.square(2,2));

        Trinagle trinagle = new Trinagle();
        System.out.println("Периметр прямоугльника равен " + trinagle.perimetr(2,2,2));
        System.out.println("Площадь прямоугльника равен " + trinagle.square(2,2, 2));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutionpolygon;

/**
 *
 * @author mararosa
 */
public class SolutionPolygon {

    /**
     * @param args the command line arguments
     */
    public static void print(Polygon p) {
        System.out.println("A " + p.getClass().getSimpleName() + " has " + p.getNumberOfSides() + " sides.");
        System.out.println("The perimeter of this shape is: " + p.getPerimeter() + '\n');
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Polygon triangle = new Triangle(1, 2, 3);
        print(triangle);
        
        Polygon rectangle = new Rectangle(2, 3);
        print(rectangle);
        
        Polygon square = new Square(2);
        print(square);
        
    }
    
}

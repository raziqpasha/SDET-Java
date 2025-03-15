package Daily_Java_Task_2025;

//Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides,
// determine if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.

public class Task_14Mar_Equ_Isoc_Scalence_TraingleSides {
    public static void main(String[] args) {

        // or else can take user input also
        int side1 =10;
        int side2 =15;
        int side3 =20;

        if(side1 == side3 && side2==side3){ // it is complete triangle with 3 sides
            // all shud be equal in size
            System.out.println("it is equilateral triangle"); // it is complete triangle
            // with 3 sides and any 2 sizes shud be equal in size
        }
        if(side1 ==side2 || side2==side3){ // it is also triangle but its
            // shapeless and it will no b equal (check in google)
            System.out.println("it is isocels triangle");
        }
        else{
            System.out.println("it is scalence triangle");
        }
    }
}

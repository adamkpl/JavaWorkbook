package workbook;

public class Patterns {
    public static void main(String[] args) {

/*
        Right Triangle Star Pattern
        *
        * *
        * * *
        * * * *
        * * * * *
*/
        rightTriangleStarPattern(5);


    }

    private static void rightTriangleStarPattern(int rows) {
        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
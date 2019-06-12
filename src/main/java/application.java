public class application {
    public static void main(String[] args) {

        //lesson: Arrays, part 2/4

        // define variables
        int [ ] myArray = {6, 42, 3, 7}; // 4 elements, last one index=3
        int sum=0;

        // open FOR loop & define new variable x
        for(int index=0; index<myArray.length; index++) {
            sum = sum + myArray[index];
        }

        // print result
        System.out.println(sum); // = 58
    }
}
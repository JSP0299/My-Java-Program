//SORTING OF AN ARRAY
import java.util.Arrays;
public class my13 {
    public static void main(String[] args){
    int[] marks = new int[5];
    marks[0] = 99;
    marks[1] = 98;
    marks[2] = 91;
    marks[3] = 90;
    marks[4] = 92;
    System.out.println(marks[0]);
    Arrays.sort(marks); //we have to import library file for Array sorting-import java.util.Arrays;
    System.out.println(marks[0]);
    }
}

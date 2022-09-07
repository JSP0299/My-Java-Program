//ARRAY
public class my11 {
    public static void main(String[] args){
    int[] marks = new int[5];
    marks[0] = 99;
    marks[1] = 98;
    marks[2] = 91;
    marks[3] = 90;
    marks[4] = 92;
    System.out.println(marks[4]);
    int[] marks1 = new int[5];
    // marks1[0] = 99;
    // marks1[1] = 98;
    // marks1[2] = 91;
    // marks1[3] = 90;
    // marks1[4] = 92;
    System.out.println(marks1[4]);// by default 6it will priont null value i.e 0 if we dont give any value
    System.out.println(marks[4]);
    //if we use boolean
    boolean[] marks2 = new boolean[5];
    // marks2[0] = 99;
    // marks2[1] = 98;
    // marks3[2] = 91;
    // marks4[3] = 90;
    // marks5[4] = 92;
    System.out.println(marks2[4]);// for boolean it will initialize as null i.e false
    }
}
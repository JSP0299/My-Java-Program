import java.util.Scanner;

public class my26 {
    public static void main(String[] args){
    //CONDITIONAL STATEMENT SUMMARY
    Scanner sc=new Scanner(System.in);
    //pen=10; notebok = 40
    int cash=sc.nextInt();
    if (cash<10){ // this'{' is called block in java
        System.out.println("Cant buy anything");
        System.out.println("Get more cash");
    }
    else if(cash>10&& cash<40){
        System.out.println("can get one thing");
    }
    else{
        System.out.println("Can get both");
    }
    System.out.println();
    }
}

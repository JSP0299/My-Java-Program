//casting
public class my15 {
    public static void main(String[] args){
    double price = 100.00;
    double finalprice = price + 18;
    System.out.println(finalprice);
    int p = 100;
    int fp = p + 18.0;//double cant stored in integer
    //we can use "explicit casting"
    int p1 = 100;
    int fp1 = p1 + (int) 18.00; //here we use paranthesis
    System.out.println(fp1);//it will cut after decimal value
    }
}
public class my09 {
    public static void main(String[] args){
    //charAt
    String name = "JyotishankarPanda";

    System.out.println(name.charAt(11)); //A must be in capital
    //length
    System.out.println(name.length());
    //replace
    String name2 = name.replace('J','X');
    //name can't be changed if we replace so we have to create a new string
    System.out.println(name2);
    //string is immutable
    System.out.println(name);
    }
}
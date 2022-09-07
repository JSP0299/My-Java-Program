public class my25 {
    public static void main(String[] args){
    //LOGICAL OPERATOR
    //&&(both condition must be true)(otherwise the command will go to else part)
    int a=30;
    int b=40;
    // if (a<50 && b<50)
    //     System.out.println("Both less than 50");
    // || (logical or- If atleast one condition will be true then it will print)
    if (a<50 || b<50)
        System.out.println("Atleast one less than 50");
    boolean isadult=true;
    // if(isadult==true)
    //     System.out.println("is adult");
    // else
    //     System.out.println("not adult");
    if(isadult) //for boolean we dont have to use true
        System.out.println("is adult");
    else
        System.out.println("not adult");
    }
}

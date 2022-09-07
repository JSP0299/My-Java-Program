//SWITCH CASE
public class my27 {
    public static void main(String[] args){
        //CONDITIONAL STATEMENT- SWITCH
        int day=1; //1=monday;2=tuesday
        switch(day){
            case 1:
                System.out.println("Monday");
                break; //to out from the block
            case 2:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("wed-sun");
                break;
        }
    }
}

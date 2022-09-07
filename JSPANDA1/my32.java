public class my32 {
    public static void main(String[] args){
        int i=0;
        while(true){
            if(i==3){ //we are skipping the number 3 by the help of continue
                i=i+1;
                continue;
            }
            //break & CONTINUE
            System.out.println(i);
            i=i+1;
            if(i>5){
                break;
            }
        }
    }
}

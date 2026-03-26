public class Mark {

    public static void main (String[] args){


        int mark[] = {79,90,65,30,84};

        for (int i=0;i<=5;i++){
            if (mark[i]>=90){

            System.out.println("Excellent");

            }else if(mark[i]>=75 && mark[i]<=89){

                System.out.println("Good");

            }else if (mark[i]<=74 && mark[i]>=50) {

                System.out.println("Average");
                
            }else{
                System.out.println("Fail");
            }
        }
    }

    
}

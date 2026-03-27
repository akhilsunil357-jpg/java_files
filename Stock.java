public class Stock {

    public static void main(String[] args){

        int arr[] = {102,65, 30, 0, 25};


        for(int i:arr){

            if(i<50 && i>1){
                System.out.println("Low Quantity");
            }

            else if(i>50 && i<100){
                System.out.println("Moderate Quantity");
            }

            else if(i==0){
                System.out.println("Out of Stock");
                break;
            }

            else{
                System.out.println("Good quantity");
            }
        }


    }
    
}

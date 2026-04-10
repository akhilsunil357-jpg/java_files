import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Work13 {

    @SuppressWarnings("unchecked")
    public static void findnum(String message){

        Pattern pattern = Pattern.compile("\\d{10}");
        Matcher matcher = pattern.matcher(message);

        boolean found = false;

        while(matcher.find()){
            System.out.println(matcher.group());

            found = true;
        }
        if(!found){
            System.out.println("NO Phone number found");
        }

    }

    public static void main(String[] args){

        String message = "hello call me  9647253145";

        System.out.println("Phone num found");

         findnum(message);
    }
    
}

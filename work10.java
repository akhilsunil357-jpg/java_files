class Student{

    private String name;
    private int Roll_no;
    private double Percentage;

    public void setdetails(String name, int Roll_no , double Percentage){

        this.name = name;
        this.Roll_no = Roll_no;
        this.Percentage = Percentage;
    }

    public void getdetails() {

        System.out.println(name +" " + Roll_no + " " + Percentage);


    }


}





public class work10 {

    

    public static void main(String[] args){

        Student s =  new Student();

        s.setdetails("jojo",101,99.9);

        s.getdetails();


    }

    


}

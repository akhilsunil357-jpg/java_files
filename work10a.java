class Students{
    private String name;
    private int Id_num;
    private String Department;
    private double Salary;

    public void setdetails(String name, int Id_num , String Department , double Salary){
        this.name = name;
        this.Id_num = Id_num;
        this.Department = Department;
        this.Salary = Salary;

    }

    public void getdetails(){

        System.out.println(name +" "+Id_num+" "+Department+" "+Salary);
    }


}




public class work10a {

    public static void main(String[] args){

        Students S1 = new Students();
        Students S2 = new Students();


        S1.setdetails("jojo", 101, "CS", 1000);
        S2.setdetails("Akhil",102,"mech",1000);

        S1.getdetails();
        S2.getdetails();

    }
    
}

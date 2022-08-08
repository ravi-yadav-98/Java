public class EmployeeClass {
    private String  name;
    private int salary;
    public int getSalary(){
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setSalary(int s)
    {
        salary = s;
    }

}

class Execute{
    public static void main(String[] args) {
        EmployeeClass ravi = new EmployeeClass();
        ravi.setName("Ravi yadav");
        System.out.println(ravi.getName());
        ravi.setSalary(1000);
        System.out.println(ravi.getSalary());


    }
}

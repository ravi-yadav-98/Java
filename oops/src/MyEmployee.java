public class MyEmployee {
    private  int id;
    private String  name;
//    constructor
    public  MyEmployee(){
        id = 101;
        name = "Jashni";
    }

    public MyEmployee(String myName, int myId)
    {
        this.name = myName;
        this.id = myId;
    }

    public String getName() {
        return name;
    }

    public void setId(int input)
    {
        this.id = input;
    }
    public void setName(String input)
    {
        this.name = input;
    }


    public int getId() {
        return id;
    }
}

class Run{
    public static void main(String[] args) {
        MyEmployee e1 = new MyEmployee();
//        e1.setId(1000);
//        e1.setName("Krishna Yadav");
        System.out.println(e1.getId());
        System.out.println(e1.getName());

    }
}

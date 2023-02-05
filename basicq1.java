class basic{
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s) {
        id=i;
        name=n;
        salary=s;
    }
    void display(){System.out.println(id+" "+name+" "+salary);}
}
public class basicq1 {
    public static void main(String[] args) {
        basic e1=new basic();
        basic e2=new basic();
        basic e3=new basic();
        e1.insert(101,"aditya",45000);
        e2.insert(102,"sandeep",25000);
        e3.insert(103,"ajay",55000);
        e1.display();
        e2.display();
        e3.display();
    }
}
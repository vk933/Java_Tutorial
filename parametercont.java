public class parametercont {
    int id;
    String name;
    //creating a parameterized constructor
    parametercont(int i,String n){
        id = i;
        name = n;
    }
    //method to display the values
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        //creating objects and passing values
        parametercont s1 = new parametercont(111,"aditya");
        parametercont s2 = new parametercont(222,"sandeep");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}

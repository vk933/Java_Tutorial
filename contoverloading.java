class contoverloading{
    int id;
    String name;
    int age;

    contoverloading(int i,String n){
        id = i;
        name = n;
    }
    contoverloading(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}

    public static void main(String args[]){
        contoverloading s1 = new  contoverloading(111,"aditya");
        contoverloading s2 = new  contoverloading(222,"sandeep",25);
        s1.display();
        s2.display();
    }
}

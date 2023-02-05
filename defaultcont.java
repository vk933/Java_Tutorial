class defaultcont{
    int id;
    String name;
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        defaultcont s1=new defaultcont();
        defaultcont s2=new defaultcont();
        s1.display();
        s2.display();
    }
}

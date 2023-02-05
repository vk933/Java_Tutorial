 class pro {
        float salary=40000;
    }
    class inhertance extends pro{
        int bonus=10000;
        public static void main(String args[]){
            inhertance p=new inhertance();
            System.out.println("Programmer salary is:"+p.salary);
            System.out.println("Bonus of Programmer is:"+p.bonus);
        }
    }

 /*class Animal{
     void eat(){System.out.println("eating...");}
 }
 class Dog extends Animal{
     void bark(){System.out.println("barking...");}
 }
 class TestInheritance{
     public static void main(String args[]){
         Dog d=new Dog();
         d.bark();
         d.eat();
     }}*/

 //multile inhertance

 /*class Animal{
     void eat(){System.out.println("eating...");}
 }
 class Dog extends Animal{
     void bark(){System.out.println("barking...");}
 }
 class BabyDog extends Dog{
     void weep(){System.out.println("weeping...");}
 }
 class TestInheritance2{
     public static void main(String args[]){
         BabyDog d=new BabyDog();
         d.weep();
         d.bark();
         d.eat();
     }}*/

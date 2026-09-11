class Animal {
    void sound(){
        System.out.println("animal makes a sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("cat meouws");
    }
}
class elephat extends Animal{
    void sound(){
        System.out.println("elephant trumpets");
   }
}
 class AnimalTest{
    public static void main(String[]args){
        Animal a1=new Dog();
        Animal a2=new cat();
        Animal a3=new elephat();
        a1.sound();
        a2.sound();
        a3.sound();
    
    }
}



public class Parent {
    String name;
    int age;
    float salary;
    public Parent(String a,int b,float c){
        name=a;
        age=b;
        salary=c;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args) {
        Parent p1=new Parent("Bob",30,50000.0f);
        p1.display();
    }
    
    
}

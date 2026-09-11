public class Family {
    String name;
    int age;
    float income;

    Family(String a,int b,float c){
        name=a;
        age=b;
        income=c;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Income: "+income);
    }
    public static void main(String[] args) {
        Family f1=new Family("Smith",40,60000.0f);
        f1.display();
    }

    
}

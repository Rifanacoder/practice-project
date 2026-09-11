 class Calculator{
    void add(int a,int b){
        System.out.println("sum:"+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("sum:"+(a+b+c));
    }
    void add(int a,int b,int c,int d){
        System.out.println("sum:"+(a+b+c+d));
    }
}
class Testing{
    public static void main(String[]args){
        Calculator c1=new Calculator();
        c1.add(10,20);
        c1.add(10,20,30);
    
    }
}

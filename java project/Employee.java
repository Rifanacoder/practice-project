  class Employee {
   String name;
   int experience;
   float salary;

   Employee(String var1, int var2, float var3) {
      this.name = var1;
      this.experience = var2;
      this.salary = var3;
   }

   void display() {
      System.out.println("Name: " + this.name);
      System.out.println("Experience: " + this.experience);
      System.out.println("Salary: " + this.salary);
   }
public static void main(String[] args) {
      Employee emp1 = new Employee("John Doe", 5, 75000.0f);
      emp1.display();
   }
}
    


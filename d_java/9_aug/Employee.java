public class Employee {
    String name;
    int salary;

    void information(String n, int s) {
        name = n;
        salary = s;
    }

    void show() {
        System.out.println(name+ "  "+salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.information("indresh", 2002);
        e1.show();
          Employee e2 = new Employee();
        e2.information("ravi", 20032);
        e2.show();
          Employee e3 = new Employee();
        e3.information("sachin ", 20009);
        e3.show();

    }
}

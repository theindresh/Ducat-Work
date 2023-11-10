class Emp_Static_variable {
    String C_name;
    String name;
    int salary;
    void get(String s1, String s2, int s3){
        C_name= s1;
        name = s2;
        salary = s3;
    }
    void show(){
        System.out.println(C_name+" "+name+" "+salary);
    }
    public static void main(String[] args) {
        Emp_Static_variable e1 = new Emp_Static_variable();
        Emp_Static_variable e2 = new Emp_Static_variable();
        e1.get("tata", "Indresh", 25000);
        e1.show();
        e2.get("amazon", "praveen", 250000);
        e2.show();

        
    }
    
}

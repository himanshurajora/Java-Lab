

class Student{

    public int id;
    public String name;

    void display() {
        System.out.println("Id: " + id + "\nName: " + name + "\n************************************" );
    }

    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();

        S1.display();
        S2.display();
    }
}
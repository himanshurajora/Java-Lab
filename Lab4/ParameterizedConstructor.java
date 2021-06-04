
class ParameterizedConstructor
{
    int id;
    String name;
    int age;

    ParameterizedConstructor(int i, String n)
    {
        id = i;
        name = n;
    }

    ParameterizedConstructor(int i, String n, int j)
    {
        id = i;
        name = n;
        age = j;
    }

    void display(){
                System.out.println("Id: " + id + "\nName: " + name + "\nAge: "+ age + "\n************************************" );
    }

    public static void main(String[] args)
    {
        ParameterizedConstructor S1 = new ParameterizedConstructor(111, "Raj");
        ParameterizedConstructor S2 = new ParameterizedConstructor(123, "Harry", 25);

        S1.display();
        S2.display();
    }
}
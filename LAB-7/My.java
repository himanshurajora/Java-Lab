
// Single Inheritance

class calculation {
    int z;
    public void add(int x, int y){
        z=x+y;

        System.out.println("The Sum is " + z);
    }
    public void subtract(int x, int y){
        z=x-y;
        System.out.println("The Subtraction is " + z);
    }

}

public class My extends calculation {
    public void multiplication(int x, int y){
        z=x*y;
        System.out.println("The multiplication is " + z);
    }

    public static void main(String[] args){
        My obj = new My();
        obj.add(10,20);
        obj.subtract(20,7);
        obj.multiplication(2,8);
    }
}
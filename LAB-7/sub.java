
// Super keyword
// It is used to differentiate the members of super class from the member of sub class if they have same name.
// It is used to invoke the super class constructor.

class parent {
    int num =20;
    public void display()
    {
        System.out.println("This is the display method of super class");
    }
}

class sub extends parent {
    int num=10;
    public void display()
    {
        System.out.println("This is the display method of child class");
    }
    
    public void my(){
        sub s = new sub();
        s.display();
        super.display();

        System.out.println("Value of the variable named num in child class: "+ s.num);
        System.out.println("Value of the variable named num in super class: "+ super.num);
    }

    public static void main(String[] args){
        sub s1 = new sub();
        s1.my();
    }
}
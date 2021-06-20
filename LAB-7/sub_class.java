

// invoke the super class constructor using super keyword.

class super_class {
    int age;
    super_class(int age){
        this.age = age;
    }
    public void getAge(){
        System.out.println("The value of the variable named age is " + age);
    }    
}

class sub_class extends super_class {
    sub_class(int age){
        super(age);
    }

    public static void main(String[] args){
        sub_class obj = new sub_class(24);
        obj.getAge();
    }
}
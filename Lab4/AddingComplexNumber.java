

class AddingComplexNumber
{
    float imagery;
    float real;

    AddingComplexNumber(float real, float imagery)
    {
        this.real = real;
        this.imagery = imagery;
    }
    AddingComplexNumber()
    {
        this.imagery = 0;
        this.real = 0;
    }

    void display(){
        if(imagery < 0){
                System.out.println("Complex Number: "+ real + " "+ imagery+"i"+ "\n************************************" );
        }
        else{
                System.out.println("Complex Number: "+ real + " + "+ imagery+"i"+ "\n************************************" );
        }
    }

    AddingComplexNumber Add(AddingComplexNumber obj2){

        AddingComplexNumber temp = new AddingComplexNumber();

        temp.real = this.real + obj2.real;
        temp.imagery = this.imagery + obj2.imagery;

        return temp;
    }

    public static void main(String[] args)
    {
        AddingComplexNumber S1 = new AddingComplexNumber(1, 4);
        AddingComplexNumber S2 = new AddingComplexNumber(2, -3);
        AddingComplexNumber S3 = new AddingComplexNumber();
        S1.display();
        S2.display();

        S3 = S1.Add(S2);
        S3.display();
    }
}
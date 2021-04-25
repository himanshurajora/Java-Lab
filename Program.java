class Program{
    public static void main(String[] args) {
        int r,sum=0,temp;    
        int n=407;//It is the number variable to be checked for palindrome  
        
        temp=n;    
        while(n>0){    
         r=n%10;  //getting remainder  
         sum += r*r*r;    
         n=n/10;    
        }    
        if(temp==sum)    
         System.out.println("Armstrong Number ");    
        else    
         System.out.println("Not Armstrong Number");    
      }  
	}

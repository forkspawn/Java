/* Static Variables/Static Fields:A static fild is a varialble that belongs to a class. It has the same value for all objects that access it.
 *  They are also called class variable.Lifetime is when class is loaded into memory.
 * Instance Variables/Non static Fields: Is a variable that belongs to the object. Object keep their internal state in non-static fileds. Non static fields are also called instances(ojbects) 
 *  of a class.Lifetime is when object or a class is created.
 * Method Local variable: It is a variable that is declared in a method. It is only accessible inside the method that declared it. 
 * Method Parameters 
 */


public class variabletypes{
    public String myVar="Instance Variable";
    public void myMethod()
    {
        String myVar="Inside method";
        System.out.println(myVar); //this will printout myVar in the method
    }
    public static void main(String args[]){
        variabletypes obj= new variabletypes();
        obj.myMethod();
       // System.out.println(obj.myVar); // this will print out myVar in the class which in instance variable
    }
}


/*
public class variable{
    static int staticVariable=1;
    int instanceVariable=2;
    public void methodName(int methodParameter)
    {
        int methodlocalVariable=3;
        if(true)
        {
            int blockVariable=4;
        }
    }
    public static void main(String[] args){
        int a=10;
        int b=19;
        int c=a+b;
        System.out.println(c);

    }
}
*/


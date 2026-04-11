/*import java.util.Scanner;
public class Transport{
    String transportname;
    int transportId;
    String Companyaddress;
    double basicfair;
    double totalfair;
    Transport(){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the transport id:");
        transportId=Sc.nextInt();
        Sc.nextLine();
        System.out.println("Enter the transport name:");
        transportname=Sc.nextLine();
        System.out.println("Enter Company Address:");
        Companyaddress=Sc.nextLine();
        System.out.println("Enter basic fair:");
        basicfair=Sc.nextDouble();
    }
    void charges(){
        double gst=0.05*basicfair;
        double vat=0.05*basicfair;
        double insurance=0.15*basicfair;
        totalfair=basicfair+gst+vat+insurance;
    }   
    void display(){
        System.out.println("The transport id is:"+transportId);
        System.out.println("The transport name:"+transportname);
        System.out.println("The company address:"+Companyaddress);
        System.out.println("the total fair is:"+totalfair);
    }
public static void main(String[] args){
    Transport t1=new Transport();
    t1.charges();
    t1.display();
}
}*/
/*import java.util.Scanner;
public class Employee{
    int ID;
    String name;
    String Department;
    float Salary;
    Employee(int ID,String name,String Department,float Salary){
        this.ID=ID;
        this.name=name;
        this.Department=Department;
        this.Salary=Salary;
    }
    void display(){
        System.out.println("The ID of the employee is:"+ID);
        System.out.println("The name of the employee is:"+name);
        System.out.println("The department of the employee is:"+Department);
        System.out.println("The salary is:"+Salary);
    }
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the employee ID:");
    int ID=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the Employee name");
    String name=sc.nextLine();
    System.out.println("Enter the Department:");
    String Department=sc.nextLine();
    System.out.println("Enter the salary of the employee:");
    float Salary=sc.nextFloat();
    Employee E1=new Employee(ID,name,Department,Salary);
    E1.display();
}
}*/
/*class Iphone6{
    void makecalls(){
        System.out.println("Calling functionality");
    }
}
class Iphone10 extends Iphone6{
    void unlockfacebyfaceID(){
        System.out.println("Unlocking by face ID");
    }
}
public class Iphone12 extends Iphone10{
    void Supportfor5gnetwork(){
        System.out.println("5g network support");
    }
public static void main (String[] args){
    Iphone12 phone=new Iphone12();
    phone.makecalls();
    phone. unlockfacebyfaceID();
    phone.Supportfor5gnetwork();
}
}*/
/*import java.util.Scanner;
public class display{
    int a;
    int b;
    float c;
    float d;
    public int add(int a,int b){
        return a+b;
    }
    public float add(float c,float d){
        return c+d;
    }
public class testover{}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first integer:");
    int a=sc.nextInt();
    System.out.println("Enter the second integer:");
    int b=sc.nextInt();
    System.out.println("Enter the first float:");
    float c=sc.nextFloat();
    System.out.println("Enter the second float:");
    float d=sc.nextFloat();
    display d1=new display();
    System.out.println(d1.add(a,b));
    float f=d1.add(c,d);
    System.out.println(f);
    }
}*/
import java.util.Scanner;
public class python{
    public String appendstr(String str1,String str2){
        System.out.printf("The given string are %s and %s ",str1,str2);
        int len1=str1.length();
        int len2=str2.length();
        if (len1>len2){
          str1=str1.substring(len1-len2);
        }
        else if(len2>len1){
            str2=str2.substring(len2-len1);
        }
        return str1+str2;
    }
public static void main(String args[]){
    python p1=new python();
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    String c=p1.appendstr(str1,str2);
    System.out.println("The new Stringis:"+c);

}
}


import java.util.Scanner;
public class School{
    String Schoolname;
    String level;
    String place;
    School(){
    }
    School(String Schoolname,String level,String place){
        this.Schoolname=Schoolname;
        this.level=level;
        this.place=place;
    } 
    void display(){
        System.out.println("School name:"+Schoolname);
        System.out.println("Level"+level);
        System.out.println("Place"+place);
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the school name:");
    String Schoolname=sc.nextLine();
    System.out.println("Enter the level:");
    String level=sc.nextLine();
    System.out.println("Enter the place:");
    String place=sc.nextLine();
    School s1=new School(Schoolname,level,place);
    s1.display();

} 
}

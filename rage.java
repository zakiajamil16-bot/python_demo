import java.util.Scanner;
public class rage {
    int a;
    int b;
    char as;
    char bs;
    String C;
    String D;
    void compare(int a,int b){
        if (a>b){
            System.out.println("first number is greater than Second number");
        }
        else{
            System.out.println("Second number is greater than First number");
        }
    }
    void compare(char as,char b){
        if (as>bs){
            System.out.println("The first character is greater than the second charcter: ");
        }
        else{
            System.out.println("The second charcter is greater than the first one:");
        }
    }
    void compare(String C,String D){
        int cl=C.length();
        int dl=D.length();
        if(cl>dl){
            System.out.println("The first String is longer than the second one");
        }
        else{
            System.out.println("The Second string is greaer than the first one");
        }
    }
    public static void main(String[] args){
        rage r1=new rage();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int a=sc.nextInt();
        System.out.println("Enter the sceond integer:");
        sc.nextLine();
        int b=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the first character:");
        char as=sc.next().charAt(0);
        System.out.println("Enter the second charcter:");
        char bs=sc.next().charAt(0);
        System.out.println("Enter the first String:");
        String C=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the second String:");
        String D=sc.nextLine();
        r1.compare(a,b);
        r1.compare(as,bs);
        r1.compare(C,D);
        
    }


    }

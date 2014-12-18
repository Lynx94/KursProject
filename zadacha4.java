package kursproj;
import java.util.*;
import java.io.*;
public class Main {
static String a[]; 
static void compare(String n){ 
if(n.endsWith("ovo")){ 
System.out.println(n); 
} 
} 

static void in(String a[]){ 
int i; //
Scanner input= new Scanner(System.in); 
for(i=0; ia[i]=input.next(); 
} 
} 
public static void main(String []args){
int n,i;
Scanner input = new Scanner(System.in);
System.out.println("Broi elementi: ");
n=input.nextInt();
if(n<1 || n>50) System.out.println("Error !");
a=new String[n];
in(a);
for(i=0; icompare(a[i]);
}
}
}
package kurspro;
import java.util.*;
import java.io.*;
public class Main{
static int []a;
static Random rand= new Random();
static int prand(int mod){
return Math.abs(rand.nextInt())%mod +1;
}
static void create(int a[]){
int i;
for(i=0; ia[i]=prand(200)-100;
}
}
static void printarr(int[] a) {
System.out.println("length of the array= " + a.length);
for(int i = 0; i < a.length; i++)
System.out.println("a[" + i + "] = " + a[i]);
} 
static double srg(int a[]){
int p=1,i;
for(i=0; iif(a[i]>6 && a[i]<=50)
p*=a[i];
}
return Math.sqrt(p/a.length);
}
public static void main(String[] args){
int i,n;
a=new int[prand(20)];
create(a);
printarr(a);
System.out.println("SrG of array a: " + srg(a));
}
}

package com.mycompany.mavenproject2;
public class Bottom_triangle {
    public static void main(String[] args) {
      
        for(int i=4;i>0;i--){
               for(int m=20; m>i;m--)
               {System.out.print(" ");}
for (int j=0;j<i;j++)
{ System.out.print("*");}

 for ( int j=1 ; j<i ; j++)
{ System.out.print("*");}   


System.out.print("\n"); }
    }
}
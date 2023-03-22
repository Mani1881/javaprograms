import java.util.*;
public class  his{
    int a,b;
    String name;
    //void m(int a,int b)
    his(int a,int b){
        this.a=a;
        this.b=b;
    }
    //a constructor can't be called in methods
    his()
    {
        //here constructor recursion call happens
        //this("ui");
        this(80,98);
        System.out.println("Happyyyyyyy");
    }
    his get(){
return this;

    }
    his(String n){
        //a constructor can be called in another constructor
           //a constructor can be called in another constructor
       this();
        System.out.println("name="+n);
    }
    his(int a,int b,String name){
        this.name=name;
    }
    void h(his k){//this is used in event handling where reuse object(provide reference of class to another one)
        System.out.println("Method is called");
    }
    void dis()
    {
     //   m(78,90);
       // this.m(78,90);
       h(this);
        System.out.println("a="+a+"b="+b);
    }
    public static void main(String[] args)
    {
        his k=new his("gu");
      his l=new his(8569,9054);
     k.get().dis();   
     A i=new A();
     i.get();
     B obj=new B();
    }
}
//this as a method parameter
class A
{
    int a,b;
    A(){
        a=90;
        b=87;
    }
    void dis(A p){// method that receives this as a parameter
        System.out.println("a="+p.a+"b="+p.b);
    }
 void get()
 {
    dis(this);
 }
 B r;
 A(B r){
    this.r=r;
    System.out.println("r="+r);
    r.disl();
 }
}
class B{
    int x=9;
    B(){
        A k=new A(this);// this as a argument in constructor
    }
    void disl()
    {
        System.out.println("Value of x in class B: "+x);
    }
}

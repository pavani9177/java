public class StaticBlock   
{  
StaticBlock()   
{  
System.out.println("Inside the constructor of the class.");  
}  
public static void print()   
{  
System.out.println("Inside the print method.");  
}  
  
static  
{  
System.out.println("Inside the static block.");   
}  
public static void main(String[] args)   
{  
StaticBlock sbObj = new StaticBlock();  
sbObj.print(); 
new StaticBlock();  
  
}  
}  

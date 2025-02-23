import java.util.*; 
 class exception  
{ 
 static void check (int percent) throws NotEligible 
 { 
  if(percent<50) 
  { 
   throw new NotEligible("Not Eligible to Write Exam!!"); 
  } 
  else if(percent>=75) 
  { 
   System.out.println("Eligible to Write your Exam"); 
  } 
  else 
  { 
   System.out.println("Eligible to appear for exam with fine amount"); 
  } 
 } 
 public static void main (String [] args) 
 { 
  Scanner obj = new Scanner (System.in); 
  int percent; 
  System.out.println("Enter your attendance percentage:"); 
  percent = obj.nextInt(); 
  try 
  { 
   check(percent); 
  } 
  catch (NotEligible e) 
  { 
   System.out.println(e); 
  } 
 } 
} 
class NotEligible extends Exception 
{ 
 NotEligible(String s) 
 { 
  super(s); 
 } 

}

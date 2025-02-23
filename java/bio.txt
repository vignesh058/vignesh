class Bio_Computing 
{ 
 public static void main(String args[]) 
 { 
  String subject = "actgatcgattgatcgatcgatcg"; 
  String query = "tttagatcgatctttgatc"; 
  int score = 0; 
  int subject_start = 7; 
  int query_start = 4; 
  int length = 8; 
  for(int i=0; i<length; i++) 
  { 
   char subject_base = subject.charAt(subject_start+i); 
   char query_base = query.charAt(query_start+i); 
   if(subject_base == query_base) 
   {  
    score=score+1; 
   } 
   else 
   { 
    score=score-1;  
   }  
  } 
  System.out.println(score); 
 } 
}
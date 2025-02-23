class genePattern  
{ 
public static void main(String[] args)  
{ 
String str1 = "TATTGTGCCAATAAGACTCGTTA"; 
String str2 = "ATAACACGGTTATTCTGAGCAAT"; 
int[] leadingSpaces = {2, 1, 0, 0, 1, 2, 3, 3, 2, 1, 0, 0, 1, 2, 3}; 
int[] dashCount     = {2, 4, 6, 6, 4, 2, 0, 0, 2, 4, 6, 6, 4, 2, 0}; 
int ind = 0; 
for (int i = 0; i < dashCount.length; i++)  
{ 
if (ind >= str1.length())  
        break;
for (int s = 0; s < leadingSpaces[i]; s++)  
{ 
    System.out.print(" "); 
}
System.out.print(str1.charAt(ind)); 
for (int j = 0; j < dashCount[i]; j++)  
{ 
    System.out.print("-"); 
}
System.out.print(str2.charAt(ind)); 
System.out.println(); 
ind++; 
}
}
}
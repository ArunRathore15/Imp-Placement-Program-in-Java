// CHECK WHEATHER THE CHARECTER IS VOWEL OR CONSONANT
/*class Demo92
{
	public static void main(String ar[]){
		char c='A';
			if(c=='A'||c=='E' ||c=='I' ||c=='O' ||c=='U'||c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u')
				System.out.println("Given character\t"+c+"is vowel");
			else
				System.out.println("Given character\t"+c+"\tis not vowel");
			
	}
}*/

// CHECK WHEATHER THE CHARACTER IS ALPHABATE OR NOTE 
/*class Demo92 
{
	public static void main(String ar[]){
		char c='70';
		int x=c;
		if(x>96 && x<123 || x>64 && x<91)
			System.out.println("Given character is ALPHABATE");
		else 
			System.out.println("Given character is not ALPHABATE");
	}
}*/

//FIND THE ASCII VALUE OF CHARACTER
/*class Demo92 
{
	public static void main(String ar[]){
		char c='a';
		int x=c;
		System.out.println(x);
}}
*/

//FIND HOW MANY VOWELS AND CONSONANT IN A GIVEN STRING 

/*class Demo92 
{
	public static void main(String ar[]){
		String s1="my name  is arun";
		int c=0;
		int c1=0;
		int c2=0;
		char C[]=s1.toCharArray();
		int x1=C.length;
	for(int i=0;i<x1;i++){
		int x=C[i];
			if(x>96 && x<123 || x>64 && x<91)
			{
				if(x==97||x==105||x==111|| x==101|| x==117|| x==65|| x==69|| x==73|| x==79||x==85)
			c++;
		else
		c1++;
			}
			else
				c2++;   
	}
				System.out.println("THERE ARE TOTAL\t"+c2+"\tSPACES IN THE GIVEN STRING and ");
			System.out.println("Vowels are"+c);
			System.out.println("Consonants are"+c1);
}
}*/

//Toggle each character in a String(means uppercase ko lowercase mein and vise-versa)
 /*class Demo92{
	public static void main(String ar[]){
	String s1="mAmLeShEweR";
	String s="";
	int x=s1.length();
	for(int i=0;i<x;i++){
		if(Character.isUpperCase(s1.charAt(i)))
		s=s+Character.toLowerCase(s1.charAt(i));
	else
		s=s+Character.toUpperCase(s1.charAt(i));}
System.out.println("Given String is\t"+s1);
System.out.println("toggled String \t"+s);}
}*/

//REMOVE THE VOWELS FROM THE STRING
/*class Demo92{
	public static void main(String ar[]){
		String s="sundar";
		String s1=s.replaceAll("[aeiou]","");
		System.out.println(s1);
}}*/

//CHECK THE GIVEN STRING IS PALINDROM OR NOT 
/*class Demo92
{
	public static void main(String ar[]){
		String s="nayan";
		String s1="";
		int x=s.length();
		for(int i=x-1;i>=0;i--)
		{
			s1=s1+(s.charAt(i));
	}
	if(s.equals(s1))
		System.out.println("String is Palindrome");
else
	System.out.println("String is not Palindrome");
}		
}*/

//Remove all Characters from String except alphabets
/*class Demo92
{
	public static void main(String ar[]){
		String s="nayanAA";
		String s1=s.replaceAll("[^aeiouAEIOU]","");
		System.out.println(s1);
	}
}*/

//REMOVE SPACE FROM  A STRING
/*class Demo92
{
	public static void main(String ar[]){
		String s="my name is ram";
		String s1="";
		int x=s.length();
		for(int i=0;i<x;i++){
			if(Character.isSpace(s.charAt(i)))
			continue;
			else
				s1=s1+(s.charAt(i));	
		}
		System.out.println(s1);
	}
}*/

//Count the sum of numbers in a String
/*class Demo92
{
	public static void main(String ar[]){
		String s="surajsin21425864234gh45";
		int x=s.length();
		int y=0;
		for(int i=0;i<x;i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				y=y+(Character.getNumericValue(s.charAt(i)));
			}
		}
		System.out.println("Sum is"+y);
}		
}*/

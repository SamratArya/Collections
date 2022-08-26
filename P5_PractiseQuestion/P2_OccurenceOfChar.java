package P5_PractiseQuestion;

public class P2_OccurenceOfChar {
	
	public static void main(String[] args) {
		
		String str = "AABNSDDDWWOOPOFG";
		
		//converting string to char
		char ch[] = str.toCharArray();
		
		System.out.println("This is your character array");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		
		//for counting the character
		int count[] = new int[200];
		for(int i=0;i<ch.length;i++)
		{
			count[str.charAt(i)]++;
		}
		
		System.out.println("");
		//find the occurence of the char
		for(int i=0;i<str.length();i++)
		{
			ch[i] = str.charAt(i);
			
			int find=0;
			for(int j=0;j<=i;j++)
			{
				//any matches found
				if(str.charAt(i) == ch[j])
				{
					find++;
				}	
			}
			if(find==1)
			{
				System.out.println("Occurnce of character "+str.charAt(i)+" is : "+count[str.charAt(i)]);
			}
		}		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

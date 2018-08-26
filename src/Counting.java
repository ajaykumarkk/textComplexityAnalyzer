import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Counting 
{
	StringTokenizer tk;
	File file;
	String text;
	public int wc=0;
	public int cc=0;
	public int sc=0;
	public int syc=0;
	public int dwc=0;
	
	public Counting()
	{
		
	}
	
	public Counting(File f) throws FileNotFoundException
	{
		file=f;
		count();
	}
	public Counting (String s)
	{
		text=s;
		countS();
	}
	
	public void count() throws FileNotFoundException
	{
		String delimitors="!,\"?:~ \n";
		Scanner input=new Scanner(file);
		String s;
		String w[];
		Boolean vowel;
		while(input.hasNext())
		{	
			int i,j;
			
			String k[];
			s=input.nextLine();
			s.trim();
			tk =new StringTokenizer(s,delimitors);
			i=0;
			w=new String[tk.countTokens()];
			while(tk.hasMoreTokens())
			{
				w[i]=tk.nextToken();
				i++;
			}
			
			
			for(i=0;i<w.length;i++)
			{
				int diff=syc;
				vowel=false;
				for(j=0;j<w[i].length();j++)
				{
					if(!vowel&&(w[i].charAt(j)=='a'||w[i].charAt(j)=='e'||w[i].charAt(j)=='i'||w[i].charAt(j)=='o'||w[i].charAt(j)=='u'))
					{
						vowel=true;
						syc++;
					}
					
					else
					{
						
					
						if(!vowel&&(w[i].charAt(j)=='y'))
						{
							syc++;
						}
						
						if(!(w[i].charAt(j)=='a'||w[i].charAt(j)=='e'||w[i].charAt(j)=='i'||w[i].charAt(j)=='o'||w[i].charAt(j)=='u'))
						{
							vowel=false;
						}
					}
					
					
				}
				if(w[i].charAt(j-1)=='e'&&((w[i].charAt(j-2)=='h'||w[i].charAt(j-2)=='w')))
				{
					syc++;
				}
				else
				if(w[i].charAt(j-1)=='e')
				{
					syc--;
				}
				if(syc-diff>=3)
				{
					dwc++;
				}
				
				
				
				
			}
			

				wc+=tk.countTokens();
				
				k=s.split(".");
				sc+=k.length-1;
				for(i=0;i<w.length;i++)
				{
					cc+=w[i].length();
				}
		}
		input.close();
			
	}
	

	public void countS() 
	{
		int i,j;
		String delimitors="!,\"?:~ \n";
	//	String s;
		String w[];
		Boolean vowel;
		
		tk=new StringTokenizer(text,delimitors);
		w=new String[tk.countTokens()];
		wc+=tk.countTokens();
		for(i=0;i<w.length;i++)// constructing an array of words in the line
		{
			w[i]=tk.nextToken();
		}
		for(i=0;i<w.length;i++)//Syllable counter
		{
			int diff=syc;
			vowel=false;
			for(j=0;j<w[i].length();j++)
			{
				if(!vowel&&(w[i].charAt(j)=='a'||w[i].charAt(j)=='e'||w[i].charAt(j)=='i'||w[i].charAt(j)=='o'||w[i].charAt(j)=='u'))
				{
					vowel=true;
					syc++;
				}
				
				else
				{
					
				
					if(!vowel&&(w[i].charAt(j)=='y'))
					{
						syc++;
					}
					
					if(!(w[i].charAt(j)=='a'||w[i].charAt(j)=='e'||w[i].charAt(j)=='i'||w[i].charAt(j)=='o'||w[i].charAt(j)=='u'))
					{
						vowel=false;
					}
				}
				
				
			}
			if(w[i].charAt(j-1)=='e'&&((w[i].charAt(j-2)=='h'||w[i].charAt(j-2)=='w')))
			{
				syc++;
			}
			else
			if(w[i].charAt(j-1)=='e')
			{
				syc--;
			}
			if(syc-diff>=3)
			{
				dwc++;
			}
			
			
			
			
		}
		
		
		wc+=tk.countTokens();//word counter
		
		for(i=0;i<w.length;i++)//character counter
		{
			cc+=w[i].length();
		}
		
		
		
		tk=new StringTokenizer(text,"!?.");
		w=new String[tk.countTokens()];
		sc+=tk.countTokens();//sentence counter
			
	}
	}



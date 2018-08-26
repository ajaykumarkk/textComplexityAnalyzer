
public class CountTrial 
{
	public static void main(String[] args)
	{
		String text="Existing computer programs that measure readability are based largely upon subroutines which estimate number of syllables, usually by counting vowels. The shortcoming in estimating syllables is that it necessitates keypunching the prose into the computer. There is no need to estimate syllables since word length in letters is a better predictor of readability than word length in syllables. Therefore, a newreadability formula was computed that has for its predictors letters per 100 words and sentences per 100 words. Both predictors can be counted by an optical scanning device, and thus the formula makes it economically feasible for an organization such as the U.S. Office of Education to calibrate the readability of all textbooks for the public school system.";
		Counting c=new Counting(text);
		
		System.out.println("Wc:"+c.wc+"  CC:"+c.cc+"  SC:"+c.sc+" SYC: "+c.syc);
		RScores r= new RScores();
		double d=r.CLI(text);
		System.out.println(d);
		
	}

}

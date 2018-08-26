import java.io.File;
import java.io.FileNotFoundException;


public class RScores 
{
	Counting c;
	File f;
	
	public RScores()
	{
		f=null;
		c=null;
	}
	
	public RScores(File ff)
	{
		f=ff;
		c=null;
	}
	public double FKS(String s)
	{
		double score;
		c=new Counting(s);
		score=0.39*(c.wc/c.sc)+11.8*(c.syc/c.wc)-15.59;
		
		return score;
	}
	
	public double FREase(String s)
	{
		double score;
		c=new Counting(s);
		score=206.835-1.015*(c.wc/c.sc)-84.6*(c.syc/c.wc);
		return score;
	}
	
	public double CLI(String s)
	{
		double score;
		c=new Counting(s);
		score=0.0588*((c.cc/c.wc)*100)-0.296*((c.sc/c.wc)*100)-15.8;
		return score;
	}
	
	public double GFI(String s)
	{
		double score;
		c=new Counting(s);
		score=0.4*((c.wc/c.sc)+100*(c.dwc/c.wc));
		return score;
	}
	
	public double SMOG(String s)
	{
		double score;
		c=new Counting(s);
		score=1.0430*Math.sqrt((c.dwc)*(30/c.sc))+3.1291;
		return score;
	}
	
	public double FKS() throws FileNotFoundException
	{
		double score;
		c=new Counting(f);
		score=0.39*(c.wc/c.sc)+11.8*(c.syc/c.wc)-15.59;
		
		return score;
	}
	
	public double FREase() throws FileNotFoundException
	{
		double score;
		c=new Counting(f);
		score=206.835-1.015*(c.wc/c.sc)-84.6*(c.syc/c.wc);
		return score;
	}
	
	public double CLI() throws FileNotFoundException
	{
		double score;
		c=new Counting(f);
		score=0.0588*((c.cc/c.wc)*100)-0.296*((c.sc/c.wc)*100)-15.8;
		return score;
	}
	
	public double GFI() throws FileNotFoundException
	{
		double score;
		c=new Counting(f);
		score=0.4*((c.wc/c.sc)+100*(c.dwc/c.wc));
		return score;
	}
	
	public double SMOG() throws FileNotFoundException
	{
		double score;
		c=new Counting(f);
		score=1.0430*Math.sqrt((c.dwc)*(30/c.sc))+3.1291;
		return score;
	}
}

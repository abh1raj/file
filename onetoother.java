import java.io.*;

public class onetoother
{
	public static void main(String[] args) throws IOException
	{
		FileReader r = null;
		FileWriter w = null;
		try
			{
				r=new FileReader("chitkara.txt");
				w = new FileWriter("acadview.txt");
				int c;
				while((c =r.read()) != -1)
				{
					w.write(c);
				}
			}
		
		finally
		{
			if(r != null)
				{
					r.close();
				}	
			if(w != null)
				{
					w.close();
				}
		}	
		
	}
}
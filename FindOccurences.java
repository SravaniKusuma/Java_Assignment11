import java.io.*;
import java.util.*;
class ReadWrite {
	
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	public void countOccurence(String fileName)
	{
		
		try
		{
			
			FileReader fr = new FileReader(fileName);
			int i;
			while((i=fr.read())!=-1)
			{
				char letter=(char)i;
				if(!Character.isWhitespace(letter))
				{
					if(map.containsKey(letter))
					{
						map.put(letter, map.get(letter)+1);
					}
					else
					{
						map.put(letter, 1);
					}

				}

			}
		         
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void writeData()
	{
		try
		{
			
			File file =new File("C:\\Users\\K.SRAVANI\\Desktop\\saveresults.txt");
			FileWriter fw =new FileWriter(file);
			fw.write(map.toString());
			fw.close();
        }
		catch(Exception e)
		{
			System.out.println(e);
		}    
		
	}
}

public class FindOccurences
{

	public static void main(String[] args) {
		String fileName;
		fileName=args[0];
		ReadWrite obj = new ReadWrite();
		obj.countOccurence(fileName);
		obj.writeData();

	}

}

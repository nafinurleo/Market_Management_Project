package fileio;
import java.lang.*;
import java.io.*;

public class FileReadWrite
{
	//To create a File
	private File file;
	//To write in a file
	private FileWriter writer;
	//To read from a file
	private FileReader reader;
	//To read file content
	private BufferedReader bfr;
	
	
	public void writeInFile(String s)
	{
		//Checked Exceptions
		try
		{
			file = new File("History.txt");	
			file.createNewFile();
			writer = new FileWriter(file, true);
			writer.write(s+"\r"+"\n");
			writer.flush();
			writer.close();	
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void readFromFile()
	{
		
		try
		{
			reader = new FileReader(file);	
			bfr = new BufferedReader(reader);
			String text="", temp;
			
			while((temp=bfr.readLine())!=null)
			{
				text=text+temp+"\n"+"\r";
			}
			
			//Print the whole string in console
			System.out.println(text); 
			reader.close();	
		}
		catch(IOException ioe) 
		{
			ioe.printStackTrace();
		}
	}
}
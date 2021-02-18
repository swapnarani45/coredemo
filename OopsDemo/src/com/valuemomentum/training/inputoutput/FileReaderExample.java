package com.valuemomentum.training.inputoutput;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderExample {

	public static void main(String[] args) {
		try {
			Reader reader=new FileReader("c:/demo/data.txt");
			int data=reader.read();//returns ASCII value of character
			while(data!=-1)
			{
				System.out.println((char)data);
				data=reader.read();
				
			}
			reader.close();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}

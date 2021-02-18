package com.valuemomentum.training.inputoutput;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClass {

	public static void main(String[] args) {
		File f =new File("c:/test/hello.txt");
		try {
			
			if(f.createNewFile())
			{
				System.out.println("new file is created");
			}
				else
				{
					System.out.println("file already exist");
				
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		;
		System.out.println("name of the file is:"+f.getName());
		System.out.println("name of the path is"+f.getPath());
		System.out.println("file last modified is"+ new Date(f.lastModified()));
		System.out.println("parent directory is"+f.getParent());
		System.out.println("size of the file is"+f.length()+"bytes");
		

	}

}

package com.IOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw=null;
		BufferedReader br=null;
		InputStreamReader isr;
		
		try
			{
			//if we does not return true then it overrride
			fw=new FileWriter("filewrite1.txt",true);
			
			//taking an input from console as system.in
			br=new BufferedReader(new InputStreamReader(System.in));
			String data;
			
			//reading data from console
			System.out.println("enter id");
			String id=br.readLine();
			System.out.println("enter name");
			String name=br.readLine();
			System.out.println("enter basic salary");
			String bsal=br.readLine();
			
			//write on file which is filewrite1.txt
			fw.write(id);
			fw.write("#");
			fw.write(name);
			fw.write("#");
			fw.write("#");
			fw.write(bsal);
			fw.write("\n");
			
				
			}
		 catch(Exception e){
			  e.printStackTrace();
		  }
		  finally {}
		  try {
			   fw.close();
			  br.close();
			  }
		  catch(IOException e) {
			  e.printStackTrace();
			}
		

	}

}

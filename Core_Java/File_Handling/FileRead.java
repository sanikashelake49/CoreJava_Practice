package com.IOStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//Read the file
		FileReader fr;;
		BufferedReader br;
		//String data="";
		
			try {
				//file given 
			     fr=new FileReader("hello.txt");
			     br=new BufferedReader(fr);
			     
			     //start to read data
			    String data=br.readLine();
			 
			    //if data is not empty
			     while(data!=null)
			     {
			    	 System.out.println(data);
			     
			    	 //going to next line
			        data=br.readLine();
			     }//data=br.readLine();
			     // br.close();
			      // fr.close();
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
			    	 e.printStackTrace();
			     
		}
	}

}

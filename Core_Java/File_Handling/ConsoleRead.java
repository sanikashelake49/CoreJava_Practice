package com.IOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		FileWriter fw=null;
		BufferedReader br;
		InputStreamReader isr;
		
		
		try {
			//String data;
			fw=new FileWriter("filewrite1.txt",true);
			//fr=new FileReader("filewrite1.txt");
			br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("enter id");
			String id=br.readLine();
			System.out.println("enter name");
			String name=br.readLine();
			System.out.println("enter basic salary");
			String bsal=br.readLine();
			//fr=new FileReader("filewrite1.txt");
			
			//String data=br.readLine();
			
			fw.write(id);
			fw.write("\n");
			fw.write(name);
			fw.write("\n");
			fw.write(bsal);
			fw.write("\n");
			//String data;
			
			fr=new FileReader("filewrite1.txt");
			BufferedReader fr1 = new BufferedReader(new FileReader("filewrite1.txt"));

			String data=fr1.readLine();
			while(data!=null)
			{
			 System.out.println(data);
			 data=fr1.readLine();
			}
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
		try {
			fw.close();
			//br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		}

	}

}

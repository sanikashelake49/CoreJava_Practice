package com.IOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class TokeenizetheFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		id i1=new id();
		i1.getId();
		
		FileReader fr;
		BufferedReader br;
		StringTokenizer st;
		String cust_id;
		
		try {
		fr=new FileReader("filewrite1.txt");
		br=new BufferedReader(fr);
		String data=br.readLine();
		System.out.println("id"+"\t"+"name"+"\t"+"bsal");
		
		while(data!=null)
		{
			st=new StringTokenizer(data,"#");
			while(st.hasMoreElements())
			{
				String id=st.nextToken();
				String name=st.nextToken();
				String bsal=st.nextToken();
				System.out.println(id+"\t"+name+"\t"+bsal);
				
				cust_id =id;
				i1=new id(id);
				i1.id=id;
			}
			//System.out.println(id+"\t"+name+"\t"+bsal);
			data=br.readLine();
		}
		
		System.out.println("this is id "+i1.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
		

}
}
class id{
	String id;

	public id() {
		super();
		// TODO Auto-generated constructor stub
	}

	public id(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
}

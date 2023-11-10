package cottoncandy;

import cottoncandy.epubHandler.Reader;

public class Main {
	
	public static void main(String[] args) throws Exception{
		Reader epubReader=new Reader();
		System.out.println("Object created Successfully");
		
		System.out.println(epubReader.getAuthorName());
	}

}

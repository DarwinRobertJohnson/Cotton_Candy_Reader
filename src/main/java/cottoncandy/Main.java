package cottoncandy;

import cottoncandy.epubHandler.Reader;
import nl.siegmann.epublib.domain.Resource;
import nl.siegmann.epublib.domain.TOCReference;

public class Main{
	
	public static void main(String[] args) throws Exception{
		Reader epubReader=new Reader();
		System.out.println("Object created Successfully");
		
		//System.out.println(epubReader.getAuthorName());

		for(TOCReference r:epubReader.getTableOfContents().getTocReferences()) {
			System.out.println(r);
		}
	}

}

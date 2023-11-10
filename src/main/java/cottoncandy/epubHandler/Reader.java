package cottoncandy.epubHandler;

import java.io.FileInputStream;



import nl.siegmann.epublib.domain.Book;
import nl.siegmann.epublib.domain.Metadata;
import nl.siegmann.epublib.epub.EpubReader;

public class Reader {
	
	EpubReader read;
	Book currentBook;
	Metadata bookMetaData;
	
	
	public Reader() throws Exception{
		read= new EpubReader();
		currentBook=read.readEpub(new FileInputStream("/home/darwin/Downloads/BoG1"));
		bookMetaData=currentBook.getMetadata();
	}
	
	public String getAuthorName() {
		return bookMetaData.getFirstTitle();
	}
}

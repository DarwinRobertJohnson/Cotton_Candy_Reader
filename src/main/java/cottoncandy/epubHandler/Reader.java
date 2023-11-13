package cottoncandy.epubHandler;


import java.io.FileInputStream;

import nl.siegmann.epublib.domain.Book;
import nl.siegmann.epublib.domain.Metadata;
import nl.siegmann.epublib.domain.TableOfContents;
import nl.siegmann.epublib.epub.EpubReader;

public class Reader {
	
	EpubReader read;
	Book currentBook;
	Metadata bookMetaData;
	TableOfContents ToC;
	
	public Reader() throws Exception{
		read= new EpubReader();
		currentBook=read.readEpub(new FileInputStream("D:\\Books\\Battle Through The Heavens\\Battle Through the Heavens 1-100.epub"));
		bookMetaData=currentBook.getMetadata();
	}
	
	public String getAuthorName() {
		return bookMetaData.getFirstTitle();
	}
	
	public TableOfContents getTableOfContents() {
		return currentBook.getTableOfContents();
	}
}

package com.NLP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.parser.ParserModel;

public class ParserAbhi {

	public static void main(String args[]) throws FileNotFoundException
	{
		InputStream modelIn = new FileInputStream("en-parser-chunking.bin");
		try {
		  ParserModel model = new ParserModel(modelIn);
		}
		catch (IOException e) {
		  e.printStackTrace();
		}
		finally {
		  if (modelIn != null) {
		    try {
		      modelIn.close();
		    }
		    catch (IOException e) {
		    }
		  }
		}
	}
	
	
	
}

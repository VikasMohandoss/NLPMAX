package com.NLP;


import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.process.CoreLabelTokenFactory;
import edu.stanford.nlp.process.DocumentPreprocessor;
import edu.stanford.nlp.process.PTBTokenizer;

public class NLPTokenizer {

  public static void main(String[] args) throws IOException {
    
	  
	  String input = "Test string i got for tokenization";
	 // for (String arg : args) {
      // option #1: By sentence.
      DocumentPreprocessor dp = new DocumentPreprocessor(input);
      for (List sentence : dp) {
        System.out.println(sentence);
      }
      // option #2: By token
      PTBTokenizer ptbt = new PTBTokenizer(new FileReader(input),
              new CoreLabelTokenFactory(), "");
      for (CoreLabel label; ptbt.hasNext(); ) {
        label = (CoreLabel) ptbt.next();
        System.out.println(label);
      }
    }
  //}
}
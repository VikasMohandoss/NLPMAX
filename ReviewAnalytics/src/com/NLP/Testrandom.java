package com.NLP;

import edu.stanford.nlp.trees.*;
import edu.stanford.nlp.parser.lexparser.*;
import edu.stanford.nlp.process.*;
import com.chaoticity.dependensee.*;

import java.util.*;
import java.io.*;

class Testrandom {
   public static void main(String []args) throws Exception {
      String text = "A quick brown fox jumped over the lazy dog.";
      TreebankLanguagePack tlp = new PennTreebankLanguagePack();
      GrammaticalStructureFactory gsf = tlp.grammaticalStructureFactory();
      LexicalizedParser lp = new LexicalizedParser("englishPCFG.ser.gz");
      lp.setOptionFlags(new String[]{"-maxLength", "500", "-retainTmpSubcategories"});
      Tree tree = lp.apply("Hello World!");
      Main.writeImage(tree, "image.png");
   }
}
package com.NLP;

import java.io.*;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.util.InvalidFormatException;



public class SentenceDetect {

	public static void main(String args[]) throws InvalidFormatException,IOException {
		//String paragraph = "Hi All, This is my second review after LG G2. Friends first of all no phone is perfect. I have tried 3 good phones in a month and trust me I switched back to one of phone which I used during the month. I am always a fan of LG . I like LG UI and phones . Now a days we can see people are using Samsung mobile phones so it’s an automatic perception that Samsung phones are good as most of the people are using. My friend told me to go for Note 2 but being a fan of LG G2 and recently I have a hands on LG G2 So I planned to Buy LG G2. Trust me It’s a very good phone with Graphics , UI , Remote , Gaming experience also a good battery life with 10 hours of heavy usage. I used to travel from Ghaziabad to Gurgaon which is almost 2 hours journey and during that time I use to play games , chat , talk etc ….. The very Bad experience with G2 was it lags , every time I have to used task killer or clean application to free memory and ram . Since I used iPhone with IOS 6 for an one year so compare to iPhone and a normal user this phone lags during opening , call connecting , call pick .. it’s not as smooth as I was expecting from this phone … The lags are too high if it’s one time in a day then I would never have been changed this phone but it lags a lot. So I tried another phone which is called smartphone of the year HTC ONE. Trust me this was the phone which fulfill my topmost requirement . I used for 10 days with heavy games and usage . trust me this phone never lags however the HTC sense automatically manage the CPU and RAM . I do not need to install third party to clean CPU and RAM. This is the one of the phone which competes my old iPhone. Thanks HTC for making a fabulous UI and performance. The camera is good not better but having lots of good feature. I should also talks about the beat audio . Boss this rocks everyone in my team used to listen music on my phone . Awsonw sound with bass and tweeter . It remember the old Sony handsets in 2006 having good sounds. No phone is in the market which can beat HTC sound and performance . But as I told not everything is perfect . This phone bigger drawback is battery drain issue . It last for 6 to 8 hours max usage but if you are listening songs only then it will last for a day . I have to charge twice in a day to use the phone . Just because of battery drain issue I switched to another phone Note 2. The decision was tough as I never want to be part of Samsung family because of ugly UI but I purchased this phone from flipkart. This was my biggest mistake which I regret always. Note 2 no doubt a good phone with lot of features , excellent battery backup ( HTC one : Note 2) ( 70:100) ration , Excellent camera. But but but it lags badly as soon as you started downloading the apps into the phone if there are less apps then this phone will work amazing but my dear friends you spend 30 K on phone so at least you except fair performance. The Samsung UI is ugly , Lags during the call, opening contacts it lags for a friction of seconds . connecting a call is difficult , hangs while picking up the call…Hangs with heavy games . It was very embarrassing movement that you are in a public and you are unable to pick a phone as it stucks\\ lags … Trust me my friends. My colleagues don’t started believing me but I showed them the problem . They are formatted my phone as per their process but even though it lags. The user experience which I have receive from HTC one an android phone was unbelievable. So I sold this phone and switch back to HTC one once again. For battery issue I have everyday power bank which helps me a lot . During 18 hours of journey I switched off my data service and this phone give me backup of complete 1.5 days I bought this phone after reading reviews on flipkart which helped to make wrong decision so friends request all of you if any phone having any single issue then please share your views. For you it may be hardly matters but for others it matters a lot. Regards Ramesh Yadav";
		
		String paragraph = "Hi. How are you? Wassup. This is Abhinav. I'm testing NLP lib";
		
		// always start with a model, a model is learned from training data
		InputStream is = new FileInputStream("en-sent.bin");
		SentenceModel model = new SentenceModel(is);
		SentenceDetectorME sdetector = new SentenceDetectorME(model);

		String sentences[] = sdetector.sentDetect(paragraph);

		System.out.println(sentences[0]);
		System.out.println(sentences[1]);
		is.close();
	}
	
}

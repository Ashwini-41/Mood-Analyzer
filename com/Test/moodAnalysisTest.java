package com.Test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.program.MoodAnalyzerException;
import com.program.moodAnalysis;

class moodAnalysisTest {

	@Test
	void test() throws MoodAnalyzerException  {
		moodAnalysis obj = new moodAnalysis("I am in Sad mood");
		String ans = obj.mood();
		assertEquals("SAD",ans);
		
	}
	
	@Test
	void moodTest() throws MoodAnalyzerException{
		moodAnalysis obj = new moodAnalysis("I am in Happy mood");
		String res = obj.mood();
		assertEquals("HAPPY",res);
		
	}
	
	@Test 
	void moodNullTest(){
		
		try {
		moodAnalysis obj = new moodAnalysis(null);
		String res = obj.mood();
		assertEquals("HAPPY",res);	
		}catch(MoodAnalyzerException e) {
			System.out.println(e.getMessage());
		
		}
	}

}

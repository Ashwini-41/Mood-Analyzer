package com.Test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.program.moodAnalysis;

class moodAnalysisTest {

	@Test
	void test() {
		moodAnalysis obj = new moodAnalysis("I am in Sad mood");
		String ans = obj.mood();
		assertEquals("SAD",ans);
		
	}
	
	@Test
	void moodTest() {
		moodAnalysis obj = new moodAnalysis("I am in Happy mood");
		String res = obj.mood();
		assertEquals("HAPPY",res);
		
	}
	
	@Test 
	void moodNullTest() {
		
		moodAnalysis obj = new moodAnalysis(null);
		String res = obj.mood();
		assertEquals("HAPPY",res);	
	}

}

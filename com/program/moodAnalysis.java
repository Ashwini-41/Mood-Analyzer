package com.program;

public class moodAnalysis {
	public String msg;
	
	public moodAnalysis(String msg) {
		this.msg = msg;
	}
	
	
	
	public String mood() {
		
		if(msg.contains("Sad")) {
		    return "SAD";
		}else {
			return "HAPPY";
		}
	}

	

}

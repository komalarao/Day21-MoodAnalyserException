package com.bridgelabz.moodAnalyserException.moodAnalyser;

public class MoodAnalyser {
	public String moodAnalyser(String message) {
		if (message.contains("Sad"))
			return "SAD";
		else
		return "HAPPY";
	}
}

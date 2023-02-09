package com.bridgelabz.moodAnalyserException.moodAnalyser;

public class MoodAnalyser {
	private String message;

	public String moodAnalyser(String message) {
		this.message = message;
		if (message.contains("Sad"))
			return "SAD";
		else
			return "SAD";
	}
}

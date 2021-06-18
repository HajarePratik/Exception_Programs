package com.moodanlyzer.mood_anlyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnlyzerTest 
{

	// TC 1.1 To analyse and respond sad mood
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() 
	{
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			String mood = moodAnalyser.analysemood("I am in Sad Mood");
			Assert.assertEquals("SAD", mood);
	}

	// TC 1.2 To analyse and respond happy mood
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy()
	{
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			String mood = moodAnalyser.analysemood("I am in Happy Mood");
			Assert.assertEquals("HAPPY", mood);
	}

}

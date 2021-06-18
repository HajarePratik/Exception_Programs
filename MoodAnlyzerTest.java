package com.moodanlyzer.mood_anlyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnlyzerTest 
{

	// TC 2.1 To analyse and respond sad mood
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() 
	{
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
			String mood = moodAnalyser.analysemood();
			Assert.assertEquals("SAD", mood);
	}

	// TC 2.1 To analyse and respond happy mood
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy()
	{
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
			String mood = moodAnalyser.analysemood();
			Assert.assertEquals("HAPPY", mood);
	}

}

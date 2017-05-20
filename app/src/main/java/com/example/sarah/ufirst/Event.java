package com.example.sarah.ufirst;
import android.support.v7.app.AppCompatActivity;

public class Event extends AppCompatActivity{
	//compareto method will compare by dates returning the earliest.
	
	//Date Format yyyymmdd
	private int date;
	private String eventName;
	private String[] words;
	
	//constructor
	
	public void Event(String eventName, int y, int m, int d){
		this.date = y*10*10*10*10;
		this.date += m*10*10;
		this.date+= d;
		
		this.eventName = eventName;
		
		//this.words = parseEventName(eventName);
	}
	/*
	public String[] parseEventName(String name){
		return keywords;
		
	}*/
	
	
}

import java.util.*;
public class Event {
	//compareto method will compare by dates returning the earliest.
	
	//Date Format yyyymmdd
	private int date;
	private String eventName;
	private String[] words;
	
	//constructor
	
	public Event(String eventName, int y, int m, int d){
		this.date = y*10*10*10*10;
		this.date += m*10*10;
		this.date+= d;
		
		this.eventName = eventName;
		
		this.words = parseEventName(eventName);
	}
	
	public String[] parseEventName(String name){
		return keywords;
		
	}
	
	public
	
	
}

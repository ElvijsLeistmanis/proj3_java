package model;

import java.time.LocalDateTime;

public class Post {
	//1. mainigie
	private String msg;
	private LocalDateTime datetime = LocalDateTime.now();
	private int countOfLikes = 0;//TODO parveidot uz sarakstu ar registretiem lietotjamiem, kas bus atzimejusi patik
	//2.getter
	public String getMsg() {
		return msg;
	}
	
	public LocalDateTime getDatetime() {
		return datetime;
	}
	
	public int getCountOfLikes() {
		return countOfLikes;
	}
	//3.setter
	public void setMsg(String inputMsg) {
		if((inputMsg != null) && (!inputMsg.isEmpty()) && (inputMsg.length() < 1000))
		{
			msg = inputMsg;
		}
		else
		{
			msg = "Unknown post";
		}
	}

	public void setDatetime() {
		datetime = LocalDateTime.now();
	}

	public void incrementCountOfLikes() {
		countOfLikes++;
	}
	
	
	//4 abi konstruktori
	public Post() {
		setMsg("Sveiciens!");
		//ta ka datetime mainigais ir inicializets ar datetime = LocalDateTime.now(), tad nevajag izsaukt set funkciju
		//ta ka countOfLikes mainigais ir inicializets uz 0, tad seit nevajg set funkciju izsaukt
	}
	
	public Post(String inputMsg) {
		setMsg(inputMsg);
		//ta ka datetime mainigais ir inicializets ar datetime = LocalDateTime.now(), tad nevajag izsaukt set funkciju
		//ta ka countOfLikes mainigais ir inicializets uz 0, tad seit nevajg set funkciju izsaukt

	}
	
	//5.toString
	public String toString() {
		String result = msg + " (" + datetime + "), " + countOfLikes + " patik iezimes";
		return result;
	}
	
	
	//6.citas funkcijas (pec nepieciesamibas)

}

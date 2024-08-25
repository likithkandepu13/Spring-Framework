package com.klu.JFSDS25_NPDList;

import java.util.Map;

public class Question 
{
	private int qid;
	private String ques;
	private Map<String, String> answers;
	// Set<String> answers; //list
	// private Map<String, String> answers; // Map to hold question-answer pairs
	public Question( int qid,String ques, Map<String, String> answers) //Set<String> answers; //list
	//private Map<String, String> answer;
	{
		this.answers=answers;
		this.qid=qid;
		this.ques=ques;
	}
	public void display() {
		System.out.println("answers:"+answers);
	}
	

}

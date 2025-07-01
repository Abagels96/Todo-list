package com.abigail.todolist;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EditTask {
	
public void  selectTasks(List<Task>newTasks) {
		
		System.out.println("Which task would you like to change?");
		Scanner scanner= new Scanner(System.in);
		String input= scanner.nextLine();
		//this loop is irritating me. It constantly goes back to 'when does that task start' 
		for(Task task:newTasks) {
			if(task.getNameOfTask().equalsIgnoreCase(input)) {
				
				 System.out.println(task.toString());
				 System.out.println("What do you want to change about this task?");
				 
				 Integer index= newTasks.indexOf(task);
				 editTasks(newTasks,index);
			}

			
		}
		
			
			
	
		 
			 
		 }
		
		
	




public void editTasks(List<Task> newTasks,Integer index) {
	
	
	
	Scanner scanner= new Scanner(System.in);
	String input2=scanner.nextLine();
	Task selectedTask= newTasks.get(index);
	if (input2.endsWith("name")){
		
		System.out.println( selectedTask.getNameOfTask());
		System.out.println("What would you like to rename this?");
		String newName=scanner.nextLine();
		 selectedTask.setNameOfTask(newName);
		 System.out.println(selectedTask.getNameOfTask());
		 returnToTasks(newTasks);
	 
	 }
	else if(input2.endsWith("start")) {
		System.out.println( selectedTask.getStartDate());
		System.out.println("When does this task start?");
		
		String newStartDate=scanner.nextLine();
		LocalDate parsedStartDate= LocalDate.parse(newStartDate);
		 selectedTask.setStartDate(parsedStartDate);
		 System.out.println(selectedTask.getStartDate());
		 returnToTasks(newTasks);
		 
}
	else if(input2.endsWith("end")) {
		System.out.println( selectedTask.getDateOfCompletion());
		System.out.println("When does this task end?");
		
		String newEndDate=scanner.nextLine();
		LocalDate parsedEndDate= LocalDate.parse(newEndDate);
		selectedTask.setDateOfCompletion(parsedEndDate);
		System.out.println(selectedTask.getDateOfCompletion());
		
		returnToTasks(newTasks);
	}
	else if(input2.endsWith("frequency")) {
		System.out.println( selectedTask.getFrequency());
		System.out.println("How often does this task need done?");
		
		String newFrequency=scanner.nextLine();
		Frequency.// don't know what to do here I am trying to convert an enum into a string. The class has ignoreCase
		//which is annoying that I didn't know that before. It would have saved me a lot of hassle. 
		selectedTask.setFrequency(newFrequency);
		System.out.println(selectedTask.getDateOfCompletion());
		
		returnToTasks(newTasks);
	}
}
public void returnToTasks(List<Task> newTasks) {
	
	
	System.out.println("Would you like to change anything else?");
	
	Scanner scanner= new Scanner(System.in);
	String loop= scanner.nextLine();
	if( loop.contains("Yes")) {
		selectTasks(newTasks);	
	}
	else{System.out.println("No more changes, heading back to the main menu");
	selectTasks(newTasks);
	}
	
}}



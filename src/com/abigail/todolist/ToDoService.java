
package com.abigail.todolist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class ToDoService {
	Task task = new Task();

	List<Task> newTasks = new ArrayList<>();

	public void menu() {
		System.out.println(
				"What would you like to do today? A. View current list of tasks  B. Create new task C. View Completed tasks E. Edit tasks Q.  Quit this program");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if (input.equalsIgnoreCase("a"))
		{if(newTasks.isEmpty()) {System.out.println("There are no tasks here");
		menu();}
		else {
			viewTasks(newTasks);}
			
		} else if (input.equalsIgnoreCase("b")) {
			
			System.out.println("Add as many tasks as you like. Type done in the name of  task when finished");
			
			addTask();
		} else if (input.equalsIgnoreCase("C")) {
			completedTasks(newTasks);
		} else if(input.equalsIgnoreCase("E")){
			if(newTasks.isEmpty()) {System.out.println("There are no tasks to edit");
			menu();}
			else {editTasks(newTasks);}
		}
		else if (input.equalsIgnoreCase("Q")) {

			System.exit(0);
			scanner.close();
		}

		else {
			System.out.println("Invalid input");
			menu();}
	}


	public void editTasks(List<Task>newTasks) {
		
		System.out.println("Which task would you like to change?");
		Scanner scanner= new Scanner(System.in);
		String input= scanner.nextLine();
	boolean	isFound=false;
		 for(String task:newTasks.get(0)
		
		
		scanner.close();
	}


	public void viewTasks(List<Task> newTasks) {
		Scanner scanner= new Scanner(System.in);
		for(Task task:newTasks) {
			System.out.println(task.toString());
			System.out.println("Did you do this task? Y/N");
			String input= scanner.nextLine();
			if(input.equalsIgnoreCase("Y")) {
				task.setCompletedToday(true);
			}
			else if(input.equalsIgnoreCase("N")) {
				task.setCompletedToday(false);
			}
			System.out.println(task.getCompletedToday());
		}
menu();
	}

	public void addTask() {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("What is the name of the task?");
		String name = scanner1.nextLine();
		if(name.equalsIgnoreCase("done")) {
			System.out.println("Bye bye now y'all");
			menu();
			
		}
		
		
		System.out.println("When does that task start? Enter in the format yyy-mm-dd");
LocalDate startDate= LocalDate.parse(scanner1.nextLine());

if(startDate.isBefore(LocalDate.now())) {
	System.out.println("Date before current date, incorrect entry. Please try again");
	addTask();
}


System.out.println("When does that task end?");
LocalDate endDate= LocalDate.parse(scanner1.nextLine());
if(endDate.isBefore(startDate)) {
	System.out.println("Not a valid date. Enter a date before the start date");
	addTask();
	
}
		System.out.println("How often do you need to perform this task? (HOURLY, DAILY,WEEKLY, OR MONTHLY?)");
		String frequencyType = scanner1.nextLine();

		Frequency strFrequency = Frequency.valueOf(frequencyType);
		Task task1= new Task(name,startDate,endDate,strFrequency);

		
		newTasks.add(task1);
		
	addTask();
// it launches into displaying the tasks, runs that if loop but then goes back to adding them I need to have these tasks separated. it also 
		//has the wrong value for the setCompletedToday. when I said y then it was false 
		// How do i incorporate enums into this-I just need to make sure it is not case sensitive 
	 
	}

	public void completedTasks(List<Task>newTasks) {
		
		for(Task tasks:newTasks) {
			System.out.println(tasks);
		}
		
		List<String> checkedOff= newTasks.stream()
				.filter(task-> task.getCompletedToday())
				.map(task->task.getNameOfTask())
				.collect(Collectors.toList());
		
		System.out.println(checkedOff);		                    
		menu();
		
	}
	
	public void notifyAboutTasks(List<Task>newTasks) {
		// how do I schedule notifications but then how do I receive the notifications 
	}
}

// completing an task each day
//How do I set reminders that pop up that is going to be hard 
// how do i store this in a database
// Can I handle different users???
// we need a way to add attributes-Create new object of task done 
// we also need a way to see the task- Read I see it but I would like it in a table 
// need a way to edit the task's attributes- Update
// get rid of task once it is done and then put it with the completed tasks- Delete
// I would also like to add notifications and the ability of the app to keep
// track of how many days in a row that the user has completed the task
//Could we add long-term goals and tasks 

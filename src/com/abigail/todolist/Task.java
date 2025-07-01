package com.abigail.todolist;

import java.time.LocalDate;
import java.time.YearMonth;

public class Task {
	private String nameOfTask;
	private LocalDate dateOfCompletion;
	private Frequency frequency;
	private Integer streak;
	private LocalDate startDate;
	private boolean isCompletedToday;
	
	
	
	@Override
	public String toString() {
		return "Task Name, " + nameOfTask + ", When does this task start?," + startDate+ ", When does this task end?" + dateOfCompletion + " How often do you need this task done," + frequency
				+ ", streak=" + streak   + "done today"+isCompletedToday+ "]";
	}

	public Task() {
		
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public String getNameOfTask() {
		return nameOfTask;
	}
	public void setNameOfTask(String nameOfTask) {
		this.nameOfTask = nameOfTask;
	}
	public Task(String nameOfTask, LocalDate startDate, LocalDate dateOfCompletion ,Frequency frequency
			) {
		super();
		this.nameOfTask = nameOfTask;
		this.dateOfCompletion = dateOfCompletion;
		this.frequency = frequency;
		this.startDate = startDate;
	}
	public LocalDate getDateOfCompletion() {
		return dateOfCompletion;
	}
	public void setDateOfCompletion(LocalDate dateOfCompletion) {
		this.dateOfCompletion = dateOfCompletion;
	}
	public Frequency getFrequency() {
		return frequency;
	}
	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}
	public Integer getStreak() {
		return streak;
	}
	public void setStreak(Integer streak) {
		this.streak = streak;
	}

	public boolean getCompletedToday() {
		return isCompletedToday;
	}

	public void setCompletedToday(boolean isCompletedToday) {
		this.isCompletedToday = isCompletedToday;
	}
	
	
	

}

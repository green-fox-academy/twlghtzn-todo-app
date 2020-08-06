package cltodoapp;

import java.util.List;

public class Task {
  List<Task> tasks;
  String description;
  boolean isDone;

  public Task(String description, boolean isDone) {
    this.description = description;
    this.isDone = isDone;
  }

  public Task(String description) {
    this.description = description;
    this.isDone = false;
  }

  public void addNewTask(String description) {
    tasks.add(new Task(description));
  }


}

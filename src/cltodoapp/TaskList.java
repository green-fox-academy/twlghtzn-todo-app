package cltodoapp;

import java.util.List;

public class TaskList {
  List<Task> tasks;

  public void listTasks() {
    for (Task task : tasks) {
      System.out.println(task.description);
    }
  }
}

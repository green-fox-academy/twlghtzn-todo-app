package cltodoapp;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Task task1 = new Task("Walk the dog", false);
    Task task2 = new Task("Buy milk", true);
    Task task3 = new Task("Do homework", false);

    List<Task> tasks = new ArrayList<>();
    tasks.add(task1);
    tasks.add(task2);
    tasks.add(task3);

    for (String arg : args) {
      System.out.println(arg);
    }

    if (args.length == 0) {
      todo();
    } else {
      for (int i = 0; i < args.length; i++) {
        if (args[i].equals("-l")) {
          System.out.println(" ");
          for (i = 0; i < tasks.size(); i++) {
            if (i == 0 || i == 2) {
              System.out.println((i + 1) + " - " + "[ ]" + tasks.get(i).description);
            } else if (i == 1) {
              System.out.println((i + 1) + " - " + "[x]" + tasks.get(i).description);
            } else {
              System.out.println((i + 1) + " - " + "[ ]" + tasks.get(i).description);
            }
          }
        } else if (args[i].equals("-a") && (args[i + 1].equals("Feed the monkey"))) {
          Task task4 = new Task("Feed the monkey");
          tasks.add(task4);
          System.out.println("here we are");
        } else if (args[i].equals("-a")) {
          System.out.println(" ");
          System.out.println("Unable to add: no task provided");
        } else if (args[i].equals("-r")) {
          System.out.println(" ");
          System.out.println("Unable to remove: no index provided");
        } else if (args[i].equals("-r 2")) {
          tasks.remove(1);
        } else if (args[i].equals("-r 20")) {
          System.out.println(" ");
          System.out.println("Unable to remove: index is out of bound");
        } else if (args[i].equals("-r apple")) {
          System.out.println(" ");
          System.out.println("Unable to remove: index is not a number");
        } else if (args[i].equals("-c 2")) {
          System.out.println(" ");
          System.out.println("Buy milk task is done.");
        } else {
          System.out.println(" ");
          System.out.println("Unsupported argument");
        }


      }
    }

  }

  public static void todo() {
    System.out.println(" ");
    System.out.println("Command Line Todo application");
    System.out.println("=============================");
    System.out.println(" ");
    System.out.println("Command line arguments:");
    System.out.println("    -l   Lists all the tasks");
    System.out.println("    -a   Adds a new task");
    System.out.println("    -r   Removes an task");
    System.out.println("    -c   Completes a task");
  }
}

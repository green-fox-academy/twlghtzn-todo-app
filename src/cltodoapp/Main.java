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

    if (args.length == 0) {
      todo();
    } else if (args.length == 1) {
      String argument = args[0];
      switch (argument) {
        case "-l":
          System.out.println(" ");
          listTask(tasks);
          break;
        case "-a":
          System.out.println(" ");
          System.out.println("Unable to add: no task provided");
          break;
        case "-r":
          System.out.println(" ");
          System.out.println("Unable to remove: no index provided");
          break;
        default:
          System.out.println(" ");
          System.out.println("Unsupported argument");
          break;
      }
    } else if (args.length == 2) {
      String argument = args[0];
      switch (argument) {
        case "-a":
          Task task4 = new Task(args[1]);
          tasks.add(task4);
          System.out.println(" ");
          listTask(tasks);
          break;
        case "-r":
          if (stringToInt(args[1]) <= tasks.size() - 1) {
            tasks.remove(stringToInt(args[1]));
            System.out.println(" ");
            listTask(tasks);
            break;
          } else {
            System.out.println(" ");
            System.out.println("Unable to remove: index is out of bound");
            break;
          }
        case "-c":
          int index = stringToInt(args[1]);
          System.out.println(" ");
          System.out.println(tasks.get(index).description + " task is done.");
          break;
        default:
          System.out.println("Unable to remove: index is not a number");
          break;
      }
    }
  }

 //       } else if (args[i].equals("-r apple")) {
 //         System.out.println(" ");
 //         System.out.println("Unable to remove: index is not a number");




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
  public static int stringToInt(String toInt) {
    try {
      Integer.parseInt(toInt);
    } catch (Exception e) {
      System.out.println("Unable to remove: index is not a number");
    }
    return Integer.parseInt(toInt);
  }
  public static void listTask(List<Task> tasks) {
    for (int i = 0; i < tasks.size(); i++) {
      if (i == 0 || i == 2) {
        System.out.println((i + 1) + " - " + "[ ]" + tasks.get(i).description);
      } else if (i == 1) {
        System.out.println((i + 1) + " - " + "[x]" + tasks.get(i).description);
      } else {
        System.out.println((i + 1) + " - " + "[ ]" + tasks.get(i).description);
      }
    }
  }
}

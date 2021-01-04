package ua.khpi.oop.riabov04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Helper {
  public static boolean flag;
  public static Scanner scan = new Scanner(System.in);
 
  public static void start(StringBuilder ln) {
    if(flag)
      System.out.println(" ");
    if(ln == null) {
      throw new NullPointerException("line is null");
    }
    clottingSpace(ln);
    ArrayList<StringBuilder> line = findArray(ln); 
     Task(line); 
  }

  static private ArrayList<StringBuilder> findArray(StringBuilder ln){
     
    ArrayList<StringBuilder> line = new ArrayList<StringBuilder>();
    ArrayList<Integer> IndexSpace = new ArrayList<Integer>();
    int length = ln.length();
    
    if(flag)
      System.out.println("Знаходження пропусків в рядку");
      
    for (int i = 0; i<length;i++) {
      if(ln.charAt(i)==' ')
      {
      if(flag)
        System.out.println("Знайдено пропуск в з індексом " + i);
      IndexSpace.add(i);
      }
    }
     
    if(IndexSpace.size() == 0) {
      line.add(new StringBuilder(ln));
    }
    else 
    {
      
    line.add(new StringBuilder(ln.substring(0, IndexSpace.get(0))));
    IndexSpace.add(length);
    for(int i=1;i<IndexSpace.size();i++) {
      
      if(ln.substring(IndexSpace.get(i-1)+1, IndexSpace.get(i))!="")
      {  
        line.add(new StringBuilder(ln.substring(IndexSpace.get(i-1)+1, IndexSpace.get(i))));
        if(flag)
          System.out.println("Знайдено слово " + ln.substring(IndexSpace.get(i-1)+1));
      }
    }
    }
    return line;
  }
  
  public static void Show(String str)
  {
    System.out.println(str);
  }
   
  public static void info_about_creater() {
    System.out.println("Автор - Рябов Олексій КІТ 119а");
    System.out.println("Індивідуальне завдання");
    System.out.println("Ввести декілька рядків. Розбити на дві групи: рядки, довжина яких менша за середню; рядки, довжина яких не менше середньої. Вивести рядки та їх довжину по групах.");
    System.out.println("Головний метод - 'start' ");
    System.out.println("Він викликає основні методи , потрібні для виконання завдання");
    System.out.println("str - рядок , що ввів користувач");
    System.out.println("arr - масив слів");
    
  }
  
  
  static private StringBuilder clottingSpace(StringBuilder line) {
    if(flag)
      System.out.println("Видалення зайвих пропусків");
    for(int i = 0; i< line.length()-1;i++)
    { 
      if(line.charAt(i)==' '&&line.charAt(i+1)==' ') {
        if(flag)
          System.out.println("Зайвий пропуск " + i+1);
        line.deleteCharAt(i+1);
        i--;
        
      }
    }
    if(line.charAt(line.length()-1)==' ')
      line.deleteCharAt(line.length()-1);
    if(line.charAt(0)==' ')
      line.deleteCharAt(0);
    System.out.println(line);
    return line;
  }
  
  
  static private void Task (ArrayList<StringBuilder> line)
  {
    int average_size = 0;
    for (StringBuilder stringBuilder : line) {
      if(flag)
        System.out.println("Розмір слова " + stringBuilder.toString() + " = " + stringBuilder.length() + " сумма розмірів слів = " + average_size);
      average_size += stringBuilder.length();
    }
    average_size /= line.size();
    System.out.println(" Words with more than average letters ");
    for (StringBuilder stringBuilder : line) {
      
      if(average_size < stringBuilder.length())
      {
        System.out.println("Word - " + stringBuilder.toString() + " count letter " + stringBuilder.length());
      }
    }
    System.out.println(" Words with less than average letters ");
      for (StringBuilder stringBuilder : line) {
      
      if(average_size > stringBuilder.length())
      {
        System.out.println("Word - " + stringBuilder.toString() + " count letter " + stringBuilder.length());
      }
      
    } 
    }
}
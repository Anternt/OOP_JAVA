package ua.khpi.oop.riabov03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Helper {
 
public static void start(StringBuilder ln) {
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
  for (int i = 0; i<length;i++) {
    if(ln.charAt(i)==' ')
    IndexSpace.add(i);
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
    line.add(new StringBuilder(ln.substring(IndexSpace.get(i-1)+1, IndexSpace.get(i))));
   }
  }
  return line;
}

  

static private StringBuilder clottingSpace(StringBuilder line) {
  
  for(int i = 0; i< line.length()-1;i++)
  { 
    if(line.charAt(i)==' '&&line.charAt(i+1)==' ') {
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
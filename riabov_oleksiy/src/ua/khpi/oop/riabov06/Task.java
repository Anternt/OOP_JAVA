package ua.khpi.oop.riabov06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task { 
 
   private static float mean = 0;
     public static void start(String ln) {
      if(ln == null) {
        throw new NullPointerException("line is null");
      }
      ln = clottingSpace(new StringBuilder(ln));
      ArrayList<String> line = findArray(ln);
      
      findmean(line);
      if(getMean() == 0) {
        throw new NullPointerException("Line have`t element or size of line element is zero");
      }
      printline(line);
    }

     static private ArrayList<String> findArray(String ln){
       ArrayList<String> line = new ArrayList<String>();
       StringBuilder strB = new StringBuilder();
       for(int i = 0; i < ln.length();i++ ) {
         
         if(ln.charAt(i)==' ') {
           line.add(strB.toString());
           strB = new StringBuilder();
         }
         else 
           strB.append(ln.charAt(i));
       }
       line.add(strB.toString());
       
    
       return line;
     }
     
     
    static private void findmean(ArrayList<String> line) {
      float m = 0;
      for(int i =0;i<line.size();i++)
      m+=line.get(i).length();
      setMean(m/line.size());
      return;
    }
      
    
    
    static private String clottingSpace(StringBuilder line) {
      
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
      return line.toString();
    }
    
    
    static private void printline(ArrayList<String> line) {
      
      System.out.println("Lines are greater than average: ");
      for(var n : line) {
        if((float)n.length() >= mean) {
          System.out.println(n+"\nLine lenght:" + n.length());
          
        }
      }
      System.out.println("Lines less than average: ");
      for(var n : line) {
        if((float) n.length() < mean) {
          System.out.println(n +"\nLine lenght:" + n.length());
          }
      }
    }
    
    public static float getMean() {
      return mean;
    }
    public static void setMean(float mean) {
      Task.mean = mean;
    }
    
  }

package ua.khpi.oop.riabov07;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
     
    RecruitmentAgency array[] = new RecruitmentAgency[3];
    array[0] = new RecruitmentAgency("ADA Company","разработка технологий для обработки текста","Стаж более 3х лет",4500,"Компьютерный инженер","3+ года","Высшее");
     
    array[1] = new RecruitmentAgency("BMW","Выпуск автомобилей","Стаж более 2х лет",5500,"Механик","2+ года","-");
   
    array[2] = new RecruitmentAgency("Агенство недвижимости","Купле-продажа жилой площади","Стаж не имеет значения",1500,"Менеджер","-","Высшее");
    
     
    for (RecruitmentAgency car : array) {
      car.Show();
      
    }
        
  }

}

package ua.khpi.oop.riabov07;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
     
    RecruitmentAgency array[] = new RecruitmentAgency[3];
    array[0] = new RecruitmentAgency("ADA Company","���������� ���������� ��� ��������� ������","���� ����� 3� ���",4500,"������������ �������","3+ ����","������");
     
    array[1] = new RecruitmentAgency("BMW","������ �����������","���� ����� 2� ���",5500,"�������","2+ ����","-");
   
    array[2] = new RecruitmentAgency("�������� ������������","�����-������� ����� �������","���� �� ����� ��������",1500,"��������","-","������");
    
     
    for (RecruitmentAgency car : array) {
      car.Show();
      
    }
        
  }

}

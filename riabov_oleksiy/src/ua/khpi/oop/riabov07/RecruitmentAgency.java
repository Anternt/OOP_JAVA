package ua.khpi.oop.riabov07;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class RecruitmentAgency {
    
    private String company_name;
    private String specialty;
    private String working_�onditions;
    private int payment; 
    private LinkedHashMap<String, String> requirements_for_a_specialist = new LinkedHashMap<String, String>();
     
     
    public void AddRequirements_for_a_specialist(String key, String value) {
      this.requirements_for_a_specialist.put(key, value);
    }
   

    public String toString_requirements_for_a_specialist() {
      int size = requirements_for_a_specialist.size();
      String string = requirements_for_a_specialist.entrySet().stream()
          .map(e -> e.getKey()+ "- " + e.getValue()+ "\n")
                  .collect(Collectors.joining()); 
      string+= " ";
       for (int i = 0; i < size-1; i++) {
         string += requirements_for_a_specialist.entrySet().stream()
              .map(e -> e.getKey()+ "- " + e.getValue()+ "\n")
                      .collect(Collectors.joining()); 
         string+= " ";
       }
      return string;
    }
    
     
      

    public RecruitmentAgency(String company_name, String specialty, String working_�onditions, int payment,
        String specialty_of_the_worker,String education, String experience) {
      super();
      this.company_name = company_name;
      this.specialty = specialty;
      this.working_�onditions = working_�onditions;
      this.payment = payment;
      this.requirements_for_a_specialist.put("������������� ", specialty_of_the_worker);
      this.requirements_for_a_specialist.put("����������� ", education);
      this.requirements_for_a_specialist.put("���� ", experience); 
    }


    public RecruitmentAgency() {
      super();
      // TODO Auto-generated constructor stub
    }

    public void Show()
     {
        System.out.println("�������� �������� - "+ company_name +"\r\n" + 
            "������������� �������� "+ specialty + "\r\n" + 
            "������� ������ " + working_�onditions +
            "\n�������� "+ payment + "\r\n" + 
            "������� � ��������� "+ toString_requirements_for_a_specialist() + "\r\n" );
       
     }
  }

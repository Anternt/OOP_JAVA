package ua.khpi.oop.riabov08;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class RecruitmentAgency {
	  
		private String company_name;
		private String specialty;
		private String working_ñonditions;
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
		
		 
		  

		public String getCompany_name() {
			return company_name;
		}


		public void setCompany_name(String company_name) {
			this.company_name = company_name;
		}


		public String getSpecialty() {
			return specialty;
		}


		public void setSpecialty(String specialty) {
			this.specialty = specialty;
		}


		public String getWorking_ñonditions() {
			return working_ñonditions;
		}


		public void setWorking_ñonditions(String working_ñonditions) {
			this.working_ñonditions = working_ñonditions;
		}


		public int getPayment() {
			return payment;
		}


		public void setPayment(int payment) {
			this.payment = payment;
		}


		public LinkedHashMap<String, String> getRequirements_for_a_specialist() {
			return requirements_for_a_specialist;
		}


		public void setRequirements_for_a_specialist(LinkedHashMap<String, String> requirements_for_a_specialist) {
			this.requirements_for_a_specialist = requirements_for_a_specialist;
		}


		public RecruitmentAgency(String company_name, String specialty, String working_ñonditions, int payment,
				LinkedHashMap<String, String> requirements_for_a_specialist) {
			super();
			this.company_name = company_name;
			this.specialty = specialty;
			this.working_ñonditions = working_ñonditions;
			this.payment = payment;
			this.requirements_for_a_specialist = requirements_for_a_specialist;
		}


		public RecruitmentAgency(String company_name, String specialty, String working_ñonditions, int payment,
				String specialty_of_the_worker,String education, String experience) {
			super();
			this.company_name = company_name;
			this.specialty = specialty;
			this.working_ñonditions = working_ñonditions;
			this.payment = payment;
			this.requirements_for_a_specialist.put("Ñïåöèàëüíîñòü ", specialty_of_the_worker);
			this.requirements_for_a_specialist.put("Îáğàçîâàíèå ", education);
			this.requirements_for_a_specialist.put("Ñòàæ ", experience); 
		}


		public RecruitmentAgency() {
			super();
			// TODO Auto-generated constructor stub
		}

		public void Show()
		 {
				System.out.println("Íàçâàíèå êîìïàíèè - "+ company_name +"\r\n" + 
						"Ñïåöèàëèçàöèÿ êîìïàíèè "+ specialty + "\r\n" + 
						"Óñëîâèÿ ğàáîòû " + working_ñonditions +
						"\nÇàğïëàòà "+ payment + "\r\n" + 
						"Óñëîâèÿ ê ğàáîòíèêó "+ toString_requirements_for_a_specialist() + "\r\n" );
			 
		 }
	}
 
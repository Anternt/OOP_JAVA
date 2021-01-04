package ua.khpi.oop.riabov08;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Container {
	 
	RecruitmentAgency array[] = new RecruitmentAgency[3]; 
	
	public void add()
	{ 
		int size = array.length;
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите название компании");
		String company_name = scan.nextLine();
		System.out.println("Введите специализацию данной компании");
		String specialty = scan.nextLine();
		System.out.println("Условия приема на работу");
		String working_сonditions =  scan.nextLine(); 
		System.out.println("Введите оплату за работу");
		int payment = scan.nextInt();
		System.out.println("Специальность работника");
		String specialty_of_the_worker = scan.nextLine(); 
		System.out.println("Стаж работника");
		String  education = scan.nextLine(); 
		System.out.println("Образование работника");
		String experience = scan.nextLine(); 
		RecruitmentAgency new_el = new RecruitmentAgency(company_name,specialty,working_сonditions,payment,specialty_of_the_worker,education,experience); 
		RecruitmentAgency new_arr[] = new RecruitmentAgency[++size];
		for(int i=0;i<size-1;i++)
		{
			new_arr[i]=array[i];
		}
		new_arr[size-1] = new_el;
		array = new_arr;
	}
	 
	public void remove()
	{
		int size = array.length;
		if(size!=0)
		{
			RecruitmentAgency new_arr[] = new RecruitmentAgency[--size];
			for(int i=0;i<size;i++)
			{
				new_arr[i]=array[i];
			}
			array = new_arr;
		}
		else
		{
			System.out.println("Ваш масив пуст, удалять  нечего");
		}
		
	}
	
	public void Show()
	{
		for (RecruitmentAgency carsShop : array) {
			carsShop.Show();
		}
	}
	
	
	}


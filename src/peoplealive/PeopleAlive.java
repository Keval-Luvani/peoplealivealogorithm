package peoplealive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeopleAlive {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
	    System.out.println("Enter the number of person");
		int people = scanner.nextInt();
	    ArrayList<PeopleData> peopleDataList = new ArrayList<>();
	    int maxPeopleAliveyear=0,max = 0;
	    
	    for(int i=0;i<people;i++) {
			PeopleData peopleData= new PeopleData();
			String dataString =  scanner.next();
			String[] dataArray =  dataString.split(",");
			peopleData.setBirthyear(Integer.parseInt(dataArray[0]));
			peopleData.setDeathyear(Integer.parseInt(dataArray[1]));
			peopleDataList.add(peopleData);
		}
		 Collections.sort(peopleDataList, new PeopleData.OrderByBirthYear());
		
		 for(int i=0;i<people;i++) {
			 int year = peopleDataList.get(i).getDeathyear();
			 int birth = 0;
			 for(int j=0;j<people;j++) {
				 if(peopleDataList.get(j).getBirthyear()<=year) {
					 birth++;
				 }
			 }
			 
			 if(max<=(birth-i)){
				 max=(birth-i);
				 maxPeopleAliveyear=year;
			 }
		 }
		 System.out.println(maxPeopleAliveyear);
	}
}

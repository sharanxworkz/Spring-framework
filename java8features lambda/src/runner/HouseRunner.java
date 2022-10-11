package runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.lambda.constant.OwningType;
import com.xworkz.lambda.constant.Type;
import com.xworkz.lambda.dto.HouseDTO;

public class HouseRunner {
	public static void main(String[] args) {
		Collection<HouseDTO> list = new ArrayList<HouseDTO>();
		HouseDTO dto = new HouseDTO(1, "SHARAN APARTMENT", "SHARAN", Type.APARTMENT, 5, true, OwningType.LEASE, 600.00D);

		HouseDTO dto1 = new HouseDTO(2, "KALYAN APARTMENT", "KALYAN", Type.INDIVIDUAL, 2, false, OwningType.RENT, 550.00D);

		HouseDTO dto2 = new HouseDTO(3, "ARPITHA APARTMENT", "ARPITHA", Type.VILLA, 6, true, OwningType.OWN, 800.00D);

		HouseDTO dto3 = new HouseDTO(4, "SACHIN APARTMENT", "SACHIN", Type.APARTMENT, 5, true, OwningType.RENT, 700.00D);

		HouseDTO dto4 = new HouseDTO(5, "HANUMANTH APARTMENT", "HANUMANTH", Type.APARTMENT, 4, true, OwningType.LEASE, 600.00D);

		HouseDTO dto5 = new HouseDTO(6, "CHANDRU APARTMENT", "CHANDRU", Type.VILLA, 3, true, OwningType.RENT, 550.00D);

		HouseDTO dto6 = new HouseDTO(7, "AMANA APARTMENT", "AMANA", Type.INDIVIDUAL, 7, false, OwningType.RENT, 650.00D);

		HouseDTO dto7 = new HouseDTO(8, "POORNI APARTMENT", "POORNI", Type.INDIVIDUAL, 4, true, OwningType.OWN, 700.00D);
		
		HouseDTO dto8 = new HouseDTO(9, "SANNIDHI APARTMENT", "SANNIDHI", Type.VILLA, 4, true, OwningType.LEASE, 600.00D);

		HouseDTO dto9 = new HouseDTO(10, "SUDHIR APARTMENT", "SUDHIR", Type.INDIVIDUAL, 7, true, OwningType.OWN, 550.00D);

		HouseDTO dto10 = new HouseDTO(11, "NANDAN APARTMENT", "NANDAN", Type.VILLA, 8, false, OwningType.LEASE, 900.00D);

		HouseDTO dto11 = new HouseDTO(12, "SHARATH APARTMENT", "SHARATH", Type.INDIVIDUAL, 9, true, OwningType.RENT, 1000.00D);

		HouseDTO dto12 = new HouseDTO(13, "DARSHAN APARTMENT", "DARSHAN", Type.INDIVIDUAL, 4, false, OwningType.LEASE, 900.00D);

		HouseDTO dto13 = new HouseDTO(14, "NANDYA APARTMENT", "NANDYA", Type.VILLA, 3, false, OwningType.RENT, 600.00D);

		HouseDTO dto14 = new HouseDTO(15, "ARJUN APARTMENT", "ARJUN", Type.INDIVIDUAL, 7, true, OwningType.RENT, 650.00D);

		HouseDTO dto15 = new HouseDTO(16, "SUDEEP APARTMENT", "SUDEEP", Type.VILLA, 4, true, OwningType.OWN, 700.00D);
		
		HouseDTO dto16 = new HouseDTO(17, "YASH APARTMENT", "YASH", Type.INDIVIDUAL, 4, false, OwningType.LEASE, 900.00D);

		HouseDTO dto17 = new HouseDTO(18, "CONOR APARTMENT", "CONOR", Type.VILLA, 3, false, OwningType.RENT, 600.00D);

		HouseDTO dto18 = new HouseDTO(19, "RONALDO APARTMENT", "RONALDO", Type.INDIVIDUAL, 7, true, OwningType.RENT, 650.00D);

		HouseDTO dto19 = new HouseDTO(20, "STEPHEN CURRY APARTMENT", "STEPHEN CURRY", Type.VILLA, 4, true, OwningType.OWN, 700.00D);
		
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		list.add(dto6);
		list.add(dto7);
		list.add(dto8);
		list.add(dto9);
		list.add(dto10);
		list.add(dto11);
		list.add(dto12);
		list.add(dto13);
		list.add(dto14);
		list.add(dto15);
		list.add(dto16);
		list.add(dto17);
		list.add(dto18);
		list.add(dto19);


		list.forEach((ref) -> System.out.println(ref));
		System.out.println("");
		list.stream().sorted((e1, e2) -> e1.getId().compareTo(e2.getId())).forEach((ref) -> System.out.println(ref));
		System.out.println("*******************");
		list.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).forEach((ref)->System.out.println(ref));
		System.out.println("*******************");
		list.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach((ref)->System.out.println(ref));
		System.out.println("*******************");
		list.stream().sorted((e1,e2)->e2.getType().getValue().compareTo(e1.getType().getValue())).forEach((ref)->System.out.println(ref));;
		System.out.println("*******************");
		list.stream().sorted((e1,e2)->e2.getSqFeet().compareTo(e1.getSqFeet())).forEach((ref)->System.out.println(ref));
		System.out.println("*******************");
		list.stream().filter((ref)->ref.getLoan()==false).sorted((e1,e2)->e2.getOwner().compareTo(e1.getOwner())).forEach((ref)->System.out.println(ref));;
		System.out.println("*******************");
		list.stream().filter((ref)->ref.getLoan()==true).sorted((e1,e2)->e2.getOwner().compareTo(e2.getOwner())).forEach((ref)->System.out.println(ref));;
		System.out.println("*******************");
		list.stream().filter((ref)->ref.getOwningType().getValue().equals("lease"))	.sorted((e1,e2)->e1.getOwningType().getValue().compareTo(e2.getOwningType().getValue())).forEach((ref)->System.out.println(ref));
		System.out.println("*******************");
		list.stream().filter((ref)->ref.getType().getValue().equals("apartment")).sorted((e1,e2)->e1.getType().getValue().compareTo(e2.getType().getValue())).forEach((ref)->System.out.println(ref));
		System.out.println("*******************");
		list.stream().filter((ref)->ref.getType().getValue().equals("villa")).sorted((e1,e2)->e1.getType().getValue().compareTo(e2.getType().getValue())).forEach((ref)->System.out.println(ref));
		System.out.println("*******************");
		list.stream().sorted((e1,e2)->{
		int m=e1.getType().getValue().compareTo(e2.getType().getValue());
		if(m==0) {
			return e1.getOwningType().getValue().compareTo(e2.getOwningType().getValue());
			
		}
		return m;
		}).forEach((ref)->System.out.println(ref));
		
		System.out.println("*******************");
		
		list.stream().sorted((e1,e2)->{
		int m=e1.getName().compareTo(e2.getName());
		if(m==0) {
			return e1.getId().compareTo(e2.getId());
			
		}
		return m;
			
		}).forEach((ref)->System.out.println(ref));
	}

}

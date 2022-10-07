package com.xworkz.metro;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworkz.metrodao.MetroDAO;
import com.xworkz.metrodao.MetroDAOImpl;
import com.xworkz.metroentity.MetroEntity;

public class MetroRunner {
	public static void main(String[] args) {
		MetroEntity entity = new MetroEntity("sharan", "bangalore", 4, "sharan", LocalDate.of(1997, 9, 16), "sharan",
				LocalDate.of(1997, 11, 24), LocalDateTime.now(), LocalDateTime.now());
		MetroEntity entity1 = new MetroEntity("arpita", "bangalore", 4, "sharan", LocalDate.of(1997, 9, 16), "sharan",
				LocalDate.of(1997, 11, 24), LocalDateTime.now(), LocalDateTime.now());
		MetroEntity entity2 = new MetroEntity("chandru", "bangalore", 4, "sharan", LocalDate.of(1997, 9, 16), "sharan",
				LocalDate.of(1997, 11, 24), LocalDateTime.now(), LocalDateTime.now());

		MetroDAO dao = new MetroDAOImpl();
		boolean save =dao.create(entity);
		System.out.println(save);

//		boolean save = dao.create(entity);
//		boolean save1 = dao.create(entity1);
//		boolean save2 = dao.create(entity2);
//		System.out.println(save);
//		System.out.println(save1);
//		System.out.println(save2);

	}

}

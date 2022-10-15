package com.xworkz.criminaldata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.criminaldata.dao.CriminalDAO;
import com.xworkz.criminaldata.dto.CriminaldataDTO;
@Service
public class CriminalDataServiceImpl implements CriminalDataService {
	
	@Autowired
	private CriminalDAO criminalDAO;

	

	@Override
	public boolean saveAndValidate(CriminaldataDTO criminaldataDTO) {
		System.out.println("created"+this.getClass().getSimpleName());
		System.out.println("criminaldataDAO"+criminalDAO.toString());
		criminalDAO.save(criminaldataDTO);
		return true;
	}

}

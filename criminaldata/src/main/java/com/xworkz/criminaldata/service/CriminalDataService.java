package com.xworkz.criminaldata.service;

import com.xworkz.criminaldata.dto.CriminaldataDTO;

public interface CriminalDataService {

	 boolean saveAndValidate(CriminaldataDTO criminaldataDTO);
}

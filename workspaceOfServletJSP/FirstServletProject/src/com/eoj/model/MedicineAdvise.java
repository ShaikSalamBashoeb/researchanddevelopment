package com.eoj.model;

import java.util.ArrayList;
import java.util.List;

public class MedicineAdvise {

	/**
	 * get the list of medicine names
	 * 
	 * @param symptom
	 * @return List<String>
	 */
	public List<String> getMedicine(String symptom) {
		
		/**
		 * create instance of arraylist
		 */
		List<String> listOfMedicine = new ArrayList<String>();
		
		if("Headache".equals(symptom)) {
			listOfMedicine.add("Crocin");
		} else {
			listOfMedicine.add("Anacin");
		}
		
		return listOfMedicine;
	}

}

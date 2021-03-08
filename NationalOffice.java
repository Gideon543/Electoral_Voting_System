package project1;

import java.util.ArrayList;

import java.util.HashMap;
//import java.util.Map.Entry;

public class NationalOffice  {
	private String name;
	ArrayList <RegionalOffice> regions  = new ArrayList <RegionalOffice> ();
	HashMap<String, Integer> NationalResults = new HashMap<String, Integer>();
	
	
	/**
	 * @param name
	 * @param regions
	 */
	public NationalOffice(String name, ArrayList<RegionalOffice> regions) {
		this.name = name;
		this.regions = regions;
	}



	public HashMap<String, Integer> collateResults(){
		//int count = 0;
		
			for(RegionalOffice reg: regions) {
				reg.RegionalResults.forEach((key, value) -> NationalResults.merge(key, value, (v1, v2) -> v1+v2));	
				
			}
			return NationalResults;
			
	}
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	


}

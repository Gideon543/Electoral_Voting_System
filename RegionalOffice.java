package project1;

import java.util.ArrayList;

import java.util.HashMap;


public class RegionalOffice {
	private int RegionalID;
	private String name;
	private String location;
	ArrayList <DistrictOffice> districts  = new ArrayList <DistrictOffice> ();
	HashMap<String, Integer> RegionalResults = new HashMap<String, Integer>();


	public RegionalOffice() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param regionalID
	 * @param name
	 */
	public RegionalOffice(int regionalID, String name, String location, ArrayList<DistrictOffice> districts) {
		RegionalID = regionalID;
		this.name = name;
		this.location = location;
		this.districts= districts;
	}

	


	/**
	 * @return the regionalID
	 */
	public int getRegionalID() {
		return RegionalID;
	}




	/**
	 * @param regionalID the regionalID to set
	 */
	public void setRegionalID(int regionalID) {
		RegionalID = regionalID;
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


	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}


	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}


	public HashMap<String, Integer> collateResults(){

		for(DistrictOffice dist: districts ) {
			//for(Entry<String, Integer> entry: poll.pollresults.entrySet()) 
			
				//districtResults.put(entry.getKey(), count+=entry.getValue());
			dist.districtResults.forEach((key, value) -> RegionalResults.merge(key, value, (v1, v2) -> v1+v2));
				
			
			
		}
				
				
			System.out.println(this.name);
			return RegionalResults;
	}
	


}

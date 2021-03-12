package project1;

import java.util.ArrayList;

import java.util.HashMap;


/**
 * Each Regional office is an office
 * Collates results from all district offices in a region
 * @author Precious Njeck, Gabriel Owusu, Gideon Bonsu
 *
 */
public class RegionalOffice extends Office{
	// stores all the districts in a given region
	static ArrayList <DistrictOffice> districts  = new ArrayList <DistrictOffice> ();
	// Stores the election results for a given region
	static HashMap<String, Integer> RegionalResults = new HashMap<String, Integer>();

	
	

	/**
	 * Constructor for regional office
	 * @param ID
	 * @param name
	 * @param location
	 */
	public RegionalOffice(int ID, String name, String location, ArrayList<DistrictOffice> districts) {
		super(ID, name, location);
		this.districts = districts;
	}



	/**
	 *Sums and returns results for each region
	 *@return RegionalResults
	 */
	public static HashMap<String, Integer> collateResults(){

		for(DistrictOffice dist: districts ) {

			dist.districtResults.forEach((key, value) -> RegionalResults.merge(key, value, (v1, v2) -> v1+v2));
		}

		return RegionalResults;
	}
	


}

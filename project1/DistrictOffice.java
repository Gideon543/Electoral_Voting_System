
package project1;

import java.util.ArrayList;


import java.util.HashMap;

/**
 * Each district office is an office
 * Collates results from all polling stations in a district
 * @author Precious Njeck, Gabriel Owusu, Gideon Bonsu
 * 
 */
public class DistrictOffice extends Office {
	// a list of all the polling stations in a given district
	static ArrayList <Pollingstation> districtPolls  = new ArrayList <Pollingstation> ();
	// a HashMap to store results in each district
	static HashMap<String, Integer> districtResults = new HashMap<>();
    
	
	/**
	 * DistrictOffice constructor
	 * @param ID
	 * @param name
	 * @param location
	 * @param districtpolls
	 */
	public DistrictOffice(int ID, String name, String location, ArrayList<Pollingstation> districtpolls) {
		super(ID, name, location);
		this.districtPolls = districtpolls;
	}

	
	/**
	 * Sums up all results per candidate in a given district
	 *@return districtResults
	 */
	public static HashMap<String, Integer> collateResults(){
		
		
		for(Pollingstation poll: districtPolls ) {

			poll.pollresults.forEach((key, value) -> districtResults.merge(key, value, (v1, v2) -> v1+v2));

		}
		
		return districtResults;

	}


	

	
	
	
	

}


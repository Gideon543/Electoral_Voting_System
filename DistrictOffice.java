/**
 * 
 */
package project1;

import java.util.ArrayList;


import java.util.HashMap;



/**
 * @author Precious
 *
 */
public class DistrictOffice {
	private int districtID;
	private String name;
	private String location;
	private int regionalID;
	ArrayList <Pollingstation> districtPolls  = new ArrayList <Pollingstation> ();
	//HashMap<String, Integer> districtResults = new HashMap<String, Integer>();
	
	HashMap<String, Integer> districtResults = new HashMap<>();
    
    

	/**
	 * 
	 */
	public DistrictOffice() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param districtID
	 * @param name
	 * @param regionalID
	 */
	public DistrictOffice(int districtID, String name, String location, ArrayList<Pollingstation> districtpolls) {
		this.districtID = districtID;
		this.name = name;
		this.location = location;
		this.districtPolls = districtpolls;
		
	}
	
	public HashMap<String, Integer> collateResults(){
		//int count = 0;
		
			for(Pollingstation poll: districtPolls ) {
				//for(Entry<String, Integer> entry: poll.pollresults.entrySet()) 
				
					//districtResults.put(entry.getKey(), count+=entry.getValue());
				
				poll.pollresults.forEach((key, value) -> districtResults.merge(key, value, (v1, v2) -> v1+v2));
					
				
				
			}
			System.out.println(this.name);
			return districtResults;
			
	}
	

	/**
	 * @return the districtID
	 */
	public int getDistrictID() {
		return districtID;
	}

	/**
	 * @param districtID the districtID to set
	 */
	public void setDistrictID(int districtID) {
		this.districtID = districtID;
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
	 * @return the regionalID
	 */
	public int getRegionalID() {
		return regionalID;
	}

	/**
	 * @param regionalID the regionalID to set
	 */
	public void setRegionalID(int regionalID) {
		this.regionalID = regionalID;
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
	
	

}
//candidate.name.getvalue()

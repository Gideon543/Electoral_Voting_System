package project1;

import java.util.ArrayList;

import java.util.HashMap;

/**
 * The national office is an office
 * Collates results from all regional offices in the nation
 * @author Precious Njeck, Gabriel Owusu, Gideon Bonsu
 *
 */
public class NationalOffice extends Office  {
	//stores all the regions in the nation
	static ArrayList <RegionalOffice> regions  = new ArrayList <RegionalOffice> ();
	//stores the election results
	private static HashMap<String, Integer> NationalResults = new HashMap<String, Integer>();


	/**
	 * National office constructor
	 * @param ID
	 * @param name
	 * @param location
	 */
	public NationalOffice(int ID, String name, String location, ArrayList <RegionalOffice> regions ) {
		super(ID, name, location);
		this.regions = regions;
	}


	public static HashMap<String, Integer> collateResults(){
		for(RegionalOffice reg: regions) {
			reg.RegionalResults.forEach((key, value) -> NationalResults.merge(key, value, (v1, v2) -> v1+v2));	

		}
		System.out.println(NationalOffice.getName());
		return NationalResults;

	}


	/**
	 * Gets the national results
	 * @return the nationalResults
	 */
	public HashMap<String, Integer> getNationalResults() {
		return NationalResults;
	}


}

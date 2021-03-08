/**
 * 
 */
package project1;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.LinkedHashMap;





/**
 * @author Precious
 *
 */
public class Pollingstation {
	private int pollID;
	private String name;
	private String location;
	private int districtID;
	
	private static boolean value2; // for hasRegistered voter
	private static boolean value3; // for hasRegistered Candidate
	 HashMap<String, Integer> pollresults = new HashMap<String, Integer>();
	
	 ArrayList <Integer> registeredVoters  = new ArrayList <Integer> ();
	static LinkedHashMap<String, String> candidates = new LinkedHashMap<String, String>();
	
	

	/**
	 * 
	 */
	public Pollingstation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param pollID
	 * @param name
	 */
	public Pollingstation(int pollID, String name, String location) {
		this.pollID = pollID;
		this.name = name;
		this.location= location;
		
		
		
		
	}
	public  boolean registerVoter(Voter voter) {
		if(voter.getAge()>=18 && voter.getNationality()== "Ghana") {
			
				registeredVoters.add(voter.getVoterID());
				value2 = true;
				
			
			return true;
		}
		else {
		System.out.println("Sorry! You are not eligible to register");
		value2 = false;
		return false;
		}
		
	}
	
	public boolean hasRegisteredVoter() {
		if(value2) return true;
		return false;
	}
	
	public boolean registerCandidate(Candidate candidate) {
		if(candidate.getAge()>=40 && candidate.getNationality()=="Ghana") {
			candidates.put(candidate.getPoliticalParty(), candidate.getName());
			pollresults.put(candidate.getName(),0);
			
			value3 = true;
			return true;
		}

		else {
			
			//hasRegistered() = false;
			value3 = false;
			return false;
		}
	}
	
	

	
	public boolean hasRegisteredCandidate() {
		if(value3) return true;
		return false;
	}
	
	public boolean vote(Candidate candidate, Voter voter) {
		if(verify(voter)) {
			if(voter.getHasVoted() == false) {
				int currentCount = pollresults.get(candidate.getName());
				currentCount++;
				
				pollresults.replace(candidate.getName(), currentCount);
				
				voter.setHasVoted(true);
				
				return true;
			}
			
		}
		
		return false;
	}
	// if(candidate.getname==pollresults.getkey)
	
	private boolean verify(Voter voter){
		if(registeredVoters.contains(voter.getVoterID())) {
			return true;
		}
		return false;
		
		
	}
	

	
	public HashMap<String, Integer> collateResults(ArrayList<Candidate> cands){

		System.out.println(this.name);
		return pollresults;
	}
	

	/**
	 * @return the pollID
	 */
	public int getPollID() {
		return pollID;
	}

	/**
	 * @param pollID the pollID to set
	 */
	public void setPollID(int pollID) {
		this.pollID = pollID;
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
	

	/**
	 * @param candidates the candidates to set
	 */
	public static void setCandidates(LinkedHashMap<String, String> candidates) {
		Pollingstation.candidates = candidates;
	}

	/**
	 * @return the candidates
	 */
	public static LinkedHashMap<String, String> getCandidates() {
		return candidates;
	}
	
	

}

/*
 * each district should have a list of poll ids
 * if your id is in that district, results from that poll are sent there
 * have a list for all the votes a candidate receives at every poll
 */

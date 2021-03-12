/**
 * 
 */
package project1;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.LinkedHashMap;





/**
 * Each Polling station is an office
 * Registration of candidates and voters as well as voting take place here
 * @author Precious Njeck, Gabriel Owusu, Gideon Bonsu
 *
 */
public class Pollingstation extends Office implements Eligible{
	
	private static boolean value1; // for hasRegisteredvoter
	private static boolean value2; // for hasRegisteredCandidate
	static HashMap<String, Integer> pollresults = new HashMap<String, Integer>();
	
	ArrayList <Integer> registeredVoterIDs  = new ArrayList <Integer> ();// stores all the IDs of voters
	private LinkedHashMap<String, Integer> voters = new LinkedHashMap<String, Integer>(); //stores voter information
	static LinkedHashMap<String, String> candidates = new LinkedHashMap<String, String>();//stores candidate information
	
	

	
	/**
	 * Constructor for polling station class
	 * @param ID
	 * @param name
	 * @param location
	 */
	public Pollingstation(int ID, String name, String location) {
		super(ID, name, location);
		
	}
	
	/**
	 * Registers eligible voters
	 *@param voter
	 *@return boolean  value
	 */
	public  boolean registerVoter(Voter voter) {
		if(voter.getAge()>=18 && voter.getNationality()== "Ghana") {
			
				registeredVoterIDs.add(voter.getVoterID());
				voters.put(voter.getName(), voter.getVoterID());
				value1 = true; //hasRegisteredVoter() = true
				
			
			return true;
		}
		else {
		value1 = false; //hasRegisteredVoter() = false
		return false;
		}
		
	}

	/**
	 * Check whether a voter has registered
	 *@return boolean value
	 */
	public boolean hasRegisteredVoter() {
		if(value1) return true;
		return false;
	}
	
	/**
	 * Registers eligible candidates to run for elections
	 *@param candidate
	 *@return boolean value
	 */
	public boolean registerCandidate(Candidate candidate) {
		if(candidate.getAge()>=40 && candidate.getNationality()=="Ghana") {
			candidates.put(candidate.getPoliticalParty(), candidate.getName());
			pollresults.put(candidate.getName(),0);
			
			value2 = true; //hasRegisteredCandidate() = true
			return true;
		}

		else {
			value2 = false; //hasRegisteredCandidate() = false
			return false;
		}
	}
	
	
	/**
	 * Checks a candidate's registration status
	 * @return boolean value
	 */
	public boolean hasRegisteredCandidate() {
		if(value2) return true;
		return false;
	}


	/**
	 * Enables a voter to vote for their preferred candidate
	 * @param candidate
	 * @param voter
	 * @return boolean value
	 */
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

	
	/**
	 * verifies whether a voter has registered by checking if their ID is in records
	 * @param voter
	 * @return boolean value
	 */
	private boolean verify(Voter voter){
		if(registeredVoterIDs.contains(voter.getVoterID())) {
			return true;
		}
		return false;
		
		
	}
	

	/**
	 * Sums and shows election results at each polling station
	 *@return poll results
	 */
	public static HashMap<String, Integer> collateResults(){
		return pollresults;
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

	/**
	 * @return the voters
	 */
	public LinkedHashMap<String, Integer> getVoters() {
		return voters;
	}

	/**
	 * @param voters the voters to set
	 */
	public void setVoters(LinkedHashMap<String, Integer> voters) {
		this.voters = voters;
	}
	
	

}



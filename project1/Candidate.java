/**
 * 
 */
package project1;

/**
 * A candidate is also a voter
 * Represents a Candidate to run for elections
 * @author Precious Njeck, Gabriel Owusu, Gideon Bonsu
 *
 */
public class Candidate extends Voter {
	private String politicalParty;
	
	/**
	 * Constructor for the candidate class
	 * @param name
	 * @param nationality
	 * @param gender
	 * @param age
	 */
	public Candidate(String name, String nationality, char gender, int age, int voterID, String password, String politicalParty) {
		super(name, nationality, gender, age, voterID, password);
		this.politicalParty = politicalParty;
	
	}
	/**
	 * Gets a candidate's political party
	 * @return the politicalParty
	 */
	public String getPoliticalParty() {
		return politicalParty;
	}
	/**
	 * Changes a Candidate's political party
	 * @param politicalParty 
	 */
	public void setPoliticalParty(String politicalParty) {
		this.politicalParty = politicalParty;
	}
	
	
}

package project1;

/**
 * Interface to register eligible voters and candidates
 * @author Precious Njeck, Gabriel Owusu, Gideon Bonsu
 *
 */
public interface Eligible {
	
	/**
	 * Checks if a candidate is eligible for elections and registers them
	 * returns status of the operation
	 * @param candidate
	 * @return a boolean value
	 */
	public boolean registerCandidate(Candidate candidate);
	
	/**
	 * Checks if a voter is eligible to vote and registers them
	 * returns status of the operation
	 * @param voter
	 * @return a boolean value
	 */
	public boolean registerVoter(Voter voter);
	
	/**
	 * checks whether a voter has registered or not
	 * @return boolean value
	 */
	public boolean hasRegisteredVoter();
	
	/**
	 * checks whether a candidate has registered or not
	 * @return boolean value
	 */
	public boolean hasRegisteredCandidate();
	

}

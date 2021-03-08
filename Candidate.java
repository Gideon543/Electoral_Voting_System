/**
 * 
 */
package project1;




/**
 * @author Precious
 *
 */
public class Candidate extends Voter {
	private String politicalParty;

	
	//private static LinkedHashMap<String, String> candidates = new LinkedHashMap<String, String>();

	/**
	 * 
	 */
	public Candidate() {
		// TODO Auto-generated constructor stub
	}
	public Candidate(String name, String politicalParty) {
		
		this.setName(name);
		this.politicalParty = politicalParty;
		
		
	}
	
	
	
	/**
	 * @param name
	 * @param nationality
	 * @param gender
	 * @param age
	 */
	public Candidate(String name, String nationality, char gender, int age, int voterID, String politicalParty) {
		super(name, nationality, gender, age, voterID);
		this.politicalParty = politicalParty;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the politicalParty
	 */
	public String getPoliticalParty() {
		return politicalParty;
	}
	/**
	 * @param politicalParty the politicalParty to set
	 */
	public void setPoliticalParty(String politicalParty) {
		this.politicalParty = politicalParty;
	}
	
	/**
	 * @return the candidates
	 */
	/*public LinkedHashMap<String, String> getCandidates() {
		return candidates;
	}*/
		
	/*public boolean register() {
		if(this.getAge()>=40 && this.getNationality()=="Ghana") {
			
			candidates.put(politicalParty, this.getName());
			return true;
		}

		else {
			System.out.println("You are not eligible to run for office");
			//hasRegistered() = false;
			return false;
		}
	}
*/
	
	/*public boolean hasRegistered() {
		if(register()) return true;
		return false;
	}
	
	public boolean vote(Candidate candidate) {
		int count = 0;
		
		if (hasRegistered()) {
			if(!hasVoted()) {
				candidate.setVoteCount(count+=1);
				this.value=true;
				return true;
			}
		}
		this.value = false;
		return false;
	}
	public boolean hasVoted() {
		if(value) return true;
		return false;
	}
	
	public static void viewCandidates() {
		for( Entry<String, String> entry : candidates.entrySet() ){
		    System.out.println( entry.getKey() + ": " + entry.getValue() );
		}
	}
	*/

}

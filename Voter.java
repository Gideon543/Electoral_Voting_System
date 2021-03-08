/**
 * 
 */
package project1;


//import java.util.Random;

/**
 * @author Precious
 *
 */
public class Voter {
	private String name;
	private String nationality;
	private char gender;
	private int age;
	private int voterID;
	private boolean hasVoted = false;
	//private int pollID;
	
	//static ArrayList <String> registeredVoters  = new ArrayList <String> ();

	/**
	 * 
	 */
	public Voter() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param name
	 * @param nationality
	 * @param gender
	 * @param age
	 * @param voterID
	 */
	public Voter(String name, String nationality, char gender, int age, int voterID) {
		this.name = name;
		this.nationality = nationality;
		this.gender = gender;
		this.age = age;
		this.voterID=voterID;
		
	}
	


	/**
	 * @param name
	 * @param nationality
	 * @param age
	 */
	public Voter(String name, String nationality, int age) {
		this.name = name;
		this.nationality = nationality;
		this.age = age;
	}


	/**
	 * @param name
	 * @param gender
	 */
	
	/*public boolean register() {
		if(this.age>=18 && this.nationality== "Ghana") {
			registeredVoters.add(this.name);
			return true;
		}
		else {
		System.out.println("Sorry! You are not eligible to register");
		return false;
		}
		
	}
	
	public boolean hasRegistered() {
		if(register()) return true;
		return false;
	}
	*/

	/**
	 * @return the voterID
	 */
	public int getVoterID() {
		return voterID;
	}

	/**
	 * @param voterID the voterID to set
	 */
	public void setVoterID(int voterID) {
		this.voterID = voterID;
	}

	/**
	 * @return the pollingStation
	 */
	/*public int getPollID() {
		return pollID;
	}

	/**
	 * @param pollingStation the pollingStation to set
	 
	public void setPollingStation(int pollID) {
		this.pollID = pollID;
	}
    */

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
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}


	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the hasVoted
	 */
	public boolean getHasVoted() {
		return hasVoted;
	}


	/**
	 * @param hasVoted the hasVoted to set
	 */
	public void setHasVoted(boolean hasVoted) {
		this.hasVoted = hasVoted;
	}
	
	
	/*public static void viewVoters() {
		for(String i:registeredVoters) {
			System.out.println(i);
		}
	}*/

	

}

package Project;

import java.util.*;
import java.io.*;

/**
 * @author Gabriel Owusu Class: Candidate Accessibility Modifier: Public
 *         Illustrating Java Inheritance ('extends' and 'super()')
 */

 // inheriting from Person class
public class Candidate extends Person{

    
    private String party; 		// political party instance variable
    private String candidate_no;	// candidate number instance variable

    /**
	 * Default Constructor
	 */
	public Candidate() {
		super();
	}
	
    /**
	 * Constructor
	 * @param party	
     * @param candidate_no
	 */
	public Candidate(String name, String gender, int age, String party, String candidate_no) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
        this.party = party;
        this.candidate_no = candidate_no;
	}

	public Hashtable<String, Object> candidates = new Hashtable<String, Object>();
    
    /**
	 * Accessor Method: setVoterID()
	 * @param party
     * @param candidate_no
	 */
	public void setParty(String party) {
		this.party = party;
	}

    public void setCandidateNo(String candidate_no) {
		this.candidate_no = candidate_no;
	}

    /**
	 * Mutator Method: getVoterID()
	 * @param officerid
	 */
	public String getParty() {
		return party;
	}

    public String getCandidateNo() {
		return candidate_no;
	}

	/**
	 * Register a voter
	 * 
	 * @throws IOException
	 **/
	void register(String name, String gender, int age, String party, String candidateno) throws IOException {
		Candidate c = (Candidate) candidates.get(party);
		if (c != null) {
		System.out.println("Party has already been registered");
		} else if (age<40){
		System.out.println("Candidate is ineligible to ");}
		else {
		candidates.put(party, new Candidate(name, gender, age, party, candidateno));
		FileWriter candidateslist = new FileWriter("Candidates.txt");
		candidateslist.write(name + "," + gender + "," + age + "," + party + "," + candidateno);
		candidateslist.close();
		}
	}

    public String toString() {
		if(this.getAge()<40){
            return "\nCandidate must be at least 40. \nYou are ineligible to stand.";
        }
        else{
        return this.getName()+", "+this.getGender()+", "+this.getAge()+", "+this.getParty()+", "+this.getCandidateNo();
      }
	}

    /**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		Candidate Candidate1 = new Candidate();
		try{
			Candidate1.register("Nana Akuffo-Addo", "Male",29, "NPP", "001");
		} catch (IOException e){

		}
		
		System.out.println("\nCandidate 001: "+Candidate1.toString()); //You need to override toString() in the Person class
	}

}
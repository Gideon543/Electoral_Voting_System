
package project1;

import voting_uis.Voting_Section;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Represents a voter to participate in the elections in Ghana.
 * @author Precious Njeck, Gabriel Owusu, Gideon Bonsu
 *
 */
public class Voter {
	private String name;
	private String nationality;
	private char gender;
	private int age;
	private int voterID;
	private String password;
	private boolean hasVoted = false;
	
	
	/**
	 * Constructor for the Voter class
	 * @param name
	 * @param nationality
	 * @param gender
	 * @param age
	 * @param voterID
	 * @param password
	 */
	public Voter(String name, String nationality, char gender, int age, int voterID, String password) {
		this.name = name;
		this.nationality = nationality;
		this.gender = gender;
		this.age = age;
		this.voterID=voterID;
		this.password=password;


	}

	public static void login(String username, String password) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("project1/credentials.txt")));
		String line;
		while ((line = br.readLine()) != null) {
			String[] parts = line.split(",");
			if (username.equals(parts[0].trim()) && password.equals(parts[1].trim())) {
				java.awt.EventQueue.invokeLater(new Runnable() {
					public void run() {
						new Voting_Section().setVisible(true);
					}
				});
			}
		}
	}



	/**
	 * Gets a voter's ID
	 * @return the voterID
	 */
	public int getVoterID() {
		return voterID;
	}

	/**
	 * Changes a voter's ID
	 * @param voterID the voterID to set
	 */
	public void setVoterID(int voterID) {
		this.voterID = voterID;
	}

	/**
	 * Gets a voter's name
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * changes a voter's name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * Gets a voter's nationality
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}


	/**
	 * Changes a voter's nationality
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	/**
	 * Gets a voter's gender
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}


	/**
	 * changes a voter's gender
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}


	/**
	 * Gets a voter's age
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * Changes a voter's age
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * Checks whether or not a voter has voted
	 * @return the hasVoted
	 */
	public boolean getHasVoted() {
		return hasVoted;
	}


	/**
	 * changes a voter's voting status
	 * @param hasVoted the hasVoted to set
	 */
	public void setHasVoted(boolean hasVoted) {
		this.hasVoted = hasVoted;
	}

	

}

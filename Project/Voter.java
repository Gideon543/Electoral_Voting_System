package Project;

import java.util.*;
import java.io.*;

// abstract class 
public class Voter extends Person {

  String name;
  String gender;
  int age;
  String voterID;

  Voter() {
    super();
  };

  Voter(String name, String gender, int age, String voterID) {
    super();
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.voterID = voterID;
  }

  public Hashtable<String, Object> voters = new Hashtable<String, Object>();

  /** Get a voter's info */
  public Voter getVoter(String ID) {
    Voter voter = (Voter) voters.get(ID);
    if (voter == null) {
      return null;
    } else {
      return voter;
    }
  }

  /**
   * Register a voter
   * 
   * @throws IOException
   **/
  void register(String votername, String gender, int age, String voterID) throws IOException {
    Voter v = (Voter) voters.get(voterID);
    if (v != null) {
      System.out.println("Voter has already been registered");
    } else if (age<18){
      System.out.println("Voter is ineligible to vote");}
      else {
      voters.put(voterID, new Voter(votername, gender, age, voterID));
      FileWriter voterslist = new FileWriter("Voters.txt");
      FileWriter ids = new FileWriter("VoterIDs.txt");
      voterslist.write(votername + "," + gender + "," + age + "," + voterID);
      ids.write(voterID);
      voterslist.close();
      ids.close();
    }
  }

  
    /**
	 * Mutator Method: getVoterID()
	 * @return voterid
	 */
	public String getVoterID() {
		return (String) voters.get(voterID);
	}


  public String toString(Voter user) {
    if(this.getAge()<18){
      return "\nVoter must be at least 18. \nYou are ineligible to vote.";
    }
    else{
      return this.getName()+", "+this.getGender()+", "+this.getAge()+", "+this.getVoterID();
    }
  }

  /**
   * 
   * @param args
   * @throws IOException
   */

  public static void main(String[] args) {
    Voter Voter1 = new Voter();
    try {
      Voter1.register("Daniel Yeboah", "Male", 19, "V001");
      Voter1.register("Daniel Yeboah", "Male", 19, "V001");
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Welcome ");
  }
  
}
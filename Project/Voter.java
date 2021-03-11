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
  void register(String votername, String gender, int age, String voterID) {
    Voter v = (Voter) voters.get(voterID);
    try(
      FileWriter fw = new FileWriter("Project/Voters.txt", true);
      BufferedWriter bw = new BufferedWriter (fw);
      PrintWriter voterslist=new PrintWriter (bw);

      FileWriter idfw = new FileWriter("Project/VoterIDs.txt", true);
      BufferedWriter idbw = new BufferedWriter (idfw);
      PrintWriter ids=new PrintWriter (idbw);
    ){
    if (v != null) {
      System.out.println("Voter has already been registered");
    } else if (age<18){
      System.out.println("Voter is ineligible to vote");}
      else {
      voters.put(voterID, new Voter(votername, gender, age, voterID));


      voterslist.write("\n"+votername + "," + gender + "," + age + "," + voterID);
      ids.write("\n"+voterID);
      voterslist.close();
      ids.close();
    }}
    catch(IOException e){
        
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
    Voter1.register("Daniel Yeboah", "Male", 19, "C1310-96801");
    Voter1.register("Kwame Nkrumah", "Male", 64, "B7810-89567");
    Voter1.register("Delilah Thompson", "Female", 29, "A9530-00687");
    Voter1.register("Daniel Yeboah", "Male", 19, "V001");
    System.out.println("Welcome ");
  }
  
}
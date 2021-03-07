package Project;

import java.io.*;
import java.util.*;

public class PollingStation {
    
    public Hashtable<String, String> votes = new Hashtable<String, String>();
    public Hashtable<String, Integer> parties = new Hashtable<String, Integer>();
    String[] allpollingids = { "C1310", "B7810", "A9530" };
    

    public void vote(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please type your voter ID");
        String voterid=sc.nextLine();
        boolean value=verify(voterid);

        if (value){
            String pollid=voterid.split("-")[0];
            try(
                FileWriter fw = new FileWriter("Project/PollingStations/"+pollid+".txt", true);
                BufferedWriter bw = new BufferedWriter (fw);
                PrintWriter pollvotes=new PrintWriter (bw);
                ){
                    System.out.println("Successfully Logged In");
                    System.out.println("Which party would you like to vote for: ");
                    String party=sc.nextLine();
                    votes.put(voterid, party);
                    pollvotes.write("\n"+voterid+","+party);

        }
            catch(IOException e){};
    }
        else{
            System.out.println("User does not exist");
        }
    }

    public boolean verify(String voterid){
        boolean check=false;
        try{  
        BufferedReader reader=new BufferedReader(new FileReader("VoterIDs.txt"));
        String line;
        
        while((line=reader.readLine())!=null) {
            System.out.println(line);
            if (line.equals(voterid)){
                reader.close();
                check= true;
            }
            else{check=false;}
        }
    }
    catch (IOException e){
        System.out.println("Verification Complete");
    }
    return check;
    }

    public void collateresults(){
        parties.put("NPP",0);
        parties.put("NDC",0);
    
        Set<String> allvotes = votes.keySet();
        Set<String> allparties = parties.keySet();
        for(String voter: allvotes){
            for(String key: allparties){
                if(votes.get(voter).equals(key)){
                    parties.put(key,parties.get(key)+1);
                }
            }
        }
        toString(parties);
    }

    public String toString(Hashtable<String,Integer> partyname){
        Set<String> currentresults = partyname.keySet();
        for(String candidateparty : currentresults){
            System.out.println("Party : "  +  candidateparty
                    + "\t\t Count : "  + partyname.get(candidateparty));
        }
        return null;
            
    }
    public static void main(String[] args){
        PollingStation station = new PollingStation();
        station.vote();
        station.collateresults();
        station.vote();

    }
}

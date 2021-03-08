package Project;

import java.io.*;
import java.util.*;

public class PollingStation {
    
    public Hashtable<String, String> votes = new Hashtable<String, String>();
    public Hashtable<String, Integer> parties = new Hashtable<String, Integer>();
    String[] allpollingids = { "C1310", "B7810", "A9530" };
    

    public void vote() throws IOException{
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

    public boolean verify(String voterid) throws IOException{
        boolean check=false;
         
        FileInputStream reader= new FileInputStream("VoterIDs.txt");
        Scanner sc=new Scanner(reader);
        String line;
        
        while(sc.hasNextLine()){
            line=sc.nextLine();
            System.out.println(line);
            if (line.equals(voterid)){
                
                check= true;
            }
           
        }
    reader.close();
    return check;
    }

    public void collateresults() throws IOException{
        
        for(String pstation:allpollingids){
        
        votes = new Hashtable<String, String>();
        parties = new Hashtable<String, Integer>();
           System.out.println(pstation);
           parties.put("NPP",0);
           parties.put("NDC",0);
           FileInputStream preader= new FileInputStream("Project/PollingStations/"+pstation+".txt");
           Scanner stationscanner=new Scanner(preader);
            String ballots;
        
        while(stationscanner.hasNextLine()){
            ballots=stationscanner.nextLine();
            String[] parts=ballots.split(",");
       
            votes.put(parts[0],parts[1]);
            }
           
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
    }

    public String toString(Hashtable<String,Integer> partyname){
        Set<String> currentresults = partyname.keySet();
        for(String candidateparty : currentresults){
            System.out.println("Party : "  +  candidateparty
                    + "\t\t Count : "  + partyname.get(candidateparty));
        }
        return null;
            
    }
    public static void main(String[] args) throws IOException{
        PollingStation station = new PollingStation();
        station.vote();
        station.collateresults();
        station.vote();

    }
}

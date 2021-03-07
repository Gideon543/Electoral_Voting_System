package Project;

import java.io.*;
import java.util.*;

public class DistrictOffice{
    
    public Hashtable<String, Integer> parties = new Hashtable<String, Integer>();
    
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

    public void collateVotes(String districtname){
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
    }
}

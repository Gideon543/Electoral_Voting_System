package Project;

import java.io.*;
import java.util.*;

public class PollingStation {
    
    public void vote(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please type your voter ID");
        String voterid=sc.nextLine();
        boolean value=verify(voterid);

        if (value){
            System.out.println("Successfully Logged In");
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
        System.out.println("End");
    }
    return check;
    }

    public static void main(String[] args){
        PollingStation station = new PollingStation();
        station.vote();
    }
}

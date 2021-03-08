package project1;

import java.util.ArrayList;

public class ElectionsDemo {

	public ElectionsDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Voter voter1 = new Voter("Precious","Ghana",'F', 17, 100001);
		Voter voter2 = new Voter("Precious Njeck","Ghana",'F', 18, 100002);
		Voter voter3 = new Voter("Njeck Glory","Ghana",'F', 18, 100003);
		Voter voter4 = new Voter("Gideon Bonsu","Ghana",'M', 30, 100004);
		Voter voter5 = new Voter("Gabriel Owusu","Ghana",'M', 19, 100005);
		Voter voter6 = new Voter("Owusu","Ghana",'M', 20, 100006);
		Voter voter7 = new Voter("Harry Styles","Ghana",'M', 39, 100007);
		Voter voter8 = new Voter("Princess Anne","Ghana",'F', 18, 100008);
		Voter voter9 = new Voter("Princia Suh","Ghana",'F', 18, 100009);
		Voter voter10 = new Voter("Paul Biya","Ghana",'M', 87, 100010);
		Voter voter11 = new Voter("Nana Akufo Addo", "Ghana",'M', 77, 100011);
		Voter voter12 = new Voter("Ellen Johnson", "Ghana", 'F', 82, 100012);
		Voter voter13 = new Voter("Mohammed Awal", "Ghana", 'M', 23, 100013);
		Voter voter14 = new Voter("Presley Oustin", "Ghana", 'M', 37, 100014);
		Voter voter15 = new Voter("Anita Jones", "Ghana", 'F', 46, 100015);
		Voter voter16 = new Voter("Evans Johnson", "Ghana", 'M', 34, 100016);
		Voter voter17 = new Voter("Eve Animar", "Ghana", 'F', 30, 100017);
		Voter voter18 = new Voter("Styve Kings", "Ghana", 'M', 73, 100018);
		Voter voter19 = new Voter("Roland Kwese", "Ghana", 'M', 22, 100019);
		Voter voter20 = new Voter("Richardson Davids", "Ghana", 'M', 50, 100020);
		Voter voter21 = new Voter("Anna Park", "Ghana", 'F', 20, 100021);
		Voter voter22 = new Voter("Alisa Holmes", "Ghana", 'F', 32, 100022);
		Voter voter23 = new Voter("Peter Dinklage", "Ghana", 'M', 52, 100023);
		Voter voter24 = new Voter("Emille Roberts", "Ghana", 'F', 22, 100024);
		Voter voter25 = new Voter("Jude Arthur", "Ghana", 'M', 35, 100025);
		Voter voter26 = new Voter("Simon Cone", "Ghana", 'M', 28, 100026);
		Voter voter27 = new Voter("Victoria Shimer", "Ghana", 'F', 56, 100027);
		Voter voter28 = new Voter("Hakeem Johnson", "Ghana", 'M', 40, 100028);
		Voter voter29 = new Voter("Papa Kwame", "Ghana", 'M', 22, 100029);
		Voter voter30 = new Voter("Christina Jertrude", "Ghana", 'F', 39, 100030);
		Voter voter31 = new Voter("Boris Williams", "Ghana", 'M', 90, 100031);
		Voter voter32 = new Voter("Collins Brian", "Ghana", 'M', 62, 100032);
		Voter voter33 = new Voter("Archie William", "Ghana", 'M', 45, 100033);
		Voter voter34 = new Voter("Alisha Cooke", "Ghana", 'F', 43, 100034);
		Voter voter35 = new Voter("Jonathan Cowell", "Ghana", 'M', 87, 100035);
		Voter voter36 = new Voter("John Suleman", "Ghana", 'M', 33, 100036);
		Voter voter37 = new Voter("Phillip Mccain", "Ghana", 'M', 71, 100037);
		Voter voter38 = new Voter("Royal Jaden", "Ghana", 'M', 19, 100038);
		Voter voter39 = new Voter("Pauline Ebika", "Ghana", 'F', 38, 100039);
		Voter voter40 = new Voter("Larissa Hopkins", "Ghana", 'F', 36, 100040);
		Voter voter41 = new Voter("Bless Hans", "Ghana", 'M', 40, 100041);
		Voter voter42 = new Voter("Francis Aduro", "Ghana", 'M', 57, 100042);
		Voter voter43 = new Voter("Xian Lim", "Ghana", 'M', 36, 100043);
		Voter voter44 = new Voter("Helen Jones", "Ghana", 'F', 49, 100044);
		Voter voter45 = new Voter("Derrick Peters", "Ghana", 'M', 28, 100045);
		Voter voter46 = new Voter("Harry Flinch", "Ghana", 'M', 50, 100046);
		Voter voter47 = new Voter("Ariana Valdes", "Ghana", 'F', 34, 100047);
		Voter voter48 = new Voter("Nicholas Happy", "Ghana", 'M', 48, 100048);
		Voter voter49 = new Voter("Analise Keating", "Ghana", 'F', 60, 100049);
		Voter voter50 = new Voter("Jon Snow", "Ghana", 'M', 32, 100050);
		Voter voter51 = new Voter("Elizabeth Warren", "Ghana", 'F', 37, 100051);
		
		Candidate candidate1 =  new Candidate(voter3.getName(), voter3.getNationality(), voter3.getGender(),voter3.getAge(), voter3.getVoterID(), "CPDM");
		Candidate candidate2 =  new Candidate(voter10.getName(), voter10.getNationality(), voter10.getGender(),voter10.getAge(), voter10.getVoterID(), "CPDM");
		Candidate candidate3 =  new Candidate(voter11.getName(), voter11.getNationality(), voter11.getGender(),voter11.getAge(), voter11.getVoterID(), "NPP");
		Candidate candidate4 =  new Candidate(voter12.getName(), voter12.getNationality(), voter12.getGender(),voter12.getAge(), voter12.getVoterID(), "IPP");
		
		
		Pollingstation poll1 = new Pollingstation(11, "poll1", "Madina");
		Pollingstation poll2 = new Pollingstation(12, "poll2", "Kasoa");
		Pollingstation poll3 = new Pollingstation(13, "poll3", "Berekuso");
		Pollingstation poll4 = new Pollingstation(14, "poll4", "Adenta");
		Pollingstation poll5 = new Pollingstation(15, "poll5", "Dodowa");
		Pollingstation poll6 = new Pollingstation(16, "poll6", "Aburi");
		Pollingstation poll7 = new Pollingstation(17, "poll7", "Spintex");
		Pollingstation poll8 = new Pollingstation(18, "poll8", "Spanner");
		Pollingstation poll9 = new Pollingstation(19, "poll9", "Haatso");
		Pollingstation poll10 = new Pollingstation(20, "poll10", "Legon");
		Pollingstation poll11 = new Pollingstation(21, "poll11", "Bafut");
		Pollingstation poll12 = new Pollingstation(22, "poll12", "Mankon");
		Pollingstation poll13 = new Pollingstation(23, "poll13", "Ntarinkon");
		Pollingstation poll14 = new Pollingstation(24, "poll14", "Nkwen");
		Pollingstation poll15 = new Pollingstation(25, "poll15", "Roundabout1");
		Pollingstation poll16 = new Pollingstation(26, "poll16", "Mile10");
		Pollingstation poll17 = new Pollingstation(27, "poll17", "Musang");
		Pollingstation poll18 = new Pollingstation(28, "poll18", "Tiko");
		Pollingstation poll19 = new Pollingstation(29, "poll19", "Mutengene");
		Pollingstation poll20 = new Pollingstation(30, "poll20", "Biyem-Assi");
		
		Pollingstation [] stations= {poll1, poll2, poll3,poll4,poll5,poll6,poll7,poll8,poll9,poll10,poll11,poll12,poll13,poll14,poll15,poll16,poll17, poll18,poll19,poll20};
		
		poll1.registerVoter(voter1);
		poll1.registerVoter(voter2);
		poll1.registerVoter(voter3);
		poll1.registerVoter(voter4);
		poll1.registerVoter(voter5);
		poll2.registerVoter(voter6);
		poll2.registerVoter(voter7);
		poll2.registerVoter(voter8);
		poll3.registerVoter(voter9);
		poll3.registerVoter(voter10);
		poll4.registerVoter(voter11);
		poll4.registerVoter(voter12);
		poll4.registerVoter(voter13);
		poll5.registerVoter(voter14);
		poll5.registerVoter(voter15);
		poll6.registerVoter(voter16);
		poll6.registerVoter(voter17);
		poll6.registerVoter(voter18);
		poll7.registerVoter(voter19);
		poll7.registerVoter(voter20);
		poll8.registerVoter(voter21);
		poll9.registerVoter(voter22);
		poll9.registerVoter(voter23);
		poll10.registerVoter(voter24);
		poll10.registerVoter(voter25);
		poll11.registerVoter(voter26);
		poll12.registerVoter(voter27);
		poll12.registerVoter(voter28);
		poll13.registerVoter(voter29);
		poll13.registerVoter(voter30);
		poll13.registerVoter(voter31);
		poll14.registerVoter(voter32);
		poll14.registerVoter(voter33);
		poll15.registerVoter(voter34);
		poll15.registerVoter(voter35);
		poll16.registerVoter(voter36);
		poll17.registerVoter(voter37);
		poll17.registerVoter(voter38);
		poll17.registerVoter(voter39);
		poll18.registerVoter(voter40);
		poll18.registerVoter(voter41);
		poll18.registerVoter(voter42);
		poll18.registerVoter(voter43);
		poll19.registerVoter(voter44);
		poll19.registerVoter(voter45);
		poll19.registerVoter(voter46);
		poll19.registerVoter(voter47);
		poll20.registerVoter(voter48);
		poll20.registerVoter(voter49);
		poll20.registerVoter(voter50);
		poll20.registerVoter(voter51);
		
		System.out.println(poll1.registeredVoters);
	   for(Pollingstation i: stations) {
		i.registerCandidate(candidate1);
		i.registerCandidate(candidate2);
		i.registerCandidate(candidate3);
		i.registerCandidate(candidate4);
	   }
	
		//System.out.println(Pollingstation.getCandidates());
		
		//poll1.vote(candidate3, voter1);
		poll1.vote(candidate3, voter2);
		poll1.vote(candidate3, voter3);
		poll1.vote(candidate4, voter4);
		poll1.vote(candidate3, voter5);
		
		ArrayList<Candidate> cands = new ArrayList<Candidate>();
		cands.add(candidate2);
		cands.add(candidate3);
		cands.add(candidate4);
		
		poll2.vote(candidate4, voter6);
		poll2.vote(candidate2, voter7);
		poll2.vote(candidate4, voter8);
		
		
		
		poll3.vote(candidate4, voter9);
		poll3.vote(candidate3, voter10);
		
		poll4.vote(candidate4, voter11);
		poll4.vote(candidate2, voter12);
		poll4.vote(candidate3, voter13);
		poll5.vote(candidate3, voter14);
		poll5.vote(candidate2, voter15);
		poll6.vote(candidate4, voter16);
		poll6.vote(candidate3, voter17);
		poll6.vote(candidate4, voter18);
		poll7.vote(candidate4, voter19);
		poll7.vote(candidate3, voter20);
		poll8.vote(candidate2, voter21);
		poll9.vote(candidate4, voter22);
		poll9.vote(candidate3, voter23);
		poll10.vote(candidate3, voter24);
		poll10.vote(candidate3, voter25);
		poll11.vote(candidate4, voter26);
		poll12.vote(candidate4, voter27);
		poll12.vote(candidate4, voter28);
		poll13.vote(candidate3, voter29);
		poll13.vote(candidate3, voter30);
		poll13.vote(candidate2, voter31);
		poll14.vote(candidate3, voter32);
		poll14.vote(candidate4, voter33);
		poll15.vote(candidate2, voter34);
		poll15.vote(candidate2, voter35);
		poll16.vote(candidate4, voter36);
		poll17.vote(candidate3, voter37);
		poll17.vote(candidate3, voter38);
		poll17.vote(candidate2, voter39);
		poll18.vote(candidate3, voter40);
		poll18.vote(candidate4, voter41);
		poll18.vote(candidate4, voter42);
		poll18.vote(candidate3, voter43);
		poll19.vote(candidate4, voter44);
		poll19.vote(candidate3, voter45);
		poll19.vote(candidate2, voter46);
		poll19.vote(candidate4, voter47);
		poll20.vote(candidate2, voter48);
		poll20.vote(candidate3, voter49);
		poll20.vote(candidate4, voter50);
		poll20.vote(candidate3, voter51);
		
		
	
		System.out.println(poll1.collateResults(cands));
		
		System.out.println(poll2.collateResults(cands));
		System.out.println(poll3.collateResults(cands));
		System.out.println(poll4.collateResults(cands));
		System.out.println(poll5.collateResults(cands));
		System.out.println(poll6.collateResults(cands));
		System.out.println(poll7.collateResults(cands));
		System.out.println(poll8.collateResults(cands));
		System.out.println(poll9.collateResults(cands));
		System.out.println(poll10.collateResults(cands));
		System.out.println(poll11.collateResults(cands));
		System.out.println(poll12.collateResults(cands));
		System.out.println(poll13.collateResults(cands));
		System.out.println(poll14.collateResults(cands));
		System.out.println(poll15.collateResults(cands));
		System.out.println(poll16.collateResults(cands));
		System.out.println(poll17.collateResults(cands));
		System.out.println(poll18.collateResults(cands));
		System.out.println(poll19.collateResults(cands));
		System.out.println(poll20.collateResults(cands));
		
		
		ArrayList<Pollingstation> dist1 = new ArrayList<Pollingstation>();
		dist1.add(poll1);
		dist1.add(poll2);
		//dist1.add(poll3);
		ArrayList<Pollingstation> dist2 = new ArrayList<Pollingstation>();
		dist2.add(poll3);
		dist2.add(poll4);
		ArrayList<Pollingstation> dist3 = new ArrayList<Pollingstation>();
		dist3.add(poll5);
		dist3.add(poll6);
		ArrayList<Pollingstation> dist4 = new ArrayList<Pollingstation>();
		dist4.add(poll7);
		dist4.add(poll8);
		ArrayList<Pollingstation> dist5 = new ArrayList<Pollingstation>();
		dist5.add(poll9);
		dist5.add(poll10);
		ArrayList<Pollingstation> dist6 = new ArrayList<Pollingstation>();
		dist6.add(poll11);
		dist6.add(poll12);
		ArrayList<Pollingstation> dist7 = new ArrayList<Pollingstation>();
		dist7.add(poll13);
		dist7.add(poll14);
		ArrayList<Pollingstation> dist8 = new ArrayList<Pollingstation>();
		dist8.add(poll15);
		dist8.add(poll16);
		ArrayList<Pollingstation> dist9 = new ArrayList<Pollingstation>();
		dist9.add(poll17);
		dist9.add(poll18);
		ArrayList<Pollingstation> dist10 = new ArrayList<Pollingstation>();
		dist10.add(poll19);
		dist10.add(poll20);
		
		DistrictOffice district1 = new DistrictOffice(111, "district1", "Bamenda", dist1);
		DistrictOffice district2 = new DistrictOffice(112, "district2", "Cape Coast", dist2);
		DistrictOffice district3 = new DistrictOffice(113, "district3", "Cantonments", dist3);
		DistrictOffice district4 = new DistrictOffice(114, "district4", "Accra", dist4);
		DistrictOffice district5 = new DistrictOffice(115, "district5", "Kwabena", dist5);
		DistrictOffice district6 = new DistrictOffice(116, "district6", "Lapaz", dist6);
		DistrictOffice district7 = new DistrictOffice(117, "district7", "Batibo", dist7);
		DistrictOffice district8 = new DistrictOffice(118, "district8", "Labadi", dist8);
		DistrictOffice district9 = new DistrictOffice(119, "district9", "Kumasi", dist9);
		DistrictOffice district10 = new DistrictOffice(120, "district10", "Buea", dist10);
		
		System.out.println(district1.collateResults());
		System.out.println(district2.collateResults());
		System.out.println(district3.collateResults());
		System.out.println(district4.collateResults());
		System.out.println(district5.collateResults());
		System.out.println(district6.collateResults());
		System.out.println(district7.collateResults());
		System.out.println(district8.collateResults());
		System.out.println(district9.collateResults());
		System.out.println(district10.collateResults());
		
		
		ArrayList<DistrictOffice> reg1 = new ArrayList<DistrictOffice>();
		reg1.add(district1);
		reg1.add(district2);
		reg1.add(district3);
		ArrayList<DistrictOffice> reg2 = new ArrayList<DistrictOffice>();
		reg2.add(district4);
		reg2.add(district5);
		ArrayList<DistrictOffice> reg3 = new ArrayList<DistrictOffice>();
		reg3.add(district6);
		reg3.add(district7);
		reg3.add(district8);
		ArrayList<DistrictOffice> reg4 = new ArrayList<DistrictOffice>();
		reg4.add(district9);
		reg4.add(district10);
		
		RegionalOffice region1 = new RegionalOffice(1111, "region1", "NorthWest Region", reg1);
		RegionalOffice region2 = new RegionalOffice(1112, "region2", "Central Region", reg2);
		RegionalOffice region3 = new RegionalOffice(1113, "region3", "Eastern Region", reg3);
		RegionalOffice region4 = new RegionalOffice(1114, "region4", "Southern Region", reg4);
		
		System.out.println(region1.collateResults());
		System.out.println(region2.collateResults());
		System.out.println(region3.collateResults());
		System.out.println(region4.collateResults());
		
		ArrayList<RegionalOffice> nation = new ArrayList<RegionalOffice>();
		nation.add(region1);
		nation.add(region2);
		nation.add(region3);
		nation.add(region4);
		
		NationalOffice national = new NationalOffice("Ghana", nation);
		
		System.out.println(national.collateResults());
	}

}

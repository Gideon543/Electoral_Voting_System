package project1;


import java.util.HashMap;

/**
 * @author Precious Njeck, Gabriel Owusu, Gideon Bonsu
 */
public abstract class Office {
	
	private int ID;
	private static String name;
	private String location;

	/**
	 * Office constructor
	 * @param ID
	 * @param name
	 * @param location
	 */
	public Office(int ID, String name, String location) {
		this.ID = ID;
		this.name = name;
		this.location = location;
			
	}

    /**
     * Abstract method implemented in inherited classes
     * sums and returns results for each office
     *
     * @return
     */
    public static HashMap<String, Integer> collateResults() {
        return null;
    }

    /**
	 * Gets the Office ID
	 * @return ID
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Sets the office ID to a new one
	 * @param ID to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * Gets the office name
	 * @return the name
	 */
	public static String getName() {
		return name;
	}

	/**
	 * Sets the office name to a new one
	 * @param name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the location of the office
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the location of the office to a new one
	 * @param location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	

}

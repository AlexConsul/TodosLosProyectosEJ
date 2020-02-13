

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club {
	private ArrayList<Membership> files;
    
    /**
     * Constructor for objects of class Club
     */
    public Club() {
    	 files = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member) {
    	 files.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers() {
    	int n=0;
    	n=files.size();
        return n;
    }
	
	 /**
     * Prints out all the members
     */
    public void print() {
    	Iterator<Membership> it=files.iterator();
    	while(it.hasNext()) {
    		System.out.println(it.next().toString());
    	}	
    }
}



import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 * 
 * @author
 * @version 
 */
public class MusicOrganizer {
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer() {
        files = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename) {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        if(validIndex(index)) {
            files.remove(index);
        }
    }  
    
    public void checkIndex(int index) {
        if(index >= 0 && index < files.size()) {
      
        }else {
        	System.out.println("No es válido");
        }
    }
    
    public boolean validIndex(int index) {
    	boolean b;
    	if(index >= 0 && index < files.size()) {
    		b=true;
    	}else {
    		b=false;
    	}
    	return b;
    }
    
    public void listAllFiles() {
    	/*for(String str:files) {
    		System.out.println(str);
    	}*/
    	Iterator<String> it=files.iterator();
    	while (it.hasNext()) {
    		System.out.println(it.next());
    	}
    }
    
    public void listMatching(String searchString) {
    	for(String filename:files) {
    		if(filename.contains(searchString)) {
    			System.out.println(filename);
    		}
    	}
    }
}


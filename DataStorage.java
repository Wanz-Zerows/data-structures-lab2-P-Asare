import java.util.ArrayList;

public class DataStorage <E extends DataEntry>{
    
    ArrayList<E> store = new ArrayList<>();

    /**
     * Add entry to store of data dentry
     * 
     * @param entry
     */
    public void addEntry(E entry){
        store.add(entry);
    }

    /**
     * Find data entry in store based on the id
     * of the data entry
     * 
     * @param id
     * @return Object of generic type E
     */
    public E retrieveEntry(String id){
        
        for (E e : store) {
            if (e.identifier.toLowerCase().equals(id.toLowerCase())) // convert string to lowercase to match values
                return e;
        }

        return null;
    }

    /**
     * Gets the number of entries that
     * have been added to the data storage
     * 
     * @return number of data entries
     */
    public int getEntryCount(){
        return this.store.size();
    }

    /**
     * Calculate the average timestamp of all
     * the entries availabe in the data storage
     * 
     * @return average timestamp
     */
    public long getAverageTimeStamp(){
        long totalStamp = 0L;

        for (E e : store) {
            totalStamp += e.TIMESTAMP;
        }

        return (totalStamp / this.getEntryCount());
    }

    /**
     * Remove data entry from data storage
     * based on the specified id
     * 
     * @param id
     */
    public void removeEntry(String id){
        
        for (int i = 0; i < store.size(); i++) {
            if (store.get(i).identifier.toLowerCase().equals(id.toLowerCase())) // convert string to lowercase to match values
                this.store.remove(i); // remove object at a specific position in array
        }
    }

}

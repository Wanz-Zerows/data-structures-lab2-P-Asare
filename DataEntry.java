import java.util.*;

public class DataEntry <E> {

    String identifier;
    E dataValue;
    final long TIMESTAMP;

    /**
     * Create DataEntry object and initialize attributes
     * 
     * @param identifier
     * @param dataValue
     * @param timeStamp
     */
    public DataEntry(String identifier, E dataValue){

        this.identifier = identifier;
        this.dataValue = dataValue;
        this.TIMESTAMP = new Date().getTime(); // number of miliseconds from 1970 till object creation
    }
    
    
}

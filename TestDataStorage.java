public class TestDataStorage {
    public static void main(String[] args) {
        
        // store all data entries
        DataStorage<DataEntry> storage = new DataStorage<>();

        DataEntry<Integer> entryOne = new DataEntry<Integer>("123", 1);
        DataEntry<Integer> entryTwo = new DataEntry<Integer>("456", 2);

        // test out Data storage methods
        storage.addEntry(entryOne);
        storage.addEntry(entryTwo);

        System.out.println("Data value with entry id of 123: " + storage.retrieveEntry("123").dataValue);
        System.out.println("Number of data entries: " + storage.getEntryCount());
        
        DataEntry<Integer> entryThree = new DataEntry<Integer>("789", 4);
        storage.addEntry(entryThree);

        System.out.println("Average time: " + storage.getAverageTimeStamp());
        
        storage.removeEntry("123");
        System.out.println("Number of data entries: " + storage.getEntryCount());
    

    }
    
}

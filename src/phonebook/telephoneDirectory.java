package phonebook;

import java.util.ArrayList;
import java.util.List;

public class telephoneDirectory {
    private List<Recording> recordings;

    public telephoneDirectory(){
        recordings= new ArrayList<>();
    }
    public void add(Recording recording){
        recordings.add(recording);
    }
    public Recording find(String name){
        for(Recording recording: recordings){
            if(recording.getName().equals(name)) return recording;
        }
        return null;
    }
}



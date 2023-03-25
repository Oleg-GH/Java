package model;

public class Record {
    private String sentence;

    public Record(String sentence){
        this.sentence = sentence;
    }

    @Override
    public String toString(){
        return sentence;
    }
}

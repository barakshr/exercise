package org.exercise.seleniumpages;

public enum SizesEnum {

    Small("S"),
    Large("L"),
    ExtraLarge("EX");




    private String size;
    SizesEnum(String size){
        this.size=size;
    }

    public String getSize() {
        return size;
    }
}

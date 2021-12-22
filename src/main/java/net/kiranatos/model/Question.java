package net.kiranatos.model;

import java.util.ArrayList;
import java.util.List;

class Question {
    private List<String> information;

    public Question() {
        information = new ArrayList<>();
    }

    public List<String> getInformation() {
        return information;
    }

    public void addInformation(String info) {
        this.information.add(info);
    }  

}

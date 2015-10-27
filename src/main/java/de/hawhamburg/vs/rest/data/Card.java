package de.hawhamburg.vs.rest.data;

public class Card {
    private String title;
    private String text;

    public Card() {
    }

    public Card(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}

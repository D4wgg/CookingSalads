package ru.liga.vegetable;

public class Vegetable {
    protected CutForm cutForm;
    protected String name;

    public Vegetable(CutForm cutForm, String name) {
        this.cutForm = cutForm;
        this.name = name;
    }

    public CutForm getCutForm() {
        return cutForm;
    }

    public String getName() {
        return name;
    }
}

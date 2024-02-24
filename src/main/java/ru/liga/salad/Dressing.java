package ru.liga.salad;

public enum Dressing {
    OIL("Масло"),
    MAYO("Майонез");

    private final String label;

    Dressing(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

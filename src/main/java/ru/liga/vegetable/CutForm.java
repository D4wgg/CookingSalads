package ru.liga.vegetable;

public enum CutForm {
    CUBE("Нарезка кубиком"),
    SLICE("Нарезка дольками"),
    RING("Нарезка кольцами");

    private final String cutting;

    CutForm(String cutting) {
        this.cutting = cutting;
    }

    public String getCutting() {
        return cutting;
    }
}

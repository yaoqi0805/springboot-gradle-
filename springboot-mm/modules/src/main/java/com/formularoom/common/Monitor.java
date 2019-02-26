package com.formularoom.common;

public enum Monitor {
    SPRING("春天"),SUMMER("夏天"),FALL("秋天"),WINTER("冬天");

    private final String name;

    Monitor(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}

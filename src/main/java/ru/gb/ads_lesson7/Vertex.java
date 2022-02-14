package ru.gb.ads_lesson7;

import lombok.Data;

@Data

public class Vertex<T> {
    private T label;
    private boolean visited;
    private int weight;

    public Vertex(T label) {
        this.label = label;
        this.visited = false;
        this.weight = -1;
    }
}

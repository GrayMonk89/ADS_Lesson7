package ru.gb.ads_lesson7;

public class ADS_Lesson7 {
    public static void main(String[] args) {
        MyGraph<Integer> graph = new MyGraph<>(10);
        for (int i = 0; i < graph.getSize(); i++) {
            graph.addVertex(i);
        }

        graph.addAdjacency(0, 1);
        graph.addAdjacency(0, 2);
        graph.addAdjacency(1, 3);
        graph.addAdjacency(1, 4);
        graph.addAdjacency(2, 3);
        graph.addAdjacency(3, 4);
        graph.addAdjacency(4, 6);
        graph.addAdjacency(5, 6);
        graph.addAdjacency(5, 8);
        graph.addAdjacency(6, 8);
        graph.addAdjacency(7, 8);
        graph.addAdjacency(7, 9);

        //graph.depthTravers();
        //graph.widthTravers(true, null);
        System.out.println(graph.printWay(graph.getVertex(9)));
    }
}

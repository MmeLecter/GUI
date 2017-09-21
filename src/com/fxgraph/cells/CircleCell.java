package com.fxgraph.cells;

import com.fxgraph.graph.Cell;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CircleCell extends Cell {

    public CircleCell(String id) {
        super(id);

        Circle view = new Circle( 25);

        view.setStroke(Color.SKYBLUE);
        view.setFill(Color.SKYBLUE);

        setView(view);

    }

}
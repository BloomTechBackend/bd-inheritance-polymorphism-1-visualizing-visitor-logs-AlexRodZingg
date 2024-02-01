package com.amazon.ata.inheritance.model;

public class TestVisit extends Visit {

    @Override
    public VisitColor getVisitColor() {
        return VisitColor.TEST_VISITOR_COLOR;
    }
}

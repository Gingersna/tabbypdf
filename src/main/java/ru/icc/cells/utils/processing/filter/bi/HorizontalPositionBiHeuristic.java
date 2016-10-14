package ru.icc.cells.utils.processing.filter.bi;

import ru.icc.cells.common.Rectangle;

public class HorizontalPositionBiHeuristic extends BiHeuristic<Rectangle> {

    public HorizontalPositionBiHeuristic() {
        super(Orientation.HORIZONTAL);
    }

    @Override
    public boolean test(Rectangle first, Rectangle second) {
        float lx1 = first.getLeft();
        float lx2 = second.getLeft();
        float ty1 = first.getTop();
        float ty2 = second.getTop();
        float by1 = first.getBottom();
        float by2 = second.getBottom();
        return (lx1 <= lx2) && (ty1 >= by2) && (by1 <= ty2);
    }
}
package Phan5;

public class Line {
    // A line composes of two points (as instance variables)
    private Point begin;    // beginning point
    private Point end;      // ending point

    // Constructors
    public Line(Point begin, Point end) {  // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        this.begin = new Point(beginX, beginY);   // construct the Points here
        this.end = new Point(endX, endY);
    }

    // Public methods
    @Override
    public String toString() {
        return "Line[begin=" + begin + ", end=" + end + "]";
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.x;
    }

    public int getBeginY() {
        return begin.y;
    }

    public int getEndX() {
        return end.x;
    }

    public int getEndY() {
        return end.y;
    }

    public void setBeginX(int x) {
        begin.x = x;
    }

    public void setBeginY(int y) {
        begin.y = y;
    }

    public void setBeginXY(int x, int y) {
        begin.x = x;
        begin.y = y;
    }

    public void setEndX(int x) {
        end.x = x;
    }

    public void setEndY(int y) {
        end.y = y;
    }

    public void setEndXY(int x, int y) {
        end.x = x;
        end.y = y;
    }

    public double getLength() {
        int xDiff = end.x - begin.x;
        int yDiff = end.y - begin.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = end.x - begin.x;
        int yDiff = end.y - begin.y;
        return Math.atan2(yDiff, xDiff);
    }
}

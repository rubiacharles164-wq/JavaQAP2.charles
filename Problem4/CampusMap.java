public class CampusMap {
    private MyRectangle building;
    private MyLine to;
    private MyLine from;
    private MyCircle fountain;

    public MyRectangle GetBuilding() {
        return building;
    }

    public void SetBuilding(MyRectangle building) {
        this.building = building;
    }

    public MyCircle GetFountain() {
        return fountain;
    }
    
    public void SetFountain(MyCircle fountain) {
        this.fountain = fountain;
    }

    public MyLine GetTo() {
        return to;
    }

    public void SetTo(MyLine to) {
        this.to = to;
    }

    public MyLine GetFrom() {
        return from;
    }

    public void SetFrom(MyLine from) {
        this.from = from;
    }

    public double CalculateTotalWalkingLength() {
        double length1 = Math.sqrt(Math.pow(to.getBegin().getX() - from.getEnd().getX(), 2) + Math.pow(to.getBegin().getY() - from.getEnd().getY(), 2));
        double length2 = Math.sqrt(Math.pow(to.getEnd().getX() - to.getBegin().getX(), 2) + Math.pow(to.getEnd().getY() - to.getBegin().getY(), 2));
        return length1 + length2;
    }

    public double CalculateTotalFountainArea() {
        return fountain.getArea();
    }

    public boolean IsWalkingFromTo(MyRectangle building ) {
        return (to.getBegin().getX() >= building.getTopLeft().getX() && to.getBegin().getX() <= building.getTopLeft().getX() + building.getWidth() &&
                to.getBegin().getY() >= building.getTopLeft().getY() && to.getBegin().getY() <= building.getTopLeft().getY() + building.getHeight()) ||
               (to.getEnd().getX() >= building.getTopLeft().getX() && to.getEnd().getX() <= building.getTopLeft().getX() + building.getWidth() &&
                to.getEnd().getY() >= building.getTopLeft().getY() && to.getEnd().getY() <= building.getTopLeft().getY() + building.getHeight());
    }
}

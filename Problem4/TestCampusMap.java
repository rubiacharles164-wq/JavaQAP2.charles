public class TestCampusMap {
    public static void main(String[] args) {
        CampusMap campusMap = new CampusMap();
        campusMap.addBuilding("Library", new MyPoint(1, 2));
        campusMap.addBuilding("Science Hall", new MyPoint(3, 4));
        campusMap.addBuilding("Gymnasium", new MyPoint(5, 6));

        System.out.println(campusMap);
    }
}
// Not fully able to implement CampusMap, Not sure what methods to add, and how to implement them.

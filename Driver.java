
class Driver {

    Vehicle vehicle = new Vehicle();

    public void carDetail() {
        System.out.println("----------------------------");
        System.out.println("--Car Details--" + "            |");
        vehicle.car.smallWheels();
        vehicle.car.smallWindows();
    }

    public void planeDetail() {
        System.out.println("--Plane Details--" + "          |");
        vehicle.plane.wings();
        vehicle.plane.bathroom();
    }

    public void busDetail() {
        System.out.println("--Bus Details--" + "            |");
        vehicle.bus.bigWheels();
        vehicle.bus.multipleSeats();
    }

    public void diagram() {
        System.out.println("--Diagram of the classes--\n");
        System.out.print("  | OOP_ClassRelationship_HAS_A_RonakBasnet |\n");
        int height = 3; // Height of the arrow

        // Draw the arrow
        for (int i = 1; i <= height; i++) {
            System.out.println("                      *");
        }
        System.out.println("                   |Driver|");
        for (int i = 1; i <= height; i++) {
            System.out.println("                      *");
        }
        System.out.println("                  |Vehicle|");
        for (int i = 1; i <= height; i++) {
            System.out.println("                      *");
        }

        System.out.printf("%18s", "  * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println();

        System.out.printf("  *%20s %23s", "*", "*");
        System.out.println();
        System.out.printf("  *%20s %23s\n", "*", "*");

        System.out.println("|Car|              |Plane|                  |Bus|");


    }

}



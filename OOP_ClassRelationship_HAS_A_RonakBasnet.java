/**
 * File: [OOP_ClassRelationship_HAS_A_RonakBasnet].
 * By: [Ronak Basnet]
 * Date: [3/31/2024]
 * Description: [This program prints OOP]
 */



public class OOP_ClassRelationship_HAS_A_RonakBasnet {

        public static void main(String[] args) {

            Driver access = new Driver();

            access.carDetail();
            access.planeDetail();
            access.busDetail();
            access.diagram();

            Car car = access.vehicle.getCar();
            car.numberOne();

            Plane plane = access.vehicle.getPlane();
            plane.numberTwo();

            Bus bus = access.vehicle.getBus();
            bus.numberThree();


        }
    }




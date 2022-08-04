public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            car.check();
        } else if (truck != null) {
            truck.check();
        } else if (bicycle != null) {
            bicycle.check();
        }
    }
}

public class Bus extends Vehicle {
    @Override
    void calRent(int distance, float price) {
        float fare = distance * price;
        fare += 150.00f;
        System.out.println("Harga sewa bus = " + fare);
    }
}
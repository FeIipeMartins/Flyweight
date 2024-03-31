// DeliveryLocation.java
public class DeliveryLocation implements DeliveryFlyweight {
    private final DeliveryLocationData intrinsicState;

    public DeliveryLocation(DeliveryLocationData intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void deliver(String name, String number) {
        System.out.println("Entrega para " + name);
        System.out.println("Em " + intrinsicState.getStreet() + ", " + intrinsicState.getCity());
        System.out.println("Número: " + number);
        System.out.println("###");
    }
}

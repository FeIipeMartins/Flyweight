
public class Main {
  public static void main(String[] args) {
    DeliveryFactory factory = new DeliveryFactory();
    DeliveryLocationData locationData1 = new DeliveryLocationData("Rua Monsenhor Bruno", "Fortaleza");
    DeliveryLocationData locationData2 = new DeliveryLocationData("Avenida Desembargador Moreira", "Fortaleza");
    DeliveryLocationData locationData3 = new DeliveryLocationData("Rua Monsenhor Bruno", "Fortaleza");
    DeliveryFlyweight location1 = factory.makeLocation(locationData1);
    DeliveryFlyweight location2 = factory.makeLocation(locationData2);
    location1.deliver("Luis Kaio", "123");
    location2.deliver("Manoel Ramos", "456");
    location2.deliver("Felipe Martins ", "160");

    System.out.println(factory.getLocations());

  }
}
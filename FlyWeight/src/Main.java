public class Main {
    public static void main(String[] args) {
        // Cria uma instância da fábrica de entregas
        DeliveryFactory factory = new DeliveryFactory();

        // Dados da localização de entrega
        DeliveryLocationData locationData1 = new DeliveryLocationData("123 Main St", "Cityville");
        DeliveryLocationData locationData2 = new DeliveryLocationData("456 Elm St", "Townsville");

        // Cria as localizações de entrega usando a fábrica
        DeliveryFlyweight location1 = factory.makeLocation(locationData1);
        DeliveryFlyweight location2 = factory.makeLocation(locationData2);

        // Realiza entregas nas localizações criadas
        location1.deliver("John Doe", "1A");
        location2.deliver("Jane Smith", "2B");
    }
}

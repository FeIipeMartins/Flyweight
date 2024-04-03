import java.util.HashMap;
import java.util.Map;

public class DeliveryFactory {
  private Map<String, DeliveryFlyweight> locations = new HashMap<>();

  public DeliveryFlyweight makeLocation(DeliveryLocationData intrinsicState) {
    String key = createId(intrinsicState);
    if (!locations.containsKey(key)) {
      locations.put(key, new DeliveryLocation(intrinsicState));
    }
    return locations.get(key);
  }

  private String createId(DeliveryLocationData data) {
    return data.getStreet().replaceAll("\\s+", "").toLowerCase() + "_" +
        data.getCity().replaceAll("\\s+", "").toLowerCase();
  }

  public Map<String, DeliveryFlyweight> getLocations() {
    return locations;
  }
}

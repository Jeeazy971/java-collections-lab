import java.util.Map;
import java.util.HashMap;

public class ServiceHealthRegistry {

    public static void main(String[] args) {
        Map<String, String> servicesRegistry = new HashMap<>();

        servicesRegistry.put("auth-service", "UP");
        servicesRegistry.put("payment-service", "DOWN");
        servicesRegistry.put("email-service", "UP");

        System.out.println("Services:");
        for (String registryKey : servicesRegistry.keySet()) {
            System.out.println(registryKey);
        }
        System.out.println();
        System.out.println("Statuses:");
        for (String registryValue : servicesRegistry.values()) {
            System.out.println(registryValue);
        }
        System.out.println();
        System.out.println("Service details:");
        for (Map.Entry<String, String> registryEntry : servicesRegistry.entrySet()) {
            System.out.println(registryEntry.getKey() + " -> " + registryEntry.getValue());
        }
    }
}

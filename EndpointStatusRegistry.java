import java.util.HashMap;
import java.util.Map;

public class EndpointStatusRegistry {
    
    public static void main(String[] args) {
        Map<String, Integer> endpointStatuses = new HashMap<>();
        
        endpointStatuses.put("/health", 200);
        endpointStatuses.put("/users", 200);
        endpointStatuses.put("/admin", 403);

        int endpointsCount = endpointStatuses.size();
        int adminStatus = endpointStatuses.get("/admin");
        boolean containsUsersEndpoint = endpointStatuses.containsKey("/users");
        endpointStatuses.replace("/admin", 200);
        int updatedAdminStatus = endpointStatuses.get("/admin");
        endpointStatuses.remove("/health");
        int updatedEndpointsCount = endpointStatuses.size();

        System.out.println("Endpoints count: " + endpointsCount);
        System.out.println("Admin status: " + adminStatus);
        System.out.println("Contains /users: " + containsUsersEndpoint);
        System.out.println("Updated admin status: " + updatedAdminStatus);
        System.out.println("Endpoints count after removal: " + updatedEndpointsCount);
    }
}

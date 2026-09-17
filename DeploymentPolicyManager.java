import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class DeploymentPolicyManager {

    public static void main(String[] args) {
        List<String> deploymentSteps = new ArrayList<>();
        Set<String> deploymentEnvironments = new HashSet<>();
        Map<String, Integer> retryLimitsByService = new HashMap<>();

        deploymentSteps.add("build");
        deploymentSteps.add("test");
        deploymentSteps.add("deploy");

        deploymentEnvironments.add("DEV");
        deploymentEnvironments.add("STAGING");
        deploymentEnvironments.add("PROD");

        retryLimitsByService.put("api", 3);
        retryLimitsByService.put("worker", 5);
        retryLimitsByService.put("email", 2);

        boolean containsTest = deploymentSteps.contains("test");
        int testIndex = deploymentSteps.indexOf("test");
        deploymentSteps.set(2, "release");
        deploymentSteps.remove(0);
        int deploymentStepsCount = deploymentSteps.size();

        System.out.println("Contains test: " + containsTest);
        System.out.println("Test index: " + testIndex);
        System.out.println("Deployment steps count: " + deploymentStepsCount);
        System.out.println();

        boolean containsProd = deploymentEnvironments.contains("PROD");
        deploymentEnvironments.remove("STAGING");
        deploymentEnvironments.add("PREPROD");
        deploymentEnvironments.remove("DEV");
        int deploymentEnvironmentsCount = deploymentEnvironments.size();

        System.out.println("Contains PROD: " + containsProd);
        System.out.println("Environments count: " + deploymentEnvironmentsCount);
        System.out.println();

        boolean containsWorker = retryLimitsByService.containsKey("worker");
        Integer workerRetriesBeforeUpdate = retryLimitsByService.get("worker");
        retryLimitsByService.replace("worker", 5, 4);
        Integer workerRetriesAfterUpdate = retryLimitsByService.get("worker");
        retryLimitsByService.remove("email");
        int retryPoliciesCount = retryLimitsByService.size();

        System.out.println("Contains worker: " + containsWorker);
        System.out.println("Worker retries before update: " + workerRetriesBeforeUpdate);
        System.out.println("Worker retries after update: " + workerRetriesAfterUpdate);
        System.out.println("Retry policies count: " + retryPoliciesCount);
    }
}

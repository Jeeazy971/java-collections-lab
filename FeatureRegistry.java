import java.util.Set;
import java.util.HashSet;


public class FeatureRegistry {

    public static void main(String[] args) {
        Set<String> activeFeatures = new HashSet<>();
        activeFeatures.add("analytics");
        activeFeatures.add("export");
        activeFeatures.add("notifications");

        int featuresCount = activeFeatures.size();

        boolean containsExport = activeFeatures.contains("export");
        boolean analyticsAlreadyRegistered = !activeFeatures.add("analytics");

        System.out.println("Features count: " + featuresCount);
        System.out.println("Contains export: " + containsExport);

        if (analyticsAlreadyRegistered) {
            System.out.println("analytics already registered: " + analyticsAlreadyRegistered);
        }

        System.out.println();
        for (String activeFeature : activeFeatures) {
            System.out.println(activeFeature);
        }
    }
}

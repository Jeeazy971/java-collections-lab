import java.util.List;
import java.util.ArrayList;

public class JobQueueManager {

    public static void main(String[] args) {
        List<String> treatments = new ArrayList<>();
        treatments.add("data-import");
        treatments.add("backup");
        treatments.add("report-generation");
        System.out.println("Job count: " + treatments.size());
        System.out.println("Job at index 1: " + treatments.get(1));
        treatments.set(1, "database-backup");
        treatments.remove(0);
        boolean containsReportGeneration = treatments.contains("report-generation");

        for (String treatment : treatments) {
            System.out.println(treatment);
        }
        System.out.println("Contains report-generation: " + containsReportGeneration);
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        ArrayList<Policy> policies = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("PolicyInformation.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                int policyNumber = Integer.parseInt(line.trim());
                String providerName = br.readLine().trim();
                String firstName = br.readLine().trim();
                String lastName = br.readLine().trim();
                int age = Integer.parseInt(br.readLine().trim());
                String smokingStatus = br.readLine().trim();
                double height = Double.parseDouble(br.readLine().trim());
                double weight = Double.parseDouble(br.readLine().trim());

                // Create Policy object and append to list
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Print details of each policy
        for (Policy policy : policies) {
            System.out.println("\nPolicy Information:");
            System.out.println("Policy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder’s First Name: " + policy.getFirstName());
            System.out.println("Policyholder’s Last Name: " + policy.getLastName());
            System.out.println("Policyholder’s Age: " + policy.getAge());
            System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
            System.out.println("Policyholder’s Height: " + policy.getHeight() + " inches");
            System.out.println("Policyholder’s Weight: " + policy.getWeight() + " pounds");
            System.out.println("Policyholder’s BMI: " + String.format("%.2f", policy.calculateBMI()));
            System.out.println("Policy Price: $" + String.format("%.2f", policy.calculateInsurancePrice()));
        }
    }
}
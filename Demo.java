public class Demo {
    public static void main(String[] args) {
        // Creating PolicyHolder objects
        PolicyHolder policyHolder1 = new PolicyHolder("Alice", "Jones", 20, "smoker", 65.0, 110.0);
        PolicyHolder policyHolder2 = new PolicyHolder("Bob", "Lee", 54, "non-smoker", 72.0, 200.0);
        PolicyHolder policyHolder3 = new PolicyHolder("Chester", "Williams", 40, "smoker", 71.0, 300.0);
        PolicyHolder policyHolder4 = new PolicyHolder("Cindy", "Smith", 55, "non-smoker", 62.0, 140.0);
        PolicyHolder policyHolder5 = new PolicyHolder("Jenna", "Lewis", 30, "smoker", 60.0, 105.0);
        PolicyHolder policyHolder6 = new PolicyHolder("Craig", "Duncan", 23, "smoker", 66.0, 215.0);

        // Creating Policy objects with associated PolicyHolders
        Policy policy1 = new Policy("3450", "State Farm", policyHolder1, 700.00);
        Policy policy2 = new Policy("3455", "Aetna", policyHolder2, 675.00);
        Policy policy3 = new Policy("2450", "Met Life", policyHolder3, 836.74);
        Policy policy4 = new Policy("3670", "Global", policyHolder4, 675.00);
        Policy policy5 = new Policy("1490", "Reliable", policyHolder5, 700.00);
        Policy policy6 = new Policy("3477", "State Farm", policyHolder6, 700.00);

        // Displaying information about Policy objects
        System.out.println(policy1);
        System.out.println();
        System.out.println(policy2);
        System.out.println();
        System.out.println(policy3);
        System.out.println();
        System.out.println(policy4);
        System.out.println();
        System.out.println(policy5);
        System.out.println();
        System.out.println(policy6);

        // Displaying additional information
        System.out.println("\nThere were " + Policy.getNumberOfPoliciesCreated() + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + countSmokers(policy1, policy2, policy3, policy4, policy5, policy6));
        System.out.println("The number of policies with a non-smoker is: " + countNonSmokers(policy1, policy2, policy3, policy4, policy5, policy6));
    }

    // Utility methods to count smokers and non-smokers
    public static int countSmokers(Policy... policies) {
        int count = 0;
        for (Policy policy : policies) {
            if (policy.getPolicyHolder().getSmokingStatus().equals("smoker")) {
                count++;
            }
        }
        return count;
    }

    public static int countNonSmokers(Policy... policies) {
        int count = 0;
        for (Policy policy : policies) {
            if (policy.getPolicyHolder().getSmokingStatus().equals("non-smoker")) {
                count++;
            }
        }
        return count;
    }
}
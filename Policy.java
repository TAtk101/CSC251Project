public class Policy {
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    private double policyPrice;

    // Constructor, getters, setters, toString() method
    public Policy(String policyNumber, String providerName, PolicyHolder policyHolder, double policyPrice) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        this.policyPrice = policyPrice;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
    }

    public double getPolicyPrice() {
        return policyPrice;
    }

    public void setPolicyPrice(double policyPrice) {
        this.policyPrice = policyPrice;
    }

    @Override
    public String toString() {
        return "Policy Information:\n" +
                "Policy Number: " + policyNumber + "\n" +
                "Provider Name: " + providerName + "\n" +
                policyHolder + "\n" +
                "Policy Price: $" + String.format("%.2f", policyPrice);
    }
}
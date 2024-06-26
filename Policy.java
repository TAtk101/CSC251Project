public class Policy {
    private String policyNumber;
    private String providerName;

    // Other fields and methods as previously defined...

    public Policy() {
        this("", "");
    }

    public Policy(String policyNumber, String providerName) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
    }

    // Other setters, getters, and methods...

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

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", providerName='" + providerName + '\'' +
                '}';
    }
}
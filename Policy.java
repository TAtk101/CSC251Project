public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private int height;
    private int weight;

    /**
     * Default constructor for Policy class.
     */
    public Policy() {
        this("", "", "", "", 0, "", 0, 0);
    }

    /**
      Constructor for Policy class.
     
      @param policyNumber   
      @param providerName   
      @param firstName      
      @param lastName       
      @param age            
      @param smokingStatus  
      @param height         The height in inches
      @param weight         The weight in pounds
     */
    public Policy(String policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, int height, int weight) {
        this.policyNumber = policyNumber; 
        this.providerName = providerName; 
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    /**
     Sets the policy number
    
     @param policyNumber The policy number
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    /**
     Gets the policy number.
     
     @return The policy number.
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     Sets the name of the insurance provider.
     
     @param providerName The name of the insurance provider.
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     Gets the name of the insurance provider.
    
     @return The name of the insurance provider.
     */
    public String getProviderName() {
        return providerName;
    }

       /**
      Calculates the BMI (Body Mass Index) of the policy holder.
     
     @return The BMI of the policy holder.
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     Calculates the insurance price based on policy holder's age, smoking status, and BMI.
     
     @return The insurance price.
     */
    public double calculateInsurancePrice() {
        double baseFee = 600;
        double additionalFee = 0;

        if (age > 50) {
            additionalFee += 75;
        }
        if (smokingStatus.equals("smoker")) {
            additionalFee += 100;
        }
        double bmi = calculateBMI();
        if (bmi > 35) {
            additionalFee += (bmi - 35) * 20;
        }

        return baseFee + additionalFee;
    }
}
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
     Sets the first name of the policy holder.
     
     @param firstName The first name of the policy holder.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     Gets the first name of the policy holder.
     
     @return The first name of the policy holder.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     Sets the last name of the policy holder.
     
     @param lastName The last name of the policy holder.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     Gets the last name of the policy holder.
   
     @return The last name of the policy holder.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     Sets the age of the policy holder.
     
     @param age The age of the policy holder.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     Gets the age of the policy holder.
     
     @return The age of the policy holder.
     */
    public int getAge() {
        return age;
    }

    /**
      Sets the smoking status of the policy holder.
     
     @param smokingStatus The smoking status of the policy holder.
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    /**
     Gets the smoking status of the policy holder.
     
     @return The smoking status of the policy holder.
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
     Sets the height of the policy holder.
     
     @param height The height of the policy holder (in inches).
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     Gets the height of the policy holder.
     
     @return The height of the policy holder (in inches).
     */
    public int getHeight() {
        return height;
    }

    /**
     Sets the weight of the policy holder.
     
     @param weight The weight of the policy holder (in pounds).
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
      Gets the weight of the policy holder.
     
     @return The weight of the policy holder (in pounds).
     */
    public int getWeight() {
        return weight;
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
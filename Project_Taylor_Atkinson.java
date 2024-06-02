class Demo:
    @staticmethod
    def run():

        # Gather information from the user
        policy_number = input("Please enter the Policy Number: ")
        provider_name = input("Please enter the Provider Name: ")
        first_name = input("Please enter the Policyholder’s First Name: ")
        last_name = input("Please enter the Policyholder’s Last Name: ")
        age = int(input("Please enter the Policyholder’s Age: "))
        smoking_status = input("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ")
        height = float(input("Please enter the Policyholder’s Height (in inches): "))
        weight = float(input("Please enter the Policyholder’s Weight (in pounds): "))

        # Create an instance of the Policy class
        policy = Policy(policy_number, provider_name, first_name, last_name, age, smoking_status, height, weight)

        # Display policy information
        print("\nPolicy Information:")
        print("Policy Number:", policy.get_policy_number())
        print("Provider Name:", policy.get_provider_name())
        print("Policyholder’s First Name:", policy.get_first_name())
        print("Policyholder’s Last Name:", policy.get_last_name())
        print("Policyholder’s Age:", policy.get_age())
        print("Policyholder’s Smoking Status:", policy.get_smoking_status())
        print("Policyholder’s Height:", policy.get_height(), "inches")
        print("Policyholder’s Weight:", policy.get_weight(), "pounds")
        print("Policyholder’s BMI:", round(policy.calculate_bmi(), 2))
        print("Policy Price: ${:.2f}".format(policy.calculate_insurance_price()))


# Run the demo
Demo.run()
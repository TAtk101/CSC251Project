class Policy:
    def __init__(self, policy_number='', provider_name='', first_name='', last_name='', age=0, smoking_status='', height=0, weight=0):
        self.policy_number = policy_number
        self.provider_name = provider_name
        self.first_name = first_name
        self.last_name = last_name
        self.age = age
        self.smoking_status = smoking_status
        self.height = height
        self.weight = weight

    def set_policy_number(self, policy_number):
        self.policy_number = policy_number

    def get_policy_number(self):
        return self.policy_number

    def set_provider_name(self, provider_name):
        self.provider_name = provider_name

    def get_provider_name(self):
        return self.provider_name

    def set_first_name(self, first_name):
        self.first_name = first_name

    def get_first_name(self):
        return self.first_name

    def set_last_name(self, last_name):
        self.last_name = last_name

    def get_last_name(self):
        return self.last_name

    def set_age(self, age):
        self.age = age

    def get_age(self):
        return self.age

    def set_smoking_status(self, smoking_status):
        self.smoking_status = smoking_status

    def get_smoking_status(self):
        return self.smoking_status

    def set_height(self, height):
        self.height = height

    def get_height(self):
        return self.height

    def set_weight(self, weight):
        self.weight = weight

    def get_weight(self):
        return self.weight

    def calculate_bmi(self):
        return (self.weight * 703) / (self.height ** 2)

    def calculate_insurance_price(self):
        base_fee = 600
        additional_fee = 0

        if self.age > 50:
            additional_fee += 75
        if self.smoking_status == 'smoker':
            additional_fee += 100
        bmi = self.calculate_bmi()
        if bmi > 35:
            additional_fee += (bmi - 35) * 20

        return base_fee + additional_fee
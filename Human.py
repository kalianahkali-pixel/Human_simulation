#coding:utf-8

class Human:
	def __init__(self, Name, target_Affinity, gender, Affinity_Rate, Financial_Capacity, Elegance_s_Charm):
		
		self.Name = Name
		self.target_Affinity = target_Affinity
		self.gender = gender
		self.Affinity_Rate = Affinity_Rate
		self.Financial_Capacity = Financial_Capacity
		self.Elegance_s_Charm = Elegance_s_Charm
		
	def toString(self):
		try:
			return f"Name: {self.Name}\nGender: {self.gender}\nAffinity rate: {self.Affinity_Rate}\nFinancial capacity: {self.Financial_Capacity}\nElegance & Charm: {self.Elegance_s_Charm}\nTarget affinity:\n\t {self.target_Affinity.toString()}"
		except:
			return f"Name: {self.Name}\nTarget affinity: {self.target_Affinity}\nGender: {self.gender}\nAffinity rate: {self.Affinity_Rate}\nFinancial capacity: {self.Financial_Capacity}\nElegance & Charm: {self.Elegance_s_Charm}"
			
	def getName(self):
		return self.Name
	def getTargetAffinity(self):
		return self.target_Affinity
	def getGender(self):
		return self.gender
	def getAffinityRate(self):
		return self.Affinity_Rate
	def getFinancialCapacity(self):
		return self.Financial_Capacity
	def getElegance_s_Charm(self):
		return self.Elegance_s_Charm
		
	def setTargetAffinity(self, value):
		self.target_Affinity = value
	def setAffinityRate(self, value):
		self.Affinity_Rate = value
	def setFinancialCapacity(self, value):
		self.Financial_Capacity = value
	def setElegance_s_Charm(self, value):
		self.Elegance_s_Charm = value
		
	def inHarmonyWoman_s_Vision(self, h2):
		if (self.target_Affinity != None and self.gender == "Male" and (h2.getTargetAffinity()).getName() == self.Name):
			if (self.Financial_Capacity >= 3):
				return True
			elif (self.Elegance_s_Charm >= 3):
				if (self.Affinity_Rate >= 3):
					return True
		return False
		
	def inHarmonyMan_s_Vision(self, h1):
		if (self.target_Affinity != None and h1.getGender() == "Female" and (h1.getTargetAffinity()).getName() == self.Name):
			if h1.getElegance_s_Charm() >= 3:
				return True
		return False
		
if __name__ == "__main__":
	h1 = Human("Kalianah", None, "Male", 3, 1, 3)
	h2 = Human('Kali', h1, "Female", 193, 0, 2)
	h1.setTargetAffinity(h2)
	print(h1.inHarmonyWoman_s_Vision(h2))
	print(h1.inHarmonyMan_s_Vision(h2))

package Life;

public class Human {

	String Name;
	Object target_Affinity;	//can take value: null if there is no love target
	String gender;		// male of female
	int Affinity_Rate;	//1 ; 2 ; 3 or 4
	int Financial_Capacity; //1 ; 2 ; 3 or 4 in order from poorest to richest
	int Elegance_s_Charm;  // 1 ; 2 ; 3 or 4 in order of beauty from the most mediocre to the most splendid
	
	
	public Human(String Name, Object target_Affinity, String gender,int Affinity_Rate, int Financial_Capacity, int Elegance_s_Charm) {
	
		this.Name = Name;
		this.target_Affinity = target_Affinity;
		this.gender = gender;
		this.Affinity_Rate = Affinity_Rate;
		this.Financial_Capacity = Financial_Capacity;
		this.Elegance_s_Charm = Elegance_s_Charm;
		
	}
	
	public String toString() {
		
		try {
			String chain = "Name: " + this.Name + "\nAffinity rate: " + this.Affinity_Rate + "\nFinancial capacity: " + this.Financial_Capacity + "\nElegance & Charm: " + this.Elegance_s_Charm + "\n\tTarget: " + this.target_Affinity.toString();
			return chain;
	
		} catch (Exception e) {
			String chain = "Name: " + this.Name + "\nAffinity rate: " + this.Affinity_Rate + "\nFinancial capacity: " + this.Financial_Capacity + "\nElegance & Charm: " + this.Elegance_s_Charm + "\n\tTarget: " + this.target_Affinity;
			return chain;
		}
		
	}
	
	public String getName() { return this.Name;}
	public Object getTargetAffinity() {return this.target_Affinity;}
	public String getGender() {return this.gender;}
	public int getAffinityRate() {return this.Affinity_Rate;}
	public int getFinancialCapacity() {return this.Financial_Capacity;}
	public int getElegance_s_Charm() {return this.Elegance_s_Charm;}
	
	public void setTargetAffinity(Human value) {this.target_Affinity = value;}
	public void setAffinityRate(int value) {this.Affinity_Rate = value;}
	public void setFinancialCapacity(int value) {this.Financial_Capacity = value;}
	public void setElegance_s_Charm(int value) {this.Elegance_s_Charm = value;}
	
	
	public static boolean inHarmonyWoman_s_Vision(Human h1, Human h2) {
	
		if (h1.getTargetAffinity() != null && h1.getGender() == "Male" && ((Human) h2.getTargetAffinity()).getName() == h1.getName()) {
			//quality required in a Male
			if (h1.getFinancialCapacity() >= 3) {
				return true;
			} else if (h1.getElegance_s_Charm() >= 3) {
				if (h1.getAffinityRate() >= 3) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	public static boolean inHarmonyMan_s_Vision(Human h1, Human h2) {
	
		if (h2.getTargetAffinity() != null && h2.getGender() == "Female" && ((Human) h1.getTargetAffinity()).getName() == h2.getName()) {
			//quality required in a Woman
			if (h2.getElegance_s_Charm() >= 3) {return true;}
		}
		return false;
	}
	
}

package peoplealive;

import java.util.Comparator;

public class PeopleData {
	private int birthyear;
	private int deathyear;
	
	@Override
	public String toString() {
		return "PeopleData [birthyear=" + birthyear + ", deathyear=" + deathyear + "]";
	}
	public static class OrderByBirthYear implements Comparator<PeopleData> {

        @Override
        public int compare(PeopleData o1, PeopleData o2) {
            return o1.deathyear > o2.deathyear ? 1 : (o1.deathyear < o2.deathyear ? -1 : (o1.birthyear > o2.birthyear? 1 : -1));
        }
    }

	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public int getDeathyear() {
		return deathyear;
	}
	public void setDeathyear(int deathyear) {
		this.deathyear = deathyear;
	}
}

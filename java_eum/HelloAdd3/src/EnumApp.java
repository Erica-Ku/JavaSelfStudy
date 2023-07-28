//==========
// 열거형 Example
//==========

enum Season {
	SPRING, SUMMER, FALL, WINTER
}

public class EnumApp {

	public static void main(String[] args) {
		Season aSeason = null;
		aSeason = Season.WINTER;
		Season theSeason = Season.SUMMER;
		
		String seasonName = aSeason.name();
		System.out.println(seasonName);
		
		int diff = aSeason.compareTo(theSeason);
		System.out.println(diff);
		System.out.println(theSeason.compareTo(aSeason));
		
		int ordinal = theSeason.ordinal();
		System.out.println(ordinal);
	}
}
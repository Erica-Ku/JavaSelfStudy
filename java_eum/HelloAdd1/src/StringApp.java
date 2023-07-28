//==========
// String class Example
//==========

public class StringApp {

	public static void main(String[] args) {
		String snum = "20151234";
		String sname = new String("임양미");
		String dept = "디지털미디어학과";
		String hobby = new String("reading");
		
		String snumSname = snum.concat(sname);
		System.out.println(snumSname);
		System.out.println(snum.compareTo("20151234"));
		System.out.println(snum.compareTo("20153333"));
		System.out.println(sname.replace('임', '강'));
		System.out.println(sname);
		System.out.println(dept.substring(0, 6));
		System.out.println(dept.substring(6));
		System.out.println(dept.length());
		System.out.println(hobby.indexOf('a'));
		System.out.println(hobby.concat(" books"));
		System.out.println(hobby.toUpperCase());
		System.out.println(dept.equals("디지털미디어학과"));
		sname = snumSname;
		System.out.println(sname);
	}
}

public class P4 {
	//string methods
	public static void main(String[] args) {
		String a = "java practice";
		String b = "   Java practice   ";
		char cha = a.charAt(7);
		System.out.println(cha);
	    int indexOf =a.indexOf('r');
	    System.out.println(indexOf);
	    int lif = a.lastIndexOf('e');
	    System.out.println(lif);
	    String up = a.toUpperCase();
	    System.out.println(up);
	    String lc = a.toLowerCase();
	    System.out.println(lc);
	    boolean em = a.isEmpty();
	    System.out.println(em);
	    boolean sw = a.startsWith("ja");
	    System.out.println(sw);
	    boolean ew = a.endsWith("ce");
	    System.out.println(ew);
	    boolean cn = a.contains("java");
	    System.out.println(cn);
	    boolean eq = a.equals(b);
	    System.out.println(eq);
	    boolean eqic = a.equalsIgnoreCase(b);
	    System.out.println(eqic);
//	    ASCII upp->65 to 90 and Lower->97 to 122
	    int cmt = a.compareTo(a);
	    System.out.println(cmt);
	    int lg = a.length();
	    System.out.println(lg);
	    String rp = a.replace('j', 'J');
	    System.out.println(rp);
	    String rpall = b.replaceAll("Java","code");
	    System.out.println(rpall);
	    String tm = b.trim();
	    System.out.println(tm);
	    String sbs = a.substring(5); 
	    System.out.println(sbs);
	    String sbste = a.substring(5, 13);
	    System.out.println(sbste);
	    String cc = a.concat(tm);
	    System.out.println(cc);
	    String c ="object oriented programming ";
	    String[] sp = c.split(" ");
	    for(String s :sp)
	    {
	    	System.out.println(s);
	    }
	    
	}

}

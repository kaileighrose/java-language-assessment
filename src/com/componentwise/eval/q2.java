public class UserKey {

    private String name;
    private String userid;

    public UserKey(String name, String userid) {
        this.name = name;
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public String getUserID() {
        return userid;
    }

    UserKey b1 = new UserKey(“Bill Smith”, “BSMITH”);
    UserKey b2 = new UserKey(“Bill Smith”, “BSMITH”);
    UserKey b3 = new UserKey(“Susan Smith”, “SSMITH”);
    UserKey b4 = new UserKey(null,null);

System.out.println( b1.equals(b1) );  // prints true
System.out.println( b1.equals(b2) );  // prints true
System.out.println( b1.equals(b3) );  // prints false
System.out.println( b1.equals(null) ); // prints false
System.out.println( b1.equals(“Some String”) ); // prints false
System.out.println( b4.equals(b1) ); // prints false

    java.util.Hashtable ht = new java.util.Hashtable();

ht.put(b1,”Some Data”);

    String s = (String) ht.get(b2);

System.out.println( s.equals(“Some Data”) );
}

// Test Code (ensure the results are as indicated in the comments):

 // prints true
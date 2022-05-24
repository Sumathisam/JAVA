public class TwoStringIgnoreCase {
public static void main(string[]args)) {
String col1 = "Stephen Edwin King";
String col2 = "Walter Winchell";
String col3 = "stephen Edwin King";
boolen equals1 = col1.equalsIgnoreCase(col2);
boolen equals2 = col1.equalsIgnorecase(col3);
System.out.println("\"" + col1 + "\" equals \"" + col2 + "\"? " + equals1);
Syteam.out.println("\"" + col1 + "\" equals \"" + col3 + "\"? " + equals2);
}
}
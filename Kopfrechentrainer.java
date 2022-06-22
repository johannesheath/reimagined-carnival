public class Kopfrechentrainer {
  public static void main (String[] arguments) {
    int x = Zufall.getInt();
    int y = Zufall.getInt();
    System.out.println(x + " + " + y);
    System.out.println("=");
    int z = Kon.readInt();
    int anzahl = 0;
    
    while (z == x + y) {
      anzahl = anzahl + 1;
      x = Zufall.getInt();
      y = Zufall.getInt();
      System.out.println(x + " + " + y);
      System.out.println("=");
      z = Kon.readInt();
    }
    
    if (z != x + y) {
      System.out.println("Da hast du einen Fehler gemacht!");
      System.out.println(x + " + " + y + " ergibt " + (x + y) + "(!)");
      System.out.println("Du hast insgesamt " + anzahl + " Aufgaben gelöst.");
    }
  }
}

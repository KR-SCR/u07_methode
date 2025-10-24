public class Start
{
   public static void main(String[] args)
   {
      Rechner rechner = new Rechner();

      int zahl = 17;
      int kubikZahl = rechner.hochDrei(zahl);
      System.out.println(kubikZahl);      
   }
}

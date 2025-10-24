import java.io.*;

public class Start
{
   public static void main(String[] args) throws Exception
   {
      Rechner rechner = new Rechner();

      InputStreamReader eingabeLeser;
      BufferedReader    pufferLeser;

      eingabeLeser = new InputStreamReader(System.in);
      pufferLeser = new BufferedReader(eingabeLeser);

      System.out.print("Welche Zahl wollen Sie mir 3 potenzieren? ");
      String zahlString = pufferLeser.readLine();
      int zahl = Integer.parseInt(zahlString);

      int kubikZahl = rechner.hochDrei(zahl);
      System.out.println(kubikZahl);      
   }
}

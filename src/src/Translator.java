import java.util.HashMap;

public class Translator {



  private HashMap<Integer, String> numericAlpha = new HashMap<>();

    public Translator(String[] alphabetic, int[] numeric){

        for(int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    public String translate(Integer number){
        return "The translation of your number " + number + " in text is: " + numericAlpha.get(number);
    }

//Hoe roep ik de arrays aan en stop ik deze via de methode in de hashmap?
    // welke andere measedfasdfasdfathodes kan je schrijven met dezelfde resultaat voor het opslaan in een hashmap oid.....???


}

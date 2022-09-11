package radioStation.ScheduleRadio;

public class CarAdverts implements Adverts{

    public CarAdverts(){}

    //default variable's values
    String nameAdverts = "Ford";
    private final int getTimeAdverts = (int) (15 + Math.random() * 70); // time in seconds

    final static int priceAdverts = 5; // cost of one second adverts.


    @Override
    public double getBenefitAdverts() {
        return getTimeAdverts * priceAdverts;
    }

    String []arrAdverts = {"Lexus", "Pampers", "Comfy", "Zara", "Athletics", "ЖК Comfort City", "ATБ", "Rozetka" };

    private final int generationAdverts = (int) (Math.random()* arrAdverts.length);

    public String getNameAdverts(String []arrAdverts){
        for(int i =0; i< arrAdverts.length; i++){
            if(generationAdverts == i) nameAdverts = arrAdverts[i];
        }
        return nameAdverts;
    }

    @Override
    public void getInfoAdverts() {
        System.out.println("\nMinute of adverts:\nAdverts is going " + getTimeAdverts + " seconds about " + getNameAdverts(arrAdverts));
    }

    @Override
    public int getTimeAdverts() {
        return getTimeAdverts;
    }
}

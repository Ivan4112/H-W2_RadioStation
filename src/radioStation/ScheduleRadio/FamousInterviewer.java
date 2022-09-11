package radioStation.ScheduleRadio;

public class FamousInterviewer implements Interview{

    public FamousInterviewer(){}

    String nameInterviewer = "Volodymyr Zelensky";

    final static double priceInterview = 0.5; // euro for one second

    public double getBenefitInterview() {
        return getTimeInterview * priceInterview;
    }

    private final int getTimeInterview = (int) (180 + Math.random() * 360); // time of interview in seconds

    String []arrInterview = {"Volodymyr Zelensky", "Boris Jonsonyk", "Joe Baydon", "Ryan Reinold", "Ramses III", "Dmitrii Gorgon"};

    private final int generationInterviewer = (int) (Math.random()* arrInterview.length);

    public String getNameInterviewer(String []arrInterview){
        for(int i = 0; i < arrInterview.length; i++){
            if(generationInterviewer == i) nameInterviewer = arrInterview[i];
        }
        return nameInterviewer;
    }

    @Override
    public void getInfoInterview() {
        System.out.println("\nToday our guest is " + getNameInterviewer(arrInterview));
    }

    @Override
    public int getTimeInterview() {
        return getTimeInterview;
    }
}

package radioStation.Presenter;

public class PresenterHire implements Presenter{

    private String name  = "Anton";
    private int experience = 5;
    private String schedule = "interview, advertise break, listening music";


    public PresenterHire(String name, int experience, String schedule) {
        this.name = name;
        this.experience = experience;
        this.schedule = schedule;
    }

    public PresenterHire() {

    }

    @Override
    public void getInfoPresenter() {
        System.out.printf("Today is working " + name + " with experience " + experience + " and will be next schedule " + schedule + "\n");
    }
}
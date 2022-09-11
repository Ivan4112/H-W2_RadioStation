package radioStation.Presenter;

public class PresenterWork implements Presenter{
    private String name = "Andrei";
    private int experience = 2;
    private String schedule = "listening music, advertise break, interview";

    public PresenterWork(String name, int experience, String schedule) {
        this.name = name;
        this.experience = experience;
        this.schedule = schedule;
    }

    public PresenterWork() {

    }

    @Override
    public void getInfoPresenter() {
        System.out.println("Today is working " + name + " with experience " + experience + " and will be next schedule " + schedule + "\n");
    }
}

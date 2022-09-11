package radioStation.Presenter;

import radioStation.ScheduleRadio.*;

public class UnemploymentPresenter extends RadioFactory{
    @Override
    public Presenter newPresenter() {
        return new PresenterHire("Maks", 2, "interview, advertise break, listening music");
    }

    @Override
    public Music getMusic() {
        return new UkraineMusic();
    }

    @Override
    public Adverts getAdverts() {
        return new CarAdverts();
    }

    @Override
    public Interview getInterview() {
        return new FamousInterviewer();
    }
}

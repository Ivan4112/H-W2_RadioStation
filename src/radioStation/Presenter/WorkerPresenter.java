package radioStation.Presenter;

import radioStation.ScheduleRadio.*;

public class WorkerPresenter extends RadioFactory{
    @Override
    public Presenter newPresenter() {
        return new PresenterWork("Ivan", 3, "listening music, advertise break, interview");
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

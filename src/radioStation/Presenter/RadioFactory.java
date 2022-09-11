package radioStation.Presenter;

import radioStation.ScheduleRadio.Music;
import radioStation.ScheduleRadio.ScheduleFactory;

public abstract class RadioFactory implements ScheduleFactory {
    public abstract Presenter newPresenter();
}

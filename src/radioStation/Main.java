/*В програмі було використано два патерни проєктування:
1 фабричний метод, який реалізує вибір Ведучого для радіостанції,
тому що для радіостанції не важливо, який саме буде ведучий буде вести
програму, для нього буде важливим, щоб ці об'єкти виконували методи
трансляції програми.
2 абстрактна фабрика використана для реалізації розкладу радіостанції, щоб
було зручно додавати нові типи реклам, інтерв'ю та пісень, які мають
загальний інтерфейс, при цьому не змінюючи інші класи та зв'язки між ними.
 */

package radioStation;

import radioStation.Presenter.Presenter;
import radioStation.Presenter.RadioFactory;
import radioStation.Presenter.UnemploymentPresenter;
import radioStation.Presenter.WorkerPresenter;
import radioStation.ScheduleRadio.Adverts;
import radioStation.ScheduleRadio.Interview;
import radioStation.ScheduleRadio.Music;
import radioStation.ScheduleRadio.ScheduleFactory;

import java.util.Random;
import java.util.Scanner;

public class Main {

    final static int timeAllProgram = 1800; // time in seconds

    public static void main(String[] args) {
        run();
    }

    private static RadioFactory choosePresenter() {
        int generationPresenter = new Random().nextInt(2) + 1;
        RadioFactory radioFactory = getRadioFactory(generationPresenter);

        Presenter presenter;
        if(radioFactory!=null) {
            presenter = radioFactory.newPresenter();
            presenter.getInfoPresenter();
        }
        return radioFactory;
    }

    private static RadioFactory getRadioFactory(int generationPresenter) {
        RadioFactory radioFactory = switch (generationPresenter) {
            case 1 -> new WorkerPresenter();
            case 2 -> new UnemploymentPresenter();
            default -> null;
        };
        return radioFactory;
    }

    public static int totalSpendTimeProgram(int time){
        int timeProgram = 0;
        timeProgram += time;
        return timeProgram;
    }

    private static void run() {
        ScheduleFactory scheduleFactory = choosePresenter();
        int controllerProgram = -1;
        int spentTimeProgram = 0;
        double sumProfitAdverts = 0;
        double sumProfitInterview = 0;
        double allProfit;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Controller's menu\n1. Switch on music\n2. Switch on adverts\n3. Switch on interview");

        while (spentTimeProgram < timeAllProgram) {
            controllerProgram = scanner.nextInt();

            switch (controllerProgram){
                case 1:
                    int timeMusic = 0;
                    Music music = scheduleFactory.getMusic(); music.getInfoMusic();
                    timeMusic += totalSpendTimeProgram(music.getTimeMusic());
                    spentTimeProgram += timeMusic;
                    break;

                case 2:
                    int timeAdverts = 0;
                    Adverts adverts = scheduleFactory.getAdverts(); adverts.getInfoAdverts();
                    timeAdverts += totalSpendTimeProgram(adverts.getTimeAdverts());
                    spentTimeProgram += timeAdverts;
                    sumProfitAdverts += adverts.getBenefitAdverts();
                    break;

                case 3:
                    int timeInterview = 0;
                    Interview interview = scheduleFactory.getInterview(); interview.getInfoInterview();
                    timeInterview += totalSpendTimeProgram(interview.getTimeInterview());
                    spentTimeProgram += timeInterview;
                    sumProfitInterview += interview.getBenefitInterview();
                    break;

                case 0: break;
                default:
                    System.out.println("Input correct number\n");
            }
        }
        allProfit = sumProfitAdverts + sumProfitInterview;

        System.out.println("Broadcast has ended\nTotal profit about program = " + allProfit + " euros");
    }
}

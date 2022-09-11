package radioStation.ScheduleRadio;

public class UkraineMusic implements Music{
    String nameSinger = "Chico&Qatoshi";
    String nameSong = "Ластівки";

    final static int timeMusic = 180; // time in seconds

    public UkraineMusic(){}

    String []arrSinger = {"Chico&Qatoshi", "NK", "Yarmak", "Kalush", "The Hardkiss", "Океан Ельзи", "TAYNA", "DOROFEEVA" };
    String []arrSongs = {"Ластіки", "Кришталь", "Моя країна", "Стефаніє", "Як ти?", "Обійми", "Я пам'ятаю", "Крапають" };

    private final int generationMusic = (int) (Math.random()* arrSongs.length);

    public String getNameSong(String []arrSongs){
        for(int i = 0; i < arrSongs.length;i++){
            if(generationMusic==i) nameSong = arrSongs[i];
        }
        return nameSong;
    }

    public String getNameSinger(String []arrSinger){
        for (int i = 0; i<arrSinger.length; i++) {
            if(generationMusic == i) nameSinger = arrSinger[i];
        }
        return nameSinger;
    }
    @Override
    public void getInfoMusic() {
        System.out.println("\nRubric Ukraine's music:\n"+getNameSong(arrSongs)+" - " + getNameSinger(arrSinger));
    }
    @Override
    public int getTimeMusic() {
        return timeMusic;
    }
}

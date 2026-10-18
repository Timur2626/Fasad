public class Amplifier {
    public void on() {
        System.out.println("Усилитель включен");
    }

    public void off() {
        System.out.println("Усилитель выключен");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println("Усилитель настроен на потоковый плеер");
    }

    public void setSurroundSound() {
        System.out.println("Усилитель: включен режим объемного звука (5 колонок, 1 сабвуфер)");
    }

    public void setVolume(int level) {
        System.out.println("Усилитель: громкость установлена на " + level);
    }
}
public class StreamingPlayer {
    public void on() {
        System.out.println("Плеер включен");
    }

    public void off() {
        System.out.println("Плеер выключен");
    }

    public void play(String movie) {
        System.out.println("Плеер воспроизводит \"" + movie + "\"");
    }

    public void stop() {
        System.out.println("Плеер остановлен");
    }
}
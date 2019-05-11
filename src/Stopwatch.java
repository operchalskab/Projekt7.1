public class Stopwatch {

    private long startTime;

    public Stopwatch() {
        reset();
    }

    public void reset(){
        this.startTime = System.currentTimeMillis();
    }

    public void show(){
        long stopTime = System.currentTimeMillis();
        System.out.println(" czas " + (stopTime - startTime) + " ms");
    }

}

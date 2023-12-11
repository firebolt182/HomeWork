package firebolt.example.homework3.ex2;

public class Camera {
    private String name;
    private int zoom;
    private boolean hasFlash;

    public Camera(String name, int zoom, boolean hasFlash) {
        this.name = name;
        this.zoom = zoom;
        this.hasFlash = hasFlash;
    }
    public String printFlash(boolean hasFlash) {
        if (hasFlash) {
            return ", есть вспышка";
        }
        return "";
    }
    //камеру Samsung(20x zoom).
    @Override
    public String toString() {
        return name + "(" + zoom + "x zoom" + printFlash(hasFlash) + ")";

    }
}

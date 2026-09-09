abstract class Device {
    String brand = "Samsung";
    abstract void turnOn();
    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}
interface Camera {
    int max_zoom = 10; // public, static and final
    void takePhoto(); 
    default void cameraInfo() {
        System.out.println("Camera is ready ");
    }
}
interface MusicSystem {
    String type="Digital"; // public, static and final
    void playMusic();
    default void musicInfo() {
        System.out.println("Music system is ready");
    }
}
public class Abstract_interface extends Device implements Camera, MusicSystem {
    void turnOn() {
        System.out.println("Device is turned on");
    }
    public void takePhoto() {
        System.out.println("Taking photo with max zoom: " + max_zoom);
    }
    public void playMusic() {
        System.out.println("Playing music of type: " + type);
    }
    public static void main(String[] args) {
        Abstraction device = new Abstraction();
        device.turnOn();
        device.showBrand();
        device.takePhoto();
        device.cameraInfo();
        device.playMusic();
        device.musicInfo();
    }
}
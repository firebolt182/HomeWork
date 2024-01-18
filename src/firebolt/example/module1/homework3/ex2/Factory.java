package firebolt.example.module1.homework3.ex2;

public class Factory {
    public void assembly(Samsung samsung) {
        samsung.setOperationSystem("Android");
        samsung.setBoard(new Board("j-108", 10, 12, 13));
        samsung.setCamera(new Camera("Samsung", 20, false));
        System.out.println(samsung);

    }

    public void assembly(Iphone iphone) {
        iphone.setOperationSystem("Ios");
        iphone.setBoard(new Board("7uik", 15, 12, 13));
        iphone.setCamera(new Camera("iphone", 15, true));
        System.out.println(iphone);
    }
}

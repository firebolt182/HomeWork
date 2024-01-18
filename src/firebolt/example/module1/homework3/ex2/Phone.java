package firebolt.example.module1.homework3.ex2;

public abstract class Phone {
    protected String model;
    protected String operationSystem;
    Board board;
    Camera camera;

    public Phone(String model) {
        this.model = model;
    }


    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }


    public void setBoard(Board board) {
        this.board = board;
    }


    public void setCamera(Camera camera) {
        this.camera = camera;
    }
    //1 тип: Samsung galaxy. Имеет операционную систему Android,
    //камеру Samsung(20x zoom).
    @Override
    public String toString() {
        return model + ". Имеет операционную систему " + operationSystem + ", плату "
                + board + ", камеру " + camera;
    }
}

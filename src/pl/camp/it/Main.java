package pl.camp.it;

public class Main {
    public static void main(String[] args) {
        CarRepository cr = new CarRepository();
        cr.getCarList();
        cr.jade(10);
        cr.szczekam();

        ICarRepository iCarRepository = new CarRepository();
        iCarRepository.getCarList();
        iCarRepository.jade(15);
        iCarRepository.szczekam();

        //AbstractClass abstractClass = new AbstractClass();

        AbstractClass abstractClass = new AbstractClassImpl();
    }
}

package pl.camp.it;

public class CarRepository implements ICarRepository {

    @Override
    public void getCarList() {
        System.out.println("Car List");
        System.out.println(this.a);
    }

    @Override
    public void szczekam() {
        System.out.println("Hau hau");
    }

    @Override
    public void jade(int szybkosc) {
        System.out.println("Jade " + szybkosc + " na godzinę !!");
    }

    @Override
    public void metoda() {

    }

    public void a() {

    }

}

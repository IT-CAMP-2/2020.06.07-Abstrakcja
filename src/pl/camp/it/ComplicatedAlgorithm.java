package pl.camp.it;

public abstract class ComplicatedAlgorithm {

    abstract void loadData();
    void stage1() {

    }
    void stage2() {

    }
    void stage3() {

    }
    abstract void uploadData();

    public void calculate() {
        loadData();
        stage1();
        stage2();
        stage3();
        uploadData();
    }
}

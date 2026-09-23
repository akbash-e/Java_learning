package section21_inheritans2;

public class WeightBox extends Box{

    private double weight;


    public WeightBox(double legth, double width, double height, double weight) {
        super(legth, width, height);
        this.weight = weight;
    }

    public WeightBox(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight: " + weight);
    }


}

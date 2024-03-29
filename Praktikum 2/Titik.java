// MUHAMMAD ANUGERAH RAMADHAN , 24060122140180

public class Titik {
    private double x;
    private double y;

    public Titik(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public Titik refleksiSumbuX(){
        return new Titik(this.x, -this.y);
    }

    public Titik refleksiSumbuY(){
        return new Titik(-this.x, this.y);
    }

    public Titik PublicRefleksiX(){
        return PRefleksiX();
    }

    public Titik PublicRefleksiY(){
        return PRefleksiY();
    }

    private Titik PRefleksiX(){
        return new Titik(this.x, -this.y);
    }

    private Titik PRefleksiY(){
        return new Titik(-this.x, this.y);
    }
}

public class CorpoCeleste {

    private float massa;
    private float densidade;
    private float posx;
    private float posy;

    public float getmassa() {
        return this.massa;
    }

    public void setmassa(float massa) {
        this.massa = massa;
    }

    public float getdensidade() {
        return this.densidade;
    }

    public void setdensidade(float densidade) {
        this.densidade = densidade;
    }

    public float getposx() {
        return this.posx;
    }

    public void setposx(float posx) {
        this.posx = posx;
    }

    public float getposy() {
        return this.posy;
    }

    public void setposy(float posy) {
        this.posy = posy;
    }

    public CorpoCeleste(float massa, float densidade, float posx, float posy) {
        this.massa = massa;
        this.densidade = densidade;
        this.posx = posx;
        this.posy = posy;

    }

    @Override
    public String toString() {
        return "[Massa: " + massa + ", Densidade: " + densidade + ", PosX: " + posx + ", PosY: " + posy + "]";
    }

}

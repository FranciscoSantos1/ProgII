public class LoteMaterial extends Lote{
    private float qtdTon;

    public LoteMaterial(int numLote){
        super(numLote);
        qtdTon = 0;
    }

    public LoteMaterial(int numLote, float qtdTon){
        super(numLote);
        this.qtdTon = qtdTon;
    }

    public float getQtdTon() {
        return qtdTon;
    }

    public void setQtdTon(float qtdTon) {
        this.qtdTon = qtdTon;
    }

    public String getDescrLote(){
        return "Lote de Material com " + qtdTon;
    }

    @Override
    public Lote clone() {
        LoteMaterial lote = new LoteMaterial(this.getNumLote());
        lote.setQtdTon(this.qtdTon);

        return lote;
    }
}

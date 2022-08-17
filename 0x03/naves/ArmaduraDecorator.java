public class ArmaduraDecorator extends NaveEspacialDecorator{
    public ArmaduraDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial);
    }

    @Override
    public int getSaude() {
        return super.naveEspacial.getSaude() + 150;
    }
}

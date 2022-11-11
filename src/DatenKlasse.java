public class DatenKlasse
{
    String name;
    final int finalerInt;
    int nichtFinalerInt;

    DatenKlasse(String name, int finalerParameter, int nichtFinalerParameter)
    {
        this.name = name;
        finalerInt = finalerParameter;
        nichtFinalerInt = nichtFinalerParameter;
    }

    public void WennEinNerzErscheint()
    {
        // einFinalerInt++;
    }

    public void BeschreibeDich()
    {
        System.out.println("Ich bin " + name + " und mein finalerInt ist " + finalerInt);
    }
}

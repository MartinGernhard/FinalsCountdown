import java.util.ArrayList;

public class AnderesProgramm
{
    ArrayList<DatenKlasse> alleDaten = new ArrayList<>();

    public void beschreibtEuchAlle()
    {
        for(DatenKlasse d : alleDaten)
        {
            d.BeschreibeDich();
        }
    }


    public void start()
    {
        DatenKlasse nerzbert = new DatenKlasse("Nerzbert", 17, 45);
        DatenKlasse nerzline = new DatenKlasse("Nerzline", 42, 90);
        alleDaten.add(nerzbert);
        alleDaten.add(nerzline);

        beschreibtEuchAlle();
    }
}

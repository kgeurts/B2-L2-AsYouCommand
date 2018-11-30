public class Igor
{
    public String name = "Igor";
    boolean IsOpSlot = false;


    public Igor(String newName)
    {
        name = newName;
    }

    public void RoepNaam()
    {
        System.out.println(name);
    }

    public void OpenDeur() {

        if (IsOpSlot == true) {

            System.out.println("De deur is op slot!");
            System.out.println("Controle: " + IsOpSlot);
            System.out.println("Igor bestormt de deur en breekt hem door midden!!!");
        } else {
            System.out.println("De deur is nu open!");
            System.out.println("Controle: " + IsOpSlot);
        }}
    }



public class S  implements TipoS{
    public void CambiarBocinas(){
        boolean bocina = true;
        if (bocina){
            System.out.println("\nCAMBIANDO A AERICULARES\n");
            bocina = false;
            
        }
        else {
            System.out.println("\nCAMBIANDO A BOCINA\n");
            bocina = true;
        }
        
    }
    public void Planificcar(){
        System.out.println("\nPLANIFICANDO VACACIONES\n");
        String vacaciones = "  *  / \\_ *  / \\_      _  *        *   /\\'__        *\n" +
        "      /    \\  /    \\,   ((        .    _/  /  \\  *'.\n" +
        " .   /\\/\\  /\\/ :' __ \\_  `          _^/  ^/    `--.\n" +
        "    /    \\/  \\  _/  \\-'\\      *    /.' ^_   \\_   .'\\  *\n" +
        "  /\\  .-   `. \\/     \\ /==~=-=~=-=-;.  _/ \\ -. `_/   \\\n" +
        " /  `-.__ ^   / .-'.--\\ =-=~_=-=~=^/  _ `--./ .-'  `-\n" +
        "/jgs     `.  / /       `.~-^=-=~=^=.-'      '-._ `._";
        System.out.println(vacaciones);

    }
}

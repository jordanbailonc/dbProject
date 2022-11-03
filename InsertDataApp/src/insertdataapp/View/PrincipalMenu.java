
package insertdataapp.View;

public class PrincipalMenu extends Menu{
    public PrincipalMenu(){
        super.setTitle("Menu Principal");
        addOption(new Option("Salir", "salir"));
        addOption(new Option("Añadir Info", "añadir_info"));
        addOption(new Option("Modificar Info", "modificar_info"));
        addOption(new Option("Borrar Info", "borrar_info"));
        addOption(new Option ("Listar Info","list_info"));
    }
    
}

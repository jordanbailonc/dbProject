package insertdataapp.View;

public class ModifyMenu extends Menu{
    public ModifyMenu(){
        super.setTitle("Menu de Modificación de Datos");
        addOption(new Option("Salir", "salir"));
        addOption(new Option("Modificar Usuario", "modificar_usuario"));
        addOption(new Option("Modificar Escuela", "modificar_escuela"));
        addOption(new Option("Modificar Publicador", "modificar_publicador"));
        addOption(new Option("Modificar PPOC", "modificar_ppoc"));
        addOption(new Option("Modificar Precursor", "modificar_precursor"));
        addOption(new Option("Modificar Ministerial", "modificar_ministerial"));
        addOption(new Option("Modificar Anciano", "modificar_anciano"));
        addOption(new Option("Volver al Menú Principal","volver_menu_principal"));
    }
    
}

package insertdataapp.View;

public class InsertMenu extends Menu {

    public InsertMenu() {
        super.setTitle("Menu de Inserciones de Datos");
        addOption(new Option("Salir", "salir"));
        addOption(new Option("Añadir Usuario", "añadir_usuario"));
        addOption(new Option("Añadir Escuela/Maestros", "añadir_escuela"));
        addOption(new Option("Añadir Publicador", "añadir_publicador"));
        addOption(new Option("Añadir PPOC", "añadir_ppoc"));
        addOption(new Option("Añadir Precursor", "añadir_precursor"));
        addOption(new Option("Añadir Ministerial", "añadir_ministerial"));
        addOption(new Option("Añadir Anciano", "añadir_anciano"));
        addOption(new Option("Volver al Menú Principal","volver_menu_principal"));
    }

}

package insertdataapp.View;

public class DeleteMenu extends Menu{
    public DeleteMenu(){
        super.setTitle("Menu de Eliminación de Datos");
        addOption(new Option("Salir", "salir"));
        addOption(new Option("Eliminar Usuario", "eliminar_usuario"));
        addOption(new Option("Eliminar de la Escuela", "eliminar_de_escuela"));
        addOption(new Option("Eliminar Publicador", "eliminar_publicador"));
        addOption(new Option("Eliminar PPOC", "eliminar_ppoc"));
        addOption(new Option("Eliminar Precursor", "eliminar_precursor"));
        addOption(new Option("Eliminar Ministerial", "eliminar_ministerial"));
        addOption(new Option("Eliminar Anciano", "eliminar_anciano"));
        addOption(new Option("Volver al Menú Principal","volver_menu_principal"));
    }
    
}

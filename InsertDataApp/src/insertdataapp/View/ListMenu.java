package insertdataapp.View;

public class ListMenu extends Menu{
    public ListMenu(){
        super.setTitle("List Menu");
        addOption(new Option("Salir","salir"));
        addOption(new Option("Listar Todos Los Usuarios","list_all_usuarios"));
        addOption(new Option("Listar Usuario Por ID","list_user_by_id"));
        addOption(new Option("Listar Usuario por correo","list_user_by_correo"));
        addOption(new Option("Listar Todos Los Publicadores","list_all_publicadores"));
        addOption(new Option("Listar Publicadores Por Nombre","list_all_publicadores_by_nombre"));
        addOption(new Option("Listar Publicadores Por Fecha Antes de","list_all_publicadores_by_fecha_antes"));
        addOption(new Option("Listar Publicadores Por Fecha Despues de","list_all_publicadores_by_fecha_despues"));
        addOption(new Option("Listar Publicadores Por Grupo","list_all_publicadores_by_grupo"));
        addOption(new Option("Listar Publicadores en Ppoc","list_all_publicadores_ppoc"));
        addOption(new Option("Listar Publicadores Precursores Regulares","list_all_publicadores_precus_regulares"));
        addOption(new Option("Listar Precursores desde (mm/aaaa)","list_precursores_desde_fecha"));
        addOption(new Option("Listar Precursores Regulares de Continuo","list_precursores_continuo"));
        addOption(new Option("Listar Precursores por fecha Escuela","list_precusores_fecha_escuela"));
        addOption(new Option("Listar Todos Los Ministeriales","list_all_ministeriales"));
        addOption(new Option("Listar Ministeriales Auxiliares Grupo","list_ministeriales_auxiliares"));
        addOption(new Option("Listar Ministeriales por fecha nombramiento","list_ministeriales_fecha_nombramiento"));
        addOption(new Option("Listar Todos los Ancianos","list_ancianos"));
        addOption(new Option("Listar Ancianos por Fecha","list_ancianos_fecha"));
        addOption(new Option("Volver al Menú Principal","volver_menu_principal"));
    }
}

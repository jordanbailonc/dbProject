package insertdataapp.Controller;

import insertdataapp.Model.Model;
import insertdataapp.View.MainView;
import java.util.Scanner;

public class Controller {

    private final Model model;
    private MainView panel;

    public Controller(Model model) {
        this.model = model;

    }

    public MainView getPanel() {
        return panel;
    }

    public void setPanel(MainView panel) {
        this.panel = panel;
    }

    public void executeAction(String action) {
        switch (action) {
            /**
             * LOGIN PART *
             */
            case "salir" -> {
                exitApp();
            }
            case "entrar_app" -> {
                printMessage("Aqui testeamos la entrada");
                panel.setView(panel.getAllMenus().get(1));
            }
            case "volver_menu_principal" -> {
                printMessage("Volviendo al Menú Principal");
                panel.setView(panel.getAllMenus().get(1));
            }
            case "cambiar_contraseña" -> {
                printMessage("Aqui se cambia la contraseña");
            }
            case "eliminar_todos_datos" -> {
                printMessage("Aquí te eliminamos todos tus datos");
            }
            /**
             * OPCIONES MENU PRINCIPAL*
             */
            case "añadir_info" -> {
                printMessage("Accediendo al Menu de Inserciones");
                panel.setView(panel.getAllMenus().get(2));
            }
            case "modificar_info" -> {
                printMessage("Accediendo al Menu de Modificaciones");
                panel.setView(panel.getAllMenus().get(3));
            }
            case "borrar_info" -> {
                printMessage("Accediendo al Menu de eliminacióin de Datos");
                panel.setView(panel.getAllMenus().get(4));
            }
            case "list_info" -> {
                printMessage("Accediendo al Menu de Listados");
                panel.setView(panel.getAllMenus().get(5));
            }
            /**
             * OPCIONES AÑADIR*
             */
            case "añadir_usuario" -> {
                printMessage("Vamos a añadir un nuevo usuario.");
                //model.añadir usuario();
            }
            case "añadir_escuela" -> {
                printMessage("Vamos a añadir a un usuario a la Escuela/Maestros");
                //model.añadirAEscuela();
            }
            case "añadir_publicador" -> {
                printMessage("Vamos a añadir a un usuario a la lista de publicadores");
                //model.añadirAPublicador();
            }
            case "añadir_ppoc" -> {
                printMessage("Vamos a añadir a un publicador a la lista del Ppoc");
                //model.añadirAPpoc();
            }
            case "añadir_precursor" -> {
                printMessage("Vamos a añadirte a la lista de precursores");
                //model.añadirAPrecursor();
            }
            case "añadir_ministerial" -> {
                printMessage("Vamos a añadirte a la lista de Ministeriales");
                //model.añadirAMinisterial();
            }
            case "añadir_anciano" -> {
                printMessage("Vamos a añadirte a la lista de Ancianos");
                //model.añadirAAnciano();
            }
            /**
             * OPCIONES DE MODIFICACION*
             */
            case "modificar_usuario" -> {
                printMessage("Modifing a user data");
                //model.modificarUnUsuario();
            }
            case "modificar_escuela" -> {
                printMessage("Modificando datos de un matriculado a la Escuela/Maestros");
                //model.modificarEscuelaMatriculado();
            }
            case "modificar_publicador" -> {
                printMessage("Modificando datos de un publicador");
                //model.modificarDatosPublicador();
            }
            case "modificar_ppoc" -> {
                printMessage("Modificar datos de hermano de ppoc");
                //model.modificarDatosHermanoPpoc();
            }
            case "modificar_precursor" -> {
                printMessage("Modificando datos de Precursor");
                //model.modificarDatosPrecursor();
            }
            case "modificar_ministerial" -> {
                printMessage("Modificando datos de Siervo Ministerial");
                //model.modificandoDatosMinisterial();
            }
            case "modificar_anciano" -> {
                printMessage("Modificando datos de Anciano");
                //model.modicarDatosAnciano();
            }
            /**
             * OPCIONES DE ELIMINADO*
             */
            case "eliminar_usuario" -> {
                printMessage("Eliminando Usuario");
                //model.eliminarUsuario();
            }
            case "eliminar_de_escuela" -> {
                printMessage("Eliminando matriculado de escuela");
                //model.eliminarMatriculadoEscuela();
            }
            case "eliminar_publicador" -> {
                printMessage("Eliminando publicador");
                //model.eliminarPublicador();
            }
            case "eliminar_ppoc" -> {
                printMessage("Eliminando hermano del ppoc");
                //model.eliminarHermanoDePpoc();
            }
            case "eliminar_precursor" -> {
                printMessage("Eliminando Precursor de Lista Precus");
                //model.eliminarHermanoDePrecursores();
            }
            case "eliminar_ministerial" -> {
                printMessage("Eliminando hermano de Lista de Ministeriales");
                //model.eliminarHermanoDeMinisteriales();
            }
            case "eliminar_anciano" -> {
                printMessage("Eliminando Hermano de Lista de Ancianos");
                //model.eliminarHermanoDeAncianos();
            }

            /**
             * OPCIONES DE AÑADIR*
             */
            case "list_all_usuarios" -> {
                printMessage("Listando todos los usuarios");
                //model.listarTodosLosUsuarios();
            }
            case "list_user_by_id" -> {
                printMessage("Obteniendo usuario por ID");
                //model.obtenerUsuarioPorId();
            }
            case "list_user_by_correo" -> {
                printMessage("Obteniendo usuario(s) por correo");
                //model.obtenerUsuariosPorCorreo();
            }
            case "list_all_publicadores" -> {
                printMessage("Listar todos los publicadores");
                //model.obtenerTodosPublicadores();
            }
            case "list_all_publicadores_by_nombre" -> {
                printMessage("Buscar publicadores por nombre");
                //model.obtenerPublicadoresPorNombre();
            }
            case "list_all_publicadores_by_fecha_antes" -> {
                printMessage("Listando publicadores que empezaron antes de yyyy-mm-dd");
                //model.obtenerPublicadoresDesdeAntesDe();
            }
            case "list_all_publicadores_by_fecha_despues" -> {
                printMessage("Listando publicadores que empezaron después de yyyy-mm-dd");
                //model.obtenerPublicadoresDesdeDespuésDe();
            }
            case "list_all_publicadores_by_grupo" -> {
                printMessage("Listando publicadores por grupo");
                //model.obtenerPublicadoresGrupo(int numGrupo);
            }
            case "list_all_publicadores_ppoc" -> {
                printMessage("Listando publicadores que participan en el ppoc");
                //model.obtenerPublicadoresEnPpoc();
            }
            case "list_all_publicadores_precus_regulares" -> {
                printMessage("Listando Precursores Regulares");
                //model.obtenerPrecursoresRegulares();
            }
            case "list_precursores_desde_fecha" -> {
                printMessage("Listando Precursores Regulares desde yyyy-mm-dd");
                //model.obtenerPrecursoresRegularesDesdeFecha();
            }
            case "list_precursores_continuo" -> {
                printMessage("Listando Precursores Regulares que nunca han descontinuado");
                //model.obtenerPrecursoresRegularesNoDescontinuados();
            }
            case "list_precusores_fecha_escuela" -> {
                printMessage("Listando Precursores Regulares ordenado por fecha Escuela Precus");
                //model.obtenerPrecursoresRegularesPorFechaEscuela();
            }
            case "list_all_ministeriales" -> {
                printMessage("Listando Ministeriales");
                //model.obtenerMinisteriales();
            }
            case "list_ministeriales_auxiliares" -> {
                printMessage("Listando Ministeriales que son auxiliares de Grupo");
                //model.obtenerMinisterialesAuxiliaresGrupo();
            }
            case "list_ministeriales_fecha_nombramiento" -> {
                printMessage("Listando Ministeriales por fecha de Nombramiento");
                //model.obtenerMinisterialesPorFechaNombramiento();
            }
            case "list_ancianos" -> {
                printMessage("Listando Ancianos");
                //model.obtenerAncianos();
            }
            case "list_ancianos_fecha" -> {
                printMessage("Listando Ancianos por Fecha Nombramiento");
                //model.obtenerAncianosPorFechaNombramiento();
            }
            //TODO
            /*
            Queda por añadir todos los comandos de listar.
             */
        }
    }

    private String prompt(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private void exitApp() {
        String ans = prompt("¿Seguro que quieres cerrar el programa? (s/n): ");
        if (ans.toLowerCase().equals("s") || ans.equalsIgnoreCase("si") || ans.equalsIgnoreCase("sí")) {
            System.out.println("Cerrando el Programa");
            System.exit(0);
        }
    }

    private void printMessage(String message) {
        System.out.println(message);
    }
}

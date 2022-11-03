package insertdataapp.View;

public class LoginMenu extends Menu{
    public LoginMenu(){
        super.setTitle("Menu de Login");
        addOption(new Option("Salir","salir"));
        addOption(new Option("Entrar en la App","entrar_app"));
        addOption(new Option("Modificar contraseña","cambiar_contraseña"));
        addOption(new Option("Eliminar mis datos","eliminar_todos_datos"));
    }
    
}

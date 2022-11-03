package insertdataapp;

import insertdataapp.Controller.Controller;
import insertdataapp.Model.Model;
import insertdataapp.View.MainView;
import insertdataapp.View.Menu;

public class GestorCongre {
    
    private MainView panel;
    private Model model;
    private Controller controller;
    public boolean mainFlag = false;
    
    public GestorCongre(){
        model = new Model();
        controller = new Controller(model);
        panel = new MainView(model, controller);
        controller.setPanel(panel);
    }

    public static void main(String[] args) {
        GestorCongre program = new GestorCongre();
        program.run();
    }

    private void run() {
        do{
            try{
                System.out.println("");
                Menu view = panel.getView();
                view.show();
                String action = view.getSelectedOptionActionCommand();
                action = (action == null) ? "wrong option" : action;
                
                controller.executeAction(action);
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }while(!mainFlag);
    }
    
}

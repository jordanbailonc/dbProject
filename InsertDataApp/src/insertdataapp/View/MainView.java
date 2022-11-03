package insertdataapp.View;

import insertdataapp.Controller.Controller;
import insertdataapp.Model.Model;
import java.util.ArrayList;
import java.util.List;

public class MainView {

    private Model model;
    private Controller controller;
    private Menu view;
    private final List<Menu> allMenus;

    public MainView(Model model, Controller controller) {
        this.model = model;
        this.controller = controller;
        allMenus = loadAllMenus();
        view = allMenus.get(0);
    }

    private List<Menu> loadAllMenus() {
        List<Menu> result = new ArrayList<>();

        LoginMenu menu1 = new LoginMenu();
        PrincipalMenu menu2= new PrincipalMenu();
        InsertMenu menu3 = new InsertMenu();
        ModifyMenu menu4 = new ModifyMenu();
        DeleteMenu menu5 = new DeleteMenu();
        ListMenu menu6 = new ListMenu();
        
        result.add(menu1);
        result.add(menu2);
        result.add(menu3);
        result.add(menu4);
        result.add(menu5);
        result.add(menu6);
        return result;
    }

    private void showMenus() {
        for (int i = 0; i < this.allMenus.size(); i++) {
            System.out.println(i + ".-" + allMenus.get(i).getTitle());
        }
    }

    public Menu getView() {
        return view;
    }

    public void setView(Menu view) {
        this.view = view;
    }

    public List<Menu> getAllMenus() {
        return allMenus;
    }

    public void informationMessage(String message) {
        System.out.println(message);
    }

}

package insertdataapp.View;

import insertdataapp.Controller.Controller;
import insertdataapp.Model.Model;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Menu {
    
    private String title;
    protected List<Option> options;
    private Model model;
    private Controller controller;

    public Menu() {
        this.title = null;
        this.options = new ArrayList<>();
    }

    public Model getModel() {
        return model;
    }

    public Controller getController() {
        return controller;
    }
    
   
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title){
        this.title= title;
    }

    public Option getOption(int index) {
        return options.get(index);
    }

    public boolean addOption(Option option) {
        return options.add(option);
    }

    public boolean removeOption(Option option) {
        return options.remove(option);
    }

    public Option removeOption(int index) {
        return options.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Menu [title=");
        builder.append(title);
        builder.append(", options=");
        builder.append(options);
        builder.append("]");
        return builder.toString();
    }

    public void show() {
        System.out.format("============%s============\n", title);
        ListIterator<Option> it = options.listIterator();
        int idOption = 0;
        while (it.hasNext()) {
            System.out.format("[%d] %s\n", idOption, it.next().getText());
            idOption++;
        }
    }

    public int getSelectedOption() {
        Scanner sc = new Scanner(System.in);
        int opt = -1;
        try {
            System.out.print("Selecciona una opción: ");
            opt = sc.nextInt();
            if ((opt < 0) || (opt >= options.size())) {
                opt = -1;
            }
        } catch (InputMismatchException ime) {
            opt = -1;
        }
        return opt;
    }

    public String getSelectedOptionActionCommand() {
        int optionNumber = getSelectedOption();
        String actionCommand = null;
        if ((optionNumber >= 0) && (optionNumber < options.size())) {
            actionCommand = options.get(optionNumber).getActionCommand();
        }
        return actionCommand;
    }
}

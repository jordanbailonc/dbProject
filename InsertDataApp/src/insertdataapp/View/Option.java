package insertdataapp.View;

import java.util.Objects;

public class Option {
    
    //attributtes
    private String text;
    private String actionCommand;
    
    //Constructor
    public Option(String text, String actionCommand){
        this.text = text;
        this.actionCommand = actionCommand;
    }

    //getters & setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getActionCommand() {
        return actionCommand;
    }

    public void setActionCommand(String actionCommand) {
        this.actionCommand = actionCommand;
    }

    //equals & hash code
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.text);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Option other = (Option) obj;
        if (!Objects.equals(this.text, other.text)) {
            return false;
        }
        return Objects.equals(this.actionCommand, other.actionCommand);
    }
    //to String

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Option{");
        sb.append("text=").append(text);
        sb.append(", actionCommand=").append(actionCommand);
        sb.append('}');
        return sb.toString();
    }
    
}

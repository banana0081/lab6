package banana0081.lab6;

import banana0081.lab6.data.HumanBeing;
import banana0081.lab6.http.HTTPRequest;

import java.io.Serializable;

public class Pack implements Serializable {
    String commandName;
    String[] arg;
    String content;
    HumanBeing humanBeing;

    public void pack(String commandName) {
        this.commandName = commandName;
    }

    public void pack(String commandName, String[] arg) {
        this.commandName = commandName;
        this.arg = arg;
    }



    public void pack(String commandName, HumanBeing humanBeing) {
        this.commandName = commandName;
        this.humanBeing = humanBeing;
    }
    public void pack(HTTPRequest httpRequest){
        this.content = content;
    }
    public String getCommandName() {
        return commandName;
    }

    public String[] getArg() {
        return arg;
    }

    public HumanBeing getHumanBeing() {
        return humanBeing;
    }


}
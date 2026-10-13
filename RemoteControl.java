// Invoker
public class RemoteControl {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton() {
        if (this.command != null) { 
            this.command.execute();
        } else {
            System.out.println("No command assigned");
        }
    }
}

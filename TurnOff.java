// Command
public class TurnOff implements Command {
    private LightSwitch lightSwitch;

    public TurnOff(LightSwitch lightswitch) {
        this.lightSwitch = lightswitch;
    }

    @Override
    public void execute(){
        this.lightSwitch.turnLightOff();
    }
}

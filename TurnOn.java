// Command
public class TurnOn implements Command {
    private LightSwitch lightSwitch;

    public TurnOn(LightSwitch lightSwitch) {
        this.lightSwitch = lightSwitch;
    }

    @Override
    public void execute(){
        this.lightSwitch.turnLightOn();
    }
}

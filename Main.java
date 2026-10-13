public class Main {
    public static void main(String[] args) {

        LightSwitch lightSwitch = new LightSwitch();
        Command turnLightOn = new TurnOn(lightSwitch);
        Command turnLightOff = new TurnOff(lightSwitch);

        RemoteControl control = new RemoteControl();
        control.setCommand(turnLightOn);
        control.pressButton();

        control.setCommand(turnLightOff);
        control.pressButton();

    }
}

package abstractFactory.factory;

import abstractFactory.Linux.LinuxButton;
import abstractFactory.Linux.LinuxCheckBox;
import abstractFactory.Linux.LinuxWindows;
import abstractFactory.interfaces.Button;
import abstractFactory.interfaces.CheckBox;
import abstractFactory.interfaces.Windows;

public class GuiLinuxFactory implements GuiFactory{
    @Override
    public Windows creaWindows(String name, Integer height, Integer length) {
        return new LinuxWindows(name,height,length);
    }

    @Override
    public Button createButton(String name) {
        return new LinuxButton(name);
    }

    @Override
    public CheckBox createCheckBox(String name) {
        return new LinuxCheckBox(name);
    }
}

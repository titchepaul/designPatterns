package abstractFactory.Linux;

import abstractFactory.interfaces.CheckBox;

public class LinuxCheckBox implements CheckBox {

    private String label;
    private Boolean isActive;

    public LinuxCheckBox(String label) {
        this.label = label;
        isActive = false;
    }
    @Override
    public void onCheck() {
        if(isActive) {
            isActive = false;
        } else {
            isActive = true;
        }
    }

    @Override
    public Boolean isCheck() {
        return isActive;
    }
}

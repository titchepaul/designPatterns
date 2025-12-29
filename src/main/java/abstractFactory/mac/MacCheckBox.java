package abstractFactory.mac;

import abstractFactory.interfaces.CheckBox;

public class MacCheckBox implements CheckBox {

    private String label;
    private Boolean isActive;

    public MacCheckBox(String label) {
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

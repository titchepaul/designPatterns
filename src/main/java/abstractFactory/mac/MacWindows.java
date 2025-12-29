package abstractFactory.mac;

import abstractFactory.interfaces.Windows;

public class MacWindows implements Windows {
    private String title;
    private Integer height;
    private Integer length;
    private Boolean isMin;

    public MacWindows(String t, Integer h, Integer l){
        title = t;
        height = h;
        length = l;
        isMin = false;
    }

    @Override
    public Boolean isMinimized(){
        return isMin;
    }
}

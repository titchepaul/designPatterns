package abstractFactory.Linux;

import abstractFactory.interfaces.Windows;

public class LinuxWindows implements Windows {

    private String title;
    private Integer height;
    private Integer length;
    private Boolean isMin;

    public LinuxWindows(String title, Integer height, Integer length) {
        this.title = title;
        this.height = height;
        this.length = length;
        this.isMin = false;
    }
    @Override
    public Boolean isMinimized() {
        return isMin;
    }
}

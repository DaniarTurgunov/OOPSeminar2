package Seminar2.HW;

import java.util.*;

public class Notebook extends NotebookClass {
    @Override
    String getName() {
        return name;
    }

    @Override
    public String notebookList() {
        return String.format("name: %s, os: %s, ram: %d ГБ, ssd: %d ГБ, color: %s", name, os, ram, ssd, color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getOs() {
        return os;
    }

    @Override
    public int getRam() {
        return ram;
    }

    @Override
    public int getSsd() {
        return ssd;
    }

}

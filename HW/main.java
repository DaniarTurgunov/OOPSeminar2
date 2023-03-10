package Seminar2.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook();
        notebook1.color ="Black";
        notebook1.name = "Lenovo";
        notebook1.os = "Windows";
        notebook1.ram = 16;
        notebook1.ssd = 256;
        notebook1.notebookList();
        Notebook notebook2 = new Notebook();
        notebook2.color ="Gold";
        notebook2.name = "Macbook";
        notebook2.os = "MacOS";
        notebook2.ram = 16;
        notebook2.ssd = 512;
        notebook2.notebookList();
        Notebook notebook3 = new Notebook();
        notebook3.color ="Silver";
        notebook3.name = "HP";
        notebook3.os = "Linux";
        notebook3.ram = 32;
        notebook3.ssd = 1000;
        notebook3.notebookList();
        List<Notebook> notebookList = new ArrayList<>(Arrays.asList(notebook1, notebook2, notebook3));
        System.out.println("Выберите фильтр поиска:");
        System.out.println("1 - Операционная система");
        System.out.println("2 - ОЗУ");
        System.out.println("3 - Жесткий диск");
        System.out.println("4 - Цвет");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Введите необходимую ОС");
                String os = scanner1.nextLine().toLowerCase();
                System.out.println("По вашему запросу найдено:");
                for (Notebook value : notebookList) {
                    if (os.equals(value.getOs().toLowerCase())) {
                        System.out.println(value.notebookList());
                    }
                }
                scanner1.close();
            }
            case 2 -> {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Введите необходимое кол-во ОЗУ");
                int ram = scanner2.nextInt();
                System.out.println("По вашему запросу найдено:");
                for (Notebook list : notebookList) {
                    if (ram <= 16) {
                        if (list.getRam() <= 16) {
                            System.out.println(list.notebookList());
                        }
                    } else if (ram <= 32) {
                        if (list.getRam() > 16 && list.getRam() <= 32) {
                            System.out.println(list.notebookList());
                        }
                    } else if (ram <= 64) {
                        if (list.getRam() > 32 && list.getRam() <= 64) {
                            System.out.println(list.notebookList());
                        }
                    }
                }
                scanner2.close();
            }
            case 3 -> {
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Введите необходимое кол-во памяти");
                int ssd = scanner3.nextInt();
                System.out.println("По вашему запросу найдено:");
                for (Notebook list : notebookList) {
                    if (ssd <= 256) {
                        if (list.getSsd() <= 256) {
                            System.out.println(list.notebookList());
                        }
                    } else if (ssd <= 512) {
                        if (list.getSsd() > 256 && list.getSsd() <= 512) {
                            System.out.println(list.notebookList());
                        }
                    } else if (ssd <= 1000) {
                        if (list.getSsd() > 512 && list.getSsd() <= 1000) {
                            System.out.println(list.notebookList());
                        }
                    }
                }
                scanner3.close();
            }
            case 4 -> {
                Scanner scanner4 = new Scanner(System.in);
                System.out.println("Введите необходимый цвет");
                String cl = scanner4.nextLine().toLowerCase();
                System.out.println("По вашему запросу найдено:");
                for (Notebook list : notebookList) {
                    if (cl.equals(list.getColor().toLowerCase())) {
                        System.out.println(list.notebookList());
                    }
                }
                scanner4.close();
            }
        }
    }
}

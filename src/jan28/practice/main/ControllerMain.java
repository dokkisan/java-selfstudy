package jan28.practice.main;

import jan28.practice.framework.Controller;
import jan28.practice.myproject.FirstController;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();
        c1.execute(); // final
    }
}

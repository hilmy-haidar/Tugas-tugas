package MVC;

import Controller.ControllerTransaksi;
import Model.ModelTransaksi;
import View.View;

public class MVCTransaksi {
    View view = new View();
    ModelTransaksi modelTransaksi = new ModelTransaksi();

    ControllerTransaksi controllerTransaksi = new ControllerTransaksi(modelTransaksi,view);
}
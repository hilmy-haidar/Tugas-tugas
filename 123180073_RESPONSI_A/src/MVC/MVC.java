package MVC;

import Controller.Controller;
import Model.Model;
import View.ViewMenu;
import View.*;

public class MVC {

    ViewMenu viewmenu = new ViewMenu();
    ViewPinjam viewpinjam = new ViewPinjam();
    Model model = new Model() ;
    ViewAbout viewabout = new ViewAbout();
    ViewTampil viewtampil = new ViewTampil();
    ViewEdit viewedit = new ViewEdit();

    Controller controller = new Controller(model,viewmenu,viewpinjam,viewabout,viewtampil,viewedit);
}
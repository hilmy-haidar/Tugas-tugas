public class MVC {
    OutputMain outputmain = new OutputMain();
    OutputCreate outputcreate = new OutputCreate();
    OutputRead outputread= new OutputRead();
    OutputUpdate outputupdate = new OutputUpdate();
    Model model = new Model() ;
    Controller controller = new Controller (model, outputmain, outputcreate, outputread, outputupdate) ;
}

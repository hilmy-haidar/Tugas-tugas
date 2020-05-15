package MVC;

import Controller.Controller;
import Model.Model;
import View.tampilanMain;
import View.*;

public class MVC {

    tampilanSebelumMain tampilansebelummain= new tampilanSebelumMain();
    tampilanMain tampilanmain = new tampilanMain();
    tampilanMain2 tampilanmain2 = new tampilanMain2();
    tampilanCreatePegawai tampilancreatepegawai = new  tampilanCreatePegawai();
    tampilanLihatPegawai tampilanlihatpegawai = new tampilanLihatPegawai();
    tampilanUpdatePegawai tampilanupdatepegawai = new tampilanUpdatePegawai();
    tampilanCreateService tampilancreateservice = new  tampilanCreateService();
    tampilanLihatService tampilanlihatservice = new tampilanLihatService();
    tampilanUpdateService tampilanupdateservice = new tampilanUpdateService();
    Model model = new Model() ;
    Controller controller = new Controller(tampilansebelummain, model,tampilanmain,tampilanmain2, tampilancreatepegawai,tampilanlihatpegawai, tampilanupdatepegawai,tampilancreateservice,tampilanlihatservice, tampilanupdateservice);
}
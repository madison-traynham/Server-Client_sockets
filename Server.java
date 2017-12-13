//Author: WarLordTech
//Website: http://www.youtube.com/user/WarLordTech

import java.io.*;
import java.net.*;


public class Server {

    public static void main(String[] args) throws Exception{
        Server myServ = new Server();
        myServ.run();
    }

    public void run() throws Exception{

        ServerSocket mySS = new ServerSocket(9999);
        Socket SS_accept = mySS.accept();

BufferedReader SS_BF= new BufferedReader(new InputStreamReader
        (SS_accept.getInputStream())    );

String temp = SS_BF.readLine();
System.out.println(temp);

if (temp!=null) {
PrintStream SSPS = new PrintStream(SS_accept.getOutputStream());
SSPS.println("Got something");
}


    }


}

















   /*     PrintStream myPS = new PrintStream(SS_skt.getOutputStream());




        myPS.println("Oh hi there");
*/
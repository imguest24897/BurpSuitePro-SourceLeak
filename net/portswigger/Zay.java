package net.portswigger;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public interface Zay {
  Zd7 ZP(Zgk paramZgk, InputStream paramInputStream, Socket paramSocket) throws IOException;
  
  default Zd7 Ze(Zgk paramZgk, InputStream paramInputStream, Socket paramSocket, Zrxj paramZrxj) throws IOException {
    return ZP(paramZgk, paramInputStream, paramSocket);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zay.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */
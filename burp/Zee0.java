package burp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Zee0 implements Zr50 {
  private final Socket ZG;
  
  public Zee0(Socket paramSocket) {
    this.ZG = paramSocket;
  }
  
  public void ZS(Zefx paramZefx) throws IOException {
    OutputStream outputStream = this.ZG.getOutputStream();
    outputStream.write(paramZefx.Zb().ZD());
    outputStream.flush();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zee0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
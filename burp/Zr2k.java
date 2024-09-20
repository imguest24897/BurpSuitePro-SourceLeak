package burp;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.Socket;

class Zr2k extends Socket {
  public OutputStream getOutputStream() {
    return new ByteArrayOutputStream();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr2k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
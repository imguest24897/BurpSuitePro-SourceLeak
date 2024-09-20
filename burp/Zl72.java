package burp;

import java.io.InputStream;
import java.net.Socket;

public class Zl72 extends Zl79 {
  private final InputStream Zf;
  
  public Zl72(Socket paramSocket, InputStream paramInputStream) {
    super(paramSocket);
    this.Zf = paramInputStream;
  }
  
  public InputStream getInputStream() {
    return this.Zf;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl72.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
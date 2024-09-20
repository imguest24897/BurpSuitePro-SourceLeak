package burp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

class Zz8e extends Zz8h {
  private final Socket Zb;
  
  private final InputStream ZH;
  
  private final OutputStream ZZ;
  
  private final String Zm;
  
  private final int Zk;
  
  Zz8e(Socket paramSocket, InputStream paramInputStream, OutputStream paramOutputStream, String paramString, int paramInt) {
    super(null);
    this.Zb = paramSocket;
    this.ZH = paramInputStream;
    this.ZZ = paramOutputStream;
    this.Zm = paramString;
    this.Zk = paramInt;
  }
  
  public Socket Zr() {
    return this.Zb;
  }
  
  public InputStream Zt() {
    return this.ZH;
  }
  
  public OutputStream Zv() {
    return this.ZZ;
  }
  
  public String Zi() {
    return this.Zm;
  }
  
  public int Zf() {
    return this.Zk;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz8e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
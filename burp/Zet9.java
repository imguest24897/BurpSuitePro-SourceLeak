package burp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zet9 implements Runnable {
  private final InputStream Zn;
  
  private final OutputStream Zk;
  
  private final Socket Zh;
  
  private final Socket ZQ;
  
  private final byte[] Zz = new byte[2048];
  
  public Zet9(InputStream paramInputStream, OutputStream paramOutputStream, Socket paramSocket1, Socket paramSocket2) {
    this.Zn = paramInputStream;
    this.Zk = paramOutputStream;
    this.Zh = paramSocket1;
    this.ZQ = paramSocket2;
  }
  
  public void run() {
    try {
      while (true) {
        int i = this.Zn.read(this.Zz);
        this.Zk.write(this.Zz, 0, i);
        this.Zk.flush();
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      try {
        this.Zn.close();
      } catch (Exception exception1) {
        Zah.Zl(exception1, Zk_.IGNORED);
      } 
      try {
        this.Zk.close();
      } catch (Exception exception1) {
        Zah.Zl(exception1, Zk_.IGNORED);
      } 
      try {
        this.Zh.close();
      } catch (Exception exception1) {
        Zah.Zl(exception1, Zk_.IGNORED);
      } 
      try {
        this.ZQ.close();
      } catch (Exception exception1) {
        Zah.Zl(exception1, Zk_.IGNORED);
      } 
      return;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zet9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
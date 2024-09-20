package burp;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

class Zry2 extends Writer {
  private final Writer ZE;
  
  private StringWriter ZR = new StringWriter();
  
  Zry2(Writer paramWriter) {
    this.ZE = paramWriter;
  }
  
  void Zn() throws IOException {
    this.ZE.write(this.ZR.toString());
    ZF();
  }
  
  void Zu() {
    ZF();
  }
  
  private void ZF() {
    this.ZR = new StringWriter();
  }
  
  public void write(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    this.ZR.write(paramArrayOfchar, paramInt1, paramInt2);
  }
  
  public void flush() throws IOException {
    Zn();
    this.ZE.flush();
  }
  
  public void close() throws IOException {
    flush();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zry2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
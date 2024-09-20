package burp;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zb1z implements Runnable {
  final File ZH;
  
  final Zbmo Ze;
  
  Zb1z(Zbmo paramZbmo, File paramFile) {}
  
  public void run() {
    int i = Zrtd.ZH();
    try {
      FileInputStream fileInputStream = new FileInputStream(this.ZH);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte[1024];
      int j;
      while (-1 != (j = fileInputStream.read(arrayOfByte))) {
        byteArrayOutputStream.write(arrayOfByte, 0, j);
        if (i == 0)
          break; 
      } 
      this.Ze.Zy(Zyf.Zy(byteArrayOutputStream.toByteArray()));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb1z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
package burp;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import net.portswigger.Zog;

class Zdg {
  private final Zog ZB;
  
  private final OutputStream ZM;
  
  private final Zrn ZX;
  
  Zdg(OutputStream paramOutputStream, Zrn paramZrn) {
    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(paramOutputStream, 1024);
    this.ZB = new Zog(bufferedOutputStream);
    this.ZM = bufferedOutputStream;
    this.ZX = paramZrn;
  }
  
  Zl36 Za(Zl36 paramZl36, Ze3o paramZe3o, Zeew paramZeew) throws IOException {
    Zl36 zl36 = this.ZX.ZQ(paramZl36, paramZe3o, paramZeew);
    try {
      if (zl36 != null) {
        this.ZB.Zy(zl36.ZX);
        this.ZM.flush();
        this.ZX.Zz(paramZl36, paramZe3o, paramZeew);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return zl36;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zdg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
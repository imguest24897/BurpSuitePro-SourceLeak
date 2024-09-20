package burp;

import java.io.IOException;
import java.io.InputStream;
import net.portswigger.Zah;
import net.portswigger.Zc7;
import net.portswigger.Zk_;
import net.portswigger.Zli;

class Zzv2 {
  private static final int ZG = Zrg3.Zc.length;
  
  private final InputStream Zy;
  
  private final Zgz4 Z_;
  
  Zzv2(InputStream paramInputStream, Zgz4 paramZgz4) {
    this.Zy = paramInputStream;
    this.Z_ = paramZgz4;
  }
  
  void ZY() throws IOException {
    try {
      byte[] arrayOfByte = Zc7.Zz(this.Zy, ZG);
      try {
        if (!Zli.ZI(Zrg3.Zc, 0, ZG, arrayOfByte, 0, ZG))
          throw new IOException(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      this.Z_.ZY();
      throw iOException;
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzv2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
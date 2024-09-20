package burp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import net.portswigger.Zah;
import net.portswigger.Zij;
import net.portswigger.Zk_;

public interface Zstu extends Ze34<Zstu>, Zz29, Zij {
  public static final Zllg<Zstu> Zc = new Zkn1();
  
  byte[] ZiD();
  
  String Zis();
  
  Zstu Zt(byte[] paramArrayOfbyte);
  
  byte Zp(int paramInt);
  
  void Zs(int paramInt, byte paramByte);
  
  Zstu Zb(int paramInt1, int paramInt2);
  
  void Zo(OutputStream paramOutputStream, int paramInt1, int paramInt2) throws IOException;
  
  Zstu Zp(Zr_4 paramZr_4);
  
  @Deprecated
  InputStream Zi1();
  
  @Deprecated
  Zstu ZU(InputStream paramInputStream, int paramInt) throws IOException;
  
  default String ZE(String paramString) {
    byte[] arrayOfByte = ZiD();
    try {
      return new String(arrayOfByte, paramString);
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      Zah.Zl(unsupportedEncodingException, Zk_.UNEXPECTED);
      return Zis();
    } 
  }
  
  default void Zo(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    System.arraycopy(ZiD(), paramInt1, paramArrayOfbyte, 0, paramInt2);
  }
  
  default byte[] ZiH() {
    return ZiD();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zstu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
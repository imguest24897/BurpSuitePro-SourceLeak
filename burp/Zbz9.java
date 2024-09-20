package burp;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbz9 extends InputStream {
  private final Zsnl Zh;
  
  public Zbz9(Zsnl paramZsnl) {
    this.Zh = paramZsnl;
  }
  
  public int available() throws IOException {
    return this.Zh.Zi();
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    Zbqc[] arrayOfZbqc = Zsnl.ZS();
    try {
      Objects.checkFromIndexSize(paramInt1, paramInt2, paramArrayOfbyte.length);
      if (paramInt2 == 0)
        return 0; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zh.ZL())
        try {
          if (this.Zh.Zi() == 0)
            return -1; 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = Math.min(paramInt2, this.Zh.Zi());
    int j = paramInt1;
    while (j < paramInt1 + i) {
      Optional<Byte> optional = Z_();
      try {
        if (optional.isEmpty())
          break; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      paramArrayOfbyte[j] = ((Byte)optional.get()).byteValue();
      j++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return j - paramInt1;
  }
  
  public int read() throws IOException {
    try {
      if (this.Zh.ZL())
        try {
          if (this.Zh.Zi() == 0)
            return -1; 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    Optional<Byte> optional = Z_();
    return ((Integer)optional.<Integer>map(Zbz9::lambda$read$0).orElse(Integer.valueOf(-1))).intValue();
  }
  
  private Optional<Byte> Z_() {
    Zbqc[] arrayOfZbqc = Zsnl.ZS();
    Optional<Byte> optional = this.Zh.Zy();
    while (optional.isEmpty()) {
      try {
        if (!this.Zh.ZL() || this.Zh.Zi() != 0) {
          try {
            Thread.sleep(50L);
          } catch (InterruptedException interruptedException) {
            Zah.Zl(interruptedException, Zk_.COMMON_RUNTIME_FAILURE);
          } 
          optional = this.Zh.Zy();
          if (arrayOfZbqc != null)
            break; 
        } 
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
    } 
    return optional;
  }
  
  private static Integer lambda$read$0(Byte paramByte) {
    return Integer.valueOf(paramByte.byteValue() & 0xFF);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbz9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
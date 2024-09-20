package burp;

import java.io.IOException;
import java.io.InputStream;

public class Zx6s extends InputStream {
  private final Zstu Za;
  
  private int ZZ;
  
  public Zx6s(Zstu paramZstu) {
    this.Za = paramZstu;
  }
  
  public int available() throws IOException {
    return this.Za.Zpu() - this.ZZ;
  }
  
  public int read() throws IOException {
    return this.Za.Zp(this.ZZ++);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    Zbqc[] arrayOfZbqc = Zyf.ZQN();
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt2 >= 0)
            try {
              if (paramInt2 <= paramArrayOfbyte.length - paramInt1) {
                try {
                  if (this.ZZ >= this.Za.Zpu())
                    return -1; 
                } catch (IOException iOException) {
                  throw a(null);
                } 
                try {
                  if (paramInt2 == 0)
                    return 0; 
                } catch (IOException iOException) {
                  throw a(null);
                } 
                byte b = 0;
                while (b < paramInt2 && this.ZZ < this.Za.Zpu()) {
                  int i = read();
                  paramArrayOfbyte[paramInt1 + b] = (byte)i;
                  b++;
                  if (arrayOfZbqc == null)
                    break; 
                } 
                return b;
              } 
              throw new IndexOutOfBoundsException();
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    throw new IndexOutOfBoundsException();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx6s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
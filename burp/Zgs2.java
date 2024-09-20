package burp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zgs2 implements Zs2i {
  private final ByteArrayOutputStream ZZ = new ByteArrayOutputStream();
  
  private final List<Zl1r> ZU = new ArrayList<>();
  
  private final byte[] Zg;
  
  private final byte ZK;
  
  private Zgs2(byte[] paramArrayOfbyte, byte paramByte) {
    this.Zg = paramArrayOfbyte;
    this.ZK = paramByte;
  }
  
  public List<Zl1r> ZO() {
    return this.ZU;
  }
  
  private void ZU(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    try {
      if (paramArrayOfbyte != null)
        this.ZU.add(new Zl1r(this.ZZ.size(), this.ZZ.size() + paramArrayOfbyte.length)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZC(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private void ZC(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    try {
      if (paramArrayOfbyte != null) {
        try {
          this.ZZ.write(paramArrayOfbyte);
          if (arrayOfZbqc != null) {
            ZG(this.Zg, paramInt1, paramInt2);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZG(this.Zg, paramInt1, paramInt2);
  }
  
  private void ZG(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramInt2 - paramInt1;
    this.ZZ.write(paramArrayOfbyte, paramInt1, i);
  }
  
  private void ZZ(byte[]... paramVarArgs) throws IOException {
    int i = this.ZZ.size();
    int j = 0;
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    byte[][] arrayOfByte = paramVarArgs;
    int k = arrayOfByte.length;
    byte b = 0;
    while (b < k) {
      byte[] arrayOfByte1 = arrayOfByte[b];
      j += arrayOfByte1.length;
      this.ZZ.write(arrayOfByte1);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    this.ZU.add(new Zl1r(i, i + j));
  }
  
  public byte ZL() {
    return this.ZK;
  }
  
  public byte[] ZE() {
    return this.ZZ.toByteArray();
  }
  
  public int[] Zm() {
    Zuh.Zb(false, Zqf.ZC);
    return new int[] { 0, this.ZZ.size() - 1 };
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgs2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
package burp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zkt5 extends Zkte {
  private final Zx05 ZP;
  
  public Zkt5(Zr_4 paramZr_4, Zx05 paramZx05) {
    super(paramZr_4, paramZx05);
    this.ZP = paramZx05;
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.ZP.ZS(paramZs4f);
  }
  
  public void Zy4() {
    this.ZP.Zy4();
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    try {
      if (ZK0())
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      ZKn();
      if (ZK0())
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      ByteArrayOutputStream byteArrayOutputStream = ZKd();
      return this.ZP.Zyn().Zm(new Zr1f(paramZzlx), paramArrayOfbyte, byteArrayOutputStream.toByteArray());
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IMPOSSIBLE);
      return null;
    } 
  }
  
  private void ZKn() {
    Zmyi zmyi = this.ZP.ZCg();
    Zrte<Zefg<Zstu>> zrte = this.ZP.ZCR();
    zmyi.ZX(0, zmyi.ZN(0) + 1);
    byte b = 0;
    String str = Zelx.Zo();
    while (b < 7 && zmyi.ZN(b) >= ((Zefg)zrte.ZdF(b)).size()) {
      zmyi.ZX(b, 0);
      int i = b + 1;
      zmyi.ZX(i, zmyi.ZN(i) + 1);
      b++;
      if (str == null)
        break; 
    } 
    this.ZP.Zq(zmyi);
  }
  
  private ByteArrayOutputStream ZKd() throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    Zrte<Zefg<Zstu>> zrte = this.ZP.ZCR();
    Zrte<Zstu> zrte1 = this.ZP.ZCC();
    String str = Zelx.Zo();
    Zmyi zmyi = this.ZP.ZCg();
    byte b = 0;
    while (b < 8) {
      try {
        if (!((Zefg)zrte.ZdF(b)).isEmpty())
          byteArrayOutputStream.write(((Zstu)((Zefg<Zstu>)zrte.ZdF(b)).get(zmyi.ZN(b))).ZiD()); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      byteArrayOutputStream.write(((Zstu)zrte1.ZdF(b)).ZiD());
      b++;
      if (str == null)
        break; 
    } 
    return byteArrayOutputStream;
  }
  
  private boolean ZK0() {
    Zefg zefg = this.ZP.ZCR().ZdF(7);
    boolean bool = zefg.isEmpty() ? true : zefg.size();
    return (this.ZP.ZCg().ZN(7) == bool);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkt5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
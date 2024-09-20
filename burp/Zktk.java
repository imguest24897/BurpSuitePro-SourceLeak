package burp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zktk extends Zkte {
  private final Zgbk ZJ;
  
  public Zktk(Zr_4 paramZr_4, Zgbk paramZgbk) {
    super(paramZr_4, paramZgbk);
    this.ZJ = paramZgbk;
  }
  
  public void Zy4() throws Ztku {
    this.ZJ.Zy4();
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.ZJ.ZS(paramZs4f);
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    String str = Zbu8.ZF();
    try {
      Zstu zstu = this.ZJ.Zls();
      Zmyi zmyi = this.ZJ.Zld();
      zmyi.ZX(0, zmyi.ZN(0) + 1);
      byte b = 0;
      while (b < zmyi.Zpu() - 1) {
        try {
          if (zmyi.ZN(b) < zstu.Zpu())
            break; 
        } catch (Exception exception) {
          throw a(null);
        } 
        zmyi.ZX(b, 0);
        zmyi.ZX(b + 1, zmyi.ZN(b + 1) + 1);
        b++;
        if (str == null)
          break; 
      } 
      this.ZJ.ZQ(zmyi);
      if (zmyi.ZN(zmyi.Zpu() - 1) == zstu.Zpu())
        return null; 
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      Iterator<Integer> iterator = zmyi.iterator();
      while (iterator.hasNext()) {
        int i = ((Integer)iterator.next()).intValue();
        try {
          if (i == -1)
            break; 
        } catch (Exception exception) {
          throw a(null);
        } 
        byteArrayOutputStream.write(zstu.Zp(i));
        if (str == null)
          break; 
      } 
      return this.ZJ.Zyn().Zm(new Zr1f(paramZzlx), paramArrayOfbyte, byteArrayOutputStream.toByteArray());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public void ZyK() {
    this.ZJ.ZyK();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zktk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
package burp;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Supplier;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public interface Zr_4 extends Closeable {
  void close();
  
  <T extends Zgpi> T ZH(Zsqx<T> paramZsqx);
  
  default <T extends Zgpi> T Z_(Zgpi paramZgpi, Supplier<Zsqx<T>> paramSupplier) {
    return ZH(paramSupplier.get());
  }
  
  <T extends Ze34<T>> T Zv(Zllg<T> paramZllg, int paramInt);
  
  Zstu ZZ(byte[] paramArrayOfbyte);
  
  Zmrq Zc(int paramInt);
  
  @Deprecated
  Zstu ZI(InputStream paramInputStream, int paramInt) throws IOException;
  
  Zsdr Zz(String paramString);
  
  Zzvg Zr(String paramString);
  
  void ZP(Zgpi paramZgpi);
  
  <T extends Zgpi> T Zj(Zeu4<T> paramZeu4);
  
  boolean ZV(Zxsr paramZxsr);
  
  boolean ZQ(Zgpi paramZgpi, int paramInt);
  
  boolean ZB();
  
  boolean Zi();
  
  Zkit Zl();
  
  default <T extends Zg35<T>> T Zo(T paramT) {
    if (paramT == null)
      return null; 
    Zg35 zg35 = paramT.ZC(this);
    Zuh.Zb((zg35 != null), Zqf.Zr);
    return (T)zg35;
  }
  
  default Zstu Zh(String paramString) {
    if (paramString == null)
      return null; 
    byte[] arrayOfByte = Zkb.Zy(paramString);
    return ZZ(arrayOfByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr_4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
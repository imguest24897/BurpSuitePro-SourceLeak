package burp;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zr15 implements Zr_4 {
  private final File Zo;
  
  private final Zkit Zr;
  
  private Zgpi ZP;
  
  public Zr15(File paramFile) throws Zev3 {
    this.Zo = paramFile;
    int[] arrayOfInt = Zni.Zp1();
    try {
      this.Zr = Zkit.Za(paramFile, 2147483648L, 32768, 134217728, 1073741824, Zlrc.Za, Zk9w.ON_CLOSE);
      if (arrayOfInt != null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (Zev3 zev3) {
      throw a(null);
    } 
  }
  
  Zr15() {
    this.Zo = null;
    this.Zr = null;
  }
  
  public File ZZ() {
    return this.Zo;
  }
  
  public void close() {
    try {
      if (this.Zr != null)
        this.Zr.close(); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public <T extends Zgpi> T ZH(Zsqx<T> paramZsqx) {
    try {
      if (paramZsqx.Zf().Zs()) {
        Zuh.Zb(false, Zqf.Zk);
        throw new UnsupportedOperationException();
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return paramZsqx.ZI(this);
  }
  
  public <T extends Ze34<T>> T Zv(Zllg<T> paramZllg, int paramInt) {
    return paramZllg.Zb().Zk(paramInt);
  }
  
  public Zstu ZZ(byte[] paramArrayOfbyte) {
    return this.Zr.ZZ(paramArrayOfbyte);
  }
  
  public Zmrq Zc(int paramInt) {
    return this.Zr.Zc(paramInt);
  }
  
  public Zstu ZI(InputStream paramInputStream, int paramInt) throws IOException {
    return this.Zr.ZI(paramInputStream, paramInt);
  }
  
  public Zsdr Zz(String paramString) {
    return ZH(new Zkk0(paramString));
  }
  
  public Zzvg Zr(String paramString) {
    return ZH(new Zxrw(paramString));
  }
  
  public void ZP(Zgpi paramZgpi) {
    this.ZP = paramZgpi;
  }
  
  public <T extends Zgpi> T Zj(Zeu4<T> paramZeu4) {
    return (T)this.ZP;
  }
  
  public boolean ZV(Zxsr paramZxsr) {
    return this.Zr.ZV(paramZxsr);
  }
  
  public boolean ZQ(Zgpi paramZgpi, int paramInt) {
    return true;
  }
  
  public boolean ZB() {
    return false;
  }
  
  public boolean Zi() {
    return false;
  }
  
  public Zkit Zl() {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr15.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
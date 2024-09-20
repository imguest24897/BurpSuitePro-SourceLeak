package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zr1y {
  private final Supplier<Zvow> ZH;
  
  Zr1y(Supplier<Zvow> paramSupplier) {
    this.ZH = paramSupplier;
  }
  
  Zmvq ZG(Zbjw paramZbjw) {
    return ZY(paramZbjw, null);
  }
  
  Zmvq ZY(Zbjw paramZbjw, Zghb paramZghb) {
    Zvow zvow1 = ((Zvow)this.ZH.get()).ZC(paramZbjw.ZF().Z_()).ZK(Zex2.ZT(paramZbjw.ZF().Z_(), paramZbjw::lambda$build$0)).Zo(paramZbjw.Zr());
    Zvow zvow2 = null;
    Zbqc[] arrayOfZbqc = Zmk.ZK();
    if (paramZbjw.ZB()) {
      zvow1.Z_(ZR(paramZbjw.Zr().Za().ZiD(), paramZbjw.Za()));
      if (arrayOfZbqc != null) {
        Zbqc.Zr(new Zbqc[2]);
      } else {
        return new Zmvq(zvow1, zvow2, paramZbjw);
      } 
    } 
    zvow1.Zf(Zl8v.Zc(paramZbjw.Zr().Za().ZiD(), paramZbjw.Zr().Ze()));
    Zuh.Zb((paramZghb != null), Zqf.Zr);
    if (paramZghb != null)
      zvow2 = ((Zvow)this.ZH.get()).ZC(paramZghb.ZK()).ZK(Zt(paramZghb.ZC(), paramZghb.ZK().ZD())).Zo(paramZghb.Za()).Zf(Zl8v.Zc(paramZghb.Za().Za().ZiD(), paramZghb.Za().Ze())); 
    return new Zmvq(zvow1, zvow2, paramZbjw);
  }
  
  private static List<Zl1r> Zt(List<String> paramList, byte[] paramArrayOfbyte) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    Iterator<String> iterator = paramList.iterator();
    Zbqc[] arrayOfZbqc = Zmk.ZK();
    while (iterator.hasNext()) {
      String str = iterator.next();
      Zl8v.Zm(str, paramArrayOfbyte, 0, paramArrayOfbyte.length, arrayList, false);
      if (arrayOfZbqc != null)
        break; 
    } 
    return arrayList;
  }
  
  private static List<Zl1r> ZR(byte[] paramArrayOfbyte, String paramString) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    Zl8v.ZB(paramString, paramArrayOfbyte, arrayList, false);
    return arrayList;
  }
  
  private static List lambda$build$0(Zbjw paramZbjw, Zr6q paramZr6q) {
    return Zt(paramZbjw.Zq(), paramZr6q.ZD());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr1y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
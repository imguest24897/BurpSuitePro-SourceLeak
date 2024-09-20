package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import net.portswigger.Zkb;
import net.portswigger.Zmw;

public class Zgk_ {
  public final boolean ZL;
  
  final boolean Zo;
  
  private final boolean ZN;
  
  private final byte Zd;
  
  private final Collection<Zgl6> Zv;
  
  private final Zkcf Zp;
  
  private final String ZJ;
  
  private final String ZQ;
  
  public Zgk_(byte paramByte) {
    this(paramByte, false, false, Collections.unmodifiableCollection(Collections.singletonList(new Zxl4(paramByte))), null, null, null, false);
  }
  
  private Zgk_(byte paramByte, boolean paramBoolean1, boolean paramBoolean2, Collection<Zgl6> paramCollection, Zkcf paramZkcf, String paramString1, String paramString2, boolean paramBoolean3) {
    this.Zd = paramByte;
    this.ZL = paramBoolean1;
    this.Zo = paramBoolean2;
    this.Zv = paramCollection;
    this.Zp = paramZkcf;
    this.ZJ = paramString1;
    this.ZQ = paramString2;
    this.ZN = paramBoolean3;
  }
  
  public Zgk_ ZA(boolean paramBoolean) {
    return new Zgk_(this.Zd, paramBoolean, this.Zo, this.Zv, this.Zp, this.ZJ, this.ZQ, this.ZN);
  }
  
  public Zgk_ ZL() {
    return new Zgk_(this.Zd, this.ZL, true, this.Zv, this.Zp, this.ZJ, this.ZQ, this.ZN);
  }
  
  Zgl6 Zq() {
    return this::lambda$aggregateReflectionMatchers$0;
  }
  
  public Zgk_ Zv(Zgl6 paramZgl6) {
    ArrayList<Zgl6> arrayList = new ArrayList<>(this.Zv);
    arrayList.add(paramZgl6);
    return new Zgk_(this.Zd, this.ZL, this.Zo, Collections.unmodifiableCollection(arrayList), this.Zp, this.ZJ, this.ZQ, this.ZN);
  }
  
  public Zgk_ ZO(String paramString) {
    return new Zgk_(this.Zd, this.ZL, this.Zo, this.Zv, this.Zp, this.ZJ, paramString, this.ZN);
  }
  
  public Zgk_ Zz() {
    return new Zgk_(this.Zd, this.ZL, this.Zo, this.Zv, this.Zp, this.ZJ, this.ZQ, true);
  }
  
  public Zkcf Z_() {
    return this.Zp;
  }
  
  Zgk_ Zn(Zkcf paramZkcf) {
    return new Zgk_(this.Zd, this.ZL, this.Zo, this.Zv, paramZkcf, this.ZJ, this.ZQ, this.ZN);
  }
  
  Zgk_ Zc(String paramString) {
    return new Zgk_(this.Zd, this.ZL, this.Zo, this.Zv, this.Zp, paramString, this.ZQ, this.ZN);
  }
  
  Zt9b ZT(byte[] paramArrayOfbyte) {
    return Zv(Zmw.Zq(new byte[][] { Zkb.Zy(Zl()), paramArrayOfbyte }));
  }
  
  Zt9b Zr() {
    return Zv(Zkb.Zy(Zl()));
  }
  
  private String Zl() {
    return (this.ZQ == null) ? this.ZJ : Zlzh.ZX(this.ZQ, this.Zp);
  }
  
  private Zt9b Zv(byte[] paramArrayOfbyte) {
    return this.ZN ? (this.ZL ? Zxar.ZP(paramArrayOfbyte) : Zxar.ZK(paramArrayOfbyte)) : (this.ZL ? Zxar.Zc(paramArrayOfbyte) : Zxar.Zg(paramArrayOfbyte));
  }
  
  private boolean lambda$aggregateReflectionMatchers$0(Zkv8 paramZkv8) {
    String[] arrayOfString = Zlzh.Zj();
    for (Zgl6 zgl6 : this.Zv) {
      if (!zgl6.Zv(paramZkv8))
        return false; 
      if (arrayOfString != null)
        break; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgk_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
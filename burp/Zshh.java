package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Zshh implements Zgh_ {
  private final Zs66 Zf;
  
  private final Zs66 ZJ;
  
  private final Ztwr ZD;
  
  private final String Zc;
  
  private final String ZM;
  
  private final Zxtl ZP;
  
  private final Zro0 ZV;
  
  private final Zsdu ZQ;
  
  private final Ztr2 Zo;
  
  private final Zs54 ZB;
  
  private static String Zl;
  
  public Zshh(Zs66 paramZs661, Zs66 paramZs662, Ztwr paramZtwr, String paramString1, String paramString2, Zs54 paramZs54, Zro0 paramZro0, Zxtl paramZxtl, Ztr2 paramZtr2) {
    this.ZJ = paramZs661;
    this.Zf = paramZs662;
    this.ZD = paramZtwr;
    this.Zc = paramString1;
    this.ZM = paramString2;
    this.ZV = paramZro0;
    this.ZP = paramZxtl;
    this.Zo = paramZtr2;
    this.ZQ = Zsdu.Zz(paramString2);
    String str = ZR();
    this.ZB = paramZs54;
    if (Zbqc.Zwu() == null)
      Zx("UnpwDb"); 
  }
  
  public int Zn() {
    return this.ZB.ZD();
  }
  
  public int ZD() {
    return this.ZB.ZS();
  }
  
  public Ztr2 ZN() {
    return this.Zo;
  }
  
  public Zs66 ZG() {
    return this.ZJ;
  }
  
  public Zs66 ZX() {
    return this.Zf;
  }
  
  public String ZT() {
    return this.Zc;
  }
  
  public List<Zxtl> Zl() {
    return Collections.singletonList(this.ZP);
  }
  
  public byte[] ZK() {
    return this.ZD.Zj();
  }
  
  public String Zr() {
    return this.ZM;
  }
  
  public boolean ZF() {
    return this.ZQ.ZAW();
  }
  
  public boolean Zo() {
    return this.ZQ.ZAr();
  }
  
  public boolean Ze() {
    return this.ZQ.ZAz();
  }
  
  public Zro0 ZM() {
    return this.ZV;
  }
  
  public String Z_() {
    return (this.ZJ == Zs66.PATH_FILENAME_PARAM || this.ZJ == Zs66.PATH_FOLDER_PARAM) ? Zr() : ZT();
  }
  
  public <T> T Z_(Zktv<T> paramZktv) {
    return paramZktv.ZN(this);
  }
  
  public boolean equals(Object paramObject) {
    String str = ZR();
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Zgh_) {
      Zgh_ zgh_ = (Zgh_)paramObject;
      if (str != null)
        return !ZG().equals(zgh_.ZG()) ? false : (!ZX().equals(zgh_.ZX()) ? false : (!Arrays.equals(ZK(), zgh_.ZK()) ? false : (!ZM().equals(zgh_.ZM()) ? false : (!Objects.equals(Zr(), zgh_.Zr()) ? false : (!!Objects.equals(ZT(), zgh_.ZT())))))); 
    } 
    return false;
  }
  
  public int hashCode() {
    String str = ZR();
    if (str == null)
      Zbqc.Zr(new Zbqc[4]); 
    return Objects.hash(new Object[] { ZG(), ZX(), Integer.valueOf(Arrays.hashCode(ZK())), ZM(), Zr(), ZT() });
  }
  
  public String toString() {
    return String.valueOf(ZG()) + "[" + String.valueOf(ZG()) + "=" + ZT() + "]";
  }
  
  public static void Zx(String paramString) {
    Zl = paramString;
  }
  
  public static String ZR() {
    return Zl;
  }
  
  static {
    if (ZR() == null)
      Zx("M2azqb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zshh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
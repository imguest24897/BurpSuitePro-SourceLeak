package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zrzt;
import net.portswigger.Zuh;

public class Zlx3 {
  private Zski ZF;
  
  private String ZJ = a;
  
  private Zsba ZV = Zsba.NONE;
  
  private String Zf;
  
  private String Zl;
  
  private Zz3o ZB;
  
  private final List<Zbz1> Ze = new ArrayList<>();
  
  private final List<Zt8g> ZN = new ArrayList<>();
  
  private final List<Zz_b> ZU = new ArrayList<>();
  
  private final List<Zzjv> ZG = new ArrayList<>();
  
  private static final String a;
  
  public Zlx3 ZC(String paramString) {
    this.ZJ = paramString;
    return this;
  }
  
  public Zlx3 ZI(Zsba paramZsba) {
    this.ZV = paramZsba;
    return this;
  }
  
  public Zlx3 ZW(Zski paramZski) {
    this.ZF = paramZski;
    return this;
  }
  
  public Zlx3 Zb(List<? extends Zz_b> paramList) {
    this.ZU.addAll(paramList);
    return this;
  }
  
  public Zlx3 Zi(List<Zzjv> paramList) {
    this.ZG.addAll(paramList);
    return this;
  }
  
  public Zlx3 ZX(String paramString) {
    this.Zf = paramString;
    return this;
  }
  
  public Zlx3 ZZ(Zz3o paramZz3o) {
    this.ZB = paramZz3o;
    return this;
  }
  
  public Zlx3 ZZ(String paramString) {
    this.Zl = paramString;
    return this;
  }
  
  public Zsp5 ZN() {
    String[] arrayOfString = Ze0p.ZG();
    if (this.ZF != null && this.ZF.ZyR() != null) {
      Zw();
      ZZ();
      ZA();
    } 
    Zyu<Zbz1> zyu = new Zyu<>(Zbz1.ZF, this.Ze.size());
    zyu.addAll(this.Ze);
    Zyu<Zt8g> zyu1 = new Zyu<>(Zt8g.ZG, this.ZN.size());
    zyu1.addAll(this.ZN);
    Zyu<Zz_b> zyu2 = new Zyu<>(Zz_b.Zk, this.ZU.size());
    zyu2.addAll(this.ZU);
    Zr2a zr2a = Zr2a.Zw(zyu1, zyu2);
    Zyu<Zgpi> zyu3 = new Zyu<>(Zzjv.Zy, this.ZG.size());
    zyu3.addAll((Collection)this.ZG);
    Zuh.Zb((this.ZF != null), Zqf.Zk);
    Zuh.Zb((this.ZJ != null), Zqf.Zk);
    Zuh.Zb((this.ZB != null), Zqf.Zk);
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zj5(this.ZF, this.ZJ, this.ZV, this.Zf, this.Zl, this.ZB, zyu, (Zefg)zyu3, zr2a);
  }
  
  private void Zw() {
    if (!this.Ze.isEmpty())
      return; 
    this.Ze.addAll(Zbz1.Zv(this.ZF.ZyR()));
  }
  
  private void ZZ() {
    String[] arrayOfString = Ze0p.ZG();
    if (!this.ZN.isEmpty())
      return; 
    byte[] arrayOfByte = this.ZF.ZyR().ZdC();
    if (arrayOfByte == null)
      return; 
    Zyf zyf = Zyf.Zy(arrayOfByte);
    List<Zt8g> list = Zeex.ZW(Zrdu.URL_PARAM, zyf, 0, zyf.Zpu(), Zsba.URL_ENCODED, null);
    for (Zt8g zt8g : list) {
      if (!zt8g.Zns().isEmpty())
        this.ZN.add(new Zck(zt8g.ZbQ(), Zrzt.ZJ(zt8g.Zns()), Zrzt.ZJ(zt8g.Zbn()))); 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void ZA() {
    this.ZU.removeIf(Zlx3::lambda$filterKeyParameters$0);
  }
  
  private static boolean lambda$filterKeyParameters$0(Zz_b paramZz_b) {
    return (paramZz_b.ZMm() == null);
  }
  
  static {
    // Byte code:
    //   0: bipush #94
    //   2: ldc '+h'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlx3.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #30
    //   82: goto -> 111
    //   85: bipush #48
    //   87: goto -> 111
    //   90: bipush #98
    //   92: goto -> 111
    //   95: bipush #79
    //   97: goto -> 111
    //   100: bipush #120
    //   102: goto -> 111
    //   105: iconst_2
    //   106: goto -> 111
    //   109: bipush #48
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlx3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
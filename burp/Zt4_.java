package burp;

import java.util.ArrayList;
import java.util.List;

public class Zt4_ implements Zgh_ {
  private final Zgh_ Zg;
  
  private final Zgh_ ZO;
  
  private final Zro0 Zj;
  
  private static final String a;
  
  public Zt4_(Zgh_ paramZgh_1, Zgh_ paramZgh_2, Zro0 paramZro0) {
    this.Zg = paramZgh_1;
    this.ZO = paramZgh_2;
    this.Zj = paramZro0;
  }
  
  public Zgh_ Zq() {
    return this.Zg;
  }
  
  public Zgh_ Zs() {
    return this.ZO;
  }
  
  public int ZW() {
    return this.Zj.ZEh();
  }
  
  public void ZU(int paramInt) {
    this.Zj.Zsy(paramInt);
  }
  
  public Zs66 ZG() {
    return this.ZO.ZG();
  }
  
  public Zs66 ZX() {
    return this.ZO.ZX();
  }
  
  public String ZT() {
    return this.ZO.ZT();
  }
  
  public List<Zxtl> Zl() {
    ArrayList<Zxtl> arrayList = new ArrayList();
    arrayList.addAll(this.Zg.Zl());
    arrayList.addAll(this.ZO.Zl());
    return arrayList;
  }
  
  public byte[] ZK() {
    return this.ZO.ZK();
  }
  
  public String Zr() {
    return this.ZO.Zr();
  }
  
  public boolean ZF() {
    return this.ZO.ZF();
  }
  
  public boolean Zo() {
    return this.ZO.Zo();
  }
  
  public boolean Ze() {
    return this.ZO.Ze();
  }
  
  public Zro0 ZM() {
    return this.Zj;
  }
  
  public String Z_() {
    return this.ZO.Z_();
  }
  
  public <T> T Z_(Zktv<T> paramZktv) {
    return paramZktv.Zr(this);
  }
  
  public boolean equals(Object paramObject) {
    String str = Zshh.ZR();
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Zt4_) {
      Zt4_ zt4_ = (Zt4_)paramObject;
      if (str != null)
        return zt4_.Zs().equals(Zs()); 
    } 
    return false;
  }
  
  public int hashCode() {
    return Zs().hashCode();
  }
  
  public String toString() {
    return Zs().toString() + Zs().toString() + a;
  }
  
  public static Zgh_ ZT(Zgh_ paramZgh_) {
    String str = Zshh.ZR();
    Zgh_ zgh_ = paramZgh_;
    while (zgh_ instanceof Zt4_) {
      Zt4_ zt4_ = (Zt4_)zgh_;
      zgh_ = zt4_.Zq();
      if (str == null)
        break; 
    } 
    return zgh_;
  }
  
  static {
    // Byte code:
    //   0: bipush #46
    //   2: ldc 'kXf\\b%lS5'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zt4_.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #13
    //   82: goto -> 112
    //   85: bipush #43
    //   87: goto -> 112
    //   90: bipush #19
    //   92: goto -> 112
    //   95: bipush #59
    //   97: goto -> 112
    //   100: bipush #82
    //   102: goto -> 112
    //   105: bipush #78
    //   107: goto -> 112
    //   110: bipush #111
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt4_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
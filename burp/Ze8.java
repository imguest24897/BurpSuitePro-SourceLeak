package burp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ze8 {
  private final Zm5v Z_;
  
  private final Zl5k Zj;
  
  private final Ztg9 ZF;
  
  private final Zbx9 ZG;
  
  private final Zbnt Zv;
  
  private final Ztwv Zf;
  
  private final Zey9 Zd;
  
  private int ZD;
  
  private double ZL;
  
  private int ZH;
  
  private int Zb;
  
  private static final String a;
  
  Ze8(Zm5v paramZm5v, Zl5k paramZl5k, Ztg9 paramZtg9, Zbx9 paramZbx9, Zbnt paramZbnt, Ztwv paramZtwv, Zey9 paramZey9) {
    this.Z_ = paramZm5v;
    this.Zj = paramZl5k;
    this.ZF = paramZtg9;
    this.ZG = paramZbx9;
    this.Zv = paramZbnt;
    this.Zf = paramZtwv;
    this.Zd = paramZey9;
  }
  
  public void Ze() {
    this.Zf.Zx(this::lambda$start$0);
  }
  
  public synchronized boolean Zh(byte[] paramArrayOfbyte, boolean paramBoolean) {
    if (this.Zj.Zy.Zm && paramArrayOfbyte != null) {
      this.ZD++;
      if (this.ZD > 10 && (paramArrayOfbyte.length < this.ZL - this.Zj.Zy.ZG || paramArrayOfbyte.length > this.ZL + this.Zj.Zy.ZG))
        paramArrayOfbyte = null; 
      if (paramArrayOfbyte != null)
        this.ZL = (this.ZL * (this.ZD - 1) + paramArrayOfbyte.length) / this.ZD; 
    } 
    if (paramArrayOfbyte != null)
      this.ZF.ZE(paramArrayOfbyte); 
    this.ZH++;
    if (paramBoolean)
      this.Zb++; 
    return this.ZF.ZP(this.ZH, this.Zb);
  }
  
  public static Map<String, String> ZT(byte[] paramArrayOfbyte) {
    return Zth6.Zl(Zsbj.Zi(paramArrayOfbyte, a, false));
  }
  
  public static Map<String, String> ZU(byte[] paramArrayOfbyte, int paramInt, Zbnt paramZbnt) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    List<Ztu8> list = Zeam.Zv(paramArrayOfbyte, paramInt, paramArrayOfbyte.length, (byte)0);
    Iterator<Zx8_> iterator = Zrl7.ZN(null, list, paramZbnt).iterator();
    boolean bool = Zba6.ZY();
    while (iterator.hasNext()) {
      Zx8_ zx8_ = iterator.next();
      for (Zmwr zmwr : zx8_.ZZp()) {
        if (zmwr.Zh4() != null && zmwr.Zh1() != null)
          hashMap.put(zmwr.Zh4(), zmwr.Zh1()); 
        if (bool)
          break; 
      } 
      if (bool)
        break; 
    } 
    return (Map)hashMap;
  }
  
  public Zskh Zw() {
    return this.Z_.ZR();
  }
  
  private void lambda$start$0() {
    boolean bool = Zba6.ZY();
    byte b = 0;
    while (b < this.Zj.Zy.ZQ) {
      this.Zf.Zx(new Zetj(this, this.Zj, this.ZG, this.Zv, this.Zd));
      if (this.Zj.Zy.ZC > 0L)
        try {
          Thread.sleep(this.Zj.Zy.ZC);
        } catch (InterruptedException interruptedException) {
          Zah.Zl(interruptedException, Zk_.IGNORED);
        }  
      b++;
      if (bool)
        break; 
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: ldc '<)X#\$%\\f'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ze8.a : Ljava/lang/String;
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
    //   80: bipush #94
    //   82: goto -> 112
    //   85: bipush #93
    //   87: goto -> 112
    //   90: bipush #120
    //   92: goto -> 112
    //   95: bipush #100
    //   97: goto -> 112
    //   100: bipush #81
    //   102: goto -> 112
    //   105: bipush #34
    //   107: goto -> 112
    //   110: bipush #96
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
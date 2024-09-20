package burp;

import java.util.List;
import java.util.zip.CRC32;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zz2h {
  private static final int Zl;
  
  private final Zrte<Zs37> Zo;
  
  private final Zr_4 Ze;
  
  Zz2h(Zrte<Zs37> paramZrte, Zr_4 paramZr_4) {
    this.Zo = paramZrte;
    this.Ze = paramZr_4;
  }
  
  public void ZP(String paramString1, String paramString2) {
    String[] arrayOfString = Zlt9.ZV();
    int i = ZK();
    Zuh.Zb((i >= 0 && i < 20), Zqf.Zr);
    if (i == 19) {
      Zs(paramString2);
      if (arrayOfString == null) {
        Zb(i, paramString1, paramString2);
        return;
      } 
      return;
    } 
    Zb(i, paramString1, paramString2);
  }
  
  public Zs37 ZB(Zrdb paramZrdb) {
    String str = Zz3z.ZA(paramZrdb);
    return ZP(str);
  }
  
  public Zs37 ZP(String paramString) {
    int i = Zm(paramString);
    return ZL(i);
  }
  
  public Zs37 Za() {
    return ZL(Zl);
  }
  
  public boolean Zs() {
    Zs37 zs37 = this.Zo.ZdF(19);
    return (zs37 != null);
  }
  
  public Zs37 ZO() {
    return this.Zo.ZdF(19);
  }
  
  public int ZW(List<Zrdb> paramList) {
    return (int)paramList.stream().filter(this::lambda$getNumberOfOtherIssuesAtSamePathThatWillNotBeMerged$0).count();
  }
  
  private void Zb(int paramInt, String paramString1, String paramString2) {
    this.Zo.ZU(paramInt, this.Ze.<Zs37>ZH(new Ztgi(Zm(paramString1), paramString2)));
  }
  
  private int ZK() {
    String[] arrayOfString = Zlt9.ZV();
    byte b = 0;
    while (b < this.Zo.Zpu()) {
      Zs37 zs37 = this.Zo.ZdF(b);
      if (zs37 == null)
        return b; 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return -1;
  }
  
  private Zs37 ZL(int paramInt) {
    String[] arrayOfString = Zlt9.ZV();
    byte b = 0;
    while (b < this.Zo.Zpu()) {
      Zs37 zs37 = this.Zo.ZdF(b);
      if (zs37 != null && zs37.Zvy() == paramInt)
        return zs37; 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return null;
  }
  
  private void Zs(String paramString) {
    String str = paramString;
    byte b = 0;
    String[] arrayOfString = Zlt9.ZV();
    while (b < this.Zo.Zpu() - 1) {
      Zs37 zs371 = this.Zo.ZdF(b);
      str = Zg1s.Z_(str, zs371.Zv2());
      b++;
      if (arrayOfString == null)
        break; 
    } 
    Zs37 zs37 = this.Ze.<Zs37>ZH(new Ztgi(Zl, str, (byte)20));
    this.Zo.ZU(19, zs37);
  }
  
  private static int Zm(String paramString) {
    CRC32 cRC32 = new CRC32();
    for (byte b : Zkb.Zy(paramString))
      cRC32.update(b); 
    return (int)cRC32.getValue();
  }
  
  private boolean lambda$getNumberOfOtherIssuesAtSamePathThatWillNotBeMerged$0(Zrdb paramZrdb) {
    int i = Zm(Zz3z.ZA(paramZrdb));
    byte b = 0;
    String[] arrayOfString = Zlt9.ZV();
    while (b < this.Zo.Zpu()) {
      Zs37 zs37 = this.Zo.ZdF(b);
      if (zs37 != null && zs37.Zvy() == i)
        return zs37.ZvI(); 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: ldc 'ÌÇ×K>,$¨öä'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 154
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 128
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #121
    //   82: goto -> 112
    //   85: bipush #114
    //   87: goto -> 112
    //   90: bipush #98
    //   92: goto -> 112
    //   95: bipush #29
    //   97: goto -> 112
    //   100: bipush #67
    //   102: goto -> 112
    //   105: bipush #81
    //   107: goto -> 112
    //   110: bipush #72
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #1, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 33
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_1
    //   132: if_icmpgt -> 30
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
    //   154: aload_0
    //   155: invokestatic Zm : (Ljava/lang/String;)I
    //   158: putstatic burp/Zz2h.Zl : I
    //   161: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz2h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
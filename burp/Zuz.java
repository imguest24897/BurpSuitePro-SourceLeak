package burp;

import java.awt.Component;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zuz extends Zni implements Zvo1 {
  @Zzvo(0)
  private final Zmzk Zh;
  
  @Zzvo(1)
  private final Zlit ZC;
  
  @Zzvo(4)
  private final long ZI;
  
  @Zzvo(7)
  private final short ZZ;
  
  @Zzvo(5)
  private final long Zp;
  
  @Zzvo(12)
  private final String ZO;
  
  @Zzvo(13)
  private final String Zt;
  
  @Zzvo(14)
  private final String ZF;
  
  @Zzvo(3)
  protected Zstu ZS;
  
  @Zzvo(6)
  protected int Zq;
  
  private final Zbr ZR;
  
  private final int[] Zr = new int[2];
  
  private static final String a;
  
  public Zuz(Zmzk paramZmzk, Zlit paramZlit, long paramLong1, short paramShort, long paramLong2, Zstu paramZstu, int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, Zbr paramZbr) {
    String str = Ze14.Za();
    this.Zh = paramZmzk;
    this.ZC = paramZlit;
    this.ZI = paramLong1;
    this.ZZ = paramShort;
    this.Zp = paramLong2;
    this.ZS = paramZstu;
    this.Zq = paramInt1;
    this.Zr[0] = paramInt2;
    this.Zr[1] = paramInt3;
    this.ZO = paramString1;
    this.Zt = paramString2;
    this.ZF = paramString3;
    this.ZR = paramZbr;
    if (Zbqc.Zwu() == null)
      Ze14.ZF("p7rOb"); 
  }
  
  public long ZYQ() {
    return this.Zp;
  }
  
  public int[] ZYt() {
    return this.Zr;
  }
  
  @Zzvo(8)
  private int ZS() {
    return this.Zr[0];
  }
  
  @Zzvo(9)
  private int Zv() {
    return this.Zr[1];
  }
  
  public void ZU(int[] paramArrayOfint) {
    String str = Ze14.Za();
    if (paramArrayOfint == null) {
      this.Zr[0] = 0;
      this.Zr[1] = 0;
      if (str != null) {
        this.Zr[0] = paramArrayOfint[0];
        this.Zr[1] = paramArrayOfint[1];
        return;
      } 
      return;
    } 
    this.Zr[0] = paramArrayOfint[0];
    this.Zr[1] = paramArrayOfint[1];
  }
  
  public String ZYN() {
    return this.ZO;
  }
  
  public String ZYT() {
    return this.Zt;
  }
  
  public String ZYG() {
    return this.ZF;
  }
  
  public Zeew Ze2() {
    return Zeew.REPEATER;
  }
  
  public Zlit ZlL() {
    return this.ZC;
  }
  
  public short Zl7() {
    return this.ZZ;
  }
  
  public int Zlq() {
    return this.Zq;
  }
  
  public long ZoB() {
    return this.ZI;
  }
  
  public Zmzk Zod() {
    return this.Zh;
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return null;
  }
  
  public Zbr Zo3() {
    return this.ZR;
  }
  
  public Zstu Zos() {
    Zbr zbr = Zo3();
    if (zbr == null || zbr.Zd())
      return null; 
    Zuh.ZT(zbr.Zz(), Zqf.Zr, a);
    return zbr.Zr();
  }
  
  public Zstu ZoO() {
    return this.ZS;
  }
  
  public String ZIx() {
    return null;
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Zsou.ZD(this, paramZkl6.ZH());
  }
  
  public boolean Zd(Zz28 paramZz28) {
    return paramZz28.ZG(this.ZC);
  }
  
  @Zzvo(2)
  private Zstu ZX() {
    return (this.ZR == null) ? null : this.ZR.Zr();
  }
  
  @Zzvo(10)
  private Zefg<Zk94> Zd() {
    return (this.ZR == null) ? null : this.ZR.ZO();
  }
  
  @Zzvo(11)
  private byte Zu() {
    return (this.ZR == null) ? Zkyt.UNKNOWN.persistedId : (this.ZR.Zx()).persistedId;
  }
  
  static {
    // Byte code:
    //   0: bipush #120
    //   2: ldc '!*R$NAS'B"\\nP+F#XL*WN@<WJTS<K>^QS-Fq^PoJ?XP+\\r'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zuz.a : Ljava/lang/String;
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
    //   80: bipush #11
    //   82: goto -> 112
    //   85: bipush #55
    //   87: goto -> 112
    //   90: bipush #91
    //   92: goto -> 112
    //   95: bipush #41
    //   97: goto -> 112
    //   100: bipush #83
    //   102: goto -> 112
    //   105: bipush #26
    //   107: goto -> 112
    //   110: bipush #77
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zuz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
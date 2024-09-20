package burp;

public class Zaq extends Zni implements Zt9r {
  @Zzvo(0)
  private boolean Zi;
  
  @Zzvo(1)
  private String Zq;
  
  @Zzvo(2)
  private final Zeek ZI;
  
  @Zzvo(3)
  private Zsqo ZV;
  
  @Zzvo(4)
  private String ZG;
  
  @Zzvo(5)
  private boolean Zj;
  
  @Zzvo(6)
  private final Zefg<Zsdr> ZQ;
  
  @Zzvo(7)
  private final Zefg<Zx_z> ZS;
  
  private static final String a;
  
  public Zaq(int paramInt, Zeek paramZeek) {
    this.ZI = paramZeek;
    this.ZQ = new Zyu<>(Zsdr.Zo, 0);
    this.ZS = new Zyu<>(Zx_z.ZM);
    this.ZV = new Zy8(9);
    this.ZV.ZC(Ztuh.Zv(Zeew.TARGET), true);
    this.ZV.ZC(Ztuh.Zv(Zeew.SCANNER), true);
    this.ZV.ZC(Ztuh.Zv(Zeew.INTRUDER), true);
    this.ZV.ZC(Ztuh.Zv(Zeew.REPEATER), true);
    this.ZV.ZC(Ztuh.Zv(Zeew.SEQUENCER), true);
    this.Zi = true;
    Zbqc[] arrayOfZbqc = Ztuh.Zz();
    this.Zq = a + a;
    if (Zbqc.Zwu() == null)
      Ztuh.Zx(new Zbqc[3]); 
  }
  
  public boolean ZWX() {
    return this.Zi;
  }
  
  public void Zto(boolean paramBoolean) {
    this.Zi = paramBoolean;
  }
  
  public String ZW9() {
    return this.Zq;
  }
  
  public void Ziq(String paramString) {
    this.Zq = paramString;
  }
  
  public Zeek ZWH() {
    return this.ZI;
  }
  
  public Zsqo ZWA() {
    return this.ZV;
  }
  
  public void ZD(Zsqo paramZsqo) {
    this.ZV = paramZsqo;
  }
  
  public String ZWr() {
    return this.ZG;
  }
  
  public void ZiX(String paramString) {
    this.ZG = paramString;
  }
  
  public boolean ZWu() {
    return this.Zj;
  }
  
  public void Zt1(boolean paramBoolean) {
    this.Zj = paramBoolean;
  }
  
  public Zefg<Zsdr> ZW1() {
    return this.ZQ;
  }
  
  public Zefg<Zx_z> ZWZ() {
    return this.ZS;
  }
  
  public Zeu4<Zt9r> ZF() {
    return Zp;
  }
  
  static {
    // Byte code:
    //   0: bipush #58
    //   2: ldc '%>\\f)@'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zaq.a : Ljava/lang/String;
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
    //   80: bipush #77
    //   82: goto -> 112
    //   85: bipush #113
    //   87: goto -> 112
    //   90: bipush #90
    //   92: goto -> 112
    //   95: bipush #118
    //   97: goto -> 112
    //   100: bipush #90
    //   102: goto -> 112
    //   105: bipush #38
    //   107: goto -> 112
    //   110: bipush #125
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zaq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
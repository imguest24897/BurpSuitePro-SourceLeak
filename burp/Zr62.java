package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public abstract class Zr62 {
  protected final Zey9 Zq;
  
  private final Zbnt ZU;
  
  private Zt68 ZS;
  
  private List<Zbzi> ZD;
  
  private Boolean ZH;
  
  private static String[] ZP;
  
  private static final String a;
  
  protected Zr62(Zbnt paramZbnt, Zey9 paramZey9) {
    this.ZU = paramZbnt;
    this.Zq = paramZey9;
    this.ZS = Zt68.Zv;
    this.ZD = null;
    this.ZH = null;
  }
  
  protected abstract Zefx ZE();
  
  public Zmzk ZT() {
    return ZE().ZT();
  }
  
  public byte[] ZD() {
    return ZE().ZD();
  }
  
  public byte[] Zw() {
    return ZE().Zw();
  }
  
  public boolean Zh() {
    return ZE().Zh();
  }
  
  public Zlit ZF() {
    return Zg((byte)1).Zo();
  }
  
  public List<String> ZG() {
    return Zg((byte)1).ZP();
  }
  
  public Zefx Zb() {
    return ZE().Zb();
  }
  
  public boolean Zp(String paramString, boolean paramBoolean) {
    Zqv zqv = new Zqv(ZE(), paramString, paramBoolean);
    ZE().Zi(zqv);
    return zqv.Ze;
  }
  
  public String Zx(String paramString, boolean paramBoolean) {
    Zqv zqv = new Zqv(ZE(), paramString, paramBoolean);
    ZE().Zi(zqv);
    return zqv.Zz;
  }
  
  public List<Zlou> Zc() {
    return Zg((byte)2).Zm();
  }
  
  public String Zr() {
    return Zg((byte)1).ZX();
  }
  
  public String Z_() {
    return Zg((byte)1).ZV();
  }
  
  public Zsba Zv() {
    return Zg((byte)2).Zr();
  }
  
  public boolean ZC() {
    return Zg((byte)2).Zy();
  }
  
  public int ZR() {
    return Zg((byte)1).Zl();
  }
  
  public Zefx ZH(Zlou paramZlou) {
    Zrcs zrcs = Zz6m.ZI(this.Zq, paramZlou, ZE(), this::ZO);
    ZE().Zi(zrcs);
    return zrcs.ZK();
  }
  
  public Zefx ZO(Zlou paramZlou) {
    Zrcs zrcs = Zz6m.ZJ(this.ZU, this.Zq, ZE(), paramZlou, this::ZO);
    ZE().Zi(zrcs);
    return zrcs.ZK();
  }
  
  public Zefx Zr(String paramString) {
    Zg92 zg92 = new Zg92(this.Zq, paramString);
    ZE().Zi(zg92);
    return zg92.ZK();
  }
  
  public Zefx Zo(String paramString) {
    Zlo8 zlo8 = new Zlo8(this.ZU, this.Zq, paramString);
    ZE().Zi(zlo8);
    return zlo8.ZK();
  }
  
  public Zefx ZU(String paramString) {
    Zsa7 zsa7 = new Zsa7(this.ZU, this.Zq, paramString);
    ZE().Zi(zsa7);
    return zsa7.ZK();
  }
  
  public Zefx Zc(String paramString) {
    Zdu zdu = new Zdu(this.Zq, paramString);
    ZE().Zi(zdu);
    return zdu.ZK();
  }
  
  public Zefx ZA(String paramString1, String paramString2) {
    Zrcs zrcs = Zz6m.Zv(this.ZU, this.Zq, ZE(), paramString1, paramString2, this::ZO);
    ZE().Zi(zrcs);
    return zrcs.ZK();
  }
  
  public Zefx ZK(String paramString1, Zrdu paramZrdu, String paramString2) {
    Zrcs zrcs = Zz6m.Zj(this.ZU, this.Zq, ZE(), paramString1, paramZrdu, paramString2, this::ZO);
    ZE().Zi(zrcs);
    return zrcs.ZK();
  }
  
  public Zefx Zm(String paramString1, String paramString2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZE : ()Lburp/Zefx;
    //   4: dup
    //   5: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   8: pop
    //   9: astore #4
    //   11: iconst_0
    //   12: istore #5
    //   14: aload #4
    //   16: iload #5
    //   18: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   23: lookupswitch default -> 48, 0 -> 62, 1 -> 83
    //   48: new java/lang/MatchException
    //   51: dup
    //   52: aconst_null
    //   53: aconst_null
    //   54: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   57: athrow
    //   58: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   61: athrow
    //   62: aload #4
    //   64: checkcast burp/Zr6q
    //   67: astore #6
    //   69: aload #6
    //   71: aload_1
    //   72: aload_2
    //   73: aload_0
    //   74: getfield Zq : Lburp/Zey9;
    //   77: invokestatic ZE : (Lburp/Zr6q;Ljava/lang/String;Ljava/lang/String;Lburp/Zey9;)Lburp/Zefx;
    //   80: goto -> 102
    //   83: aload #4
    //   85: checkcast burp/Zr6h
    //   88: astore #7
    //   90: aload #7
    //   92: aload_1
    //   93: aload_2
    //   94: iload_3
    //   95: aload_0
    //   96: getfield Zq : Lburp/Zey9;
    //   99: invokestatic ZM : (Lburp/Zr6h;Ljava/lang/String;Ljava/lang/String;ZLburp/Zey9;)Lburp/Zefx;
    //   102: areturn
    // Exception table:
    //   from	to	target	type
    //   14	58	58	java/lang/MatchException
  }
  
  private static Zefx ZE(Zr6q paramZr6q, String paramString1, String paramString2, Zey9 paramZey9) {
    String str = String.format(a, new Object[] { paramString1, paramString2 });
    byte[] arrayOfByte = Zsbj.Z_(paramZr6q.ZD(), str);
    Zmzk zmzk = paramZr6q.ZT();
    return paramZey9.ZY(zmzk, arrayOfByte);
  }
  
  private static Zefx ZM(Zr6h paramZr6h, String paramString1, String paramString2, boolean paramBoolean, Zey9 paramZey9) {
    ArrayList<Ztnz> arrayList = new ArrayList<>(paramZr6h.ZK());
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    arrayList.add(new Ztnz(paramBoolean ? paramString1 : paramString1.toLowerCase(Locale.ENGLISH), paramString2));
    return paramZey9.ZR(paramZr6h.ZT(), arrayList, paramZr6h.Zw());
  }
  
  public Zefx Zp(String paramString1, String paramString2, boolean paramBoolean) {
    Zrcs zrcs = Zkt.ZY(this.Zq, paramString1, paramString2, paramBoolean);
    ZE().Zi(zrcs);
    return zrcs.ZK();
  }
  
  public Zefx ZY(String paramString) {
    Zrcs zrcs = Zkt.Zo(this.Zq, paramString);
    ZE().Zi(zrcs);
    return zrcs.ZK();
  }
  
  public Zefx ZZ(byte[] paramArrayOfbyte) {
    Zrcs zrcs = Zt8b.Zo(this.Zq, paramArrayOfbyte);
    ZE().Zi(zrcs);
    return zrcs.ZK();
  }
  
  public List<Zbzi> Zk() {
    try {
      if (this.ZD == null)
        this.ZD = Zx8u.ZY(ZE()); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return this.ZD;
  }
  
  public boolean ZH() {
    try {
      if (this.ZH == null)
        this.ZH = Boolean.valueOf(Zz69.ZL(ZE())); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return this.ZH.booleanValue();
  }
  
  public Zefx ZN(Zrec paramZrec) {
    return paramZrec.Zv(ZE());
  }
  
  public Zefx Zo() {
    Zefx zefx1 = ZE();
    Zefx zefx2 = zefx1.Zo();
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (zefx1 == zefx2) ? ZE() : zefx2;
  }
  
  public Zefx Zp() {
    Zefx zefx1 = ZE();
    Zefx zefx2 = zefx1.Zp();
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (zefx1 == zefx2) ? ZE() : zefx2;
  }
  
  public Zefx Zt() {
    Zefx zefx1 = ZE();
    Zefx zefx2 = zefx1.Zt();
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (zefx1 == zefx2) ? ZE() : zefx2;
  }
  
  public void Zi(Zg5o paramZg5o) {
    ZE().Zi(paramZg5o);
  }
  
  public void Zh(Zbf7 paramZbf7) {
    paramZbf7.ZS(ZE());
  }
  
  public Zefx ZM(Zmzk paramZmzk) {
    try {
      if (Objects.equals(paramZmzk, ZT()))
        return ZE(); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zsym zsym = new Zsym(paramZmzk, this.Zq);
    Zi(zsym);
    return zsym.ZS();
  }
  
  private void ZO(Zbi1 paramZbi1) {
    Zg(paramZbi1.Zw()).ZO(paramZbi1);
  }
  
  private synchronized Zt68 Zg(byte paramByte) {
    try {
      if (this.ZS.Zf(paramByte))
        return this.ZS; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zmza zmza = new Zmza(this.ZU, this.ZS, paramByte);
    ZE().Zi(zmza);
    this.ZS = zmza.ZS();
    return this.ZS;
  }
  
  public boolean equals(Object paramObject) {
    Zefx zefx;
    boolean bool = Zey9.ZC();
    try {
      if (ZE() == paramObject)
        return true; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    if (paramObject instanceof Zefx) {
      zefx = (Zefx)paramObject;
      try {
        if (bool)
          return false; 
      } catch (MatchException matchException) {
        throw a(null);
      } 
    } else {
      return false;
    } 
    try {
      if (Objects.equals(ZT(), zefx.ZT()))
        try {
          if (Arrays.equals(ZD(), zefx.ZD()));
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  public static void Zp(String[] paramArrayOfString) {
    ZP = paramArrayOfString;
  }
  
  public static String[] Zm() {
    return ZP;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zm : ()[Ljava/lang/String;
    //   3: ifnull -> 13
    //   6: iconst_2
    //   7: anewarray java/lang/String
    //   10: invokestatic Zp : ([Ljava/lang/String;)V
    //   13: bipush #34
    //   15: ldc '[1f ['
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zr62.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #92
    //   94: goto -> 124
    //   97: bipush #72
    //   99: goto -> 124
    //   102: bipush #41
    //   104: goto -> 124
    //   107: bipush #100
    //   109: goto -> 124
    //   112: bipush #7
    //   114: goto -> 124
    //   117: bipush #10
    //   119: goto -> 124
    //   122: bipush #112
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr62.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
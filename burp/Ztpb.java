package burp;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztpb implements Zk5_, Zt84, Zgd8<Zk9_> {
  private final Zr_4 Zk;
  
  private final Zk9_ ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztpb(Zeo2 paramZeo2, Zr_4 paramZr_4) {
    this.Zk = paramZr_4;
    this.ZW = paramZr_4.<Zk9_>ZH(new Zkm_());
    this.ZW.Zxa(paramZeo2.ZX4());
    this.ZW.Zw(paramZeo2.ZlL());
    this.ZW.ZI(paramZeo2.Zos());
    this.ZW.ZZ(paramZeo2.ZoO());
    this.ZW.ZE(paramZeo2.Zl7());
  }
  
  Ztpb(Zk9_ paramZk9_, Zr_4 paramZr_4) {
    this.Zk = paramZr_4;
    this.ZW = paramZk9_;
  }
  
  public Zlit ZP() {
    return this.ZW.ZxK();
  }
  
  public void Za(List<Ztbr> paramList) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZW : Lburp/Zk9_;
    //   8: invokeinterface ZxF : ()Lburp/Zefg;
    //   13: astore_3
    //   14: aload_3
    //   15: ifnonnull -> 43
    //   18: aload_0
    //   19: getfield Zk : Lburp/Zr_4;
    //   22: getstatic burp/Ztbr.Zl : Lburp/Zeu4;
    //   25: invokestatic ZV : (Lburp/Zr_4;Lburp/Zeu4;)Lburp/Zefg;
    //   28: astore_3
    //   29: aload_0
    //   30: getfield ZW : Lburp/Zk9_;
    //   33: aload_3
    //   34: invokeinterface ZB : (Lburp/Zefg;)V
    //   39: aload_2
    //   40: ifnonnull -> 49
    //   43: aload_3
    //   44: invokeinterface clear : ()V
    //   49: aload_1
    //   50: invokeinterface iterator : ()Ljava/util/Iterator;
    //   55: astore #4
    //   57: aload #4
    //   59: invokeinterface hasNext : ()Z
    //   64: ifeq -> 104
    //   67: aload #4
    //   69: invokeinterface next : ()Ljava/lang/Object;
    //   74: checkcast burp/Ztbr
    //   77: astore #5
    //   79: aload_3
    //   80: aload_0
    //   81: getfield Zk : Lburp/Zr_4;
    //   84: aload #5
    //   86: invokeinterface Zo : (Lburp/Zg35;)Lburp/Zg35;
    //   91: checkcast burp/Ztbr
    //   94: invokeinterface add : (Ljava/lang/Object;)Z
    //   99: pop
    //   100: aload_2
    //   101: ifnonnull -> 57
    //   104: new java/lang/StringBuilder
    //   107: dup
    //   108: invokespecial <init> : ()V
    //   111: astore #4
    //   113: aload_1
    //   114: invokeinterface iterator : ()Ljava/util/Iterator;
    //   119: astore #5
    //   121: aload #5
    //   123: invokeinterface hasNext : ()Z
    //   128: ifeq -> 160
    //   131: aload #5
    //   133: invokeinterface next : ()Ljava/lang/Object;
    //   138: checkcast burp/Ztbr
    //   141: astore #6
    //   143: aload_0
    //   144: aload #4
    //   146: aload #6
    //   148: invokeinterface Zqy : ()Ljava/lang/String;
    //   153: invokevirtual ZI : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   156: aload_2
    //   157: ifnonnull -> 121
    //   160: aload_0
    //   161: getfield ZW : Lburp/Zk9_;
    //   164: aload #4
    //   166: invokevirtual toString : ()Ljava/lang/String;
    //   169: invokeinterface Zx2 : (Ljava/lang/String;)V
    //   174: return
  }
  
  void ZI() {
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    String[] arrayOfString = Zlil.Za();
    if (this.ZW.Zx_() != null)
      for (Zmfi zmfi : this.ZW.Zx_()) {
        switch (zmfi.ZlJ()) {
          case 0:
            ZI(stringBuilder1, zmfi.Zla().Zns());
          case 1:
            ZI(stringBuilder2, zmfi.Zla().Zns());
          default:
            Zuh.Zv(false, Zqf.Zk, zmfi.ZlJ());
            break;
        } 
        continue;
        if (arrayOfString == null)
          break; 
      }  
    this.ZW.Zxs(stringBuilder1.toString());
    this.ZW.Zxt(stringBuilder2.toString());
  }
  
  private void ZI(StringBuilder paramStringBuilder, String paramString) {
    if (paramStringBuilder.length() > 0)
      paramStringBuilder.append(a(10448, -26597)); 
    paramStringBuilder.append(paramString);
  }
  
  void ZB(int paramInt1, int paramInt2) {
    String[] arrayOfString = Zlil.Za();
    if (this.ZW.Zx_() != null)
      for (Zmfi zmfi : this.ZW.Zx_()) {
        zmfi.Zw(paramInt1, paramInt2);
        if (arrayOfString == null)
          break; 
      }  
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    paramZs4f.ZL("m", this.ZW.ZxO());
    paramZs4f.ZX(a(10471, 23129), this.ZW.ZxK());
    String[] arrayOfString = Zlil.Za();
    try {
      if (this.ZW.Zxc() != null)
        paramZs4f.Ze(a(10452, -10706), this.ZW.Zxc()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZW.Zxy() != null)
        paramZs4f.Ze(a(10479, -12090), this.ZW.Zxy()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZs4f.Zb(a(10453, 24047), this.ZW.Zxz());
    Zefg<Zmfi> zefg = this.ZW.Zx_();
    if (zefg != null)
      synchronized (zefg.Zz6()) {
        for (Zmfi zmfi : zefg) {
          paramZs4f.ZX(a(10468, -11127), zmfi);
          if (arrayOfString == null)
            break; 
        } 
      }  
    Zefg<Zmo2> zefg1 = this.ZW.Zx9();
    if (zefg1 != null)
      synchronized (zefg1.Zz6()) {
        for (Zmo2 zmo2 : zefg1) {
          paramZs4f.ZX(a(10477, -9505), zmo2);
          if (arrayOfString == null)
            break; 
        } 
      }  
    Zefg<Ztbr> zefg2 = this.ZW.ZxF();
    if (zefg2 != null)
      synchronized (zefg2.Zz6()) {
        for (Ztbr ztbr : zefg2) {
          paramZs4f.ZX("c", ztbr);
          if (arrayOfString == null)
            break; 
        } 
      }  
    try {
      paramZs4f.Zk(a(10456, -11371), this.ZW.ZxA());
      paramZs4f.Zk(a(10493, 25829), this.ZW.Zxv());
      if (this.ZW.Zxe() != null)
        paramZs4f.ZL(a(10482, -26864), this.ZW.Zxe()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZW.Zxr() != null)
        paramZs4f.ZL(a(10465, 4485), this.ZW.Zxr()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZW.ZxS() != null)
        paramZs4f.ZL(a(10451, -5265), this.ZW.ZxS()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public static Ztpb ZG(String paramString, Zgyp paramZgyp, Zbnt paramZbnt, Zr_4 paramZr_4) throws IOException, Ze27 {
    String[] arrayOfString = Zlil.Za();
    Zgyp zgyp = paramZgyp.Zm(paramString);
    try {
      if (zgyp == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zk9_ zk9_ = paramZr_4.<Zk9_>ZH(new Zkm_());
    zk9_.Zxa(zgyp.ZW("m"));
    zk9_.Zw(Zmr5.ZU(a(10483, -16551), zgyp, paramZbnt, paramZr_4));
    zk9_.ZI(Zf(zgyp.Zi(a(10480, -27182)), paramZr_4));
    zk9_.ZZ(Zf(zgyp.Zi(a(10472, 16156)), paramZr_4));
    zk9_.ZE(zgyp.ZM(a(10488, -28176)).shortValue());
    Zefg<Zmfi> zefg = Zkk.ZV(paramZr_4, Zmfi.ZC);
    do {
      Zmfi zmfi = Ze3.Za(a(10474, 13649), zgyp, paramZr_4);
      if (zmfi == null)
        break; 
      zefg.add(zmfi);
    } while (arrayOfString != null);
    zk9_.ZV(zefg);
    Zefg<Zmo2> zefg1 = Zkk.ZV(paramZr_4, Zmo2.ZL);
    do {
      Zmo2 zmo2 = Zl1i.Zm(a(10449, 20459), zgyp, paramZr_4);
      if (zmo2 == null)
        break; 
      zefg1.add(zmo2);
    } while (arrayOfString != null);
    zk9_.ZD(zefg1);
    Zefg<Ztbr> zefg2 = Zkk.ZV(paramZr_4, Ztbr.Zl);
    do {
      Ztbr ztbr = Ztcn.Z_("c", zgyp, paramZr_4);
      if (ztbr == null)
        break; 
      zefg2.add(ztbr);
    } while (arrayOfString != null);
    zk9_.ZB(zefg2);
    zk9_.ZRC(zgyp.Zq(a(10454, -15411)).booleanValue());
    zk9_.ZRE(zgyp.Zq(a(10455, -12807)).booleanValue());
    zk9_.Zx2(zgyp.ZW(a(10494, -17221)));
    zk9_.Zxs(zgyp.ZW(a(10481, -2953)));
    zk9_.Zxt(zgyp.ZW(a(10489, 11047)));
    zgyp.ZE();
    return new Ztpb(zk9_, paramZr_4);
  }
  
  private static Zstu Zf(Zstu paramZstu, Zr_4 paramZr_4) {
    return (paramZstu != null) ? paramZstu.Zp(paramZr_4) : null;
  }
  
  public byte[] ZcV() {
    return (this.ZW.Zxy() == null) ? null : this.ZW.Zxy().ZiD();
  }
  
  public Zs68 ZeG() {
    return null;
  }
  
  public void Zl(byte[] paramArrayOfbyte, Zr_4 paramZr_4) {
    this.ZW.ZZ((paramArrayOfbyte == null) ? null : paramZr_4.ZZ(paramArrayOfbyte));
  }
  
  public String Zj() {
    return this.ZW.ZxO();
  }
  
  public void Zx(Zlit paramZlit) {
    this.ZW.Zw(paramZlit);
  }
  
  public Zstu Zp() {
    return this.ZW.Zxc();
  }
  
  public void Zk(Zstu paramZstu) {
    this.ZW.ZI(paramZstu);
  }
  
  public Zstu ZD() {
    return this.ZW.Zxy();
  }
  
  public void ZP(Zstu paramZstu) {
    this.ZW.ZZ(paramZstu);
  }
  
  public short Zl() {
    return this.ZW.Zxz();
  }
  
  public Zefg<Zmfi> Zs() {
    return this.ZW.Zx_();
  }
  
  public Zefg<Zmo2> Zh() {
    return this.ZW.Zx9();
  }
  
  public boolean Zt() {
    return this.ZW.ZxA();
  }
  
  public void Zc(boolean paramBoolean) {
    this.ZW.ZRC(paramBoolean);
  }
  
  public boolean Zn() {
    return this.ZW.Zxv();
  }
  
  public void ZX(boolean paramBoolean) {
    this.ZW.ZRE(paramBoolean);
  }
  
  String ZZ() {
    return this.ZW.Zxe();
  }
  
  String Zc() {
    return this.ZW.Zxr();
  }
  
  String ZJ() {
    return this.ZW.ZxS();
  }
  
  void Zo() {
    this.ZW.ZV(Zkk.ZV(this.Zk, Zmfi.ZC));
  }
  
  public Zk9_ Zf() {
    return this.ZW;
  }
  
  public Zlwx Zi() {
    Zzqp zzqp = new Zzqp();
    zzqp.Zm(a(10478, 10252), Zj());
    zzqp.Zm(a(10483, -16551), ZP().Zdw());
    zzqp.ZJ(a(10484, -7515), this.ZW.Zxc());
    String[] arrayOfString = Zlil.Za();
    zzqp.ZJ(a(10457, 9427), this.ZW.Zxy());
    zzqp.ZU(a(10487, 404), this.ZW.Zxz());
    zzqp.Zj(a(10469, 10093), this.ZW.ZxA());
    zzqp.Zj(a(10466, 23619), this.ZW.Zxv());
    Zzqw zzqw1 = zzqp.Zm(a(10492, -32735));
    for (Zmfi zmfi : this.ZW.Zx_()) {
      zzqw1.Zx(zmfi.ZlS());
      if (arrayOfString == null)
        break; 
    } 
    zzqp.Zd(a(10490, -24496), ZZ());
    Zzqw zzqw2 = zzqp.Zm(a(10486, -18011));
    for (Zmo2 zmo2 : Zf().Zx9()) {
      zzqw2.Zx(zmo2.ZuW());
      if (arrayOfString == null)
        break; 
    } 
    return zzqp;
  }
  
  public static Ztpb Zf(Zvt paramZvt, Zr_4 paramZr_4) throws Zzam {
    Zk9_ zk9_ = paramZr_4.<Zk9_>ZH(new Zkm_());
    zk9_.Zxa(paramZvt.ZC(a(10450, 7188)));
    zk9_.ZI(paramZr_4.ZZ(paramZvt.Zp(a(10495, 6040))));
    String[] arrayOfString = Zlil.Za();
    byte[] arrayOfByte = paramZvt.Zz(a(10476, 26577), null);
    try {
      if (arrayOfByte != null)
        zk9_.ZZ(paramZr_4.ZZ(arrayOfByte)); 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    zk9_.ZE((short)paramZvt.Zk(a(10464, -9748)));
    zk9_.ZRE(paramZvt.Zc(a(10470, 6190), true));
    zk9_.ZRC(paramZvt.Zc(a(10485, 6807), true));
    String str = paramZvt.ZC(a(10483, -16551));
    try {
      URL uRL = new URL(str);
      Zmzk zmzk = paramZr_4.<Zmzk>ZH(new Zmhr(uRL.getHost(), uRL.getPort(), uRL.getProtocol().equalsIgnoreCase(a(10467, -2359))));
      Zlit zlit = paramZr_4.<Zlit>ZH(new Zlgb(zmzk, Zkb.Zy(uRL.getFile())));
      zk9_.Zw(zlit);
    } catch (MalformedURLException malformedURLException) {
      Zah.Zl(malformedURLException, Zk_.USER_ERROR);
      zk9_.Zw(null);
    } 
    zk9_.Zx2(paramZvt.Zf(a(10473, -4925), ""));
    List<Zlwx> list1 = paramZvt.ZE(a(10491, -14586));
    for (Zlwx zlwx : list1) {
      Zmo2 zmo2 = Zlcq.ZS(zlwx, paramZr_4);
      zk9_.Zx9().add(zmo2);
      if (arrayOfString == null)
        break; 
    } 
    Zefg<Zmfi> zefg = Zkk.ZV(paramZr_4, Zmfi.ZC);
    List<Zlwx> list2 = paramZvt.ZE(a(10475, 15076));
    for (Zlwx zlwx : list2) {
      zefg.add(Zb15.Zg(zlwx, paramZr_4));
      if (arrayOfString == null)
        break; 
    } 
    zk9_.ZV(zefg);
    Ztpb ztpb = new Ztpb(zk9_, paramZr_4);
    ztpb.ZI();
    return ztpb;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #42
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\¸@9Þw°íâÛ&qö H<J<ÝØ¨Bh±Á9×S«ÌxWB:gC ?S7~ø§Üoq=H)Âª¥©ýø!: ÿHfÎ]×1óòçØî#¦û¹^ADà9Õ½ñ?Ç+÷½ÏÖÃ¦Îå»È àÈöI4açd Dþýòp.³`°GØòQ¤Â²­zòfksø;±EûéO7Ûhí¯é.J[­êÁ_k w\\rí@ÊCët¸uÞéùö!uq \\fÍ¢>¥-¼i\\bVdåÔ<RâÖ§\,dñ` mh´wyV j:Õµ\\b65=oàº$?gy%©35·°`d\\rj·Éöè~[ú&mìT¯oå]'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #80
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'i·yÇêo´R'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #8
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #23
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Ztpb.a : [Ljava/lang/String;
    //   131: bipush #42
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Ztpb.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 258
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 240, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 225, 4 -> 230, 5 -> 235
    //   212: bipush #127
    //   214: goto -> 242
    //   217: iconst_1
    //   218: goto -> 242
    //   221: iconst_1
    //   222: goto -> 242
    //   225: bipush #10
    //   227: goto -> 242
    //   230: bipush #79
    //   232: goto -> 242
    //   235: bipush #92
    //   237: goto -> 242
    //   240: bipush #122
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 165
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 161
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x28F1) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = 'Þ';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztpb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
package burp;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zs1e extends Zs19 {
  private static final String[] Zq;
  
  private static final String[] Zb;
  
  private final Zgay Zg;
  
  private final AtomicInteger ZI;
  
  private Ztb ZR;
  
  private Zlil ZC;
  
  private Pattern ZH;
  
  private Zs1h Zv;
  
  private Zs1q Zx;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zs1e(Zr_4 paramZr_4, Zbnt paramZbnt) {
    this(paramZr_4.<Zgay>ZH(new Zb_n()), paramZr_4, paramZbnt);
  }
  
  public Zs1e(Zgay paramZgay, Zr_4 paramZr_4, Zbnt paramZbnt) {
    super(Zlf9.ACTION_VALIDATE_SESSION);
    this.Zg = paramZgay;
    this.ZI = new AtomicInteger();
    Zmk5 zmk5 = paramZgay.ZTE();
    try {
      if (zmk5 != null)
        this.ZC = new Zlil(zmk5, paramZbnt, paramZr_4); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zq(paramZgay.ZT0());
    ZC(Ztb.Zc(paramZgay.ZTp()));
    Ze6 ze6 = paramZgay.ZTO();
    if (ze6 == null)
      ze6 = paramZr_4.<Ze6>ZH(new Ze37()); 
    Zy(new Zs1h(ze6, paramZr_4, paramZbnt));
    Zl3h zl3h = paramZgay.ZTG();
    if (zl3h == null)
      zl3h = paramZr_4.<Zl3h>ZH(new Zguh()); 
    try {
      ZS(new Zs1q(zl3h, paramZr_4));
      if (this.ZH == null && ZD() != null)
        try {
          Zz();
        } catch (PatternSyntaxException patternSyntaxException) {
          Zah.Zl(patternSyntaxException, Zk_.USER_ERROR);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public boolean Zj() {
    return this.Zg.ZGq();
  }
  
  public void Zr(boolean paramBoolean) {
    this.Zg.ZNm(paramBoolean);
  }
  
  public boolean Zr(Zlil paramZlil) {
    try {
      if (ZM() != paramZlil) {
        try {
          if (Zf())
            try {
              if (Zp().Zr(paramZlil));
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            }  
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  Zb81 Zp() {
    try {
      switch (Ze2e.Zr[this.ZR.ordinal()]) {
        case 1:
          return this.Zx;
        case 2:
          return this.Zv;
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zuh.Zv(false, Zqf.Zr, this.ZR.value);
    return null;
  }
  
  public void Zu(Zzy3 paramZzy3) {
    paramZzy3.ZK(this);
  }
  
  protected void Zf(Zzqp paramZzqp) {
    try {
      paramZzqp.Zm(b(14988, 30160), Zq[Zr()]);
      if (ZM() != null)
        paramZzqp.Zp(b(14999, -16123), ZM().ZQ()); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    paramZzqp.Zj(b(14995, -31068), Zq());
    paramZzqp.ZU(b(15006, -22931), Zx());
    paramZzqp.Zj(b(14983, 7700), ZF());
    paramZzqp.Zj(b(14980, 11585), Za());
    paramZzqp.Zj(b(15005, 29263), Zo());
    paramZzqp.Zm(b(15035, -8546), ZD());
    paramZzqp.Zx(b(14979, -6162), Zc(), b(15002, 1495), b(14998, 27677));
    paramZzqp.Zj(b(14993, -26404), ZI());
    paramZzqp.Zx(b(15001, 18136), Zy(), b(14986, -3638), b(15037, -30285));
    paramZzqp.Zj(b(14997, 27639), ZP());
    paramZzqp.Zj(b(15036, 842), Zf());
    paramZzqp.Zm(b(14977, 21549), Zb[this.ZR.value]);
    if (ZB() != null) {
      Zzqp zzqp = paramZzqp.Zc(b(14985, 13321));
      ZB().Zf(zzqp);
    } 
    if (ZO() != null) {
      Zzqp zzqp = paramZzqp.Zc(b(15003, -32386));
      ZO().Zf(zzqp);
    } 
  }
  
  static Zb81 ZO(Zvt paramZvt, Zxzh paramZxzh, Zr_4 paramZr_4, Zbnt paramZbnt) throws Zzam {
    Zgay zgay = paramZr_4.<Zgay>ZH(new Zb_n());
    zgay.ZM((byte)paramZvt.ZT(b(15028, 26373), Zq));
    zgay.ZPx(paramZvt.Zc(b(15033, -28267), false));
    zgay.ZCm(paramZvt.Za(b(14981, -29241), 0));
    zgay.ZP6(paramZvt.Zc(b(15004, 27416), false));
    zgay.ZPm(paramZvt.Zc(b(14976, 25978), false));
    zgay.ZPl(paramZvt.Zc(b(14994, 2256), false));
    zgay.Zqt(paramZvt.Zf(b(15031, -3583), ""));
    zgay.ZPy(paramZvt.ZW(b(15000, 5859), b(15025, 11658), b(14992, -11711), false));
    zgay.ZPI(paramZvt.Zc(b(15030, -26779), false));
    zgay.ZPO(paramZvt.ZW(b(15007, -18762), b(14987, -23781), b(15027, -10134), false));
    zgay.ZP1(paramZvt.Zc(b(14982, -11320), false));
    zgay.ZPw(paramZvt.Zc(b(14990, 3385), false));
    zgay.Zw((byte)paramZvt.ZT(b(15034, 31641), Zb));
    Zvt zvt1 = paramZvt.ZX(b(15024, 25282));
    Zvt zvt2 = paramZvt.ZX(b(14978, -7481));
    try {
      if (zvt1 != Zz4l.ZI)
        zgay.ZR((Ze6)Zs1h.ZT(zvt1, paramZxzh, paramZr_4, paramZbnt).ZN()); 
    } catch (Zzam zzam) {
      throw a(null);
    } 
    try {
      if (zvt2 != Zz4l.ZI)
        zgay.Zb(Zs1q.ZT(zvt2, paramZr_4)); 
    } catch (Zzam zzam) {
      throw a(null);
    } 
    Zs1e zs1e = new Zs1e(zgay, paramZr_4, paramZbnt);
    long l = paramZvt.ZR(b(14989, 17377), -1L);
    if (l != -1L) {
      Zlil zlil = paramZxzh.Zw(l);
      try {
        if (zlil == null) {
          b(14984, 31696);
          throw new Zzam(b(14984, 31696) + b(14984, 31696));
        } 
      } catch (Zzam zzam) {
        throw a(null);
      } 
      zs1e.Zi(zlil);
    } 
    return zs1e;
  }
  
  void Zz() {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.ZH = Pattern.compile(ZD(), 0x20 | (ZI() ? 0 : 2));
  }
  
  Pattern ZK() {
    return this.ZH;
  }
  
  void Zs() {
    this.ZH = null;
  }
  
  byte Zr() {
    return this.Zg.ZTB();
  }
  
  public void ZD(byte paramByte) {
    this.Zg.ZM(paramByte);
  }
  
  Zlil ZM() {
    return this.ZC;
  }
  
  void Zi(Zlil paramZlil) {
    try {
      this.ZC = paramZlil;
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.Zg.Zu((paramZlil != null) ? paramZlil.ZL() : null);
  }
  
  boolean Zq() {
    return this.Zg.ZTM();
  }
  
  void ZY(boolean paramBoolean) {
    this.Zg.ZPx(paramBoolean);
  }
  
  int Zx() {
    return this.Zg.ZTA();
  }
  
  public void ZP(int paramInt) {
    this.Zg.ZCm(paramInt);
  }
  
  boolean ZF() {
    return this.Zg.ZTf();
  }
  
  void Zn(boolean paramBoolean) {
    this.Zg.ZP6(paramBoolean);
  }
  
  boolean Za() {
    return this.Zg.ZTu();
  }
  
  void Zb(boolean paramBoolean) {
    this.Zg.ZPm(paramBoolean);
  }
  
  boolean Zo() {
    return this.Zg.ZTb();
  }
  
  public void ZQ(boolean paramBoolean) {
    this.Zg.ZPl(paramBoolean);
  }
  
  String ZD() {
    return this.Zg.ZT0();
  }
  
  public void Zq(String paramString) {
    this.Zg.Zqt(paramString);
  }
  
  boolean Zc() {
    return this.Zg.ZTH();
  }
  
  void Zl(boolean paramBoolean) {
    this.Zg.ZPy(paramBoolean);
  }
  
  boolean ZI() {
    return this.Zg.ZTV();
  }
  
  void Ze(boolean paramBoolean) {
    this.Zg.ZPI(paramBoolean);
  }
  
  boolean Zy() {
    return this.Zg.ZTc();
  }
  
  void Zu(boolean paramBoolean) {
    this.Zg.ZPO(paramBoolean);
  }
  
  boolean ZP() {
    return this.Zg.ZTl();
  }
  
  public void ZO(boolean paramBoolean) {
    this.Zg.ZP1(paramBoolean);
  }
  
  boolean Zf() {
    return this.Zg.ZTY();
  }
  
  void Zg(boolean paramBoolean) {
    this.Zg.ZPw(paramBoolean);
  }
  
  void ZC(Ztb paramZtb) {
    this.ZR = paramZtb;
    this.Zg.Zw(paramZtb.value);
  }
  
  Ztb ZL() {
    return this.ZR;
  }
  
  Zs1h ZB() {
    return this.Zv;
  }
  
  void Zy(Zs1h paramZs1h) {
    try {
      this.Zv = paramZs1h;
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.Zg.ZR((paramZs1h != null) ? paramZs1h.ZZ() : null);
  }
  
  Zs1q ZO() {
    return this.Zx;
  }
  
  void ZS(Zs1q paramZs1q) {
    this.Zx = paramZs1q;
    this.Zg.Zb(paramZs1q.ZZ());
  }
  
  void Zd() {
    this.ZI.set(0);
  }
  
  int Zb() {
    return this.ZI.incrementAndGet();
  }
  
  public Zgay Zh() {
    return this.Zg;
  }
  
  static {
    // Byte code:
    //   0: bipush #46
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Q÷qüïÑGB}'Æ:j:UëeÖ)\\t0 áÇ·fÊvê4»c4":]³ßøëøXé\\rynZw§]\\r¬_À=U´çDâzÔû\\tèhëS¬Vch=#Á_üó2ùGþà×dû@2£;lËBÈ1Srù]ÝFl}ò\\n0àtÚM_áÿ\\rà*<'7Z´^ñt9ò×=ñ½.8-Zº½SôN\\b¶@²:Hÿ`À;HD\\n)È=ß-¯OF"[6i¾A5Åq\\rQj\\rÙÙQÛ×2qÒ&ã²blI£cã|óggÎuXa"ZËs}X*E!\\nzÜQ~½Ëÿm\\rdïîMcûya)\\r;\\r ¸C3o@£v\\rÞ.3ÜDÂ¶KÿpÛ\\n¶uí­]ÈaþaÅ1©à¿hý³\\rq{ö"Í\\tk?oGl$ñK`¸0á¤x+HXðWö*Å!8ÒBëÙNDÚj'Í£ù p@+uÁ|ãSAì«ÕwåUç¤íN;ÜXLøñ\\nÀ£czíÈ¼¡$8èÿ´neµ¹4Ñî»¤W;½j"ÊÿûRT¹IëY×H\\nl·C`K³·Ûým¼tÿ-UHÞØçí^ùtx³ö*6NÜìß½á\\tÙGã¶­êCÿbz?-W$½wÏûØ|öØÓ(£¿#ú\\bR(ã°1rb_¡ýoË?Ç©BM¥\\tc{æNß(\\ríoG¨ÕFôLàè¿w>Ù×aw$Q\\n/\Êq3ÎÌu»\\b={"& ÕKÿSúD'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #14
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #65
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'ÖËè£ó¯þ¶ËDx0«_¡ÊÝ,'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #76
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zs1e.c : [Ljava/lang/String;
    //   132: bipush #46
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zs1e.d : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #73
    //   214: goto -> 244
    //   217: bipush #33
    //   219: goto -> 244
    //   222: bipush #103
    //   224: goto -> 244
    //   227: bipush #17
    //   229: goto -> 244
    //   232: bipush #21
    //   234: goto -> 244
    //   237: bipush #79
    //   239: goto -> 244
    //   242: bipush #84
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: iconst_2
    //   301: anewarray java/lang/String
    //   304: dup
    //   305: iconst_0
    //   306: sipush #15032
    //   309: sipush #-29149
    //   312: invokestatic b : (II)Ljava/lang/String;
    //   315: aastore
    //   316: dup
    //   317: iconst_1
    //   318: sipush #15026
    //   321: sipush #-15904
    //   324: invokestatic b : (II)Ljava/lang/String;
    //   327: aastore
    //   328: putstatic burp/Zs1e.Zq : [Ljava/lang/String;
    //   331: iconst_3
    //   332: anewarray java/lang/String
    //   335: dup
    //   336: iconst_0
    //   337: sipush #14991
    //   340: sipush #16506
    //   343: invokestatic b : (II)Ljava/lang/String;
    //   346: aastore
    //   347: dup
    //   348: iconst_1
    //   349: sipush #14996
    //   352: sipush #-2051
    //   355: invokestatic b : (II)Ljava/lang/String;
    //   358: aastore
    //   359: dup
    //   360: iconst_2
    //   361: sipush #15029
    //   364: sipush #18912
    //   367: invokestatic b : (II)Ljava/lang/String;
    //   370: aastore
    //   371: putstatic burp/Zs1e.Zb : [Ljava/lang/String;
    //   374: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3A91) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      char c = 'Ü';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs1e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
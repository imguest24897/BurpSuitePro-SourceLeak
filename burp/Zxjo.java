package burp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zlo;

public class Zxjo implements Zt90 {
  private static final int ZN;
  
  private static final int ZU;
  
  private final Zg87 ZV;
  
  private final Zlnv ZM;
  
  private final Zz01 Zd;
  
  private final Zra1 ZD;
  
  private final List<Zzxq> ZW;
  
  private final Object Z_ = new Object();
  
  private final Zed8 Zj;
  
  private boolean Zi;
  
  private Zlo Zz;
  
  private String ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zxjo(Zg87 paramZg87, Zlnv paramZlnv, Zed8 paramZed8, Zra1 paramZra1) {
    this.ZV = paramZg87;
    this.ZM = paramZlnv;
    this.Zj = paramZed8;
    this.ZD = paramZra1;
    this.Zd = new Zz01(paramZlnv, paramZra1);
    this.ZW = new ArrayList<>();
    paramZlnv.ZR();
    ZH();
  }
  
  public void Zf(Zzxq paramZzxq, Zxc8 paramZxc8) {
    Ztph ztph;
    synchronized (this.Z_) {
      this.ZW.add(paramZzxq);
      ztph = new Ztph(this.Zz, Zn(), this.ZG, paramZxc8);
    } 
    paramZzxq.Zv(ztph);
  }
  
  private void ZH() {
    ZR();
    try {
      String str = this.ZM.Zg(this.ZD);
      if (str == null) {
        this.Zz = Zlo.UNLICENSED;
        return;
      } 
      Zi(str, null);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      this.Zz = Zlo.UNLICENSED;
    } 
  }
  
  private void ZR() {
    this.Zi = this.ZM.Zc();
  }
  
  public boolean Zc() {
    return this.Zi;
  }
  
  public void ZA() {
    this.ZM.Zd();
    this.Zi = true;
  }
  
  public Zlo Zi(String paramString, Zxc8 paramZxc8) {
    Zkvo zkvo;
    try {
      zkvo = this.Zd.Zj(paramString, this.ZM.Zt(paramString, this.ZD));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return ZP(exception, paramZxc8, paramString);
    } 
    try {
      if (this.ZM.ZU(zkvo.Zr())) {
        Zx(zkvo.Zr());
        Zy(Zlo.UNLICENSED, paramZxc8);
        return Zlo.UNLICENSED;
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    Zc(zkvo);
    return ZJ(paramZxc8);
  }
  
  private void Zc(Zkvo paramZkvo) {
    synchronized (this.Z_) {
      this.Zz = Zlo.LICENSE_REQUIRES_ACTIVATION;
      this.ZV.Zo(paramZkvo);
      this.ZV.ZF(null);
      this.ZG = null;
    } 
  }
  
  private Zlo ZP(Exception paramException, Zxc8 paramZxc8, String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getMessage : ()Ljava/lang/String;
    //   4: astore #6
    //   6: sipush #21719
    //   9: invokestatic Zr : ()Ljava/lang/String;
    //   12: aconst_null
    //   13: astore #7
    //   15: astore #4
    //   17: sipush #-2053
    //   20: invokestatic a : (II)Ljava/lang/String;
    //   23: aload #6
    //   25: invokevirtual equals : (Ljava/lang/Object;)Z
    //   28: ifeq -> 41
    //   31: getstatic net/portswigger/Zlo.WRONG_EXECUTION_MODE : Lnet/portswigger/Zlo;
    //   34: astore #5
    //   36: aload #4
    //   38: ifnonnull -> 124
    //   41: aload #6
    //   43: ifnull -> 119
    //   46: aload #6
    //   48: sipush #21718
    //   51: sipush #30558
    //   54: invokestatic a : (II)Ljava/lang/String;
    //   57: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   60: ifeq -> 119
    //   63: getstatic net/portswigger/Zlo.LICENSE_EXPIRED : Lnet/portswigger/Zlo;
    //   66: astore #5
    //   68: aload #6
    //   70: getstatic burp/Zxjo.ZU : I
    //   73: invokevirtual substring : (I)Ljava/lang/String;
    //   76: astore #8
    //   78: aload_0
    //   79: getfield ZM : Lburp/Zlnv;
    //   82: aload #8
    //   84: invokeinterface ZB : (Ljava/lang/String;)Ljava/lang/String;
    //   89: astore #9
    //   91: new burp/Ztw9
    //   94: dup
    //   95: aload_3
    //   96: aload #8
    //   98: aload #9
    //   100: aload_0
    //   101: getfield ZD : Lburp/Zra1;
    //   104: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lburp/Zra1;)V
    //   107: astore #7
    //   109: aload_0
    //   110: aload #8
    //   112: invokevirtual Zx : (Ljava/lang/String;)Z
    //   115: pop
    //   116: goto -> 124
    //   119: getstatic net/portswigger/Zlo.UNLICENSED : Lnet/portswigger/Zlo;
    //   122: astore #5
    //   124: aload_0
    //   125: aload #5
    //   127: aload #6
    //   129: aload_2
    //   130: invokevirtual Zr : (Lnet/portswigger/Zlo;Ljava/lang/String;Lburp/Zxc8;)V
    //   133: aload #5
    //   135: getstatic net/portswigger/Zlo.LICENSE_EXPIRED : Lnet/portswigger/Zlo;
    //   138: if_acmpne -> 152
    //   141: aload_0
    //   142: getfield ZV : Lburp/Zg87;
    //   145: aload #7
    //   147: invokeinterface ZF : (Lburp/Zkvo;)V
    //   152: aload #5
    //   154: areturn
  }
  
  private Zlo ZJ(Zxc8 paramZxc8) {
    String str = this.ZM.ZB(Zn().Zr());
    if (str == null) {
      ZM(paramZxc8);
      return Zlo.LICENSE_REQUIRES_ACTIVATION;
    } 
    Zlo zlo = Zlo.LICENSE_REQUIRES_ACTIVATION;
    Zzck zzck = Zk(str);
    if (zzck.ZZ == Zlo.LICENSE_ACTIVATED) {
      ZY(str);
      zlo = Zlo.LICENSE_ACTIVATED;
    } 
    Zy(zlo, paramZxc8);
    return zlo;
  }
  
  public String Zz(Zxc8 paramZxc8) {
    try {
      return this.ZM.ZV(Zn().Zr());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      Zs(Zlo.LICENSE_ACTIVATION_ERROR, exception.getMessage(), paramZxc8);
      return null;
    } 
  }
  
  public String Zm(String paramString) throws IOException {
    return Zq(paramString, false, null, 0, null, null);
  }
  
  public String Zw(String paramString, boolean paramBoolean) throws IOException {
    return this.Zj.Zc(paramString, paramBoolean);
  }
  
  public String Zs(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4) throws IOException {
    return Zq(paramString1, true, paramString2, paramInt, paramString3, paramString4);
  }
  
  private String Zq(String paramString1, boolean paramBoolean, String paramString2, int paramInt, String paramString3, String paramString4) throws IOException {
    return this.Zj.Zc(paramString1, paramBoolean, paramString2, paramInt, paramString3, paramString4);
  }
  
  public Zlo ZF(String paramString, Zxc8 paramZxc8) {
    Zzck zzck = Zk(paramString);
    if (zzck.ZZ == Zlo.LICENSE_ACTIVATED)
      ZY(paramString); 
    Zs(zzck.ZZ, zzck.Zc, paramZxc8);
    return zzck.ZZ;
  }
  
  private Zzck Zk(String paramString) {
    String str2;
    String str1 = Ztph.Zr();
    try {
      this.ZM.Zr(paramString);
      return new Zzck(Zlo.LICENSE_ACTIVATED, null);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      this.ZM.ZI(this.ZD);
      str2 = exception.getMessage();
      try {
        if (str2 != null && str2.startsWith(a(21713, 7246))) {
          str2 = str2.substring(ZN);
          Zlo zlo1 = Zlo.LICENSE_ACTIVATION_FAILED;
          if (str1 == null) {
            zlo1 = Zlo.LICENSE_ACTIVATION_ERROR;
            return new Zzck(zlo1, str2);
          } 
          return new Zzck(zlo1, str2);
        } 
      } catch (Exception exception1) {
        throw a(null);
      } 
    } 
    Zlo zlo = Zlo.LICENSE_ACTIVATION_ERROR;
    return new Zzck(zlo, str2);
  }
  
  private void Zr(Zlo paramZlo, String paramString, Zxc8 paramZxc8) {
    synchronized (this.Z_) {
      this.ZV.Zo(null);
      this.ZV.ZF(null);
      Zs(paramZlo, paramString, paramZxc8);
    } 
  }
  
  private void Zy(Zlo paramZlo, Zxc8 paramZxc8) {
    Zs(paramZlo, null, paramZxc8);
  }
  
  private void Zs(Zlo paramZlo, String paramString, Zxc8 paramZxc8) {
    synchronized (this.Z_) {
      this.Zz = paramZlo;
      this.ZG = paramString;
    } 
    ZM(paramZxc8);
  }
  
  private void ZY(String paramString) {
    Zt(Zn(), paramString);
  }
  
  private void Zt(Zkvo paramZkvo, String paramString) {
    synchronized (this.Z_) {
      this.ZM.Zz(paramZkvo.ZF(), Zra1.Zy(paramZkvo.Zm()));
      this.ZM.Zf(paramZkvo.Zr(), paramString);
    } 
  }
  
  public boolean Zr(Zxc8 paramZxc8) {
    String str = (Zn() == null) ? null : Zn().Zr();
    boolean bool = Zx(str);
    if (bool)
      Zr(Zlo.UNLICENSED, str, paramZxc8); 
    return bool;
  }
  
  private boolean Zx(String paramString) {
    boolean bool = true;
    this.ZM.ZI(this.ZD);
    if (this.ZM.Zg(this.ZD) != null)
      bool = false; 
    if (paramString != null) {
      this.ZM.Zv(paramString);
      if (this.ZM.ZB(paramString) != null)
        bool = false; 
    } 
    return bool;
  }
  
  private void ZM(Zxc8 paramZxc8) {
    Ztph ztph;
    ArrayList<Zzxq> arrayList;
    String str = Ztph.Zr();
    synchronized (this.Z_) {
      arrayList = new ArrayList<>(this.ZW);
      ztph = new Ztph(this.Zz, Zn(), this.ZG, paramZxc8);
    } 
    for (Zzxq zzxq : arrayList) {
      zzxq.Zv(ztph);
      if (str == null)
        break; 
    } 
  }
  
  public Zlo Zb() {
    synchronized (this.Z_) {
      return this.Zz;
    } 
  }
  
  public String ZV() {
    synchronized (this.Z_) {
      return this.ZG;
    } 
  }
  
  public Zkvo Zn() {
    synchronized (this.Z_) {
      return this.ZV.Ze();
    } 
  }
  
  public Zky3 ZF() {
    synchronized (this.Z_) {
      Zkvo zkvo = Zn();
      if (zkvo != null)
        return new Zky3(zkvo, zkvo.Zb(), false); 
      zkvo = this.ZV.ZH();
      return new Zky3(zkvo, zkvo.Zb(), true);
    } 
  }
  
  public void Zv(Zky3 paramZky3) {
    // Byte code:
    //   0: invokestatic Zr : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Z_ : Ljava/lang/Object;
    //   8: dup
    //   9: astore_3
    //   10: monitorenter
    //   11: aload_1
    //   12: getfield Zg : Lburp/Zkvo;
    //   15: astore #4
    //   17: aload_0
    //   18: aload #4
    //   20: aload_1
    //   21: getfield ZO : Ljava/lang/String;
    //   24: invokevirtual Zt : (Lburp/Zkvo;Ljava/lang/String;)V
    //   27: aload_1
    //   28: getfield Zv : Z
    //   31: ifeq -> 66
    //   34: aload_0
    //   35: getfield ZV : Lburp/Zg87;
    //   38: aconst_null
    //   39: invokeinterface Zo : (Lburp/Zkvo;)V
    //   44: aload_0
    //   45: getfield ZV : Lburp/Zg87;
    //   48: aload #4
    //   50: invokeinterface ZF : (Lburp/Zkvo;)V
    //   55: aload_0
    //   56: getstatic net/portswigger/Zlo.LICENSE_EXPIRED : Lnet/portswigger/Zlo;
    //   59: putfield Zz : Lnet/portswigger/Zlo;
    //   62: aload_2
    //   63: ifnonnull -> 94
    //   66: aload_0
    //   67: getfield ZV : Lburp/Zg87;
    //   70: aload #4
    //   72: invokeinterface Zo : (Lburp/Zkvo;)V
    //   77: aload_0
    //   78: getfield ZV : Lburp/Zg87;
    //   81: aconst_null
    //   82: invokeinterface ZF : (Lburp/Zkvo;)V
    //   87: aload_0
    //   88: getstatic net/portswigger/Zlo.LICENSE_ACTIVATED : Lnet/portswigger/Zlo;
    //   91: putfield Zz : Lnet/portswigger/Zlo;
    //   94: aload_0
    //   95: aconst_null
    //   96: putfield ZG : Ljava/lang/String;
    //   99: aload_3
    //   100: monitorexit
    //   101: goto -> 111
    //   104: astore #5
    //   106: aload_3
    //   107: monitorexit
    //   108: aload #5
    //   110: athrow
    //   111: return
    // Exception table:
    //   from	to	target	type
    //   11	101	104	finally
    //   104	108	104	finally
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '{aBìéÉ+~4K¹oÁR@¶¿cû}ø8æÐÎ\\bë4N¤É÷\\n§Â©Sbz¦QKf'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #15
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #22
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc '2<*hç®bZ»}UqÅ²âRø{¤''
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #15
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #125
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Zxjo.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zxjo.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #43
    //   214: goto -> 243
    //   217: bipush #45
    //   219: goto -> 243
    //   222: bipush #80
    //   224: goto -> 243
    //   227: iconst_1
    //   228: goto -> 243
    //   231: bipush #59
    //   233: goto -> 243
    //   236: bipush #113
    //   238: goto -> 243
    //   241: bipush #115
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: sipush #21716
    //   303: sipush #-10259
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: invokevirtual length : ()I
    //   312: putstatic burp/Zxjo.ZN : I
    //   315: sipush #21717
    //   318: sipush #-13910
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: invokevirtual length : ()I
    //   327: putstatic burp/Zxjo.ZU : I
    //   330: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x54D5) & 0xFFFF;
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
      byte b1 = 71;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxjo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
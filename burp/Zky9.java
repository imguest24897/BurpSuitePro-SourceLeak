package burp;

import java.time.Duration;
import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zmw;
import net.portswigger.Zs6;

public class Zky9 implements Zkrr {
  private static final Duration ZS;
  
  private static final Duration ZD;
  
  private final Zkl6 ZC;
  
  private final Zs6<?> ZR;
  
  private final Zsoh ZL;
  
  private final Zkq4 Zh;
  
  private final Ze3n Zr;
  
  private final Zbom ZO;
  
  private static int Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zky9(Zkl6 paramZkl6, Zs6<?> paramZs6, Zsoh paramZsoh, Zkq4 paramZkq4, Ze3n paramZe3n, Zz1i paramZz1i) {
    this.ZC = paramZkl6;
    this.ZR = paramZs6;
    int i = ZX();
    try {
      this.ZL = paramZsoh;
      this.Zh = paramZkq4;
      this.Zr = paramZe3n;
      this.ZO = paramZz1i.Zc(paramZe3n.Za());
      if (i != 0)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (Zscd zscd) {
      throw a(null);
    } 
  }
  
  public Zbsl Zp() {
    return Zbsl.APR_ClientSideDesync;
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZO : Lburp/Zbom;
    //   4: invokeinterface ZC0 : ()Lburp/Zmjl;
    //   9: astore #5
    //   11: aload_0
    //   12: getfield Zr : Lburp/Ze3n;
    //   15: invokevirtual ZA : ()Lburp/Zefx;
    //   18: astore #6
    //   20: invokestatic ZN : ()I
    //   23: aload_0
    //   24: getfield Zr : Lburp/Ze3n;
    //   27: invokevirtual Zp : ()Lburp/Zs68;
    //   30: astore #7
    //   32: istore #4
    //   34: aload_0
    //   35: invokevirtual Zu : ()Z
    //   38: ifne -> 60
    //   41: aload #5
    //   43: aload #6
    //   45: aload #7
    //   47: invokestatic Zu : (Lburp/Zmjl;Lburp/Zefx;Lburp/Zs68;)Z
    //   50: ifeq -> 65
    //   53: goto -> 60
    //   56: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   59: athrow
    //   60: return
    //   61: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   64: athrow
    //   65: aload_0
    //   66: aload_2
    //   67: invokevirtual Zx : (Lburp/Ztpx;)Lburp/Zrsp;
    //   70: astore #8
    //   72: aload #8
    //   74: invokevirtual ZZ : ()Z
    //   77: ifeq -> 85
    //   80: return
    //   81: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   84: athrow
    //   85: aload #8
    //   87: invokevirtual ZO : ()Z
    //   90: ifeq -> 100
    //   93: aload_0
    //   94: aload_2
    //   95: invokevirtual ZK : (Lburp/Ztpx;)Lburp/Zrsp;
    //   98: astore #8
    //   100: aload #8
    //   102: invokevirtual Zz : ()Z
    //   105: ifeq -> 166
    //   108: aload #5
    //   110: invokeinterface ZFn : ()Z
    //   115: ifne -> 191
    //   118: goto -> 125
    //   121: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   124: athrow
    //   125: aload_3
    //   126: aload #8
    //   128: invokevirtual Zb : ()Lburp/Zx_5;
    //   131: invokeinterface Zz : (Lburp/Zsqx;)V
    //   136: aload_3
    //   137: aload #5
    //   139: dup
    //   140: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   143: pop
    //   144: <illegal opcode> run : (Lburp/Zmjl;)Ljava/lang/Runnable;
    //   149: invokeinterface ZL : (Ljava/lang/Runnable;)V
    //   154: iload #4
    //   156: ifne -> 191
    //   159: goto -> 166
    //   162: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   165: athrow
    //   166: aload_3
    //   167: aload_0
    //   168: aload #5
    //   170: aload #6
    //   172: aload #7
    //   174: <illegal opcode> run : (Lburp/Zky9;Lburp/Zmjl;Lburp/Zefx;Lburp/Zs68;)Ljava/lang/Runnable;
    //   179: invokeinterface ZL : (Ljava/lang/Runnable;)V
    //   184: goto -> 191
    //   187: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   190: athrow
    //   191: invokestatic Zwu : ()[Lburp/Zbqc;
    //   194: ifnonnull -> 212
    //   197: iinc #4, 1
    //   200: iload #4
    //   202: invokestatic ZD : (I)V
    //   205: goto -> 212
    //   208: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   211: athrow
    //   212: return
    // Exception table:
    //   from	to	target	type
    //   34	53	56	burp/Zscd
    //   41	61	61	burp/Zscd
    //   72	81	81	burp/Zscd
    //   100	118	121	burp/Zscd
    //   108	159	162	burp/Zscd
    //   125	184	187	burp/Zscd
    //   191	205	208	burp/Zscd
  }
  
  private boolean Zu() {
    boolean bool = this.ZC.ZM().ZM(this.Zr.Za());
    try {
    
    } catch (Zscd zscd) {
      throw a(null);
    } 
    boolean bool1 = ((this.Zr.ZA().Zw()).length > 0) ? true : false;
    try {
      if (!bool) {
        try {
          if (bool1);
        } catch (Zscd zscd) {
          throw a(null);
        } 
        return false;
      } 
    } catch (Zscd zscd) {
      throw a(null);
    } 
  }
  
  private Zrsp Zx(Ztpx paramZtpx) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getstatic burp/Zky9.ZS : Ljava/time/Duration;
    //   5: aload_0
    //   6: aload_1
    //   7: <illegal opcode> Zo : (Lburp/Zky9;Lburp/Ztpx;)Lburp/Zkqi;
    //   12: invokevirtual ZK : (Lburp/Ztpx;Ljava/time/Duration;Lburp/Zkqi;)Lburp/Zrsp;
    //   15: areturn
  }
  
  private Zrsp ZK(Ztpx paramZtpx) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getstatic burp/Zky9.ZD : Ljava/time/Duration;
    //   5: aload_0
    //   6: aload_1
    //   7: <illegal opcode> Zo : (Lburp/Zky9;Lburp/Ztpx;)Lburp/Zkqi;
    //   12: invokevirtual ZK : (Lburp/Ztpx;Ljava/time/Duration;Lburp/Zkqi;)Lburp/Zrsp;
    //   15: areturn
  }
  
  private Zrsp ZK(Ztpx paramZtpx, Duration paramDuration, Zkqi paramZkqi) {
    Zgkm zgkm = Za(paramZtpx, paramDuration);
    try {
      if (zgkm.ZZ())
        return Zrsp.ZX(); 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    try {
      if (zgkm.Zg())
        return Zrsp.ZJ(); 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    if (zgkm.Zy()) {
      Optional<Zmyb> optional = Zmw7.Zq(paramZtpx, this.ZL, this.ZO, this.ZC, this.Zr);
      if (optional.isPresent()) {
        Zkqu zkqu = ((Zmyb)optional.get()).ZX();
        if (!zkqu.ZY(zgkm.ZD())) {
          Zgkm zgkm1 = paramZkqi.Zo(zkqu);
          try {
            if (zgkm1.Zy()) {
              try {
                if (!zkqu.ZY(zgkm1.ZD()))
                  try {
                    if (zkqu.ZY(zgkm1.ZJ()));
                  } catch (Zscd zscd) {
                    throw a(null);
                  }  
              } catch (Zscd zscd) {
                throw a(null);
              } 
              boolean bool = true;
              return Zrsp.Zv(Zk(zgkm1.ZD(), zgkm1.ZJ(), paramDuration, bool));
            } 
          } catch (Zscd zscd) {
            throw a(null);
          } 
        } 
      } 
      return Zrsp.Zv(Zk(zgkm.ZD(), zgkm.ZJ(), paramDuration, (byte)1));
    } 
    return Zrsp.ZV();
  }
  
  private Zgkm Za(Ztpx paramZtpx, Duration paramDuration) {
    byte[] arrayOfByte = this.Zr.ZA().ZD();
    Zxgd zxgd = Zs(arrayOfByte.length);
    return ZM(paramZtpx, paramDuration, zxgd, arrayOfByte);
  }
  
  private Zgkm Zv(Ztpx paramZtpx, Zkqu paramZkqu) {
    byte[] arrayOfByte1 = paramZkqu.Zh(this.ZC.Zs(), this.Zr.Za()).ZiD();
    Zxgd zxgd = Zs(arrayOfByte1.length).ZY(arrayOfByte1::lambda$followUpClientSideDesync$3);
    byte[] arrayOfByte2 = this.Zr.ZA().ZD();
    return ZM(paramZtpx, ZS, zxgd, arrayOfByte2);
  }
  
  private Zgkm ZM(Ztpx paramZtpx, Zkqu paramZkqu) {
    byte[] arrayOfByte1 = paramZkqu.Zh(this.ZC.Zs(), this.Zr.Za()).ZiD();
    Zxgd zxgd = Zs(arrayOfByte1.length);
    byte[] arrayOfByte2 = Zmw.Zq(new byte[][] { arrayOfByte1, this.Zr.ZA().ZD() });
    return ZM(paramZtpx, ZD, zxgd, arrayOfByte2);
  }
  
  private Zgkm ZM(Ztpx paramZtpx, Duration paramDuration, Zxgd paramZxgd, byte[] paramArrayOfbyte) {
    String str = this.ZR.Z_(16);
    byte[] arrayOfByte = this.Zr.ZA().ZD();
    try {
      Zsxd zsxd1 = this.ZL.ZD(Ztao.Zc(paramZtpx, this.Zr.ZM(), arrayOfByte).Zx(paramZxgd.ZI(str)).Zf(paramDuration).ZA());
      if (this.ZC.ZM().ZM(this.Zr.Za()))
        return Zgkm.ZS(); 
      if (ZB(zsxd1))
        return Zgkm.Zp(); 
      Zsxd zsxd2 = this.ZL.ZD(Ztao.Zc(paramZtpx, this.Zr.ZM(), paramArrayOfbyte).Zx(Zxgd.ZZ().ZE(str)).Zf(paramDuration).ZA());
      return ZB(zsxd2) ? Zgkm.ZI() : Zgkm.Zz(zsxd1, zsxd2);
    } catch (Zscd zscd) {
      Zah.Zl(zscd, Zk_.IGNORED);
      return Zgkm.Zp();
    } 
  }
  
  private static Zxgd Zs(int paramInt) {
    return Zxgd.Zu(Zky9::lambda$buildAttackRequestModifier$4).ZY(new Zgtj(a(-18418, 6809), String.valueOf(paramInt))).ZY(new Zgtj(a(-18419, -24104), a(-18420, -476))).ZY(new Zgtj(a(-18417, 6252), a(-18421, 30367)));
  }
  
  private Zx_5 Zk(Zsxd paramZsxd1, Zsxd paramZsxd2, Duration paramDuration, byte paramByte) {
    try {
    
    } catch (Zscd zscd) {
      throw a(null);
    } 
    return Zzs7.Zg(this.Zr.Za(), this.Zr.ZN(), ZD.equals(paramDuration) ? 1 : 0, this.Zr.ZI().ZC(paramZsxd1.Zz().ZL()).Zu(paramZsxd1.Zz().Ze().Za()), this.Zr.ZI().ZC(paramZsxd2.Zz().ZL()).Zu(paramZsxd2.Zz().Ze().Za()), paramByte);
  }
  
  private static boolean ZB(Zsxd paramZsxd) {
    try {
      if (paramZsxd.ZG() != null) {
        try {
          if (paramZsxd.ZG().Zb() == Zvom.TIMED_OUT);
        } catch (Zscd zscd) {
          throw a(null);
        } 
        return false;
      } 
    } catch (Zscd zscd) {
      throw a(null);
    } 
  }
  
  private static Zefx lambda$buildAttackRequestModifier$4(Zefx paramZefx) {
    return paramZefx.Zr(a(-18422, -11829));
  }
  
  private static Zefx lambda$followUpClientSideDesync$3(byte[] paramArrayOfbyte, Zefx paramZefx) {
    return paramZefx.ZZ(paramArrayOfbyte);
  }
  
  private Zgkm lambda$checkForClientSidePauseBasedDesync$2(Ztpx paramZtpx, Zkqu paramZkqu) {
    return ZM(paramZtpx, paramZkqu);
  }
  
  private Zgkm lambda$checkForClientSideDesync$1(Ztpx paramZtpx, Zkqu paramZkqu) {
    return Zv(paramZtpx, paramZkqu);
  }
  
  private void lambda$doCheck$0(Zmjl paramZmjl, Zefx paramZefx, Zs68 paramZs68) {
    Zmw7.Zm(this.Zh, paramZmjl, paramZefx, paramZs68);
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic ZD : (I)V
    //   13: ldc 'áGeJ]}¦J®\\níX3!ØÑ!àîÁ´ÙfÂ-Ð£AÝ!v*LµÃK-èä6ÏöÞUGÐ\\f§y¢É5-ã´©S'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #14
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #100
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc '.r\\nznU1W q'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_4
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #52
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zky9.a : [Ljava/lang/String;
    //   135: bipush #6
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zky9.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #89
    //   218: goto -> 248
    //   221: bipush #108
    //   223: goto -> 248
    //   226: bipush #35
    //   228: goto -> 248
    //   231: bipush #30
    //   233: goto -> 248
    //   236: bipush #122
    //   238: goto -> 248
    //   241: bipush #89
    //   243: goto -> 248
    //   246: bipush #123
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: ldc2_w 2
    //   307: invokestatic ofSeconds : (J)Ljava/time/Duration;
    //   310: putstatic burp/Zky9.ZS : Ljava/time/Duration;
    //   313: ldc2_w 62
    //   316: invokestatic ofSeconds : (J)Ljava/time/Duration;
    //   319: putstatic burp/Zky9.ZD : Ljava/time/Duration;
    //   322: return
  }
  
  public static void ZD(int paramInt) {
    Zi = paramInt;
  }
  
  public static int ZX() {
    return Zi;
  }
  
  public static int ZN() {
    int i = ZX();
    try {
      if (i == 0)
        return 7; 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    return 0;
  }
  
  private static Zscd a(Zscd paramZscd) {
    return paramZscd;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB80E) & 0xFFFF;
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
      char c = 'Ú';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zky9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
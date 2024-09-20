package burp;

import java.time.Duration;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zen6 {
  private final Ztpx Zq;
  
  private final Zr_4 ZA;
  
  private final Zkl6 ZV;
  
  private final Zsoh Zb;
  
  private final Ztdi Zk;
  
  private final Zgb6 Zf;
  
  private final boolean ZN;
  
  private final Zbza ZM;
  
  private static int[] ZO;
  
  public Zen6(Ztpx paramZtpx, Zr_4 paramZr_4, Zsoh paramZsoh, Zkl6 paramZkl6, Ztdi paramZtdi, Zgb6 paramZgb6, boolean paramBoolean, Zbza paramZbza) {
    this.Zq = paramZtpx;
    int[] arrayOfInt = Ze();
    try {
      this.ZA = paramZr_4;
      this.ZV = paramZkl6;
      this.Zb = paramZsoh;
      this.Zk = paramZtdi;
      this.Zf = paramZgb6;
      this.ZN = paramBoolean;
      this.ZM = paramZbza;
      if (arrayOfInt == null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (Zktz zktz) {
      throw a(null);
    } 
  }
  
  public Zez3 ZE(Zlit paramZlit) {
    return Zx(paramZlit, 0);
  }
  
  private Zez3 Zx(Zlit paramZlit, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zf : Lburp/Zgb6;
    //   4: invokeinterface ZU0 : ()Lburp/Zes1;
    //   9: aload_1
    //   10: invokeinterface Zd1 : ()Ljava/lang/String;
    //   15: invokevirtual ZM : (Ljava/lang/String;)Z
    //   18: istore_3
    //   19: iload_3
    //   20: ifeq -> 29
    //   23: aconst_null
    //   24: areturn
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_0
    //   30: getfield Zk : Lburp/Ztdi;
    //   33: aload_1
    //   34: iconst_0
    //   35: invokeinterface Zq : (Lburp/Zlit;S)Lburp/Zez3;
    //   40: astore #4
    //   42: aload #4
    //   44: ifnull -> 84
    //   47: aload #4
    //   49: invokeinterface ZoO : ()Lburp/Zstu;
    //   54: ifnull -> 84
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: aload #4
    //   66: invokeinterface Zl7 : ()S
    //   71: sipush #304
    //   74: if_icmpne -> 156
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: aload_0
    //   85: getfield ZN : Z
    //   88: ifeq -> 110
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: aload_0
    //   99: aload_1
    //   100: invokevirtual Zg : (Lburp/Zlit;)V
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload_0
    //   111: getfield Zk : Lburp/Ztdi;
    //   114: aload_1
    //   115: bipush #20
    //   117: invokeinterface Zq : (Lburp/Zlit;S)Lburp/Zez3;
    //   122: astore #4
    //   124: aload #4
    //   126: ifnull -> 149
    //   129: aload #4
    //   131: invokeinterface Zl7 : ()S
    //   136: sipush #304
    //   139: if_icmpne -> 156
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: aload #4
    //   151: areturn
    //   152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   155: athrow
    //   156: aload #4
    //   158: invokeinterface Zl7 : ()S
    //   163: istore #5
    //   165: iload #5
    //   167: invokestatic ZX : (S)Z
    //   170: ifeq -> 180
    //   173: aload #4
    //   175: areturn
    //   176: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   179: athrow
    //   180: iload #5
    //   182: invokestatic ZI : (S)Z
    //   185: ifeq -> 266
    //   188: iload_2
    //   189: bipush #10
    //   191: if_icmpge -> 266
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   200: athrow
    //   201: aload_0
    //   202: getfield ZV : Lburp/Zkl6;
    //   205: invokeinterface ZB : ()Lburp/Zbnt;
    //   210: astore #6
    //   212: aload #6
    //   214: aload_1
    //   215: invokeinterface Zd1 : ()Ljava/lang/String;
    //   220: aload_1
    //   221: invokeinterface Zda : ()I
    //   226: aload_1
    //   227: invokeinterface Zdr : ()Z
    //   232: invokevirtual ZY : (Ljava/lang/String;IZ)Lburp/Zmzk;
    //   235: astore #7
    //   237: aload #4
    //   239: aload #7
    //   241: aload #6
    //   243: invokestatic Zf : (Lburp/Zez3;Lburp/Zmzk;Lburp/Zbnt;)Lburp/Zlit;
    //   246: astore_1
    //   247: aload_0
    //   248: aload_1
    //   249: iload_2
    //   250: iconst_1
    //   251: iadd
    //   252: invokevirtual Zx : (Lburp/Zlit;I)Lburp/Zez3;
    //   255: areturn
    //   256: astore #6
    //   258: aload #6
    //   260: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   263: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   266: aload #4
    //   268: areturn
    // Exception table:
    //   from	to	target	type
    //   19	25	25	burp/Zxgy
    //   42	57	60	burp/Zxgy
    //   47	77	80	burp/Zxgy
    //   64	91	94	burp/Zxgy
    //   84	103	106	burp/Zxgy
    //   124	142	145	burp/Zxgy
    //   129	152	152	burp/Zxgy
    //   165	176	176	burp/Zxgy
    //   180	194	197	burp/Zxgy
    //   201	255	256	burp/Zxgy
    //   201	255	256	burp/Zxg5
  }
  
  private void Zg(Zlit paramZlit) {
    try {
      byte[] arrayOfByte = this.ZV.Zs().ZO().Zf(paramZlit).Zr().ZiD();
      Zmzk zmzk = paramZlit.Zdz();
      Zsxd zsxd = this.Zb.ZD(Ztao.ZQ(this.Zq, this.ZM, zmzk, arrayOfByte).Zj(Duration.ofSeconds(10L)).ZA());
      Zstu zstu = Zsoh.ZA(zsxd);
      Zs68 zs68 = Zbwc.Zt((Zlit)null, zstu, Zt0k.NO_HTML_ANALYSIS, this.ZV.ZB());
      if (!zs68.ZH.Zl) {
        Zz1p zz1p = Zekx.Zu(zmzk, zsxd.ZG().ZL().ZD(), (byte)1, this.ZV.ZB());
        ZS(paramZlit, arrayOfByte, zstu, zz1p, zs68);
      } 
    } catch (Zktz zktz) {
      Zah.Zl(zktz, Zk_.IGNORED);
    } 
  }
  
  private void ZS(Zlit paramZlit, byte[] paramArrayOfbyte, Zstu paramZstu, Zz1p paramZz1p, Zs68 paramZs68) {
    Zez3 zez3 = this.Zk.Zq(paramZlit, (short)0);
    (new Zsir()).Zp(this.ZA.ZZ(paramArrayOfbyte), paramZz1p.Zb).ZV(paramZstu.Zp(this.ZA), paramZstu.Zpu(), paramZs68.Zb, paramZs68.ZH.Zj, Zsir.ZO(paramZs68), System.currentTimeMillis()).ZZ((byte)2, (byte)1).Zd(zez3);
    this.Zk.ZR(zez3);
  }
  
  private static Zlit Zf(Zez3 paramZez3, Zmzk paramZmzk, Zbnt paramZbnt) {
    Zz1p zz1p = Zghc.ZY(paramZmzk, paramZez3.Zos(), (byte)1, paramZbnt);
    Zs68 zs68 = Zbwc.ZS(zz1p, paramZez3.ZoO(), Zt0k.NO_HTML_ANALYSIS, paramZbnt);
    Zs0d zs0d = Zgcr.Zd(paramZmzk, paramZez3.Zos(), paramZez3.ZoO(), zs68.ZP, zs68.Zk, paramZez3.Zl7(), 1, paramZbnt);
    try {
    
    } catch (Zktz zktz) {
      throw a(null);
    } 
    return (zs0d == null) ? null : zs0d.ZM();
  }
  
  private static boolean ZX(short paramShort) {
    try {
      if (paramShort >= 200)
        try {
          if (paramShort < 300);
        } catch (Zktz zktz) {
          throw a(null);
        }  
    } catch (Zktz zktz) {
      throw a(null);
    } 
    return false;
  }
  
  private static boolean ZI(short paramShort) {
    try {
      if (paramShort >= 300)
        try {
          if (paramShort < 400)
            try {
              if (paramShort != 304);
            } catch (Zktz zktz) {
              throw a(null);
            }  
        } catch (Zktz zktz) {
          throw a(null);
        }  
    } catch (Zktz zktz) {
      throw a(null);
    } 
    return false;
  }
  
  public static void ZT(int[] paramArrayOfint) {
    ZO = paramArrayOfint;
  }
  
  public static int[] Ze() {
    return ZO;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    if (Ze() == null)
      ZT(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zen6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
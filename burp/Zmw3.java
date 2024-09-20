package burp;

import java.util.HashMap;
import java.util.Map;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmw3 extends Zmws implements Zt9d {
  private final Map<String, Ztdv> Zg = new HashMap<>();
  
  private final Zr1j Zu;
  
  public Zmw3(Zl34 paramZl34, Ztn0 paramZtn0, Zr_4 paramZr_41, Zr_4 paramZr_42, Zr1j paramZr1j) {
    super(paramZl34, paramZtn0, paramZr_41, paramZr_42);
    this.Zu = paramZr1j;
  }
  
  public Ztn0 ZoQ() {
    return this.ZC;
  }
  
  public int ZAg() {
    return this.ZI.ZjM().size();
  }
  
  public void ZI(Zlit paramZlit) {
    ZE(Ze9z.ZM(paramZlit, this.Zq));
  }
  
  public void ZE(Zmy8 paramZmy8) {
    this.ZI.ZV(paramZmy8, this.ZC);
    ZC((Zz28)null);
  }
  
  public void Zz(Zmy8 paramZmy8, int paramInt) {
    this.ZI.Zy(paramZmy8, paramInt, this.ZC);
    ZC((Zz28)null);
  }
  
  public void Zg(Zlit paramZlit) {
    Zmy8 zmy8 = Ze9z.ZM(paramZlit, this.ZO);
    this.ZI.ZE(zmy8, this.ZC);
    ZC((Zz28)null);
  }
  
  public void Zqd(int paramInt) {
    this.ZI.ZW(paramInt, this.ZC);
    ZC((Zz28)null);
  }
  
  public Zmy8 Zqa(int paramInt) {
    return this.ZI.ZW8(paramInt);
  }
  
  public void ZC(Zz28 paramZz28) {
    if (this.ZW != null)
      this.ZW.ZC(paramZz28); 
  }
  
  public boolean ZI(Zmzk paramZmzk) {
    Zbqc[] arrayOfZbqc = Zlor.Zcp();
    synchronized (this.ZI.Zz6()) {
      for (Zmy8 zmy8 : this.ZI.ZjM()) {
        try {
          if (!zmy8.ZlM())
            continue; 
        } catch (Exception exception) {
          throw a(null);
        } 
        try {
          switch (zmy8.Zl5()) {
            case 1:
              try {
                if (paramZmzk.ZJZ())
                  continue; 
              } catch (Exception exception) {
                throw a(null);
              } 
              break;
            case 2:
              try {
                if (!paramZmzk.ZJZ())
                  continue; 
              } catch (Exception exception) {
                throw a(null);
              } 
              break;
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
        Ztdv ztdv = Zp(zmy8.Zlg(), true);
        try {
          if (ztdv.ZL(paramZmzk.ZJ1()) || arrayOfZbqc != null)
            return true; 
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.UNEXPECTED);
          if (arrayOfZbqc != null)
            return true; 
        } 
      } 
      return false;
    } 
  }
  
  public boolean Zm(Zlit paramZlit) {
    // Byte code:
    //   0: invokestatic Zcp : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull -> 14
    //   8: iconst_0
    //   9: ireturn
    //   10: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   13: athrow
    //   14: aload_0
    //   15: getfield ZI : Lburp/Zl34;
    //   18: invokeinterface Zz6 : ()Ljava/lang/Object;
    //   23: dup
    //   24: astore_3
    //   25: monitorenter
    //   26: aload_0
    //   27: getfield ZI : Lburp/Zl34;
    //   30: invokeinterface ZjM : ()Lburp/Zefg;
    //   35: invokeinterface iterator : ()Ljava/util/Iterator;
    //   40: astore #4
    //   42: aload #4
    //   44: invokeinterface hasNext : ()Z
    //   49: ifeq -> 315
    //   52: aload #4
    //   54: invokeinterface next : ()Ljava/lang/Object;
    //   59: checkcast burp/Zmy8
    //   62: astore #5
    //   64: aload #5
    //   66: invokeinterface ZlM : ()Z
    //   71: ifne -> 81
    //   74: goto -> 42
    //   77: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   80: athrow
    //   81: aload #5
    //   83: invokeinterface Zl5 : ()I
    //   88: lookupswitch default -> 155, 1 -> 116, 2 -> 139
    //   116: aload_1
    //   117: invokeinterface Zdr : ()Z
    //   122: ifeq -> 155
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   131: athrow
    //   132: goto -> 42
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: aload_1
    //   140: invokeinterface Zdr : ()Z
    //   145: ifne -> 155
    //   148: goto -> 42
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: aload_0
    //   156: aload #5
    //   158: invokeinterface Zlg : ()Ljava/lang/String;
    //   163: iconst_1
    //   164: invokevirtual Zp : (Ljava/lang/String;Z)Lburp/Ztdv;
    //   167: astore #6
    //   169: aload #6
    //   171: aload_1
    //   172: invokeinterface Zd1 : ()Ljava/lang/String;
    //   177: invokeinterface ZL : (Ljava/lang/String;)Z
    //   182: ifne -> 189
    //   185: aload_2
    //   186: ifnull -> 42
    //   189: goto -> 206
    //   192: astore #7
    //   194: aload #7
    //   196: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   199: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   202: aload_2
    //   203: ifnull -> 42
    //   206: aload_0
    //   207: aload #5
    //   209: invokeinterface ZlU : ()Ljava/lang/String;
    //   214: iconst_0
    //   215: invokevirtual Zp : (Ljava/lang/String;Z)Lburp/Ztdv;
    //   218: astore #7
    //   220: aload #7
    //   222: aload_1
    //   223: invokeinterface Zda : ()I
    //   228: invokestatic toString : (I)Ljava/lang/String;
    //   231: invokeinterface ZL : (Ljava/lang/String;)Z
    //   236: ifne -> 243
    //   239: aload_2
    //   240: ifnull -> 42
    //   243: goto -> 260
    //   246: astore #8
    //   248: aload #8
    //   250: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   253: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   256: aload_2
    //   257: ifnull -> 42
    //   260: aload_0
    //   261: aload #5
    //   263: invokeinterface ZlO : ()Ljava/lang/String;
    //   268: iconst_1
    //   269: invokevirtual Zp : (Ljava/lang/String;Z)Lburp/Ztdv;
    //   272: astore #8
    //   274: aload #8
    //   276: aload_1
    //   277: invokeinterface ZdH : ()[B
    //   282: invokeinterface ZD : ([B)Z
    //   287: ifne -> 294
    //   290: aload_2
    //   291: ifnull -> 42
    //   294: goto -> 311
    //   297: astore #9
    //   299: aload #9
    //   301: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   304: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   307: aload_2
    //   308: ifnull -> 42
    //   311: iconst_1
    //   312: aload_3
    //   313: monitorexit
    //   314: ireturn
    //   315: iconst_0
    //   316: aload_3
    //   317: monitorexit
    //   318: ireturn
    //   319: astore #10
    //   321: aload_3
    //   322: monitorexit
    //   323: aload #10
    //   325: athrow
    // Exception table:
    //   from	to	target	type
    //   4	10	10	java/lang/Exception
    //   26	314	319	finally
    //   64	77	77	java/lang/Exception
    //   81	125	128	java/lang/Exception
    //   116	135	135	java/lang/Exception
    //   139	151	151	java/lang/Exception
    //   169	185	192	java/lang/Exception
    //   220	239	246	java/lang/Exception
    //   274	290	297	java/lang/Exception
    //   315	318	319	finally
    //   319	323	319	finally
  }
  
  public boolean Zh(Zlit paramZlit) {
    return !Zlz();
  }
  
  private Ztdv Zp(String paramString, boolean paramBoolean) {
    if (this.Zg.containsKey(paramString))
      return this.Zg.get(paramString); 
    Ztdv ztdv = Zbs_.ZT(paramString, paramBoolean, this.Zu);
    this.Zg.put(paramString, ztdv);
    return ztdv;
  }
  
  public void ZL(Zzqw paramZzqw) {
    Zbqc[] arrayOfZbqc = Zlor.Zcp();
    for (Zmy8 zmy8 : this.ZI.ZjM()) {
      paramZzqw.Zx(zmy8.ZlH());
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmw3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
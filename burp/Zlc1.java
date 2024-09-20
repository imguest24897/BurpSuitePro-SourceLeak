package burp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zlc1 implements Zbiw {
  private Ztep Zl;
  
  public Zlc1(Ztep paramZtep) {
    this.Zl = paramZtep;
    Zf(paramZtep);
  }
  
  public void Zx(int paramInt, String paramString, boolean paramBoolean) {}
  
  public void ZL(int paramInt) {}
  
  public void Zf(Zsic paramZsic) {
    try {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      try {
        Zz(paramZsic, bufferedReader);
        bufferedReader.close();
      } catch (Throwable throwable) {
        try {
          bufferedReader.close();
        } catch (Throwable throwable1) {
          throwable.addSuppressed(throwable1);
        } 
        throw throwable;
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
  
  private void Zz(Zsic paramZsic, BufferedReader paramBufferedReader) {
    // Byte code:
    //   0: invokestatic Zg : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: instanceof burp/Ztep
    //   8: ifne -> 32
    //   11: iconst_0
    //   12: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   15: aload_1
    //   16: invokeinterface getClass : ()Ljava/lang/Class;
    //   21: invokevirtual toString : ()Ljava/lang/String;
    //   24: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   27: return
    //   28: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   31: athrow
    //   32: aload_0
    //   33: aload_1
    //   34: checkcast burp/Ztep
    //   37: putfield Zl : Lburp/Ztep;
    //   40: aload_1
    //   41: invokeinterface ZC : ()V
    //   46: aload_0
    //   47: getfield Zl : Lburp/Ztep;
    //   50: invokeinterface Zu : ()Z
    //   55: ifeq -> 168
    //   58: aload_2
    //   59: invokevirtual readLine : ()Ljava/lang/String;
    //   62: astore #4
    //   64: aload #4
    //   66: ifnonnull -> 77
    //   69: aload_0
    //   70: invokevirtual ZS : ()V
    //   73: aload_3
    //   74: ifnonnull -> 155
    //   77: aload_0
    //   78: getfield Zl : Lburp/Ztep;
    //   81: aload #4
    //   83: invokeinterface Zp : (Ljava/lang/String;)Lburp/Zsic;
    //   88: astore #5
    //   90: aload #5
    //   92: ifnonnull -> 110
    //   95: aload_0
    //   96: invokevirtual ZS : ()V
    //   99: aload_3
    //   100: ifnonnull -> 155
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload #5
    //   112: aload_0
    //   113: getfield Zl : Lburp/Ztep;
    //   116: if_acmpeq -> 144
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   125: athrow
    //   126: aload_0
    //   127: aload #5
    //   129: aload_2
    //   130: invokevirtual Zz : (Lburp/Zsic;Ljava/io/BufferedReader;)V
    //   133: aload_3
    //   134: ifnonnull -> 155
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   143: athrow
    //   144: aload_3
    //   145: ifnonnull -> 58
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: goto -> 168
    //   158: astore #4
    //   160: aload #4
    //   162: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   165: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   168: return
    // Exception table:
    //   from	to	target	type
    //   4	28	28	java/lang/Exception
    //   58	155	158	java/lang/Exception
    //   90	103	106	java/lang/Exception
    //   95	119	122	java/lang/Exception
    //   110	137	140	java/lang/Exception
    //   126	148	151	java/lang/Exception
  }
  
  public Zl0a Zu() {
    return null;
  }
  
  public void ZV(String paramString) {}
  
  public void ZS() {
    if (this.Zl != null)
      this.Zl.Zc(); 
  }
  
  public void ZU(boolean paramBoolean) {}
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlc1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
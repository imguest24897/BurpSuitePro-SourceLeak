package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zsy;

public class Zlk2 {
  private static final List<Byte> Zd = Collections.unmodifiableList(Arrays.asList(new Byte[] { Byte.valueOf((byte)17), Byte.valueOf((byte)16), Byte.valueOf((byte)13), Byte.valueOf((byte)12), Byte.valueOf((byte)14), Byte.valueOf((byte)15) }));
  
  private final Zsy ZQ;
  
  public Zlk2(Zsy paramZsy) {
    this.ZQ = paramZsy;
  }
  
  public void ZX(Zmhe paramZmhe, Zxs7 paramZxs7, Zbl3 paramZbl3) {
    // Byte code:
    //   0: new burp/Zzma
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: new burp/Zt7z
    //   12: dup
    //   13: aload_1
    //   14: aload_2
    //   15: aload_0
    //   16: getfield ZQ : Lnet/portswigger/Zsy;
    //   19: aload #4
    //   21: invokespecial <init> : (Lburp/Zmhe;Lburp/Zxs7;Lnet/portswigger/Zsy;Lburp/Zspd;)V
    //   24: invokevirtual ZE : ()V
    //   27: aload_1
    //   28: invokeinterface ZR : ()Z
    //   33: ifne -> 59
    //   36: aload_1
    //   37: invokeinterface ZU : ()Z
    //   42: ifne -> 59
    //   45: aload_0
    //   46: aload_1
    //   47: aload_2
    //   48: aload_3
    //   49: invokevirtual ZX : (Lburp/Zmhe;Lburp/Zxs7;Lburp/Zbl3;)V
    //   52: goto -> 59
    //   55: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   58: athrow
    //   59: aload #4
    //   61: aload_3
    //   62: <illegal opcode> Zu : (Lburp/Zzma;Lburp/Zbl3;)Lburp/Ze8t;
    //   67: invokestatic Zi : (Lburp/Ze8t;)V
    //   70: goto -> 90
    //   73: astore #4
    //   75: aload #4
    //   77: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   80: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   83: aload_0
    //   84: aload_1
    //   85: aload_2
    //   86: aload_3
    //   87: invokevirtual ZX : (Lburp/Zmhe;Lburp/Zxs7;Lburp/Zbl3;)V
    //   90: return
    // Exception table:
    //   from	to	target	type
    //   0	70	73	burp/Zg57
    //   36	52	55	burp/Zg57
  }
  
  public static boolean Zg(byte paramByte1, byte paramByte2, Zku6 paramZku6) {
    try {
      if (paramZku6.Zu())
        try {
          if (paramZku6.Zk(paramByte1, paramByte2))
            try {
              if (ZI(paramByte2));
            } catch (Zg57 zg57) {
              throw a(null);
            }  
        } catch (Zg57 zg57) {
          throw a(null);
        }  
    } catch (Zg57 zg57) {
      throw a(null);
    } 
    return false;
  }
  
  private static boolean ZI(byte paramByte) {
    return Zd.contains(Byte.valueOf(paramByte));
  }
  
  private static void lambda$checkForReflection$0(Zzma paramZzma, Zbl3 paramZbl3, Byte paramByte) {
    boolean bool = Ztbx.ZA();
    for (Zsjk zsjk : Zsjk.PLAIN_REFLECTION_TYPES) {
      Zku6 zku6 = paramZzma.ZV(zsjk);
      try {
        if (Zg((byte)2, paramByte.byteValue(), zku6))
          paramZbl3.ZC(zsjk, paramByte.byteValue(), zku6); 
      } catch (Zg57 zg57) {
        throw a(null);
      } 
      if (bool)
        break; 
    } 
  }
  
  private static Zg57 a(Zg57 paramZg57) {
    return paramZg57;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlk2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
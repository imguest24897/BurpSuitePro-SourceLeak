package burp;

import java.util.Optional;

public class Zzlh {
  public Zxgd ZV() {
    return Zxgd.Zu(Zzlh::lambda$buildRequestModifier$0).Zp(this::lambda$buildRequestModifier$1);
  }
  
  private Zi4 Zh(Zxs7 paramZxs7, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Zl : ()Lburp/Zro0;
    //   6: invokeinterface ZEp : ()I
    //   11: istore #4
    //   13: invokestatic Zi : ()[Ljava/lang/String;
    //   16: aload_1
    //   17: invokeinterface Z_ : ()Lburp/Zs66;
    //   22: astore #5
    //   24: astore_3
    //   25: iload_2
    //   26: ifne -> 63
    //   29: iload #4
    //   31: iconst_1
    //   32: invokestatic Zf : (II)Z
    //   35: ifeq -> 63
    //   38: iload #4
    //   40: iconst_1
    //   41: ixor
    //   42: iconst_2
    //   43: ior
    //   44: istore #4
    //   46: iload #4
    //   48: invokestatic Zt : (I)Z
    //   51: ifeq -> 97
    //   54: getstatic burp/Zs66.BODY_PARAM_URL_ENCODED : Lburp/Zs66;
    //   57: astore #5
    //   59: aload_3
    //   60: ifnonnull -> 97
    //   63: iload_2
    //   64: ifeq -> 97
    //   67: iload #4
    //   69: iconst_2
    //   70: invokestatic Zf : (II)Z
    //   73: ifeq -> 97
    //   76: iload #4
    //   78: iconst_2
    //   79: ixor
    //   80: iconst_1
    //   81: ior
    //   82: istore #4
    //   84: iload #4
    //   86: invokestatic Zt : (I)Z
    //   89: ifeq -> 97
    //   92: getstatic burp/Zs66.URL_PARAM : Lburp/Zs66;
    //   95: astore #5
    //   97: aload #5
    //   99: invokestatic ZP : (Lburp/Zs66;)Ljava/util/Optional;
    //   102: astore #6
    //   104: new burp/Zi4
    //   107: dup
    //   108: iload #4
    //   110: aload #5
    //   112: aload #6
    //   114: aload_1
    //   115: invokeinterface ZN : ()Lburp/Ztr2;
    //   120: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   123: checkcast burp/Ztr2
    //   126: invokespecial <init> : (ILburp/Zs66;Lburp/Ztr2;)V
    //   129: areturn
  }
  
  private static Optional<Ztr2> ZP(Zs66 paramZs66) {
    switch (Zbi0.Zr[paramZs66.ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      
    } 
    return Optional.empty();
  }
  
  private static boolean Zf(int paramInt1, int paramInt2) {
    return ((paramInt1 & 0xFFFFFF7F) == paramInt2);
  }
  
  private static boolean Zt(int paramInt) {
    return ((paramInt & 0x80) != 128);
  }
  
  private Ztcd lambda$buildRequestModifier$1(Ztcd paramZtcd) {
    return paramZtcd.Zg(true).ZE(this::Zh);
  }
  
  private static Zefx lambda$buildRequestModifier$0(Zefx paramZefx) {
    return paramZefx.ZN(Ztvk.Zv);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzlh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
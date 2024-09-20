package burp;

import java.util.Objects;

public class Ztkv {
  private final Zxjt ZD;
  
  private final Zr69 ZO;
  
  private static String[] Zd;
  
  public Ztkv(Zxjt paramZxjt, Zr69 paramZr69) {
    this.ZD = paramZxjt;
    this.ZO = paramZr69;
  }
  
  public void Zb(Ztos<Zt35> paramZtos) {
    paramZtos.ZE(Zt35.Zo, this::lambda$subscribeTo$0);
  }
  
  private void Zg(Zs_l paramZs_l) {
    // Byte code:
    //   0: invokestatic ZM : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual Zpt : ()Lburp/Zt8i;
    //   8: invokeinterface Zsu : ()Lburp/Zeu9;
    //   13: astore_3
    //   14: aload_3
    //   15: instanceof burp/Zzr9
    //   18: ifeq -> 168
    //   21: aload_3
    //   22: checkcast burp/Zzr9
    //   25: astore #4
    //   27: aload #4
    //   29: invokeinterface ZVj : ()Ljava/util/List;
    //   34: astore #5
    //   36: aload #4
    //   38: invokestatic ZH : (Lburp/Zzr9;)Z
    //   41: ifeq -> 87
    //   44: aload #5
    //   46: invokeinterface size : ()I
    //   51: aload_0
    //   52: getfield ZO : Lburp/Zr69;
    //   55: invokeinterface ZB : ()I
    //   60: if_icmple -> 87
    //   63: new java/util/LinkedList
    //   66: dup
    //   67: aload #5
    //   69: invokespecial <init> : (Ljava/util/Collection;)V
    //   72: iconst_0
    //   73: aload_0
    //   74: getfield ZO : Lburp/Zr69;
    //   77: invokeinterface ZB : ()I
    //   82: invokevirtual subList : (II)Ljava/util/List;
    //   85: astore #5
    //   87: getstatic burp/Zeqp.ZX : [I
    //   90: aload #4
    //   92: invokeinterface ZVt : ()Lburp/Zzh4;
    //   97: invokevirtual ordinal : ()I
    //   100: iaload
    //   101: tableswitch default -> 168, 1 -> 128, 2 -> 132, 3 -> 147
    //   128: aload_2
    //   129: ifnull -> 168
    //   132: aload_0
    //   133: getfield ZD : Lburp/Zxjt;
    //   136: aload #5
    //   138: invokeinterface Za : (Ljava/util/List;)V
    //   143: aload_2
    //   144: ifnull -> 168
    //   147: aload_1
    //   148: invokevirtual Zpt : ()Lburp/Zt8i;
    //   151: invokeinterface Zsg : ()Lburp/Zrp0;
    //   156: invokeinterface Znq : ()Lburp/Zeu9;
    //   161: aload #5
    //   163: invokeinterface Za : (Ljava/util/List;)V
    //   168: return
  }
  
  private static boolean ZH(Zzr9 paramZzr9) {
    Objects.requireNonNull(Zbio.class);
    Objects.requireNonNull(Zbio.class);
    Objects.requireNonNull(Zz3o.SITEMAP);
    return paramZzr9.ZSA().stream().filter(Zbio.class::isInstance).map(Zbio.class::cast).map(Zxss::Zt).anyMatch(Zz3o.SITEMAP::equals);
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zg);
  }
  
  public static void Za(String[] paramArrayOfString) {
    Zd = paramArrayOfString;
  }
  
  public static String[] ZM() {
    return Zd;
  }
  
  static {
    if (ZM() != null)
      Za(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztkv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
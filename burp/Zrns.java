package burp;

import java.util.List;

public class Zrns implements Zm9n {
  private final Ze3n Zi;
  
  private final Zxs7 Zw;
  
  private final Zbjl Zp;
  
  private final Zbnt ZC;
  
  private final Zr_4 ZL;
  
  private final Zmhe ZQ;
  
  private final Zkq4 ZR;
  
  private final Zlk4 ZE;
  
  private static final String a;
  
  public Zrns(Zmhe paramZmhe, Zkq4 paramZkq4, Ze3n paramZe3n, Zxs7 paramZxs7, Zbjl paramZbjl, Zbnt paramZbnt, Zr_4 paramZr_4) {
    this.ZR = paramZkq4;
    this.Zi = paramZe3n;
    this.Zw = paramZxs7;
    this.Zp = paramZbjl;
    this.ZC = paramZbnt;
    this.ZL = paramZr_4;
    this.ZQ = paramZmhe;
    this.ZE = Ze7p.Zn(paramZxs7) ? Zlk4.THOROUGH : paramZkq4.ZqT();
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: new burp/Zbf4
    //   3: dup
    //   4: getstatic burp/Zk7g.OUT_BAND_RESOURCE_LOAD : Lburp/Zk7g;
    //   7: aload_1
    //   8: invokevirtual Zg : ()I
    //   11: aload_0
    //   12: getfield Zi : Lburp/Ze3n;
    //   15: invokevirtual ZM : ()Lburp/Zbza;
    //   18: invokeinterface Zgv : ()I
    //   23: aload_0
    //   24: getfield Zw : Lburp/Zxs7;
    //   27: aload_0
    //   28: getfield ZE : Lburp/Zlk4;
    //   31: aload_0
    //   32: getfield Zp : Lburp/Zbjl;
    //   35: invokespecial <init> : (Lburp/Zk7g;IILburp/Zxs7;Lburp/Zlk4;Lburp/Zbjl;)V
    //   38: astore #4
    //   40: new burp/Zri1
    //   43: dup
    //   44: aload_0
    //   45: getfield ZL : Lburp/Zr_4;
    //   48: aload_0
    //   49: getfield ZC : Lburp/Zbnt;
    //   52: aload_0
    //   53: getfield Zi : Lburp/Ze3n;
    //   56: aload_0
    //   57: getfield Zw : Lburp/Zxs7;
    //   60: aload #4
    //   62: invokespecial <init> : (Lburp/Zr_4;Lburp/Zbnt;Lburp/Ze3n;Lburp/Zxs7;Lburp/Zbf4;)V
    //   65: astore #5
    //   67: aload #4
    //   69: invokevirtual ZK : ()Ljava/util/List;
    //   72: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   77: aload_0
    //   78: <illegal opcode> test : (Lburp/Zrns;)Ljava/util/function/Predicate;
    //   83: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   88: aload_0
    //   89: aload #5
    //   91: <illegal opcode> accept : (Lburp/Zrns;Lburp/Zri1;)Ljava/util/function/Consumer;
    //   96: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   101: aload #5
    //   103: aload_3
    //   104: invokevirtual ZS : (Lburp/Zz4_;)V
    //   107: return
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_OutOfBandResourceLoad;
  }
  
  public boolean Zf() {
    switch (Zkh4.Zm[this.Zw.Z_().ordinal()]) {
      case 1:
        return false;
      case 2:
        if (this.Zw.Zf().equalsIgnoreCase(a))
          return false; 
        break;
    } 
    return Ze7p.ZS(this.Zw, this.ZR);
  }
  
  private boolean ZY(Zewx paramZewx) {
    return (paramZewx.ZA(this.Zp) && ((paramZewx.ZG() == Zlp9.NON_SCHEMA_URL_PAYLOAD && this.ZR.Zs4()) || this.ZR.Zr(Zzu2.OUT_OF_BAND_RESOURCE_LOAD_HTTP) || this.ZR.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS, Zr3z.COLLABORATOR_BASED) || this.ZR.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP, Zr3z.COLLABORATOR_BASED)));
  }
  
  private void ZF(Zri1 paramZri1, Zewx paramZewx, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp : Lburp/Zbjl;
    //   4: aload_2
    //   5: invokevirtual ZF : ()Lnet/portswigger/Zen;
    //   8: invokeinterface Ze : (Lnet/portswigger/Zen;)Ljava/util/List;
    //   13: astore #4
    //   15: aload #4
    //   17: invokeinterface isEmpty : ()Z
    //   22: ifeq -> 31
    //   25: aload_1
    //   26: aload_2
    //   27: aload_3
    //   28: invokevirtual Zi : (Lburp/Zewx;[B)V
    //   31: aload #4
    //   33: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   38: aload_2
    //   39: <illegal opcode> apply : (Lburp/Zewx;)Ljava/util/function/Function;
    //   44: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   49: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   54: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   59: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   64: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   69: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   74: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   79: aload_1
    //   80: aload_2
    //   81: aload_3
    //   82: aload #4
    //   84: <illegal opcode> accept : (Lburp/Zri1;Lburp/Zewx;[BLjava/util/List;)Ljava/util/function/Consumer;
    //   89: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   94: return
  }
  
  private static void lambda$checkOutOfBandResourceLoad$2(Zri1 paramZri1, Zewx paramZewx, byte[] paramArrayOfbyte, List<Zer0> paramList, Zr5y paramZr5y) {
    paramZri1.ZQ(paramZewx, paramArrayOfbyte, paramList, paramZr5y.ZX);
  }
  
  private static Zr5y lambda$checkOutOfBandResourceLoad$1(Zewx paramZewx, Zer0 paramZer0) {
    return new Zr5y(paramZewx, paramZer0);
  }
  
  private void lambda$doCheck$0(Zri1 paramZri1, Zewx paramZewx) {
    Zlvf zlvf = this.ZQ.ZK(Zri7.ZJ(new Zrrb(paramZewx.Zh(), paramZewx.ZY())), Zlp5.Zc().Zd(true));
    if (this.ZR.Zr(Zzu2.OUT_OF_BAND_RESOURCE_LOAD_HTTP)) {
      byte[] arrayOfByte = paramZewx.ZE(zlvf.ZM());
      if (arrayOfByte != null)
        ZF(paramZri1, paramZewx, arrayOfByte); 
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #35
    //   2: ldc 'bE4yArX '
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrns.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #52
    //   82: goto -> 111
    //   85: bipush #21
    //   87: goto -> 111
    //   90: bipush #87
    //   92: goto -> 111
    //   95: bipush #101
    //   97: goto -> 111
    //   100: bipush #119
    //   102: goto -> 111
    //   105: bipush #70
    //   107: goto -> 111
    //   110: iconst_5
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrns.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
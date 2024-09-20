package burp;

import java.util.List;

public class Zsvb extends Zsvm {
  private final Ztz1 Ze;
  
  private static final String c;
  
  Zsvb(Ztz1 paramZtz1) {
    super(paramZtz1.ZZ(), paramZtz1::lambda$new$4);
    this.Ze = paramZtz1;
    Zg();
  }
  
  public Zsvb ZM(Zgv3 paramZgv3) {
    this.Ze.ZB(paramZgv3);
    return this;
  }
  
  public Zsvb ZQ(byte paramByte) {
    this.Ze.Zo(paramByte);
    return this;
  }
  
  public Zsvb ZF(byte paramByte) {
    this.Ze.Zm(paramByte);
    return this;
  }
  
  public Zsvb ZX(Zm3v<String> paramZm3v) {
    if (paramZm3v != null)
      this.Ze.ZN(new Zsel[] { new Zsel(Ztz3.ISSUE_REMEDIATION, paramZm3v) }); 
    return this;
  }
  
  public Zsvb ZE(Zm3v<String> paramZm3v) {
    if (paramZm3v != null)
      this.Ze.ZN(new Zsel[] { new Zsel(Ztz3.ISSUE_DESCRIPTION, paramZm3v) }); 
    return this;
  }
  
  public Zsvb Zb(String paramString) {
    return Zu(paramString::lambda$withIssueName$5);
  }
  
  public Zsvb Zu(Zm3v<String> paramZm3v) {
    this.Ze.ZN(new Zsel[] { new Zsel(Ztz3.ISSUE_NAME, paramZm3v) });
    this.Ze.ZN(new Zsel[] { new Zsel(Ztz3.EXTENSION_NAME, paramZm3v) });
    return this;
  }
  
  private static String lambda$withIssueName$5(String paramString, Zzvx paramZzvx) {
    return paramString;
  }
  
  private static Zzbn lambda$new$4(Ztz1 paramZtz1, Zzvx paramZzvx) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZU : ()Lburp/Zbnr;
    //   4: invokeinterface Zq : ()Lburp/Zbnt;
    //   9: astore_2
    //   10: aload_1
    //   11: getstatic burp/Zsvb.c : Ljava/lang/String;
    //   14: invokevirtual Zk : (Ljava/lang/String;)Lburp/Zzbn;
    //   17: astore_3
    //   18: new java/util/ArrayList
    //   21: dup
    //   22: aload_3
    //   23: aload_2
    //   24: iconst_1
    //   25: aload_1
    //   26: instanceof burp/Zzvn
    //   29: invokevirtual ZC : (Lburp/Zbnt;ZZ)Ljava/util/List;
    //   32: invokespecial <init> : (Ljava/util/Collection;)V
    //   35: astore #4
    //   37: aload_1
    //   38: invokevirtual Zf : ()Ljava/util/List;
    //   41: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   46: aload_3
    //   47: <illegal opcode> test : (Lburp/Zzbn;)Ljava/util/function/Predicate;
    //   52: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   57: aload #4
    //   59: aload_2
    //   60: aload_1
    //   61: <illegal opcode> accept : (Ljava/util/List;Lburp/Zbnt;Lburp/Zzvx;)Ljava/util/function/Consumer;
    //   66: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   71: aload_0
    //   72: invokevirtual ZH : ()Ljava/util/List;
    //   75: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   80: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   85: aload_1
    //   86: <illegal opcode> apply : (Lburp/Zzvx;)Ljava/util/function/Function;
    //   91: invokestatic toMap : (Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;
    //   94: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   99: checkcast java/util/Map
    //   102: astore #5
    //   104: aload_1
    //   105: aload_0
    //   106: aload #5
    //   108: aload #4
    //   110: invokevirtual Zf : (Lburp/Ztz1;Ljava/util/Map;Ljava/util/List;)Lburp/Zx_5;
    //   113: astore #6
    //   115: aload_1
    //   116: aload #6
    //   118: invokevirtual Zf : (Lburp/Zx_5;)V
    //   121: aload_1
    //   122: invokevirtual Zw : ()Lburp/Zzeq;
    //   125: aload #6
    //   127: invokevirtual Zg : ()[B
    //   130: invokestatic ZG : ([B)Ljava/lang/String;
    //   133: invokeinterface ZZ : (Ljava/lang/String;)V
    //   138: getstatic burp/Zzbn.ZG : Lburp/Zzbn;
    //   141: areturn
  }
  
  private static String lambda$new$3(Zzvx paramZzvx, Zsel paramZsel) {
    return paramZsel.Zw.Zm(paramZzvx);
  }
  
  private static Long lambda$new$2(Zsel paramZsel) {
    return Long.valueOf(paramZsel.ZU.permanentIndex);
  }
  
  private static void lambda$new$1(List<Zlfv<? extends Zgkc>> paramList, Zbnt paramZbnt, Zzvx paramZzvx, Zzbn paramZzbn) {
    paramList.addAll(paramZzbn.ZC(paramZbnt, false, paramZzvx instanceof Zzvn));
  }
  
  private static boolean lambda$new$0(Zzbn paramZzbn1, Zzbn paramZzbn2) {
    return (paramZzbn2 != paramZzbn1);
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: ldc 'Ok\\b,'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsvb.c : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
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
    //   80: bipush #13
    //   82: goto -> 112
    //   85: bipush #42
    //   87: goto -> 112
    //   90: bipush #91
    //   92: goto -> 112
    //   95: bipush #105
    //   97: goto -> 112
    //   100: bipush #10
    //   102: goto -> 112
    //   105: bipush #37
    //   107: goto -> 112
    //   110: bipush #99
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsvb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
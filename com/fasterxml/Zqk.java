package com.fasterxml;

import burp.Zbqc;
import java.time.Duration;
import java.util.Map;
import java.util.stream.Collectors;

public class Zqk {
  private static final Map<String, Zvn> ZT;
  
  final Zvn Zq;
  
  private static String[] Zv;
  
  private static final String a;
  
  Zqk(Zvn paramZvn) {
    this.Zq = paramZvn;
  }
  
  public Duration ZQ(long paramLong) {
    return this.Zq.ZC.apply(Long.valueOf(paramLong));
  }
  
  public long ZH(Duration paramDuration) {
    return ((Long)this.Zq.Zk.apply(paramDuration)).longValue();
  }
  
  public static String ZX() {
    String[] arrayOfString = ZK();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[3]); 
    return "\"" + (String)ZT.keySet().stream().collect(Collectors.joining(a)) + "\"";
  }
  
  public static Zqk Zn(String paramString) {
    Zvn zvn = ZT.get(paramString);
    String[] arrayOfString = ZK();
    if (Zbqc.Zwu() == null)
      ZB(new String[4]); 
    return (zvn == null) ? null : new Zqk(zvn);
  }
  
  private static Long lambda$static$1(Duration paramDuration) {
    return Long.valueOf(paramDuration.toHours() / 12L);
  }
  
  private static Long lambda$static$0(Duration paramDuration) {
    return Long.valueOf(paramDuration.toNanos() / 1000L);
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZK : ()[Ljava/lang/String;
    //   3: ifnonnull -> 13
    //   6: iconst_2
    //   7: anewarray java/lang/String
    //   10: invokestatic ZB : ([Ljava/lang/String;)V
    //   13: bipush #32
    //   15: ldc ')o'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic com/fasterxml/Zqk.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #43
    //   94: goto -> 124
    //   97: bipush #21
    //   99: goto -> 124
    //   102: bipush #18
    //   104: goto -> 124
    //   107: bipush #109
    //   109: goto -> 124
    //   112: bipush #106
    //   114: goto -> 124
    //   117: bipush #23
    //   119: goto -> 124
    //   122: bipush #42
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 21
    //   166: new java/util/LinkedHashMap
    //   169: dup
    //   170: invokespecial <init> : ()V
    //   173: astore_1
    //   174: aload_1
    //   175: getstatic java/time/temporal/ChronoUnit.NANOS : Ljava/time/temporal/ChronoUnit;
    //   178: invokevirtual name : ()Ljava/lang/String;
    //   181: new com/fasterxml/Zvn
    //   184: dup
    //   185: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   190: getstatic java/time/temporal/ChronoUnit.NANOS : Ljava/time/temporal/ChronoUnit;
    //   193: invokestatic ZP : (Ljava/time/temporal/TemporalUnit;)Ljava/util/function/Function;
    //   196: invokespecial <init> : (Ljava/util/function/Function;Ljava/util/function/Function;)V
    //   199: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   204: pop
    //   205: aload_1
    //   206: getstatic java/time/temporal/ChronoUnit.MICROS : Ljava/time/temporal/ChronoUnit;
    //   209: invokevirtual name : ()Ljava/lang/String;
    //   212: new com/fasterxml/Zvn
    //   215: dup
    //   216: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   221: getstatic java/time/temporal/ChronoUnit.MICROS : Ljava/time/temporal/ChronoUnit;
    //   224: invokestatic ZP : (Ljava/time/temporal/TemporalUnit;)Ljava/util/function/Function;
    //   227: invokespecial <init> : (Ljava/util/function/Function;Ljava/util/function/Function;)V
    //   230: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   235: pop
    //   236: aload_1
    //   237: getstatic java/time/temporal/ChronoUnit.MILLIS : Ljava/time/temporal/ChronoUnit;
    //   240: invokevirtual name : ()Ljava/lang/String;
    //   243: new com/fasterxml/Zvn
    //   246: dup
    //   247: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   252: getstatic java/time/temporal/ChronoUnit.MILLIS : Ljava/time/temporal/ChronoUnit;
    //   255: invokestatic ZP : (Ljava/time/temporal/TemporalUnit;)Ljava/util/function/Function;
    //   258: invokespecial <init> : (Ljava/util/function/Function;Ljava/util/function/Function;)V
    //   261: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   266: pop
    //   267: aload_1
    //   268: getstatic java/time/temporal/ChronoUnit.SECONDS : Ljava/time/temporal/ChronoUnit;
    //   271: invokevirtual name : ()Ljava/lang/String;
    //   274: new com/fasterxml/Zvn
    //   277: dup
    //   278: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   283: getstatic java/time/temporal/ChronoUnit.SECONDS : Ljava/time/temporal/ChronoUnit;
    //   286: invokestatic ZP : (Ljava/time/temporal/TemporalUnit;)Ljava/util/function/Function;
    //   289: invokespecial <init> : (Ljava/util/function/Function;Ljava/util/function/Function;)V
    //   292: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   297: pop
    //   298: aload_1
    //   299: getstatic java/time/temporal/ChronoUnit.MINUTES : Ljava/time/temporal/ChronoUnit;
    //   302: invokevirtual name : ()Ljava/lang/String;
    //   305: new com/fasterxml/Zvn
    //   308: dup
    //   309: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   314: getstatic java/time/temporal/ChronoUnit.MINUTES : Ljava/time/temporal/ChronoUnit;
    //   317: invokestatic ZP : (Ljava/time/temporal/TemporalUnit;)Ljava/util/function/Function;
    //   320: invokespecial <init> : (Ljava/util/function/Function;Ljava/util/function/Function;)V
    //   323: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   328: pop
    //   329: aload_1
    //   330: getstatic java/time/temporal/ChronoUnit.HOURS : Ljava/time/temporal/ChronoUnit;
    //   333: invokevirtual name : ()Ljava/lang/String;
    //   336: new com/fasterxml/Zvn
    //   339: dup
    //   340: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   345: getstatic java/time/temporal/ChronoUnit.HOURS : Ljava/time/temporal/ChronoUnit;
    //   348: invokestatic ZP : (Ljava/time/temporal/TemporalUnit;)Ljava/util/function/Function;
    //   351: invokespecial <init> : (Ljava/util/function/Function;Ljava/util/function/Function;)V
    //   354: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   359: pop
    //   360: aload_1
    //   361: getstatic java/time/temporal/ChronoUnit.HALF_DAYS : Ljava/time/temporal/ChronoUnit;
    //   364: invokevirtual name : ()Ljava/lang/String;
    //   367: new com/fasterxml/Zvn
    //   370: dup
    //   371: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   376: getstatic java/time/temporal/ChronoUnit.HALF_DAYS : Ljava/time/temporal/ChronoUnit;
    //   379: invokestatic ZP : (Ljava/time/temporal/TemporalUnit;)Ljava/util/function/Function;
    //   382: invokespecial <init> : (Ljava/util/function/Function;Ljava/util/function/Function;)V
    //   385: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   390: pop
    //   391: aload_1
    //   392: getstatic java/time/temporal/ChronoUnit.DAYS : Ljava/time/temporal/ChronoUnit;
    //   395: invokevirtual name : ()Ljava/lang/String;
    //   398: new com/fasterxml/Zvn
    //   401: dup
    //   402: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   407: getstatic java/time/temporal/ChronoUnit.DAYS : Ljava/time/temporal/ChronoUnit;
    //   410: invokestatic ZP : (Ljava/time/temporal/TemporalUnit;)Ljava/util/function/Function;
    //   413: invokespecial <init> : (Ljava/util/function/Function;Ljava/util/function/Function;)V
    //   416: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   421: pop
    //   422: aload_1
    //   423: putstatic com/fasterxml/Zqk.ZT : Ljava/util/Map;
    //   426: return
  }
  
  public static void ZB(String[] paramArrayOfString) {
    Zv = paramArrayOfString;
  }
  
  public static String[] ZK() {
    return Zv;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zqk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
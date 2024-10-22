package org.openapi4j;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Zpu implements Serializable {
  private static final long serialVersionUID = 1905122041950251284L;
  
  private static final String ZQ;
  
  private static final String ZX;
  
  private static final String ZG;
  
  private static final String Zw;
  
  private final List<Zp_> Zk = new ArrayList<>();
  
  private final Deque<Za> ZA = new ArrayDeque<>();
  
  private Zd Zd = Zd.NONE;
  
  private static int Zo;
  
  public void Zl(Zpy paramZpy, Object... paramVarArgs) {
    this.Zk.add(new Zp_(paramZpy, this.ZA, paramVarArgs));
    if (paramZpy.ZD().ZB(this.Zd))
      this.Zd = paramZpy.ZD(); 
  }
  
  public void ZL(Za paramZa, Zpy paramZpy, Object... paramVarArgs) {
    this.Zk.add(new Zp_(paramZpy, this.ZA, paramZa, paramVarArgs));
    if (paramZpy.ZD().ZB(this.Zd))
      this.Zd = paramZpy.ZD(); 
  }
  
  public Zd ZH() {
    return this.Zd;
  }
  
  public void ZY(Za paramZa, Runnable paramRunnable) {
    if (paramZa != null)
      this.ZA.addLast(paramZa); 
    try {
      paramRunnable.run();
    } finally {
      if (paramZa != null)
        this.ZA.pollLast(); 
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    int i = ZS();
    StringBuilder stringBuilder3 = new StringBuilder();
    for (Zp_ zp_ : this.Zk) {
      switch (Zpp.Zy[zp_.ZD().ordinal()]) {
        case 1:
          stringBuilder1.append(zp_.toString()).append(ZQ);
        case 2:
          stringBuilder2.append(zp_.toString()).append(ZQ);
        default:
          stringBuilder3.append(zp_.toString()).append(ZQ);
          break;
      } 
      continue;
      if (i != 0)
        break; 
    } 
    if (stringBuilder1.length() != 0)
      stringBuilder1.insert(0, ZX); 
    if (stringBuilder2.length() != 0)
      stringBuilder2.insert(0, ZG); 
    if (stringBuilder3.length() != 0)
      stringBuilder3.insert(0, Zw); 
    return stringBuilder1.append(stringBuilder2).append(stringBuilder3).toString();
  }
  
  private static boolean lambda$items$0(Zd paramZd, Zp_ paramZp_) {
    return (paramZd == paramZp_.ZD());
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: bipush #76
    //   7: iconst_0
    //   8: istore #4
    //   10: invokestatic ZJ : (I)V
    //   13: ldc '8`KoiTsltakXU`jr|-2"'
    //   15: dup
    //   16: astore_3
    //   17: invokevirtual length : ()I
    //   20: istore #5
    //   22: iconst_2
    //   23: istore_2
    //   24: iconst_m1
    //   25: istore_1
    //   26: bipush #46
    //   28: iinc #1, 1
    //   31: aload_3
    //   32: iload_1
    //   33: dup
    //   34: iload_2
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 133
    //   43: aload_0
    //   44: swap
    //   45: iload #4
    //   47: iinc #4, 1
    //   50: swap
    //   51: aastore
    //   52: iload_1
    //   53: iload_2
    //   54: iadd
    //   55: dup
    //   56: istore_1
    //   57: iload #5
    //   59: if_icmpge -> 71
    //   62: aload_3
    //   63: iload_1
    //   64: invokevirtual charAt : (I)C
    //   67: istore_2
    //   68: goto -> 26
    //   71: ldc ';=E '8 5?\\f\\r(*&r"D|;=E '8 5?\\f'>'3?KL5ei`'
    //   73: dup
    //   74: astore_3
    //   75: invokevirtual length : ()I
    //   78: istore #5
    //   80: bipush #20
    //   82: istore_2
    //   83: iconst_m1
    //   84: istore_1
    //   85: bipush #122
    //   87: iinc #1, 1
    //   90: aload_3
    //   91: iload_1
    //   92: dup
    //   93: iload_2
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 133
    //   102: aload_0
    //   103: swap
    //   104: iload #4
    //   106: iinc #4, 1
    //   109: swap
    //   110: aastore
    //   111: iload_1
    //   112: iload_2
    //   113: iadd
    //   114: dup
    //   115: istore_1
    //   116: iload #5
    //   118: if_icmpge -> 130
    //   121: aload_3
    //   122: iload_1
    //   123: invokevirtual charAt : (I)C
    //   126: istore_2
    //   127: goto -> 85
    //   130: goto -> 292
    //   133: dup_x2
    //   134: pop
    //   135: invokevirtual toCharArray : ()[C
    //   138: dup_x1
    //   139: arraylength
    //   140: dup_x2
    //   141: pop
    //   142: iconst_0
    //   143: istore #6
    //   145: dup2_x1
    //   146: pop2
    //   147: dup_x2
    //   148: iconst_1
    //   149: if_icmpgt -> 252
    //   152: dup2
    //   153: swap
    //   154: iload #6
    //   156: dup2_x1
    //   157: caload
    //   158: swap
    //   159: iload #6
    //   161: bipush #7
    //   163: irem
    //   164: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #51
    //   206: goto -> 236
    //   209: bipush #32
    //   211: goto -> 236
    //   214: bipush #43
    //   216: goto -> 236
    //   219: bipush #86
    //   221: goto -> 236
    //   224: bipush #30
    //   226: goto -> 236
    //   229: bipush #60
    //   231: goto -> 236
    //   234: bipush #54
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 156
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 152
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 43, 0 -> 102
    //   292: aload_0
    //   293: iconst_0
    //   294: aaload
    //   295: iconst_0
    //   296: anewarray java/lang/Object
    //   299: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   302: putstatic org/openapi4j/Zpu.ZQ : Ljava/lang/String;
    //   305: getstatic org/openapi4j/Zpu.ZQ : Ljava/lang/String;
    //   308: aload_0
    //   309: iconst_1
    //   310: aaload
    //   311: swap
    //   312: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   317: putstatic org/openapi4j/Zpu.ZX : Ljava/lang/String;
    //   320: getstatic org/openapi4j/Zpu.ZQ : Ljava/lang/String;
    //   323: aload_0
    //   324: iconst_3
    //   325: aaload
    //   326: swap
    //   327: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   332: putstatic org/openapi4j/Zpu.ZG : Ljava/lang/String;
    //   335: getstatic org/openapi4j/Zpu.ZQ : Ljava/lang/String;
    //   338: aload_0
    //   339: iconst_2
    //   340: aaload
    //   341: swap
    //   342: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   347: putstatic org/openapi4j/Zpu.Zw : Ljava/lang/String;
    //   350: return
  }
  
  public static void ZJ(int paramInt) {
    Zo = paramInt;
  }
  
  public static int ZG() {
    return Zo;
  }
  
  public static int ZS() {
    int i = ZG();
    return (i == 0) ? 71 : 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zpu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
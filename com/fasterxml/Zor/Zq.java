package com.fasterxml.Zor;

@Deprecated
public class Zq extends Zx {
  public Zq() {}
  
  protected Zq(boolean paramBoolean) {
    super(paramBoolean);
  }
  
  public String Zh(String paramString) {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: ifnonnull -> 10
    //   8: aload_1
    //   9: areturn
    //   10: aload_1
    //   11: invokevirtual length : ()I
    //   14: istore_3
    //   15: new java/lang/StringBuilder
    //   18: dup
    //   19: iload_3
    //   20: iconst_2
    //   21: imul
    //   22: invokespecial <init> : (I)V
    //   25: astore #4
    //   27: iconst_0
    //   28: istore #5
    //   30: iconst_0
    //   31: istore #6
    //   33: iconst_0
    //   34: istore #7
    //   36: iload #7
    //   38: iload_3
    //   39: if_icmpge -> 140
    //   42: aload_1
    //   43: iload #7
    //   45: invokevirtual charAt : (I)C
    //   48: istore #8
    //   50: iload #7
    //   52: ifgt -> 62
    //   55: iload #8
    //   57: bipush #95
    //   59: if_icmpeq -> 133
    //   62: iload #8
    //   64: invokestatic isUpperCase : (C)Z
    //   67: ifeq -> 119
    //   70: iload #6
    //   72: ifne -> 105
    //   75: iload #5
    //   77: ifle -> 105
    //   80: aload #4
    //   82: iload #5
    //   84: iconst_1
    //   85: isub
    //   86: invokevirtual charAt : (I)C
    //   89: bipush #95
    //   91: if_icmpeq -> 105
    //   94: aload #4
    //   96: bipush #95
    //   98: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: iinc #5, 1
    //   105: iload #8
    //   107: invokestatic toLowerCase : (C)C
    //   110: istore #8
    //   112: iconst_1
    //   113: istore #6
    //   115: iload_2
    //   116: ifne -> 122
    //   119: iconst_0
    //   120: istore #6
    //   122: aload #4
    //   124: iload #8
    //   126: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: iinc #5, 1
    //   133: iinc #7, 1
    //   136: iload_2
    //   137: ifne -> 36
    //   140: iload #5
    //   142: ifle -> 153
    //   145: aload #4
    //   147: invokevirtual toString : ()Ljava/lang/String;
    //   150: goto -> 154
    //   153: aload_1
    //   154: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
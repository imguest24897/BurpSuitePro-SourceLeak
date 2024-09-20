package com.fasterxml.Zh;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zh;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Zv extends Zk implements Zh {
  private static final long serialVersionUID = 1L;
  
  private static final Zr Zr;
  
  private static final Zk[] Zb;
  
  protected final Zk Zg;
  
  protected final Zk[] Zs;
  
  protected final Zr ZB;
  
  volatile transient String Zv;
  
  private static final String a;
  
  protected Zv(Class<?> paramClass, Zr paramZr, Zk paramZk, Zk[] paramArrayOfZk, int paramInt, Object paramObject1, Object paramObject2, boolean paramBoolean) {
    super(paramClass, paramInt, paramObject1, paramObject2, paramBoolean);
    this.ZB = (paramZr == null) ? Zr : paramZr;
    this.Zg = paramZk;
    this.Zs = paramArrayOfZk;
  }
  
  public String Zy() {
    String str = this.Zv;
    if (str == null)
      str = Z_(); 
    return str;
  }
  
  protected String Z_() {
    return this.ZM.getName();
  }
  
  public abstract StringBuilder Zc(StringBuilder paramStringBuilder);
  
  public abstract StringBuilder ZS(StringBuilder paramStringBuilder);
  
  public Zr ZR() {
    return this.ZB;
  }
  
  public int ZJ() {
    return this.ZB.Zf();
  }
  
  public Zk Zt(int paramInt) {
    return this.ZB.ZR(paramInt);
  }
  
  public Zk Zw() {
    return this.Zg;
  }
  
  public List<Zk> ZN() {
    try {
      if (this.Zs == null)
        return Collections.emptyList(); 
    } catch (IllegalStateException illegalStateException) {
      throw b(null);
    } 
    try {
      switch (this.Zs.length) {
        case 0:
          return Collections.emptyList();
        case 1:
          return Collections.singletonList(this.Zs[0]);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw b(null);
    } 
    return Arrays.asList(this.Zs);
  }
  
  public final Zk Zl(Class<?> paramClass) {
    int[] arrayOfInt = Zd.Zs();
    try {
      if (paramClass == this.ZM)
        return this; 
    } catch (IllegalStateException illegalStateException) {
      throw b(null);
    } 
    try {
      if (paramClass.isInterface() && this.Zs != null) {
        byte b = 0;
        int i = this.Zs.length;
        while (b < i) {
          Zk zk = this.Zs[b].Zl(paramClass);
          try {
            if (zk != null)
              return zk; 
          } catch (IllegalStateException illegalStateException) {
            throw b(null);
          } 
          b++;
          if (arrayOfInt != null)
            break; 
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw b(null);
    } 
    if (this.Zg != null) {
      Zk zk = this.Zg.Zl(paramClass);
      try {
        if (zk != null)
          return zk; 
      } catch (IllegalStateException illegalStateException) {
        throw b(null);
      } 
    } 
    return null;
  }
  
  public void Zy(Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = new Zn(this, Zl.VALUE_STRING);
    paramZa.ZA(paramZf, zn);
    Zh(paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
  
  public void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.ZD(Zy());
  }
  
  protected static StringBuilder Zk(Class<?> paramClass, StringBuilder paramStringBuilder, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zs : ()[I
    //   3: astore_3
    //   4: aload_0
    //   5: invokevirtual isPrimitive : ()Z
    //   8: ifeq -> 334
    //   11: aload_0
    //   12: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   15: if_acmpne -> 43
    //   18: goto -> 25
    //   21: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   24: athrow
    //   25: aload_1
    //   26: bipush #90
    //   28: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   31: pop
    //   32: aload_3
    //   33: ifnull -> 416
    //   36: goto -> 43
    //   39: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   42: athrow
    //   43: aload_0
    //   44: getstatic java/lang/Byte.TYPE : Ljava/lang/Class;
    //   47: if_acmpne -> 75
    //   50: goto -> 57
    //   53: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   56: athrow
    //   57: aload_1
    //   58: bipush #66
    //   60: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload_3
    //   65: ifnull -> 416
    //   68: goto -> 75
    //   71: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   74: athrow
    //   75: aload_0
    //   76: getstatic java/lang/Short.TYPE : Ljava/lang/Class;
    //   79: if_acmpne -> 107
    //   82: goto -> 89
    //   85: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   88: athrow
    //   89: aload_1
    //   90: bipush #83
    //   92: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: aload_3
    //   97: ifnull -> 416
    //   100: goto -> 107
    //   103: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   106: athrow
    //   107: aload_0
    //   108: getstatic java/lang/Character.TYPE : Ljava/lang/Class;
    //   111: if_acmpne -> 139
    //   114: goto -> 121
    //   117: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   120: athrow
    //   121: aload_1
    //   122: bipush #67
    //   124: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload_3
    //   129: ifnull -> 416
    //   132: goto -> 139
    //   135: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   138: athrow
    //   139: aload_0
    //   140: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   143: if_acmpne -> 171
    //   146: goto -> 153
    //   149: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   152: athrow
    //   153: aload_1
    //   154: bipush #73
    //   156: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: aload_3
    //   161: ifnull -> 416
    //   164: goto -> 171
    //   167: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   170: athrow
    //   171: aload_0
    //   172: getstatic java/lang/Long.TYPE : Ljava/lang/Class;
    //   175: if_acmpne -> 203
    //   178: goto -> 185
    //   181: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   184: athrow
    //   185: aload_1
    //   186: bipush #74
    //   188: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   191: pop
    //   192: aload_3
    //   193: ifnull -> 416
    //   196: goto -> 203
    //   199: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   202: athrow
    //   203: aload_0
    //   204: getstatic java/lang/Float.TYPE : Ljava/lang/Class;
    //   207: if_acmpne -> 235
    //   210: goto -> 217
    //   213: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   216: athrow
    //   217: aload_1
    //   218: bipush #70
    //   220: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: aload_3
    //   225: ifnull -> 416
    //   228: goto -> 235
    //   231: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   234: athrow
    //   235: aload_0
    //   236: getstatic java/lang/Double.TYPE : Ljava/lang/Class;
    //   239: if_acmpne -> 267
    //   242: goto -> 249
    //   245: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   248: athrow
    //   249: aload_1
    //   250: bipush #68
    //   252: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: aload_3
    //   257: ifnull -> 416
    //   260: goto -> 267
    //   263: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   266: athrow
    //   267: aload_0
    //   268: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   271: if_acmpne -> 299
    //   274: goto -> 281
    //   277: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   280: athrow
    //   281: aload_1
    //   282: bipush #86
    //   284: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   287: pop
    //   288: aload_3
    //   289: ifnull -> 416
    //   292: goto -> 299
    //   295: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   298: athrow
    //   299: new java/lang/IllegalStateException
    //   302: dup
    //   303: new java/lang/StringBuilder
    //   306: dup
    //   307: invokespecial <init> : ()V
    //   310: getstatic com/fasterxml/Zh/Zv.a : Ljava/lang/String;
    //   313: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: aload_0
    //   317: invokevirtual getName : ()Ljava/lang/String;
    //   320: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: invokevirtual toString : ()Ljava/lang/String;
    //   326: invokespecial <init> : (Ljava/lang/String;)V
    //   329: athrow
    //   330: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   333: athrow
    //   334: aload_1
    //   335: bipush #76
    //   337: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   340: pop
    //   341: aload_0
    //   342: invokevirtual getName : ()Ljava/lang/String;
    //   345: astore #4
    //   347: iconst_0
    //   348: istore #5
    //   350: aload #4
    //   352: invokevirtual length : ()I
    //   355: istore #6
    //   357: iload #5
    //   359: iload #6
    //   361: if_icmpge -> 398
    //   364: aload #4
    //   366: iload #5
    //   368: invokevirtual charAt : (I)C
    //   371: istore #7
    //   373: iload #7
    //   375: bipush #46
    //   377: if_icmpne -> 384
    //   380: bipush #47
    //   382: istore #7
    //   384: aload_1
    //   385: iload #7
    //   387: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   390: pop
    //   391: iinc #5, 1
    //   394: aload_3
    //   395: ifnull -> 357
    //   398: iload_2
    //   399: ifeq -> 416
    //   402: aload_1
    //   403: bipush #59
    //   405: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   408: pop
    //   409: goto -> 416
    //   412: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   415: athrow
    //   416: aload_1
    //   417: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	21	java/lang/IllegalStateException
    //   11	36	39	java/lang/IllegalStateException
    //   25	50	53	java/lang/IllegalStateException
    //   43	68	71	java/lang/IllegalStateException
    //   57	82	85	java/lang/IllegalStateException
    //   75	100	103	java/lang/IllegalStateException
    //   89	114	117	java/lang/IllegalStateException
    //   107	132	135	java/lang/IllegalStateException
    //   121	146	149	java/lang/IllegalStateException
    //   139	164	167	java/lang/IllegalStateException
    //   153	178	181	java/lang/IllegalStateException
    //   171	196	199	java/lang/IllegalStateException
    //   185	210	213	java/lang/IllegalStateException
    //   203	228	231	java/lang/IllegalStateException
    //   217	242	245	java/lang/IllegalStateException
    //   235	260	263	java/lang/IllegalStateException
    //   249	274	277	java/lang/IllegalStateException
    //   267	292	295	java/lang/IllegalStateException
    //   281	330	330	java/lang/IllegalStateException
    //   398	409	412	java/lang/IllegalStateException
  }
  
  protected boolean ZA(int paramInt) {
    TypeVariable[] arrayOfTypeVariable = this.ZM.getTypeParameters();
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw b(null);
    } 
    return (arrayOfTypeVariable.length == paramInt);
  }
  
  static {
    // Byte code:
    //   0: bipush #100
    //   2: ldc 'IhtMr`tJUnwxZyQnh^H<'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zh/Zv.a : Ljava/lang/String;
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
    //   80: bipush #120
    //   82: goto -> 112
    //   85: bipush #21
    //   87: goto -> 112
    //   90: bipush #126
    //   92: goto -> 112
    //   95: bipush #117
    //   97: goto -> 112
    //   100: bipush #74
    //   102: goto -> 112
    //   105: bipush #17
    //   107: goto -> 112
    //   110: bipush #22
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
    //   154: invokestatic ZN : ()Lcom/fasterxml/Zh/Zr;
    //   157: putstatic com/fasterxml/Zh/Zv.Zr : Lcom/fasterxml/Zh/Zr;
    //   160: iconst_0
    //   161: anewarray com/fasterxml/Zor/Zk
    //   164: putstatic com/fasterxml/Zh/Zv.Zb : [Lcom/fasterxml/Zor/Zk;
    //   167: return
  }
  
  private static IllegalStateException b(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zh\Zv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
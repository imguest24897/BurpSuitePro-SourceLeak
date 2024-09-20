package com.fasterxml;

import com.fasterxml.Zb.Zv;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class Zq6 implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected static final Zq6 ZU;
  
  protected static final Zq6 Zr;
  
  protected final transient Object Zt;
  
  protected final int Zi;
  
  protected final int Zx;
  
  protected final boolean ZZ;
  
  protected final int ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  @Deprecated
  protected Zq6(boolean paramBoolean, Object paramObject) {
    this(paramBoolean, paramObject, -1, -1, Zv.ZU());
  }
  
  protected Zq6(boolean paramBoolean, Object paramObject, Zv paramZv) {
    this(paramBoolean, paramObject, -1, -1, paramZv);
  }
  
  protected Zq6(boolean paramBoolean, Object paramObject, int paramInt1, int paramInt2, Zv paramZv) {
    this.ZZ = paramBoolean;
    this.Zt = paramObject;
    this.Zi = paramInt1;
    this.Zx = paramInt2;
    this.ZG = paramZv.ZV();
  }
  
  public static Zq6 Zf() {
    return ZU;
  }
  
  public static Zq6 Zx() {
    return Zr;
  }
  
  public static Zq6 ZX(boolean paramBoolean, Object paramObject, int paramInt1, int paramInt2, Zv paramZv) {
    return new Zq6(paramBoolean, paramObject, paramInt1, paramInt2, paramZv);
  }
  
  public static Zq6 Zy(boolean paramBoolean, Object paramObject, Zv paramZv) {
    return new Zq6(paramBoolean, paramObject, paramZv);
  }
  
  public static Zq6 Zj(boolean paramBoolean, Object paramObject) {
    return (paramObject instanceof Zq6) ? (Zq6)paramObject : new Zq6(paramBoolean, paramObject);
  }
  
  public static Zq6 ZP(Object paramObject) {
    return Zj(false, paramObject);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws IOException {}
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) throws IOException {}
  
  protected Object readResolve() {
    return ZU;
  }
  
  public boolean Zv() {
    return this.ZZ;
  }
  
  public Object ZP() {
    return this.Zt;
  }
  
  public int ZA() {
    return this.Zi;
  }
  
  public int ZS() {
    return this.Zx;
  }
  
  protected int Ze() {
    return this.ZG;
  }
  
  public String ZO() {
    return ZY(new StringBuilder(200)).toString();
  }
  
  public StringBuilder ZY(StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: invokestatic Zn : ()I
    //   3: aload_0
    //   4: invokevirtual ZP : ()Ljava/lang/Object;
    //   7: astore_3
    //   8: istore_2
    //   9: aload_3
    //   10: ifnonnull -> 54
    //   13: aload_0
    //   14: getstatic com/fasterxml/Zq6.Zr : Lcom/fasterxml/Zq6;
    //   17: if_acmpne -> 38
    //   20: aload_1
    //   21: sipush #-16223
    //   24: sipush #-27358
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: pop
    //   34: iload_2
    //   35: ifeq -> 52
    //   38: aload_1
    //   39: sipush #-16219
    //   42: sipush #-15668
    //   45: invokestatic a : (II)Ljava/lang/String;
    //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: aload_1
    //   53: areturn
    //   54: aload_3
    //   55: instanceof java/lang/Class
    //   58: ifeq -> 68
    //   61: aload_3
    //   62: checkcast java/lang/Class
    //   65: goto -> 72
    //   68: aload_3
    //   69: invokevirtual getClass : ()Ljava/lang/Class;
    //   72: astore #4
    //   74: aload #4
    //   76: invokevirtual getName : ()Ljava/lang/String;
    //   79: astore #5
    //   81: aload #5
    //   83: sipush #-16210
    //   86: sipush #-21355
    //   89: invokestatic a : (II)Ljava/lang/String;
    //   92: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   95: ifeq -> 109
    //   98: aload #4
    //   100: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   103: astore #5
    //   105: iload_2
    //   106: ifeq -> 149
    //   109: aload_3
    //   110: instanceof [B
    //   113: ifeq -> 131
    //   116: sipush #-16224
    //   119: sipush #29893
    //   122: invokestatic a : (II)Ljava/lang/String;
    //   125: astore #5
    //   127: iload_2
    //   128: ifeq -> 149
    //   131: aload_3
    //   132: instanceof [C
    //   135: ifeq -> 149
    //   138: sipush #-16222
    //   141: sipush #-21420
    //   144: invokestatic a : (II)Ljava/lang/String;
    //   147: astore #5
    //   149: aload_1
    //   150: bipush #40
    //   152: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   155: aload #5
    //   157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: bipush #41
    //   162: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: aload_0
    //   167: invokevirtual Zv : ()Z
    //   170: ifeq -> 364
    //   173: sipush #-16221
    //   176: sipush #4041
    //   179: invokestatic a : (II)Ljava/lang/String;
    //   182: astore #6
    //   184: aload_0
    //   185: invokevirtual Ze : ()I
    //   188: istore #8
    //   190: iconst_2
    //   191: newarray int
    //   193: dup
    //   194: iconst_0
    //   195: aload_0
    //   196: invokevirtual ZA : ()I
    //   199: iastore
    //   200: dup
    //   201: iconst_1
    //   202: aload_0
    //   203: invokevirtual ZS : ()I
    //   206: iastore
    //   207: astore #9
    //   209: aload_3
    //   210: instanceof java/lang/CharSequence
    //   213: ifeq -> 234
    //   216: aload_0
    //   217: aload_3
    //   218: checkcast java/lang/CharSequence
    //   221: aload #9
    //   223: iload #8
    //   225: invokevirtual ZX : (Ljava/lang/CharSequence;[II)Ljava/lang/String;
    //   228: astore #7
    //   230: iload_2
    //   231: ifeq -> 304
    //   234: aload_3
    //   235: instanceof [C
    //   238: ifeq -> 262
    //   241: aload_0
    //   242: aload_3
    //   243: checkcast [C
    //   246: checkcast [C
    //   249: aload #9
    //   251: iload #8
    //   253: invokevirtual ZE : ([C[II)Ljava/lang/String;
    //   256: astore #7
    //   258: iload_2
    //   259: ifeq -> 304
    //   262: aload_3
    //   263: instanceof [B
    //   266: ifeq -> 301
    //   269: aload_0
    //   270: aload_3
    //   271: checkcast [B
    //   274: checkcast [B
    //   277: aload #9
    //   279: iload #8
    //   281: invokevirtual ZU : ([B[II)Ljava/lang/String;
    //   284: astore #7
    //   286: sipush #-16217
    //   289: sipush #-8643
    //   292: invokestatic a : (II)Ljava/lang/String;
    //   295: astore #6
    //   297: iload_2
    //   298: ifeq -> 304
    //   301: aconst_null
    //   302: astore #7
    //   304: aload #7
    //   306: ifnull -> 360
    //   309: aload_0
    //   310: aload_1
    //   311: aload #7
    //   313: invokevirtual Ze : (Ljava/lang/StringBuilder;Ljava/lang/String;)I
    //   316: pop
    //   317: aload #9
    //   319: iconst_1
    //   320: iaload
    //   321: iload #8
    //   323: if_icmple -> 360
    //   326: aload_1
    //   327: sipush #-16220
    //   330: sipush #20701
    //   333: invokestatic a : (II)Ljava/lang/String;
    //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: aload #9
    //   341: iconst_1
    //   342: iaload
    //   343: iload #8
    //   345: isub
    //   346: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   349: aload #6
    //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: bipush #93
    //   356: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   359: pop
    //   360: iload_2
    //   361: ifeq -> 416
    //   364: aload_3
    //   365: instanceof [B
    //   368: ifeq -> 416
    //   371: aload_0
    //   372: invokevirtual ZS : ()I
    //   375: istore #6
    //   377: iload #6
    //   379: ifge -> 392
    //   382: aload_3
    //   383: checkcast [B
    //   386: checkcast [B
    //   389: arraylength
    //   390: istore #6
    //   392: aload_1
    //   393: bipush #91
    //   395: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   398: iload #6
    //   400: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   403: sipush #-16218
    //   406: sipush #-273
    //   409: invokestatic a : (II)Ljava/lang/String;
    //   412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: pop
    //   416: aload_1
    //   417: areturn
  }
  
  protected String ZX(CharSequence paramCharSequence, int[] paramArrayOfint, int paramInt) {
    ZF(paramArrayOfint, paramCharSequence.length());
    int i = paramArrayOfint[0];
    int j = Math.min(paramArrayOfint[1], paramInt);
    return paramCharSequence.subSequence(i, i + j).toString();
  }
  
  protected String ZE(char[] paramArrayOfchar, int[] paramArrayOfint, int paramInt) {
    ZF(paramArrayOfint, paramArrayOfchar.length);
    int i = paramArrayOfint[0];
    int j = Math.min(paramArrayOfint[1], paramInt);
    return new String(paramArrayOfchar, i, j);
  }
  
  protected String ZU(byte[] paramArrayOfbyte, int[] paramArrayOfint, int paramInt) {
    ZF(paramArrayOfint, paramArrayOfbyte.length);
    int i = paramArrayOfint[0];
    int j = Math.min(paramArrayOfint[1], paramInt);
    return new String(paramArrayOfbyte, i, j, StandardCharsets.UTF_8);
  }
  
  protected void ZF(int[] paramArrayOfint, int paramInt) {
    // Byte code:
    //   0: invokestatic Zn : ()I
    //   3: aload_1
    //   4: iconst_0
    //   5: iaload
    //   6: istore #4
    //   8: istore_3
    //   9: iload #4
    //   11: ifge -> 21
    //   14: iconst_0
    //   15: istore #4
    //   17: iload_3
    //   18: ifeq -> 30
    //   21: iload #4
    //   23: iload_2
    //   24: if_icmplt -> 30
    //   27: iload_2
    //   28: istore #4
    //   30: aload_1
    //   31: iconst_0
    //   32: iload #4
    //   34: iastore
    //   35: aload_1
    //   36: iconst_1
    //   37: iaload
    //   38: istore #5
    //   40: iload_2
    //   41: iload #4
    //   43: isub
    //   44: istore #6
    //   46: iload #5
    //   48: iflt -> 58
    //   51: iload #5
    //   53: iload #6
    //   55: if_icmple -> 63
    //   58: aload_1
    //   59: iconst_1
    //   60: iload #6
    //   62: iastore
    //   63: return
  }
  
  protected int Ze(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append('"');
    int i = Zyt.ZD();
    byte b = 0;
    int j = paramString.length();
    while (b < j) {
      char c = paramString.charAt(b);
      if (!Character.isISOControl(c) || !Zn(paramStringBuilder, c))
        paramStringBuilder.append(c); 
      b++;
      if (i == 0)
        break; 
    } 
    paramStringBuilder.append('"');
    return paramString.length();
  }
  
  protected boolean Zn(StringBuilder paramStringBuilder, int paramInt) {
    if (paramInt == 13 || paramInt == 10)
      return false; 
    paramStringBuilder.append('\\');
    paramStringBuilder.append('u');
    paramStringBuilder.append(Zv1.ZB(paramInt >> 12 & 0xF));
    paramStringBuilder.append(Zv1.ZB(paramInt >> 8 & 0xF));
    paramStringBuilder.append(Zv1.ZB(paramInt >> 4 & 0xF));
    paramStringBuilder.append(Zv1.ZB(paramInt & 0xF));
    return true;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (!(paramObject instanceof Zq6))
      return false; 
    Zq6 zq6 = (Zq6)paramObject;
    if (this.Zi != zq6.Zi || this.Zx != zq6.Zx)
      return false; 
    Object object = zq6.Zt;
    return (this.Zt == null) ? ((object == null)) : ((object == null) ? false : ((this.Zt instanceof java.io.File || this.Zt instanceof java.net.URL || this.Zt instanceof java.net.URI) ? this.Zt.equals(object) : ((this.Zt == zq6.Zt))));
  }
  
  public int hashCode() {
    return Objects.hashCode(this.Zt);
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\ta®=¤'âëÞqª¡æ1uíÖ!='æõ-,_êrÔÖ#lLK~\\r`J%'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #55
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'ày\\bæ\\f¤F¾ÌöeNâ/°1Ï"ÿrX±!ür¥ÈF1>¸)¦0É|¦2ZÀÞ/ö¸±½²Nñó¶8è¯Yb2R'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #66
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #96
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic com/fasterxml/Zq6.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zq6.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #73
    //   214: goto -> 244
    //   217: bipush #82
    //   219: goto -> 244
    //   222: bipush #13
    //   224: goto -> 244
    //   227: bipush #67
    //   229: goto -> 244
    //   232: bipush #79
    //   234: goto -> 244
    //   237: bipush #65
    //   239: goto -> 244
    //   242: bipush #44
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: new com/fasterxml/Zq6
    //   303: dup
    //   304: iconst_0
    //   305: aconst_null
    //   306: invokespecial <init> : (ZLjava/lang/Object;)V
    //   309: putstatic com/fasterxml/Zq6.ZU : Lcom/fasterxml/Zq6;
    //   312: new com/fasterxml/Zq6
    //   315: dup
    //   316: iconst_0
    //   317: aconst_null
    //   318: invokespecial <init> : (ZLjava/lang/Object;)V
    //   321: putstatic com/fasterxml/Zq6.Zr : Lcom/fasterxml/Zq6;
    //   324: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC0A6) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 105;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
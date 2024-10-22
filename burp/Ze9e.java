package burp;

import java.util.Objects;

public class Ze9e {
  public static final Ze9e Zo;
  
  public static final Ze9e Zt;
  
  public final String Zl;
  
  public final String Za;
  
  private static Zbqc[] Zi;
  
  public Ze9e(String paramString1, String paramString2) {
    this.Zl = paramString1;
    this.Za = paramString2;
  }
  
  public static Ze9e Zz(String paramString) {
    if (paramString == null || !paramString.contains("§"))
      return null; 
    String[] arrayOfString = paramString.split("§");
    return (arrayOfString.length == 2) ? new Ze9e(arrayOfString[0], arrayOfString[1]) : null;
  }
  
  public String Zl() {
    return this.Zl + "§" + this.Zl;
  }
  
  public String toString() {
    return this.Za;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Ze9e ze9e = (Ze9e)paramObject;
    return (Objects.equals(this.Zl, ze9e.Zl) && Objects.equals(this.Za, ze9e.Za));
  }
  
  public int hashCode() {
    Zbqc[] arrayOfZbqc = Zi();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[3]); 
    return Objects.hash(new Object[] { this.Zl, this.Za });
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: iconst_2
    //   9: anewarray burp/Zbqc
    //   12: ldc 'QrQNwh[B|\\tK'
    //   14: dup
    //   15: astore_3
    //   16: invokevirtual length : ()I
    //   19: istore #5
    //   21: invokestatic Zu : ([Lburp/Zbqc;)V
    //   24: bipush #6
    //   26: istore_2
    //   27: iconst_m1
    //   28: istore_1
    //   29: bipush #70
    //   31: iinc #1, 1
    //   34: aload_3
    //   35: iload_1
    //   36: dup
    //   37: iload_2
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 136
    //   46: aload_0
    //   47: swap
    //   48: iload #4
    //   50: iinc #4, 1
    //   53: swap
    //   54: aastore
    //   55: iload_1
    //   56: iload_2
    //   57: iadd
    //   58: dup
    //   59: istore_1
    //   60: iload #5
    //   62: if_icmpge -> 74
    //   65: aload_3
    //   66: iload_1
    //   67: invokevirtual charAt : (I)C
    //   70: istore_2
    //   71: goto -> 29
    //   74: ldc '+w\\bx,;k'|. #.66)|'
    //   76: dup
    //   77: astore_3
    //   78: invokevirtual length : ()I
    //   81: istore #5
    //   83: bipush #19
    //   85: istore_2
    //   86: iconst_m1
    //   87: istore_1
    //   88: bipush #33
    //   90: iinc #1, 1
    //   93: aload_3
    //   94: iload_1
    //   95: dup
    //   96: iload_2
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 136
    //   105: aload_0
    //   106: swap
    //   107: iload #4
    //   109: iinc #4, 1
    //   112: swap
    //   113: aastore
    //   114: iload_1
    //   115: iload_2
    //   116: iadd
    //   117: dup
    //   118: istore_1
    //   119: iload #5
    //   121: if_icmpge -> 133
    //   124: aload_3
    //   125: iload_1
    //   126: invokevirtual charAt : (I)C
    //   129: istore_2
    //   130: goto -> 88
    //   133: goto -> 292
    //   136: dup_x2
    //   137: pop
    //   138: invokevirtual toCharArray : ()[C
    //   141: dup_x1
    //   142: arraylength
    //   143: dup_x2
    //   144: pop
    //   145: iconst_0
    //   146: istore #6
    //   148: dup2_x1
    //   149: pop2
    //   150: dup_x2
    //   151: iconst_1
    //   152: if_icmpgt -> 252
    //   155: dup2
    //   156: swap
    //   157: iload #6
    //   159: dup2_x1
    //   160: caload
    //   161: swap
    //   162: iload #6
    //   164: bipush #7
    //   166: irem
    //   167: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #68
    //   206: goto -> 236
    //   209: bipush #64
    //   211: goto -> 236
    //   214: bipush #118
    //   216: goto -> 236
    //   219: bipush #106
    //   221: goto -> 236
    //   224: bipush #85
    //   226: goto -> 236
    //   229: bipush #56
    //   231: goto -> 236
    //   234: bipush #99
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 159
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 155
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 46, 0 -> 105
    //   292: new burp/Ze9e
    //   295: dup
    //   296: aload_0
    //   297: iconst_3
    //   298: aaload
    //   299: aload_0
    //   300: iconst_0
    //   301: aaload
    //   302: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   305: putstatic burp/Ze9e.Zo : Lburp/Ze9e;
    //   308: new burp/Ze9e
    //   311: dup
    //   312: aload_0
    //   313: iconst_1
    //   314: aaload
    //   315: aload_0
    //   316: iconst_2
    //   317: aaload
    //   318: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   321: putstatic burp/Ze9e.Zt : Lburp/Ze9e;
    //   324: return
  }
  
  public static void Zu(Zbqc[] paramArrayOfZbqc) {
    Zi = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zi() {
    return Zi;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze9e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
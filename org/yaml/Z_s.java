package org.yaml;

import java.util.Arrays;

public final class Z_s {
  public static final Z_s ZV;
  
  public static final Z_s ZL;
  
  public static final Z_s Zr;
  
  public static final Z_s Zp;
  
  public static final Z_s Zy;
  
  public static final Z_s ZS;
  
  public static final Z_s Zb;
  
  private String ZD;
  
  boolean[] ZT = new boolean[128];
  
  boolean Zc = false;
  
  private static int Zd;
  
  private Z_s(String paramString) {
    Arrays.fill(this.ZT, false);
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < paramString.length(); b++) {
      int i = paramString.codePointAt(b);
      if (i < 128) {
        this.ZT[i] = true;
      } else {
        stringBuilder.appendCodePoint(i);
      } 
    } 
    if (stringBuilder.length() > 0) {
      this.Zc = true;
      this.ZD = stringBuilder.toString();
    } 
  }
  
  public boolean Zj(int paramInt) {
    return (paramInt < 128) ? this.ZT[paramInt] : ((this.Zc && this.ZD.indexOf(paramInt) != -1));
  }
  
  public boolean ZS(int paramInt) {
    return !Zj(paramInt);
  }
  
  public boolean Zd(int paramInt, String paramString) {
    return (Zj(paramInt) || paramString.indexOf(paramInt) != -1);
  }
  
  public boolean Zc(int paramInt, String paramString) {
    return !Zd(paramInt, paramString);
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: bipush #96
    //   8: iconst_0
    //   9: istore #4
    //   11: ldc '\\r?L/Yo6C&Rf-Z9K}$Q09X\h|\\b0S.kzN-'bsE$ \\fyl\?9pe%5\\bcO\%@º†⁃JoQ"Ï‗‡jOU`ê⁴ '
    //   13: dup
    //   14: astore_3
    //   15: invokevirtual length : ()I
    //   18: istore #5
    //   20: bipush #64
    //   22: istore_2
    //   23: iconst_m1
    //   24: istore_1
    //   25: invokestatic Zk : (I)V
    //   28: bipush #28
    //   30: iinc #1, 1
    //   33: aload_3
    //   34: iload_1
    //   35: dup
    //   36: iload_2
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 134
    //   45: aload_0
    //   46: swap
    //   47: iload #4
    //   49: iinc #4, 1
    //   52: swap
    //   53: aastore
    //   54: iload_1
    //   55: iload_2
    //   56: iadd
    //   57: dup
    //   58: istore_1
    //   59: iload #5
    //   61: if_icmpge -> 73
    //   64: aload_3
    //   65: iload_1
    //   66: invokevirtual charAt : (I)C
    //   69: istore_2
    //   70: goto -> 28
    //   73: ldc 's{O´⁻‏V&U6@v/Z?K4C Rd=H) AEqe)J7rcW4>\\f{j\=9`uE& i\\n|<,[~lQUKny?R\\bo{J.S'
    //   75: dup
    //   76: astore_3
    //   77: invokevirtual length : ()I
    //   80: istore #5
    //   82: bipush #6
    //   84: istore_2
    //   85: iconst_m1
    //   86: istore_1
    //   87: iconst_5
    //   88: iinc #1, 1
    //   91: aload_3
    //   92: iload_1
    //   93: dup
    //   94: iload_2
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 134
    //   103: aload_0
    //   104: swap
    //   105: iload #4
    //   107: iinc #4, 1
    //   110: swap
    //   111: aastore
    //   112: iload_1
    //   113: iload_2
    //   114: iadd
    //   115: dup
    //   116: istore_1
    //   117: iload #5
    //   119: if_icmpge -> 131
    //   122: aload_3
    //   123: iload_1
    //   124: invokevirtual charAt : (I)C
    //   127: istore_2
    //   128: goto -> 87
    //   131: goto -> 292
    //   134: dup_x2
    //   135: pop
    //   136: invokevirtual toCharArray : ()[C
    //   139: dup_x1
    //   140: arraylength
    //   141: dup_x2
    //   142: pop
    //   143: iconst_0
    //   144: istore #6
    //   146: dup2_x1
    //   147: pop2
    //   148: dup_x2
    //   149: iconst_1
    //   150: if_icmpgt -> 252
    //   153: dup2
    //   154: swap
    //   155: iload #6
    //   157: dup2_x1
    //   158: caload
    //   159: swap
    //   160: iload #6
    //   162: bipush #7
    //   164: irem
    //   165: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #118
    //   206: goto -> 236
    //   209: bipush #115
    //   211: goto -> 236
    //   214: bipush #64
    //   216: goto -> 236
    //   219: bipush #52
    //   221: goto -> 236
    //   224: bipush #86
    //   226: goto -> 236
    //   229: bipush #35
    //   231: goto -> 236
    //   234: bipush #20
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 157
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 153
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 45, 0 -> 103
    //   292: new org/yaml/Z_s
    //   295: dup
    //   296: aload_0
    //   297: iconst_4
    //   298: aaload
    //   299: invokespecial <init> : (Ljava/lang/String;)V
    //   302: putstatic org/yaml/Z_s.ZV : Lorg/yaml/Z_s;
    //   305: new org/yaml/Z_s
    //   308: dup
    //   309: aload_0
    //   310: iconst_5
    //   311: aaload
    //   312: invokespecial <init> : (Ljava/lang/String;)V
    //   315: putstatic org/yaml/Z_s.ZL : Lorg/yaml/Z_s;
    //   318: new org/yaml/Z_s
    //   321: dup
    //   322: aload_0
    //   323: iconst_2
    //   324: aaload
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic org/yaml/Z_s.Zr : Lorg/yaml/Z_s;
    //   331: new org/yaml/Z_s
    //   334: dup
    //   335: aload_0
    //   336: iconst_1
    //   337: aaload
    //   338: invokespecial <init> : (Ljava/lang/String;)V
    //   341: putstatic org/yaml/Z_s.Zp : Lorg/yaml/Z_s;
    //   344: new org/yaml/Z_s
    //   347: dup
    //   348: aload_0
    //   349: iconst_3
    //   350: aaload
    //   351: invokespecial <init> : (Ljava/lang/String;)V
    //   354: putstatic org/yaml/Z_s.Zy : Lorg/yaml/Z_s;
    //   357: new org/yaml/Z_s
    //   360: dup
    //   361: aload_0
    //   362: bipush #6
    //   364: aaload
    //   365: invokespecial <init> : (Ljava/lang/String;)V
    //   368: putstatic org/yaml/Z_s.ZS : Lorg/yaml/Z_s;
    //   371: new org/yaml/Z_s
    //   374: dup
    //   375: aload_0
    //   376: iconst_0
    //   377: aaload
    //   378: invokespecial <init> : (Ljava/lang/String;)V
    //   381: putstatic org/yaml/Z_s.Zb : Lorg/yaml/Z_s;
    //   384: return
  }
  
  public static void Zk(int paramInt) {
    Zd = paramInt;
  }
  
  public static int ZB() {
    return Zd;
  }
  
  public static int Zp() {
    int i = ZB();
    return (i == 0) ? 43 : 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Z_s.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
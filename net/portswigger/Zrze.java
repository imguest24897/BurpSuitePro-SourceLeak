package net.portswigger;

import java.util.Map;

public class Zrze {
  public final int Zx;
  
  public final int ZI;
  
  public final int Zg;
  
  public final int[] Zd;
  
  public static final Map Zy;
  
  public Zrze(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {
    this.Zx = paramInt1;
    this.ZI = paramInt2;
    this.Zg = paramInt3;
    this.Zd = paramArrayOfint;
  }
  
  public String toString() {
    return Integer.toHexString(this.Zx) + "g" + Integer.toHexString(this.Zx) + "g" + Integer.toHexString(this.ZI) + "g" + Integer.toHexString(this.Zg);
  }
  
  public static Zrze Zi(String paramString) {
    String[] arrayOfString = paramString.split(String.valueOf('g'));
    try {
      if (arrayOfString.length < 3)
        return null; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      int[] arrayOfInt = Zt(arrayOfString);
      return new Zrze(Integer.parseInt(arrayOfString[0], 16), Integer.parseInt(arrayOfString[1], 16), Integer.parseInt(arrayOfString[2], 16), arrayOfInt);
    } catch (NumberFormatException numberFormatException) {
      return null;
    } 
  }
  
  private String ZY() {
    // Byte code:
    //   0: ldc ''
    //   2: astore_2
    //   3: invokestatic ZE : ()I
    //   6: iconst_0
    //   7: istore_3
    //   8: istore_1
    //   9: iload_3
    //   10: aload_0
    //   11: getfield Zd : [I
    //   14: arraylength
    //   15: if_icmpge -> 61
    //   18: aload_0
    //   19: getfield Zd : [I
    //   22: iload_3
    //   23: iaload
    //   24: ifge -> 38
    //   27: aload_2
    //   28: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   33: astore_2
    //   34: iload_1
    //   35: ifne -> 54
    //   38: aload_2
    //   39: aload_0
    //   40: getfield Zd : [I
    //   43: iload_3
    //   44: iaload
    //   45: invokestatic toHexString : (I)Ljava/lang/String;
    //   48: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   53: astore_2
    //   54: iinc #3, 1
    //   57: iload_1
    //   58: ifne -> 9
    //   61: aload_2
    //   62: areturn
  }
  
  private static int[] Zt(String[] paramArrayOfString) {
    // Byte code:
    //   0: invokestatic Zx : ()I
    //   3: aload_0
    //   4: arraylength
    //   5: iconst_3
    //   6: isub
    //   7: newarray int
    //   9: astore_2
    //   10: iconst_0
    //   11: istore_3
    //   12: istore_1
    //   13: iload_3
    //   14: aload_2
    //   15: arraylength
    //   16: if_icmpge -> 74
    //   19: aload_0
    //   20: iload_3
    //   21: iconst_3
    //   22: iadd
    //   23: aaload
    //   24: ldc ''
    //   26: invokevirtual equals : (Ljava/lang/Object;)Z
    //   29: ifeq -> 47
    //   32: aload_2
    //   33: iload_3
    //   34: iconst_m1
    //   35: iastore
    //   36: iload_1
    //   37: ifeq -> 67
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   46: athrow
    //   47: aload_2
    //   48: iload_3
    //   49: aload_0
    //   50: iload_3
    //   51: iconst_3
    //   52: iadd
    //   53: aaload
    //   54: bipush #16
    //   56: invokestatic parseInt : (Ljava/lang/String;I)I
    //   59: iastore
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   66: athrow
    //   67: iinc #3, 1
    //   70: iload_1
    //   71: ifeq -> 13
    //   74: aload_2
    //   75: areturn
    // Exception table:
    //   from	to	target	type
    //   19	40	43	java/lang/NumberFormatException
    //   32	60	63	java/lang/NumberFormatException
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc ''-a&<l\\r\\f<)r!6-l1-l+!p\\t/<w&<n 6-l1-l+!p\\t/<w*\\f;'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #19
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #33
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 70
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: goto -> 215
    //   70: dup_x2
    //   71: pop
    //   72: invokevirtual toCharArray : ()[C
    //   75: dup_x1
    //   76: arraylength
    //   77: dup_x2
    //   78: pop
    //   79: iconst_0
    //   80: istore #6
    //   82: dup2_x1
    //   83: pop2
    //   84: dup_x2
    //   85: iconst_1
    //   86: if_icmpgt -> 188
    //   89: dup2
    //   90: swap
    //   91: iload #6
    //   93: dup2_x1
    //   94: caload
    //   95: swap
    //   96: iload #6
    //   98: bipush #7
    //   100: irem
    //   101: tableswitch default -> 170, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 160, 5 -> 165
    //   140: bipush #122
    //   142: goto -> 172
    //   145: bipush #79
    //   147: goto -> 172
    //   150: bipush #99
    //   152: goto -> 172
    //   155: bipush #73
    //   157: goto -> 172
    //   160: bipush #31
    //   162: goto -> 172
    //   165: bipush #109
    //   167: goto -> 172
    //   170: bipush #123
    //   172: ixor
    //   173: ixor
    //   174: i2c
    //   175: castore
    //   176: iinc #6, 1
    //   179: dup
    //   180: ifne -> 188
    //   183: dup2
    //   184: dup_x1
    //   185: goto -> 93
    //   188: dup2_x1
    //   189: pop2
    //   190: dup_x2
    //   191: iload #6
    //   193: if_icmpgt -> 89
    //   196: pop
    //   197: new java/lang/String
    //   200: dup_x1
    //   201: swap
    //   202: invokespecial <init> : ([C)V
    //   205: invokevirtual intern : ()Ljava/lang/String;
    //   208: swap
    //   209: pop
    //   210: swap
    //   211: pop
    //   212: goto -> 39
    //   215: new java/util/HashMap
    //   218: dup
    //   219: invokespecial <init> : ()V
    //   222: putstatic net/portswigger/Zrze.Zy : Ljava/util/Map;
    //   225: getstatic net/portswigger/Zrze.Zy : Ljava/util/Map;
    //   228: aload_0
    //   229: iconst_0
    //   230: aaload
    //   231: new java/lang/Integer
    //   234: dup
    //   235: ldc 1049344
    //   237: invokespecial <init> : (I)V
    //   240: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   245: pop
    //   246: getstatic net/portswigger/Zrze.Zy : Ljava/util/Map;
    //   249: aload_0
    //   250: iconst_1
    //   251: aaload
    //   252: new java/lang/Integer
    //   255: dup
    //   256: ldc 3146256
    //   258: invokespecial <init> : (I)V
    //   261: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   266: pop
    //   267: getstatic net/portswigger/Zrze.Zy : Ljava/util/Map;
    //   270: aload_0
    //   271: iconst_2
    //   272: aaload
    //   273: new java/lang/Integer
    //   276: dup
    //   277: ldc 3146240
    //   279: invokespecial <init> : (I)V
    //   282: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   287: pop
    //   288: return
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrze.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
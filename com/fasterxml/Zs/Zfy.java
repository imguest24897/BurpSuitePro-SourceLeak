package com.fasterxml.Zs;

import com.fasterxml.Zor.Zyo;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

public class Zfy {
  private static final HashSet<String> ZZ;
  
  private static final String a;
  
  public static Zyo<?> Zn(Class<?> paramClass, String paramString) {
    try {
      if (paramClass.isPrimitive()) {
        try {
          if (paramClass == int.class)
            return Zfo.Zo; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == boolean.class)
            return Zfs.ZX; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == long.class)
            return Zf8.ZI; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == double.class)
            return Zf_.Ze; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == char.class)
            return Zfe.Zp; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == byte.class)
            return Zft.Zk; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == short.class)
            return Zf1.Zu; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == float.class)
            return Zfj.ZQ; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == void.class)
            return Zu8.Za; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        try {
          if (ZZ.contains(paramString)) {
            try {
              if (paramClass == Integer.class)
                return Zfo.Zx; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (paramClass == Boolean.class)
                return Zfs.Zc; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (paramClass == Long.class)
                return Zf8.Zq; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (paramClass == Double.class)
                return Zf_.ZN; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (paramClass == Character.class)
                return Zfe.Zv; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (paramClass == Byte.class)
                return Zft.ZK; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (paramClass == Short.class)
                return Zf1.ZE; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (paramClass == Float.class)
                return Zfj.Ze; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (paramClass == Number.class)
                return Zu3.Zy; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (paramClass == BigDecimal.class)
                return Zuh.ZN; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (paramClass == BigInteger.class)
                return Zuk.Zc; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } else {
            return null;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(a + paramClass.getName());
  }
  
  static {
    // Byte code:
    //   0: bipush #55
    //   2: ldc '&|?o&[Im(o'HUIk;soNOa4yh^\\nm(t)Vm(=.UI'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zs/Zfy.a : Ljava/lang/String;
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
    //   80: bipush #88
    //   82: goto -> 112
    //   85: bipush #94
    //   87: goto -> 112
    //   90: bipush #63
    //   92: goto -> 112
    //   95: bipush #109
    //   97: goto -> 112
    //   100: bipush #42
    //   102: goto -> 112
    //   105: bipush #127
    //   107: goto -> 112
    //   110: bipush #13
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
    //   154: new java/util/HashSet
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic com/fasterxml/Zs/Zfy.ZZ : Ljava/util/HashSet;
    //   164: bipush #11
    //   166: anewarray java/lang/Class
    //   169: dup
    //   170: iconst_0
    //   171: ldc java/lang/Boolean
    //   173: aastore
    //   174: dup
    //   175: iconst_1
    //   176: ldc java/lang/Byte
    //   178: aastore
    //   179: dup
    //   180: iconst_2
    //   181: ldc java/lang/Short
    //   183: aastore
    //   184: dup
    //   185: iconst_3
    //   186: ldc java/lang/Character
    //   188: aastore
    //   189: dup
    //   190: iconst_4
    //   191: ldc java/lang/Integer
    //   193: aastore
    //   194: dup
    //   195: iconst_5
    //   196: ldc java/lang/Long
    //   198: aastore
    //   199: dup
    //   200: bipush #6
    //   202: ldc java/lang/Float
    //   204: aastore
    //   205: dup
    //   206: bipush #7
    //   208: ldc java/lang/Double
    //   210: aastore
    //   211: dup
    //   212: bipush #8
    //   214: ldc java/lang/Number
    //   216: aastore
    //   217: dup
    //   218: bipush #9
    //   220: ldc java/math/BigDecimal
    //   222: aastore
    //   223: dup
    //   224: bipush #10
    //   226: ldc java/math/BigInteger
    //   228: aastore
    //   229: astore_1
    //   230: aload_1
    //   231: astore_2
    //   232: aload_2
    //   233: arraylength
    //   234: istore_3
    //   235: iconst_0
    //   236: istore #4
    //   238: iload #4
    //   240: iload_3
    //   241: if_icmpge -> 268
    //   244: aload_2
    //   245: iload #4
    //   247: aaload
    //   248: astore #5
    //   250: getstatic com/fasterxml/Zs/Zfy.ZZ : Ljava/util/HashSet;
    //   253: aload #5
    //   255: invokevirtual getName : ()Ljava/lang/String;
    //   258: invokevirtual add : (Ljava/lang/Object;)Z
    //   261: pop
    //   262: iinc #4, 1
    //   265: goto -> 238
    //   268: return
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zfy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
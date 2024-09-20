package com.fasterxml.Zo;

import com.fasterxml.Zor.Zk;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Zzf {
  static final HashMap<String, Class<? extends Collection>> Zi;
  
  static final HashMap<String, Class<? extends Map>> Zb;
  
  public static Class<?> Zy(Zk paramZk) {
    return Zi.get(paramZk.Zf().getName());
  }
  
  public static Class<?> Zs(Zk paramZk) {
    return Zb.get(paramZk.Zf().getName());
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc ',$FF!AVBG#\\f W~S\\t,$FF!AVBG#\\f Wp]!\\n&GZ],$FF!AVBG#\\f W`W\\r'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #22
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: iconst_2
    //   23: iinc #1, 1
    //   26: aload_3
    //   27: iload_1
    //   28: dup
    //   29: iload_2
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 69
    //   38: aload_0
    //   39: swap
    //   40: iload #4
    //   42: iinc #4, 1
    //   45: swap
    //   46: aastore
    //   47: iload_1
    //   48: iload_2
    //   49: iadd
    //   50: dup
    //   51: istore_1
    //   52: iload #5
    //   54: if_icmpge -> 66
    //   57: aload_3
    //   58: iload_1
    //   59: invokevirtual charAt : (I)C
    //   62: istore_2
    //   63: goto -> 22
    //   66: goto -> 215
    //   69: dup_x2
    //   70: pop
    //   71: invokevirtual toCharArray : ()[C
    //   74: dup_x1
    //   75: arraylength
    //   76: dup_x2
    //   77: pop
    //   78: iconst_0
    //   79: istore #6
    //   81: dup2_x1
    //   82: pop2
    //   83: dup_x2
    //   84: iconst_1
    //   85: if_icmpgt -> 188
    //   88: dup2
    //   89: swap
    //   90: iload #6
    //   92: dup2_x1
    //   93: caload
    //   94: swap
    //   95: iload #6
    //   97: bipush #7
    //   99: irem
    //   100: tableswitch default -> 170, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 160, 5 -> 165
    //   140: bipush #123
    //   142: goto -> 172
    //   145: bipush #79
    //   147: goto -> 172
    //   150: bipush #109
    //   152: goto -> 172
    //   155: bipush #71
    //   157: goto -> 172
    //   160: bipush #49
    //   162: goto -> 172
    //   165: bipush #49
    //   167: goto -> 172
    //   170: bipush #48
    //   172: ixor
    //   173: ixor
    //   174: i2c
    //   175: castore
    //   176: iinc #6, 1
    //   179: dup
    //   180: ifne -> 188
    //   183: dup2
    //   184: dup_x1
    //   185: goto -> 92
    //   188: dup2_x1
    //   189: pop2
    //   190: dup_x2
    //   191: iload #6
    //   193: if_icmpgt -> 88
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
    //   212: goto -> 38
    //   215: new java/util/HashMap
    //   218: dup
    //   219: invokespecial <init> : ()V
    //   222: astore #7
    //   224: ldc java/util/ArrayList
    //   226: astore #8
    //   228: ldc java/util/HashSet
    //   230: astore #9
    //   232: aload #7
    //   234: ldc java/util/Collection
    //   236: invokevirtual getName : ()Ljava/lang/String;
    //   239: aload #8
    //   241: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   244: pop
    //   245: aload #7
    //   247: ldc java/util/List
    //   249: invokevirtual getName : ()Ljava/lang/String;
    //   252: aload #8
    //   254: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   257: pop
    //   258: aload #7
    //   260: ldc java/util/Set
    //   262: invokevirtual getName : ()Ljava/lang/String;
    //   265: aload #9
    //   267: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   270: pop
    //   271: aload #7
    //   273: ldc java/util/SortedSet
    //   275: invokevirtual getName : ()Ljava/lang/String;
    //   278: ldc java/util/TreeSet
    //   280: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   283: pop
    //   284: aload #7
    //   286: ldc java/util/Queue
    //   288: invokevirtual getName : ()Ljava/lang/String;
    //   291: ldc java/util/LinkedList
    //   293: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   296: pop
    //   297: aload #7
    //   299: ldc java/util/AbstractList
    //   301: invokevirtual getName : ()Ljava/lang/String;
    //   304: aload #8
    //   306: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   309: pop
    //   310: aload #7
    //   312: ldc java/util/AbstractSet
    //   314: invokevirtual getName : ()Ljava/lang/String;
    //   317: aload #9
    //   319: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   322: pop
    //   323: aload #7
    //   325: ldc java/util/Deque
    //   327: invokevirtual getName : ()Ljava/lang/String;
    //   330: ldc java/util/LinkedList
    //   332: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   335: pop
    //   336: aload #7
    //   338: ldc java/util/NavigableSet
    //   340: invokevirtual getName : ()Ljava/lang/String;
    //   343: ldc java/util/TreeSet
    //   345: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   348: pop
    //   349: aload #7
    //   351: aload_0
    //   352: iconst_1
    //   353: aaload
    //   354: aload #8
    //   356: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   359: pop
    //   360: aload #7
    //   362: aload_0
    //   363: iconst_2
    //   364: aaload
    //   365: ldc java/util/LinkedHashSet
    //   367: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   370: pop
    //   371: aload #7
    //   373: putstatic com/fasterxml/Zo/Zzf.Zi : Ljava/util/HashMap;
    //   376: new java/util/HashMap
    //   379: dup
    //   380: invokespecial <init> : ()V
    //   383: astore #7
    //   385: ldc java/util/LinkedHashMap
    //   387: astore #8
    //   389: aload #7
    //   391: ldc java/util/Map
    //   393: invokevirtual getName : ()Ljava/lang/String;
    //   396: aload #8
    //   398: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   401: pop
    //   402: aload #7
    //   404: ldc java/util/AbstractMap
    //   406: invokevirtual getName : ()Ljava/lang/String;
    //   409: aload #8
    //   411: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   414: pop
    //   415: aload #7
    //   417: ldc java/util/concurrent/ConcurrentMap
    //   419: invokevirtual getName : ()Ljava/lang/String;
    //   422: ldc java/util/concurrent/ConcurrentHashMap
    //   424: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   427: pop
    //   428: aload #7
    //   430: ldc java/util/SortedMap
    //   432: invokevirtual getName : ()Ljava/lang/String;
    //   435: ldc java/util/TreeMap
    //   437: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   440: pop
    //   441: aload #7
    //   443: ldc java/util/NavigableMap
    //   445: invokevirtual getName : ()Ljava/lang/String;
    //   448: ldc java/util/TreeMap
    //   450: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   453: pop
    //   454: aload #7
    //   456: ldc java/util/concurrent/ConcurrentNavigableMap
    //   458: invokevirtual getName : ()Ljava/lang/String;
    //   461: ldc java/util/concurrent/ConcurrentSkipListMap
    //   463: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   466: pop
    //   467: aload #7
    //   469: aload_0
    //   470: iconst_0
    //   471: aaload
    //   472: ldc java/util/LinkedHashMap
    //   474: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   477: pop
    //   478: aload #7
    //   480: putstatic com/fasterxml/Zo/Zzf.Zb : Ljava/util/HashMap;
    //   483: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo\Zzf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
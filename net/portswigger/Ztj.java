package net.portswigger;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class Ztj {
  private final Consumer<Throwable> ZJ;
  
  private final Set<Zm1> ZC;
  
  private final Map<String, Zm1> ZT;
  
  private final Map<Type, Zm1> ZO;
  
  public final Map<Type, Zcy> Zx;
  
  private static int Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Ztj(Consumer<Throwable> paramConsumer, TreeSet<Zm1> paramTreeSet, Map<String, Zm1> paramMap, Map<Type, Zm1> paramMap1, Map<Type, Zcy> paramMap2) {
    this.ZJ = paramConsumer;
    this.ZC = Collections.unmodifiableSortedSet(paramTreeSet);
    this.ZT = Collections.unmodifiableMap(paramMap);
    this.ZO = Collections.unmodifiableMap(paramMap1);
    this.Zx = paramMap2;
  }
  
  public static Ztj Ze(Type... paramVarArgs) {
    return Zu((new Zix(Zby.ZI)).Zs(false), paramVarArgs).ZN();
  }
  
  public static Ztj ZI(Type... paramVarArgs) {
    return Zu((new Zix(Zby.ZI)).Zs(false).ZX(true), paramVarArgs).ZN();
  }
  
  public static Zix Zu(Zix paramZix, Type... paramVarArgs) {
    return Zt(paramZix, Collections.emptySet(), paramVarArgs);
  }
  
  public static Zix Zt(Zix paramZix, Set<Type> paramSet, Type... paramVarArgs) {
    Zas zas = new Zas();
    for (Type type : paramVarArgs) {
      try {
        if (paramSet.contains(type)) {
          zas.ZR((Function)Zqg.Zw(Zla.TYPE), type, a(30617, -19779), new Object[] { paramSet });
        } else {
          try {
            if (!Zt7.Zb(type))
              try {
                if (!Zt7.Zf(type))
                  try {
                    if (!paramZix.ZC(type))
                      try {
                        if (!paramZix.ZF(type))
                          try {
                            if (type instanceof Class) {
                              Class<?> clazz = (Class)type;
                              Zm1 zm1 = ZA(clazz, paramZix.ZA, paramZix.Zf);
                              try {
                                if (zm1 != null) {
                                  zm1.Zu(new Ztc(paramZix, type, paramSet, clazz));
                                } else {
                                  Zcy zcy = new Zcy(type, paramZix.ZA);
                                  if (!zcy.Zi.isEmpty()) {
                                    paramZix.ZK(zcy);
                                    for (Zo3 zo3 : zcy.Zi.values()) {
                                      try {
                                        if (!void.class.equals(zo3.Zg))
                                          try {
                                            if (!Zht.class.equals(zo3.Zg))
                                              try {
                                                if (!Zc1.class.equals(zo3.Zg))
                                                  Zu(paramZix, new Type[] { Za5.Ze(zo3.Zg) }); 
                                              } catch (Zk6 zk6) {
                                                throw a(null);
                                              }  
                                          } catch (Zk6 zk6) {
                                            throw a(null);
                                          }  
                                      } catch (Zk6 zk6) {
                                        throw a(null);
                                      } 
                                      try {
                                        if (zo3.ZY.ZZ != null)
                                          Zu(paramZix, new Type[] { Za5.Ze(zo3.ZY.ZZ.Zq) }); 
                                      } catch (Zk6 zk6) {
                                        throw a(null);
                                      } 
                                      for (Zm7 zm7 : zo3.ZY) {
                                        Zu(paramZix, new Type[] { Za5.Ze(zm7.Zq) });
                                      } 
                                    } 
                                  } else {
                                    zas.ZR((Function)Zqg.Zw(Zla.TYPE), type, a(30621, -32004), new Object[0]);
                                  } 
                                } 
                              } catch (Zk6 zk6) {
                                throw a(null);
                              } 
                            } 
                          } catch (Zk6 zk6) {
                            throw a(null);
                          }  
                      } catch (Zk6 zk6) {
                        throw a(null);
                      }  
                  } catch (Zk6 zk6) {
                    throw a(null);
                  }  
              } catch (Zk6 zk6) {
                throw a(null);
              }  
          } catch (Zk6 zk6) {
            throw a(null);
          } 
        } 
      } catch (Zk6 zk6) {
        throw a(null);
      } 
    } 
    zas.Zz();
    return paramZix;
  }
  
  private static Zm1 ZA(Class<?> paramClass, boolean paramBoolean1, boolean paramBoolean2) {
    try {
      if (Zkr.Za(paramClass))
        try {
          if (!paramClass.isInterface()) {
            try {
              if (Modifier.isAbstract(paramClass.getModifiers()))
                return new Zkr(paramClass); 
            } catch (Zk6 zk6) {
              throw a(null);
            } 
          } else {
            return new Zkr(paramClass);
          } 
        } catch (Zk6 zk6) {
          throw a(null);
        }  
    } catch (Zk6 zk6) {
      throw a(null);
    } 
    try {
      if (Zrmx.Ze(paramClass))
        return new Zrmx(paramClass, paramBoolean1, paramBoolean2); 
    } catch (Zk6 zk6) {
      throw a(null);
    } 
    return null;
  }
  
  public Zm1 Zk(Type paramType) {
    Zm1 zm1 = this.ZO.get(paramType);
    try {
      if (zm1 == null)
        throw new Zk6(paramType.toString()); 
    } catch (Zk6 zk6) {
      throw a(null);
    } 
    return zm1;
  }
  
  public Optional<Zm1> Za(Type paramType) {
    return Optional.ofNullable(this.ZO.get(paramType));
  }
  
  public Zcy ZM(Type paramType) {
    Zcy zcy = this.Zx.get(paramType);
    try {
      if (zcy == null)
        throw new Zgb(paramType.toString()); 
    } catch (Zk6 zk6) {
      throw a(null);
    } 
    return zcy;
  }
  
  public Zm1 ZO(String paramString) {
    Zm1 zm1 = this.ZT.get(paramString);
    try {
      if (zm1 == null)
        throw new Zk6(paramString); 
    } catch (Zk6 zk6) {
      throw a(null);
    } 
    return zm1;
  }
  
  public boolean ZW(Type paramType) {
    return this.ZO.containsKey(paramType);
  }
  
  public boolean ZB(Type paramType) {
    return this.Zx.containsKey(paramType);
  }
  
  public boolean Zz(String paramString) {
    return this.ZT.containsKey(paramString);
  }
  
  public void ZI(Zak paramZak) {
    Iterator<Zm1> iterator = this.ZC.iterator();
    int i = Zn();
    while (iterator.hasNext()) {
      Zm1 zm1 = iterator.next();
      zm1.Zu(paramZak);
      if (i == 0)
        break; 
    } 
  }
  
  public String ZQ(Object paramObject) {
    return Zv(paramObject, 0);
  }
  
  public String Zz(Type paramType, Object paramObject) {
    return Zk(paramType, paramObject, null).toString();
  }
  
  public String Zv(Object paramObject, int paramInt) {
    return Zk(null, paramObject, null).Zo().ZM(paramInt).toString();
  }
  
  public Zrmq Zk(Type paramType1, Object paramObject, Type paramType2) {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: istore #4
    //   5: aload_2
    //   6: ifnonnull -> 22
    //   9: invokestatic ZE : ()Lnet/portswigger/Zmp;
    //   12: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   17: areturn
    //   18: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   21: athrow
    //   22: aload_2
    //   23: invokevirtual getClass : ()Ljava/lang/Class;
    //   26: astore #5
    //   28: aload_1
    //   29: ifnull -> 40
    //   32: aload_1
    //   33: goto -> 42
    //   36: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   39: athrow
    //   40: aload #5
    //   42: astore #6
    //   44: aload #5
    //   46: ldc java/lang/Boolean
    //   48: invokevirtual equals : (Ljava/lang/Object;)Z
    //   51: ifne -> 72
    //   54: aload #5
    //   56: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   59: invokevirtual equals : (Ljava/lang/Object;)Z
    //   62: ifeq -> 92
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   71: athrow
    //   72: aload_2
    //   73: checkcast java/lang/Boolean
    //   76: invokevirtual booleanValue : ()Z
    //   79: invokestatic ZK : (Z)Lnet/portswigger/Zkw;
    //   82: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   87: areturn
    //   88: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   91: athrow
    //   92: aload #5
    //   94: ldc java/lang/Byte
    //   96: invokevirtual equals : (Ljava/lang/Object;)Z
    //   99: ifne -> 120
    //   102: aload #5
    //   104: getstatic java/lang/Byte.TYPE : Ljava/lang/Class;
    //   107: invokevirtual equals : (Ljava/lang/Object;)Z
    //   110: ifeq -> 140
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   119: athrow
    //   120: aload_2
    //   121: checkcast java/lang/Byte
    //   124: invokevirtual byteValue : ()B
    //   127: invokestatic Zr : (B)Lnet/portswigger/Zzo;
    //   130: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   135: areturn
    //   136: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   139: athrow
    //   140: aload #5
    //   142: ldc java/lang/Short
    //   144: invokevirtual equals : (Ljava/lang/Object;)Z
    //   147: ifne -> 168
    //   150: aload #5
    //   152: getstatic java/lang/Short.TYPE : Ljava/lang/Class;
    //   155: invokevirtual equals : (Ljava/lang/Object;)Z
    //   158: ifeq -> 188
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   167: athrow
    //   168: aload_2
    //   169: checkcast java/lang/Short
    //   172: invokevirtual shortValue : ()S
    //   175: invokestatic Zn : (S)Lnet/portswigger/Zzo;
    //   178: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   183: areturn
    //   184: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   187: athrow
    //   188: aload #5
    //   190: ldc java/lang/Integer
    //   192: invokevirtual equals : (Ljava/lang/Object;)Z
    //   195: ifne -> 216
    //   198: aload #5
    //   200: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   203: invokevirtual equals : (Ljava/lang/Object;)Z
    //   206: ifeq -> 236
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   215: athrow
    //   216: aload_2
    //   217: checkcast java/lang/Integer
    //   220: invokevirtual intValue : ()I
    //   223: invokestatic Za : (I)Lnet/portswigger/Zzo;
    //   226: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   231: areturn
    //   232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   235: athrow
    //   236: aload #5
    //   238: ldc java/lang/Long
    //   240: invokevirtual equals : (Ljava/lang/Object;)Z
    //   243: ifne -> 264
    //   246: aload #5
    //   248: getstatic java/lang/Long.TYPE : Ljava/lang/Class;
    //   251: invokevirtual equals : (Ljava/lang/Object;)Z
    //   254: ifeq -> 287
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   263: athrow
    //   264: aload_2
    //   265: checkcast java/lang/Long
    //   268: invokevirtual longValue : ()J
    //   271: invokestatic toString : (J)Ljava/lang/String;
    //   274: invokestatic ZN : (Ljava/lang/String;)Lnet/portswigger/Zhq;
    //   277: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   282: areturn
    //   283: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   286: athrow
    //   287: aload #5
    //   289: ldc java/lang/Float
    //   291: invokevirtual equals : (Ljava/lang/Object;)Z
    //   294: ifne -> 315
    //   297: aload #5
    //   299: getstatic java/lang/Float.TYPE : Ljava/lang/Class;
    //   302: invokevirtual equals : (Ljava/lang/Object;)Z
    //   305: ifeq -> 335
    //   308: goto -> 315
    //   311: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   314: athrow
    //   315: aload_2
    //   316: checkcast java/lang/Float
    //   319: invokevirtual floatValue : ()F
    //   322: invokestatic ZB : (F)Lnet/portswigger/Zzo;
    //   325: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   330: areturn
    //   331: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   334: athrow
    //   335: aload #5
    //   337: ldc java/lang/Double
    //   339: invokevirtual equals : (Ljava/lang/Object;)Z
    //   342: ifne -> 363
    //   345: aload #5
    //   347: getstatic java/lang/Double.TYPE : Ljava/lang/Class;
    //   350: invokevirtual equals : (Ljava/lang/Object;)Z
    //   353: ifeq -> 383
    //   356: goto -> 363
    //   359: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   362: athrow
    //   363: aload_2
    //   364: checkcast java/lang/Double
    //   367: invokevirtual doubleValue : ()D
    //   370: invokestatic Zb : (D)Lnet/portswigger/Zzo;
    //   373: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   378: areturn
    //   379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   382: athrow
    //   383: aload #5
    //   385: ldc java/lang/Character
    //   387: invokevirtual equals : (Ljava/lang/Object;)Z
    //   390: ifne -> 411
    //   393: aload #5
    //   395: getstatic java/lang/Character.TYPE : Ljava/lang/Class;
    //   398: invokevirtual equals : (Ljava/lang/Object;)Z
    //   401: ifeq -> 436
    //   404: goto -> 411
    //   407: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   410: athrow
    //   411: aload_2
    //   412: checkcast java/lang/Character
    //   415: invokevirtual charValue : ()C
    //   418: <illegal opcode> makeConcatWithConstants : (C)Ljava/lang/String;
    //   423: invokestatic ZN : (Ljava/lang/String;)Lnet/portswigger/Zhq;
    //   426: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   431: areturn
    //   432: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   435: athrow
    //   436: aload #5
    //   438: ldc java/lang/String
    //   440: invokevirtual equals : (Ljava/lang/Object;)Z
    //   443: ifeq -> 463
    //   446: aload_2
    //   447: checkcast java/lang/String
    //   450: invokestatic ZN : (Ljava/lang/String;)Lnet/portswigger/Zhq;
    //   453: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   458: areturn
    //   459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   462: athrow
    //   463: aload_2
    //   464: instanceof net/portswigger/Zij
    //   467: ifeq -> 487
    //   470: aload_2
    //   471: checkcast net/portswigger/Zij
    //   474: invokestatic Zf : (Lnet/portswigger/Zij;)Lnet/portswigger/Zhq;
    //   477: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   482: areturn
    //   483: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   486: athrow
    //   487: ldc net/portswigger/Zi7
    //   489: aload #5
    //   491: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   494: ifeq -> 506
    //   497: aload_2
    //   498: checkcast net/portswigger/Zrmq
    //   501: areturn
    //   502: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   505: athrow
    //   506: aload #6
    //   508: instanceof java/lang/Class
    //   511: ifeq -> 655
    //   514: aload #6
    //   516: checkcast java/lang/Class
    //   519: invokevirtual isArray : ()Z
    //   522: ifeq -> 655
    //   525: goto -> 532
    //   528: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   531: athrow
    //   532: aload #5
    //   534: invokevirtual getComponentType : ()Ljava/lang/Class;
    //   537: astore #7
    //   539: getstatic java/lang/Byte.TYPE : Ljava/lang/Class;
    //   542: aload #7
    //   544: invokevirtual equals : (Ljava/lang/Object;)Z
    //   547: ifeq -> 570
    //   550: aload_2
    //   551: checkcast [B
    //   554: invokestatic Za : ([B)Lnet/portswigger/Zij;
    //   557: invokestatic Zf : (Lnet/portswigger/Zij;)Lnet/portswigger/Zhq;
    //   560: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   565: areturn
    //   566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   569: athrow
    //   570: invokestatic ZG : ()Lnet/portswigger/Zfb;
    //   573: astore #8
    //   575: iconst_0
    //   576: istore #9
    //   578: iload #9
    //   580: aload_2
    //   581: invokestatic getLength : (Ljava/lang/Object;)I
    //   584: if_icmpge -> 647
    //   587: aload_2
    //   588: iload #9
    //   590: invokestatic get : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   593: astore #10
    //   595: aload #10
    //   597: ifnonnull -> 605
    //   600: iload #4
    //   602: ifeq -> 639
    //   605: aload #8
    //   607: aload_0
    //   608: aload #7
    //   610: aload #10
    //   612: aload #7
    //   614: invokestatic ZD : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    //   617: invokevirtual Zk : (Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/reflect/Type;)Lnet/portswigger/Zrmq;
    //   620: invokeinterface Zh : (Lnet/portswigger/Zd4;)Lnet/portswigger/Zrmq;
    //   625: pop
    //   626: goto -> 639
    //   629: astore #10
    //   631: aload #10
    //   633: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   636: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   639: iinc #9, 1
    //   642: iload #4
    //   644: ifeq -> 578
    //   647: aload #8
    //   649: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   654: areturn
    //   655: aload #6
    //   657: instanceof java/lang/reflect/GenericArrayType
    //   660: ifeq -> 765
    //   663: aload #6
    //   665: checkcast java/lang/reflect/GenericArrayType
    //   668: invokeinterface getGenericComponentType : ()Ljava/lang/reflect/Type;
    //   673: astore #7
    //   675: invokestatic ZG : ()Lnet/portswigger/Zfb;
    //   678: astore #8
    //   680: aload_2
    //   681: invokestatic getLength : (Ljava/lang/Object;)I
    //   684: istore #9
    //   686: iconst_0
    //   687: istore #10
    //   689: iload #10
    //   691: iload #9
    //   693: if_icmpge -> 757
    //   696: aload_2
    //   697: iload #10
    //   699: invokestatic get : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   702: astore #11
    //   704: aload #11
    //   706: ifnonnull -> 721
    //   709: iload #4
    //   711: ifeq -> 749
    //   714: goto -> 721
    //   717: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   720: athrow
    //   721: aload #8
    //   723: aload_0
    //   724: aload #7
    //   726: aload #11
    //   728: aload #7
    //   730: invokestatic ZD : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    //   733: invokevirtual Zk : (Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/reflect/Type;)Lnet/portswigger/Zrmq;
    //   736: invokeinterface Zh : (Lnet/portswigger/Zd4;)Lnet/portswigger/Zrmq;
    //   741: pop
    //   742: goto -> 749
    //   745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   748: athrow
    //   749: iinc #10, 1
    //   752: iload #4
    //   754: ifeq -> 689
    //   757: aload #8
    //   759: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   764: areturn
    //   765: aload_2
    //   766: instanceof java/util/List
    //   769: ifeq -> 888
    //   772: aload_3
    //   773: ifnonnull -> 804
    //   776: goto -> 783
    //   779: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   782: athrow
    //   783: new java/lang/UnsupportedOperationException
    //   786: dup
    //   787: sipush #30612
    //   790: sipush #-8301
    //   793: invokestatic a : (II)Ljava/lang/String;
    //   796: invokespecial <init> : (Ljava/lang/String;)V
    //   799: athrow
    //   800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   803: athrow
    //   804: invokestatic ZG : ()Lnet/portswigger/Zfb;
    //   807: astore #7
    //   809: aload_2
    //   810: checkcast java/util/List
    //   813: invokeinterface iterator : ()Ljava/util/Iterator;
    //   818: astore #8
    //   820: aload #8
    //   822: invokeinterface hasNext : ()Z
    //   827: ifeq -> 880
    //   830: aload #8
    //   832: invokeinterface next : ()Ljava/lang/Object;
    //   837: astore #9
    //   839: aload #9
    //   841: ifnonnull -> 856
    //   844: iload #4
    //   846: ifeq -> 820
    //   849: goto -> 856
    //   852: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   855: athrow
    //   856: aload #7
    //   858: aload_0
    //   859: aload_3
    //   860: aload #9
    //   862: aload_3
    //   863: invokestatic ZD : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    //   866: invokevirtual Zk : (Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/reflect/Type;)Lnet/portswigger/Zrmq;
    //   869: invokeinterface Zh : (Lnet/portswigger/Zd4;)Lnet/portswigger/Zrmq;
    //   874: pop
    //   875: iload #4
    //   877: ifeq -> 820
    //   880: aload #7
    //   882: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   887: areturn
    //   888: aload_2
    //   889: instanceof java/util/Map
    //   892: ifeq -> 1070
    //   895: aload_3
    //   896: ifnonnull -> 927
    //   899: goto -> 906
    //   902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   905: athrow
    //   906: new java/lang/UnsupportedOperationException
    //   909: dup
    //   910: sipush #30623
    //   913: sipush #11646
    //   916: invokestatic a : (II)Ljava/lang/String;
    //   919: invokespecial <init> : (Ljava/lang/String;)V
    //   922: athrow
    //   923: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   926: athrow
    //   927: invokestatic ZU : ()Lnet/portswigger/Zi7;
    //   930: astore #7
    //   932: aload_2
    //   933: checkcast java/util/Map
    //   936: astore #8
    //   938: aload #8
    //   940: invokeinterface entrySet : ()Ljava/util/Set;
    //   945: invokeinterface iterator : ()Ljava/util/Iterator;
    //   950: astore #9
    //   952: aload #9
    //   954: invokeinterface hasNext : ()Z
    //   959: ifeq -> 1032
    //   962: aload #9
    //   964: invokeinterface next : ()Ljava/lang/Object;
    //   969: checkcast java/util/Map$Entry
    //   972: astore #10
    //   974: aload #10
    //   976: invokeinterface getValue : ()Ljava/lang/Object;
    //   981: ifnonnull -> 996
    //   984: iload #4
    //   986: ifeq -> 952
    //   989: goto -> 996
    //   992: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   995: athrow
    //   996: aload #7
    //   998: aload #10
    //   1000: invokeinterface getKey : ()Ljava/lang/Object;
    //   1005: checkcast java/lang/String
    //   1008: aload_0
    //   1009: aload_3
    //   1010: aload #10
    //   1012: invokeinterface getValue : ()Ljava/lang/Object;
    //   1017: aload_3
    //   1018: invokevirtual Zk : (Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/reflect/Type;)Lnet/portswigger/Zrmq;
    //   1021: invokeinterface ZN : (Ljava/lang/String;Lnet/portswigger/Zd4;)Lnet/portswigger/Zrmq;
    //   1026: pop
    //   1027: iload #4
    //   1029: ifeq -> 952
    //   1032: goto -> 1062
    //   1035: astore #8
    //   1037: aload #8
    //   1039: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   1042: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1045: new java/lang/UnsupportedOperationException
    //   1048: dup
    //   1049: sipush #30611
    //   1052: sipush #-24724
    //   1055: invokestatic a : (II)Ljava/lang/String;
    //   1058: invokespecial <init> : (Ljava/lang/String;)V
    //   1061: athrow
    //   1062: aload #7
    //   1064: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   1069: areturn
    //   1070: aload_0
    //   1071: aload #5
    //   1073: invokevirtual Za : (Ljava/lang/reflect/Type;)Ljava/util/Optional;
    //   1076: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   1081: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   1084: aload #5
    //   1086: <illegal opcode> get : (Ljava/lang/Class;)Ljava/util/function/Supplier;
    //   1091: invokevirtual orElseThrow : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   1094: checkcast java/lang/String
    //   1097: astore #7
    //   1099: aload #5
    //   1101: invokevirtual isEnum : ()Z
    //   1104: ifeq -> 1255
    //   1107: aload_2
    //   1108: checkcast java/lang/Enum
    //   1111: astore #8
    //   1113: aconst_null
    //   1114: astore #9
    //   1116: aload #5
    //   1118: invokevirtual getFields : ()[Ljava/lang/reflect/Field;
    //   1121: astore #10
    //   1123: aload #10
    //   1125: arraylength
    //   1126: istore #11
    //   1128: iconst_0
    //   1129: istore #12
    //   1131: iload #12
    //   1133: iload #11
    //   1135: if_icmpge -> 1218
    //   1138: aload #10
    //   1140: iload #12
    //   1142: aaload
    //   1143: astore #13
    //   1145: aload #13
    //   1147: ldc net/portswigger/Zsr
    //   1149: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   1152: checkcast net/portswigger/Zsr
    //   1155: astore #14
    //   1157: aload #8
    //   1159: aload #13
    //   1161: aconst_null
    //   1162: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1165: if_acmpne -> 1182
    //   1168: aload #14
    //   1170: invokeinterface Zl : ()Ljava/lang/String;
    //   1175: astore #9
    //   1177: iload #4
    //   1179: ifeq -> 1218
    //   1182: goto -> 1210
    //   1185: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1188: athrow
    //   1189: astore #15
    //   1191: aload #15
    //   1193: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   1196: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1199: aload_0
    //   1200: getfield ZJ : Ljava/util/function/Consumer;
    //   1203: aload #15
    //   1205: invokeinterface accept : (Ljava/lang/Object;)V
    //   1210: iinc #12, 1
    //   1213: iload #4
    //   1215: ifeq -> 1131
    //   1218: aload #9
    //   1220: ifnonnull -> 1244
    //   1223: new java/lang/IllegalStateException
    //   1226: dup
    //   1227: sipush #30610
    //   1230: sipush #-17431
    //   1233: invokestatic a : (II)Ljava/lang/String;
    //   1236: invokespecial <init> : (Ljava/lang/String;)V
    //   1239: athrow
    //   1240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1243: athrow
    //   1244: aload #9
    //   1246: invokestatic ZN : (Ljava/lang/String;)Lnet/portswigger/Zhq;
    //   1249: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   1254: areturn
    //   1255: invokestatic ZU : ()Lnet/portswigger/Zi7;
    //   1258: astore #8
    //   1260: aload #5
    //   1262: aload #6
    //   1264: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1267: ifne -> 1307
    //   1270: aload_0
    //   1271: aload #6
    //   1273: invokevirtual Za : (Ljava/lang/reflect/Type;)Ljava/util/Optional;
    //   1276: aload_0
    //   1277: aload #8
    //   1279: aload #7
    //   1281: <illegal opcode> apply : (Lnet/portswigger/Ztj;Lnet/portswigger/Zi7;Ljava/lang/String;)Ljava/util/function/Function;
    //   1286: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   1289: aload #6
    //   1291: <illegal opcode> get : (Ljava/lang/reflect/Type;)Ljava/util/function/Supplier;
    //   1296: invokevirtual orElseThrow : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   1299: pop
    //   1300: goto -> 1307
    //   1303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1306: athrow
    //   1307: aload_0
    //   1308: aload #5
    //   1310: invokevirtual Zk : (Ljava/lang/reflect/Type;)Lnet/portswigger/Zm1;
    //   1313: new net/portswigger/Zkk
    //   1316: dup
    //   1317: aload_0
    //   1318: aload_2
    //   1319: aload #8
    //   1321: invokespecial <init> : (Lnet/portswigger/Ztj;Ljava/lang/Object;Lnet/portswigger/Zi7;)V
    //   1324: invokeinterface Zu : (Lnet/portswigger/Zak;)V
    //   1329: aload #8
    //   1331: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   1336: areturn
    // Exception table:
    //   from	to	target	type
    //   5	18	18	java/lang/Throwable
    //   28	36	36	java/lang/Throwable
    //   44	65	68	java/lang/Throwable
    //   54	88	88	java/lang/Throwable
    //   92	113	116	java/lang/Throwable
    //   102	136	136	java/lang/Throwable
    //   140	161	164	java/lang/Throwable
    //   150	184	184	java/lang/Throwable
    //   188	209	212	java/lang/Throwable
    //   198	232	232	java/lang/Throwable
    //   236	257	260	java/lang/Throwable
    //   246	283	283	java/lang/Throwable
    //   287	308	311	java/lang/Throwable
    //   297	331	331	java/lang/Throwable
    //   335	356	359	java/lang/Throwable
    //   345	379	379	java/lang/Throwable
    //   383	404	407	java/lang/Throwable
    //   393	432	432	java/lang/Throwable
    //   436	459	459	java/lang/Throwable
    //   463	483	483	java/lang/Throwable
    //   487	502	502	java/lang/Throwable
    //   506	525	528	java/lang/Throwable
    //   539	566	566	java/lang/Throwable
    //   587	600	629	java/lang/Throwable
    //   605	626	629	java/lang/Throwable
    //   704	714	717	java/lang/Throwable
    //   709	742	745	java/lang/Throwable
    //   765	776	779	java/lang/Throwable
    //   772	800	800	java/lang/Throwable
    //   839	849	852	java/lang/Throwable
    //   888	899	902	java/lang/Throwable
    //   895	923	923	java/lang/Throwable
    //   932	1032	1035	java/lang/ClassCastException
    //   974	989	992	java/lang/Throwable
    //   1157	1177	1189	java/lang/IllegalAccessException
    //   1177	1185	1185	java/lang/Throwable
    //   1218	1240	1240	java/lang/Throwable
    //   1260	1300	1303	java/lang/Throwable
  }
  
  private static Type ZD(Type paramType) {
    try {
      if (!(paramType instanceof ParameterizedType))
        return null; 
    } catch (Zk6 zk6) {
      throw a(null);
    } 
    ParameterizedType parameterizedType = (ParameterizedType)paramType;
    Class<?> clazz = (Class)parameterizedType.getRawType();
    try {
      if (List.class.isAssignableFrom(clazz))
        return parameterizedType.getActualTypeArguments()[0]; 
    } catch (Zk6 zk6) {
      throw a(null);
    } 
    try {
      if (Map.class.isAssignableFrom(clazz)) {
        try {
          if (!String.class.equals(parameterizedType.getActualTypeArguments()[0]))
            throw new UnsupportedOperationException(String.format(a(30609, -23925), new Object[] { parameterizedType.getActualTypeArguments()[0], paramType })); 
        } catch (Zk6 zk6) {
          throw a(null);
        } 
        return parameterizedType.getActualTypeArguments()[1];
      } 
    } catch (Zk6 zk6) {
      throw a(null);
    } 
    throw new UnsupportedOperationException(a(30615, 17744) + a(30615, 17744));
  }
  
  public Object ZQ(Type paramType, String paramString) {
    return Zs(paramType, Zv3.Zx(paramString));
  }
  
  public <T> T ZY(Class<T> paramClass, String paramString) {
    return Zt(paramClass, paramString, Ztj::lambda$deserialize$3);
  }
  
  public <T> T Zt(Class<T> paramClass, String paramString, BiConsumer<String, Type> paramBiConsumer) {
    return (T)ZA(paramClass, Zv3.Zx(paramString), paramBiConsumer);
  }
  
  public Object Zs(Type paramType, Zrmq paramZrmq) {
    return ZA(paramType, paramZrmq, Ztj::lambda$deserialize$4);
  }
  
  public Object ZA(Type paramType, Zrmq paramZrmq, BiConsumer<String, Type> paramBiConsumer) {
    try {
      if (!paramType.equals(Boolean.class)) {
        try {
          if (paramType.equals(boolean.class))
            return Boolean.valueOf(paramZrmq.Zm()); 
        } catch (IllegalAccessException illegalAccessException) {
          throw a(null);
        } 
      } else {
        return Boolean.valueOf(paramZrmq.Zm());
      } 
    } catch (IllegalAccessException illegalAccessException) {
      throw a(null);
    } 
    try {
      if (!paramType.equals(Byte.class)) {
        try {
          if (paramType.equals(byte.class))
            return Byte.valueOf(paramZrmq.Zk().byteValue()); 
        } catch (IllegalAccessException illegalAccessException) {
          throw a(null);
        } 
      } else {
        return Byte.valueOf(paramZrmq.Zk().byteValue());
      } 
    } catch (IllegalAccessException illegalAccessException) {
      throw a(null);
    } 
    try {
      if (!paramType.equals(Short.class)) {
        try {
          if (paramType.equals(short.class))
            return Short.valueOf(paramZrmq.Zk().shortValue()); 
        } catch (IllegalAccessException illegalAccessException) {
          throw a(null);
        } 
      } else {
        return Short.valueOf(paramZrmq.Zk().shortValue());
      } 
    } catch (IllegalAccessException illegalAccessException) {
      throw a(null);
    } 
    try {
      if (!paramType.equals(Integer.class)) {
        try {
          if (paramType.equals(int.class))
            return Integer.valueOf(paramZrmq.Zk().intValue()); 
        } catch (IllegalAccessException illegalAccessException) {
          throw a(null);
        } 
      } else {
        return Integer.valueOf(paramZrmq.Zk().intValue());
      } 
    } catch (IllegalAccessException illegalAccessException) {
      throw a(null);
    } 
    try {
      if (!paramType.equals(Long.class)) {
        try {
          if (paramType.equals(long.class))
            return Long.valueOf(Long.parseLong(paramZrmq.ZW())); 
        } catch (IllegalAccessException illegalAccessException) {
          throw a(null);
        } 
      } else {
        return Long.valueOf(Long.parseLong(paramZrmq.ZW()));
      } 
    } catch (IllegalAccessException illegalAccessException) {
      throw a(null);
    } 
    try {
      if (!paramType.equals(Float.class)) {
        try {
          if (paramType.equals(float.class))
            return Float.valueOf(paramZrmq.Zk().floatValue()); 
        } catch (IllegalAccessException illegalAccessException) {
          throw a(null);
        } 
      } else {
        return Float.valueOf(paramZrmq.Zk().floatValue());
      } 
    } catch (IllegalAccessException illegalAccessException) {
      throw a(null);
    } 
    try {
      if (!paramType.equals(Double.class))
        try {
          if (!paramType.equals(double.class)) {
            try {
              if (paramType.equals(Character.class) || paramType.equals(char.class)) {
                String str = paramZrmq.ZW();
                try {
                  if (str.length() != 1)
                    throw new Zqb(a(30620, -17189) + a(30620, -17189)); 
                } catch (IllegalAccessException illegalAccessException) {
                  throw a(null);
                } 
                return Character.valueOf(str.charAt(0));
              } 
            } catch (IllegalAccessException illegalAccessException) {
              throw a(null);
            } 
            try {
              if (paramType.equals(String.class))
                return paramZrmq.ZW(); 
            } catch (IllegalAccessException illegalAccessException) {
              throw a(null);
            } 
            try {
              if (paramType instanceof Class)
                try {
                  if (Zi7.class.isAssignableFrom((Class)paramType))
                    return paramZrmq; 
                } catch (IllegalAccessException illegalAccessException) {
                  throw a(null);
                }  
            } catch (IllegalAccessException illegalAccessException) {
              throw a(null);
            } 
            try {
              if (paramType instanceof Class && ((Class)paramType).isArray()) {
                Class<?> clazz = ((Class)paramType).getComponentType();
                try {
                  if (byte.class.equals(clazz))
                    return Ztu.Zx(Zny.ZI(paramZrmq.ZW())); 
                } catch (IllegalAccessException illegalAccessException) {
                  throw a(null);
                } 
                Object object = Array.newInstance(clazz, paramZrmq.Zi());
                byte b = 0;
                for (Zrmq zrmq : paramZrmq.ZO()) {
                  Array.set(object, b, ZA(clazz, zrmq, paramBiConsumer));
                  b++;
                } 
                return object;
              } 
            } catch (IllegalAccessException illegalAccessException) {
              throw a(null);
            } 
            if (paramType instanceof GenericArrayType) {
              Object object;
              Type type = ((GenericArrayType)paramType).getGenericComponentType();
              if (type instanceof Class) {
                object = Array.newInstance((Class)type, paramZrmq.Zi());
              } else if (type instanceof ParameterizedType) {
                object = Array.newInstance((Class)((ParameterizedType)type).getRawType(), paramZrmq.Zi());
              } else {
                throw new UnsupportedOperationException(a(30616, 2443) + a(30616, 2443));
              } 
              byte b = 0;
              for (Zrmq zrmq : paramZrmq.ZO()) {
                Array.set(object, b, ZA(type, zrmq, paramBiConsumer));
                b++;
              } 
              return object;
            } 
            if (paramType instanceof ParameterizedType) {
              ParameterizedType parameterizedType = (ParameterizedType)paramType;
              Class<?> clazz = (Class)parameterizedType.getRawType();
              if (List.class.isAssignableFrom(clazz)) {
                Type type = parameterizedType.getActualTypeArguments()[0];
                ArrayList<Object> arrayList = new ArrayList();
                for (Zrmq zrmq : paramZrmq.ZO())
                  arrayList.add(ZA(type, zrmq, paramBiConsumer)); 
                return arrayList;
              } 
              try {
                if (Map.class.isAssignableFrom(clazz)) {
                  try {
                    if (!String.class.equals(parameterizedType.getActualTypeArguments()[0]))
                      throw new UnsupportedOperationException(String.format(a(30622, -25101), new Object[] { parameterizedType.getActualTypeArguments()[0], paramType })); 
                  } catch (IllegalAccessException illegalAccessException) {
                    throw a(null);
                  } 
                  Type type = parameterizedType.getActualTypeArguments()[1];
                  HashMap<Object, Object> hashMap = new HashMap<>();
                  for (Map.Entry<String, Zrmq> entry : paramZrmq.ZX())
                    hashMap.put(entry.getKey(), ZA(type, (Zrmq)entry.getValue(), paramBiConsumer)); 
                  return hashMap;
                } 
              } catch (IllegalAccessException illegalAccessException) {
                throw a(null);
              } 
              throw new UnsupportedOperationException(a(30613, -21852) + a(30613, -21852));
            } 
            AtomicReference<Zm1> atomicReference = new AtomicReference<>(Zk(paramType));
            Zk(paramType).Zu(new Zm8(this, paramZrmq, atomicReference));
            Zrmx zrmx = (Zrmx)atomicReference.get();
            try {
              if (paramType instanceof Class && ((Class)zrmx.Zp).isEnum()) {
                Class clazz = (Class)zrmx.Zp;
                String str = paramZrmq.ZW();
                Field field1 = null;
                Field field2 = null;
                for (Field field : clazz.getFields()) {
                  try {
                    if (field.isEnumConstant()) {
                      try {
                        if (field.getAnnotation(Zs9.class) != null) {
                          try {
                            if (field1 != null)
                              throw new Zqb(a(30608, 21409)); 
                          } catch (IllegalAccessException illegalAccessException) {
                            throw a(null);
                          } 
                          field1 = field;
                        } 
                      } catch (IllegalAccessException illegalAccessException) {
                        throw a(null);
                      } 
                      Zsr zsr = field.<Zsr>getAnnotation(Zsr.class);
                      try {
                        if (zsr != null && zsr.Zl().equals(str)) {
                          field2 = field;
                          break;
                        } 
                      } catch (IllegalAccessException illegalAccessException) {
                        throw a(null);
                      } 
                    } 
                  } catch (IllegalAccessException illegalAccessException) {
                    throw a(null);
                  } 
                } 
                try {
                  if (field2 == null) {
                    try {
                      if (field1 != null)
                        paramBiConsumer.accept(str, paramType); 
                    } catch (IllegalAccessException illegalAccessException) {
                      throw a(null);
                    } 
                    field2 = field1;
                  } 
                } catch (IllegalAccessException illegalAccessException) {
                  throw a(null);
                } 
                try {
                  try {
                    if (field2 != null)
                      return field2.get(null); 
                  } catch (IllegalAccessException illegalAccessException) {
                    Zah.Zl(illegalAccessException, Zk_.IGNORED);
                    this.ZJ.accept(illegalAccessException);
                  } 
                } catch (InvocationTargetException invocationTargetException) {
                  throw a(null);
                } 
              } 
            } catch (IllegalAccessException illegalAccessException) {
              throw a(null);
            } 
            try {
              return zrmx.Zc.ZK.newInstance(ZG(zrmx.Zc.ZW, paramZrmq));
            } catch (InvocationTargetException invocationTargetException) {
              Zah.Zl(invocationTargetException, Zk_.IGNORED);
              Throwable throwable = invocationTargetException.getTargetException();
              try {
                if (throwable instanceof Zrme)
                  throw (Zrme)throwable; 
              } catch (IllegalAccessException illegalAccessException) {
                throw a(null);
              } 
              try {
                if (throwable instanceof Zrm1)
                  throw (Zrm1)throwable; 
              } catch (IllegalAccessException illegalAccessException) {
                throw a(null);
              } 
              Zah.Zl(invocationTargetException, Zk_.UNEXPECTED);
              throw new RuntimeException(invocationTargetException);
            } catch (InstantiationException|IllegalAccessException instantiationException) {
              Zah.Zl(instantiationException, Zk_.UNEXPECTED);
              throw new RuntimeException(instantiationException);
            } 
          } 
          return Double.valueOf(paramZrmq.Zk().doubleValue());
        } catch (IllegalAccessException illegalAccessException) {
          throw a(null);
        }  
    } catch (IllegalAccessException illegalAccessException) {
      throw a(null);
    } 
    return Double.valueOf(paramZrmq.Zk().doubleValue());
  }
  
  public Object[] ZG(Zrx_ paramZrx_, Zrmq paramZrmq) throws Zqb {
    Object[] arrayOfObject = new Object[paramZrx_.ZA.size()];
    byte b = 0;
    for (Zm7 zm7 : paramZrx_) {
      Zrmq zrmq = paramZrmq.Zo(zm7.ZF);
      try {
        if (zrmq.ZK())
          try {
            if (zm7.ZN != null) {
              arrayOfObject[b] = zm7.Za(this);
              continue;
            } 
          } catch (Zqb zqb) {
            throw a(null);
          }  
      } catch (Zqb zqb) {
        throw a(null);
      } 
      try {
        arrayOfObject[b] = Zs(zm7.Zq, zrmq);
      } catch (Zqb|Znd zqb) {
        Zah.Zl(zqb, Zk_.IGNORED);
        throw new Zqb(zqb, zm7.ZF);
      } 
      continue;
      b++;
    } 
    return arrayOfObject;
  }
  
  public String Zz(Type paramType) {
    Function<Type, Optional<String>> function = this::lambda$jsonRepresentation$5;
    return ZQ(paramType, function);
  }
  
  public String ZQ(Type paramType, Function<Type, Optional<String>> paramFunction) {
    return Za5.Zx(this.ZJ, paramType, paramFunction);
  }
  
  private Optional lambda$jsonRepresentation$5(Type paramType) {
    return Za(paramType).map(Zm1::Za);
  }
  
  private static void lambda$deserialize$4(String paramString, Type paramType) {}
  
  private static void lambda$deserialize$3(String paramString, Type paramType) {}
  
  private static UnsupportedOperationException lambda$serialize$2(Type paramType) {
    return new UnsupportedOperationException(a(30619, 1307) + a(30619, 1307));
  }
  
  private Integer lambda$serialize$1(Zi7 paramZi7, String paramString, Zm1 paramZm1) {
    paramZm1.Zu(new Zcx(this, paramZi7, paramString));
    return Integer.valueOf(1);
  }
  
  private static UnsupportedOperationException lambda$serialize$0(Class paramClass) {
    return new UnsupportedOperationException(a(30614, 7795) + a(30614, 7795));
  }
  
  public static void ZW(int paramInt) {
    Za = paramInt;
  }
  
  public static int ZT() {
    return Za;
  }
  
  public static int Zn() {
    int i = ZT();
    try {
      if (i == 0)
        return 57; 
    } catch (Zk6 zk6) {
      throw a(null);
    } 
    return 0;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¬ø9Å '°¾zÕ©\\n)úbVà"tyÂô«¹Ü\\tr¦32ÖZÀM»12@º*F<¾ {-&'\\rz\Éði¾m¤qÊÃÉ}f«'XÈ·äà<{ëZ×}#ìÌ0°%vµ¾²,óÞFzÀv:%Ú«9÷lEw\\rcöSW|ß ±û|ÏÓXý`63{\\fÑë^ô¯¼èÌfÉlyðçÚ6\\tÑ®2÷« üªÚeÀIê2ÛáØ-kîóêÏe=äÀï:¯+mÔö7su©ñ8bò±"1DÄÓ²ÝÍ¾\\tÂ@ ¯üûÉzÊWµÜçÔ]4\\b´jÔü¾½`úäÆ¡Ç³Tâá×6G¤OÝWÑ³µT«Ñja\\rQi¹°3é(aÂêÃ!T]$ºÌ\_^SqÆ{ O}ÞãMjEÕzS4<\\r¶Gå~Ë<ÎÌ#ó\\\b0Ü©4ñC%ª» ÂçÔ6³ðo$½ÍÓtîG±ÄÚ %ÕÿÚ\u¤à¤Ud7Jpâß¥«\\rPbÕ3ùZB0è²ü´ÛyEuãÂN*¬ÆéQhñ°[ëÞÚB&\öã ¬Ùý õªMâ/wCÑ©û.ùbRâ½äØ×9æ9Ç¡_'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #17
    //   20: istore_1
    //   21: iconst_0
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic ZW : (I)V
    //   27: bipush #19
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'ÁåYý¦+Æ­àÝ9v­Oºyíyq\\tW9úsÜÛ2¥c2âvAEØ?½|\\f¿~÷¹u2%xxQ'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #45
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #30
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic net/portswigger/Ztj.a : [Ljava/lang/String;
    //   136: bipush #16
    //   138: anewarray java/lang/String
    //   141: putstatic net/portswigger/Ztj.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 263
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #83
    //   218: goto -> 247
    //   221: bipush #43
    //   223: goto -> 247
    //   226: bipush #45
    //   228: goto -> 247
    //   231: bipush #21
    //   233: goto -> 247
    //   236: bipush #74
    //   238: goto -> 247
    //   241: bipush #104
    //   243: goto -> 247
    //   246: iconst_2
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 170
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 166
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7797) & 0xFFFF;
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
      char c = '÷';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Ztj.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */
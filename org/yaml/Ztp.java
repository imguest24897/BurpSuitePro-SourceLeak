package org.yaml;

import burp.Zbqc;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public abstract class Ztp {
  protected static final Object ZG;
  
  protected final Map<Zjz, Zt2> Z_ = new EnumMap<>(Zjz.class);
  
  protected final Map<Zj9, Zt2> Zh = new HashMap<>();
  
  protected final Map<String, Zt2> Zj = new HashMap<>();
  
  protected Zjx Zn;
  
  final Map<Zi, Object> Za;
  
  private final Set<Zi> Zl;
  
  private final ArrayList<Z_e<Map<Object, Object>, Z_e<Object, Object>>> Zt;
  
  private final ArrayList<Z_e<Set<Object>, Object>> ZV;
  
  protected Zj9 Zi;
  
  private Zt7 Zo;
  
  private boolean Zf;
  
  private boolean ZX = true;
  
  private boolean Zw;
  
  private boolean Zp;
  
  protected final Map<Class<? extends Object>, Zty> Zs;
  
  protected final Map<Zj9, Class<? extends Object>> ZT;
  
  protected Ztw Zx;
  
  private static int Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztp(Ztw paramZtw) {
    int i = Zy();
    try {
      this.Zw = false;
      this.Zp = false;
      if (paramZtw == null)
        throw new NullPointerException(a(4145, -32241)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      this.Za = new HashMap<>();
      this.Zl = new HashSet<>();
      this.Zt = new ArrayList<>();
      this.ZV = new ArrayList<>();
      this.Zs = new HashMap<>();
      this.ZT = new HashMap<>();
      this.Zi = null;
      this.Zf = false;
      this.Zs.put(SortedMap.class, new Zty((Class)SortedMap.class, Zj9.Zz, TreeMap.class));
      this.Zs.put(SortedSet.class, new Zty((Class)SortedSet.class, Zj9.Zr, TreeSet.class));
      this.Zx = paramZtw;
      if (Zbqc.Zwu() == null)
        Zp(++i); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public void ZU(Zjx paramZjx) {
    this.Zn = paramZjx;
  }
  
  public Object getSingleData(Class<?> paramClass) {
    Zi zi = this.Zn.ZI();
    int i = ZT();
    try {
      if (zi != null) {
        try {
          if (!Zj9.ZN.equals(zi.ZO())) {
            try {
              if (Object.class != paramClass) {
                try {
                  zi.Za(new Zj9((Class)paramClass));
                  if (i != 0) {
                    try {
                      if (this.Zi != null)
                        zi.Za(this.Zi); 
                    } catch (NullPointerException nullPointerException) {
                      throw a(null);
                    } 
                    return Zf(zi);
                  } 
                } catch (NullPointerException nullPointerException) {
                  throw a(null);
                } 
                return Zf(zi);
              } 
            } catch (NullPointerException nullPointerException) {
              throw a(null);
            } 
          } else {
            Zt2 zt2 = this.Zh.get(Zj9.ZN);
            return zt2.ZF(zi);
          } 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
      } else {
        Zt2 zt2 = this.Zh.get(Zj9.ZN);
        return zt2.ZF(zi);
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (this.Zi != null)
        zi.Za(this.Zi); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return Zf(zi);
  }
  
  protected final Object Zf(Zi paramZi) {
    try {
      Object object = ZU(paramZi);
      Zv();
      return object;
    } catch (RuntimeException runtimeException) {
      try {
        if (this.Zw)
          try {
            if (!(runtimeException instanceof Zj3))
              throw new Zj3(runtimeException); 
          } catch (RuntimeException runtimeException1) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException1) {
        throw a(null);
      } 
      throw runtimeException;
    } finally {
      this.Za.clear();
      this.Zl.clear();
    } 
  }
  
  private void Zv() {
    int i = ZT();
    if (!this.Zt.isEmpty()) {
      for (Z_e<Map<Object, Object>, Z_e<Object, Object>> z_e : this.Zt) {
        Z_e z_e1 = (Z_e)z_e.Zb();
        ((Map)z_e.Zq()).put(z_e1.Zq(), z_e1.Zb());
        if (i != 0)
          break; 
      } 
      this.Zt.clear();
    } 
    if (!this.ZV.isEmpty()) {
      for (Z_e<Set<Object>, Object> z_e : this.ZV) {
        ((Set)z_e.Zq()).add(z_e.Zb());
        if (i != 0)
          break; 
      } 
      this.ZV.clear();
    } 
  }
  
  protected Object ZU(Zi paramZi) {
    try {
      if (this.Za.containsKey(paramZi))
        return this.Za.get(paramZi); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return ZE(paramZi);
  }
  
  protected Object ZE(Zi paramZi) {
    try {
      if (this.Zl.contains(paramZi))
        throw new Zlh(null, null, a(4149, 10420), paramZi.ZP()); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.Zl.add(paramZi);
    Zt2 zt2 = Zb(paramZi);
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    Object object = this.Za.containsKey(paramZi) ? this.Za.get(paramZi) : zt2.ZF(paramZi);
    try {
      ZD(paramZi, object);
      this.Za.put(paramZi, object);
      this.Zl.remove(paramZi);
      if (paramZi.Zf())
        zt2.ZH(paramZi, object); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return object;
  }
  
  protected Zt2 Zb(Zi paramZi) {
    int i = ZT();
    try {
      if (paramZi.ZK())
        return this.Z_.get(paramZi.Zo()); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    Zj9 zj9 = paramZi.ZO();
    Zt2 zt2 = this.Zh.get(zj9);
    if (zt2 == null) {
      for (String str : this.Zj.keySet()) {
        try {
          if (zj9.ZS(str))
            return this.Zj.get(str); 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        if (i != 0)
          break; 
      } 
      return this.Zh.get(null);
    } 
    return zt2;
  }
  
  protected String ZN(Zu paramZu) {
    return paramZu.ZJ();
  }
  
  protected List<Object> Zg(int paramInt) {
    return new ArrayList(paramInt);
  }
  
  protected Set<Object> Zz(int paramInt) {
    return new LinkedHashSet(paramInt);
  }
  
  protected Map<Object, Object> ZK(int paramInt) {
    return new LinkedHashMap<>(paramInt);
  }
  
  protected Object Zv(Class<?> paramClass, int paramInt) {
    return Array.newInstance(paramClass.getComponentType(), paramInt);
  }
  
  protected Object ZD(Zi paramZi, Object paramObject) {
    Class<? extends Object> clazz = paramZi.ZX();
    try {
      if (this.Zs.containsKey(clazz))
        return ((Zty)this.Zs.get(clazz)).Zg(paramObject); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return paramObject;
  }
  
  protected Object Z_(Zi paramZi) {
    return Z_(Object.class, paramZi);
  }
  
  protected final Object Z_(Class<?> paramClass, Zi paramZi) {
    return ZR(paramClass, paramZi, true);
  }
  
  protected Object ZR(Class<?> paramClass, Zi paramZi, boolean paramBoolean) {
    try {
      Class<? extends Object> clazz = paramZi.ZX();
      if (this.Zs.containsKey(clazz)) {
        Zty zty = this.Zs.get(clazz);
        Object object = zty.ZY(paramZi);
        if (object != null)
          return object; 
      } 
      try {
        if (paramBoolean)
          try {
            if (paramClass.isAssignableFrom(clazz) && !Modifier.isAbstract(clazz.getModifiers())) {
              Constructor<? extends Object> constructor = clazz.getDeclaredConstructor(new Class[0]);
              constructor.setAccessible(true);
              return constructor.newInstance(new Object[0]);
            } 
          } catch (Exception exception) {
            throw a(null);
          }  
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      throw new Zj3(exception);
    } 
    return ZG;
  }
  
  protected Set<Object> Z_(Zv<?> paramZv) {
    Object object = Z_(Set.class, paramZv);
    try {
      if (object != ZG)
        return (Set<Object>)object; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return Zz(paramZv.Zk().size());
  }
  
  protected List<Object> Zp(Zo paramZo) {
    Object object = Z_(List.class, paramZo);
    try {
      if (object != ZG)
        return (List<Object>)object; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return Zg(paramZo.Zk().size());
  }
  
  protected Map<Object, Object> Zo(Zf paramZf) {
    Object object = Z_(Map.class, paramZf);
    try {
      if (object != ZG)
        return (Map<Object, Object>)object; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return ZK(paramZf.Zk().size());
  }
  
  protected List<? extends Object> Zj(Zo paramZo) {
    List<Object> list = Zp(paramZo);
    Zp(paramZo, list);
    return list;
  }
  
  protected Set<? extends Object> Za(Zo paramZo) {
    Set<Object> set = Z_(paramZo);
    Zp(paramZo, set);
    return set;
  }
  
  protected Object Zo(Zo paramZo) {
    return Zh(paramZo, Zv(paramZo.ZX(), paramZo.Zk().size()));
  }
  
  protected void Zp(Zo paramZo, Collection<Object> paramCollection) {
    Iterator<Zi> iterator = paramZo.Zk().iterator();
    int i = Zy();
    while (iterator.hasNext()) {
      Zi zi = iterator.next();
      paramCollection.add(ZU(zi));
      if (i == 0)
        break; 
    } 
  }
  
  protected Object Zh(Zo paramZo, Object paramObject) {
    // Byte code:
    //   0: invokestatic Zy : ()I
    //   3: aload_1
    //   4: invokevirtual ZX : ()Ljava/lang/Class;
    //   7: invokevirtual getComponentType : ()Ljava/lang/Class;
    //   10: astore #4
    //   12: iconst_0
    //   13: istore #5
    //   15: istore_3
    //   16: aload_1
    //   17: invokevirtual Zk : ()Ljava/util/List;
    //   20: invokeinterface iterator : ()Ljava/util/Iterator;
    //   25: astore #6
    //   27: aload #6
    //   29: invokeinterface hasNext : ()Z
    //   34: ifeq -> 513
    //   37: aload #6
    //   39: invokeinterface next : ()Ljava/lang/Object;
    //   44: checkcast org/yaml/Zi
    //   47: astore #7
    //   49: aload #7
    //   51: invokevirtual ZX : ()Ljava/lang/Class;
    //   54: ldc java/lang/Object
    //   56: if_acmpne -> 73
    //   59: aload #7
    //   61: aload #4
    //   63: invokevirtual Zs : (Ljava/lang/Class;)V
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: aload_0
    //   74: aload #7
    //   76: invokevirtual ZU : (Lorg/yaml/Zi;)Ljava/lang/Object;
    //   79: astore #8
    //   81: aload #4
    //   83: invokevirtual isPrimitive : ()Z
    //   86: ifeq -> 498
    //   89: aload #8
    //   91: ifnonnull -> 140
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   100: athrow
    //   101: new java/lang/NullPointerException
    //   104: dup
    //   105: new java/lang/StringBuilder
    //   108: dup
    //   109: invokespecial <init> : ()V
    //   112: sipush #4147
    //   115: sipush #7359
    //   118: invokestatic a : (II)Ljava/lang/String;
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: aload #7
    //   126: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   129: invokevirtual toString : ()Ljava/lang/String;
    //   132: invokespecial <init> : (Ljava/lang/String;)V
    //   135: athrow
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: getstatic java/lang/Byte.TYPE : Ljava/lang/Class;
    //   143: aload #4
    //   145: invokevirtual equals : (Ljava/lang/Object;)Z
    //   148: ifeq -> 176
    //   151: aload_2
    //   152: iload #5
    //   154: aload #8
    //   156: checkcast java/lang/Number
    //   159: invokevirtual byteValue : ()B
    //   162: invokestatic setByte : (Ljava/lang/Object;IB)V
    //   165: iload_3
    //   166: ifne -> 506
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   175: athrow
    //   176: getstatic java/lang/Short.TYPE : Ljava/lang/Class;
    //   179: aload #4
    //   181: invokevirtual equals : (Ljava/lang/Object;)Z
    //   184: ifeq -> 219
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   193: athrow
    //   194: aload_2
    //   195: iload #5
    //   197: aload #8
    //   199: checkcast java/lang/Number
    //   202: invokevirtual shortValue : ()S
    //   205: invokestatic setShort : (Ljava/lang/Object;IS)V
    //   208: iload_3
    //   209: ifne -> 506
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   218: athrow
    //   219: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   222: aload #4
    //   224: invokevirtual equals : (Ljava/lang/Object;)Z
    //   227: ifeq -> 262
    //   230: goto -> 237
    //   233: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   236: athrow
    //   237: aload_2
    //   238: iload #5
    //   240: aload #8
    //   242: checkcast java/lang/Number
    //   245: invokevirtual intValue : ()I
    //   248: invokestatic setInt : (Ljava/lang/Object;II)V
    //   251: iload_3
    //   252: ifne -> 506
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   261: athrow
    //   262: getstatic java/lang/Long.TYPE : Ljava/lang/Class;
    //   265: aload #4
    //   267: invokevirtual equals : (Ljava/lang/Object;)Z
    //   270: ifeq -> 305
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   279: athrow
    //   280: aload_2
    //   281: iload #5
    //   283: aload #8
    //   285: checkcast java/lang/Number
    //   288: invokevirtual longValue : ()J
    //   291: invokestatic setLong : (Ljava/lang/Object;IJ)V
    //   294: iload_3
    //   295: ifne -> 506
    //   298: goto -> 305
    //   301: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   304: athrow
    //   305: getstatic java/lang/Float.TYPE : Ljava/lang/Class;
    //   308: aload #4
    //   310: invokevirtual equals : (Ljava/lang/Object;)Z
    //   313: ifeq -> 348
    //   316: goto -> 323
    //   319: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   322: athrow
    //   323: aload_2
    //   324: iload #5
    //   326: aload #8
    //   328: checkcast java/lang/Number
    //   331: invokevirtual floatValue : ()F
    //   334: invokestatic setFloat : (Ljava/lang/Object;IF)V
    //   337: iload_3
    //   338: ifne -> 506
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   347: athrow
    //   348: getstatic java/lang/Double.TYPE : Ljava/lang/Class;
    //   351: aload #4
    //   353: invokevirtual equals : (Ljava/lang/Object;)Z
    //   356: ifeq -> 391
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   365: athrow
    //   366: aload_2
    //   367: iload #5
    //   369: aload #8
    //   371: checkcast java/lang/Number
    //   374: invokevirtual doubleValue : ()D
    //   377: invokestatic setDouble : (Ljava/lang/Object;ID)V
    //   380: iload_3
    //   381: ifne -> 506
    //   384: goto -> 391
    //   387: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   390: athrow
    //   391: getstatic java/lang/Character.TYPE : Ljava/lang/Class;
    //   394: aload #4
    //   396: invokevirtual equals : (Ljava/lang/Object;)Z
    //   399: ifeq -> 434
    //   402: goto -> 409
    //   405: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   408: athrow
    //   409: aload_2
    //   410: iload #5
    //   412: aload #8
    //   414: checkcast java/lang/Character
    //   417: invokevirtual charValue : ()C
    //   420: invokestatic setChar : (Ljava/lang/Object;IC)V
    //   423: iload_3
    //   424: ifne -> 506
    //   427: goto -> 434
    //   430: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   433: athrow
    //   434: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   437: aload #4
    //   439: invokevirtual equals : (Ljava/lang/Object;)Z
    //   442: ifeq -> 477
    //   445: goto -> 452
    //   448: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   451: athrow
    //   452: aload_2
    //   453: iload #5
    //   455: aload #8
    //   457: checkcast java/lang/Boolean
    //   460: invokevirtual booleanValue : ()Z
    //   463: invokestatic setBoolean : (Ljava/lang/Object;IZ)V
    //   466: iload_3
    //   467: ifne -> 506
    //   470: goto -> 477
    //   473: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   476: athrow
    //   477: new org/yaml/Zj3
    //   480: dup
    //   481: sipush #4148
    //   484: sipush #6655
    //   487: invokestatic a : (II)Ljava/lang/String;
    //   490: invokespecial <init> : (Ljava/lang/String;)V
    //   493: athrow
    //   494: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   497: athrow
    //   498: aload_2
    //   499: iload #5
    //   501: aload #8
    //   503: invokestatic set : (Ljava/lang/Object;ILjava/lang/Object;)V
    //   506: iinc #5, 1
    //   509: iload_3
    //   510: ifne -> 27
    //   513: aload_2
    //   514: areturn
    // Exception table:
    //   from	to	target	type
    //   49	66	69	java/lang/NullPointerException
    //   81	94	97	java/lang/NullPointerException
    //   89	136	136	java/lang/NullPointerException
    //   140	169	172	java/lang/NullPointerException
    //   151	187	190	java/lang/NullPointerException
    //   176	212	215	java/lang/NullPointerException
    //   194	230	233	java/lang/NullPointerException
    //   219	255	258	java/lang/NullPointerException
    //   237	273	276	java/lang/NullPointerException
    //   262	298	301	java/lang/NullPointerException
    //   280	316	319	java/lang/NullPointerException
    //   305	341	344	java/lang/NullPointerException
    //   323	359	362	java/lang/NullPointerException
    //   348	384	387	java/lang/NullPointerException
    //   366	402	405	java/lang/NullPointerException
    //   391	427	430	java/lang/NullPointerException
    //   409	445	448	java/lang/NullPointerException
    //   434	470	473	java/lang/NullPointerException
    //   452	494	494	java/lang/NullPointerException
  }
  
  protected Set<Object> Ze(Zf paramZf) {
    Set<Object> set = Z_(paramZf);
    ZF(paramZf, set);
    return set;
  }
  
  protected Map<Object, Object> ZR(Zf paramZf) {
    Map<Object, Object> map = Zo(paramZf);
    ZY(paramZf, map);
    return map;
  }
  
  protected void ZY(Zf paramZf, Map<Object, Object> paramMap) {
    List<Z_z> list = paramZf.Zk();
    Iterator<Z_z> iterator = list.iterator();
    int i = ZT();
    while (iterator.hasNext()) {
      Z_z z_z = iterator.next();
      Zi zi1 = z_z.ZU();
      Zi zi2 = z_z.Zf();
      Object object1 = ZU(zi1);
      if (object1 != null)
        try {
          object1.hashCode();
        } catch (Exception exception) {
          throw new Zlh(a(4144, 1089), paramZf.ZP(), a(4157, 3179) + object1, z_z.ZU().ZP(), exception);
        }  
      Object object2 = ZU(zi2);
      try {
        if (zi1.Zf()) {
          try {
            if (this.Zx.ZG()) {
              try {
                ZD(paramMap, object1, object2);
                if (i != 0)
                  throw new Zj3(a(4150, 24363)); 
              } catch (Exception exception) {
                throw a(null);
              } 
            } else {
              throw new Zj3(a(4150, 24363));
            } 
          } catch (Exception exception) {
            throw a(null);
          } 
        } else {
          paramMap.put(object1, object2);
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      if (i != 0)
        break; 
    } 
  }
  
  protected void ZD(Map<Object, Object> paramMap, Object paramObject1, Object paramObject2) {
    this.Zt.add(0, new Z_e<>(paramMap, new Z_e<>(paramObject1, paramObject2)));
  }
  
  protected void ZF(Zf paramZf, Set<Object> paramSet) {
    // Byte code:
    //   0: invokestatic Zy : ()I
    //   3: aload_1
    //   4: invokevirtual Zk : ()Ljava/util/List;
    //   7: astore #4
    //   9: aload #4
    //   11: invokeinterface iterator : ()Ljava/util/Iterator;
    //   16: astore #5
    //   18: istore_3
    //   19: aload #5
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 176
    //   29: aload #5
    //   31: invokeinterface next : ()Ljava/lang/Object;
    //   36: checkcast org/yaml/Z_z
    //   39: astore #6
    //   41: aload #6
    //   43: invokevirtual ZU : ()Lorg/yaml/Zi;
    //   46: astore #7
    //   48: aload_0
    //   49: aload #7
    //   51: invokevirtual ZU : (Lorg/yaml/Zi;)Ljava/lang/Object;
    //   54: astore #8
    //   56: aload #8
    //   58: ifnull -> 130
    //   61: aload #8
    //   63: invokevirtual hashCode : ()I
    //   66: pop
    //   67: goto -> 130
    //   70: astore #9
    //   72: new org/yaml/Zlh
    //   75: dup
    //   76: sipush #4151
    //   79: sipush #20273
    //   82: invokestatic a : (II)Ljava/lang/String;
    //   85: aload_1
    //   86: invokevirtual ZP : ()Lorg/yaml/Zt1;
    //   89: new java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial <init> : ()V
    //   96: sipush #4156
    //   99: sipush #4432
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: aload #8
    //   110: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   113: invokevirtual toString : ()Ljava/lang/String;
    //   116: aload #6
    //   118: invokevirtual ZU : ()Lorg/yaml/Zi;
    //   121: invokevirtual ZP : ()Lorg/yaml/Zt1;
    //   124: aload #9
    //   126: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/Throwable;)V
    //   129: athrow
    //   130: aload #7
    //   132: invokevirtual Zf : ()Z
    //   135: ifeq -> 156
    //   138: aload_0
    //   139: aload_2
    //   140: aload #8
    //   142: invokevirtual Zn : (Ljava/util/Set;Ljava/lang/Object;)V
    //   145: iload_3
    //   146: ifne -> 172
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   155: athrow
    //   156: aload_2
    //   157: aload #8
    //   159: invokeinterface add : (Ljava/lang/Object;)Z
    //   164: pop
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   171: athrow
    //   172: iload_3
    //   173: ifne -> 19
    //   176: return
    // Exception table:
    //   from	to	target	type
    //   61	67	70	java/lang/Exception
    //   130	149	152	java/lang/Exception
    //   138	165	168	java/lang/Exception
  }
  
  protected void Zn(Set<Object> paramSet, Object paramObject) {
    this.ZV.add(0, new Z_e<>(paramSet, paramObject));
  }
  
  public void Zv(Zt7 paramZt7) {
    this.Zo = paramZt7;
    this.Zf = true;
    Collection<Zty> collection = this.Zs.values();
    Iterator<Zty> iterator = collection.iterator();
    int i = Zy();
    while (iterator.hasNext()) {
      Zty zty = iterator.next();
      zty.Zt(paramZt7);
      if (i == 0)
        break; 
    } 
  }
  
  public final Zt7 ZS() {
    try {
      if (this.Zo == null)
        this.Zo = new Zt7(); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return this.Zo;
  }
  
  public Zty Zn(Zty paramZty) {
    try {
      if (paramZty == null)
        throw new NullPointerException(a(4146, 2101)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    Zj9 zj9 = paramZty.ZP();
    this.ZT.put(zj9, paramZty.ZS());
    paramZty.Zt(ZS());
    return this.Zs.put(paramZty.ZS(), paramZty);
  }
  
  public final boolean Zo() {
    return this.Zf;
  }
  
  public boolean Zl() {
    return this.ZX;
  }
  
  public void Zh(boolean paramBoolean) {
    this.ZX = paramBoolean;
  }
  
  public void Z_(boolean paramBoolean) {
    this.Zw = paramBoolean;
  }
  
  public Ztw Zu() {
    return this.Zx;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_0
    //   10: ldc '÷NkkÍ§³¿+Ù¥1öP¸9·EeÎc°Våümn\\tçæì-^ ¥.BNÎãÀÙÀ¥Þ·DÕ´Cç³úB¤A\\núxæèþM*¡Q¢JÄ!T£}üóØª¸&K"M\sá­ãÊÂøØÒ#ÜÄ×ú<kqf®9¢êç¥¸Ù|e\ë5FK}£óBë§úãX¹ÑgY'çÑ^ D|7¸/©2ÂÝsÊ]`[Á¾{_¹­{¦î¯D2ëOã;EàKÃ~rçP&{MBï;}Írn²õä©>ÚÍ¸?¤b*g¦WÆsüá<kÓ¬c²øÔSK\\fD® X ®}¬øéõ'çgÀÂ'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zp : (I)V
    //   22: bipush #36
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #63
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
    //   72: ldc '{µ¹ó¸hmÄÏØ×Å¢S¨lÈ¥§0_À`bÅ.©äÓB"`C¶Ì,°'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #23
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #29
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
    //   133: putstatic org/yaml/Ztp.a : [Ljava/lang/String;
    //   136: bipush #10
    //   138: anewarray java/lang/String
    //   141: putstatic org/yaml/Ztp.b : [Ljava/lang/String;
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
    //   163: if_icmpgt -> 264
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
    //   216: bipush #23
    //   218: goto -> 248
    //   221: bipush #127
    //   223: goto -> 248
    //   226: bipush #85
    //   228: goto -> 248
    //   231: bipush #29
    //   233: goto -> 248
    //   236: bipush #111
    //   238: goto -> 248
    //   241: bipush #67
    //   243: goto -> 248
    //   246: bipush #8
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: new java/lang/Object
    //   307: dup
    //   308: invokespecial <init> : ()V
    //   311: putstatic org/yaml/Ztp.ZG : Ljava/lang/Object;
    //   314: return
  }
  
  public static void Zp(int paramInt) {
    Zg = paramInt;
  }
  
  public static int ZT() {
    return Zg;
  }
  
  public static int Zy() {
    int i = ZT();
    try {
      if (i == 0)
        return 61; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1035) & 0xFFFF;
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
      byte b1 = 49;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Ztp.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
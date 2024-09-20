package com.fasterxml.Zoz;

import com.fasterxml.Zh.Zi;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zt;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Zm extends Zl {
  private final Zij ZG;
  
  private final boolean ZF;
  
  private static final String a;
  
  Zm(Zt paramZt, Zij paramZij, boolean paramBoolean) {
    super(paramZt);
    this.ZG = (paramZt == null) ? null : paramZij;
    this.ZF = paramBoolean;
  }
  
  public static Zj ZD(Zt paramZt, Zis paramZis, Zij paramZij, Zi paramZi, Zk paramZk, List<Zk> paramList, Class<?> paramClass, boolean paramBoolean) {
    return (new Zm(paramZt, paramZij, paramBoolean)).Zy(paramZi, paramZis, paramZk, paramList, paramClass);
  }
  
  Zj Zy(Zi paramZi, Zis paramZis, Zk paramZk, List<Zk> paramList, Class<?> paramClass) {
    LinkedHashMap<Object, Object> linkedHashMap1 = new LinkedHashMap<>();
    ZE(paramZis, paramZk.Zf(), (Map)linkedHashMap1, paramClass);
    int i = Ziv.Zv();
    for (Zk zk : paramList) {
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      Class<?> clazz = (this.ZG == null) ? null : this.ZG.ZL(zk.Zf());
      ZE(new Ziu(paramZi, zk.ZR()), zk.Zf(), (Map)linkedHashMap1, clazz);
      if (i != 0)
        break; 
    } 
    boolean bool = false;
    if (this.ZG != null) {
      Class<?> clazz = this.ZG.ZL(Object.class);
      if (clazz != null) {
        Zo(paramZis, paramZk.Zf(), (Map)linkedHashMap1, clazz);
        bool = true;
      } 
    } 
    try {
      if (bool)
        try {
          if (this.ZV != null && !linkedHashMap1.isEmpty())
            for (Map.Entry<Object, Object> entry : linkedHashMap1.entrySet()) {
              Zib zib = (Zib)entry.getKey();
              if (a.equals(zib.ZD()))
                try {
                  if (0 == zib.ZV() || i != 0) {
                    try {
                      Method method = Object.class.getDeclaredMethod(zib.ZD(), new Class[0]);
                      Zit zit = (Zit)entry.getValue();
                      zit.Zt = Zx(zit.Zt, method.getDeclaredAnnotations());
                      zit.ZI = method;
                    } catch (Exception exception) {}
                    if (i != 0)
                      break; 
                  } 
                } catch (Exception exception) {
                  throw a(null);
                }  
            }  
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (linkedHashMap1.isEmpty())
        return new Zj(); 
    } catch (Exception exception) {
      throw a(null);
    } 
    LinkedHashMap<Object, Object> linkedHashMap2 = new LinkedHashMap<>(linkedHashMap1.size());
    for (Map.Entry<Object, Object> entry : linkedHashMap1.entrySet()) {
      Ziq ziq = ((Zit)entry.getValue()).ZD();
      try {
        if (ziq != null)
          linkedHashMap2.put(entry.getKey(), ziq); 
      } catch (Exception exception) {
        throw a(null);
      } 
      if (i != 0)
        break; 
    } 
    return new Zj((Map)linkedHashMap2);
  }
  
  private void ZE(Zis paramZis, Class<?> paramClass1, Map<Zib, Zit> paramMap, Class<?> paramClass2) {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: istore #5
    //   5: aload #4
    //   7: ifnull -> 19
    //   10: aload_0
    //   11: aload_1
    //   12: aload_2
    //   13: aload_3
    //   14: aload #4
    //   16: invokevirtual Zo : (Lcom/fasterxml/Zoz/Zis;Ljava/lang/Class;Ljava/util/Map;Ljava/lang/Class;)V
    //   19: aload_2
    //   20: ifnonnull -> 24
    //   23: return
    //   24: aload_2
    //   25: invokestatic ZB : (Ljava/lang/Class;)[Ljava/lang/reflect/Method;
    //   28: astore #6
    //   30: aload #6
    //   32: arraylength
    //   33: istore #7
    //   35: iconst_0
    //   36: istore #8
    //   38: iload #8
    //   40: iload #7
    //   42: if_icmpge -> 237
    //   45: aload #6
    //   47: iload #8
    //   49: aaload
    //   50: astore #9
    //   52: aload #9
    //   54: invokestatic Zg : (Ljava/lang/reflect/Method;)Z
    //   57: ifne -> 65
    //   60: iload #5
    //   62: ifeq -> 229
    //   65: new com/fasterxml/Zoz/Zib
    //   68: dup
    //   69: aload #9
    //   71: invokespecial <init> : (Ljava/lang/reflect/Method;)V
    //   74: astore #10
    //   76: aload_3
    //   77: aload #10
    //   79: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   84: checkcast com/fasterxml/Zoz/Zit
    //   87: astore #11
    //   89: aload #11
    //   91: ifnonnull -> 144
    //   94: aload_0
    //   95: getfield ZV : Lcom/fasterxml/Zor/Zt;
    //   98: ifnonnull -> 107
    //   101: invokestatic Z_ : ()Lcom/fasterxml/Zoz/Zie;
    //   104: goto -> 116
    //   107: aload_0
    //   108: aload #9
    //   110: invokevirtual getDeclaredAnnotations : ()[Ljava/lang/annotation/Annotation;
    //   113: invokevirtual Z_ : ([Ljava/lang/annotation/Annotation;)Lcom/fasterxml/Zoz/Zie;
    //   116: astore #12
    //   118: aload_3
    //   119: aload #10
    //   121: new com/fasterxml/Zoz/Zit
    //   124: dup
    //   125: aload_1
    //   126: aload #9
    //   128: aload #12
    //   130: invokespecial <init> : (Lcom/fasterxml/Zoz/Zis;Ljava/lang/reflect/Method;Lcom/fasterxml/Zoz/Zie;)V
    //   133: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   138: pop
    //   139: iload #5
    //   141: ifeq -> 229
    //   144: aload_0
    //   145: getfield ZF : Z
    //   148: ifeq -> 170
    //   151: aload #11
    //   153: aload_0
    //   154: aload #11
    //   156: getfield Zt : Lcom/fasterxml/Zoz/Zie;
    //   159: aload #9
    //   161: invokevirtual getDeclaredAnnotations : ()[Ljava/lang/annotation/Annotation;
    //   164: invokevirtual Zx : (Lcom/fasterxml/Zoz/Zie;[Ljava/lang/annotation/Annotation;)Lcom/fasterxml/Zoz/Zie;
    //   167: putfield Zt : Lcom/fasterxml/Zoz/Zie;
    //   170: aload #11
    //   172: getfield ZI : Ljava/lang/reflect/Method;
    //   175: astore #12
    //   177: aload #12
    //   179: ifnonnull -> 194
    //   182: aload #11
    //   184: aload #9
    //   186: putfield ZI : Ljava/lang/reflect/Method;
    //   189: iload #5
    //   191: ifeq -> 229
    //   194: aload #12
    //   196: invokevirtual getModifiers : ()I
    //   199: invokestatic isAbstract : (I)Z
    //   202: ifeq -> 229
    //   205: aload #9
    //   207: invokevirtual getModifiers : ()I
    //   210: invokestatic isAbstract : (I)Z
    //   213: ifne -> 229
    //   216: aload #11
    //   218: aload #9
    //   220: putfield ZI : Ljava/lang/reflect/Method;
    //   223: aload #11
    //   225: aload_1
    //   226: putfield Zj : Lcom/fasterxml/Zoz/Zis;
    //   229: iinc #8, 1
    //   232: iload #5
    //   234: ifeq -> 38
    //   237: return
  }
  
  protected void Zo(Zis paramZis, Class<?> paramClass1, Map<Zib, Zit> paramMap, Class<?> paramClass2) {
    // Byte code:
    //   0: invokestatic ZM : ()I
    //   3: istore #5
    //   5: aload_0
    //   6: getfield ZV : Lcom/fasterxml/Zor/Zt;
    //   9: ifnonnull -> 13
    //   12: return
    //   13: aload #4
    //   15: aload_2
    //   16: iconst_1
    //   17: invokestatic Zp : (Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/util/List;
    //   20: invokeinterface iterator : ()Ljava/util/Iterator;
    //   25: astore #6
    //   27: aload #6
    //   29: invokeinterface hasNext : ()Z
    //   34: ifeq -> 185
    //   37: aload #6
    //   39: invokeinterface next : ()Ljava/lang/Object;
    //   44: checkcast java/lang/Class
    //   47: astore #7
    //   49: aload #7
    //   51: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   54: astore #8
    //   56: aload #8
    //   58: arraylength
    //   59: istore #9
    //   61: iconst_0
    //   62: istore #10
    //   64: iload #10
    //   66: iload #9
    //   68: if_icmpge -> 180
    //   71: aload #8
    //   73: iload #10
    //   75: aaload
    //   76: astore #11
    //   78: aload #11
    //   80: invokestatic Zg : (Ljava/lang/reflect/Method;)Z
    //   83: ifne -> 91
    //   86: iload #5
    //   88: ifne -> 172
    //   91: new com/fasterxml/Zoz/Zib
    //   94: dup
    //   95: aload #11
    //   97: invokespecial <init> : (Ljava/lang/reflect/Method;)V
    //   100: astore #12
    //   102: aload_3
    //   103: aload #12
    //   105: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   110: checkcast com/fasterxml/Zoz/Zit
    //   113: astore #13
    //   115: aload #11
    //   117: invokevirtual getDeclaredAnnotations : ()[Ljava/lang/annotation/Annotation;
    //   120: astore #14
    //   122: aload #13
    //   124: ifnonnull -> 156
    //   127: aload_3
    //   128: aload #12
    //   130: new com/fasterxml/Zoz/Zit
    //   133: dup
    //   134: aload_1
    //   135: aconst_null
    //   136: aload_0
    //   137: aload #14
    //   139: invokevirtual Z_ : ([Ljava/lang/annotation/Annotation;)Lcom/fasterxml/Zoz/Zie;
    //   142: invokespecial <init> : (Lcom/fasterxml/Zoz/Zis;Ljava/lang/reflect/Method;Lcom/fasterxml/Zoz/Zie;)V
    //   145: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   150: pop
    //   151: iload #5
    //   153: ifne -> 172
    //   156: aload #13
    //   158: aload_0
    //   159: aload #13
    //   161: getfield Zt : Lcom/fasterxml/Zoz/Zie;
    //   164: aload #14
    //   166: invokevirtual Zx : (Lcom/fasterxml/Zoz/Zie;[Ljava/lang/annotation/Annotation;)Lcom/fasterxml/Zoz/Zie;
    //   169: putfield Zt : Lcom/fasterxml/Zoz/Zie;
    //   172: iinc #10, 1
    //   175: iload #5
    //   177: ifne -> 64
    //   180: iload #5
    //   182: ifne -> 27
    //   185: return
  }
  
  private static boolean Zg(Method paramMethod) {
    return (Modifier.isStatic(paramMethod.getModifiers()) || paramMethod.isSynthetic() || paramMethod.isBridge()) ? false : ((paramMethod.getParameterCount() <= 2));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #36
    //   2: ldc 'UPkxHX'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zoz/Zm.a : Ljava/lang/String;
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
    //   80: bipush #25
    //   82: goto -> 112
    //   85: bipush #87
    //   87: goto -> 112
    //   90: bipush #7
    //   92: goto -> 112
    //   95: bipush #39
    //   97: goto -> 112
    //   100: bipush #31
    //   102: goto -> 112
    //   105: bipush #90
    //   107: goto -> 112
    //   110: bipush #8
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
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
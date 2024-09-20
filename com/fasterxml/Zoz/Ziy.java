package com.fasterxml.Zoz;

import com.fasterxml.Zh.Zi;
import com.fasterxml.Zh.Zr;
import com.fasterxml.Zor.Zk;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;

final class Ziy {
  public static Zis Zv(Method paramMethod, Zk paramZk, Zi paramZi, Zis paramZis) {
    Zr zr = ZN(paramMethod, paramZk, paramZis);
    return (zr == null) ? paramZis : new Ziu(paramZi, zr);
  }
  
  static Zr ZN(Method paramMethod, Zk paramZk, Zis paramZis) {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: aload_0
    //   4: invokevirtual getTypeParameters : ()[Ljava/lang/reflect/TypeVariable;
    //   7: astore #4
    //   9: istore_3
    //   10: aload #4
    //   12: arraylength
    //   13: ifeq -> 26
    //   16: aload_1
    //   17: invokevirtual ZR : ()Lcom/fasterxml/Zh/Zr;
    //   20: invokevirtual ZS : ()Z
    //   23: ifeq -> 28
    //   26: aconst_null
    //   27: areturn
    //   28: aload_0
    //   29: invokevirtual getGenericReturnType : ()Ljava/lang/reflect/Type;
    //   32: astore #5
    //   34: aload #5
    //   36: instanceof java/lang/reflect/ParameterizedType
    //   39: ifne -> 44
    //   42: aconst_null
    //   43: areturn
    //   44: aload #5
    //   46: checkcast java/lang/reflect/ParameterizedType
    //   49: astore #6
    //   51: aload_1
    //   52: invokevirtual Zf : ()Ljava/lang/Class;
    //   55: aload #6
    //   57: invokeinterface getRawType : ()Ljava/lang/reflect/Type;
    //   62: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   65: ifne -> 70
    //   68: aconst_null
    //   69: areturn
    //   70: aload #6
    //   72: invokeinterface getActualTypeArguments : ()[Ljava/lang/reflect/Type;
    //   77: astore #7
    //   79: new java/util/ArrayList
    //   82: dup
    //   83: aload #4
    //   85: arraylength
    //   86: invokespecial <init> : (I)V
    //   89: astore #8
    //   91: new java/util/ArrayList
    //   94: dup
    //   95: aload #4
    //   97: arraylength
    //   98: invokespecial <init> : (I)V
    //   101: astore #9
    //   103: iconst_0
    //   104: istore #10
    //   106: iload #10
    //   108: aload #7
    //   110: arraylength
    //   111: if_icmpge -> 326
    //   114: aload #7
    //   116: iload #10
    //   118: aaload
    //   119: astore #11
    //   121: aload #11
    //   123: invokestatic Zq : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/TypeVariable;
    //   126: astore #12
    //   128: aload #12
    //   130: ifnull -> 319
    //   133: aload #12
    //   135: invokeinterface getName : ()Ljava/lang/String;
    //   140: astore #13
    //   142: aload #13
    //   144: ifnonnull -> 149
    //   147: aconst_null
    //   148: areturn
    //   149: aload_1
    //   150: invokevirtual ZR : ()Lcom/fasterxml/Zh/Zr;
    //   153: iload #10
    //   155: invokevirtual Zc : (I)Lcom/fasterxml/Zor/Zk;
    //   158: astore #14
    //   160: aload #14
    //   162: ifnonnull -> 167
    //   165: aconst_null
    //   166: areturn
    //   167: aload #4
    //   169: aload #13
    //   171: invokestatic ZU : ([Ljava/lang/reflect/TypeVariable;Ljava/lang/String;)Ljava/lang/reflect/TypeVariable;
    //   174: astore #15
    //   176: aload #15
    //   178: ifnonnull -> 183
    //   181: aconst_null
    //   182: areturn
    //   183: aload_2
    //   184: aload #14
    //   186: aload #15
    //   188: invokeinterface getBounds : ()[Ljava/lang/reflect/Type;
    //   193: invokestatic Zb : (Lcom/fasterxml/Zoz/Zis;Lcom/fasterxml/Zor/Zk;[Ljava/lang/reflect/Type;)Z
    //   196: ifeq -> 319
    //   199: aload #8
    //   201: aload #13
    //   203: invokevirtual indexOf : (Ljava/lang/Object;)I
    //   206: istore #16
    //   208: iload #16
    //   210: iconst_m1
    //   211: if_icmpeq -> 303
    //   214: aload #9
    //   216: iload #16
    //   218: invokevirtual get : (I)Ljava/lang/Object;
    //   221: checkcast com/fasterxml/Zor/Zk
    //   224: astore #17
    //   226: aload #14
    //   228: aload #17
    //   230: invokevirtual equals : (Ljava/lang/Object;)Z
    //   233: ifeq -> 240
    //   236: iload_3
    //   237: ifeq -> 319
    //   240: aload #17
    //   242: aload #14
    //   244: invokevirtual Zf : ()Ljava/lang/Class;
    //   247: invokevirtual Zf : (Ljava/lang/Class;)Z
    //   250: istore #18
    //   252: aload #14
    //   254: aload #17
    //   256: invokevirtual Zf : ()Ljava/lang/Class;
    //   259: invokevirtual Zf : (Ljava/lang/Class;)Z
    //   262: istore #19
    //   264: iload #18
    //   266: ifne -> 276
    //   269: iload #19
    //   271: ifne -> 276
    //   274: aconst_null
    //   275: areturn
    //   276: iload #18
    //   278: iload #19
    //   280: ixor
    //   281: ifeq -> 299
    //   284: iload #19
    //   286: ifeq -> 299
    //   289: aload #9
    //   291: iload #16
    //   293: aload #14
    //   295: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   298: pop
    //   299: iload_3
    //   300: ifeq -> 319
    //   303: aload #8
    //   305: aload #13
    //   307: invokevirtual add : (Ljava/lang/Object;)Z
    //   310: pop
    //   311: aload #9
    //   313: aload #14
    //   315: invokevirtual add : (Ljava/lang/Object;)Z
    //   318: pop
    //   319: iinc #10, 1
    //   322: iload_3
    //   323: ifeq -> 106
    //   326: aload #8
    //   328: invokevirtual isEmpty : ()Z
    //   331: ifeq -> 336
    //   334: aconst_null
    //   335: areturn
    //   336: aload #8
    //   338: aload #9
    //   340: invokestatic Z_ : (Ljava/util/List;Ljava/util/List;)Lcom/fasterxml/Zh/Zr;
    //   343: areturn
  }
  
  private static TypeVariable<?> Zq(Type paramType) {
    if (paramType instanceof TypeVariable)
      return (TypeVariable)paramType; 
    if (paramType instanceof WildcardType) {
      WildcardType wildcardType = (WildcardType)paramType;
      if ((wildcardType.getLowerBounds()).length != 0)
        return null; 
      Type[] arrayOfType = wildcardType.getUpperBounds();
      if (arrayOfType.length == 1)
        return Zq(arrayOfType[0]); 
    } 
    return null;
  }
  
  private static ParameterizedType ZE(Type paramType) {
    if (paramType instanceof ParameterizedType)
      return (ParameterizedType)paramType; 
    if (paramType instanceof WildcardType) {
      WildcardType wildcardType = (WildcardType)paramType;
      if ((wildcardType.getLowerBounds()).length != 0)
        return null; 
      Type[] arrayOfType = wildcardType.getUpperBounds();
      if (arrayOfType.length == 1)
        return ZE(arrayOfType[0]); 
    } 
    return null;
  }
  
  private static boolean Zb(Zis paramZis, Zk paramZk, Type[] paramArrayOfType) {
    Type[] arrayOfType = paramArrayOfType;
    int i = Ziv.Zv();
    int j = arrayOfType.length;
    byte b = 0;
    while (b < j) {
      Type type = arrayOfType[b];
      if (!ZG(paramZis, paramZk, type))
        return false; 
      b++;
      if (i != 0)
        break; 
    } 
    return true;
  }
  
  private static boolean ZG(Zis paramZis, Zk paramZk, Type paramType) {
    int i = Ziv.Zv();
    if (!paramZk.Zf(paramZis.ZT(paramType).Zf()))
      return false; 
    ParameterizedType parameterizedType = ZE(paramType);
    if (parameterizedType != null && Objects.equals(paramZk.Zf(), parameterizedType.getRawType())) {
      Type[] arrayOfType = parameterizedType.getActualTypeArguments();
      Zr zr = paramZk.ZR();
      if (zr.Zf() != arrayOfType.length)
        return false; 
      byte b = 0;
      while (b < zr.Zf()) {
        Zk zk = zr.ZR(b);
        Type type = arrayOfType[b];
        if (!ZG(paramZis, zk, type))
          return false; 
        b++;
        if (i != 0)
          break; 
      } 
    } 
    return true;
  }
  
  private static TypeVariable<?> ZU(TypeVariable<?>[] paramArrayOfTypeVariable, String paramString) {
    int i = Ziv.ZM();
    if (paramArrayOfTypeVariable == null || paramString == null)
      return null; 
    TypeVariable<?>[] arrayOfTypeVariable = paramArrayOfTypeVariable;
    int j = arrayOfTypeVariable.length;
    byte b = 0;
    while (b < j) {
      TypeVariable<?> typeVariable = arrayOfTypeVariable[b];
      if (paramString.equals(typeVariable.getName()))
        return typeVariable; 
      b++;
      if (i == 0)
        break; 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Ziy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
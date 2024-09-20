package org.yaml;

import java.lang.reflect.Type;

public abstract class Zga extends Zg3 {
  private final Type ZG;
  
  private boolean ZS;
  
  private Class<?>[] ZY;
  
  public Zga(String paramString, Class<?> paramClass, Type paramType) {
    super(paramString, paramClass);
    this.ZG = paramType;
    this.ZS = (paramType == null);
  }
  
  public Class<?>[] Zk() {
    // Byte code:
    //   0: invokestatic Z_ : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZS : Z
    //   8: ifne -> 312
    //   11: aload_0
    //   12: getfield ZG : Ljava/lang/reflect/Type;
    //   15: instanceof java/lang/reflect/ParameterizedType
    //   18: ifeq -> 212
    //   21: aload_0
    //   22: getfield ZG : Ljava/lang/reflect/Type;
    //   25: checkcast java/lang/reflect/ParameterizedType
    //   28: astore_2
    //   29: aload_2
    //   30: invokeinterface getActualTypeArguments : ()[Ljava/lang/reflect/Type;
    //   35: astore_3
    //   36: aload_3
    //   37: arraylength
    //   38: ifle -> 208
    //   41: aload_0
    //   42: aload_3
    //   43: arraylength
    //   44: anewarray java/lang/Class
    //   47: putfield ZY : [Ljava/lang/Class;
    //   50: iconst_0
    //   51: istore #4
    //   53: iload #4
    //   55: aload_3
    //   56: arraylength
    //   57: if_icmpge -> 208
    //   60: aload_3
    //   61: iload #4
    //   63: aaload
    //   64: instanceof java/lang/Class
    //   67: ifeq -> 88
    //   70: aload_0
    //   71: getfield ZY : [Ljava/lang/Class;
    //   74: iload #4
    //   76: aload_3
    //   77: iload #4
    //   79: aaload
    //   80: checkcast java/lang/Class
    //   83: aastore
    //   84: aload_1
    //   85: ifnonnull -> 201
    //   88: aload_3
    //   89: iload #4
    //   91: aaload
    //   92: instanceof java/lang/reflect/ParameterizedType
    //   95: ifeq -> 124
    //   98: aload_0
    //   99: getfield ZY : [Ljava/lang/Class;
    //   102: iload #4
    //   104: aload_3
    //   105: iload #4
    //   107: aaload
    //   108: checkcast java/lang/reflect/ParameterizedType
    //   111: invokeinterface getRawType : ()Ljava/lang/reflect/Type;
    //   116: checkcast java/lang/Class
    //   119: aastore
    //   120: aload_1
    //   121: ifnonnull -> 201
    //   124: aload_3
    //   125: iload #4
    //   127: aaload
    //   128: instanceof java/lang/reflect/GenericArrayType
    //   131: ifeq -> 192
    //   134: aload_3
    //   135: iload #4
    //   137: aaload
    //   138: checkcast java/lang/reflect/GenericArrayType
    //   141: invokeinterface getGenericComponentType : ()Ljava/lang/reflect/Type;
    //   146: astore #5
    //   148: aload #5
    //   150: instanceof java/lang/Class
    //   153: ifeq -> 179
    //   156: aload_0
    //   157: getfield ZY : [Ljava/lang/Class;
    //   160: iload #4
    //   162: aload #5
    //   164: checkcast java/lang/Class
    //   167: iconst_0
    //   168: invokestatic newInstance : (Ljava/lang/Class;I)Ljava/lang/Object;
    //   171: invokevirtual getClass : ()Ljava/lang/Class;
    //   174: aastore
    //   175: aload_1
    //   176: ifnonnull -> 188
    //   179: aload_0
    //   180: aconst_null
    //   181: putfield ZY : [Ljava/lang/Class;
    //   184: aload_1
    //   185: ifnonnull -> 208
    //   188: aload_1
    //   189: ifnonnull -> 201
    //   192: aload_0
    //   193: aconst_null
    //   194: putfield ZY : [Ljava/lang/Class;
    //   197: aload_1
    //   198: ifnonnull -> 208
    //   201: iinc #4, 1
    //   204: aload_1
    //   205: ifnonnull -> 53
    //   208: aload_1
    //   209: ifnonnull -> 307
    //   212: aload_0
    //   213: getfield ZG : Ljava/lang/reflect/Type;
    //   216: instanceof java/lang/reflect/GenericArrayType
    //   219: ifeq -> 261
    //   222: aload_0
    //   223: getfield ZG : Ljava/lang/reflect/Type;
    //   226: checkcast java/lang/reflect/GenericArrayType
    //   229: invokeinterface getGenericComponentType : ()Ljava/lang/reflect/Type;
    //   234: astore_2
    //   235: aload_2
    //   236: instanceof java/lang/Class
    //   239: ifeq -> 257
    //   242: aload_0
    //   243: iconst_1
    //   244: anewarray java/lang/Class
    //   247: dup
    //   248: iconst_0
    //   249: aload_2
    //   250: checkcast java/lang/Class
    //   253: aastore
    //   254: putfield ZY : [Ljava/lang/Class;
    //   257: aload_1
    //   258: ifnonnull -> 307
    //   261: aload_0
    //   262: getfield ZG : Ljava/lang/reflect/Type;
    //   265: instanceof java/lang/Class
    //   268: ifeq -> 307
    //   271: aload_0
    //   272: getfield ZG : Ljava/lang/reflect/Type;
    //   275: checkcast java/lang/Class
    //   278: astore_2
    //   279: aload_2
    //   280: invokevirtual isArray : ()Z
    //   283: ifeq -> 307
    //   286: aload_0
    //   287: iconst_1
    //   288: anewarray java/lang/Class
    //   291: putfield ZY : [Ljava/lang/Class;
    //   294: aload_0
    //   295: getfield ZY : [Ljava/lang/Class;
    //   298: iconst_0
    //   299: aload_0
    //   300: invokevirtual Zg : ()Ljava/lang/Class;
    //   303: invokevirtual getComponentType : ()Ljava/lang/Class;
    //   306: aastore
    //   307: aload_0
    //   308: iconst_1
    //   309: putfield ZS : Z
    //   312: aload_0
    //   313: getfield ZY : [Ljava/lang/Class;
    //   316: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zga.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
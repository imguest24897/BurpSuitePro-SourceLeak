package burp;

import burp.api.montoya.persistence.PersistedList;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zg_c implements InvocationHandler {
  private final Object ZF;
  
  private final Zskh Zb;
  
  private final BiConsumer<Throwable, Zskh> ZJ;
  
  private final boolean Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg_c(Object paramObject, Zskh paramZskh, BiConsumer<Throwable, Zskh> paramBiConsumer, boolean paramBoolean) {
    this.ZF = paramObject;
    this.Zb = paramZskh;
    this.ZJ = paramBiConsumer;
    this.Zt = paramBoolean;
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject) throws Throwable {
    boolean bool = Ze2.Zk();
    try {
      try {
        if (paramMethod.getName().equals(a(-5113, 2357)) && paramMethod.getParameterCount() == 1) {
          Object object1 = paramArrayOfObject[0];
          if (object1 instanceof Proxyable) {
            Proxyable proxyable = (Proxyable)object1;
            return Boolean.valueOf(Objects.equals(proxyable.proxiedObject(), this.ZF));
          } 
          return Boolean.valueOf(Objects.equals(paramArrayOfObject[0], this.ZF));
        } 
      } catch (InvocationTargetException invocationTargetException) {
        throw a(null);
      } 
      try {
        if (paramMethod.getName().equals(a(-5115, -1298)) && paramMethod.getParameterCount() == 0)
          return paramMethod.invoke(this.ZF, new Object[0]); 
      } catch (InvocationTargetException invocationTargetException) {
        throw a(null);
      } 
      Object object = paramMethod.invoke(this.ZF, paramArrayOfObject);
      Class<?> clazz = paramMethod.getReturnType();
      if (object == null)
        return Zf(clazz); 
      try {
        if (object instanceof Proxyable)
          return ZL(object, clazz); 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (clazz.isArray() && clazz.getComponentType().isInterface())
          return Zb(object); 
      } catch (InvocationTargetException invocationTargetException) {
        throw a(null);
      } 
      try {
        if (!clazz.isInterface())
          return object; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (PersistedList.class.isAssignableFrom(clazz))
          return ZL(object, clazz); 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      if (Collection.class.isAssignableFrom(clazz)) {
        Class<?> clazz1 = Zf(paramMethod.getGenericReturnType());
        try {
        
        } catch (InvocationTargetException invocationTargetException) {
          throw a(null);
        } 
        return (clazz1 != null) ? ZD(object, clazz1) : object;
      } 
      try {
        if (Map.class.isAssignableFrom(clazz))
          return Zw(object, paramMethod); 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      return ZL(object, clazz);
    } catch (InvocationTargetException invocationTargetException) {
      Zah.Zl(invocationTargetException, Zk_.RETHROWN);
      Throwable throwable = invocationTargetException.getCause();
      try {
        this.ZJ.accept(throwable, this.Zb);
        if (this.Zt)
          throw throwable; 
      } catch (InvocationTargetException invocationTargetException1) {
        throw a(null);
      } 
      try {
        if (!bool)
          Zbqc.Zr(new Zbqc[1]); 
      } catch (InvocationTargetException invocationTargetException1) {
        throw a(null);
      } 
      return Zf(paramMethod.getReturnType());
    } 
  }
  
  private Object Zf(Class<?> paramClass) {
    try {
      if (!paramClass.isPrimitive())
        return null; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramClass.equals(boolean.class))
        return Boolean.valueOf(false); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Integer.valueOf(0);
  }
  
  private Object Zb(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: invokevirtual isArray : ()Z
    //   7: ifeq -> 95
    //   10: aload_1
    //   11: invokevirtual getClass : ()Ljava/lang/Class;
    //   14: invokevirtual getComponentType : ()Ljava/lang/Class;
    //   17: invokevirtual isInterface : ()Z
    //   20: ifne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   29: athrow
    //   30: aload_1
    //   31: areturn
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_1
    //   37: checkcast [Ljava/lang/Object;
    //   40: astore_2
    //   41: aload_2
    //   42: arraylength
    //   43: ifne -> 52
    //   46: aload_1
    //   47: areturn
    //   48: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   51: athrow
    //   52: aload_1
    //   53: invokevirtual getClass : ()Ljava/lang/Class;
    //   56: invokevirtual getComponentType : ()Ljava/lang/Class;
    //   59: iconst_0
    //   60: invokestatic newInstance : (Ljava/lang/Class;I)Ljava/lang/Object;
    //   63: checkcast [Ljava/lang/Object;
    //   66: astore_3
    //   67: aload_2
    //   68: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   71: aload_0
    //   72: aload_1
    //   73: <illegal opcode> apply : (Lburp/Zg_c;Ljava/lang/Object;)Ljava/util/function/Function;
    //   78: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   83: invokeinterface toList : ()Ljava/util/List;
    //   88: aload_3
    //   89: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   94: areturn
    //   95: new java/lang/IllegalStateException
    //   98: dup
    //   99: aload_1
    //   100: invokevirtual getClass : ()Ljava/lang/Class;
    //   103: invokevirtual getName : ()Ljava/lang/String;
    //   106: sipush #-5114
    //   109: sipush #24002
    //   112: invokestatic a : (II)Ljava/lang/String;
    //   115: swap
    //   116: sipush #-5119
    //   119: sipush #-367
    //   122: invokestatic a : (II)Ljava/lang/String;
    //   125: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   130: invokespecial <init> : (Ljava/lang/String;)V
    //   133: athrow
    // Exception table:
    //   from	to	target	type
    //   0	23	26	java/lang/IllegalStateException
    //   10	32	32	java/lang/IllegalStateException
    //   41	48	48	java/lang/IllegalStateException
  }
  
  private Object ZD(Object paramObject, Class<?> paramClass) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof java/util/List
    //   4: ifeq -> 39
    //   7: aload_1
    //   8: checkcast java/util/List
    //   11: astore_3
    //   12: aload_3
    //   13: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   18: aload_0
    //   19: aload_2
    //   20: <illegal opcode> apply : (Lburp/Zg_c;Ljava/lang/Class;)Ljava/util/function/Function;
    //   25: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   30: invokestatic toList : ()Ljava/util/stream/Collector;
    //   33: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   38: areturn
    //   39: aload_1
    //   40: instanceof java/util/Set
    //   43: ifeq -> 78
    //   46: aload_1
    //   47: checkcast java/util/Set
    //   50: astore_3
    //   51: aload_3
    //   52: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   57: aload_0
    //   58: aload_2
    //   59: <illegal opcode> apply : (Lburp/Zg_c;Ljava/lang/Class;)Ljava/util/function/Function;
    //   64: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   69: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   72: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   77: areturn
    //   78: new java/lang/IllegalStateException
    //   81: dup
    //   82: aload_1
    //   83: invokevirtual getClass : ()Ljava/lang/Class;
    //   86: invokevirtual getName : ()Ljava/lang/String;
    //   89: sipush #-5120
    //   92: sipush #-10049
    //   95: invokestatic a : (II)Ljava/lang/String;
    //   98: swap
    //   99: sipush #-5119
    //   102: sipush #-367
    //   105: invokestatic a : (II)Ljava/lang/String;
    //   108: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   113: invokespecial <init> : (Ljava/lang/String;)V
    //   116: athrow
  }
  
  private Object Zw(Object paramObject, Method paramMethod) {
    Type[] arrayOfType = Zg(paramMethod.getGenericReturnType());
    if (arrayOfType != null)
      try {
        Class<?> clazz1 = (Class)arrayOfType[0];
        Class<?> clazz2 = (Class)arrayOfType[1];
        if (paramObject instanceof LinkedHashMap) {
          LinkedHashMap<?, ?> linkedHashMap = (LinkedHashMap)paramObject;
          LinkedHashMap<Object, Object> linkedHashMap1 = new LinkedHashMap<>();
          ZC(clazz1, clazz2, linkedHashMap, linkedHashMap1);
          return linkedHashMap1;
        } 
        if (paramObject instanceof HashMap) {
          HashMap<?, ?> hashMap = (HashMap)paramObject;
          HashMap<Object, Object> hashMap1 = new HashMap<>();
          ZC(clazz1, clazz2, hashMap, hashMap1);
          return hashMap1;
        } 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.IGNORED);
      }  
    throw new IllegalStateException(a(-5116, -32651) + a(-5116, -32651) + paramObject.getClass().getName());
  }
  
  private void ZC(Class<?> paramClass1, Class<?> paramClass2, Map<?, ?> paramMap, HashMap<Object, Object> paramHashMap) {
    boolean bool = Ze2.Zk();
    for (Map.Entry<?, ?> entry : paramMap.entrySet()) {
      Object object1 = entry.getKey();
      if (object1.getClass().isInterface())
        object1 = ZL(object1, paramClass1); 
      Object object2 = entry.getValue();
      if (object2.getClass().isInterface())
        object2 = ZL(object2, paramClass2); 
      paramHashMap.put(object1, object2);
      if (!bool)
        break; 
    } 
  }
  
  private Object ZL(Object paramObject, Class<?> paramClass) {
    try {
      if (paramObject == null)
        return null; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof Proxy)
        return paramObject; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return ZI(paramObject, Zo(paramObject, paramClass));
  }
  
  private Object ZI(Object paramObject, Class<?>... paramVarArgs) {
    try {
      if (paramObject == null)
        return null; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Class<?> clazz = paramObject.getClass();
    return Proxy.newProxyInstance(clazz.getClassLoader(), paramVarArgs, new Zg_c(paramObject, this.Zb, this.ZJ, this.Zt));
  }
  
  private static Class<?>[] Zo(Object paramObject, Class<?> paramClass) {
    boolean bool = Ze2.Zj();
    LinkedHashSet<Class<?>> linkedHashSet = new LinkedHashSet();
    try {
      if (paramClass.isInterface())
        linkedHashSet.add(paramClass); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Class<?> clazz = paramObject.getClass();
    while (clazz != null) {
      Class[] arrayOfClass = clazz.getInterfaces();
      linkedHashSet.addAll(Arrays.asList(arrayOfClass));
      clazz = clazz.getSuperclass();
      if (bool)
        break; 
    } 
    return (Class[])linkedHashSet.<Class<?>[]>toArray((Class<?>[][])new Class[0]);
  }
  
  static Class<?> Zf(Type paramType) {
    Type type = ZO(paramType);
    if (type instanceof Class) {
      Class<?> clazz = (Class)type;
      try {
      
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      return clazz.isInterface() ? clazz : null;
    } 
    return null;
  }
  
  private static Type ZO(Type paramType) {
    if (paramType instanceof ParameterizedType) {
      ParameterizedType parameterizedType = (ParameterizedType)paramType;
      Type[] arrayOfType = parameterizedType.getActualTypeArguments();
      try {
      
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      return (arrayOfType.length == 1) ? arrayOfType[0] : null;
    } 
    return null;
  }
  
  private static Type[] Zg(Type paramType) {
    if (paramType instanceof ParameterizedType) {
      ParameterizedType parameterizedType = (ParameterizedType)paramType;
      Type[] arrayOfType = parameterizedType.getActualTypeArguments();
      try {
      
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      return (arrayOfType.length == 2) ? arrayOfType : null;
    } 
    return null;
  }
  
  private Object lambda$wrapCollection$1(Class<?> paramClass, Object paramObject) {
    return ZL(paramObject, paramClass);
  }
  
  private Object lambda$wrapArray$0(Object paramObject1, Object paramObject2) {
    return ZL(paramObject2, paramObject1.getClass().getComponentType());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'G>ò.$ª o2\\fÖx¦Bñ\áªìGÁ^w8Â¦øãÙtà-º×§=4/Ónië'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #110
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc '«0ë«9)¨»Då·¼Ùø]ÜEp³xW{Þ\\b_È'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #19
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #15
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zg_c.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zg_c.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #8
    //   214: goto -> 244
    //   217: bipush #127
    //   219: goto -> 244
    //   222: bipush #74
    //   224: goto -> 244
    //   227: bipush #61
    //   229: goto -> 244
    //   232: bipush #58
    //   234: goto -> 244
    //   237: bipush #102
    //   239: goto -> 244
    //   242: bipush #102
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEC05) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
package net.portswigger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Zrz0 {
  private final T Zb;
  
  final Zby ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zrz0(Zby paramZby, T paramT) {
    this.Zb = paramT;
  }
  
  public Zu0 ZN(Zz0 paramZz0, Zat paramZat, Zsv paramZsv, Zif paramZif) throws Throwable {
    try {
      return ZP(paramZz0, paramZat.ZX, paramZat, paramZsv, paramZif);
    } catch (Zrme zrme) {
      Zah.Zl(zrme, Zk_.IGNORED);
      return Zrxs.Zv(this.ZK.ZA.Zz(Zc2.class, zrme));
    } catch (Zrm1 zrm1) {
      Zah.Zl(zrm1, Zk_.IGNORED);
      return Zrxs.Zr(this.ZK.ZA.Zz(Zc2.class, zrm1));
    } catch (Zqb|Zlh zqb) {
      Zah.Zl(zqb, Zk_.IGNORED);
      return Zrxs.ZE(zqb.getMessage());
    } 
  }
  
  private Zu0 ZP(Zz0 paramZz0, String paramString, Zat paramZat, Zsv paramZsv, Zif paramZif) throws Throwable {
    List<Zqi> list = Zz8.ZI(paramString);
    String str = Zby.Zf();
    try {
      if (list == null)
        return Zrxs.ZE(a(-23208, -30801)); 
    } catch (InvocationTargetException invocationTargetException) {
      throw a(null);
    } 
    Type type = this.Zb.getClass();
    T t = this.Zb;
    Zsz zsz = null;
    int i = 0;
    while (i < list.size()) {
      Zcy zcy = this.ZK.ZA.ZM(type);
      Zqi zqi = list.get(i);
      try {
        if (zqi.Zq != Zrz6.METHOD_NAME_OR_IDENTIFIER)
          return Zrxs.ZE(a(-23211, -14434)); 
      } catch (InvocationTargetException invocationTargetException) {
        throw a(null);
      } 
      Zni zni = new Zni(ZZ(paramZz0, i, zqi, list, zcy, paramZsv), zqi.ZU);
      if (!zcy.Ze(zni)) {
        ArrayList<String> arrayList = new ArrayList();
        for (Zz0 zz0 : Zz0.ZO) {
          try {
            if (zcy.Ze(new Zni(ZZ(zz0, i, zqi, list, zcy, paramZsv), zqi.ZU)))
              arrayList.add(zz0.ZX); 
          } catch (InvocationTargetException invocationTargetException) {
            throw a(null);
          } 
          if (str == null)
            break; 
        } 
        try {
          if (arrayList.size() > 0)
            return Zrxs.Zd(arrayList.<String>toArray(new String[0])); 
        } catch (InvocationTargetException invocationTargetException) {
          throw a(null);
        } 
        return Zrxs.Zo();
      } 
      Zo3 zo3 = zcy.ZO(zni);
      Method method = Zag.ZJ(t.getClass(), zo3.Zw);
      Zbe zbe = paramZif.Zr(method);
      try {
        if (zbe.ZT != null)
          return zbe.ZT; 
      } catch (InvocationTargetException invocationTargetException) {
        throw a(null);
      } 
      Object object = null;
      try {
        if (zo3.ZY.ZZ != null) {
          try {
            if (list.size() <= i + 1)
              return Zrxs.ZE(a(-23206, 19359)); 
          } catch (InvocationTargetException invocationTargetException) {
            throw a(null);
          } 
          Zqi zqi1 = list.get(++i);
          try {
            if (zqi1.Zq != Zrz6.METHOD_NAME_OR_IDENTIFIER)
              return Zrxs.ZE(a(-23202, 9372) + a(-23202, 9372)); 
          } catch (InvocationTargetException invocationTargetException) {
            throw a(null);
          } 
          object = ZM(zo3.ZY.ZZ, zqi1.ZU);
        } 
      } catch (InvocationTargetException invocationTargetException) {
        throw a(null);
      } 
      String str1 = a(-23209, -29791);
      try {
        if (i == list.size() - 1 && paramZsv != null)
          str1 = Ze_.ZX(paramZsv.Zy); 
      } catch (InvocationTargetException invocationTargetException) {
        throw a(null);
      } 
      Object[] arrayOfObject = null;
      if (i + 1 < list.size()) {
        Zqi zqi1 = list.get(i + 1);
        switch (Zmh.Zv[zqi1.Zq.ordinal()]) {
          case 1:
            i++;
            str1 = zqi1.ZU;
          case 2:
            try {
              if (!Zz0.Zg.equals(paramZz0))
                return Zrxs.ZE(a(-23215, -8473)); 
            } catch (InvocationTargetException invocationTargetException) {
              throw a(null);
            } 
            str1 = Zo9.Zb(this.ZK.ZA, zo3.ZY, list, i + 1);
            try {
              if (str1 == null)
                return Zrxs.ZE(a(-23216, 25170)); 
            } catch (InvocationTargetException invocationTargetException) {
              throw a(null);
            } 
            i += list.size() - i;
            arrayOfObject = this.ZK.ZA.ZG(zo3.ZY, Zv3.Zx(str1));
            break;
        } 
      } 
      if (arrayOfObject == null)
        arrayOfObject = this.ZK.ZA.ZG(zo3.ZY, Zv3.Zx(ZZ(str1, zo3.ZY, false))); 
      if (object != null) {
        Object[] arrayOfObject1 = new Object[1 + arrayOfObject.length];
        arrayOfObject1[0] = object;
        System.arraycopy(arrayOfObject, 0, arrayOfObject1, 1, arrayOfObject.length);
        arrayOfObject = arrayOfObject1;
      } 
      if (zo3.ZY.Zn) {
        Object[] arrayOfObject1 = new Object[1 + arrayOfObject.length];
        arrayOfObject1[0] = paramZat;
        System.arraycopy(arrayOfObject, 0, arrayOfObject1, 1, arrayOfObject.length);
        arrayOfObject = arrayOfObject1;
      } 
      zsz = new Zsz(this.ZK, zcy, zo3);
      try {
        t = (T)zo3.Zw.invoke(t, arrayOfObject);
      } catch (InvocationTargetException invocationTargetException) {
        Zah.Zl(invocationTargetException, Zk_.IGNORED);
        throw ZK(invocationTargetException.getTargetException());
      } 
      type = zo3.Zg;
      i++;
      continue;
      if (str == null)
        break; 
    } 
    try {
      if (zsz == null)
        throw new UnsupportedOperationException(a(-23229, 21521)); 
    } catch (InvocationTargetException invocationTargetException) {
      throw a(null);
    } 
    try {
      if (void.class.equals(type))
        return Zu0.Zm(); 
    } catch (InvocationTargetException invocationTargetException) {
      throw a(null);
    } 
    try {
      if (Zz0.ZW.equals(paramZz0)) {
        try {
          if (!(t instanceof Zht)) {
            try {
              (new Object[6])[0] = paramString;
              (new Object[6])[1] = zsz.Zy.Zj;
              (new Object[6])[2] = zsz.Zl.Za;
              (new Object[6])[3] = zsz.Zl.Zw.getName();
              (new Object[6])[4] = Zht.class;
            } catch (InvocationTargetException invocationTargetException) {
              throw a(null);
            } 
            throw new UnsupportedOperationException(String.format(a(-23225, 9058), new Object[] { null, null, null, null, null, (t == null) ? a(-23201, -32454) : (a(-23210, -3028) + a(-23210, -3028)) }));
          } 
        } catch (InvocationTargetException invocationTargetException) {
          throw a(null);
        } 
        return Zu0.ZD((Zht)t);
      } 
    } catch (InvocationTargetException invocationTargetException) {
      throw a(null);
    } 
    try {
      if (Zz0.Zo.equals(paramZz0)) {
        try {
          if (!(t instanceof Zc1)) {
            try {
              (new Object[6])[0] = paramString;
              (new Object[6])[1] = zsz.Zy.Zj;
              (new Object[6])[2] = zsz.Zl.Za;
              (new Object[6])[3] = zsz.Zl.Zw.getName();
              (new Object[6])[4] = Zc1.class;
            } catch (InvocationTargetException invocationTargetException) {
              throw a(null);
            } 
            throw new UnsupportedOperationException(String.format(a(-23226, 440), new Object[] { null, null, null, null, null, (t == null) ? a(-23203, -29673) : (a(-23212, -20223) + a(-23212, -20223)) }));
          } 
        } catch (InvocationTargetException invocationTargetException) {
          throw a(null);
        } 
        try {
        
        } catch (InvocationTargetException invocationTargetException) {
          throw a(null);
        } 
        return Zu0.Zf((t.getClass() == Zc1.class) ? null : this.ZK.ZA.ZQ(t));
      } 
    } catch (InvocationTargetException invocationTargetException) {
      throw a(null);
    } 
    try {
      if (zsz.Zl.Zw.getAnnotation(Zu2.class) != null)
        return Zu0.Z_((byte[])t); 
    } catch (InvocationTargetException invocationTargetException) {
      throw a(null);
    } 
    return Zu0.ZR(this.ZK.ZA.Zk(zsz.Zl.Zw.getGenericReturnType(), t, Zt7.Zp(zsz.Zl.Zw.getGenericReturnType())).toString());
  }
  
  private Throwable ZK(Throwable paramThrowable) {
    Zrm6 zrm6 = paramThrowable.getClass().<Zrm6>getAnnotation(Zrm6.class);
    String str = Zby.Zf();
    if (zrm6 != null)
      try {
        Class<? extends Zk3> clazz = zrm6.value();
        Type[] arrayOfType1 = clazz.getGenericInterfaces();
        Type type = null;
        Type[] arrayOfType2 = arrayOfType1;
        int i = arrayOfType2.length;
        byte b = 0;
        while (b < i) {
          Type type1 = arrayOfType2[b];
          ParameterizedType parameterizedType = (ParameterizedType)type1;
          if (Zk3.class.isAssignableFrom((Class)parameterizedType.getRawType())) {
            Type[] arrayOfType = parameterizedType.getActualTypeArguments();
            type = arrayOfType[0];
          } 
          b++;
          if (str == null)
            break; 
        } 
        try {
          if (type == null || !Zt7.Zc(type, paramThrowable.getClass()))
            return paramThrowable; 
        } catch (Exception exception) {
          throw a(null);
        } 
        Zk3<Throwable> zk3 = clazz.newInstance();
        return zk3.Zt(paramThrowable);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.IGNORED);
        return paramThrowable;
      }  
    return paramThrowable;
  }
  
  private Object ZM(Zm7 paramZm7, String paramString) {
    if (String.class.equals(paramZm7.Zq))
      paramString = "\"" + paramString + "\""; 
    return this.ZK.ZA.ZY((Class)paramZm7.Zq, paramString);
  }
  
  private String ZZ(String paramString, Zrx_ paramZrx_, boolean paramBoolean) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual ZE : ()I
    //   4: iconst_1
    //   5: if_icmpne -> 174
    //   8: aload_2
    //   9: iconst_0
    //   10: invokevirtual Ze : (I)Lnet/portswigger/Zm7;
    //   13: getfield Zq : Ljava/lang/reflect/Type;
    //   16: astore #4
    //   18: aload #4
    //   20: instanceof java/lang/reflect/ParameterizedType
    //   23: ifeq -> 70
    //   26: aload #4
    //   28: checkcast java/lang/reflect/ParameterizedType
    //   31: invokeinterface getRawType : ()Ljava/lang/reflect/Type;
    //   36: ldc java/util/Map
    //   38: if_acmpeq -> 138
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: aload #4
    //   50: checkcast java/lang/reflect/ParameterizedType
    //   53: invokeinterface getRawType : ()Ljava/lang/reflect/Type;
    //   58: ldc java/util/List
    //   60: if_acmpeq -> 138
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: aload_0
    //   71: getfield ZK : Lnet/portswigger/Zby;
    //   74: getfield ZA : Lnet/portswigger/Ztj;
    //   77: aload #4
    //   79: invokevirtual ZW : (Ljava/lang/reflect/Type;)Z
    //   82: ifeq -> 174
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: iload_3
    //   93: ifeq -> 138
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: aload #4
    //   105: instanceof java/lang/Class
    //   108: ifeq -> 174
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: ldc java/lang/Enum
    //   120: aload #4
    //   122: checkcast java/lang/Class
    //   125: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   128: ifne -> 174
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: sipush #-23213
    //   141: sipush #6311
    //   144: invokestatic a : (II)Ljava/lang/String;
    //   147: iconst_2
    //   148: anewarray java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: aload_2
    //   154: iconst_0
    //   155: invokevirtual Ze : (I)Lnet/portswigger/Zm7;
    //   158: getfield ZF : Ljava/lang/String;
    //   161: aastore
    //   162: dup
    //   163: iconst_1
    //   164: aload_1
    //   165: aastore
    //   166: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   169: areturn
    //   170: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   173: athrow
    //   174: aload_1
    //   175: areturn
    // Exception table:
    //   from	to	target	type
    //   18	41	44	net/portswigger/Zrme
    //   26	63	66	net/portswigger/Zrme
    //   48	85	88	net/portswigger/Zrme
    //   70	96	99	net/portswigger/Zrme
    //   92	111	114	net/portswigger/Zrme
    //   103	131	134	net/portswigger/Zrme
    //   118	170	170	net/portswigger/Zrme
  }
  
  private Zz0 ZZ(Zz0 paramZz0, int paramInt, Zqi paramZqi, List<Zqi> paramList, Zcy paramZcy, Zsv paramZsv) {
    try {
      if (Zz0.Zg.equals(paramZz0))
        return Zz0.Zg; 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    try {
      if (Zh(paramZz0, paramInt, paramZqi, paramList, paramZcy, paramZsv))
        return paramZz0; 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    return Zz0.Zg;
  }
  
  private boolean Zh(Zz0 paramZz0, int paramInt, Zqi paramZqi, List<Zqi> paramList, Zcy paramZcy, Zsv paramZsv) {
    try {
      if (paramInt == paramList.size() - 1)
        try {
          if (paramZqi.Zq == Zrz6.METHOD_NAME_OR_IDENTIFIER)
            return true; 
        } catch (Zrme zrme) {
          throw a(null);
        }  
    } catch (Zrme zrme) {
      throw a(null);
    } 
    try {
      if (paramInt + 1 >= paramList.size())
        return false; 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    Zqi zqi = paramList.get(paramInt + 1);
    try {
      if (paramInt == paramList.size() - 2)
        try {
          if (zqi.Zq == Zrz6.JSON) {
            try {
              if (paramZsv != null)
                throw new Zrme(a(-23214, -2608)); 
            } catch (Zrme zrme) {
              throw a(null);
            } 
            return true;
          } 
        } catch (Zrme zrme) {
          throw a(null);
        }  
    } catch (Zrme zrme) {
      throw a(null);
    } 
    try {
      if (paramInt == paramList.size() - 2 && zqi.Zq == Zrz6.METHOD_NAME_OR_IDENTIFIER) {
        Zni zni = new Zni(paramZz0, paramZqi.ZU);
        try {
          if (!paramZcy.Ze(zni))
            return false; 
        } catch (Zrme zrme) {
          throw a(null);
        } 
        Zo3 zo3 = paramZcy.ZO(zni);
        try {
          if (zo3.ZY.ZZ != null)
            return true; 
        } catch (Zrme zrme) {
          throw a(null);
        } 
      } 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    try {
      if (paramInt == paramList.size() - 3)
        try {
          if (zqi.Zq == Zrz6.METHOD_NAME_OR_IDENTIFIER && ((Zqi)paramList.get(paramInt + 2)).Zq == Zrz6.JSON) {
            Zni zni = new Zni(paramZz0, paramZqi.ZU);
            try {
              if (!paramZcy.Ze(zni))
                return false; 
            } catch (Zrme zrme) {
              throw a(null);
            } 
            Zo3 zo3 = paramZcy.ZO(zni);
            try {
              if (zo3.ZY.ZZ != null) {
                try {
                  if (paramZsv != null)
                    throw new Zrme(a(-23205, 18185)); 
                } catch (Zrme zrme) {
                  throw a(null);
                } 
                return true;
              } 
            } catch (Zrme zrme) {
              throw a(null);
            } 
          } 
        } catch (Zrme zrme) {
          throw a(null);
        }  
    } catch (Zrme zrme) {
      throw a(null);
    } 
    return false;
  }
  
  public Zb4<Zu0, Zzw> Zh(Zat paramZat, Znn paramZnn, Zif paramZif) {
    try {
      if (!(this.Zb instanceof Zfa))
        return Zb4.Zf(Zrxs.ZE(a(-23227, 17365))); 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    try {
      if (!paramZat.ZX.equals(a(-23228, 19234)))
        try {
          if (!paramZat.ZX.equals(a(-23207, 31949)))
            return Zb4.Zf(Zrxs.ZE(a(-23204, -5646))); 
        } catch (Zrme zrme) {
          throw a(null);
        }  
    } catch (Zrme zrme) {
      throw a(null);
    } 
    return ((Zfa)this.Zb).Zw(paramZat, paramZnn, paramZif);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'r%·Ñ¾..B(Þ¨Ú}$)ß4\\füêuT<ño¼ o³ý\\nÎÎôsQ=}Ká/«´áZpqa½hl3\\rZY\ýböÏ¦ÍªÍWkTôÉPÁ©z\\rpzsñ%G¼Ñr=å¯g\Ix\\tpõ)Öä»,Ff¹KÚÿö´ù]¹ð&ý³WÖo¿ RÌBQXe^S§éÁVï¦tÀ\Ò£ÉVüLÄ{d,uàg²µbÒ^åD?2}ÃîP¶Fô]"ñÜ-$¿¡2èO¸µYCUp¨# yRj©îv2ûÅvFe£ÝÙãÁ&àÑúÓ:0&ýjFÊ%Ï\\t²î9¢¡%Þ©ÀÜ1à#MÖää32Ç¹îÍKî\\rþ®­¸¦üO¾ ²&÷VÎÚJ|Ùÿ\Ö8® ÈM*6ñÿ]çé¨¨':ºh)®|iK÷ìí_I¿[;Î\äà²Ãñ£æ5ÚÞ\\rÛßù3ÿs1ßíCÿÉ½Ûl3iÚ¢ö%ø`ò×÷_ìº§( "lu³&­¢­äX\\n¦\\n.CØyìUö±öòL%õrÁZäÇÈLæl­°e,ZÝM{#ó¿pXd¾\\nP`g¤Ù±Ç{ ÊõBÕÜ3yïÀ¬zC÷öë´oá¢óJ$õ­E'ÙÉ-V'§YÌÊ\>Û5ëÅ3ÖM5øÄÉTN\\r.©®äô#8lö8yuZ Ìqæ"kêyè­p\\b6½ÕsHþ0gÎÄqPFÎ´@HùV½GtíMØÐµÇÞ°M\\r'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #75
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'Ã¿À!«½*¬Ô\\bJ=ñM\\ftÛ\\fN£ÙõnN7n8@xÔ²Æ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_3
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #33
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic net/portswigger/Zrz0.a : [Ljava/lang/String;
    //   130: bipush #21
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/Zrz0.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #112
    //   214: goto -> 244
    //   217: bipush #15
    //   219: goto -> 244
    //   222: bipush #10
    //   224: goto -> 244
    //   227: bipush #17
    //   229: goto -> 244
    //   232: bipush #106
    //   234: goto -> 244
    //   237: bipush #53
    //   239: goto -> 244
    //   242: bipush #22
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA557) & 0xFFFF;
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
      byte b1 = 21;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrz0.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */
package com.fasterxml.Zoz;

import burp.Zbqc;
import com.fasterxml.Z_.Zi;
import com.fasterxml.Zb.Zmk;
import com.fasterxml.Zg0;
import com.fasterxml.Zg1;
import com.fasterxml.Zgd;
import com.fasterxml.Zge;
import com.fasterxml.Zgg;
import com.fasterxml.Zgn;
import com.fasterxml.Zgq;
import com.fasterxml.Zgy;
import com.fasterxml.Zgz;
import com.fasterxml.Zh.Zi;
import com.fasterxml.Zh.Zo;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zj.Zqn;
import com.fasterxml.Zj.Zv;
import com.fasterxml.Zk.Zs;
import com.fasterxml.Zk.Zt;
import com.fasterxml.Zle;
import com.fasterxml.Zm.Ze8;
import com.fasterxml.Zm.Zee;
import com.fasterxml.Zm.Zi;
import com.fasterxml.Zm.Zu;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zn.Zx;
import com.fasterxml.Zo3.Zj;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zw;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyb;
import com.fasterxml.Zor.Zyf;
import com.fasterxml.Zor.Zyh;
import com.fasterxml.Zor.Zz;
import com.fasterxml.Zp.Zk;
import com.fasterxml.Zq0;
import com.fasterxml.Zq3;
import com.fasterxml.Zqg;
import com.fasterxml.Zqj;
import com.fasterxml.Zqq;
import com.fasterxml.Zqr;
import com.fasterxml.Zqs;
import com.fasterxml.Zqv;
import com.fasterxml.Zv4;
import com.fasterxml.Zv5;
import com.fasterxml.Zv7;
import com.fasterxml.Zv8;
import com.fasterxml.Zva;
import com.fasterxml.Zvb;
import com.fasterxml.Zvc;
import com.fasterxml.Zvd;
import com.fasterxml.Zve;
import com.fasterxml.Zvi;
import com.fasterxml.Zvl;
import com.fasterxml.Zvm;
import com.fasterxml.Zvx;
import com.fasterxml.Zvy;
import com.fasterxml.Zw.Z_;
import com.fasterxml.Zw.Za;
import com.fasterxml.Zw.Zb;
import com.fasterxml.Zw.Zg;
import com.fasterxml.Zw.Zk;
import com.fasterxml.Zw.Zp;
import com.fasterxml.Zw.Zs;
import com.fasterxml.Zw.Zv;
import com.fasterxml.Zw.Zy;
import com.fasterxml.Zw.Zz;
import com.fasterxml.Zy1;
import com.fasterxml.Zy3;
import com.fasterxml.Zy6;
import com.fasterxml.Zy7;
import com.fasterxml.Zyi;
import com.fasterxml.Zyj;
import com.fasterxml.Zyk;
import com.fasterxml.Zyl;
import com.fasterxml.Zyn;
import com.fasterxml.Zyx;
import com.fasterxml.Zz6;
import com.fasterxml.Zz_;
import com.fasterxml.Zzh;
import com.fasterxml.Zzj;
import com.fasterxml.Zzv;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class Zd extends Zt implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final Class<? extends Annotation>[] Zo;
  
  private static final Class<? extends Annotation>[] ZK;
  
  private static final Zi Zd;
  
  protected transient Zu<String, Boolean> Zt = new Zu(48, 48);
  
  protected boolean Zs = true;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmk version() {
    return Zv.ZV;
  }
  
  protected Object readResolve() {
    try {
      if (this.Zt == null)
        this.Zt = new Zu(48, 48); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this;
  }
  
  public boolean Zl(Annotation paramAnnotation) {
    Class<? extends Annotation> clazz = paramAnnotation.annotationType();
    String str = clazz.getName();
    Boolean bool = (Boolean)this.Zt.ZM(str);
    try {
      if (bool == null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        bool = Boolean.valueOf((clazz.getAnnotation(Zv4.class) != null));
        this.Zt.ZC(str, bool);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return bool.booleanValue();
  }
  
  public String[] ZH(Zf<?> paramZf, Zia paramZia, Enum<?>[] paramArrayOfEnum, String[] paramArrayOfString) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    int i = Ziv.Zv();
    for (Zi6 zi6 : paramZia.ZS()) {
      Zy1 zy1 = zi6.<Zy1>ZU(Zy1.class);
      if (zy1 != null) {
        String str = zy1.value();
        try {
          if (str != null)
            try {
              if (!str.isEmpty())
                linkedHashMap.put(zi6.ZW(), str); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
      if (i != 0)
        break; 
    } 
    byte b = 0;
    int j = paramArrayOfEnum.length;
    while (b < j) {
      String str1 = paramArrayOfEnum[b].name();
      String str2 = (String)linkedHashMap.get(str1);
      try {
        if (str2 != null)
          paramArrayOfString[b] = str2; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      b++;
      if (i != 0)
        break; 
    } 
    return paramArrayOfString;
  }
  
  @Deprecated
  public void ZJ(Class<?> paramClass, Enum<?>[] paramArrayOfEnum, String[][] paramArrayOfString) {
    Field[] arrayOfField = paramClass.getDeclaredFields();
    int j = arrayOfField.length;
    byte b = 0;
    int i = Ziv.ZM();
    while (b < j) {
      Field field = arrayOfField[b];
      if (field.isEnumConstant()) {
        Zgz zgz = field.<Zgz>getAnnotation(Zgz.class);
        if (zgz != null) {
          String[] arrayOfString = zgz.value();
          if (arrayOfString.length != 0) {
            String str = field.getName();
            byte b1 = 0;
            int k = paramArrayOfEnum.length;
            while (b1 < k) {
              try {
                if (str.equals(paramArrayOfEnum[b1].name()))
                  paramArrayOfString[b1] = arrayOfString; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              b1++;
              if (i == 0)
                break; 
            } 
          } 
        } 
      } 
      b++;
      if (i == 0)
        break; 
    } 
  }
  
  public void Zt(Zf<?> paramZf, Zia paramZia, Enum<?>[] paramArrayOfEnum, String[][] paramArrayOfString) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<Zi6> iterator = paramZia.ZS().iterator();
    int i = Ziv.ZM();
    while (iterator.hasNext()) {
      Zi6 zi6 = iterator.next();
      Zgz zgz = zi6.<Zgz>ZU(Zgz.class);
      try {
        if (zgz != null)
          hashMap.putIfAbsent(zi6.ZW(), zgz.value()); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      if (i == 0)
        break; 
    } 
    byte b = 0;
    int j = paramArrayOfEnum.length;
    while (b < j) {
      Enum<?> enum_ = paramArrayOfEnum[b];
      paramArrayOfString[b] = (String[])hashMap.getOrDefault(enum_.name(), new String[0]);
      b++;
      if (i == 0)
        break; 
    } 
  }
  
  @Deprecated
  public Enum<?> ZW(Class<Enum<?>> paramClass) {
    return Zx.ZR(paramClass, Zgg.class);
  }
  
  public Enum<?> ZP(Zia paramZia, Enum<?>[] paramArrayOfEnum) {
    Iterator<Zi6> iterator = paramZia.ZS().iterator();
    int i = Ziv.ZM();
    while (iterator.hasNext()) {
      Ziv ziv = iterator.next();
      try {
        if (ziv.Zf().ZF() || i == 0) {
          Zgg zgg = (Zgg)ZV(ziv, Zgg.class);
          try {
            if (zgg != null || i == 0) {
              Enum<?>[] arrayOfEnum = paramArrayOfEnum;
              int j = arrayOfEnum.length;
              byte b = 0;
              while (b < j) {
                Enum<?> enum_ = arrayOfEnum[b];
                try {
                  if (enum_.name().equals(ziv.ZW()))
                    return enum_; 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                b++;
                if (i == 0)
                  break; 
              } 
              if (i == 0)
                break; 
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  public Zr Zo(Zia paramZia) {
    Zge zge = (Zge)ZV(paramZia, Zge.class);
    try {
      if (zge == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str = zge.Zh();
    try {
      if (str != null && str.isEmpty())
        str = null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zr.ZE(zge.value(), str);
  }
  
  public Boolean ZB(Zia paramZia) {
    Zle zle = (Zle)ZV(paramZia, Zle.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zle == null) ? null : Boolean.valueOf(zle.value());
  }
  
  public Zve ZH(Zf<?> paramZf, Ziv paramZiv) {
    Zvb zvb = (Zvb)ZV(paramZiv, Zvb.class);
    try {
      if (zvb == null)
        return Zve.ZE(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zve.Zj(zvb);
  }
  
  @Deprecated
  public Zve Za(Ziv paramZiv) {
    return ZH((Zf<?>)null, paramZiv);
  }
  
  public Zyn Z_(Zf<?> paramZf, Ziv paramZiv) {
    Zqr zqr = (Zqr)ZV(paramZiv, Zqr.class);
    try {
      if (zqr == null)
        return Zyn.ZG(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zyn.Zf(zqr);
  }
  
  public Object Zb(Ziv paramZiv) {
    Zvx zvx = (Zvx)ZV(paramZiv, Zvx.class);
    if (zvx != null) {
      String str = zvx.value();
      try {
        if (!str.isEmpty())
          return str; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  public Object Zv(Zia paramZia) {
    Zs zs = (Zs)ZV(paramZia, Zs.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zs == null) ? null : zs.value();
  }
  
  public Object Zg(Zf<?> paramZf, Zia paramZia) {
    Zb zb = (Zb)ZV(paramZia, Zb.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zb == null) ? null : zb.value();
  }
  
  public Zi8<?> Zc(Zia paramZia, Zi8<?> paramZi8) {
    Zqj zqj = (Zqj)ZV(paramZia, Zqj.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zqj == null) ? paramZi8 : (Zi8<?>)paramZi8.ZU(zqj);
  }
  
  public String ZW(Ziz paramZiz) {
    Zr zr = Zf(paramZiz);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zr == null) ? null : zr.Zb();
  }
  
  public List<Zr> Ze(Ziv paramZiv) {
    Zgz zgz = (Zgz)ZV(paramZiv, Zgz.class);
    int i = Ziv.ZM();
    try {
      if (zgz == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String[] arrayOfString = zgz.value();
    int j = arrayOfString.length;
    try {
      if (j == 0)
        return Collections.emptyList(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    ArrayList<Zr> arrayList = new ArrayList(j);
    byte b = 0;
    while (b < j) {
      arrayList.add(Zr.Zf(arrayOfString[b]));
      b++;
      if (i == 0)
        break; 
    } 
    return arrayList;
  }
  
  public boolean ZV(Ziz paramZiz) {
    return Zz(paramZiz);
  }
  
  public Boolean ZZ(Ziz paramZiz) {
    Zy1 zy1 = (Zy1)ZV(paramZiz, Zy1.class);
    try {
      if (zy1 != null)
        return Boolean.valueOf(zy1.ZZ()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public Zyj Zt(Ziv paramZiv) {
    Zy1 zy1 = (Zy1)ZV(paramZiv, Zy1.class);
    try {
      if (zy1 != null)
        return zy1.Zk(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public String Z_(Ziv paramZiv) {
    Zg1 zg1 = (Zg1)ZV(paramZiv, Zg1.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zg1 == null) ? null : zg1.value();
  }
  
  public Integer ZM(Ziv paramZiv) {
    Zy1 zy1 = (Zy1)ZV(paramZiv, Zy1.class);
    if (zy1 != null) {
      int i = zy1.Zh();
      try {
        if (i != -1)
          return Integer.valueOf(i); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  public String Zu(Ziv paramZiv) {
    Zy1 zy1 = (Zy1)ZV(paramZiv, Zy1.class);
    try {
      if (zy1 == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str = zy1.ZH();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return str.isEmpty() ? null : str;
  }
  
  public Zgy ZY(Ziv paramZiv) {
    Zzv zzv = (Zzv)ZV(paramZiv, Zzv.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zzv == null) ? null : Zgy.ZG(zzv);
  }
  
  public Zz ZB(Ziz paramZiz) {
    Zqs zqs = (Zqs)ZV(paramZiz, Zqs.class);
    try {
      if (zqs != null)
        return Zz.Zg(zqs.value()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zq0 zq0 = (Zq0)ZV(paramZiz, Zq0.class);
    try {
      if (zq0 != null)
        return Zz.ZJ(zq0.value()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public Zee Za(Ziz paramZiz) {
    Zy6 zy6 = (Zy6)ZV(paramZiz, Zy6.class);
    try {
      if (zy6 != null)
        try {
          if (zy6.ZG()) {
            String str1 = zy6.Zz();
            String str2 = zy6.Zg();
            return Zee.Zg(str1, str2);
          } 
          return null;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public Zz6 ZU(Ziz paramZiz) {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: aload_0
    //   4: aload_1
    //   5: ldc com/fasterxml/Zyo
    //   7: invokevirtual ZV : (Lcom/fasterxml/Zoz/Ziv;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   10: checkcast com/fasterxml/Zyo
    //   13: astore_3
    //   14: istore_2
    //   15: aload_3
    //   16: ifnonnull -> 25
    //   19: aconst_null
    //   20: areturn
    //   21: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   24: athrow
    //   25: aload_3
    //   26: invokestatic Zo : (Lcom/fasterxml/Zyo;)Lcom/fasterxml/Zz6;
    //   29: astore #4
    //   31: aload #4
    //   33: invokevirtual Zn : ()Z
    //   36: ifne -> 113
    //   39: aload_1
    //   40: instanceof com/fasterxml/Zoz/Ziq
    //   43: ifne -> 66
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   52: athrow
    //   53: aload_1
    //   54: invokevirtual ZN : ()Ljava/lang/Class;
    //   57: invokevirtual getName : ()Ljava/lang/String;
    //   60: astore #5
    //   62: iload_2
    //   63: ifeq -> 104
    //   66: aload_1
    //   67: checkcast com/fasterxml/Zoz/Ziq
    //   70: astore #6
    //   72: aload #6
    //   74: invokevirtual ZL : ()I
    //   77: ifne -> 93
    //   80: aload_1
    //   81: invokevirtual ZN : ()Ljava/lang/Class;
    //   84: invokevirtual getName : ()Ljava/lang/String;
    //   87: astore #5
    //   89: iload_2
    //   90: ifeq -> 104
    //   93: aload #6
    //   95: iconst_0
    //   96: invokevirtual ZP : (I)Ljava/lang/Class;
    //   99: invokevirtual getName : ()Ljava/lang/String;
    //   102: astore #5
    //   104: aload #4
    //   106: aload #5
    //   108: invokevirtual ZC : (Ljava/lang/Object;)Lcom/fasterxml/Zz6;
    //   111: astore #4
    //   113: aload #4
    //   115: areturn
    // Exception table:
    //   from	to	target	type
    //   15	21	21	java/lang/IllegalArgumentException
    //   31	46	49	java/lang/IllegalArgumentException
  }
  
  @Deprecated
  public Object Zn(Ziz paramZiz) {
    Zz6 zz6 = ZU(paramZiz);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zz6 == null) ? null : zz6.Zf();
  }
  
  public Class<?>[] Zc(Ziv paramZiv) {
    Zvy zvy = (Zvy)ZV(paramZiv, Zvy.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zvy == null) ? null : zvy.value();
  }
  
  public Ziq Zs(Zf<?> paramZf, Ziq paramZiq1, Ziq paramZiq2) {
    Class<?> clazz1 = paramZiq1.ZP(0);
    Class<?> clazz2 = paramZiq2.ZP(0);
    try {
      if (clazz1.isPrimitive()) {
        try {
          if (!clazz2.isPrimitive())
            return paramZiq1; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return null;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (clazz2.isPrimitive())
        return paramZiq2; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (clazz1 == String.class) {
        try {
          if (clazz2 != String.class)
            return paramZiq1; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        try {
          if (clazz2 == String.class)
            return paramZiq2; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public Zr ZM(Zf<?> paramZf, Zi6 paramZi6, Zr paramZr) {
    return null;
  }
  
  public Zgn ZU(Zf<?> paramZf, Ziv paramZiv) {
    Zv5 zv5 = (Zv5)ZV(paramZiv, Zv5.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zv5 == null) ? null : Zgn.Zz(zv5);
  }
  
  public Zk<?> ZP(Zf<?> paramZf, Zia paramZia, Zk paramZk) {
    return ZC(paramZf, paramZia, paramZk);
  }
  
  public Zk<?> ZY(Zf<?> paramZf, Ziz paramZiz, Zk paramZk) {
    try {
      if (!paramZk.ZH())
        try {
          return !paramZk.ZP() ? ZC(paramZf, paramZiz, paramZk) : null;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public Zk<?> ZU(Zf<?> paramZf, Ziz paramZiz, Zk paramZk) {
    try {
      if (paramZk.ZB() == null)
        throw new IllegalArgumentException(a(14489, 31242) + paramZk + ")"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ZC(paramZf, paramZiz, paramZk);
  }
  
  public List<com.fasterxml.Zp.Zd> ZW(Ziv paramZiv) {
    Zg0 zg0 = (Zg0)ZV(paramZiv, Zg0.class);
    int i = Ziv.ZM();
    try {
      if (zg0 == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zy7[] arrayOfZy71 = zg0.value();
    try {
      if (zg0.ZK())
        return Zl(paramZiv.ZW(), arrayOfZy71); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    ArrayList<com.fasterxml.Zp.Zd> arrayList = new ArrayList(arrayOfZy71.length);
    Zy7[] arrayOfZy72 = arrayOfZy71;
    int j = arrayOfZy72.length;
    byte b = 0;
    while (b < j) {
      Zy7 zy7 = arrayOfZy72[b];
      arrayList.add(new com.fasterxml.Zp.Zd(zy7.value(), zy7.Zs()));
      String[] arrayOfString = zy7.ZN();
      int k = arrayOfString.length;
      byte b1 = 0;
      while (b1 < k) {
        String str = arrayOfString[b1];
        arrayList.add(new com.fasterxml.Zp.Zd(zy7.value(), str));
        b1++;
        if (i == 0)
          break; 
      } 
      b++;
      if (i == 0)
        break; 
    } 
    return arrayList;
  }
  
  private List<com.fasterxml.Zp.Zd> Zl(String paramString, Zy7[] paramArrayOfZy7) {
    ArrayList<com.fasterxml.Zp.Zd> arrayList = new ArrayList(paramArrayOfZy7.length);
    HashSet<String> hashSet = new HashSet();
    int i = Ziv.Zv();
    Zy7[] arrayOfZy7 = paramArrayOfZy7;
    int j = arrayOfZy7.length;
    byte b = 0;
    while (b < j) {
      Zy7 zy7 = arrayOfZy7[b];
      String str = zy7.Zs();
      try {
        if (!str.isEmpty())
          try {
            if (hashSet.contains(str))
              throw new IllegalArgumentException(a(14490, 3281) + paramString + a(14486, 13629) + str + "]"); 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      hashSet.add(str);
      arrayList.add(new com.fasterxml.Zp.Zd(zy7.value(), str));
      String[] arrayOfString = zy7.ZN();
      int k = arrayOfString.length;
      byte b1 = 0;
      while (b1 < k) {
        String str1 = arrayOfString[b1];
        try {
          if (!str1.isEmpty())
            try {
              if (hashSet.contains(str1))
                throw new IllegalArgumentException(a(14485, -3523) + paramString + a(14492, 18825) + str1 + "]"); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        hashSet.add(str1);
        arrayList.add(new com.fasterxml.Zp.Zd(zy7.value(), str1));
        b1++;
        if (i != 0)
          break; 
      } 
      b++;
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
  
  public String ZL(Zia paramZia) {
    Zvd zvd = (Zvd)ZV(paramZia, Zvd.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zvd == null) ? null : zvd.value();
  }
  
  public Boolean ZM(Ziz paramZiz) {
    return Boolean.valueOf(Zp(paramZiz, Zgq.class));
  }
  
  public Zv Zk(Ziv paramZiv) {
    Zqq zqq = (Zqq)ZV(paramZiv, Zqq.class);
    try {
      if (zqq != null)
        try {
          if (zqq.ZM() != Zy3.class) {
            Zr zr = Zr.Zf(zqq.Zt());
            return new Zv(zr, zqq.Zm(), zqq.ZM(), zqq.Zs());
          } 
          return null;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public Zv Zq(Ziv paramZiv, Zv paramZv) {
    Zzj zzj = (Zzj)ZV(paramZiv, Zzj.class);
    try {
      if (zzj == null)
        return paramZv; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (paramZv == null)
      paramZv = Zv.ZJ(); 
    return paramZv.Za(zzj.ZV());
  }
  
  public Object Zj(Ziv paramZiv) {
    Zv zv = (Zv)ZV(paramZiv, Zv.class);
    if (zv != null) {
      Class<Zyh> clazz = zv.Zo();
      try {
        if (clazz != Zyh.class)
          return clazz; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    Zvl zvl = (Zvl)ZV(paramZiv, Zvl.class);
    try {
      if (zvl != null && zvl.value()) {
        Class<?> clazz = paramZiv.ZN();
        return new Zzh(clazz);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public Object ZU(Ziv paramZiv) {
    Zv zv = (Zv)ZV(paramZiv, Zv.class);
    if (zv != null) {
      Class<Zyh> clazz = zv.ZY();
      try {
        if (clazz != Zyh.class)
          return clazz; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  public Object ZS(Ziv paramZiv) {
    Zv zv = (Zv)ZV(paramZiv, Zv.class);
    if (zv != null) {
      Class<Zyh> clazz = zv.Zu();
      try {
        if (clazz != Zyh.class)
          return clazz; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  public Object Zl(Ziv paramZiv) {
    Zv zv = (Zv)ZV(paramZiv, Zv.class);
    if (zv != null) {
      Class<Zyh> clazz = zv.Zd();
      try {
        if (clazz != Zyh.class)
          return clazz; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  public Zz_ Zp(Ziv paramZiv) {
    Zvm zvm = (Zvm)ZV(paramZiv, Zvm.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zz_ zz_ = (zvm == null) ? Zz_.Zt() : Zz_.Zf(zvm);
    if (zz_.Zs() == Zqg.USE_DEFAULTS)
      zz_ = Za(paramZiv, zz_); 
    return zz_;
  }
  
  private Zz_ Za(Ziv paramZiv, Zz_ paramZz_) {
    Zv zv = (Zv)ZV(paramZiv, Zv.class);
    try {
      if (zv != null)
        try {
          switch (Zip.ZV[zv.ZT().ordinal()]) {
            case 1:
              return paramZz_.ZP(Zqg.ALWAYS);
            case 2:
              return paramZz_.ZP(Zqg.NON_NULL);
            case 3:
              return paramZz_.ZP(Zqg.NON_DEFAULT);
            case 4:
              return paramZz_.ZP(Zqg.NON_EMPTY);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramZz_;
  }
  
  public Zk Zx(Ziv paramZiv) {
    Zv zv = (Zv)ZV(paramZiv, Zv.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zv == null) ? null : zv.ZE();
  }
  
  public Object Zh(Ziv paramZiv) {
    Zv zv = (Zv)ZV(paramZiv, Zv.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zv == null) ? null : Zl(zv.ZZ(), Ze8.class);
  }
  
  public Object Zl(Ziz paramZiz) {
    Zv zv = (Zv)ZV(paramZiz, Zv.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zv == null) ? null : Zl(zv.Zt(), Ze8.class);
  }
  
  public Zk ZO(Zf<?> paramZf, Ziv paramZiv, Zk paramZk) throws Zy_ {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: aload_3
    //   4: astore #5
    //   6: aload_1
    //   7: invokevirtual Zg : ()Lcom/fasterxml/Zh/Zi;
    //   10: astore #6
    //   12: aload_0
    //   13: aload_2
    //   14: ldc com/fasterxml/Zw/Zv
    //   16: invokevirtual ZV : (Lcom/fasterxml/Zoz/Ziv;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   19: checkcast com/fasterxml/Zw/Zv
    //   22: astore #7
    //   24: istore #4
    //   26: aload #7
    //   28: ifnonnull -> 39
    //   31: aconst_null
    //   32: goto -> 50
    //   35: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   38: athrow
    //   39: aload_0
    //   40: aload #7
    //   42: invokeinterface ZM : ()Ljava/lang/Class;
    //   47: invokevirtual ZK : (Ljava/lang/Class;)Ljava/lang/Class;
    //   50: astore #8
    //   52: aload #8
    //   54: ifnull -> 276
    //   57: aload #5
    //   59: aload #8
    //   61: invokevirtual ZP : (Ljava/lang/Class;)Z
    //   64: ifeq -> 86
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   73: athrow
    //   74: aload #5
    //   76: invokevirtual Zq : ()Lcom/fasterxml/Zor/Zk;
    //   79: astore #5
    //   81: iload #4
    //   83: ifeq -> 276
    //   86: aload #5
    //   88: invokevirtual Zf : ()Ljava/lang/Class;
    //   91: astore #9
    //   93: aload #8
    //   95: aload #9
    //   97: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   100: ifeq -> 119
    //   103: aload #6
    //   105: aload #5
    //   107: aload #8
    //   109: invokevirtual ZG : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   112: astore #5
    //   114: iload #4
    //   116: ifeq -> 220
    //   119: aload #9
    //   121: aload #8
    //   123: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   126: ifeq -> 152
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   135: athrow
    //   136: aload #6
    //   138: aload #5
    //   140: aload #8
    //   142: invokevirtual ZU : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   145: astore #5
    //   147: iload #4
    //   149: ifeq -> 220
    //   152: aload_0
    //   153: aload #9
    //   155: aload #8
    //   157: invokespecial ZY : (Ljava/lang/Class;Ljava/lang/Class;)Z
    //   160: ifeq -> 182
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   169: athrow
    //   170: aload #5
    //   172: invokevirtual Zq : ()Lcom/fasterxml/Zor/Zk;
    //   175: astore #5
    //   177: iload #4
    //   179: ifeq -> 220
    //   182: aload_0
    //   183: sipush #14495
    //   186: sipush #-9838
    //   189: invokestatic a : (II)Ljava/lang/String;
    //   192: iconst_2
    //   193: anewarray java/lang/Object
    //   196: dup
    //   197: iconst_0
    //   198: aload #5
    //   200: aastore
    //   201: dup
    //   202: iconst_1
    //   203: aload #8
    //   205: invokevirtual getName : ()Ljava/lang/String;
    //   208: aastore
    //   209: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   212: invokespecial Zw : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zy_;
    //   215: athrow
    //   216: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   219: athrow
    //   220: goto -> 276
    //   223: astore #10
    //   225: aload_0
    //   226: aload #10
    //   228: sipush #14491
    //   231: sipush #-10935
    //   234: invokestatic a : (II)Ljava/lang/String;
    //   237: iconst_4
    //   238: anewarray java/lang/Object
    //   241: dup
    //   242: iconst_0
    //   243: aload #5
    //   245: aastore
    //   246: dup
    //   247: iconst_1
    //   248: aload #8
    //   250: invokevirtual getName : ()Ljava/lang/String;
    //   253: aastore
    //   254: dup
    //   255: iconst_2
    //   256: aload_2
    //   257: invokevirtual ZW : ()Ljava/lang/String;
    //   260: aastore
    //   261: dup
    //   262: iconst_3
    //   263: aload #10
    //   265: invokevirtual getMessage : ()Ljava/lang/String;
    //   268: aastore
    //   269: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   272: invokespecial Zt : (Ljava/lang/Throwable;Ljava/lang/String;)Lcom/fasterxml/Zor/Zy_;
    //   275: athrow
    //   276: aload #5
    //   278: invokevirtual Zh : ()Z
    //   281: ifeq -> 553
    //   284: aload #5
    //   286: invokevirtual Zu : ()Lcom/fasterxml/Zor/Zk;
    //   289: astore #9
    //   291: aload #7
    //   293: ifnonnull -> 304
    //   296: aconst_null
    //   297: goto -> 315
    //   300: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   303: athrow
    //   304: aload_0
    //   305: aload #7
    //   307: invokeinterface Zh : ()Ljava/lang/Class;
    //   312: invokevirtual ZK : (Ljava/lang/Class;)Ljava/lang/Class;
    //   315: astore #10
    //   317: aload #10
    //   319: ifnull -> 553
    //   322: aload #9
    //   324: aload #10
    //   326: invokevirtual ZP : (Ljava/lang/Class;)Z
    //   329: ifeq -> 351
    //   332: goto -> 339
    //   335: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   338: athrow
    //   339: aload #9
    //   341: invokevirtual Zq : ()Lcom/fasterxml/Zor/Zk;
    //   344: astore #9
    //   346: iload #4
    //   348: ifeq -> 541
    //   351: aload #9
    //   353: invokevirtual Zf : ()Ljava/lang/Class;
    //   356: astore #11
    //   358: aload #10
    //   360: aload #11
    //   362: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   365: ifeq -> 384
    //   368: aload #6
    //   370: aload #9
    //   372: aload #10
    //   374: invokevirtual ZG : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   377: astore #9
    //   379: iload #4
    //   381: ifeq -> 485
    //   384: aload #11
    //   386: aload #10
    //   388: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   391: ifeq -> 417
    //   394: goto -> 401
    //   397: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   400: athrow
    //   401: aload #6
    //   403: aload #9
    //   405: aload #10
    //   407: invokevirtual ZU : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   410: astore #9
    //   412: iload #4
    //   414: ifeq -> 485
    //   417: aload_0
    //   418: aload #11
    //   420: aload #10
    //   422: invokespecial ZY : (Ljava/lang/Class;Ljava/lang/Class;)Z
    //   425: ifeq -> 447
    //   428: goto -> 435
    //   431: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   434: athrow
    //   435: aload #9
    //   437: invokevirtual Zq : ()Lcom/fasterxml/Zor/Zk;
    //   440: astore #9
    //   442: iload #4
    //   444: ifeq -> 485
    //   447: aload_0
    //   448: sipush #14488
    //   451: sipush #-13482
    //   454: invokestatic a : (II)Ljava/lang/String;
    //   457: iconst_2
    //   458: anewarray java/lang/Object
    //   461: dup
    //   462: iconst_0
    //   463: aload #9
    //   465: aastore
    //   466: dup
    //   467: iconst_1
    //   468: aload #10
    //   470: invokevirtual getName : ()Ljava/lang/String;
    //   473: aastore
    //   474: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   477: invokespecial Zw : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zy_;
    //   480: athrow
    //   481: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   484: athrow
    //   485: goto -> 541
    //   488: astore #12
    //   490: aload_0
    //   491: aload #12
    //   493: sipush #14494
    //   496: sipush #-7681
    //   499: invokestatic a : (II)Ljava/lang/String;
    //   502: iconst_4
    //   503: anewarray java/lang/Object
    //   506: dup
    //   507: iconst_0
    //   508: aload #5
    //   510: aastore
    //   511: dup
    //   512: iconst_1
    //   513: aload #10
    //   515: invokevirtual getName : ()Ljava/lang/String;
    //   518: aastore
    //   519: dup
    //   520: iconst_2
    //   521: aload_2
    //   522: invokevirtual ZW : ()Ljava/lang/String;
    //   525: aastore
    //   526: dup
    //   527: iconst_3
    //   528: aload #12
    //   530: invokevirtual getMessage : ()Ljava/lang/String;
    //   533: aastore
    //   534: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   537: invokespecial Zt : (Ljava/lang/Throwable;Ljava/lang/String;)Lcom/fasterxml/Zor/Zy_;
    //   540: athrow
    //   541: aload #5
    //   543: checkcast com/fasterxml/Zh/Zo
    //   546: aload #9
    //   548: invokevirtual Zd : (Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zh/Zo;
    //   551: astore #5
    //   553: aload #5
    //   555: invokevirtual ZB : ()Lcom/fasterxml/Zor/Zk;
    //   558: astore #9
    //   560: aload #9
    //   562: ifnull -> 831
    //   565: aload #7
    //   567: ifnonnull -> 585
    //   570: goto -> 577
    //   573: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   576: athrow
    //   577: aconst_null
    //   578: goto -> 596
    //   581: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   584: athrow
    //   585: aload_0
    //   586: aload #7
    //   588: invokeinterface Zw : ()Ljava/lang/Class;
    //   593: invokevirtual ZK : (Ljava/lang/Class;)Ljava/lang/Class;
    //   596: astore #10
    //   598: aload #10
    //   600: ifnull -> 831
    //   603: aload #9
    //   605: aload #10
    //   607: invokevirtual ZP : (Ljava/lang/Class;)Z
    //   610: ifeq -> 632
    //   613: goto -> 620
    //   616: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   619: athrow
    //   620: aload #9
    //   622: invokevirtual Zq : ()Lcom/fasterxml/Zor/Zk;
    //   625: astore #9
    //   627: iload #4
    //   629: ifeq -> 822
    //   632: aload #9
    //   634: invokevirtual Zf : ()Ljava/lang/Class;
    //   637: astore #11
    //   639: aload #10
    //   641: aload #11
    //   643: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   646: ifeq -> 665
    //   649: aload #6
    //   651: aload #9
    //   653: aload #10
    //   655: invokevirtual ZG : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   658: astore #9
    //   660: iload #4
    //   662: ifeq -> 766
    //   665: aload #11
    //   667: aload #10
    //   669: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   672: ifeq -> 698
    //   675: goto -> 682
    //   678: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   681: athrow
    //   682: aload #6
    //   684: aload #9
    //   686: aload #10
    //   688: invokevirtual ZU : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   691: astore #9
    //   693: iload #4
    //   695: ifeq -> 766
    //   698: aload_0
    //   699: aload #11
    //   701: aload #10
    //   703: invokespecial ZY : (Ljava/lang/Class;Ljava/lang/Class;)Z
    //   706: ifeq -> 728
    //   709: goto -> 716
    //   712: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   715: athrow
    //   716: aload #9
    //   718: invokevirtual Zq : ()Lcom/fasterxml/Zor/Zk;
    //   721: astore #9
    //   723: iload #4
    //   725: ifeq -> 766
    //   728: aload_0
    //   729: sipush #14487
    //   732: sipush #5810
    //   735: invokestatic a : (II)Ljava/lang/String;
    //   738: iconst_2
    //   739: anewarray java/lang/Object
    //   742: dup
    //   743: iconst_0
    //   744: aload #9
    //   746: aastore
    //   747: dup
    //   748: iconst_1
    //   749: aload #10
    //   751: invokevirtual getName : ()Ljava/lang/String;
    //   754: aastore
    //   755: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   758: invokespecial Zw : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zy_;
    //   761: athrow
    //   762: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   765: athrow
    //   766: goto -> 822
    //   769: astore #12
    //   771: aload_0
    //   772: aload #12
    //   774: sipush #14484
    //   777: sipush #-19199
    //   780: invokestatic a : (II)Ljava/lang/String;
    //   783: iconst_4
    //   784: anewarray java/lang/Object
    //   787: dup
    //   788: iconst_0
    //   789: aload #5
    //   791: aastore
    //   792: dup
    //   793: iconst_1
    //   794: aload #10
    //   796: invokevirtual getName : ()Ljava/lang/String;
    //   799: aastore
    //   800: dup
    //   801: iconst_2
    //   802: aload_2
    //   803: invokevirtual ZW : ()Ljava/lang/String;
    //   806: aastore
    //   807: dup
    //   808: iconst_3
    //   809: aload #12
    //   811: invokevirtual getMessage : ()Ljava/lang/String;
    //   814: aastore
    //   815: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   818: invokespecial Zt : (Ljava/lang/Throwable;Ljava/lang/String;)Lcom/fasterxml/Zor/Zy_;
    //   821: athrow
    //   822: aload #5
    //   824: aload #9
    //   826: invokevirtual ZR : (Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zk;
    //   829: astore #5
    //   831: aload #5
    //   833: areturn
    // Exception table:
    //   from	to	target	type
    //   26	35	35	java/lang/IllegalArgumentException
    //   52	67	70	java/lang/IllegalArgumentException
    //   93	220	223	java/lang/IllegalArgumentException
    //   114	129	132	java/lang/IllegalArgumentException
    //   147	163	166	java/lang/IllegalArgumentException
    //   177	216	216	java/lang/IllegalArgumentException
    //   291	300	300	java/lang/IllegalArgumentException
    //   317	332	335	java/lang/IllegalArgumentException
    //   358	485	488	java/lang/IllegalArgumentException
    //   379	394	397	java/lang/IllegalArgumentException
    //   412	428	431	java/lang/IllegalArgumentException
    //   442	481	481	java/lang/IllegalArgumentException
    //   560	570	573	java/lang/IllegalArgumentException
    //   565	581	581	java/lang/IllegalArgumentException
    //   598	613	616	java/lang/IllegalArgumentException
    //   639	766	769	java/lang/IllegalArgumentException
    //   660	675	678	java/lang/IllegalArgumentException
    //   693	709	712	java/lang/IllegalArgumentException
    //   723	762	762	java/lang/IllegalArgumentException
  }
  
  public String[] Zx(Zia paramZia) {
    Zva zva = (Zva)ZV(paramZia, Zva.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zva == null) ? null : zva.value();
  }
  
  public Boolean Zi(Ziv paramZiv) {
    return ZD(paramZiv);
  }
  
  private final Boolean ZD(Ziv paramZiv) {
    Zva zva = (Zva)ZV(paramZiv, Zva.class);
    try {
      if (zva != null)
        try {
          if (zva.Za())
            return Boolean.TRUE; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public void Zi(Zf<?> paramZf, Zia paramZia, List<Zt> paramList) {
    // Byte code:
    //   0: invokestatic ZM : ()I
    //   3: aload_0
    //   4: aload_2
    //   5: ldc com/fasterxml/Zw/Zq
    //   7: invokevirtual ZV : (Lcom/fasterxml/Zoz/Ziv;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   10: checkcast com/fasterxml/Zw/Zq
    //   13: astore #5
    //   15: istore #4
    //   17: aload #5
    //   19: ifnonnull -> 27
    //   22: return
    //   23: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   26: athrow
    //   27: aload #5
    //   29: invokeinterface Zw : ()Z
    //   34: istore #6
    //   36: aconst_null
    //   37: astore #7
    //   39: aload #5
    //   41: invokeinterface Zi : ()[Lcom/fasterxml/Zw/Zp;
    //   46: astore #8
    //   48: iconst_0
    //   49: istore #9
    //   51: aload #8
    //   53: arraylength
    //   54: istore #10
    //   56: iload #9
    //   58: iload #10
    //   60: if_icmpge -> 142
    //   63: aload #7
    //   65: ifnonnull -> 76
    //   68: aload_1
    //   69: ldc java/lang/Object
    //   71: invokevirtual Zu : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   74: astore #7
    //   76: aload_0
    //   77: aload #8
    //   79: iload #9
    //   81: aaload
    //   82: aload_1
    //   83: aload_2
    //   84: aload #7
    //   86: invokevirtual ZR : (Lcom/fasterxml/Zw/Zp;Lcom/fasterxml/Zj/Zf;Lcom/fasterxml/Zoz/Zia;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zk/Zt;
    //   89: astore #11
    //   91: iload #6
    //   93: ifeq -> 118
    //   96: aload_3
    //   97: iload #9
    //   99: aload #11
    //   101: invokeinterface add : (ILjava/lang/Object;)V
    //   106: iload #4
    //   108: ifne -> 134
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   117: athrow
    //   118: aload_3
    //   119: aload #11
    //   121: invokeinterface add : (Ljava/lang/Object;)Z
    //   126: pop
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   133: athrow
    //   134: iinc #9, 1
    //   137: iload #4
    //   139: ifne -> 56
    //   142: aload #5
    //   144: invokeinterface ZQ : ()[Lcom/fasterxml/Zw/Z_;
    //   149: astore #9
    //   151: iconst_0
    //   152: istore #10
    //   154: aload #9
    //   156: arraylength
    //   157: istore #11
    //   159: iload #10
    //   161: iload #11
    //   163: if_icmpge -> 230
    //   166: aload_0
    //   167: aload #9
    //   169: iload #10
    //   171: aaload
    //   172: aload_1
    //   173: aload_2
    //   174: invokevirtual ZH : (Lcom/fasterxml/Zw/Z_;Lcom/fasterxml/Zj/Zf;Lcom/fasterxml/Zoz/Zia;)Lcom/fasterxml/Zk/Zt;
    //   177: astore #12
    //   179: iload #6
    //   181: ifeq -> 206
    //   184: aload_3
    //   185: iload #10
    //   187: aload #12
    //   189: invokeinterface add : (ILjava/lang/Object;)V
    //   194: iload #4
    //   196: ifne -> 222
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   205: athrow
    //   206: aload_3
    //   207: aload #12
    //   209: invokeinterface add : (Ljava/lang/Object;)Z
    //   214: pop
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   221: athrow
    //   222: iinc #10, 1
    //   225: iload #4
    //   227: ifne -> 159
    //   230: return
    // Exception table:
    //   from	to	target	type
    //   17	23	23	java/lang/IllegalArgumentException
    //   91	111	114	java/lang/IllegalArgumentException
    //   96	127	130	java/lang/IllegalArgumentException
    //   179	199	202	java/lang/IllegalArgumentException
    //   184	215	218	java/lang/IllegalArgumentException
  }
  
  protected Zt ZR(Zp paramZp, Zf<?> paramZf, Zia paramZia, Zk paramZk) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zyb zyb = paramZp.ZJ() ? Zyb.Zd : Zyb.Zo;
    String str = paramZp.value();
    Zr zr = Zt(paramZp.ZK(), paramZp.ZQ());
    if (!zr.ZA())
      zr = Zr.Zf(str); 
    Zix zix = new Zix(paramZia, paramZia.ZN(), str, paramZk);
    Zi zi = Zi.Zq(paramZf, zix, zr, zyb, paramZp.ZY());
    return (Zt)Zx.ZP(str, (Zp)zi, paramZia.Zr(), paramZk);
  }
  
  protected Zt ZH(Z_ paramZ_, Zf<?> paramZf, Zia paramZia) {
    int i = Ziv.ZM();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zyb zyb = paramZ_.ZG() ? Zyb.Zd : Zyb.Zo;
    Zr zr = Zt(paramZ_.Zt(), paramZ_.Zr());
    Zk zk = paramZf.Zu(paramZ_.Zp());
    Zix zix = new Zix(paramZia, paramZia.ZN(), zr.Zb(), zk);
    Zi zi = Zi.Zq(paramZf, zix, zr, zyb, paramZ_.Z_());
    Class clazz = paramZ_.value();
    Zqn zqn = paramZf.Zf();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zs zs = (zqn == null) ? null : zqn.Zu(paramZf, clazz);
    if (zs == null)
      zs = (Zs)Zx.ZR(clazz, paramZf.Zd()); 
    try {
      if (Zbqc.Zwu() == null)
        Ziv.ZM(++i); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (Zt)zs.ZS(paramZf, paramZia, (Zp)zi, zk);
  }
  
  public Zr ZR(Ziv paramZiv) {
    boolean bool = false;
    Zyl zyl = (Zyl)ZV(paramZiv, Zyl.class);
    if (zyl != null) {
      String str = zyl.value();
      try {
        if (!str.isEmpty())
          return Zr.Zf(str); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      bool = true;
    } 
    Zy1 zy1 = (Zy1)ZV(paramZiv, Zy1.class);
    if (zy1 != null) {
      String str = zy1.Zc();
      try {
        if (str != null && str.isEmpty())
          str = null; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return Zr.ZE(zy1.value(), str);
    } 
    try {
      if (!bool)
        try {
          return !Zo(paramZiv, (Class[])Zo) ? null : Zr.Zc;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zr.Zc;
  }
  
  public Boolean Zq(Zf<?> paramZf, Ziv paramZiv) {
    Zqv zqv = (Zqv)ZV(paramZiv, Zqv.class);
    try {
      if (zqv == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Boolean.valueOf(zqv.value());
  }
  
  public Boolean ZB(Ziv paramZiv) {
    Zv7 zv7 = (Zv7)ZV(paramZiv, Zv7.class);
    try {
      if (zv7 == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Boolean.valueOf(zv7.value());
  }
  
  public Boolean Zr(Ziv paramZiv) {
    Zyi zyi = (Zyi)ZV(paramZiv, Zyi.class);
    try {
      if (zyi == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Boolean.valueOf(zyi.Zo());
  }
  
  @Deprecated
  public boolean ZF(Ziq paramZiq) {
    return Zp(paramZiq, Zyi.class);
  }
  
  @Deprecated
  public boolean ZM(Ziq paramZiq) {
    Zv7 zv7 = (Zv7)ZV(paramZiq, Zv7.class);
    try {
      if (zv7 != null)
        try {
          if (zv7.value());
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public Object Zs(Ziv paramZiv) {
    Za za = (Za)ZV(paramZiv, Za.class);
    if (za != null) {
      Class<Zyf> clazz = za.Zd();
      try {
        if (clazz != Zyf.class)
          return clazz; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  public Object ZZ(Ziv paramZiv) {
    Za za = (Za)ZV(paramZiv, Za.class);
    if (za != null) {
      Class<Zw> clazz = za.Za();
      try {
        if (clazz != Zw.class)
          return clazz; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  public Object Zg(Ziv paramZiv) {
    Za za = (Za)ZV(paramZiv, Za.class);
    if (za != null) {
      Class<Zyf> clazz = za.Zc();
      try {
        if (clazz != Zyf.class)
          return clazz; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  public Object Zw(Ziv paramZiv) {
    Za za = (Za)ZV(paramZiv, Za.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (za == null) ? null : Zl(za.ZW(), Ze8.class);
  }
  
  public Object ZO(Ziz paramZiz) {
    Za za = (Za)ZV(paramZiz, Za.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (za == null) ? null : Zl(za.Zi(), Ze8.class);
  }
  
  public Zk ZL(Zf<?> paramZf, Ziv paramZiv, Zk paramZk) throws Zy_ {
    Zo zo;
    Zk zk1;
    Zk zk2 = paramZk;
    Zi zi = paramZf.Zg();
    Za za = (Za)ZV(paramZiv, Za.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Class<?> clazz = (za == null) ? null : ZK(za.Zk());
    try {
      if (clazz != null)
        try {
          if (!zk2.ZP(clazz) && !Zl(zk2, clazz))
            try {
              zk2 = zi.ZU(zk2, clazz);
            } catch (IllegalArgumentException illegalArgumentException) {
              throw Zt(illegalArgumentException, String.format(a(14480, -6048), new Object[] { zk2, clazz.getName(), paramZiv.ZW(), illegalArgumentException.getMessage() }));
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (zk2.Zh()) {
      Zk zk = zk2.Zu();
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      Class<?> clazz1 = (za == null) ? null : ZK(za.ZC());
      try {
        if (clazz1 != null && !Zl(zk, clazz1))
          try {
            zk = zi.ZU(zk, clazz1);
            zo = ((Zo)zk2).Zd(zk);
          } catch (IllegalArgumentException illegalArgumentException) {
            throw Zt(illegalArgumentException, String.format(a(14493, -3768), new Object[] { zo, clazz1.getName(), paramZiv.ZW(), illegalArgumentException.getMessage() }));
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    Zk zk3 = zo.ZB();
    try {
      if (zk3 != null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        Class<?> clazz1 = (za == null) ? null : ZK(za.Zy());
        try {
          if (clazz1 != null && !Zl(zk3, clazz1))
            try {
              zk3 = zi.ZU(zk3, clazz1);
              zk1 = zo.ZR(zk3);
            } catch (IllegalArgumentException illegalArgumentException) {
              throw Zt(illegalArgumentException, String.format(a(14481, -18570), new Object[] { zk1, clazz1.getName(), paramZiv.ZW(), illegalArgumentException.getMessage() }));
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return zk1;
  }
  
  public Object ZK(Zia paramZia) {
    Zz zz = (Zz)ZV(paramZia, Zz.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zz == null) ? null : zz.value();
  }
  
  public Class<?> Zk(Zia paramZia) {
    Za za = (Za)ZV(paramZia, Za.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (za == null) ? null : ZK(za.Zh());
  }
  
  public Zg ZJ(Zia paramZia) {
    Zy zy = (Zy)ZV(paramZia, Zy.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zy == null) ? null : new Zg(zy);
  }
  
  public Zr ZK(Ziv paramZiv) {
    boolean bool = false;
    Zvi zvi = (Zvi)ZV(paramZiv, Zvi.class);
    int i = Ziv.Zv();
    if (zvi != null) {
      String str = zvi.value();
      if (str.isEmpty()) {
        bool = true;
        try {
          if (i != 0)
            return Zr.Zf(str); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        return Zr.Zf(str);
      } 
    } 
    Zy1 zy1 = (Zy1)ZV(paramZiv, Zy1.class);
    if (zy1 != null) {
      String str = zy1.Zc();
      try {
        if (str != null && str.isEmpty())
          str = null; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return Zr.ZE(zy1.value(), str);
    } 
    try {
      if (!bool)
        try {
          return !Zo(paramZiv, (Class[])ZK) ? null : Zr.Zc;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zr.Zc;
  }
  
  public Boolean ZF(Ziv paramZiv) {
    Zv8 zv8 = (Zv8)ZV(paramZiv, Zv8.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zv8 == null) ? null : Boolean.valueOf(zv8.Zr());
  }
  
  public Zyk ZO(Ziv paramZiv) {
    return Zyk.Zi((Zvi)ZV(paramZiv, Zvi.class));
  }
  
  public Boolean Zy(Ziv paramZiv) {
    Zq3 zq3 = (Zq3)ZV(paramZiv, Zq3.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zq3 == null) ? null : zq3.value().ZT();
  }
  
  @Deprecated
  public boolean ZT(Ziv paramZiv) {
    Zvc zvc = (Zvc)ZV(paramZiv, Zvc.class);
    try {
      if (zvc != null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return (zvc.Zp() != Zgd.DISABLED);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Zs)
        try {
          if (paramZiv instanceof Zik && Zd != null) {
            Boolean bool = Zd.Zw(paramZiv);
            try {
              if (bool != null)
                return bool.booleanValue(); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  @Deprecated
  public Zgd Zd(Ziv paramZiv) {
    Zvc zvc = (Zvc)ZV(paramZiv, Zvc.class);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zvc == null) ? null : zvc.Zp();
  }
  
  public Zgd ZD(Zf<?> paramZf, Ziv paramZiv) {
    Zvc zvc = (Zvc)ZV(paramZiv, Zvc.class);
    try {
      if (zvc != null)
        return zvc.Zp(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Zs)
        try {
          if (paramZf.ZB(Zy9.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES))
            try {
              if (paramZiv instanceof Zik && Zd != null) {
                Boolean bool = Zd.Zw(paramZiv);
                try {
                  if (bool != null)
                    try {
                      if (bool.booleanValue())
                        return Zgd.PROPERTIES; 
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    }  
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  protected boolean Zz(Ziv paramZiv) {
    Zyx zyx = (Zyx)ZV(paramZiv, Zyx.class);
    try {
      if (zyx != null)
        return zyx.value(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (Zd != null) {
      Boolean bool = Zd.ZE(paramZiv);
      try {
        if (bool != null)
          return bool.booleanValue(); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  protected Class<?> ZK(Class<?> paramClass) {
    try {
      if (paramClass != null)
        try {
          return !Zx.Zu(paramClass) ? paramClass : null;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  protected Class<?> Zl(Class<?> paramClass1, Class<?> paramClass2) {
    paramClass1 = ZK(paramClass1);
    try {
      if (paramClass1 != null) {
        try {
          if (paramClass1 == paramClass2);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return paramClass1;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  protected Zr Zt(String paramString1, String paramString2) {
    try {
      if (paramString1.isEmpty())
        return Zr.Zc; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramString2 != null)
        try {
          return !paramString2.isEmpty() ? Zr.ZE(paramString1, paramString2) : Zr.Zf(paramString1);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zr.Zf(paramString1);
  }
  
  protected Zr Zf(Ziv paramZiv) {
    if (paramZiv instanceof Zin) {
      Zin zin = (Zin)paramZiv;
      Zif zif = zin.Zd();
      try {
        if (zif != null && Zd != null) {
          Zr zr = Zd.Za(zin);
          try {
            if (zr != null)
              return zr; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  protected Zk<?> ZC(Zf<?> paramZf, Ziv paramZiv, Zk paramZk) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokevirtual ZU : (Lcom/fasterxml/Zj/Zf;Lcom/fasterxml/Zoz/Ziv;)Lcom/fasterxml/Zgn;
    //   6: astore #5
    //   8: invokestatic Zv : ()I
    //   11: aload_0
    //   12: aload_2
    //   13: ldc com/fasterxml/Zw/Zf
    //   15: invokevirtual ZV : (Lcom/fasterxml/Zoz/Ziv;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   18: checkcast com/fasterxml/Zw/Zf
    //   21: astore #7
    //   23: istore #4
    //   25: aload #7
    //   27: ifnull -> 67
    //   30: aload #5
    //   32: ifnonnull -> 48
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   41: athrow
    //   42: aconst_null
    //   43: areturn
    //   44: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   47: athrow
    //   48: aload_1
    //   49: aload_2
    //   50: aload #7
    //   52: invokeinterface value : ()Ljava/lang/Class;
    //   57: invokevirtual ZQ : (Lcom/fasterxml/Zoz/Ziv;Ljava/lang/Class;)Lcom/fasterxml/Zp/Zk;
    //   60: astore #6
    //   62: iload #4
    //   64: ifeq -> 115
    //   67: aload #5
    //   69: ifnonnull -> 85
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   78: athrow
    //   79: aconst_null
    //   80: areturn
    //   81: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   84: athrow
    //   85: aload #5
    //   87: invokevirtual Zj : ()Lcom/fasterxml/Zg_;
    //   90: getstatic com/fasterxml/Zg_.NONE : Lcom/fasterxml/Zg_;
    //   93: if_acmpne -> 105
    //   96: aload_0
    //   97: invokevirtual Zp : ()Lcom/fasterxml/Zo3/Zj;
    //   100: areturn
    //   101: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   104: athrow
    //   105: aload_0
    //   106: aload_1
    //   107: aload #5
    //   109: aload_3
    //   110: invokevirtual Zo : (Lcom/fasterxml/Zj/Zf;Lcom/fasterxml/Zgn;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zp/Zk;
    //   113: astore #6
    //   115: aload_0
    //   116: aload_2
    //   117: ldc com/fasterxml/Zw/Zh
    //   119: invokevirtual ZV : (Lcom/fasterxml/Zoz/Ziv;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   122: checkcast com/fasterxml/Zw/Zh
    //   125: astore #8
    //   127: aload #8
    //   129: ifnonnull -> 140
    //   132: aconst_null
    //   133: goto -> 152
    //   136: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   139: athrow
    //   140: aload_1
    //   141: aload_2
    //   142: aload #8
    //   144: invokeinterface value : ()Ljava/lang/Class;
    //   149: invokevirtual ZS : (Lcom/fasterxml/Zoz/Ziv;Ljava/lang/Class;)Lcom/fasterxml/Zp/Zz;
    //   152: astore #9
    //   154: aload #9
    //   156: ifnull -> 174
    //   159: aload #9
    //   161: aload_3
    //   162: invokeinterface ZQ : (Lcom/fasterxml/Zor/Zk;)V
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   173: athrow
    //   174: aload #5
    //   176: invokevirtual Zi : ()Lcom/fasterxml/Zyc;
    //   179: astore #10
    //   181: aload #10
    //   183: getstatic com/fasterxml/Zyc.EXTERNAL_PROPERTY : Lcom/fasterxml/Zyc;
    //   186: if_acmpne -> 213
    //   189: aload_2
    //   190: instanceof com/fasterxml/Zoz/Zia
    //   193: ifeq -> 213
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   202: athrow
    //   203: aload #5
    //   205: getstatic com/fasterxml/Zyc.PROPERTY : Lcom/fasterxml/Zyc;
    //   208: invokevirtual ZP : (Lcom/fasterxml/Zyc;)Lcom/fasterxml/Zgn;
    //   211: astore #5
    //   213: aload #5
    //   215: invokevirtual Zl : ()Ljava/lang/Class;
    //   218: astore #11
    //   220: aload #11
    //   222: ifnull -> 263
    //   225: aload #11
    //   227: ldc com/fasterxml/Zqo
    //   229: if_acmpeq -> 263
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   238: athrow
    //   239: aload #11
    //   241: invokevirtual isAnnotation : ()Z
    //   244: ifne -> 263
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   253: athrow
    //   254: aload #5
    //   256: aload #11
    //   258: invokevirtual Zf : (Ljava/lang/Class;)Lcom/fasterxml/Zgn;
    //   261: astore #5
    //   263: aload #6
    //   265: aload #5
    //   267: aload #9
    //   269: invokeinterface Zn : (Lcom/fasterxml/Zgn;Lcom/fasterxml/Zp/Zz;)Lcom/fasterxml/Zp/Zk;
    //   274: astore #6
    //   276: aload #6
    //   278: areturn
    // Exception table:
    //   from	to	target	type
    //   25	35	38	java/lang/IllegalArgumentException
    //   30	44	44	java/lang/IllegalArgumentException
    //   62	72	75	java/lang/IllegalArgumentException
    //   67	81	81	java/lang/IllegalArgumentException
    //   85	101	101	java/lang/IllegalArgumentException
    //   127	136	136	java/lang/IllegalArgumentException
    //   154	167	170	java/lang/IllegalArgumentException
    //   181	196	199	java/lang/IllegalArgumentException
    //   220	232	235	java/lang/IllegalArgumentException
    //   225	247	250	java/lang/IllegalArgumentException
  }
  
  protected Zk<?> Zo(Zf<?> paramZf, Zgn paramZgn, Zk paramZk) {
    return (Zk<?>)new Zj(paramZgn);
  }
  
  protected Zj Zp() {
    return Zj.Zt();
  }
  
  private boolean ZY(Class<?> paramClass1, Class<?> paramClass2) {
    try {
      if (paramClass1.isPrimitive()) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return (paramClass1 == Zx.ZS(paramClass2));
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramClass2.isPrimitive()) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return (paramClass2 == Zx.ZS(paramClass1));
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean Zl(Zk paramZk, Class<?> paramClass) {
    try {
      if (paramZk.Zm())
        return paramZk.ZP(Zx.ZS(paramClass)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramClass.isPrimitive()) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return (paramClass == Zx.ZS(paramZk.Zf()));
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  private Zy_ Zw(String paramString) {
    return new Zy_(null, paramString);
  }
  
  private Zy_ Zt(Throwable paramThrowable, String paramString) {
    return new Zy_(null, paramString, paramThrowable);
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ñ~sv`³\\fì<ÇÿÛe¯­¬'UÉÕ¸1ãÏþ\rÈ¢PUÐ\\nºJòÔ´ZÌ+ÛÓ\\n26ÿÚý"õt>¦êÎGîÒï;æ¯\\fÐ"¹¨#ëS¡Ý$áøF¼&>ÝG]Jÿ`\\tIØ\\bG«VìQÐï¹ä½oãr8PÁmR/:\\föÕ º.þ Þõ,nOÀåzèD\\t84VAEl\\b4R^²Ôìl8`lÌjûRÄ°G(! ë·çþ»?½Üzïso?ûE+ô»3WPA0(ijýÖº¹0]>\\týM>Jex£Â9HÁ=Ð8Z")Iüte²$0ÿ²XùØÕÐ[ë4@è}»B·Ñ´µÀ¿_@Ýh:¿',-G$Be±JÎ<rÂ·yªë)8é&øgTáh ¹¶ë¾ÇO0³I ëunf´êYl+<ù5ªÄð°:8Ò±vAÆÆxaøP~¹|&SÖÒ¹d°gÃi¨-üË¼§:Ôq1&í«mî¨¾r½Å7(i0Î¤èª±M"Ê/ý¨ð}­¤/ÞøÍ¾/#²ÀWYj±+%dªñÃi¦4cÁ|ïnêE~p¼\\n5\\f_'Û\\n9:[>Ï Y¥¥¤ê\\b×kxá\\fÐ*r \\fTsIÿÝFéÃ­GÜÏô¯åð¥¨YHìàþÞü×1çb5e|;ÔÁáëVFÃL+9o¨h4Q,×OÛ,Ø£²óßßdÃÁfþLk¸àc¹»üßØÐê¦í\\nPH@ûÛ#äÏÙ\\nLá*ÞéZþ!+l@.«ê£U¨ù¤ûÂÜ*'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #87
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #100
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
    //   68: ldc 'MÔÔW®l£Í ]g¥dÛu=w;o=QØ,´øÏgªÝ¥K¹\\fjfä*½aXU=/Ë¨ÏÝ\\rÎ+Yú]O;w¬¢m·µEZû«B7ªóbÊÔÇùÃvö"ªs¿ïî6"/rÐ²(Àü«!X¯z+>+G@¡ày¥þPA\U2»RT³ï»'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #89
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #55
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
    //   129: putstatic com/fasterxml/Zoz/Zd.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zoz/Zd.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 258
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 240, 0 -> 212, 1 -> 216, 2 -> 220, 3 -> 225, 4 -> 230, 5 -> 235
    //   212: iconst_3
    //   213: goto -> 242
    //   216: iconst_2
    //   217: goto -> 242
    //   220: bipush #43
    //   222: goto -> 242
    //   225: bipush #41
    //   227: goto -> 242
    //   230: bipush #21
    //   232: goto -> 242
    //   235: bipush #70
    //   237: goto -> 242
    //   240: bipush #119
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 166
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 162
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 40, 0 -> 99
    //   300: bipush #8
    //   302: anewarray java/lang/Class
    //   305: dup
    //   306: iconst_0
    //   307: ldc com/fasterxml/Zw/Zv
    //   309: aastore
    //   310: dup
    //   311: iconst_1
    //   312: ldc com/fasterxml/Zvy
    //   314: aastore
    //   315: dup
    //   316: iconst_2
    //   317: ldc com/fasterxml/Zzv
    //   319: aastore
    //   320: dup
    //   321: iconst_3
    //   322: ldc com/fasterxml/Zv5
    //   324: aastore
    //   325: dup
    //   326: iconst_4
    //   327: ldc com/fasterxml/Zvl
    //   329: aastore
    //   330: dup
    //   331: iconst_5
    //   332: ldc com/fasterxml/Zy6
    //   334: aastore
    //   335: dup
    //   336: bipush #6
    //   338: ldc com/fasterxml/Zq0
    //   340: aastore
    //   341: dup
    //   342: bipush #7
    //   344: ldc com/fasterxml/Zqs
    //   346: aastore
    //   347: checkcast [Ljava/lang/Class;
    //   350: putstatic com/fasterxml/Zoz/Zd.Zo : [Ljava/lang/Class;
    //   353: bipush #8
    //   355: anewarray java/lang/Class
    //   358: dup
    //   359: iconst_0
    //   360: ldc com/fasterxml/Zw/Za
    //   362: aastore
    //   363: dup
    //   364: iconst_1
    //   365: ldc com/fasterxml/Zvy
    //   367: aastore
    //   368: dup
    //   369: iconst_2
    //   370: ldc com/fasterxml/Zzv
    //   372: aastore
    //   373: dup
    //   374: iconst_3
    //   375: ldc com/fasterxml/Zv5
    //   377: aastore
    //   378: dup
    //   379: iconst_4
    //   380: ldc com/fasterxml/Zy6
    //   382: aastore
    //   383: dup
    //   384: iconst_5
    //   385: ldc com/fasterxml/Zq0
    //   387: aastore
    //   388: dup
    //   389: bipush #6
    //   391: ldc com/fasterxml/Zqs
    //   393: aastore
    //   394: dup
    //   395: bipush #7
    //   397: ldc com/fasterxml/Zq3
    //   399: aastore
    //   400: checkcast [Ljava/lang/Class;
    //   403: putstatic com/fasterxml/Zoz/Zd.ZK : [Ljava/lang/Class;
    //   406: aconst_null
    //   407: astore #7
    //   409: invokestatic ZF : ()Lcom/fasterxml/Z_/Zi;
    //   412: astore #7
    //   414: goto -> 424
    //   417: astore #8
    //   419: aload #8
    //   421: invokestatic ZI : (Ljava/lang/Throwable;)V
    //   424: aload #7
    //   426: putstatic com/fasterxml/Zoz/Zd.Zd : Lcom/fasterxml/Z_/Zi;
    //   429: return
    // Exception table:
    //   from	to	target	type
    //   409	414	417	java/lang/Throwable
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x389D) & 0xFFFF;
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
      char c = '´';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
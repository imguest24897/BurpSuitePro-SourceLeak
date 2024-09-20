package com.fasterxml.Zs;

import burp.Zbqc;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zk;
import com.fasterxml.Zb.Zmv;
import com.fasterxml.Zb.Zq;
import com.fasterxml.Ze.Zoo;
import com.fasterxml.Ze.Zor;
import com.fasterxml.Ze.Zr;
import com.fasterxml.Zgy;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zi.Za;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zj.Zq;
import com.fasterxml.Zj.Zx;
import com.fasterxml.Zm.Zq;
import com.fasterxml.Zm.Zv;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zo.Ze;
import com.fasterxml.Zo.Zf;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zo.Zzp;
import com.fasterxml.Zor.Zf;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyb;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zvg;
import com.fasterxml.Zye;
import com.fasterxml.Zyt;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public abstract class Zl<T> extends Zyo<T> implements Serializable, Ze {
  private static final long serialVersionUID = 1L;
  
  protected static final int Z_;
  
  @Deprecated
  protected static final int Zl;
  
  protected final Class<?> ZC;
  
  protected final Zk ZH;
  
  private static Zbqc[] Zr;
  
  private static final String[] c;
  
  private static final String[] d;
  
  protected Zl(Class<?> paramClass) {
    this.ZC = paramClass;
    this.ZH = null;
  }
  
  protected Zl(Zk paramZk) {
    this.ZC = (paramZk == null) ? Object.class : paramZk.Zf();
    this.ZH = paramZk;
  }
  
  protected Zl(Zl<?> paramZl) {
    this.ZC = paramZl.ZC;
    this.ZH = paramZl.ZH;
  }
  
  public Class<?> ZX() {
    return this.ZC;
  }
  
  public Zk ZH() {
    return this.ZH;
  }
  
  public Zk Zq(Zyg paramZyg) {
    try {
      if (this.ZH != null)
        return this.ZH; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return paramZyg.ZW(this.ZC);
  }
  
  public Zzp Zw() {
    return null;
  }
  
  protected boolean Zx(Zyo<?> paramZyo) {
    return Zx.ZI(paramZyo);
  }
  
  protected boolean ZS(Zf paramZf) {
    return Zx.ZI(paramZf);
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    return paramZt.Zy(paramZg, paramZyg);
  }
  
  protected T ZF(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: aload_2
    //   5: invokevirtual ZP : (Lcom/fasterxml/Zor/Zyg;)Lcom/fasterxml/Zj/Zx;
    //   8: astore #4
    //   10: aload_2
    //   11: getstatic com/fasterxml/Zor/Zyp.UNWRAP_SINGLE_VALUE_ARRAYS : Lcom/fasterxml/Zor/Zyp;
    //   14: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   17: istore #5
    //   19: astore_3
    //   20: iload #5
    //   22: ifne -> 40
    //   25: aload #4
    //   27: getstatic com/fasterxml/Zj/Zx.Fail : Lcom/fasterxml/Zj/Zx;
    //   30: if_acmpeq -> 158
    //   33: goto -> 40
    //   36: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   39: athrow
    //   40: aload_1
    //   41: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   44: astore #6
    //   46: aload #6
    //   48: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   51: if_acmpne -> 112
    //   54: getstatic com/fasterxml/Zs/Zm.Zu : [I
    //   57: aload #4
    //   59: invokevirtual ordinal : ()I
    //   62: iaload
    //   63: tableswitch default -> 108, 1 -> 92, 2 -> 102, 3 -> 102
    //   88: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: aload_0
    //   93: aload_2
    //   94: invokevirtual Zy : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   97: areturn
    //   98: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: aload_0
    //   103: aload_2
    //   104: invokevirtual Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   107: areturn
    //   108: aload_3
    //   109: ifnull -> 158
    //   112: iload #5
    //   114: ifeq -> 158
    //   117: goto -> 124
    //   120: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   123: athrow
    //   124: aload_0
    //   125: aload_1
    //   126: aload_2
    //   127: invokevirtual ZX : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   130: astore #7
    //   132: aload_1
    //   133: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   136: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   139: if_acmpeq -> 155
    //   142: aload_0
    //   143: aload_1
    //   144: aload_2
    //   145: invokevirtual ZH : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)V
    //   148: goto -> 155
    //   151: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: aload #7
    //   157: areturn
    //   158: aload_2
    //   159: aload_0
    //   160: aload_2
    //   161: invokevirtual Zq : (Lcom/fasterxml/Zor/Zyg;)Lcom/fasterxml/Zor/Zk;
    //   164: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   167: aload_1
    //   168: aconst_null
    //   169: iconst_0
    //   170: anewarray java/lang/Object
    //   173: invokevirtual Za : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zb/Zl;Lcom/fasterxml/Zb/Zg;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   176: areturn
    // Exception table:
    //   from	to	target	type
    //   20	33	36	java/io/IOException
    //   46	88	88	java/io/IOException
    //   54	98	98	java/io/IOException
    //   108	117	120	java/io/IOException
    //   132	148	151	java/io/IOException
  }
  
  protected T ZD(Zg paramZg, Zyg paramZyg) throws IOException {
    Zzp zzp = Zw();
    Class<?> clazz = ZX();
    String str = paramZg.Zd();
    try {
      if (zzp != null)
        try {
          if (zzp.Zp())
            return (T)zzp.Zm(paramZyg, str); 
        } catch (IOException iOException) {
          throw c(null);
        }  
    } catch (IOException iOException) {
      throw c(null);
    } 
    if (str.isEmpty()) {
      Zx zx = paramZyg.ZT(Zb(), clazz, Zq.EmptyString);
      return (T)Zl(paramZg, paramZyg, zx, clazz, b(-24798, -30923));
    } 
    if (ZX(str)) {
      Zx zx = paramZyg.Z_(Zb(), clazz, Zx.Fail);
      return (T)Zl(paramZg, paramZyg, zx, clazz, b(-24828, -7065));
    } 
    if (zzp != null) {
      str = str.trim();
      try {
        if (zzp.ZE())
          try {
            if (paramZyg.ZT(Zd.Integer, Integer.class, Zq.String) == Zx.TryConvert)
              return (T)zzp.ZU(paramZyg, Zr(paramZyg, str)); 
          } catch (IOException iOException) {
            throw c(null);
          }  
      } catch (IOException iOException) {
        throw c(null);
      } 
      try {
        if (zzp.ZY())
          try {
            if (paramZyg.ZT(Zd.Integer, Long.class, Zq.String) == Zx.TryConvert)
              return (T)zzp.Zg(paramZyg, Zu(paramZyg, str)); 
          } catch (IOException iOException) {
            throw c(null);
          }  
      } catch (IOException iOException) {
        throw c(null);
      } 
      try {
        if (zzp.ZH() && paramZyg.ZT(Zd.Boolean, Boolean.class, Zq.String) == Zx.TryConvert) {
          String str1 = str.trim();
          try {
            if (b(-24804, -6394).equals(str1))
              return (T)zzp.ZI(paramZyg, true); 
          } catch (IOException iOException) {
            throw c(null);
          } 
          try {
            if (b(-24772, 4046).equals(str1))
              return (T)zzp.ZI(paramZyg, false); 
          } catch (IOException iOException) {
            throw c(null);
          } 
        } 
      } catch (IOException iOException) {
        throw c(null);
      } 
    } 
    return (T)paramZyg.ZV(clazz, zzp, paramZyg.Zu(), b(-24815, -19404), new Object[] { str });
  }
  
  protected Object Zl(Zg paramZg, Zyg paramZyg, Zx paramZx, Class<?> paramClass, String paramString) throws IOException {
    try {
      switch (Zm.Zu[paramZx.ordinal()]) {
        case 1:
          return Zy(paramZyg);
        case 4:
          ZY(paramZyg, paramZx, paramClass, "", b(-24794, -12503));
          break;
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return null;
  }
  
  protected T ZX(Zg paramZg, Zyg paramZyg) throws IOException {
    return (T)(paramZg.ZL(com.fasterxml.Zb.Zl.START_ARRAY) ? ZR(paramZg, paramZyg) : deserialize(paramZg, paramZyg));
  }
  
  protected final boolean Zt(Zg paramZg, Zyg paramZyg) throws IOException {
    Zbqc[] arrayOfZbqc = Zn();
    switch (paramZg.Zy()) {
      case 6:
        str = paramZg.ZR();
        try {
          if (arrayOfZbqc != null)
            return Boolean.TRUE.equals(ZK(paramZg, paramZyg, boolean.class)); 
        } catch (IOException iOException) {
          throw c(null);
        } 
        break;
      case 7:
        return Boolean.TRUE.equals(ZK(paramZg, paramZyg, boolean.class));
      case 9:
        return true;
      case 10:
        return false;
      case 11:
        Zn(paramZyg);
        return false;
      case 1:
        str = paramZyg.Zc(paramZg, this, boolean.class);
        try {
          if (arrayOfZbqc != null);
        } catch (IOException iOException) {
          throw c(null);
        } 
        break;
      case 3:
        try {
          if (paramZyg.Zg(Zyp.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            try {
              if (paramZg.ZV() == com.fasterxml.Zb.Zl.START_ARRAY)
                return ((Boolean)ZR(paramZg, paramZyg)).booleanValue(); 
            } catch (IOException iOException) {
              throw c(null);
            } 
            boolean bool1 = Zt(paramZg, paramZyg);
            Zp(paramZg, paramZyg);
            return bool1;
          } 
        } catch (IOException iOException) {
          throw c(null);
        } 
      default:
        return ((Boolean)paramZyg.ZB(boolean.class, paramZg)).booleanValue();
    } 
    Zx zx = ZM(paramZyg, str, Zd.Boolean, boolean.class);
    try {
      if (zx == Zx.AsNull) {
        Zn(paramZyg);
        return false;
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (zx == Zx.AsEmpty)
        return false; 
    } catch (IOException iOException) {
      throw c(null);
    } 
    String str = str.trim();
    int i = str.length();
    try {
      if (i == 4) {
        try {
          if (ZQ(str))
            return true; 
        } catch (IOException iOException) {
          throw c(null);
        } 
      } else {
        try {
          if (i == 5)
            try {
              if (ZP(str))
                return false; 
            } catch (IOException iOException) {
              throw c(null);
            }  
        } catch (IOException iOException) {
          throw c(null);
        } 
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (Zo(str)) {
        Zx(paramZyg, str);
        return false;
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    Boolean bool = (Boolean)paramZyg.ZN(boolean.class, str, b(-24786, 11724), new Object[0]);
    return Boolean.TRUE.equals(bool);
  }
  
  protected boolean ZQ(String paramString) {
    char c = paramString.charAt(0);
    try {
      if (c == 't')
        return b(-24810, -28316).equals(paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    try {
      if (c == 'T') {
        try {
          if (!b(-24824, -13070).equals(paramString)) {
            try {
              if (b(-24796, 6228).equals(paramString));
            } catch (IllegalArgumentException illegalArgumentException) {
              throw c(null);
            } 
            return false;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
      } else {
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
  }
  
  protected boolean ZP(String paramString) {
    char c = paramString.charAt(0);
    try {
      if (c == 'f')
        return b(-24797, 4412).equals(paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    try {
      if (c == 'F') {
        try {
          if (!b(-24811, 7984).equals(paramString)) {
            try {
              if (b(-24801, 19714).equals(paramString));
            } catch (IllegalArgumentException illegalArgumentException) {
              throw c(null);
            } 
            return false;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
      } else {
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
  }
  
  protected final Boolean Zf(Zg paramZg, Zyg paramZyg, Class<?> paramClass) throws IOException {
    Zbqc[] arrayOfZbqc = Zn();
    switch (paramZg.Zy()) {
      case 6:
        str = paramZg.ZR();
        try {
          if (arrayOfZbqc != null)
            return ZK(paramZg, paramZyg, paramClass); 
        } catch (IOException iOException) {
          throw c(null);
        } 
        break;
      case 7:
        return ZK(paramZg, paramZyg, paramClass);
      case 9:
        return Boolean.valueOf(true);
      case 10:
        return Boolean.valueOf(false);
      case 11:
        return null;
      case 1:
        str = paramZyg.Zc(paramZg, this, paramClass);
        try {
          if (arrayOfZbqc != null)
            return (Boolean)ZF(paramZg, paramZyg); 
        } catch (IOException iOException) {
          throw c(null);
        } 
        break;
      case 3:
        return (Boolean)ZF(paramZg, paramZyg);
      default:
        return (Boolean)paramZyg.ZB(paramClass, paramZg);
    } 
    Zx zx = ZM(paramZyg, str, Zd.Boolean, paramClass);
    try {
      if (zx == Zx.AsNull)
        return null; 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (zx == Zx.AsEmpty)
        return Boolean.valueOf(false); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    String str = str.trim();
    int i = str.length();
    try {
      if (i == 4) {
        try {
          if (ZQ(str))
            return Boolean.valueOf(true); 
        } catch (IOException iOException) {
          throw c(null);
        } 
      } else {
        try {
          if (i == 5)
            try {
              if (ZP(str))
                return Boolean.valueOf(false); 
            } catch (IOException iOException) {
              throw c(null);
            }  
        } catch (IOException iOException) {
          throw c(null);
        } 
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (Za(paramZyg, str))
        return null; 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return (Boolean)paramZyg.ZN(paramClass, str, b(-24769, 25749), new Object[0]);
  }
  
  protected final byte ZP(Zg paramZg, Zyg paramZyg) throws IOException {
    int i;
    Zbqc[] arrayOfZbqc = Zn();
    switch (paramZg.Zy()) {
      case 6:
        str = paramZg.ZR();
        if (arrayOfZbqc != null);
        break;
      case 8:
        zx = ZV(paramZg, paramZyg, byte.class);
        try {
          if (zx == Zx.AsNull)
            return 0; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        try {
          if (zx == Zx.AsEmpty)
            return 0; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        return paramZg.Zx();
      case 7:
        return paramZg.Zx();
      case 11:
        Zn(paramZyg);
        return 0;
      case 1:
        str = paramZyg.Zc(paramZg, this, byte.class);
        try {
          if (arrayOfZbqc != null);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        break;
      case 3:
        try {
          if (paramZyg.Zg(Zyp.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            try {
              if (paramZg.ZV() == com.fasterxml.Zb.Zl.START_ARRAY)
                return ((Byte)ZR(paramZg, paramZyg)).byteValue(); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw c(null);
            } 
            i = ZP(paramZg, paramZyg);
            Zp(paramZg, paramZyg);
            return i;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
      default:
        return ((Byte)paramZyg.ZE(paramZyg.ZW(byte.class), paramZg)).byteValue();
    } 
    Zx zx = ZM(paramZyg, str, Zd.Integer, byte.class);
    try {
      if (zx == Zx.AsNull) {
        Zn(paramZyg);
        return 0;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    try {
      if (zx == Zx.AsEmpty)
        return 0; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    String str = str.trim();
    try {
      if (Zo(str)) {
        Zx(paramZyg, str);
        return 0;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    paramZg.ZG().ZZ(str.length());
    try {
      i = Zyt.ZC(str);
    } catch (IllegalArgumentException illegalArgumentException) {
      return ((Byte)paramZyg.ZN(this.ZC, str, b(-24805, -5328), new Object[0])).byteValue();
    } 
    try {
      if (ZU(i))
        return ((Byte)paramZyg.ZN(this.ZC, str, b(-24817, -17880), new Object[0])).byteValue(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (byte)i;
  }
  
  protected final short Zu(Zg paramZg, Zyg paramZyg) throws IOException {
    int i;
    Zbqc[] arrayOfZbqc = Zn();
    switch (paramZg.Zy()) {
      case 6:
        str = paramZg.ZR();
        if (arrayOfZbqc != null);
        break;
      case 8:
        zx = ZV(paramZg, paramZyg, short.class);
        try {
          if (zx == Zx.AsNull)
            return 0; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        try {
          if (zx == Zx.AsEmpty)
            return 0; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        return paramZg.Zu();
      case 7:
        return paramZg.Zu();
      case 11:
        Zn(paramZyg);
        return 0;
      case 1:
        str = paramZyg.Zc(paramZg, this, short.class);
        try {
          if (arrayOfZbqc != null);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        break;
      case 3:
        try {
          if (paramZyg.Zg(Zyp.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            try {
              if (paramZg.ZV() == com.fasterxml.Zb.Zl.START_ARRAY)
                return ((Short)ZR(paramZg, paramZyg)).shortValue(); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw c(null);
            } 
            i = Zu(paramZg, paramZyg);
            Zp(paramZg, paramZyg);
            return i;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
      default:
        return ((Short)paramZyg.ZE(paramZyg.ZW(short.class), paramZg)).shortValue();
    } 
    Zx zx = ZM(paramZyg, str, Zd.Integer, short.class);
    try {
      if (zx == Zx.AsNull) {
        Zn(paramZyg);
        return 0;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    try {
      if (zx == Zx.AsEmpty)
        return 0; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    String str = str.trim();
    try {
      if (Zo(str)) {
        Zx(paramZyg, str);
        return 0;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    paramZg.ZG().ZZ(str.length());
    try {
      i = Zyt.ZC(str);
    } catch (IllegalArgumentException illegalArgumentException) {
      return ((Short)paramZyg.ZN(short.class, str, b(-24812, 30597), new Object[0])).shortValue();
    } 
    try {
      if (Zv(i))
        return ((Short)paramZyg.ZN(short.class, str, b(-24809, -7378), new Object[0])).shortValue(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (short)i;
  }
  
  protected final int Zy(Zg paramZg, Zyg paramZyg) throws IOException {
    Zbqc[] arrayOfZbqc = Zn();
    switch (paramZg.Zy()) {
      case 6:
        str = paramZg.ZR();
        if (arrayOfZbqc != null);
        break;
      case 8:
        zx = ZV(paramZg, paramZyg, int.class);
        try {
          if (zx == Zx.AsNull)
            return 0; 
        } catch (IOException iOException) {
          throw c(null);
        } 
        try {
          if (zx == Zx.AsEmpty)
            return 0; 
        } catch (IOException iOException) {
          throw c(null);
        } 
        return paramZg.ZC();
      case 7:
        return paramZg.Ze();
      case 11:
        Zn(paramZyg);
        return 0;
      case 1:
        str = paramZyg.Zc(paramZg, this, int.class);
        try {
          if (arrayOfZbqc != null);
        } catch (IOException iOException) {
          throw c(null);
        } 
        break;
      case 3:
        try {
          if (paramZyg.Zg(Zyp.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            try {
              if (paramZg.ZV() == com.fasterxml.Zb.Zl.START_ARRAY)
                return ((Integer)ZR(paramZg, paramZyg)).intValue(); 
            } catch (IOException iOException) {
              throw c(null);
            } 
            int i = Zy(paramZg, paramZyg);
            Zp(paramZg, paramZyg);
            return i;
          } 
        } catch (IOException iOException) {
          throw c(null);
        } 
      default:
        return ((Number)paramZyg.ZB(int.class, paramZg)).intValue();
    } 
    Zx zx = ZM(paramZyg, str, Zd.Integer, int.class);
    try {
      if (zx == Zx.AsNull) {
        Zn(paramZyg);
        return 0;
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (zx == Zx.AsEmpty)
        return 0; 
    } catch (IOException iOException) {
      throw c(null);
    } 
    String str = str.trim();
    try {
      if (Zo(str)) {
        Zx(paramZyg, str);
        return 0;
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return Zr(paramZyg, str);
  }
  
  protected final int Zr(Zyg paramZyg, String paramString) throws IOException {
    try {
      if (paramString.length() > 9) {
        paramZyg.Zu().ZG().ZZ(paramString.length());
        long l = Zyt.ZO(paramString);
        if (Zn(l)) {
          Number number = (Number)paramZyg.ZN(int.class, paramString, b(-24799, 28729), new Object[] { paramString, Integer.valueOf(-2147483648), Integer.valueOf(2147483647) });
          return ZX(number).intValue();
        } 
        return (int)l;
      } 
      return Zyt.ZC(paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      Number number = (Number)paramZyg.ZN(int.class, paramString, b(-24822, 7852), new Object[0]);
      return ZX(number).intValue();
    } 
  }
  
  protected final Integer ZD(Zg paramZg, Zyg paramZyg, Class<?> paramClass) throws IOException {
    Zbqc[] arrayOfZbqc = Zn();
    switch (paramZg.Zy()) {
      case 6:
        str = paramZg.ZR();
        if (arrayOfZbqc != null);
        break;
      case 8:
        zx = ZV(paramZg, paramZyg, paramClass);
        try {
          if (zx == Zx.AsNull)
            return (Integer)Zj(paramZyg); 
        } catch (IOException iOException) {
          throw c(null);
        } 
        try {
          if (zx == Zx.AsEmpty)
            return (Integer)Zy(paramZyg); 
        } catch (IOException iOException) {
          throw c(null);
        } 
        return Integer.valueOf(paramZg.ZC());
      case 7:
        return Integer.valueOf(paramZg.Ze());
      case 11:
        return (Integer)Zj(paramZyg);
      case 1:
        str = paramZyg.Zc(paramZg, this, paramClass);
        try {
          if (arrayOfZbqc != null)
            return (Integer)ZF(paramZg, paramZyg); 
        } catch (IOException iOException) {
          throw c(null);
        } 
        break;
      case 3:
        return (Integer)ZF(paramZg, paramZyg);
      default:
        return (Integer)paramZyg.ZE(Zq(paramZyg), paramZg);
    } 
    Zx zx = ZR(paramZyg, str);
    try {
      if (zx == Zx.AsNull)
        return (Integer)Zj(paramZyg); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (zx == Zx.AsEmpty)
        return (Integer)Zy(paramZyg); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    String str = str.trim();
    try {
      if (Za(paramZyg, str))
        return (Integer)Zj(paramZyg); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return ZO(paramZyg, str);
  }
  
  protected final Integer ZO(Zyg paramZyg, String paramString) throws IOException {
    try {
      if (paramString.length() > 9) {
        paramZyg.Zu().ZG().ZZ(paramString.length());
        long l = Zyt.ZO(paramString);
        return Zn(l) ? (Integer)paramZyg.ZN(Integer.class, paramString, b(-24807, 30023), new Object[] { paramString, Integer.valueOf(-2147483648), Integer.valueOf(2147483647) }) : Integer.valueOf((int)l);
      } 
      return Integer.valueOf(Zyt.ZC(paramString));
    } catch (IllegalArgumentException illegalArgumentException) {
      return (Integer)paramZyg.ZN(Integer.class, paramString, b(-24789, 15565), new Object[0]);
    } 
  }
  
  protected final long ZN(Zg paramZg, Zyg paramZyg) throws IOException {
    Zbqc[] arrayOfZbqc = Zn();
    switch (paramZg.Zy()) {
      case 6:
        str = paramZg.ZR();
        if (arrayOfZbqc != null);
        break;
      case 8:
        zx = ZV(paramZg, paramZyg, long.class);
        try {
          if (zx == Zx.AsNull)
            return 0L; 
        } catch (IOException iOException) {
          throw c(null);
        } 
        try {
          if (zx == Zx.AsEmpty)
            return 0L; 
        } catch (IOException iOException) {
          throw c(null);
        } 
        return paramZg.Zw();
      case 7:
        return paramZg.ZE();
      case 11:
        Zn(paramZyg);
        return 0L;
      case 1:
        str = paramZyg.Zc(paramZg, this, long.class);
        try {
          if (arrayOfZbqc != null);
        } catch (IOException iOException) {
          throw c(null);
        } 
        break;
      case 3:
        try {
          if (paramZyg.Zg(Zyp.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            try {
              if (paramZg.ZV() == com.fasterxml.Zb.Zl.START_ARRAY)
                return ((Long)ZR(paramZg, paramZyg)).longValue(); 
            } catch (IOException iOException) {
              throw c(null);
            } 
            long l = ZN(paramZg, paramZyg);
            Zp(paramZg, paramZyg);
            return l;
          } 
        } catch (IOException iOException) {
          throw c(null);
        } 
      default:
        return ((Number)paramZyg.ZB(long.class, paramZg)).longValue();
    } 
    Zx zx = ZM(paramZyg, str, Zd.Integer, long.class);
    try {
      if (zx == Zx.AsNull) {
        Zn(paramZyg);
        return 0L;
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (zx == Zx.AsEmpty)
        return 0L; 
    } catch (IOException iOException) {
      throw c(null);
    } 
    String str = str.trim();
    try {
      if (Zo(str)) {
        Zx(paramZyg, str);
        return 0L;
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return Zu(paramZyg, str);
  }
  
  protected final long Zu(Zyg paramZyg, String paramString) throws IOException {
    paramZyg.Zu().ZG().ZZ(paramString.length());
    try {
      return Zyt.ZO(paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      Number number = (Number)paramZyg.ZN(long.class, paramString, b(-24790, -2769), new Object[0]);
      return ZX(number).longValue();
    } 
  }
  
  protected final Long ZH(Zg paramZg, Zyg paramZyg, Class<?> paramClass) throws IOException {
    Zbqc[] arrayOfZbqc = Zn();
    switch (paramZg.Zy()) {
      case 6:
        str = paramZg.ZR();
        if (arrayOfZbqc != null);
        break;
      case 8:
        zx = ZV(paramZg, paramZyg, paramClass);
        try {
          if (zx == Zx.AsNull)
            return (Long)Zj(paramZyg); 
        } catch (IOException iOException) {
          throw c(null);
        } 
        try {
          if (zx == Zx.AsEmpty)
            return (Long)Zy(paramZyg); 
        } catch (IOException iOException) {
          throw c(null);
        } 
        return Long.valueOf(paramZg.Zw());
      case 11:
        return (Long)Zj(paramZyg);
      case 7:
        return Long.valueOf(paramZg.ZE());
      case 1:
        str = paramZyg.Zc(paramZg, this, paramClass);
        try {
          if (arrayOfZbqc != null)
            return (Long)ZF(paramZg, paramZyg); 
        } catch (IOException iOException) {
          throw c(null);
        } 
        break;
      case 3:
        return (Long)ZF(paramZg, paramZyg);
      default:
        return (Long)paramZyg.ZE(Zq(paramZyg), paramZg);
    } 
    Zx zx = ZR(paramZyg, str);
    try {
      if (zx == Zx.AsNull)
        return (Long)Zj(paramZyg); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (zx == Zx.AsEmpty)
        return (Long)Zy(paramZyg); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    String str = str.trim();
    try {
      if (Za(paramZyg, str))
        return (Long)Zj(paramZyg); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return ZB(paramZyg, str);
  }
  
  protected final Long ZB(Zyg paramZyg, String paramString) throws IOException {
    paramZyg.Zu().ZG().ZZ(paramString.length());
    try {
      return Long.valueOf(Zyt.ZO(paramString));
    } catch (IllegalArgumentException illegalArgumentException) {
      return (Long)paramZyg.ZN(Long.class, paramString, b(-24770, 12902), new Object[0]);
    } 
  }
  
  protected final float Zx(Zg paramZg, Zyg paramZyg) throws IOException {
    Zx zx2;
    Zbqc[] arrayOfZbqc = Zn();
    switch (paramZg.Zy()) {
      case 6:
        str = paramZg.ZR();
        if (arrayOfZbqc != null);
        break;
      case 7:
        zx2 = Zk(paramZg, paramZyg, float.class);
        try {
          if (zx2 == Zx.AsNull)
            return 0.0F; 
        } catch (IOException iOException) {
          throw c(null);
        } 
        try {
          if (zx2 == Zx.AsEmpty)
            return 0.0F; 
        } catch (IOException iOException) {
          throw c(null);
        } 
      case 8:
        return paramZg.Zg();
      case 11:
        Zn(paramZyg);
        return 0.0F;
      case 1:
        str = paramZyg.Zc(paramZg, this, float.class);
        try {
          if (arrayOfZbqc != null);
        } catch (IOException iOException) {
          throw c(null);
        } 
        break;
      case 3:
        try {
          if (paramZyg.Zg(Zyp.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            try {
              if (paramZg.ZV() == com.fasterxml.Zb.Zl.START_ARRAY)
                return ((Float)ZR(paramZg, paramZyg)).floatValue(); 
            } catch (IOException iOException) {
              throw c(null);
            } 
            float f = Zx(paramZg, paramZyg);
            Zp(paramZg, paramZyg);
            return f;
          } 
        } catch (IOException iOException) {
          throw c(null);
        } 
      default:
        return ((Number)paramZyg.ZB(float.class, paramZg)).floatValue();
    } 
    Float float_ = ZH(str);
    try {
      if (float_ != null)
        return float_.floatValue(); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    Zx zx1 = ZM(paramZyg, str, Zd.Integer, float.class);
    try {
      if (zx1 == Zx.AsNull) {
        Zn(paramZyg);
        return 0.0F;
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (zx1 == Zx.AsEmpty)
        return 0.0F; 
    } catch (IOException iOException) {
      throw c(null);
    } 
    String str = str.trim();
    try {
      if (Zo(str)) {
        Zx(paramZyg, str);
        return 0.0F;
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return ZW(paramZg, paramZyg, str);
  }
  
  protected final float ZW(Zg paramZg, Zyg paramZyg, String paramString) throws IOException {
    try {
      if (Zyt.ZA(paramString)) {
        paramZyg.Zu().ZG().Z_(paramString.length());
        try {
          return Zyt.ZT(paramString, paramZg.Zt(Zmv.USE_FAST_DOUBLE_PARSER));
        } catch (IllegalArgumentException illegalArgumentException) {}
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    Number number = (Number)paramZyg.ZN(float.class, paramString, b(-24820, 4734), new Object[0]);
    return ZX(number).floatValue();
  }
  
  protected Float ZH(String paramString) {
    try {
      if (!paramString.isEmpty())
        try {
          switch (paramString.charAt(0)) {
            case 'I':
              try {
                if (Zy(paramString))
                  return Float.valueOf(Float.POSITIVE_INFINITY); 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw c(null);
              } 
              break;
            case 'N':
              try {
                if (ZY(paramString))
                  return Float.valueOf(Float.NaN); 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw c(null);
              } 
              break;
            case '-':
              try {
                if (Zp(paramString))
                  return Float.valueOf(Float.NEGATIVE_INFINITY); 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw c(null);
              } 
              break;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return null;
  }
  
  protected final double Zm(Zg paramZg, Zyg paramZyg) throws IOException {
    Zx zx2;
    Zbqc[] arrayOfZbqc = Zn();
    switch (paramZg.Zy()) {
      case 6:
        str = paramZg.ZR();
        if (arrayOfZbqc != null);
        break;
      case 7:
        zx2 = Zk(paramZg, paramZyg, double.class);
        try {
          if (zx2 == Zx.AsNull)
            return 0.0D; 
        } catch (IOException iOException) {
          throw c(null);
        } 
        try {
          if (zx2 == Zx.AsEmpty)
            return 0.0D; 
        } catch (IOException iOException) {
          throw c(null);
        } 
      case 8:
        return paramZg.ZH();
      case 11:
        Zn(paramZyg);
        return 0.0D;
      case 1:
        str = paramZyg.Zc(paramZg, this, double.class);
        try {
          if (arrayOfZbqc != null);
        } catch (IOException iOException) {
          throw c(null);
        } 
        break;
      case 3:
        try {
          if (paramZyg.Zg(Zyp.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            try {
              if (paramZg.ZV() == com.fasterxml.Zb.Zl.START_ARRAY)
                return ((Double)ZR(paramZg, paramZyg)).doubleValue(); 
            } catch (IOException iOException) {
              throw c(null);
            } 
            double d = Zm(paramZg, paramZyg);
            Zp(paramZg, paramZyg);
            return d;
          } 
        } catch (IOException iOException) {
          throw c(null);
        } 
      default:
        return ((Number)paramZyg.ZB(double.class, paramZg)).doubleValue();
    } 
    Double double_ = ZN(str);
    try {
      if (double_ != null)
        return double_.doubleValue(); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    Zx zx1 = ZM(paramZyg, str, Zd.Integer, double.class);
    try {
      if (zx1 == Zx.AsNull) {
        Zn(paramZyg);
        return 0.0D;
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (zx1 == Zx.AsEmpty)
        return 0.0D; 
    } catch (IOException iOException) {
      throw c(null);
    } 
    String str = str.trim();
    try {
      if (Zo(str)) {
        Zx(paramZyg, str);
        return 0.0D;
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return ZH(paramZg, paramZyg, str);
  }
  
  protected final double ZH(Zg paramZg, Zyg paramZyg, String paramString) throws IOException {
    try {
      return ZV(paramString, paramZg.Zt(Zmv.USE_FAST_DOUBLE_PARSER));
    } catch (IllegalArgumentException illegalArgumentException) {
      Number number = (Number)paramZyg.ZN(double.class, paramString, b(-24816, 15513), new Object[0]);
      return ZX(number).doubleValue();
    } 
  }
  
  protected static final double ZV(String paramString, boolean paramBoolean) throws NumberFormatException {
    return Zyt.ZE(paramString, paramBoolean);
  }
  
  protected Double ZN(String paramString) {
    try {
      if (!paramString.isEmpty())
        try {
          switch (paramString.charAt(0)) {
            case 'I':
              try {
                if (Zy(paramString))
                  return Double.valueOf(Double.POSITIVE_INFINITY); 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw c(null);
              } 
              break;
            case 'N':
              try {
                if (ZY(paramString))
                  return Double.valueOf(Double.NaN); 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw c(null);
              } 
              break;
            case '-':
              try {
                if (Zp(paramString))
                  return Double.valueOf(Double.NEGATIVE_INFINITY); 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw c(null);
              } 
              break;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return null;
  }
  
  protected Date ZG(Zg paramZg, Zyg paramZyg) throws IOException {
    String str;
    long l;
    Zbqc[] arrayOfZbqc = Zn();
    switch (paramZg.Zy()) {
      case 6:
        str = paramZg.ZR();
        if (arrayOfZbqc != null);
        return ZI(str.trim(), paramZyg);
      case 7:
        try {
          l = paramZg.ZE();
        } catch (Za za) {
          Number number = (Number)paramZyg.ZA(this.ZC, paramZg.Zb(), b(-24803, 12044), new Object[0]);
          l = number.longValue();
        } 
        return new Date(l);
      case 11:
        return (Date)Zj(paramZyg);
      case 1:
        str = paramZyg.Zc(paramZg, this, this.ZC);
        try {
          if (arrayOfZbqc != null)
            return Zo(paramZg, paramZyg); 
        } catch (Za za) {
          throw c(null);
        } 
        return ZI(str.trim(), paramZyg);
      case 3:
        return Zo(paramZg, paramZyg);
    } 
    return (Date)paramZyg.ZB(this.ZC, paramZg);
  }
  
  protected Date Zo(Zg paramZg, Zyg paramZyg) throws IOException {
    com.fasterxml.Zb.Zl zl;
    Zx zx = ZP(paramZyg);
    Zbqc[] arrayOfZbqc = Zn();
    boolean bool = paramZyg.Zg(Zyp.UNWRAP_SINGLE_VALUE_ARRAYS);
    try {
      if (bool || zx != Zx.Fail) {
        zl = paramZg.ZV();
        try {
          if (zl == com.fasterxml.Zb.Zl.END_ARRAY) {
            try {
              switch (Zm.Zu[zx.ordinal()]) {
                case 1:
                  return (Date)Zy(paramZyg);
                case 2:
                case 3:
                  return (Date)Zj(paramZyg);
              } 
            } catch (IOException iOException) {
              throw c(null);
            } 
            try {
              if (arrayOfZbqc != null) {
                try {
                  if (bool) {
                    try {
                      if (zl == com.fasterxml.Zb.Zl.START_ARRAY)
                        return (Date)ZR(paramZg, paramZyg); 
                    } catch (IOException iOException) {
                      throw c(null);
                    } 
                    Date date = ZG(paramZg, paramZyg);
                    Zp(paramZg, paramZyg);
                    return date;
                  } 
                } catch (IOException iOException) {
                  throw c(null);
                } 
                return (Date)paramZyg.Zp(this.ZC, com.fasterxml.Zb.Zl.START_ARRAY, paramZg, null, new Object[0]);
              } 
            } catch (IOException iOException) {
              throw c(null);
            } 
            return (Date)paramZyg.Zp(this.ZC, com.fasterxml.Zb.Zl.START_ARRAY, paramZg, null, new Object[0]);
          } 
        } catch (IOException iOException) {
          throw c(null);
        } 
      } else {
        return (Date)paramZyg.Zp(this.ZC, com.fasterxml.Zb.Zl.START_ARRAY, paramZg, null, new Object[0]);
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (bool) {
        try {
          if (zl == com.fasterxml.Zb.Zl.START_ARRAY)
            return (Date)ZR(paramZg, paramZyg); 
        } catch (IOException iOException) {
          throw c(null);
        } 
        Date date = ZG(paramZg, paramZyg);
        Zp(paramZg, paramZyg);
        return date;
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return (Date)paramZyg.Zp(this.ZC, com.fasterxml.Zb.Zl.START_ARRAY, paramZg, null, new Object[0]);
  }
  
  protected Date ZI(String paramString, Zyg paramZyg) throws IOException {
    try {
      if (paramString.isEmpty()) {
        Zx zx = ZR(paramZyg, paramString);
        switch (Zm.Zu[zx.ordinal()]) {
          case 1:
            return new Date(0L);
        } 
        return null;
      } 
      try {
        if (Zo(paramString))
          return null; 
      } catch (IOException iOException) {
        throw c(null);
      } 
      return paramZyg.ZG(paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      return (Date)paramZyg.ZN(this.ZC, paramString, b(-24785, 6685), new Object[] { Zx.Zr(illegalArgumentException) });
    } 
  }
  
  protected final String Zc(Zg paramZg, Zyg paramZyg, Zzb paramZzb) throws IOException {
    // Byte code:
    //   0: getstatic com/fasterxml/Zj/Zx.TryConvert : Lcom/fasterxml/Zj/Zx;
    //   3: astore #5
    //   5: invokestatic Zn : ()[Lburp/Zbqc;
    //   8: ldc java/lang/String
    //   10: astore #6
    //   12: astore #4
    //   14: aload_1
    //   15: invokevirtual Zy : ()I
    //   18: tableswitch default -> 190, 1 -> 141, 2 -> 190, 3 -> 190, 4 -> 190, 5 -> 190, 6 -> 80, 7 -> 150, 8 -> 165, 9 -> 180, 10 -> 180, 11 -> 190, 12 -> 89
    //   80: aload_1
    //   81: invokevirtual ZR : ()Ljava/lang/String;
    //   84: areturn
    //   85: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: aload_1
    //   90: invokevirtual ZO : ()Ljava/lang/Object;
    //   93: astore #7
    //   95: aload #7
    //   97: instanceof [B
    //   100: ifeq -> 124
    //   103: aload_2
    //   104: invokevirtual Zs : ()Lcom/fasterxml/Zb/Zy;
    //   107: aload #7
    //   109: checkcast [B
    //   112: checkcast [B
    //   115: iconst_0
    //   116: invokevirtual Zn : ([BZ)Ljava/lang/String;
    //   119: areturn
    //   120: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   123: athrow
    //   124: aload #7
    //   126: ifnonnull -> 135
    //   129: aconst_null
    //   130: areturn
    //   131: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   134: athrow
    //   135: aload #7
    //   137: invokevirtual toString : ()Ljava/lang/String;
    //   140: areturn
    //   141: aload_2
    //   142: aload_1
    //   143: aload_0
    //   144: aload #6
    //   146: invokevirtual Zc : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyo;Ljava/lang/Class;)Ljava/lang/String;
    //   149: areturn
    //   150: aload_0
    //   151: aload_1
    //   152: aload_2
    //   153: aload #6
    //   155: invokevirtual Zv : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/Class;)Lcom/fasterxml/Zj/Zx;
    //   158: astore #5
    //   160: aload #4
    //   162: ifnull -> 190
    //   165: aload_0
    //   166: aload_1
    //   167: aload_2
    //   168: aload #6
    //   170: invokevirtual ZQ : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/Class;)Lcom/fasterxml/Zj/Zx;
    //   173: astore #5
    //   175: aload #4
    //   177: ifnull -> 190
    //   180: aload_0
    //   181: aload_1
    //   182: aload_2
    //   183: aload #6
    //   185: invokevirtual ZM : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/Class;)Lcom/fasterxml/Zj/Zx;
    //   188: astore #5
    //   190: aload #5
    //   192: getstatic com/fasterxml/Zj/Zx.AsNull : Lcom/fasterxml/Zj/Zx;
    //   195: if_acmpne -> 213
    //   198: aload_3
    //   199: aload_2
    //   200: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   205: checkcast java/lang/String
    //   208: areturn
    //   209: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   212: athrow
    //   213: aload #5
    //   215: getstatic com/fasterxml/Zj/Zx.AsEmpty : Lcom/fasterxml/Zj/Zx;
    //   218: if_acmpne -> 228
    //   221: ldc ''
    //   223: areturn
    //   224: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   227: athrow
    //   228: aload_1
    //   229: invokevirtual Zh : ()Lcom/fasterxml/Zb/Zl;
    //   232: invokevirtual Zl : ()Z
    //   235: ifeq -> 256
    //   238: aload_1
    //   239: invokevirtual Zd : ()Ljava/lang/String;
    //   242: astore #7
    //   244: aload #7
    //   246: ifnull -> 256
    //   249: aload #7
    //   251: areturn
    //   252: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   255: athrow
    //   256: aload_2
    //   257: aload #6
    //   259: aload_1
    //   260: invokevirtual ZB : (Ljava/lang/Class;Lcom/fasterxml/Zb/Zg;)Ljava/lang/Object;
    //   263: checkcast java/lang/String
    //   266: areturn
    // Exception table:
    //   from	to	target	type
    //   14	85	85	java/io/IOException
    //   95	120	120	java/io/IOException
    //   124	131	131	java/io/IOException
    //   190	209	209	java/io/IOException
    //   213	224	224	java/io/IOException
    //   244	252	252	java/io/IOException
  }
  
  protected boolean Zo(String paramString) {
    return b(-24818, 31370).equals(paramString);
  }
  
  protected final boolean Zp(String paramString) {
    try {
      if (!b(-24795, 27663).equals(paramString)) {
        try {
          if (b(-24773, 10032).equals(paramString));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
  }
  
  protected final boolean Zy(String paramString) {
    try {
      if (!b(-24788, -23484).equals(paramString)) {
        try {
          if (b(-24814, -2522).equals(paramString));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
  }
  
  protected final boolean ZY(String paramString) {
    return b(-24791, -28772).equals(paramString);
  }
  
  protected static final boolean ZX(String paramString) {
    int i = paramString.length();
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zn();
    while (b < i) {
      try {
        if (paramString.charAt(b) > ' ')
          return false; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw c(null);
      } 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return true;
  }
  
  protected Zx ZR(Zyg paramZyg, String paramString) throws IOException {
    return ZM(paramZyg, paramString, Zb(), ZX());
  }
  
  protected Zx ZM(Zyg paramZyg, String paramString, Zd paramZd, Class<?> paramClass) throws IOException {
    if (paramString.isEmpty()) {
      Zx zx1 = paramZyg.ZT(paramZd, paramClass, Zq.EmptyString);
      return ZY(paramZyg, zx1, paramClass, paramString, b(-24794, -12503));
    } 
    if (ZX(paramString)) {
      Zx zx1 = paramZyg.Z_(paramZd, paramClass, Zx.Fail);
      return ZY(paramZyg, zx1, paramClass, paramString, b(-24776, -14508));
    } 
    try {
      if (paramZyg.ZA(Zq.UNTYPED_SCALARS))
        return Zx.TryConvert; 
    } catch (IOException iOException) {
      throw c(null);
    } 
    Zx zx = paramZyg.ZT(paramZd, paramClass, Zq.String);
    try {
      if (zx == Zx.Fail)
        paramZyg.ZY(this, b(-24825, -18911), new Object[] { paramString, Zu() }); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return zx;
  }
  
  protected Zx ZV(Zg paramZg, Zyg paramZyg, Class<?> paramClass) throws IOException {
    Zx zx = paramZyg.ZT(Zd.Integer, paramClass, Zq.Float);
    try {
      if (zx == Zx.Fail)
        return ZY(paramZyg, zx, paramClass, paramZg.Zb(), b(-24802, 30059) + paramZg.ZR() + ")"); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return zx;
  }
  
  protected Zx Zv(Zg paramZg, Zyg paramZyg, Class<?> paramClass) throws IOException {
    return Zf(paramZg, paramZyg, paramClass, paramZg.Zb(), Zq.Integer);
  }
  
  protected Zx ZQ(Zg paramZg, Zyg paramZyg, Class<?> paramClass) throws IOException {
    return Zf(paramZg, paramZyg, paramClass, paramZg.Zb(), Zq.Float);
  }
  
  protected Zx ZM(Zg paramZg, Zyg paramZyg, Class<?> paramClass) throws IOException {
    return Zf(paramZg, paramZyg, paramClass, Boolean.valueOf(paramZg.ZB()), Zq.Boolean);
  }
  
  protected Zx Zf(Zg paramZg, Zyg paramZyg, Class<?> paramClass, Object paramObject, Zq paramZq) throws IOException {
    Zx zx = paramZyg.ZT(Zd.Textual, paramClass, paramZq);
    try {
      if (zx == Zx.Fail)
        return ZY(paramZyg, zx, paramClass, paramObject, paramZq.name() + b(-24813, -3889) + paramZg.ZR() + ")"); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return zx;
  }
  
  protected Zx Zk(Zg paramZg, Zyg paramZyg, Class<?> paramClass) throws IOException {
    Zx zx = paramZyg.ZT(Zd.Float, paramClass, Zq.Integer);
    try {
      if (zx == Zx.Fail)
        return ZY(paramZyg, zx, paramClass, paramZg.Zb(), b(-24823, 19551) + paramZg.ZR() + ")"); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return zx;
  }
  
  protected Boolean ZK(Zg paramZg, Zyg paramZyg, Class<?> paramClass) throws IOException {
    Zx zx = paramZyg.ZT(Zd.Boolean, paramClass, Zq.Integer);
    try {
      switch (Zm.Zu[zx.ordinal()]) {
        case 4:
          ZY(paramZyg, zx, paramClass, paramZg.Zb(), b(-24787, 30285) + paramZg.ZR() + ")");
          return Boolean.FALSE;
        case 2:
          return null;
        case 1:
          return Boolean.FALSE;
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (paramZg.ZL() == Zk.INT) {
        try {
        
        } catch (IOException iOException) {
          throw c(null);
        } 
        return Boolean.valueOf((paramZg.Ze() != 0));
      } 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
    
    } catch (IOException iOException) {
      throw c(null);
    } 
    return Boolean.valueOf(!"0".equals(paramZg.ZR()));
  }
  
  protected Zx ZY(Zyg paramZyg, Zx paramZx, Class<?> paramClass, Object paramObject, String paramString) throws IOException {
    try {
      if (paramZx == Zx.Fail)
        paramZyg.ZQ(this, paramClass, paramObject, b(-24830, 24785), new Object[] { paramString, ZF(paramClass) }); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return paramZx;
  }
  
  protected boolean Za(Zyg paramZyg, String paramString) throws Zy_ {
    try {
      if (Zo(paramString)) {
        try {
          if (!paramZyg.Zm(Zy9.ALLOW_COERCION_OF_SCALARS))
            ZU(paramZyg, true, (Enum<?>)Zy9.ALLOW_COERCION_OF_SCALARS, b(-24827, 21408)); 
        } catch (Zy_ zy_) {
          throw c(null);
        } 
        return true;
      } 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    return false;
  }
  
  protected Object Ze(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZyg.Zg(Zyp.USE_BIG_INTEGER_FOR_INTS))
        return paramZg.ZX(); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    try {
      if (paramZyg.Zg(Zyp.USE_LONG_FOR_INTS))
        return Long.valueOf(paramZg.ZE()); 
    } catch (IOException iOException) {
      throw c(null);
    } 
    return paramZg.Zb();
  }
  
  protected final void Zn(Zyg paramZyg) throws Zy_ {
    try {
      if (paramZyg.Zg(Zyp.FAIL_ON_NULL_FOR_PRIMITIVES))
        paramZyg.ZY(this, b(-24793, -17399), new Object[] { Zu() }); 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
  }
  
  protected final void Zx(Zyg paramZyg, String paramString) throws Zy_ {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: getstatic com/fasterxml/Zor/Zy9.ALLOW_COERCION_OF_SCALARS : Lcom/fasterxml/Zor/Zy9;
    //   8: invokevirtual Zm : (Lcom/fasterxml/Zor/Zy9;)Z
    //   11: ifne -> 26
    //   14: getstatic com/fasterxml/Zor/Zy9.ALLOW_COERCION_OF_SCALARS : Lcom/fasterxml/Zor/Zy9;
    //   17: astore #4
    //   19: iconst_1
    //   20: istore #5
    //   22: aload_3
    //   23: ifnull -> 60
    //   26: aload_1
    //   27: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_NULL_FOR_PRIMITIVES : Lcom/fasterxml/Zor/Zyp;
    //   30: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   33: ifeq -> 55
    //   36: goto -> 43
    //   39: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_NULL_FOR_PRIMITIVES : Lcom/fasterxml/Zor/Zyp;
    //   46: astore #4
    //   48: iconst_0
    //   49: istore #5
    //   51: aload_3
    //   52: ifnull -> 60
    //   55: return
    //   56: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   59: athrow
    //   60: aload_2
    //   61: invokevirtual isEmpty : ()Z
    //   64: ifeq -> 83
    //   67: sipush #-24794
    //   70: sipush #-12503
    //   73: invokestatic b : (II)Ljava/lang/String;
    //   76: goto -> 103
    //   79: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: sipush #-24775
    //   86: sipush #-28098
    //   89: invokestatic b : (II)Ljava/lang/String;
    //   92: iconst_1
    //   93: anewarray java/lang/Object
    //   96: dup
    //   97: iconst_0
    //   98: aload_2
    //   99: aastore
    //   100: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   103: astore #6
    //   105: aload_0
    //   106: aload_1
    //   107: iload #5
    //   109: aload #4
    //   111: aload #6
    //   113: invokevirtual ZU : (Lcom/fasterxml/Zor/Zyg;ZLjava/lang/Enum;Ljava/lang/String;)V
    //   116: return
    // Exception table:
    //   from	to	target	type
    //   22	36	39	com/fasterxml/Zor/Zy_
    //   51	56	56	com/fasterxml/Zor/Zy_
    //   60	79	79	com/fasterxml/Zor/Zy_
  }
  
  protected void ZU(Zyg paramZyg, boolean paramBoolean, Enum<?> paramEnum, String paramString) throws Zy_ {
    try {
    
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    String str = paramBoolean ? b(-24808, -19145) : b(-24774, 23242);
    paramZyg.ZY(this, b(-24800, 11573), new Object[] { paramString, Zu(), str, paramEnum.getDeclaringClass().getSimpleName(), paramEnum.name() });
  }
  
  protected String Zu() {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: invokevirtual ZH : ()Lcom/fasterxml/Zor/Zk;
    //   7: astore #4
    //   9: astore_1
    //   10: aload #4
    //   12: ifnull -> 80
    //   15: aload #4
    //   17: invokevirtual Zm : ()Z
    //   20: ifne -> 80
    //   23: goto -> 30
    //   26: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   29: athrow
    //   30: aload #4
    //   32: invokevirtual ZH : ()Z
    //   35: ifne -> 60
    //   38: goto -> 45
    //   41: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: aload #4
    //   47: invokevirtual ZP : ()Z
    //   50: ifeq -> 68
    //   53: goto -> 60
    //   56: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   59: athrow
    //   60: iconst_1
    //   61: goto -> 69
    //   64: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: iconst_0
    //   69: istore_2
    //   70: aload #4
    //   72: invokestatic ZN : (Lcom/fasterxml/Zor/Zk;)Ljava/lang/String;
    //   75: astore_3
    //   76: aload_1
    //   77: ifnull -> 98
    //   80: aload_0
    //   81: invokevirtual ZX : ()Ljava/lang/Class;
    //   84: astore #5
    //   86: aload #5
    //   88: invokestatic ZU : (Ljava/lang/Class;)Z
    //   91: istore_2
    //   92: aload #5
    //   94: invokestatic Zy : (Ljava/lang/Object;)Ljava/lang/String;
    //   97: astore_3
    //   98: iload_2
    //   99: ifeq -> 133
    //   102: new java/lang/StringBuilder
    //   105: dup
    //   106: invokespecial <init> : ()V
    //   109: sipush #-24826
    //   112: sipush #-25105
    //   115: invokestatic b : (II)Ljava/lang/String;
    //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: aload_3
    //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: invokevirtual toString : ()Ljava/lang/String;
    //   128: areturn
    //   129: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   132: athrow
    //   133: new java/lang/StringBuilder
    //   136: dup
    //   137: invokespecial <init> : ()V
    //   140: aload_3
    //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: sipush #-24829
    //   147: sipush #-3577
    //   150: invokestatic b : (II)Ljava/lang/String;
    //   153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: invokevirtual toString : ()Ljava/lang/String;
    //   159: areturn
    // Exception table:
    //   from	to	target	type
    //   10	23	26	java/lang/IllegalArgumentException
    //   15	38	41	java/lang/IllegalArgumentException
    //   30	53	56	java/lang/IllegalArgumentException
    //   45	64	64	java/lang/IllegalArgumentException
    //   98	129	129	java/lang/IllegalArgumentException
  }
  
  protected String ZF(Class<?> paramClass) {
    String str = Zx.Zy(paramClass);
    try {
      if (Zx.ZU(paramClass))
        return b(-24792, -8852) + str; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return str + b(-24806, 6102);
  }
  
  protected Zyo<Object> ZV(Zyg paramZyg, Zk paramZk, Zo paramZo) throws Zy_ {
    return paramZyg.ZC(paramZk, paramZo);
  }
  
  protected final boolean Ze(String paramString) {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_1
    //   4: invokevirtual length : ()I
    //   7: istore_3
    //   8: astore_2
    //   9: iload_3
    //   10: ifle -> 119
    //   13: aload_1
    //   14: iconst_0
    //   15: invokevirtual charAt : (I)C
    //   18: istore #4
    //   20: iload #4
    //   22: bipush #45
    //   24: if_icmpeq -> 41
    //   27: iload #4
    //   29: bipush #43
    //   31: if_icmpne -> 66
    //   34: goto -> 41
    //   37: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   40: athrow
    //   41: iload_3
    //   42: iconst_1
    //   43: if_icmpne -> 59
    //   46: goto -> 53
    //   49: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   52: athrow
    //   53: iconst_0
    //   54: ireturn
    //   55: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: iconst_1
    //   60: istore #5
    //   62: aload_2
    //   63: ifnull -> 69
    //   66: iconst_0
    //   67: istore #5
    //   69: iload #5
    //   71: iload_3
    //   72: if_icmpge -> 117
    //   75: aload_1
    //   76: iload #5
    //   78: invokevirtual charAt : (I)C
    //   81: istore #6
    //   83: iload #6
    //   85: bipush #57
    //   87: if_icmpgt -> 104
    //   90: iload #6
    //   92: bipush #48
    //   94: if_icmpge -> 110
    //   97: goto -> 104
    //   100: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: iconst_0
    //   105: ireturn
    //   106: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: iinc #5, 1
    //   113: aload_2
    //   114: ifnull -> 69
    //   117: iconst_1
    //   118: ireturn
    //   119: iconst_0
    //   120: ireturn
    // Exception table:
    //   from	to	target	type
    //   20	34	37	java/lang/IllegalArgumentException
    //   27	46	49	java/lang/IllegalArgumentException
    //   41	55	55	java/lang/IllegalArgumentException
    //   83	97	100	java/lang/IllegalArgumentException
    //   90	106	106	java/lang/IllegalArgumentException
  }
  
  protected Zyo<?> Zq(Zyg paramZyg, Zo paramZo, Zyo<?> paramZyo) throws Zy_ {
    Zt zt = paramZyg.Zv();
    if (Zg(zt, paramZo)) {
      Ziz ziz = paramZo.ZQ();
      if (ziz != null) {
        Object object = zt.ZO(ziz);
        if (object != null) {
          Zv<Object, ?> zv = paramZyg.ZS((Ziv)paramZo.ZQ(), object);
          Zk zk = zv.ZD(paramZyg.ZL());
          if (paramZyo == null)
            paramZyo = paramZyg.ZC(zk, paramZo); 
          return new Zum(zv, zk, paramZyo);
        } 
      } 
    } 
    return paramZyo;
  }
  
  protected Zgy Zx(Zyg paramZyg, Zo paramZo, Class<?> paramClass) {
    try {
      if (paramZo != null)
        return paramZo.ZN((Zf)paramZyg.Za(), paramClass); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return paramZyg.Zp(paramClass);
  }
  
  protected Boolean ZP(Zyg paramZyg, Zo paramZo, Class<?> paramClass, Zye paramZye) {
    Zgy zgy = Zx(paramZyg, paramZo, paramClass);
    try {
      if (zgy != null)
        return zgy.Zq(paramZye); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return null;
  }
  
  protected final Zzb Zj(Zyg paramZyg, Zv paramZv, Zyb paramZyb) throws Zy_ {
    try {
      if (paramZv != null)
        return Zh(paramZyg, (Zo)paramZv, paramZyb.Zb(), paramZv.ZD()); 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    return null;
  }
  
  protected Zzb Zw(Zyg paramZyg, Zo paramZo, Zyo<?> paramZyo) throws Zy_ {
    Zvg zvg = Zi(paramZyg, paramZo);
    try {
      if (zvg == Zvg.SKIP)
        return (Zzb)Zoo.Zp(); 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    try {
      if (zvg == Zvg.FAIL) {
        if (paramZo == null) {
          Zk zk = paramZyg.ZW(paramZyo.ZX());
          if (zk.ZH())
            zk = zk.ZB(); 
          return (Zzb)Zor.ZF(zk);
        } 
        return (Zzb)Zor.Zc(paramZo, paramZo.Zp().ZB());
      } 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    Zzb zzb = Zh(paramZyg, paramZo, zvg, paramZyo);
    try {
      if (zzb != null)
        return zzb; 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    return (Zzb)paramZyo;
  }
  
  protected Zvg Zi(Zyg paramZyg, Zo paramZo) throws Zy_ {
    try {
      if (paramZo != null)
        return paramZo.ZO().ZI(); 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    return paramZyg.Za().ZF().Zy();
  }
  
  protected final Zzb Zh(Zyg paramZyg, Zo paramZo, Zvg paramZvg, Zyo<?> paramZyo) throws Zy_ {
    try {
      if (paramZvg == Zvg.FAIL) {
        try {
          if (paramZo == null) {
            try {
            
            } catch (Zy_ zy_) {
              throw c(null);
            } 
            Class clazz = (paramZyo == null) ? Object.class : paramZyo.ZX();
            return (Zzb)Zor.ZF(paramZyg.ZW(clazz));
          } 
        } catch (Zy_ zy_) {
          throw c(null);
        } 
        return (Zzb)Zor.ZA(paramZo);
      } 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    try {
      if (paramZvg == Zvg.AS_EMPTY) {
        try {
          if (paramZyo == null)
            return null; 
        } catch (Zy_ zy_) {
          throw c(null);
        } 
        if (paramZyo instanceof Zf) {
          Zf zf = (Zf)paramZyo;
          Zzp zzp = zf.Zw();
          try {
            if (!zzp.ZJ()) {
              try {
              
              } catch (Zy_ zy_) {
                throw c(null);
              } 
              Zk zk = (paramZo == null) ? zf.ZH() : paramZo.Zp();
              return (Zzb)paramZyg.Zm(zk, String.format(b(-24819, -23766), new Object[] { zk }));
            } 
          } catch (Zy_ zy_) {
            throw c(null);
          } 
        } 
        Zq zq = paramZyo.Zm();
        try {
          if (zq == Zq.ALWAYS_NULL)
            return (Zzb)Zoo.Zv(); 
        } catch (Zy_ zy_) {
          throw c(null);
        } 
        try {
          if (zq == Zq.CONSTANT)
            return (Zzb)Zoo.Zk(paramZyo.Zy(paramZyg)); 
        } catch (Zy_ zy_) {
          throw c(null);
        } 
        return (Zzb)new Zr(paramZyo);
      } 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    try {
      if (paramZvg == Zvg.SKIP)
        return (Zzb)Zoo.Zp(); 
    } catch (Zy_ zy_) {
      throw c(null);
    } 
    return null;
  }
  
  protected Zx ZK(Zyg paramZyg) {
    return paramZyg.ZT(Zb(), ZX(), Zq.EmptyString);
  }
  
  protected Zx ZP(Zyg paramZyg) {
    return paramZyg.ZT(Zb(), ZX(), Zq.EmptyArray);
  }
  
  protected Zx ZS(Zyg paramZyg) {
    return paramZyg.Z_(Zb(), ZX(), Zx.Fail);
  }
  
  protected void Zb(Zg paramZg, Zyg paramZyg, Object<?> paramObject, String paramString) throws IOException {
    if (paramObject == null)
      paramObject = (Object<?>)ZX(); 
    try {
      if (paramZyg.Zm(paramZg, this, paramObject, paramString))
        return; 
    } catch (IOException iOException) {
      throw c(null);
    } 
    paramZg.Zc();
  }
  
  protected void ZH(Zg paramZg, Zyg paramZyg) throws IOException {
    paramZyg.Zw(this, com.fasterxml.Zb.Zl.END_ARRAY, b(-24831, -12911), new Object[] { ZX().getName() });
  }
  
  protected Object ZR(Zg paramZg, Zyg paramZyg) throws IOException {
    String str = String.format(b(-24821, -29121), new Object[] { Zx.Za(this.ZC), com.fasterxml.Zb.Zl.START_ARRAY, b(-24832, -4470) });
    return paramZyg.Za(Zq(paramZyg), paramZg.Zh(), paramZg, str, new Object[0]);
  }
  
  protected void Zp(Zg paramZg, Zyg paramZyg) throws IOException {
    com.fasterxml.Zb.Zl zl = paramZg.ZV();
    try {
      if (zl != com.fasterxml.Zb.Zl.END_ARRAY)
        ZH(paramZg, paramZyg); 
    } catch (IOException iOException) {
      throw c(null);
    } 
  }
  
  protected static final boolean Zg(Object paramObject1, Object paramObject2) {
    try {
      if (paramObject1 != null)
        try {
          if (paramObject2 != null);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return false;
  }
  
  protected final boolean ZU(int paramInt) {
    try {
      if (paramInt >= -128) {
        try {
          if (paramInt > 255);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
  }
  
  protected final boolean Zv(int paramInt) {
    try {
      if (paramInt >= -32768) {
        try {
          if (paramInt > 32767);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
  }
  
  protected final boolean Zn(long paramLong) {
    try {
      if (paramLong >= -2147483648L) {
        try {
          if (paramLong > 2147483647L);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
  }
  
  protected Number ZX(Number paramNumber) {
    if (paramNumber == null)
      paramNumber = Integer.valueOf(0); 
    return paramNumber;
  }
  
  static {
    // Byte code:
    //   0: bipush #55
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zk : ([Lburp/Zbqc;)V
    //   13: ldc '­"Éñ?Ç|¬{áàL¢öçuöì7-TÅm 26H-ÔÚ=;3\\fÑ´á8¤q_ïùç2.¸±ÛZð¯LP;á%%ñònQwoÌK@Nð:}d\\n*µ+HþªvcS1 a~êÒ¦v]ÆU(nPÈ?¼Ï?ßø §4Ê=_ë\\n´ïÃ.}ýeWÝÎJ²¤¾¤É(Eõ\ÕµÂ@"ÙÝÃü÷âoweKÄlÿö,U¬)q5Z)4\\fÃEZj¸6%AîøB:Q]ï'íâtî1+^ÂÆÜñ`­åoo½}6'ýIÃÁ¦éjV¿Ø:HßQô"B×·þì^'öâÆÀêÅÇS/õ­ãsYj!ÒÍmhøú¶>UÀ}ÉÊ±@Ö®7óD\\n~vØ¼E`?åÈæ© wÙ¹GäèË(Ü-1r÷#OÃìZvÀ[àgAoïî\\tó+(ébºõuÔn¡p(í÷;¸`5ÜËuþV¥-þ\\fwAO¡µ^Òv¥ø¦]=/lnS¨M[µ¹ç5¬¾BÝ'ªýí.n*à(È&BÐ0mþbÝ×#îþQæ\\fÒA@»Î¿µFAtÉÜÑ:[[+aÁÛýq<\\n~ôiY­Ûa 0ÜKAVØÿ¾×Tô[Bô{P8ðb§2(÷Wäk&3Ö@Å3Z$o:¬M1à²à¦±Cu$5#Ý®3.ÆÔ!fêºè«9\\n?+ÿ§ýÇ;.¼©°D¬W'|äæf¶ ÖµíÓ`AÚ¥Ô0òêZ¾häÈNHyd<!éÝõ×¤ï\\rÃICË*]û¾z´ñ1úG6ÀEú&øáÅ\\tìÕé5FÝ¢P­ÍÎ¥]ðs®_IÕÆ\\tc;+M`0MÏ*÷ªÑ@SJÍ»2çW¥5Ãÿm³C¡RõÜ¤Fi'¾tß:dj<3MÍh}ü7ï¿[ÖB.T3lE$7Em>ª,XºÈb¼dJßBäï*7ç/;æa%·ðj`RÛY¶iR¸ø¬ã&ëø`×£\\bHÁä[z"Àñ³èçZÄÖw¸¸\\b$I±1#ÃàóxfC¯×'j"ÂþÈ{Pûö£'eù>A)DÖìT³ÁKUÓJéqqÀ|æ6¯²¯§+8ö¨î«zkÐ5zÖñéð9ÂàÓqQh£®sâ»Ëyò-ùÅ«Ó*Öí±Ä(Jç\\t°øì?È4¾7FÐ%,1úÙw5¼\\b º¿ * ®ÄøÅÔÉ¾È¼ô®ñiBÝ¼Ð©¦ATR[Ó=¶­£Wä ÿ¥/¼UD!"ßEÜnñuÉçu!Ýªó BLúÂÏ¼ÿ0,·)mqYZ¤>+ðR¥WÌî¤%Øp¼Ý¸î+E½ÛeK¢äæ\\nó7z'ïôKGâÂµÜ}Vö#~ÍO3âµtv7?Ø`§aAXè"²ñõZûÃ;ïÐ~ÇÁ&#ö\\b{¸ì¾©*" G,&þä Ë(ÅþBÅo$~MéÅ&ÞÈ|ÊZ²K4.ú5«ÍK ÝÅï\Ç.N8ÙÌÇÙw#6\\beúÚä¶Wú¼; ê¯ 6!c\\fïG h\\nÄMÉE=KZÕ8ú8ÓáÌs\\r:ÖäïÎ!\\t»sïé£/$ýU§ñ)ÏÈ]Þ\!b )´OãîÚæã5è@¬§?f¿êDwl9RLù2è\\bêÈ?X.ËþVÊ£çxwÿªjÔa»«çìâ\\nibt«§Â®ok#I´üN\\bvÈ¼ù{;D¢\\fÊ;XbÄ1­ti^²îRÇËB'ZñNWwMhU©®´Æ$ØoOÏ&"<¿,¥¦kæ ÚÎlöe^(\\fËâæñ&§´(mÙÚÇ±\\nÝ§FìË*mqÇ;Ï¡oR:\\t(1Q¨éVÒF£# "d:¶Qðàúÿ[H°HXS!|áÈôu»\\neö<°£¨a[I¹"Õ Ó(yÖû¥þÇnæ;êÒËÎæb>²Ð/ÅÍ;'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #23
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #54
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
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
    //   72: ldc 'ÿÑò }/ü_\\rÈ,Û$Áy?wMÞ°,pWÑíä'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #33
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: iconst_3
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 86
    //   130: aload #5
    //   132: putstatic com/fasterxml/Zs/Zl.c : [Ljava/lang/String;
    //   135: bipush #55
    //   137: anewarray java/lang/String
    //   140: putstatic com/fasterxml/Zs/Zl.d : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #47
    //   218: goto -> 248
    //   221: bipush #55
    //   223: goto -> 248
    //   226: bipush #101
    //   228: goto -> 248
    //   231: bipush #103
    //   233: goto -> 248
    //   236: bipush #76
    //   238: goto -> 248
    //   241: bipush #27
    //   243: goto -> 248
    //   246: bipush #68
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: getstatic com/fasterxml/Zor/Zyp.USE_BIG_INTEGER_FOR_INTS : Lcom/fasterxml/Zor/Zyp;
    //   307: invokevirtual Zu : ()I
    //   310: getstatic com/fasterxml/Zor/Zyp.USE_LONG_FOR_INTS : Lcom/fasterxml/Zor/Zyp;
    //   313: invokevirtual Zu : ()I
    //   316: ior
    //   317: putstatic com/fasterxml/Zs/Zl.Z_ : I
    //   320: getstatic com/fasterxml/Zor/Zyp.UNWRAP_SINGLE_VALUE_ARRAYS : Lcom/fasterxml/Zor/Zyp;
    //   323: invokevirtual Zu : ()I
    //   326: getstatic com/fasterxml/Zor/Zyp.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT : Lcom/fasterxml/Zor/Zyp;
    //   329: invokevirtual Zu : ()I
    //   332: ior
    //   333: putstatic com/fasterxml/Zs/Zl.Zl : I
    //   336: return
  }
  
  public static void Zk(Zbqc[] paramArrayOfZbqc) {
    Zr = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zn() {
    return Zr;
  }
  
  private static Exception c(Exception paramException) {
    return paramException;
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9F0A) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      char c = 'Î';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package com.fasterxml.Zh;

import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zk;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zr implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final String[] ZV;
  
  private static final Zk[] Zv;
  
  private static final Zr Zk;
  
  private final String[] Z_;
  
  private final Zk[] Zl;
  
  private final String[] ZE;
  
  private final int ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zr(String[] paramArrayOfString1, Zk[] paramArrayOfZk, String[] paramArrayOfString2) {
    try {
      this.Z_ = (paramArrayOfString1 == null) ? ZV : paramArrayOfString1;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      this.Zl = (paramArrayOfZk == null) ? Zv : paramArrayOfZk;
      if (this.Z_.length != this.Zl.length)
        throw new IllegalArgumentException(a(-13936, -300) + this.Z_.length + a(-13922, 12501) + this.Zl.length + ")"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZE = paramArrayOfString2;
    this.ZW = Arrays.hashCode((Object[])this.Zl);
  }
  
  public static Zr ZN() {
    return Zk;
  }
  
  protected Object readResolve() {
    try {
      if (this.Z_ != null)
        try {
          return (this.Z_.length != 0) ? this : Zk;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zk;
  }
  
  public static Zr Zs(Class<?> paramClass, List<Zk> paramList) {
    try {
      if (paramList != null) {
        try {
          if (paramList.isEmpty());
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        Zk[] arrayOfZk = paramList.<Zk>toArray(Zv);
        return Z_(paramClass, arrayOfZk);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public static Zr Z_(Class<?> paramClass, Zk[] paramArrayOfZk) {
    String[] arrayOfString;
    if (paramArrayOfZk == null) {
      paramArrayOfZk = Zv;
    } else {
      try {
        switch (paramArrayOfZk.length) {
          case 1:
            return ZY(paramClass, paramArrayOfZk[0]);
          case 2:
            return ZC(paramClass, paramArrayOfZk[0], paramArrayOfZk[1]);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    TypeVariable[] arrayOfTypeVariable = (TypeVariable[])paramClass.getTypeParameters();
    try {
      if (arrayOfTypeVariable == null || arrayOfTypeVariable.length == 0) {
        arrayOfString = ZV;
      } else {
        int i = arrayOfTypeVariable.length;
        arrayOfString = new String[i];
        byte b = 0;
        try {
          while (b < i) {
            arrayOfString[b] = arrayOfTypeVariable[b].getName();
            b++;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (arrayOfString.length != paramArrayOfZk.length) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        throw new IllegalArgumentException(a(-13926, -29928) + paramClass.getName() + a(-13924, 10376) + paramArrayOfZk.length + a(-13935, -30755) + ((paramArrayOfZk.length == 1) ? "" : "s") + a(-13925, 22778) + arrayOfString.length);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zr(arrayOfString, paramArrayOfZk, null);
  }
  
  public static Zr ZY(Class<?> paramClass, Zk paramZk) {
    TypeVariable[] arrayOfTypeVariable = (TypeVariable[])Zm.Zy(paramClass);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = (arrayOfTypeVariable == null) ? false : arrayOfTypeVariable.length;
    try {
      if (bool != true)
        throw new IllegalArgumentException(a(-13932, 29859) + paramClass.getName() + a(-13923, -26125) + bool); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zr(new String[] { arrayOfTypeVariable[0].getName() }, new Zk[] { paramZk }, null);
  }
  
  public static Zr ZC(Class<?> paramClass, Zk paramZk1, Zk paramZk2) {
    TypeVariable[] arrayOfTypeVariable = (TypeVariable[])Zm.Zl(paramClass);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = (arrayOfTypeVariable == null) ? false : arrayOfTypeVariable.length;
    try {
      if (bool != 2)
        throw new IllegalArgumentException(a(-13932, 29859) + paramClass.getName() + a(-13931, 1132) + bool); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zr(new String[] { arrayOfTypeVariable[0].getName(), arrayOfTypeVariable[1].getName() }, new Zk[] { paramZk1, paramZk2 }, null);
  }
  
  public static Zr Z_(List<String> paramList, List<Zk> paramList1) {
    try {
      if (paramList != null)
        try {
          if (!paramList.isEmpty())
            try {
              if (paramList1 != null)
                try {
                  return !paramList1.isEmpty() ? new Zr(paramList.<String>toArray(ZV), paramList1.<Zk>toArray(Zv), null) : Zk;
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
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
    return Zk;
  }
  
  public static Zr Zl(Class<?> paramClass, Zk paramZk) {
    TypeVariable[] arrayOfTypeVariable = (TypeVariable[])paramClass.getTypeParameters();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = (arrayOfTypeVariable == null) ? false : arrayOfTypeVariable.length;
    try {
      if (!bool)
        return Zk; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (bool != true)
        throw new IllegalArgumentException(a(-13932, 29859) + paramClass.getName() + a(-13928, -13731) + bool); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zr(new String[] { arrayOfTypeVariable[0].getName() }, new Zk[] { paramZk }, null);
  }
  
  public static Zr Zb(Class<?> paramClass, Zk[] paramArrayOfZk) {
    TypeVariable[] arrayOfTypeVariable = (TypeVariable[])paramClass.getTypeParameters();
    int[] arrayOfInt = Zd.Zs();
    try {
      if (arrayOfTypeVariable != null)
        try {
          if (arrayOfTypeVariable.length != 0) {
            if (paramArrayOfZk == null)
              paramArrayOfZk = Zv; 
            int i = arrayOfTypeVariable.length;
            String[] arrayOfString = new String[i];
            byte b = 0;
            while (b < i) {
              arrayOfString[b] = arrayOfTypeVariable[b].getName();
              b++;
              if (arrayOfInt != null)
                break; 
            } 
            try {
              if (arrayOfString.length != paramArrayOfZk.length) {
                try {
                
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                throw new IllegalArgumentException(a(-13932, 29859) + paramClass.getName() + a(-13921, 971) + paramArrayOfZk.length + a(-13927, -9873) + ((paramArrayOfZk.length == 1) ? "" : "s") + a(-13930, 3019) + arrayOfString.length);
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return new Zr(arrayOfString, paramArrayOfZk, null);
          } 
          return Zk;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zk;
  }
  
  public Zr Zn(String paramString) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b = (this.ZE == null) ? 0 : this.ZE.length;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String[] arrayOfString = !b ? new String[1] : Arrays.<String>copyOf(this.ZE, b + 1);
    arrayOfString[b] = paramString;
    return new Zr(this.Z_, this.Zl, arrayOfString);
  }
  
  public Zk ZZ(String paramString) {
    byte b = 0;
    int i = this.Z_.length;
    while (true) {
      try {
        if (b < i) {
          if (paramString.equals(this.Z_[b])) {
            Zk zk = this.Zl[b];
            if (zk instanceof Zu) {
              Zu zu = (Zu)zk;
              Zk zk1 = zu.ZT();
              if (zk1 != null)
                zk = zk1; 
            } 
            return zk;
          } 
          b++;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return null;
    } 
  }
  
  private boolean ZU() {
    for (Zk zk : this.Zl) {
      try {
        if (zk instanceof Zt)
          return true; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public boolean ZS() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.Zl.length == 0);
  }
  
  public int Zf() {
    return this.Zl.length;
  }
  
  public Zk ZR(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zl.length) {
            Zk zk = this.Zl[paramInt];
            if (zk == null)
              zk = Zi.Zs(); 
            return zk;
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
  
  public Zk Zc(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          return (paramInt < this.Zl.length) ? this.Zl[paramInt] : null;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public List<Zk> Zz() {
    try {
      if (this.Zl.length == 0)
        return Collections.emptyList(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    List<Zk> list = Arrays.asList(this.Zl);
    if (list.contains(null)) {
      list = new ArrayList<>(list);
      byte b = 0;
      while (true) {
        try {
          if (b < list.size()) {
            try {
              if (list.get(b) == null)
                list.set(b, Zi.Zs()); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            b++;
            continue;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        break;
      } 
    } 
    return list;
  }
  
  public boolean ZW(String paramString) {
    if (this.ZE != null) {
      int i = this.ZE.length;
      while (--i >= 0) {
        if (paramString.equals(this.ZE[i]))
          return true; 
      } 
    } 
    return false;
  }
  
  public Object Zv(Class<?> paramClass) {
    try {
      if (ZU())
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Z_(paramClass, this.Zl, this.ZW);
  }
  
  public String toString() {
    // Byte code:
    //   0: invokestatic Zs : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zl : [Lcom/fasterxml/Zor/Zk;
    //   8: arraylength
    //   9: ifne -> 26
    //   12: sipush #-13929
    //   15: sipush #-10024
    //   18: invokestatic a : (II)Ljava/lang/String;
    //   21: areturn
    //   22: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   25: athrow
    //   26: new java/lang/StringBuilder
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: astore_2
    //   34: aload_2
    //   35: bipush #60
    //   37: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   40: pop
    //   41: iconst_0
    //   42: istore_3
    //   43: aload_0
    //   44: getfield Zl : [Lcom/fasterxml/Zor/Zk;
    //   47: arraylength
    //   48: istore #4
    //   50: iload_3
    //   51: iload #4
    //   53: if_icmpge -> 129
    //   56: iload_3
    //   57: ifle -> 74
    //   60: aload_2
    //   61: bipush #44
    //   63: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   66: pop
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   73: athrow
    //   74: aload_0
    //   75: getfield Zl : [Lcom/fasterxml/Zor/Zk;
    //   78: iload_3
    //   79: aaload
    //   80: astore #5
    //   82: aload #5
    //   84: ifnonnull -> 105
    //   87: aload_2
    //   88: ldc '?'
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: aload_1
    //   95: ifnull -> 122
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   104: athrow
    //   105: aload_2
    //   106: aload #5
    //   108: invokevirtual Ze : ()Ljava/lang/String;
    //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: pop
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   121: athrow
    //   122: iinc #3, 1
    //   125: aload_1
    //   126: ifnull -> 50
    //   129: aload_2
    //   130: bipush #62
    //   132: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: aload_2
    //   137: invokevirtual toString : ()Ljava/lang/String;
    //   140: areturn
    // Exception table:
    //   from	to	target	type
    //   4	22	22	java/lang/IllegalArgumentException
    //   56	67	70	java/lang/IllegalArgumentException
    //   82	98	101	java/lang/IllegalArgumentException
    //   87	115	118	java/lang/IllegalArgumentException
  }
  
  public int hashCode() {
    return this.ZW;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject == this)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!Zx.Zi(paramObject, getClass()))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zr zr = (Zr)paramObject;
    try {
      if (this.ZW == zr.ZW)
        try {
          if (Arrays.equals((Object[])this.Zl, (Object[])zr.Zl));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  protected Zk[] Zt() {
    return this.Zl;
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '/~ùõ&ü).Ü¼Ê\û³§-r/ðËS°¿ä|ëYn·ÈW\\n¥aÉ&ù²ãSZvq\\b&-¹Ë_WærqvÓeUä¬ÞØÎÐÊ¹º¼syò*ÿÎªYÝÀÆmC%áÈ2Qg¡×¾Ú EWôKÂÀÏ$´ÓlÂ¡¢²´÷)±ºÅ9¢EYÆ¤9¨ã%¼+!k{çO(² Öû>Þ>ëÐªîù¢:§Ï!k7ë'b«PO»Ï¡Eé¤`:®(>xAº`z<(ÐïIÜx\\f @QÜo-}:\)4 #\\n¬ ©Ð2ø'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #39
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
    //   68: ldc 'ÿiÜl\\nfKh'Dp®«gÞ%aÌÕF¢µ4'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #19
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #53
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
    //   129: putstatic com/fasterxml/Zh/Zr.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zh/Zr.b : [Ljava/lang/String;
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
    //   212: bipush #85
    //   214: goto -> 244
    //   217: bipush #51
    //   219: goto -> 244
    //   222: bipush #56
    //   224: goto -> 244
    //   227: bipush #114
    //   229: goto -> 244
    //   232: bipush #89
    //   234: goto -> 244
    //   237: bipush #113
    //   239: goto -> 244
    //   242: bipush #105
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
    //   300: iconst_0
    //   301: anewarray java/lang/String
    //   304: putstatic com/fasterxml/Zh/Zr.ZV : [Ljava/lang/String;
    //   307: iconst_0
    //   308: anewarray com/fasterxml/Zor/Zk
    //   311: putstatic com/fasterxml/Zh/Zr.Zv : [Lcom/fasterxml/Zor/Zk;
    //   314: new com/fasterxml/Zh/Zr
    //   317: dup
    //   318: getstatic com/fasterxml/Zh/Zr.ZV : [Ljava/lang/String;
    //   321: getstatic com/fasterxml/Zh/Zr.Zv : [Lcom/fasterxml/Zor/Zk;
    //   324: aconst_null
    //   325: invokespecial <init> : ([Ljava/lang/String;[Lcom/fasterxml/Zor/Zk;[Ljava/lang/String;)V
    //   328: putstatic com/fasterxml/Zh/Zr.Zk : Lcom/fasterxml/Zh/Zr;
    //   331: return
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC99C) & 0xFFFF;
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
      byte b1 = 113;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zh\Zr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
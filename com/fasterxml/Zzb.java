package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zn.Zj;
import com.fasterxml.Zn.Zm;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy2;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zt.Z_;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.Set;

@Zl
public class Zzb extends Zz0<Object> implements Zi, Z_ {
  protected final Ziz Z_;
  
  protected final Za ZA;
  
  protected final Zyd<Object> Zb;
  
  protected final Zo ZJ;
  
  protected final Zk Zv;
  
  protected final boolean Zl;
  
  protected final Set<String> Zt;
  
  protected transient Zj Za;
  
  private static final String[] d;
  
  private static final String[] e;
  
  public Zzb(Ziz paramZiz, Za paramZa, Zyd<?> paramZyd, Set<String> paramSet) {
    super(paramZiz.Zf());
    this.Z_ = paramZiz;
    this.Zv = paramZiz.Zf();
    this.ZA = paramZa;
    this.Zb = (Zyd)paramZyd;
    this.ZJ = null;
    this.Zl = true;
    this.Zt = paramSet;
    this.Za = Zj.ZQ();
  }
  
  public Zzb(Zzb paramZzb, Zo paramZo, Za paramZa, Zyd<?> paramZyd, boolean paramBoolean) {
    super(Za(paramZzb.Zz()));
    this.Z_ = paramZzb.Z_;
    this.Zv = paramZzb.Zv;
    this.ZA = paramZa;
    this.Zb = (Zyd)paramZyd;
    this.ZJ = paramZo;
    this.Zl = paramBoolean;
    this.Zt = paramZzb.Zt;
    this.Za = Zj.ZQ();
  }
  
  public static Zzb Zi(Zy7 paramZy7, Ziz paramZiz, Za paramZa, Zyd<?> paramZyd) {
    Zve zve = paramZy7.ZK().ZH((Zf)paramZy7, (Ziv)paramZiz);
    Set<String> set = zve.ZG();
    paramZyd = Za(paramZyd, set);
    return new Zzb(paramZiz, paramZa, paramZyd, set);
  }
  
  private static final Class<Object> Za(Class<?> paramClass) {
    try {
    
    } catch (Zy2 zy2) {
      throw a(null);
    } 
    return (paramClass == null) ? Object.class : (Class)paramClass;
  }
  
  protected Zzb Zj(Zo paramZo, Za paramZa, Zyd<?> paramZyd, boolean paramBoolean) {
    try {
      if (this.ZJ == paramZo)
        try {
          if (this.ZA == paramZa)
            try {
              if (this.Zb == paramZyd)
                try {
                  if (paramBoolean == this.Zl)
                    return this; 
                } catch (Zy2 zy2) {
                  throw a(null);
                }  
            } catch (Zy2 zy2) {
              throw a(null);
            }  
        } catch (Zy2 zy2) {
          throw a(null);
        }  
    } catch (Zy2 zy2) {
      throw a(null);
    } 
    return new Zzb(this, paramZo, paramZa, paramZyd, paramBoolean);
  }
  
  public boolean Zt(Zyi paramZyi, Object paramObject) {
    Object object = this.Z_.ZA(paramObject);
    try {
      if (object == null)
        return true; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    Zyd<Object> zyd = this.Zb;
    if (zyd == null)
      try {
        zyd = ZU(paramZyi, object.getClass());
      } catch (Zy_ zy_) {
        throw new Zy2(zy_);
      }  
    return zyd.Zt(paramZyi, object);
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Za za = this.ZA;
    if (za != null)
      za = za.ZS(paramZo); 
    Zyd<Object> zyd = this.Zb;
    try {
      if (zyd == null) {
        try {
          if (paramZyi.Zm(Zy9.USE_STATIC_TYPING) || this.Zv.ZE()) {
            zyd = paramZyi.ZW(this.Zv, paramZo);
            zyd = Za(zyd, this.Zt);
            boolean bool = ZC(this.Zv.Zf(), zyd);
            return Zj(paramZo, za, zyd, bool);
          } 
        } catch (Zy_ zy_) {
          throw a(null);
        } 
        try {
          if (paramZo != this.ZJ)
            return Zj(paramZo, za, zyd, this.Zl); 
        } catch (Zy_ zy_) {
          throw a(null);
        } 
      } else {
        zyd = paramZyi.Zp(zyd, paramZo);
        return Zj(paramZo, za, zyd, this.Zl);
      } 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return this;
  }
  
  public void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield Z_ : Lcom/fasterxml/Zoz/Ziz;
    //   9: aload_1
    //   10: invokevirtual ZA : (Ljava/lang/Object;)Ljava/lang/Object;
    //   13: astore #5
    //   15: goto -> 63
    //   18: astore #6
    //   20: aconst_null
    //   21: astore #5
    //   23: aload_0
    //   24: aload_3
    //   25: aload #6
    //   27: aload_1
    //   28: new java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: aload_0
    //   36: getfield Z_ : Lcom/fasterxml/Zoz/Ziz;
    //   39: invokevirtual ZW : ()Ljava/lang/String;
    //   42: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: sipush #7693
    //   48: sipush #12412
    //   51: invokestatic b : (II)Ljava/lang/String;
    //   54: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: invokevirtual toString : ()Ljava/lang/String;
    //   60: invokevirtual ZO : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;)V
    //   63: aload #5
    //   65: ifnonnull -> 85
    //   68: aload_3
    //   69: aload_2
    //   70: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   73: aload #4
    //   75: ifnull -> 156
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: aload_0
    //   86: getfield Zb : Lcom/fasterxml/Zor/Zyd;
    //   89: astore #6
    //   91: aload #6
    //   93: ifnonnull -> 108
    //   96: aload_0
    //   97: aload_3
    //   98: aload #5
    //   100: invokevirtual getClass : ()Ljava/lang/Class;
    //   103: invokevirtual ZU : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zyd;
    //   106: astore #6
    //   108: aload_0
    //   109: getfield ZA : Lcom/fasterxml/Zp/Za;
    //   112: ifnull -> 140
    //   115: aload #6
    //   117: aload #5
    //   119: aload_2
    //   120: aload_3
    //   121: aload_0
    //   122: getfield ZA : Lcom/fasterxml/Zp/Za;
    //   125: invokevirtual Zo : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zp/Za;)V
    //   128: aload #4
    //   130: ifnull -> 156
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: aload #6
    //   142: aload #5
    //   144: aload_2
    //   145: aload_3
    //   146: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   155: athrow
    //   156: return
    // Exception table:
    //   from	to	target	type
    //   5	15	18	java/lang/Exception
    //   63	78	81	java/lang/Exception
    //   108	133	136	java/lang/Exception
    //   115	149	152	java/lang/Exception
  }
  
  public void Zo(Object paramObject, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield Z_ : Lcom/fasterxml/Zoz/Ziz;
    //   9: aload_1
    //   10: invokevirtual ZA : (Ljava/lang/Object;)Ljava/lang/Object;
    //   13: astore #6
    //   15: goto -> 63
    //   18: astore #7
    //   20: aconst_null
    //   21: astore #6
    //   23: aload_0
    //   24: aload_3
    //   25: aload #7
    //   27: aload_1
    //   28: new java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: aload_0
    //   36: getfield Z_ : Lcom/fasterxml/Zoz/Ziz;
    //   39: invokevirtual ZW : ()Ljava/lang/String;
    //   42: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: sipush #7694
    //   48: sipush #-20724
    //   51: invokestatic b : (II)Ljava/lang/String;
    //   54: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: invokevirtual toString : ()Ljava/lang/String;
    //   60: invokevirtual ZO : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;)V
    //   63: aload #6
    //   65: ifnonnull -> 78
    //   68: aload_3
    //   69: aload_2
    //   70: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   73: return
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: aload_0
    //   79: getfield Zb : Lcom/fasterxml/Zor/Zyd;
    //   82: astore #7
    //   84: aload #7
    //   86: ifnonnull -> 106
    //   89: aload_0
    //   90: aload_3
    //   91: aload #6
    //   93: invokevirtual getClass : ()Ljava/lang/Class;
    //   96: invokevirtual ZU : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zyd;
    //   99: astore #7
    //   101: aload #5
    //   103: ifnull -> 156
    //   106: aload_0
    //   107: getfield Zl : Z
    //   110: ifeq -> 156
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: aload #4
    //   122: aload_2
    //   123: aload #4
    //   125: aload_1
    //   126: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   129: invokevirtual Zm : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zl;)Lcom/fasterxml/Zo2/Zn;
    //   132: invokevirtual ZA : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zo2/Zn;)Lcom/fasterxml/Zo2/Zn;
    //   135: astore #8
    //   137: aload #7
    //   139: aload #6
    //   141: aload_2
    //   142: aload_3
    //   143: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   146: aload #4
    //   148: aload_2
    //   149: aload #8
    //   151: invokevirtual ZP : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zo2/Zn;)Lcom/fasterxml/Zo2/Zn;
    //   154: pop
    //   155: return
    //   156: new com/fasterxml/Zqf
    //   159: dup
    //   160: aload #4
    //   162: aload_1
    //   163: invokespecial <init> : (Lcom/fasterxml/Zp/Za;Ljava/lang/Object;)V
    //   166: astore #8
    //   168: aload #7
    //   170: aload #6
    //   172: aload_2
    //   173: aload_3
    //   174: aload #8
    //   176: invokevirtual Zo : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zp/Za;)V
    //   179: return
    // Exception table:
    //   from	to	target	type
    //   5	15	18	java/lang/Exception
    //   63	74	74	java/lang/Exception
    //   101	113	116	java/lang/Exception
  }
  
  protected boolean ZC(Class<?> paramClass, Zyd<?> paramZyd) {
    try {
      if (paramClass.isPrimitive()) {
        try {
          if (paramClass != int.class)
            try {
              if (paramClass != boolean.class)
                try {
                  if (paramClass != double.class)
                    return false; 
                } catch (Zy2 zy2) {
                  throw a(null);
                }  
            } catch (Zy2 zy2) {
              throw a(null);
            }  
        } catch (Zy2 zy2) {
          throw a(null);
        } 
      } else {
        try {
          if (paramClass != String.class)
            try {
              if (paramClass != Integer.class)
                try {
                  if (paramClass != Boolean.class)
                    try {
                      if (paramClass != Double.class)
                        return false; 
                    } catch (Zy2 zy2) {
                      throw a(null);
                    }  
                } catch (Zy2 zy2) {
                  throw a(null);
                }  
            } catch (Zy2 zy2) {
              throw a(null);
            }  
        } catch (Zy2 zy2) {
          throw a(null);
        } 
      } 
    } catch (Zy2 zy2) {
      throw a(null);
    } 
    return Zv(paramZyd);
  }
  
  protected Zyd<Object> ZU(Zyi paramZyi, Class<?> paramClass) throws Zy_ {
    Zyd<?> zyd = this.Za.ZO(paramClass);
    String str = Zz0.ZG();
    try {
      if (zyd == null) {
        if (this.Zv.Zk()) {
          Zk zk = paramZyi.ZX(this.Zv, paramClass);
          zyd = paramZyi.ZW(zk, this.ZJ);
          zyd = Za(zyd, this.Zt);
          Zm zm1 = this.Za.ZT(zk, zyd);
          this.Za = zm1.Za;
          if (str != null) {
            zyd = paramZyi.Zb(paramClass, this.ZJ);
            zyd = Za(zyd, this.Zt);
            Zm zm2 = this.Za.Zk(paramClass, zyd);
            this.Za = zm2.Za;
            return (Zyd)zyd;
          } 
          return (Zyd)zyd;
        } 
      } else {
        return (Zyd)zyd;
      } 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    zyd = paramZyi.Zb(paramClass, this.ZJ);
    zyd = Za(zyd, this.Zt);
    Zm zm = this.Za.Zk(paramClass, zyd);
    this.Za = zm.Za;
    return (Zyd)zyd;
  }
  
  protected static Zyd<Object> Za(Zyd<?> paramZyd, Set<String> paramSet) {
    try {
      if (paramZyd != null && !paramSet.isEmpty())
        paramZyd = paramZyd.ZS(paramSet); 
    } catch (Zy2 zy2) {
      throw a(null);
    } 
    return (Zyd)paramZyd;
  }
  
  public String toString() {
    return b(7695, -9749) + this.Z_.ZE() + "#" + this.Z_.ZW() + ")";
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 't0ÕÚÃ`Ê\\b:(wÜëàazEY/°;¢ëWeZq'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #34
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #85
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic com/fasterxml/Zzb.d : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zzb.e : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #79
    //   154: goto -> 184
    //   157: bipush #17
    //   159: goto -> 184
    //   162: bipush #42
    //   164: goto -> 184
    //   167: bipush #58
    //   169: goto -> 184
    //   172: bipush #104
    //   174: goto -> 184
    //   177: bipush #83
    //   179: goto -> 184
    //   182: bipush #36
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1E0F) & 0xFFFF;
    if (e[i] == null) {
      char[] arrayOfChar = d[i].toCharArray();
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
      byte b1 = 123;
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
      e[i] = (new String(arrayOfChar)).intern();
    } 
    return e[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Za;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zn.Zj;
import com.fasterxml.Zn.Zm;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.Objects;

@Zl
public class Zzo extends Zzq<Object[]> implements Zi {
  protected final boolean ZD;
  
  protected final Zk ZF;
  
  protected final Za Zo;
  
  protected Zyd<Object> ZZ;
  
  protected Zj Zb;
  
  public Zzo(Zk paramZk, boolean paramBoolean, Za paramZa, Zyd<Object> paramZyd) {
    super(Object[].class);
    this.ZF = paramZk;
    this.ZD = paramBoolean;
    this.Zo = paramZa;
    this.Zb = Zj.ZQ();
    this.ZZ = paramZyd;
  }
  
  public Zzo(Zzo paramZzo, Zo paramZo, Za paramZa, Zyd<?> paramZyd, Boolean paramBoolean) {
    super(paramZzo, paramZo, paramBoolean);
    this.ZF = paramZzo.ZF;
    this.Zo = paramZa;
    this.ZD = paramZzo.ZD;
    this.Zb = Zj.ZQ();
    this.ZZ = (Zyd)paramZyd;
  }
  
  public Zyd<?> ZS(Zo paramZo, Boolean paramBoolean) {
    return (Zyd<?>)new Zzo(this, paramZo, this.Zo, this.ZZ, paramBoolean);
  }
  
  public Za<?> ZS(Za paramZa) {
    return new Zzo(this.ZF, this.ZD, paramZa, this.ZZ);
  }
  
  public Zzo Zu(Zo paramZo, Za paramZa, Zyd<?> paramZyd, Boolean paramBoolean) {
    return (this.ZL == paramZo && paramZyd == this.ZZ && this.Zo == paramZa && Objects.equals(this.ZQ, paramBoolean)) ? this : new Zzo(this, paramZo, paramZa, paramZyd, paramBoolean);
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Za za = this.Zo;
    if (za != null)
      za = za.ZS(paramZo); 
    Zyd<Object> zyd = null;
    Boolean bool = null;
    if (paramZo != null) {
      Ziz ziz = paramZo.ZQ();
      Zt zt = paramZyi.Zv();
      if (ziz != null) {
        Object object = zt.ZS((Ziv)ziz);
        if (object != null)
          zyd = paramZyi.ZW((Ziv)ziz, object); 
      } 
    } 
    Zgy zgy = Z_(paramZyi, paramZo, Zz());
    if (zgy != null)
      bool = zgy.Zq(Zye.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED); 
    if (zyd == null)
      zyd = this.ZZ; 
    zyd = Za(paramZyi, paramZo, zyd);
    try {
      if (zyd == null)
        try {
          if (this.ZF != null)
            try {
              if (this.ZD && !this.ZF.Zr())
                zyd = paramZyi.Zo(this.ZF, paramZo); 
            } catch (Zy_ zy_) {
              throw a(null);
            }  
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return (Zyd<?>)Zu(paramZo, za, zyd, bool);
  }
  
  public Zk Zq() {
    return this.ZF;
  }
  
  public boolean Zk(Zyi paramZyi, Object[] paramArrayOfObject) {
    return (paramArrayOfObject.length == 0);
  }
  
  public boolean ZZ(Object[] paramArrayOfObject) {
    return (paramArrayOfObject.length == 1);
  }
  
  public final void Zt(Object[] paramArrayOfObject, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: istore #4
    //   4: iload #4
    //   6: iconst_1
    //   7: if_icmpne -> 70
    //   10: aload_0
    //   11: getfield ZQ : Ljava/lang/Boolean;
    //   14: ifnonnull -> 41
    //   17: goto -> 24
    //   20: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   23: athrow
    //   24: aload_3
    //   25: getstatic com/fasterxml/Zor/Zy0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED : Lcom/fasterxml/Zor/Zy0;
    //   28: invokevirtual ZW : (Lcom/fasterxml/Zor/Zy0;)Z
    //   31: ifne -> 58
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   40: athrow
    //   41: aload_0
    //   42: getfield ZQ : Ljava/lang/Boolean;
    //   45: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   48: if_acmpne -> 70
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: aload_0
    //   59: aload_1
    //   60: aload_2
    //   61: aload_3
    //   62: invokevirtual Zo : ([Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   65: return
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: aload_2
    //   71: aload_1
    //   72: iload #4
    //   74: invokevirtual Zf : (Ljava/lang/Object;I)V
    //   77: aload_0
    //   78: aload_1
    //   79: aload_2
    //   80: aload_3
    //   81: invokevirtual Zo : ([Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   84: aload_2
    //   85: invokevirtual ZI : ()V
    //   88: return
    // Exception table:
    //   from	to	target	type
    //   4	17	20	java/io/IOException
    //   10	34	37	java/io/IOException
    //   24	51	54	java/io/IOException
    //   41	66	66	java/io/IOException
  }
  
  public void Zo(Object[] paramArrayOfObject, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: aload_1
    //   4: arraylength
    //   5: istore #5
    //   7: astore #4
    //   9: iload #5
    //   11: ifne -> 19
    //   14: return
    //   15: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   18: athrow
    //   19: aload_0
    //   20: getfield ZZ : Lcom/fasterxml/Zor/Zyd;
    //   23: ifnull -> 42
    //   26: aload_0
    //   27: aload_1
    //   28: aload_2
    //   29: aload_3
    //   30: aload_0
    //   31: getfield ZZ : Lcom/fasterxml/Zor/Zyd;
    //   34: invokevirtual ZN : ([Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zor/Zyd;)V
    //   37: return
    //   38: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: aload_0
    //   43: getfield Zo : Lcom/fasterxml/Zp/Za;
    //   46: ifnull -> 61
    //   49: aload_0
    //   50: aload_1
    //   51: aload_2
    //   52: aload_3
    //   53: invokevirtual Zk : ([Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   56: return
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: iconst_0
    //   62: istore #6
    //   64: aconst_null
    //   65: astore #7
    //   67: aload_0
    //   68: getfield Zb : Lcom/fasterxml/Zn/Zj;
    //   71: astore #8
    //   73: iload #6
    //   75: iload #5
    //   77: if_icmpge -> 198
    //   80: aload_1
    //   81: iload #6
    //   83: aaload
    //   84: astore #7
    //   86: aload #7
    //   88: ifnonnull -> 108
    //   91: aload_3
    //   92: aload_2
    //   93: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   96: aload #4
    //   98: ifnull -> 190
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload #7
    //   110: invokevirtual getClass : ()Ljava/lang/Class;
    //   113: astore #9
    //   115: aload #8
    //   117: aload #9
    //   119: invokevirtual ZO : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zyd;
    //   122: astore #10
    //   124: aload #10
    //   126: ifnonnull -> 181
    //   129: aload_0
    //   130: getfield ZF : Lcom/fasterxml/Zor/Zk;
    //   133: invokevirtual Zk : ()Z
    //   136: ifeq -> 170
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: aload_0
    //   147: aload #8
    //   149: aload_3
    //   150: aload_0
    //   151: getfield ZF : Lcom/fasterxml/Zor/Zk;
    //   154: aload #9
    //   156: invokevirtual ZX : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   159: aload_3
    //   160: invokevirtual ZA : (Lcom/fasterxml/Zn/Zj;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyi;)Lcom/fasterxml/Zor/Zyd;
    //   163: astore #10
    //   165: aload #4
    //   167: ifnull -> 181
    //   170: aload_0
    //   171: aload #8
    //   173: aload #9
    //   175: aload_3
    //   176: invokevirtual ZV : (Lcom/fasterxml/Zn/Zj;Ljava/lang/Class;Lcom/fasterxml/Zor/Zyi;)Lcom/fasterxml/Zor/Zyd;
    //   179: astore #10
    //   181: aload #10
    //   183: aload #7
    //   185: aload_2
    //   186: aload_3
    //   187: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   190: iinc #6, 1
    //   193: aload #4
    //   195: ifnull -> 73
    //   198: goto -> 214
    //   201: astore #8
    //   203: aload_0
    //   204: aload_3
    //   205: aload #8
    //   207: aload #7
    //   209: iload #6
    //   211: invokevirtual ZQ : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Throwable;Ljava/lang/Object;I)V
    //   214: return
    // Exception table:
    //   from	to	target	type
    //   9	15	15	java/lang/Exception
    //   19	38	38	java/lang/Exception
    //   42	57	57	java/lang/Exception
    //   67	198	201	java/lang/Exception
    //   86	101	104	java/lang/Exception
    //   124	139	142	java/lang/Exception
  }
  
  public void ZN(Object[] paramArrayOfObject, Zf paramZf, Zyi paramZyi, Zyd<Object> paramZyd) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: istore #6
    //   4: invokestatic ZG : ()Ljava/lang/String;
    //   7: aload_0
    //   8: getfield Zo : Lcom/fasterxml/Zp/Za;
    //   11: astore #7
    //   13: astore #5
    //   15: iconst_0
    //   16: istore #8
    //   18: aconst_null
    //   19: astore #9
    //   21: iload #8
    //   23: iload #6
    //   25: if_icmpge -> 115
    //   28: aload_1
    //   29: iload #8
    //   31: aaload
    //   32: astore #9
    //   34: aload #9
    //   36: ifnonnull -> 56
    //   39: aload_3
    //   40: aload_2
    //   41: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   44: aload #5
    //   46: ifnull -> 107
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: aload #7
    //   58: ifnonnull -> 89
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: aload #4
    //   70: aload #9
    //   72: aload_2
    //   73: aload_3
    //   74: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   77: aload #5
    //   79: ifnull -> 107
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: aload #4
    //   91: aload #9
    //   93: aload_2
    //   94: aload_3
    //   95: aload #7
    //   97: invokevirtual Zo : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zp/Za;)V
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: iinc #8, 1
    //   110: aload #5
    //   112: ifnull -> 21
    //   115: goto -> 131
    //   118: astore #10
    //   120: aload_0
    //   121: aload_3
    //   122: aload #10
    //   124: aload #9
    //   126: iload #8
    //   128: invokevirtual ZQ : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Throwable;Ljava/lang/Object;I)V
    //   131: return
    // Exception table:
    //   from	to	target	type
    //   21	115	118	java/lang/Exception
    //   34	49	52	java/lang/Exception
    //   39	61	64	java/lang/Exception
    //   56	82	85	java/lang/Exception
    //   68	100	103	java/lang/Exception
  }
  
  public void Zk(Object[] paramArrayOfObject, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: istore #5
    //   4: invokestatic ZG : ()Ljava/lang/String;
    //   7: aload_0
    //   8: getfield Zo : Lcom/fasterxml/Zp/Za;
    //   11: astore #6
    //   13: astore #4
    //   15: iconst_0
    //   16: istore #7
    //   18: aconst_null
    //   19: astore #8
    //   21: aload_0
    //   22: getfield Zb : Lcom/fasterxml/Zn/Zj;
    //   25: astore #9
    //   27: iload #7
    //   29: iload #5
    //   31: if_icmpge -> 113
    //   34: aload_1
    //   35: iload #7
    //   37: aaload
    //   38: astore #8
    //   40: aload #8
    //   42: ifnonnull -> 62
    //   45: aload_3
    //   46: aload_2
    //   47: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   50: aload #4
    //   52: ifnull -> 105
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload #8
    //   64: invokevirtual getClass : ()Ljava/lang/Class;
    //   67: astore #10
    //   69: aload #9
    //   71: aload #10
    //   73: invokevirtual ZO : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zyd;
    //   76: astore #11
    //   78: aload #11
    //   80: ifnonnull -> 94
    //   83: aload_0
    //   84: aload #9
    //   86: aload #10
    //   88: aload_3
    //   89: invokevirtual ZV : (Lcom/fasterxml/Zn/Zj;Ljava/lang/Class;Lcom/fasterxml/Zor/Zyi;)Lcom/fasterxml/Zor/Zyd;
    //   92: astore #11
    //   94: aload #11
    //   96: aload #8
    //   98: aload_2
    //   99: aload_3
    //   100: aload #6
    //   102: invokevirtual Zo : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zp/Za;)V
    //   105: iinc #7, 1
    //   108: aload #4
    //   110: ifnull -> 27
    //   113: goto -> 129
    //   116: astore #9
    //   118: aload_0
    //   119: aload_3
    //   120: aload #9
    //   122: aload #8
    //   124: iload #7
    //   126: invokevirtual ZQ : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Throwable;Ljava/lang/Object;I)V
    //   129: return
    // Exception table:
    //   from	to	target	type
    //   21	113	116	java/lang/Exception
    //   40	55	58	java/lang/Exception
  }
  
  protected final Zyd<Object> ZV(Zj paramZj, Class<?> paramClass, Zyi paramZyi) throws Zy_ {
    Zm zm = paramZj.Zd(paramClass, paramZyi, this.ZL);
    try {
      if (paramZj != zm.Za)
        this.Zb = zm.Za; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return zm.Zm;
  }
  
  protected final Zyd<Object> ZA(Zj paramZj, Zk paramZk, Zyi paramZyi) throws Zy_ {
    Zm zm = paramZj.ZN(paramZk, paramZyi, this.ZL);
    try {
      if (paramZj != zm.Za)
        this.Zb = zm.Za; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return zm.Zm;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
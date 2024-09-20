package com.fasterxml.Zn;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zj;
import com.fasterxml.Zgk;
import com.fasterxml.Zk.Zt;
import com.fasterxml.Zm.Zee;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import java.io.Serializable;

public class Zg extends Zt implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Zee ZE;
  
  public Zg(Zt paramZt, Zee paramZee) {
    super(paramZt);
    this.ZE = paramZee;
  }
  
  protected Zg(Zg paramZg, Zee paramZee, Zgk paramZgk) {
    super(paramZg, paramZgk);
    this.ZE = paramZee;
  }
  
  public Zg ZC(Zee paramZee) {
    String str1 = this.Z_.ZV();
    String str2 = paramZee.Zt(str1);
    paramZee = Zee.ZN(paramZee, this.ZE);
    return Zs(paramZee, new Zgk(str2));
  }
  
  protected Zg Zs(Zee paramZee, Zgk paramZgk) {
    return new Zg(this, paramZee, paramZgk);
  }
  
  public void Zy(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    Object object = Zo(paramObject);
    String str = Zj.Zl();
    try {
      if (object == null)
        return; 
    } catch (Exception exception) {
      throw b(null);
    } 
    Zyd<Object> zyd = this.ZI;
    if (zyd == null) {
      Class<?> clazz = object.getClass();
      Zj zj = this.ZQ;
      zyd = zj.ZO(clazz);
      if (zyd == null)
        zyd = ZQ(zj, clazz, paramZyi); 
    } 
    try {
      if (this.Zp != null)
        try {
          if (Zo == this.Zp) {
            try {
              if (zyd.Zt(paramZyi, object))
                return; 
            } catch (Exception exception) {
              throw b(null);
            } 
          } else {
            try {
              if (this.Zp.equals(object))
                return; 
            } catch (Exception exception) {
              throw b(null);
            } 
          } 
        } catch (Exception exception) {
          throw b(null);
        }  
    } catch (Exception exception) {
      throw b(null);
    } 
    try {
      if (object == paramObject)
        try {
          if (Zy(paramObject, paramZf, paramZyi, zyd))
            return; 
        } catch (Exception exception) {
          throw b(null);
        }  
    } catch (Exception exception) {
      throw b(null);
    } 
    try {
      if (!zyd.ZC())
        paramZf.Zm((Zj)this.Z_); 
    } catch (Exception exception) {
      throw b(null);
    } 
    try {
      if (this.ZB == null) {
        try {
          zyd.serialize(object, paramZf, paramZyi);
          if (str != null) {
            zyd.Zo(object, paramZf, paramZyi, this.ZB);
            return;
          } 
        } catch (Exception exception) {
          throw b(null);
        } 
        return;
      } 
    } catch (Exception exception) {
      throw b(null);
    } 
    zyd.Zo(object, paramZf, paramZyi, this.ZB);
  }
  
  public void Zh(Zyd<Object> paramZyd) {
    if (paramZyd != null) {
      Zee zee = this.ZE;
      if (paramZyd.ZC() && paramZyd instanceof Z_m)
        zee = Zee.ZN(zee, ((Z_m)paramZyd).ZE); 
      paramZyd = paramZyd.Zq(zee);
    } 
    super.Zh(paramZyd);
  }
  
  protected Zyd<Object> ZQ(Zj paramZj, Class<?> paramClass, Zyi paramZyi) throws Zy_ {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield ZW : Lcom/fasterxml/Zor/Zk;
    //   9: ifnull -> 37
    //   12: aload_3
    //   13: aload_0
    //   14: getfield ZW : Lcom/fasterxml/Zor/Zk;
    //   17: aload_2
    //   18: invokevirtual ZX : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   21: astore #6
    //   23: aload_3
    //   24: aload #6
    //   26: aload_0
    //   27: invokevirtual ZX : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   30: astore #5
    //   32: aload #4
    //   34: ifnull -> 45
    //   37: aload_3
    //   38: aload_2
    //   39: aload_0
    //   40: invokevirtual Za : (Ljava/lang/Class;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   43: astore #5
    //   45: aload_0
    //   46: getfield ZE : Lcom/fasterxml/Zm/Zee;
    //   49: astore #6
    //   51: aload #5
    //   53: invokevirtual ZC : ()Z
    //   56: ifeq -> 89
    //   59: aload #5
    //   61: instanceof com/fasterxml/Zn/Z_m
    //   64: ifeq -> 89
    //   67: goto -> 74
    //   70: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: aload #6
    //   76: aload #5
    //   78: checkcast com/fasterxml/Zn/Z_m
    //   81: getfield ZE : Lcom/fasterxml/Zm/Zee;
    //   84: invokestatic ZN : (Lcom/fasterxml/Zm/Zee;Lcom/fasterxml/Zm/Zee;)Lcom/fasterxml/Zm/Zee;
    //   87: astore #6
    //   89: aload #5
    //   91: aload #6
    //   93: invokevirtual Zq : (Lcom/fasterxml/Zm/Zee;)Lcom/fasterxml/Zor/Zyd;
    //   96: astore #5
    //   98: aload_0
    //   99: aload_0
    //   100: getfield ZQ : Lcom/fasterxml/Zn/Zj;
    //   103: aload_2
    //   104: aload #5
    //   106: invokevirtual Zr : (Ljava/lang/Class;Lcom/fasterxml/Zor/Zyd;)Lcom/fasterxml/Zn/Zj;
    //   109: putfield ZQ : Lcom/fasterxml/Zn/Zj;
    //   112: aload #5
    //   114: areturn
    // Exception table:
    //   from	to	target	type
    //   51	67	70	com/fasterxml/Zor/Zy_
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
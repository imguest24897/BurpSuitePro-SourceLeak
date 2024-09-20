package com.fasterxml.Zn;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Zt;
import com.fasterxml.Zm.Zee;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import java.io.Serializable;

final class Zk extends Zt implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Zt ZV;
  
  protected final Class<?> Zu;
  
  protected Zk(Zt paramZt, Class<?> paramClass) {
    super(paramZt);
    this.ZV = paramZt;
    this.Zu = paramClass;
  }
  
  public Zk Zr(Zee paramZee) {
    return new Zk(this.ZV.Zc(paramZee), this.Zu);
  }
  
  public void Zh(Zyd<Object> paramZyd) {
    this.ZV.Zh(paramZyd);
  }
  
  public void ZA(Zyd<Object> paramZyd) {
    this.ZV.ZA(paramZyd);
  }
  
  public void Zy(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: aload_3
    //   4: invokevirtual Zx : ()Ljava/lang/Class;
    //   7: astore #5
    //   9: astore #4
    //   11: aload #5
    //   13: ifnull -> 35
    //   16: aload_0
    //   17: getfield Zu : Ljava/lang/Class;
    //   20: aload #5
    //   22: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   25: ifeq -> 57
    //   28: goto -> 35
    //   31: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: aload_0
    //   36: getfield ZV : Lcom/fasterxml/Zk/Zt;
    //   39: aload_1
    //   40: aload_2
    //   41: aload_3
    //   42: invokevirtual Zy : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   45: aload #4
    //   47: ifnull -> 74
    //   50: goto -> 57
    //   53: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_0
    //   58: getfield ZV : Lcom/fasterxml/Zk/Zt;
    //   61: aload_1
    //   62: aload_2
    //   63: aload_3
    //   64: invokevirtual ZQ : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   67: goto -> 74
    //   70: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: return
    // Exception table:
    //   from	to	target	type
    //   11	28	31	java/lang/Exception
    //   16	50	53	java/lang/Exception
    //   35	67	70	java/lang/Exception
  }
  
  public void ZD(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: aload_3
    //   4: invokevirtual Zx : ()Ljava/lang/Class;
    //   7: astore #5
    //   9: astore #4
    //   11: aload #5
    //   13: ifnull -> 35
    //   16: aload_0
    //   17: getfield Zu : Ljava/lang/Class;
    //   20: aload #5
    //   22: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   25: ifeq -> 57
    //   28: goto -> 35
    //   31: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: aload_0
    //   36: getfield ZV : Lcom/fasterxml/Zk/Zt;
    //   39: aload_1
    //   40: aload_2
    //   41: aload_3
    //   42: invokevirtual ZD : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   45: aload #4
    //   47: ifnull -> 74
    //   50: goto -> 57
    //   53: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_0
    //   58: getfield ZV : Lcom/fasterxml/Zk/Zt;
    //   61: aload_1
    //   62: aload_2
    //   63: aload_3
    //   64: invokevirtual ZM : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   67: goto -> 74
    //   70: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: return
    // Exception table:
    //   from	to	target	type
    //   11	28	31	java/lang/Exception
    //   16	50	53	java/lang/Exception
    //   35	67	70	java/lang/Exception
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
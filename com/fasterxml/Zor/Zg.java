package com.fasterxml.Zor;

import com.fasterxml.Zb.Zb;
import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zj;
import com.fasterxml.Zb.Zp;
import com.fasterxml.Zyh;
import java.io.Serializable;

public final class Zg implements Serializable {
  private static final long serialVersionUID = 1L;
  
  public static final Zg Zh = new Zg(null, null, null, null);
  
  public final Zp ZI;
  
  public final Zb Zy;
  
  public final Zyh ZM;
  
  public final Zj ZL;
  
  public Zg(Zp paramZp, Zb paramZb, Zyh paramZyh, Zj paramZj) {
    this.ZI = paramZp;
    this.Zy = paramZb;
    this.ZM = paramZyh;
    this.ZL = paramZj;
  }
  
  public Zg ZH(Zp paramZp) {
    if (paramZp == null)
      paramZp = Zn.ZW; 
    return (paramZp == this.ZI) ? this : new Zg(paramZp, this.Zy, this.ZM, this.ZL);
  }
  
  public void Zi(Zf paramZf) {
    // Byte code:
    //   0: invokestatic ZZ : ()I
    //   3: aload_0
    //   4: getfield ZI : Lcom/fasterxml/Zb/Zp;
    //   7: astore_3
    //   8: istore_2
    //   9: aload_0
    //   10: getfield ZI : Lcom/fasterxml/Zb/Zp;
    //   13: ifnull -> 59
    //   16: aload_3
    //   17: getstatic com/fasterxml/Zor/Zn.ZW : Lcom/fasterxml/Zb/Zp;
    //   20: if_acmpne -> 33
    //   23: aload_1
    //   24: aconst_null
    //   25: invokevirtual Zy : (Lcom/fasterxml/Zb/Zp;)Lcom/fasterxml/Zb/Zf;
    //   28: pop
    //   29: iload_2
    //   30: ifeq -> 59
    //   33: aload_3
    //   34: instanceof com/fasterxml/Zc/Zb
    //   37: ifeq -> 53
    //   40: aload_3
    //   41: checkcast com/fasterxml/Zc/Zb
    //   44: invokeinterface Zm : ()Ljava/lang/Object;
    //   49: checkcast com/fasterxml/Zb/Zp
    //   52: astore_3
    //   53: aload_1
    //   54: aload_3
    //   55: invokevirtual Zy : (Lcom/fasterxml/Zb/Zp;)Lcom/fasterxml/Zb/Zf;
    //   58: pop
    //   59: aload_0
    //   60: getfield ZM : Lcom/fasterxml/Zyh;
    //   63: ifnull -> 75
    //   66: aload_1
    //   67: aload_0
    //   68: getfield ZM : Lcom/fasterxml/Zyh;
    //   71: invokevirtual ZH : (Lcom/fasterxml/Zyh;)Lcom/fasterxml/Zb/Zf;
    //   74: pop
    //   75: aload_0
    //   76: getfield Zy : Lcom/fasterxml/Zb/Zb;
    //   79: ifnull -> 90
    //   82: aload_1
    //   83: aload_0
    //   84: getfield Zy : Lcom/fasterxml/Zb/Zb;
    //   87: invokevirtual Zs : (Lcom/fasterxml/Zb/Zb;)V
    //   90: aload_0
    //   91: getfield ZL : Lcom/fasterxml/Zb/Zj;
    //   94: ifnull -> 106
    //   97: aload_1
    //   98: aload_0
    //   99: getfield ZL : Lcom/fasterxml/Zb/Zj;
    //   102: invokevirtual Zf : (Lcom/fasterxml/Zb/Zj;)Lcom/fasterxml/Zb/Zf;
    //   105: pop
    //   106: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
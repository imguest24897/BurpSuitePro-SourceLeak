package burp;

import java.util.Iterator;

class Zsy3 implements Iterator<Zb3t> {
  private final Iterator<Zmv4> Zd;
  
  private Iterator<Zb3t> ZA;
  
  Zsy3(Zsdd paramZsdd, Zkr1<Zmv4> paramZkr1) {
    this.Zd = paramZkr1.iterator();
  }
  
  public boolean hasNext() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZA : Ljava/util/Iterator;
    //   4: ifnull -> 26
    //   7: aload_0
    //   8: getfield ZA : Ljava/util/Iterator;
    //   11: invokeinterface hasNext : ()Z
    //   16: ifne -> 45
    //   19: goto -> 26
    //   22: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   25: athrow
    //   26: aload_0
    //   27: getfield Zd : Ljava/util/Iterator;
    //   30: invokeinterface hasNext : ()Z
    //   35: ifeq -> 53
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   44: athrow
    //   45: iconst_1
    //   46: goto -> 54
    //   49: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   52: athrow
    //   53: iconst_0
    //   54: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	19	22	java/lang/UnsupportedOperationException
    //   7	38	41	java/lang/UnsupportedOperationException
    //   26	49	49	java/lang/UnsupportedOperationException
  }
  
  public Zb3t Zp() {
    try {
      if (this.ZA != null) {
        try {
          if (!this.ZA.hasNext()) {
            try {
              if (this.Zd.hasNext())
                this.ZA = ((Zmv4)this.Zd.next()).ZX(); 
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            } 
            return this.ZA.next();
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        return this.ZA.next();
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (this.Zd.hasNext())
        this.ZA = ((Zmv4)this.Zd.next()).ZX(); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return this.ZA.next();
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsy3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
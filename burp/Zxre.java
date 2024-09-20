package burp;

import java.util.Iterator;

class Zxre implements Iterator<Zb3t> {
  private final Iterator<Zb3t> Zg;
  
  private Zb3t ZD;
  
  private Zxre(Zb3t paramZb3t) {
    this.Zg = (new Zz61(paramZb3t)).iterator();
    this.ZD = this.Zg.hasNext() ? this.Zg.next() : null;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (this.ZD != null);
  }
  
  public Zb3t Zj() {
    // Byte code:
    //   0: invokestatic Zh : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZD : Lburp/Zb3t;
    //   8: astore_2
    //   9: aload_0
    //   10: getfield Zg : Ljava/util/Iterator;
    //   13: invokeinterface hasNext : ()Z
    //   18: ifeq -> 52
    //   21: aload_0
    //   22: getfield Zg : Ljava/util/Iterator;
    //   25: invokeinterface next : ()Ljava/lang/Object;
    //   30: checkcast burp/Zb3t
    //   33: astore_3
    //   34: aload_1
    //   35: ifnull -> 54
    //   38: iconst_4
    //   39: anewarray burp/Zbqc
    //   42: invokestatic Zr : ([Lburp/Zbqc;)V
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   51: athrow
    //   52: aconst_null
    //   53: astore_3
    //   54: aload_3
    //   55: ifnull -> 86
    //   58: aload_3
    //   59: invokestatic Zb : (Lburp/Zb3t;)Z
    //   62: ifne -> 86
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   71: athrow
    //   72: aload_3
    //   73: invokestatic ZG : (Lburp/Zb3t;)Z
    //   76: ifeq -> 9
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   85: athrow
    //   86: aload_0
    //   87: aload_3
    //   88: putfield ZD : Lburp/Zb3t;
    //   91: aload_2
    //   92: areturn
    // Exception table:
    //   from	to	target	type
    //   34	45	48	java/lang/UnsupportedOperationException
    //   54	65	68	java/lang/UnsupportedOperationException
    //   58	79	82	java/lang/UnsupportedOperationException
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxre.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
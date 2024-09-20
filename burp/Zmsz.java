package burp;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Zmsz implements Iterator<Long> {
  private int Zs;
  
  private int ZV;
  
  private int Zz;
  
  final Zxqp ZN;
  
  private Zmsz(Zxqp paramZxqp) {}
  
  public boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.Zz < this.ZN.size());
  }
  
  public Long Zr() {
    boolean bool = Zmpk.Zz();
    try {
      if (this.Zz >= this.ZN.size())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Zxsn zxsn = Zl();
    try {
      if (zxsn == null)
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Long long_;
    while ((long_ = zxsn.get(this.ZV)) == null) {
      if (this.ZV >= zxsn.size()) {
        zxsn = Zl();
        if (zxsn == null)
          throw new NoSuchElementException(); 
        continue;
      } 
      this.ZV++;
      if (!bool)
        break; 
    } 
    try {
      this.ZV++;
      this.Zz++;
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        Zmpk.ZH(!bool);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return long_;
  }
  
  private Zxsn Zl() {
    // Byte code:
    //   0: invokestatic Zz : ()Z
    //   3: aload_0
    //   4: getfield ZN : Lburp/Zxqp;
    //   7: invokevirtual ZY : ()Lburp/Zx29;
    //   10: aload_0
    //   11: getfield Zs : I
    //   14: invokevirtual ZGt : (I)Lburp/Zgpi;
    //   17: checkcast burp/Zxsn
    //   20: astore_2
    //   21: istore_1
    //   22: aload_2
    //   23: ifnull -> 55
    //   26: aload_2
    //   27: invokeinterface isEmpty : ()Z
    //   32: ifne -> 55
    //   35: aload_0
    //   36: getfield ZV : I
    //   39: aload_2
    //   40: invokeinterface size : ()I
    //   45: if_icmplt -> 122
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   54: athrow
    //   55: aload_0
    //   56: dup
    //   57: getfield Zs : I
    //   60: iconst_1
    //   61: iadd
    //   62: putfield Zs : I
    //   65: aload_0
    //   66: getfield Zs : I
    //   69: aload_0
    //   70: getfield ZN : Lburp/Zxqp;
    //   73: invokevirtual ZY : ()Lburp/Zx29;
    //   76: invokevirtual size : ()I
    //   79: if_icmplt -> 95
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   88: athrow
    //   89: aconst_null
    //   90: areturn
    //   91: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   94: athrow
    //   95: aload_0
    //   96: getfield ZN : Lburp/Zxqp;
    //   99: invokevirtual ZY : ()Lburp/Zx29;
    //   102: aload_0
    //   103: getfield Zs : I
    //   106: invokevirtual ZGt : (I)Lburp/Zgpi;
    //   109: checkcast burp/Zxsn
    //   112: astore_2
    //   113: aload_0
    //   114: iconst_0
    //   115: putfield ZV : I
    //   118: iload_1
    //   119: ifne -> 22
    //   122: aload_2
    //   123: areturn
    // Exception table:
    //   from	to	target	type
    //   26	48	51	java/util/NoSuchElementException
    //   35	82	85	java/util/NoSuchElementException
    //   55	91	91	java/util/NoSuchElementException
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmsz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
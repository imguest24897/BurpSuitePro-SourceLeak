package burp;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Zbzq implements Iterator<T> {
  private int Zr;
  
  private int Zy;
  
  private int ZH;
  
  final Zxqs ZO;
  
  private Zbzq(Zxqs paramZxqs) {}
  
  public boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.ZH < this.ZO.size());
  }
  
  public T Zz() {
    Zbqc[] arrayOfZbqc = Zl0w.ZD();
    try {
      if (this.ZH >= this.ZO.size())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Zrvk zrvk = Zy();
    try {
      if (zrvk == null)
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Zbq_ zbq_;
    while ((zbq_ = zrvk.Z_u(this.Zy)) == null) {
      if (this.Zy >= zrvk.size()) {
        zrvk = Zy();
        if (zrvk == null)
          throw new NoSuchElementException(); 
        continue;
      } 
      this.Zy++;
      if (arrayOfZbqc == null) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
    this.Zy++;
    this.ZH++;
    return (T)Zxqs.Zr(this.ZO).Zo(zbq_.ZB(), this.ZO.Zh);
  }
  
  private Zrvk Zy() {
    // Byte code:
    //   0: invokestatic ZD : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: getfield ZO : Lburp/Zxqs;
    //   7: invokevirtual ZzO : ()Lburp/Zx29;
    //   10: aload_0
    //   11: getfield Zr : I
    //   14: invokevirtual ZGt : (I)Lburp/Zgpi;
    //   17: checkcast burp/Zrvk
    //   20: astore_2
    //   21: astore_1
    //   22: aload_2
    //   23: ifnull -> 55
    //   26: aload_2
    //   27: invokeinterface isEmpty : ()Z
    //   32: ifne -> 55
    //   35: aload_0
    //   36: getfield Zy : I
    //   39: aload_2
    //   40: invokeinterface size : ()I
    //   45: if_icmplt -> 122
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   54: athrow
    //   55: aload_0
    //   56: dup
    //   57: getfield Zr : I
    //   60: iconst_1
    //   61: iadd
    //   62: putfield Zr : I
    //   65: aload_0
    //   66: getfield Zr : I
    //   69: aload_0
    //   70: getfield ZO : Lburp/Zxqs;
    //   73: invokevirtual ZzO : ()Lburp/Zx29;
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
    //   96: getfield ZO : Lburp/Zxqs;
    //   99: invokevirtual ZzO : ()Lburp/Zx29;
    //   102: aload_0
    //   103: getfield Zr : I
    //   106: invokevirtual ZGt : (I)Lburp/Zgpi;
    //   109: checkcast burp/Zrvk
    //   112: astore_2
    //   113: aload_0
    //   114: iconst_0
    //   115: putfield Zy : I
    //   118: aload_1
    //   119: ifnonnull -> 22
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbzq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
package burp;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Zs_q implements Iterator<Integer> {
  private int Ze;
  
  private int Za;
  
  private int Z_;
  
  final Zxq4 ZH;
  
  private Zs_q(Zxq4 paramZxq4) {}
  
  public boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.Z_ < this.ZH.size());
  }
  
  public Integer ZF() {
    int[] arrayOfInt = Zzzk.ZP();
    try {
      if (this.Z_ >= this.ZH.size())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Zmg zmg = ZJ();
    try {
      if (zmg == null)
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Integer integer;
    while ((integer = zmg.get(this.Za)) == null) {
      if (this.Za >= zmg.size()) {
        zmg = ZJ();
        if (zmg == null)
          throw new NoSuchElementException(); 
        continue;
      } 
      this.Za++;
      if (arrayOfInt != null)
        break; 
    } 
    try {
      this.Za++;
      this.Z_++;
      if (Zbqc.Zwu() == null)
        Zzzk.ZR(new int[3]); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return integer;
  }
  
  private Zmg ZJ() {
    // Byte code:
    //   0: invokestatic ZP : ()[I
    //   3: aload_0
    //   4: getfield ZH : Lburp/Zxq4;
    //   7: invokevirtual Zl : ()Lburp/Zx29;
    //   10: aload_0
    //   11: getfield Ze : I
    //   14: invokevirtual ZGt : (I)Lburp/Zgpi;
    //   17: checkcast burp/Zmg
    //   20: astore_2
    //   21: astore_1
    //   22: aload_2
    //   23: ifnull -> 55
    //   26: aload_2
    //   27: invokeinterface isEmpty : ()Z
    //   32: ifne -> 55
    //   35: aload_0
    //   36: getfield Za : I
    //   39: aload_2
    //   40: invokeinterface size : ()I
    //   45: if_icmplt -> 122
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   54: athrow
    //   55: aload_0
    //   56: dup
    //   57: getfield Ze : I
    //   60: iconst_1
    //   61: iadd
    //   62: putfield Ze : I
    //   65: aload_0
    //   66: getfield Ze : I
    //   69: aload_0
    //   70: getfield ZH : Lburp/Zxq4;
    //   73: invokevirtual Zl : ()Lburp/Zx29;
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
    //   96: getfield ZH : Lburp/Zxq4;
    //   99: invokevirtual Zl : ()Lburp/Zx29;
    //   102: aload_0
    //   103: getfield Ze : I
    //   106: invokevirtual ZGt : (I)Lburp/Zgpi;
    //   109: checkcast burp/Zmg
    //   112: astore_2
    //   113: aload_0
    //   114: iconst_0
    //   115: putfield Za : I
    //   118: aload_1
    //   119: ifnull -> 22
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
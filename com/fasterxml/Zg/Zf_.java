package com.fasterxml.Zg;

import java.util.Iterator;

final class Zf_ {
  private Iterator<?>[] ZI;
  
  private int ZA;
  
  private int Zx;
  
  public void ZH(Iterator<?> paramIterator) {
    // Byte code:
    //   0: invokestatic ZE : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZA : I
    //   8: aload_0
    //   9: getfield Zx : I
    //   12: if_icmpge -> 33
    //   15: aload_0
    //   16: getfield ZI : [Ljava/util/Iterator;
    //   19: aload_0
    //   20: dup
    //   21: getfield ZA : I
    //   24: dup_x1
    //   25: iconst_1
    //   26: iadd
    //   27: putfield ZA : I
    //   30: aload_1
    //   31: aastore
    //   32: return
    //   33: aload_0
    //   34: getfield ZI : [Ljava/util/Iterator;
    //   37: ifnonnull -> 61
    //   40: aload_0
    //   41: bipush #10
    //   43: putfield Zx : I
    //   46: aload_0
    //   47: aload_0
    //   48: getfield Zx : I
    //   51: anewarray java/util/Iterator
    //   54: putfield ZI : [Ljava/util/Iterator;
    //   57: aload_2
    //   58: ifnonnull -> 105
    //   61: aload_0
    //   62: dup
    //   63: getfield Zx : I
    //   66: sipush #4000
    //   69: bipush #20
    //   71: aload_0
    //   72: getfield Zx : I
    //   75: iconst_1
    //   76: ishr
    //   77: invokestatic max : (II)I
    //   80: invokestatic min : (II)I
    //   83: iadd
    //   84: putfield Zx : I
    //   87: aload_0
    //   88: aload_0
    //   89: getfield ZI : [Ljava/util/Iterator;
    //   92: aload_0
    //   93: getfield Zx : I
    //   96: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   99: checkcast [Ljava/util/Iterator;
    //   102: putfield ZI : [Ljava/util/Iterator;
    //   105: aload_0
    //   106: getfield ZI : [Ljava/util/Iterator;
    //   109: aload_0
    //   110: dup
    //   111: getfield ZA : I
    //   114: dup_x1
    //   115: iconst_1
    //   116: iadd
    //   117: putfield ZA : I
    //   120: aload_1
    //   121: aastore
    //   122: return
  }
  
  public Iterator<?> ZG() {
    return (this.ZA == 0) ? null : this.ZI[--this.ZA];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zf_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
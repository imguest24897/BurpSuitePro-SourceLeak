package com.fasterxml.Zs;

import com.fasterxml.Zg.Zv;

final class Zb {
  private Zv[] ZZ;
  
  private int Zm;
  
  private int ZV;
  
  public void Zf(Zv paramZv) {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zm : I
    //   8: aload_0
    //   9: getfield ZV : I
    //   12: if_icmpge -> 33
    //   15: aload_0
    //   16: getfield ZZ : [Lcom/fasterxml/Zg/Zv;
    //   19: aload_0
    //   20: dup
    //   21: getfield Zm : I
    //   24: dup_x1
    //   25: iconst_1
    //   26: iadd
    //   27: putfield Zm : I
    //   30: aload_1
    //   31: aastore
    //   32: return
    //   33: aload_0
    //   34: getfield ZZ : [Lcom/fasterxml/Zg/Zv;
    //   37: ifnonnull -> 61
    //   40: aload_0
    //   41: bipush #10
    //   43: putfield ZV : I
    //   46: aload_0
    //   47: aload_0
    //   48: getfield ZV : I
    //   51: anewarray com/fasterxml/Zg/Zv
    //   54: putfield ZZ : [Lcom/fasterxml/Zg/Zv;
    //   57: aload_2
    //   58: ifnull -> 105
    //   61: aload_0
    //   62: dup
    //   63: getfield ZV : I
    //   66: sipush #4000
    //   69: bipush #20
    //   71: aload_0
    //   72: getfield ZV : I
    //   75: iconst_1
    //   76: ishr
    //   77: invokestatic max : (II)I
    //   80: invokestatic min : (II)I
    //   83: iadd
    //   84: putfield ZV : I
    //   87: aload_0
    //   88: aload_0
    //   89: getfield ZZ : [Lcom/fasterxml/Zg/Zv;
    //   92: aload_0
    //   93: getfield ZV : I
    //   96: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   99: checkcast [Lcom/fasterxml/Zg/Zv;
    //   102: putfield ZZ : [Lcom/fasterxml/Zg/Zv;
    //   105: aload_0
    //   106: getfield ZZ : [Lcom/fasterxml/Zg/Zv;
    //   109: aload_0
    //   110: dup
    //   111: getfield Zm : I
    //   114: dup_x1
    //   115: iconst_1
    //   116: iadd
    //   117: putfield Zm : I
    //   120: aload_1
    //   121: aastore
    //   122: return
  }
  
  public Zv ZY() {
    return (this.Zm == 0) ? null : this.ZZ[--this.Zm];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
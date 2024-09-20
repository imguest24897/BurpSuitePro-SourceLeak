package burp;

public class Zs5h implements Zbu2 {
  private int Zz;
  
  private boolean ZL;
  
  public void ZW(byte[] paramArrayOfbyte, Zs68 paramZs68) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_2
    //   5: invokevirtual Zd : ()I
    //   8: istore #4
    //   10: iload #4
    //   12: aload_2
    //   13: getfield Zs : I
    //   16: if_icmpge -> 77
    //   19: aload_0
    //   20: getfield ZL : Z
    //   23: ifeq -> 55
    //   26: aload_1
    //   27: iload #4
    //   29: baload
    //   30: invokestatic Ze : (B)Z
    //   33: ifeq -> 70
    //   36: aload_0
    //   37: dup
    //   38: getfield Zz : I
    //   41: iconst_1
    //   42: iadd
    //   43: putfield Zz : I
    //   46: aload_0
    //   47: iconst_0
    //   48: putfield ZL : Z
    //   51: aload_3
    //   52: ifnull -> 70
    //   55: aload_1
    //   56: iload #4
    //   58: baload
    //   59: invokestatic Ze : (B)Z
    //   62: ifne -> 70
    //   65: aload_0
    //   66: iconst_1
    //   67: putfield ZL : Z
    //   70: iinc #4, 1
    //   73: aload_3
    //   74: ifnull -> 10
    //   77: return
  }
  
  private static boolean Ze(byte paramByte) {
    return (paramByte <= 32);
  }
  
  public void ZB(Zt82 paramZt82) {
    if (this.ZL)
      this.Zz++; 
    paramZt82.Ze(ZV(), this.Zz);
  }
  
  public Zlug ZV() {
    return Zlug.WORD_COUNT;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs5h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
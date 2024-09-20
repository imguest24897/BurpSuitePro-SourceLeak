package burp;

public class Zr3h implements Zbu2 {
  private int Ze;
  
  private boolean Zs = true;
  
  private boolean ZU(byte paramByte) {
    return (paramByte == 10);
  }
  
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
    //   16: if_icmpge -> 61
    //   19: aload_0
    //   20: aload_1
    //   21: iload #4
    //   23: baload
    //   24: invokevirtual ZU : (B)Z
    //   27: ifeq -> 49
    //   30: aload_0
    //   31: dup
    //   32: getfield Ze : I
    //   35: iconst_1
    //   36: iadd
    //   37: putfield Ze : I
    //   40: aload_0
    //   41: iconst_1
    //   42: putfield Zs : Z
    //   45: aload_3
    //   46: ifnull -> 54
    //   49: aload_0
    //   50: iconst_0
    //   51: putfield Zs : Z
    //   54: iinc #4, 1
    //   57: aload_3
    //   58: ifnull -> 10
    //   61: return
  }
  
  public void ZB(Zt82 paramZt82) {
    if (!this.Zs)
      this.Ze++; 
    paramZt82.Ze(ZV(), this.Ze);
  }
  
  public Zlug ZV() {
    return Zlug.LINE_COUNT;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr3h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
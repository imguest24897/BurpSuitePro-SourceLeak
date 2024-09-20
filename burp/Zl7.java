package burp;

import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zl7 extends Zl2 {
  private final Zshh Zz;
  
  private Ztr2 ZH;
  
  private List<Zlou> ZN;
  
  public Zl7(Zshh paramZshh) {
    super(paramZshh);
    this.Zz = paramZshh;
    this.ZH = paramZshh.ZN();
  }
  
  protected byte[] Zx(byte[] paramArrayOfbyte, byte paramByte, int[] paramArrayOfint) {
    byte[] arrayOfByte;
    byte b;
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    switch (paramByte) {
      case 0:
        if (arrayOfZbqc != null);
        arrayOfByte = this.ZH.Zx(paramArrayOfbyte, paramArrayOfint);
        paramArrayOfint[0] = paramArrayOfint[0] + this.Zz.Zn();
        paramArrayOfint[1] = paramArrayOfint[1] + this.Zz.Zn();
        return Zq(arrayOfByte);
      case 1:
        paramArrayOfbyte = ZL(paramArrayOfbyte);
        b = (this.Zz.Zr() == null) ? 0 : this.Zz.Zr().length();
        paramArrayOfint[0] = paramArrayOfint[0] + b;
        paramArrayOfint[1] = paramArrayOfint[1] + b;
        if (arrayOfZbqc != null)
          break; 
        arrayOfByte = this.ZH.Zx(paramArrayOfbyte, paramArrayOfint);
        paramArrayOfint[0] = paramArrayOfint[0] + this.Zz.Zn();
        paramArrayOfint[1] = paramArrayOfint[1] + this.Zz.Zn();
        return Zq(arrayOfByte);
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    return this.Zz.ZK();
  }
  
  private byte[] ZL(byte[] paramArrayOfbyte) {
    byte b = (this.Zz.Zr() == null) ? 0 : this.Zz.Zr().length();
    byte[] arrayOfByte = new byte[b + paramArrayOfbyte.length];
    System.arraycopy((this.Zz.Zr() == null) ? new byte[0] : Zkb.Zy(this.Zz.Zr()), 0, arrayOfByte, 0, b);
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, b, paramArrayOfbyte.length);
    return arrayOfByte;
  }
  
  private byte[] Zq(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[this.Zz.Zn() + paramArrayOfbyte.length + (this.Zz.ZK()).length - this.Zz.ZD()];
    System.arraycopy(this.Zz.ZK(), 0, arrayOfByte, 0, this.Zz.Zn());
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, this.Zz.Zn(), paramArrayOfbyte.length);
    System.arraycopy(this.Zz.ZK(), this.Zz.ZD(), arrayOfByte, this.Zz.Zn() + paramArrayOfbyte.length, (this.Zz.ZK()).length - this.Zz.ZD());
    return arrayOfByte;
  }
  
  protected int[] ZJ(byte[] paramArrayOfbyte, byte paramByte, int[] paramArrayOfint) {
    switch (paramByte) {
      case 0:
        this.ZH.Zx(paramArrayOfbyte, paramArrayOfint);
        return new int[] { this.Zz.Zn() + paramArrayOfint[0], this.Zz.Zn() + paramArrayOfint[1] };
      case 1:
        Zx(paramArrayOfbyte, paramByte, paramArrayOfint);
        return new int[] { paramArrayOfint[0], paramArrayOfint[1] };
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    return null;
  }
  
  public Ztr2 ZN() {
    return this.ZH;
  }
  
  public void ZS(Ztr2 paramZtr2) {
    this.ZH = paramZtr2;
  }
  
  public boolean Zm(Zrdu paramZrdu, String paramString, Zefx paramZefx) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zz : Lburp/Zshh;
    //   4: invokevirtual ZG : ()Lburp/Zs66;
    //   7: getstatic burp/Zs66.MANUAL_INSERTION_POINT : Lburp/Zs66;
    //   10: if_acmpeq -> 21
    //   13: aload_0
    //   14: aload_1
    //   15: aload_2
    //   16: aload_3
    //   17: invokespecial Zm : (Lburp/Zrdu;Ljava/lang/String;Lburp/Zefx;)Z
    //   20: ireturn
    //   21: aload_0
    //   22: getfield ZN : Ljava/util/List;
    //   25: ifnonnull -> 55
    //   28: aload_0
    //   29: aload_3
    //   30: invokeinterface Zc : ()Ljava/util/List;
    //   35: aload_0
    //   36: getfield Zz : Lburp/Zshh;
    //   39: invokevirtual Zn : ()I
    //   42: aload_0
    //   43: getfield Zz : Lburp/Zshh;
    //   46: invokevirtual ZD : ()I
    //   49: invokestatic ZV : (Ljava/util/List;II)Ljava/util/List;
    //   52: putfield ZN : Ljava/util/List;
    //   55: aload_0
    //   56: getfield ZN : Ljava/util/List;
    //   59: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   64: aload_1
    //   65: aload_2
    //   66: <illegal opcode> test : (Lburp/Zrdu;Ljava/lang/String;)Ljava/util/function/Predicate;
    //   71: invokeinterface noneMatch : (Ljava/util/function/Predicate;)Z
    //   76: ireturn
  }
  
  public int hashCode() {
    return this.Zz.hashCode();
  }
  
  public boolean equals(Object paramObject) {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    if (!super.equals(paramObject))
      return false; 
    if (paramObject instanceof Zl7) {
      Zl7 zl7 = (Zl7)paramObject;
      if (arrayOfZbqc == null)
        return (this.Zz.Zn() == zl7.Zz.Zn() && this.Zz.ZD() == zl7.Zz.ZD()); 
    } 
    return false;
  }
  
  private static boolean lambda$canModifyParameter$0(Zrdu paramZrdu, String paramString, Zlou paramZlou) {
    return (paramZlou.Zx == paramZrdu && paramZlou.ZA.equals(paramString));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
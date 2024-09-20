package burp;

import java.io.ByteArrayOutputStream;

class Zrmx implements Zrch {
  private final Zs8d Zh;
  
  Zrmx(Zs8d paramZs8d) {
    this.Zh = paramZs8d;
  }
  
  public short ZX(Zbi8 paramZbi8) {
    return 0;
  }
  
  private int Zd(Zbi8 paramZbi8) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: invokestatic ZB : ()Ljava/lang/String;
    //   5: iconst_0
    //   6: istore #4
    //   8: astore_2
    //   9: iload #4
    //   11: aload_1
    //   12: getfield Zo : I
    //   15: if_icmpge -> 84
    //   18: aload_1
    //   19: getfield Zu : [B
    //   22: aload_1
    //   23: getfield Zv : I
    //   26: iload #4
    //   28: iadd
    //   29: baload
    //   30: istore #5
    //   32: iload_3
    //   33: ifne -> 54
    //   36: iload #5
    //   38: bipush #61
    //   40: if_icmpeq -> 54
    //   43: iload #5
    //   45: invokestatic Zr : (B)Z
    //   48: ifeq -> 54
    //   51: goto -> 77
    //   54: iload #5
    //   56: bipush #61
    //   58: if_icmpne -> 84
    //   61: iload_3
    //   62: ifeq -> 72
    //   65: iinc #4, 1
    //   68: aload_2
    //   69: ifnull -> 84
    //   72: iconst_1
    //   73: istore_3
    //   74: goto -> 77
    //   77: iinc #4, 1
    //   80: aload_2
    //   81: ifnull -> 9
    //   84: iload #4
    //   86: ireturn
  }
  
  public boolean ZN(Zbi8 paramZbi8) {
    return (Zd(paramZbi8) > 0);
  }
  
  public void Zq(Zbi8 paramZbi8, ByteArrayOutputStream paramByteArrayOutputStream) {
    int i = Zd(paramZbi8);
    byte[] arrayOfByte1 = new byte[i];
    System.arraycopy(paramZbi8.Zu, paramZbi8.Zv, arrayOfByte1, 0, i);
    byte[] arrayOfByte2 = this.Zh.ZK(arrayOfByte1);
    paramByteArrayOutputStream.writeBytes(arrayOfByte2);
    paramZbi8.Zv += i;
    paramZbi8.Zo -= i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrmx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
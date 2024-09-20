package burp;

import java.io.ByteArrayOutputStream;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

class Zlf5 extends Zlft {
  private byte[] Zn;
  
  private byte[] ZH;
  
  private int Zm;
  
  private int ZJ;
  
  private String Zu;
  
  private int ZM;
  
  private boolean Zs;
  
  private int Zz;
  
  private static final String a;
  
  Zlf5(byte paramByte1, byte paramByte2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5, int paramInt1, int paramInt2, short paramShort, Zbnt paramZbnt) {
    super(paramByte1, paramByte2, paramArrayOfbyte1, paramArrayOfbyte2, paramShort, paramZbnt);
    this.Zn = paramArrayOfbyte3;
    this.ZH = paramArrayOfbyte4;
    this.Zm = paramInt1;
    this.ZJ = paramInt2;
    this.ZM = Integer.parseInt(Zkb.Zo(paramArrayOfbyte3, paramInt1, paramInt2 - paramInt1));
    this.Zz = this.ZM;
    this.Zu = a + a;
  }
  
  public void Zz(Zm82 paramZm82, Zzv5 paramZzv5) {
    Zn();
    super.Zz(paramZm82, paramZzv5);
    try {
      while (true) {
        if (!ZL()) {
          Zw();
          return;
        } 
        byte[] arrayOfByte = Zd();
        if (arrayOfByte == null) {
          this.ZR = true;
          return;
        } 
        try {
          if (ZS(arrayOfByte, this.ZH)) {
            if (this.Zs) {
              this.ZR = true;
              return;
            } 
            this.Zs = true;
            this.Zz = this.ZM;
          } 
        } catch (Exception exception) {
          throw b(null);
        } 
        if (Math.random() > 0.95D) {
          Zw();
          return;
        } 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      this.ZR = true;
      return;
    } 
  }
  
  private byte[] Zd() {
    if (this.Zs) {
      this.Zz--;
      if (this.Zz < this.ZM - 10 || this.Zz <= 0)
        return null; 
    } else {
      this.Zz++;
      if (this.Zz > this.ZM + 10) {
        this.Zs = true;
        this.Zz = this.ZM;
        return Zd();
      } 
    } 
    byte[] arrayOfByte = Zkb.Zy(Integer.toString(this.Zz));
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.Zn.length);
    byteArrayOutputStream.write(this.Zn, 0, this.Zm);
    byteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
    byteArrayOutputStream.write(this.Zn, this.ZJ, this.Zn.length - this.ZJ);
    return byteArrayOutputStream.toByteArray();
  }
  
  public String toString() {
    return this.Zu;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #120
    //   2: ldc 'B1'-0{1&\c3w&=\\rQ766;:L'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlf5.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #110
    //   82: goto -> 112
    //   85: bipush #44
    //   87: goto -> 112
    //   90: bipush #44
    //   92: goto -> 112
    //   95: bipush #20
    //   97: goto -> 112
    //   100: bipush #71
    //   102: goto -> 112
    //   105: bipush #59
    //   107: goto -> 112
    //   110: bipush #61
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlf5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
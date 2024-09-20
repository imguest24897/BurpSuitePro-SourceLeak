package burp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zktd extends Zkte {
  private final Zrq9 ZU;
  
  private static final String a;
  
  public Zktd(Zr_4 paramZr_4, Zrq9 paramZrq9) {
    super(paramZr_4, paramZrq9);
    this.ZU = paramZrq9;
  }
  
  public void Zy4() throws Ztku {
    this.ZU.Zy4();
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.ZU.ZS(paramZs4f);
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    if (this.ZU.ZlB() > this.ZU.Zln())
      return null; 
    byte[] arrayOfByte1 = Zz(this.ZU.ZlB(), this.Zn);
    byte[] arrayOfByte2 = Zkb.Zy("" + this.ZU.ZlB() + this.ZU.ZlB() + a);
    this.ZU.ZHn(this.ZU.ZlB() + this.ZU.Zlh());
    return this.ZU.Zyn().ZL(new Zr1f(paramZzlx), paramArrayOfbyte, new byte[][] { arrayOfByte1, null, arrayOfByte2 });
  }
  
  public byte[] Zm(byte[] paramArrayOfbyte, boolean paramBoolean) {
    try {
      int i = Integer.parseInt((new StringTokenizer(Zkb.ZG(paramArrayOfbyte))).nextToken());
      byte[] arrayOfByte = Zz(i, this.Zn);
      return paramBoolean ? this.ZU.Zyn().Zd(arrayOfByte) : arrayOfByte;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public void ZyK() {
    this.ZU.ZyK();
  }
  
  private byte[] Zz(int paramInt, Zr_4 paramZr_4) {
    String str = Zs76.ZM();
    byte[] arrayOfByte1 = this.ZU.Zl0().ZiD();
    if (this.ZU.Zl0().Zpu() < paramInt) {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      try {
        byteArrayOutputStream.write(arrayOfByte1);
        while (byteArrayOutputStream.size() < paramInt) {
          byteArrayOutputStream.write(byteArrayOutputStream.toByteArray());
          if (str == null)
            break; 
        } 
        this.ZU.Z_(paramZr_4.ZZ(byteArrayOutputStream.toByteArray()));
      } catch (IOException iOException) {
        Zah.Zl(iOException, Zk_.IMPOSSIBLE);
      } 
    } 
    byte[] arrayOfByte2 = new byte[paramInt];
    System.arraycopy(this.ZU.Zl0().ZiD(), 0, arrayOfByte2, 0, paramInt);
    return arrayOfByte2;
  }
  
  static {
    // Byte code:
    //   0: bipush #53
    //   2: ldc 'A9'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zktd.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #84
    //   82: goto -> 111
    //   85: bipush #116
    //   87: goto -> 111
    //   90: iconst_2
    //   91: goto -> 111
    //   94: bipush #56
    //   96: goto -> 111
    //   99: bipush #56
    //   101: goto -> 111
    //   104: bipush #17
    //   106: goto -> 111
    //   109: bipush #87
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zktd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
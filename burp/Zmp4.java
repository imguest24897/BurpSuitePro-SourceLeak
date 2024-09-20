package burp;

import java.util.List;

public class Zmp4 implements Zlv8 {
  private final Zzh2 ZI;
  
  private final Zbp5 Zm;
  
  private final Zm6x ZR;
  
  private static final String a;
  
  public Zmp4(Zzh2 paramZzh2, Zbp5 paramZbp5, Zm6x paramZm6x) {
    this.ZI = paramZzh2;
    this.Zm = paramZbp5;
    this.ZR = paramZm6x;
  }
  
  public boolean ZY() {
    return this.ZI.ZGf();
  }
  
  public byte[] ZW() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (this.ZI.ZGy() == null) ? this.ZI.ZGU().ZiD() : this.ZI.ZGy().ZiD();
  }
  
  public void Zo(byte[] paramArrayOfbyte) {
    throw new UnsupportedOperationException(a);
  }
  
  public Zefx ZP() {
    return this.Zm.ZO(this.ZI.ZGx());
  }
  
  public String ZE() {
    return this.ZI.ZIx();
  }
  
  public void Zx(String paramString) {
    this.ZI.Zxg(paramString);
    this.ZR.ZB(new Zt4d(List.of(this.ZI)));
  }
  
  public byte Zq() {
    return this.ZI.ZaP();
  }
  
  public void Zj(byte paramByte) {
    this.ZI.ZB(paramByte);
  }
  
  public boolean ZM() {
    return true;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: ldc '8\\ra;iQa7CXu}'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmp4.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #105
    //   82: goto -> 111
    //   85: bipush #97
    //   87: goto -> 111
    //   90: bipush #28
    //   92: goto -> 111
    //   95: bipush #78
    //   97: goto -> 111
    //   100: bipush #63
    //   102: goto -> 111
    //   105: bipush #109
    //   107: goto -> 111
    //   110: iconst_2
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmp4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
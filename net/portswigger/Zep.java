package net.portswigger;

import java.io.IOException;
import java.io.InputStream;

public class Zep {
  private final InputStream Zd;
  
  private final byte[] ZL;
  
  private int ZP;
  
  private int ZB;
  
  private static final String a;
  
  public Zep(InputStream paramInputStream) {
    this.Zd = paramInputStream;
    this.ZL = new byte[1024];
  }
  
  public void ZN(byte[] paramArrayOfbyte) throws IOException {
    Zd(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void Zd(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    String[] arrayOfString = Zza.ZX();
    try {
      if (paramInt2 == 0)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zq(paramInt2);
    int i = paramInt2;
    int j = paramInt1;
    while (true) {
      Zb();
      int k = Math.min(i, this.ZB - this.ZP);
      System.arraycopy(this.ZL, this.ZP, paramArrayOfbyte, j, k);
      this.ZP += k;
      if (k != i || arrayOfString != null) {
        i -= k;
        j += k;
        if (arrayOfString != null)
          break; 
        continue;
      } 
      break;
    } 
  }
  
  public int ZI() throws IOException {
    Zb();
    int i = this.ZL[this.ZP];
    this.ZP++;
    if (i < 0)
      i = 256 + i; 
    return i;
  }
  
  public int Zt() throws IOException {
    return 256 * ZI() + ZI();
  }
  
  public int ZZ() throws IOException {
    return ZI() + 256 * ZI();
  }
  
  public long Zz() throws IOException {
    return 16777216L * ZI() + 65536L * ZI() + 256L * ZI() + ZI();
  }
  
  public long Zw() throws IOException {
    return ZI() + 256L * ZI() + 65536L * ZI() + 16777216L * ZI();
  }
  
  public int Zg() throws IOException {
    // Byte code:
    //   0: invokestatic ZX : ()[Ljava/lang/String;
    //   3: iconst_0
    //   4: istore_2
    //   5: iconst_0
    //   6: istore #5
    //   8: astore_1
    //   9: aload_0
    //   10: invokevirtual ZI : ()I
    //   13: istore_3
    //   14: iload_3
    //   15: sipush #128
    //   18: iand
    //   19: ifeq -> 26
    //   22: iconst_1
    //   23: goto -> 27
    //   26: iconst_0
    //   27: istore #4
    //   29: iload_3
    //   30: bipush #127
    //   32: iand
    //   33: istore_3
    //   34: iload_2
    //   35: iload_3
    //   36: bipush #7
    //   38: iload #5
    //   40: imul
    //   41: ishl
    //   42: iadd
    //   43: istore_2
    //   44: iinc #5, 1
    //   47: iload #4
    //   49: ifne -> 9
    //   52: iload_2
    //   53: aload_1
    //   54: ifnull -> 71
    //   57: iconst_2
    //   58: anewarray burp/Zbqc
    //   61: invokestatic Zr : ([Lburp/Zbqc;)V
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: ireturn
    // Exception table:
    //   from	to	target	type
    //   52	64	67	java/io/IOException
  }
  
  public byte[] Zd(int paramInt) throws IOException {
    Zq(paramInt);
    byte[] arrayOfByte = new byte[paramInt];
    ZN(arrayOfByte);
    return arrayOfByte;
  }
  
  private void Zb() throws IOException {
    try {
      if (this.ZP == this.ZB)
        try {
          this.ZP = 0;
          this.ZB = this.Zd.read(this.ZL, 0, 1024);
          if (this.ZB < 1)
            throw new Zza(); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void Zq(int paramInt) {
    try {
      if (paramInt < 0)
        throw new IllegalArgumentException(a); 
    } catch (Zza zza) {
      throw a(null);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #88
    //   2: ldc 'Z3e}Cb}pt6(q5sX:pts\\n}vt\\r68p'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zep.a : Ljava/lang/String;
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
    //   80: bipush #78
    //   82: goto -> 111
    //   85: bipush #32
    //   87: goto -> 111
    //   90: iconst_5
    //   91: goto -> 111
    //   94: bipush #90
    //   96: goto -> 111
    //   99: bipush #54
    //   101: goto -> 111
    //   104: bipush #77
    //   106: goto -> 111
    //   109: bipush #59
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zep.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

public class Zsh extends Zzg<UUID> implements Zi {
  static final char[] ZF;
  
  protected final Boolean Zh;
  
  public Zsh() {
    this((Boolean)null);
  }
  
  protected Zsh(Boolean paramBoolean) {
    super(UUID.class);
    this.Zh = paramBoolean;
  }
  
  public boolean Zn(Zyi paramZyi, UUID paramUUID) {
    return (paramUUID.getLeastSignificantBits() == 0L && paramUUID.getMostSignificantBits() == 0L);
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zgy zgy = Z_(paramZyi, paramZo, Zz());
    Boolean bool = null;
    if (zgy != null) {
      Zqi zqi = zgy.ZI();
      if (zqi == Zqi.BINARY) {
        bool = Boolean.valueOf(true);
      } else if (zqi == Zqi.STRING) {
        bool = Boolean.valueOf(false);
      } 
    } 
    try {
      if (!Objects.equals(bool, this.Zh))
        return new Zsh(bool); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return this;
  }
  
  public void Zp(UUID paramUUID, Zf paramZf, Zyi paramZyi) throws IOException {
    try {
      if (Z_(paramZf)) {
        paramZf.ZO(Z_(paramUUID));
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    char[] arrayOfChar = new char[36];
    long l1 = paramUUID.getMostSignificantBits();
    ZZ((int)(l1 >> 32L), arrayOfChar, 0);
    arrayOfChar[8] = '-';
    int i = (int)l1;
    Zc(i >>> 16, arrayOfChar, 9);
    arrayOfChar[13] = '-';
    Zc(i, arrayOfChar, 14);
    arrayOfChar[18] = '-';
    long l2 = paramUUID.getLeastSignificantBits();
    Zc((int)(l2 >>> 48L), arrayOfChar, 19);
    arrayOfChar[23] = '-';
    Zc((int)(l2 >>> 32L), arrayOfChar, 24);
    ZZ((int)l2, arrayOfChar, 28);
    paramZf.ZA(arrayOfChar, 0, 36);
  }
  
  protected boolean Z_(Zf paramZf) {
    return (this.Zh != null) ? this.Zh.booleanValue() : ((!(paramZf instanceof com.fasterxml.Zm.Zl) && paramZf.Ze()));
  }
  
  private static void ZZ(int paramInt1, char[] paramArrayOfchar, int paramInt2) {
    Zc(paramInt1 >> 16, paramArrayOfchar, paramInt2);
    Zc(paramInt1, paramArrayOfchar, paramInt2 + 4);
  }
  
  private static void Zc(int paramInt1, char[] paramArrayOfchar, int paramInt2) {
    paramArrayOfchar[paramInt2] = ZF[paramInt1 >> 12 & 0xF];
    paramArrayOfchar[++paramInt2] = ZF[paramInt1 >> 8 & 0xF];
    paramArrayOfchar[++paramInt2] = ZF[paramInt1 >> 4 & 0xF];
    paramArrayOfchar[++paramInt2] = ZF[paramInt1 & 0xF];
  }
  
  private static final byte[] Z_(UUID paramUUID) {
    byte[] arrayOfByte = new byte[16];
    long l1 = paramUUID.getMostSignificantBits();
    long l2 = paramUUID.getLeastSignificantBits();
    ZY((int)(l1 >> 32L), arrayOfByte, 0);
    ZY((int)l1, arrayOfByte, 4);
    ZY((int)(l2 >> 32L), arrayOfByte, 8);
    ZY((int)l2, arrayOfByte, 12);
    return arrayOfByte;
  }
  
  private static final void ZY(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    paramArrayOfbyte[paramInt2] = (byte)(paramInt1 >> 24);
    paramArrayOfbyte[++paramInt2] = (byte)(paramInt1 >> 16);
    paramArrayOfbyte[++paramInt2] = (byte)(paramInt1 >> 8);
    paramArrayOfbyte[++paramInt2] = (byte)paramInt1;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: ldc '3B0P~E:Ib(Id'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 154
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 128
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #38
    //   82: goto -> 112
    //   85: bipush #8
    //   87: goto -> 112
    //   90: bipush #122
    //   92: goto -> 112
    //   95: bipush #9
    //   97: goto -> 112
    //   100: bipush #110
    //   102: goto -> 112
    //   105: bipush #65
    //   107: goto -> 112
    //   110: bipush #121
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #1, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 33
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_1
    //   132: if_icmpgt -> 30
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
    //   154: aload_0
    //   155: invokevirtual toCharArray : ()[C
    //   158: putstatic com/fasterxml/Zsh.ZF : [C
    //   161: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
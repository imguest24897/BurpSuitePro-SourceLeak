package net.portswigger;

import burp.Zbqc;

public class Zm4 extends Zmy {
  private int ZN;
  
  private int ZZ;
  
  private int ZM;
  
  private int Zp;
  
  private static final String a;
  
  public Zm4() {
    super(a, 16, 64);
  }
  
  private Zm4(Zm4 paramZm4) {
    this();
    this.ZN = paramZm4.ZN;
    this.ZZ = paramZm4.ZZ;
    this.ZM = paramZm4.ZM;
    this.Zp = paramZm4.Zp;
    this.ZI = paramZm4.ZI;
    this.Zg = (byte[])paramZm4.Zg.clone();
  }
  
  public Object clone() {
    return new Zm4(this);
  }
  
  protected byte[] ZM() {
    byte[] arrayOfByte = { 
        (byte)this.ZN, (byte)(this.ZN >>> 8), (byte)(this.ZN >>> 16), (byte)(this.ZN >>> 24), (byte)this.ZZ, (byte)(this.ZZ >>> 8), (byte)(this.ZZ >>> 16), (byte)(this.ZZ >>> 24), (byte)this.ZM, (byte)(this.ZM >>> 8), 
        (byte)(this.ZM >>> 16), (byte)(this.ZM >>> 24), (byte)this.Zp, (byte)(this.Zp >>> 8), (byte)(this.Zp >>> 16), (byte)(this.Zp >>> 24) };
    int i = Zmy.Zx();
    if (Zbqc.Zwu() == null)
      Zmy.ZJ(++i); 
    return arrayOfByte;
  }
  
  protected void ZV() {
    this.ZN = 1732584193;
    this.ZZ = -271733879;
    this.ZM = -1732584194;
    this.Zp = 271733878;
  }
  
  protected byte[] Zp() {
    int i = (int)(this.ZI % 64L);
    int j = (i < 56) ? (56 - i) : (120 - i);
    byte[] arrayOfByte = new byte[j + 8];
    arrayOfByte[0] = Byte.MIN_VALUE;
    long l = this.ZI << 3L;
    arrayOfByte[j++] = (byte)(int)l;
    arrayOfByte[j++] = (byte)(int)(l >>> 8L);
    arrayOfByte[j++] = (byte)(int)(l >>> 16L);
    arrayOfByte[j++] = (byte)(int)(l >>> 24L);
    arrayOfByte[j++] = (byte)(int)(l >>> 32L);
    arrayOfByte[j++] = (byte)(int)(l >>> 40L);
    arrayOfByte[j++] = (byte)(int)(l >>> 48L);
    arrayOfByte[j] = (byte)(int)(l >>> 56L);
    return arrayOfByte;
  }
  
  protected void Zk(byte[] paramArrayOfbyte, int paramInt) {
    int j = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int k = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int m = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int n = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int i1 = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int i2 = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int i3 = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int i4 = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int i5 = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int i6 = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int i7 = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int i8 = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int i9 = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int i10 = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int i11 = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt++] << 24;
    int i12 = paramArrayOfbyte[paramInt++] & 0xFF | (paramArrayOfbyte[paramInt++] & 0xFF) << 8 | (paramArrayOfbyte[paramInt++] & 0xFF) << 16 | paramArrayOfbyte[paramInt] << 24;
    int i13 = this.ZN;
    int i14 = this.ZZ;
    int i15 = this.ZM;
    int i16 = this.Zp;
    i13 += (i14 & i15 | (i14 ^ 0xFFFFFFFF) & i16) + j;
    i13 = i13 << 3 | i13 >>> -3;
    i16 += (i13 & i14 | (i13 ^ 0xFFFFFFFF) & i15) + k;
    i16 = i16 << 7 | i16 >>> -7;
    i15 += (i16 & i13 | (i16 ^ 0xFFFFFFFF) & i14) + m;
    i15 = i15 << 11 | i15 >>> -11;
    i14 += (i15 & i16 | (i15 ^ 0xFFFFFFFF) & i13) + n;
    i14 = i14 << 19 | i14 >>> -19;
    i13 += (i14 & i15 | (i14 ^ 0xFFFFFFFF) & i16) + i1;
    i13 = i13 << 3 | i13 >>> -3;
    i16 += (i13 & i14 | (i13 ^ 0xFFFFFFFF) & i15) + i2;
    i16 = i16 << 7 | i16 >>> -7;
    i15 += (i16 & i13 | (i16 ^ 0xFFFFFFFF) & i14) + i3;
    i15 = i15 << 11 | i15 >>> -11;
    i14 += (i15 & i16 | (i15 ^ 0xFFFFFFFF) & i13) + i4;
    i14 = i14 << 19 | i14 >>> -19;
    i13 += (i14 & i15 | (i14 ^ 0xFFFFFFFF) & i16) + i5;
    i13 = i13 << 3 | i13 >>> -3;
    i16 += (i13 & i14 | (i13 ^ 0xFFFFFFFF) & i15) + i6;
    i16 = i16 << 7 | i16 >>> -7;
    i15 += (i16 & i13 | (i16 ^ 0xFFFFFFFF) & i14) + i7;
    i15 = i15 << 11 | i15 >>> -11;
    i14 += (i15 & i16 | (i15 ^ 0xFFFFFFFF) & i13) + i8;
    i14 = i14 << 19 | i14 >>> -19;
    i13 += (i14 & i15 | (i14 ^ 0xFFFFFFFF) & i16) + i9;
    i13 = i13 << 3 | i13 >>> -3;
    i16 += (i13 & i14 | (i13 ^ 0xFFFFFFFF) & i15) + i10;
    int i = Zmy.ZN();
    i16 = i16 << 7 | i16 >>> -7;
    i15 += (i16 & i13 | (i16 ^ 0xFFFFFFFF) & i14) + i11;
    i15 = i15 << 11 | i15 >>> -11;
    i14 += (i15 & i16 | (i15 ^ 0xFFFFFFFF) & i13) + i12;
    i14 = i14 << 19 | i14 >>> -19;
    i13 += (i14 & (i15 | i16) | i15 & i16) + j + 1518500249;
    i13 = i13 << 3 | i13 >>> -3;
    i16 += (i13 & (i14 | i15) | i14 & i15) + i1 + 1518500249;
    i16 = i16 << 5 | i16 >>> -5;
    i15 += (i16 & (i13 | i14) | i13 & i14) + i5 + 1518500249;
    i15 = i15 << 9 | i15 >>> -9;
    i14 += (i15 & (i16 | i13) | i16 & i13) + i9 + 1518500249;
    i14 = i14 << 13 | i14 >>> -13;
    i13 += (i14 & (i15 | i16) | i15 & i16) + k + 1518500249;
    i13 = i13 << 3 | i13 >>> -3;
    i16 += (i13 & (i14 | i15) | i14 & i15) + i2 + 1518500249;
    i16 = i16 << 5 | i16 >>> -5;
    i15 += (i16 & (i13 | i14) | i13 & i14) + i6 + 1518500249;
    i15 = i15 << 9 | i15 >>> -9;
    i14 += (i15 & (i16 | i13) | i16 & i13) + i10 + 1518500249;
    i14 = i14 << 13 | i14 >>> -13;
    i13 += (i14 & (i15 | i16) | i15 & i16) + m + 1518500249;
    i13 = i13 << 3 | i13 >>> -3;
    i16 += (i13 & (i14 | i15) | i14 & i15) + i3 + 1518500249;
    i16 = i16 << 5 | i16 >>> -5;
    i15 += (i16 & (i13 | i14) | i13 & i14) + i7 + 1518500249;
    i15 = i15 << 9 | i15 >>> -9;
    i14 += (i15 & (i16 | i13) | i16 & i13) + i11 + 1518500249;
    i14 = i14 << 13 | i14 >>> -13;
    i13 += (i14 & (i15 | i16) | i15 & i16) + n + 1518500249;
    i13 = i13 << 3 | i13 >>> -3;
    i16 += (i13 & (i14 | i15) | i14 & i15) + i4 + 1518500249;
    i16 = i16 << 5 | i16 >>> -5;
    i15 += (i16 & (i13 | i14) | i13 & i14) + i8 + 1518500249;
    i15 = i15 << 9 | i15 >>> -9;
    i14 += (i15 & (i16 | i13) | i16 & i13) + i12 + 1518500249;
    i14 = i14 << 13 | i14 >>> -13;
    i13 += (i14 ^ i15 ^ i16) + j + 1859775393;
    i13 = i13 << 3 | i13 >>> -3;
    i16 += (i13 ^ i14 ^ i15) + i5 + 1859775393;
    i16 = i16 << 9 | i16 >>> -9;
    i15 += (i16 ^ i13 ^ i14) + i1 + 1859775393;
    i15 = i15 << 11 | i15 >>> -11;
    i14 += (i15 ^ i16 ^ i13) + i9 + 1859775393;
    i14 = i14 << 15 | i14 >>> -15;
    i13 += (i14 ^ i15 ^ i16) + m + 1859775393;
    i13 = i13 << 3 | i13 >>> -3;
    i16 += (i13 ^ i14 ^ i15) + i7 + 1859775393;
    i16 = i16 << 9 | i16 >>> -9;
    i15 += (i16 ^ i13 ^ i14) + i3 + 1859775393;
    i15 = i15 << 11 | i15 >>> -11;
    i14 += (i15 ^ i16 ^ i13) + i11 + 1859775393;
    i14 = i14 << 15 | i14 >>> -15;
    i13 += (i14 ^ i15 ^ i16) + k + 1859775393;
    i13 = i13 << 3 | i13 >>> -3;
    i16 += (i13 ^ i14 ^ i15) + i6 + 1859775393;
    i16 = i16 << 9 | i16 >>> -9;
    i15 += (i16 ^ i13 ^ i14) + i2 + 1859775393;
    i15 = i15 << 11 | i15 >>> -11;
    i14 += (i15 ^ i16 ^ i13) + i10 + 1859775393;
    i14 = i14 << 15 | i14 >>> -15;
    i13 += (i14 ^ i15 ^ i16) + n + 1859775393;
    i13 = i13 << 3 | i13 >>> -3;
    i16 += (i13 ^ i14 ^ i15) + i8 + 1859775393;
    i16 = i16 << 9 | i16 >>> -9;
    i15 += (i16 ^ i13 ^ i14) + i4 + 1859775393;
    i15 = i15 << 11 | i15 >>> -11;
    i14 += (i15 ^ i16 ^ i13) + i12 + 1859775393;
    i14 = i14 << 15 | i14 >>> -15;
    this.ZN += i13;
    this.ZZ += i14;
    this.ZM += i15;
    this.Zp += i16;
    if (i != 0)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: ldc ',=\\r'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zm4.a : Ljava/lang/String;
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
    //   80: bipush #83
    //   82: goto -> 112
    //   85: bipush #75
    //   87: goto -> 112
    //   90: bipush #43
    //   92: goto -> 112
    //   95: bipush #70
    //   97: goto -> 112
    //   100: bipush #20
    //   102: goto -> 112
    //   105: bipush #118
    //   107: goto -> 112
    //   110: bipush #103
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zm4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
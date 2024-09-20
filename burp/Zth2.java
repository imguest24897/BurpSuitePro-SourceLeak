package burp;

import java.io.ByteArrayOutputStream;

public class Zth2 implements Ztr2 {
  private static final String a;
  
  public byte[] ZD(byte[] paramArrayOfbyte) {
    return Zx(paramArrayOfbyte, new int[] { 0, paramArrayOfbyte.length });
  }
  
  public byte[] Zx(byte[] paramArrayOfbyte, int[] paramArrayOfint) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    int[] arrayOfInt = new int[2];
    Zbqc[] arrayOfZbqc = Zr21.ZD();
    arrayOfInt[0] = paramArrayOfint[0];
    arrayOfInt[1] = paramArrayOfint[1];
    byte b = 0;
    while (b < paramArrayOfbyte.length) {
      ZO(paramArrayOfint, arrayOfInt, byteArrayOutputStream, b);
      byte b1 = paramArrayOfbyte[b];
      switch (b1) {
        case 34:
        case 47:
        case 92:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(b1);
        case 8:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(98);
        case 12:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(102);
        case 10:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(110);
        case 13:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(114);
        case 9:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(116);
        default:
        
      } 
      b++;
      continue;
      if (arrayOfZbqc != null)
        break; 
    } 
    ZO(paramArrayOfint, arrayOfInt, byteArrayOutputStream, paramArrayOfbyte.length);
    paramArrayOfint[0] = arrayOfInt[0];
    paramArrayOfint[1] = arrayOfInt[1];
    return byteArrayOutputStream.toByteArray();
  }
  
  private void ZO(int[] paramArrayOfint1, int[] paramArrayOfint2, ByteArrayOutputStream paramByteArrayOutputStream, int paramInt) {
    if (paramInt == paramArrayOfint1[0])
      paramArrayOfint2[0] = paramByteArrayOutputStream.size(); 
    if (paramInt == paramArrayOfint1[1])
      paramArrayOfint2[1] = paramByteArrayOutputStream.size(); 
  }
  
  public byte[] Zp(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: new java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZD : ()[Lburp/Zbqc;
    //   11: iconst_0
    //   12: istore #4
    //   14: astore_2
    //   15: iload #4
    //   17: aload_1
    //   18: arraylength
    //   19: if_icmpge -> 285
    //   22: aload_1
    //   23: iload #4
    //   25: baload
    //   26: istore #5
    //   28: iload #5
    //   30: bipush #92
    //   32: if_icmpne -> 272
    //   35: iinc #4, 1
    //   38: iload #4
    //   40: aload_1
    //   41: arraylength
    //   42: if_icmpge -> 51
    //   45: aload_1
    //   46: iload #4
    //   48: baload
    //   49: istore #5
    //   51: iload #5
    //   53: lookupswitch default -> 262, 34 -> 136, 47 -> 136, 92 -> 136, 98 -> 146, 102 -> 156, 110 -> 166, 114 -> 176, 116 -> 186, 117 -> 196
    //   136: aload_3
    //   137: iload #5
    //   139: invokevirtual write : (I)V
    //   142: aload_2
    //   143: ifnull -> 278
    //   146: aload_3
    //   147: bipush #8
    //   149: invokevirtual write : (I)V
    //   152: aload_2
    //   153: ifnull -> 278
    //   156: aload_3
    //   157: bipush #12
    //   159: invokevirtual write : (I)V
    //   162: aload_2
    //   163: ifnull -> 278
    //   166: aload_3
    //   167: bipush #10
    //   169: invokevirtual write : (I)V
    //   172: aload_2
    //   173: ifnull -> 278
    //   176: aload_3
    //   177: bipush #13
    //   179: invokevirtual write : (I)V
    //   182: aload_2
    //   183: ifnull -> 278
    //   186: aload_3
    //   187: bipush #9
    //   189: invokevirtual write : (I)V
    //   192: aload_2
    //   193: ifnull -> 278
    //   196: iload #4
    //   198: iconst_4
    //   199: iadd
    //   200: aload_1
    //   201: arraylength
    //   202: if_icmpge -> 239
    //   205: iinc #4, 3
    //   208: aload_1
    //   209: iload #4
    //   211: iconst_2
    //   212: invokestatic Zo : ([BII)Ljava/lang/String;
    //   215: bipush #16
    //   217: invokestatic parseInt : (Ljava/lang/String;I)I
    //   220: istore #6
    //   222: iinc #4, 1
    //   225: aload_3
    //   226: iload #6
    //   228: sipush #255
    //   231: iand
    //   232: invokevirtual write : (I)V
    //   235: aload_2
    //   236: ifnull -> 278
    //   239: iinc #4, -1
    //   242: aload_3
    //   243: aload_1
    //   244: iload #4
    //   246: aload_1
    //   247: arraylength
    //   248: iload #4
    //   250: isub
    //   251: invokevirtual write : ([BII)V
    //   254: aload_1
    //   255: arraylength
    //   256: istore #4
    //   258: aload_2
    //   259: ifnull -> 278
    //   262: aload_3
    //   263: iload #5
    //   265: invokevirtual write : (I)V
    //   268: aload_2
    //   269: ifnull -> 278
    //   272: aload_3
    //   273: iload #5
    //   275: invokevirtual write : (I)V
    //   278: iinc #4, 1
    //   281: aload_2
    //   282: ifnull -> 15
    //   285: aload_3
    //   286: invokevirtual toByteArray : ()[B
    //   289: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: ldc 'f+)F&B'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zth2.a : Ljava/lang/String;
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
    //   80: bipush #61
    //   82: goto -> 112
    //   85: bipush #89
    //   87: goto -> 112
    //   90: bipush #30
    //   92: goto -> 112
    //   95: bipush #113
    //   97: goto -> 112
    //   100: bipush #36
    //   102: goto -> 112
    //   105: bipush #72
    //   107: goto -> 112
    //   110: bipush #19
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zth2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
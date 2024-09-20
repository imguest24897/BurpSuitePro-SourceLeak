package burp;

import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Set;
import net.portswigger.Ztu;

public class Zr21 implements Ztr2 {
  private final Set<Byte> Ze = new HashSet<>();
  
  private static Zbqc[] Zf;
  
  public byte[] ZD(byte[] paramArrayOfbyte) {
    return Zx(paramArrayOfbyte, new int[] { 0, paramArrayOfbyte.length });
  }
  
  public byte[] Zx(byte[] paramArrayOfbyte, int[] paramArrayOfint) {
    // Byte code:
    //   0: new java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: invokestatic ZD : ()[Lburp/Zbqc;
    //   12: iconst_2
    //   13: newarray int
    //   15: astore #5
    //   17: astore_3
    //   18: aload #5
    //   20: iconst_0
    //   21: aload_2
    //   22: iconst_0
    //   23: iaload
    //   24: iastore
    //   25: aload #5
    //   27: iconst_1
    //   28: aload_2
    //   29: iconst_1
    //   30: iaload
    //   31: iastore
    //   32: iconst_0
    //   33: istore #6
    //   35: iload #6
    //   37: aload_1
    //   38: arraylength
    //   39: if_icmpge -> 304
    //   42: aload_2
    //   43: aload #5
    //   45: aload #4
    //   47: iload #6
    //   49: invokestatic Zb : ([I[ILjava/io/ByteArrayOutputStream;I)V
    //   52: aload_1
    //   53: iload #6
    //   55: baload
    //   56: istore #7
    //   58: aload_0
    //   59: getfield Ze : Ljava/util/Set;
    //   62: iload #7
    //   64: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   67: invokeinterface contains : (Ljava/lang/Object;)Z
    //   72: ifeq -> 86
    //   75: aload #4
    //   77: iload #7
    //   79: invokevirtual write : (I)V
    //   82: aload_3
    //   83: ifnull -> 297
    //   86: iload #7
    //   88: lookupswitch default -> 271, 32 -> 260, 34 -> 260, 35 -> 260, 37 -> 260, 38 -> 260, 43 -> 260, 44 -> 260, 47 -> 260, 58 -> 260, 59 -> 260, 60 -> 260, 61 -> 260, 62 -> 260, 63 -> 260, 92 -> 260, 94 -> 260, 96 -> 260, 123 -> 260, 124 -> 260, 125 -> 260
    //   260: aload #4
    //   262: iload #7
    //   264: invokestatic ZN : (Ljava/io/ByteArrayOutputStream;B)V
    //   267: aload_3
    //   268: ifnull -> 297
    //   271: iload #7
    //   273: invokestatic ZY : (B)Z
    //   276: ifeq -> 290
    //   279: aload #4
    //   281: iload #7
    //   283: invokestatic ZN : (Ljava/io/ByteArrayOutputStream;B)V
    //   286: aload_3
    //   287: ifnull -> 297
    //   290: aload #4
    //   292: iload #7
    //   294: invokevirtual write : (I)V
    //   297: iinc #6, 1
    //   300: aload_3
    //   301: ifnull -> 35
    //   304: aload_2
    //   305: aload #5
    //   307: aload #4
    //   309: aload_1
    //   310: arraylength
    //   311: invokestatic Zb : ([I[ILjava/io/ByteArrayOutputStream;I)V
    //   314: aload_2
    //   315: iconst_0
    //   316: aload #5
    //   318: iconst_0
    //   319: iaload
    //   320: iastore
    //   321: aload_2
    //   322: iconst_1
    //   323: aload #5
    //   325: iconst_1
    //   326: iaload
    //   327: iastore
    //   328: aload #4
    //   330: invokevirtual toByteArray : ()[B
    //   333: areturn
  }
  
  static void Zb(int[] paramArrayOfint1, int[] paramArrayOfint2, ByteArrayOutputStream paramByteArrayOutputStream, int paramInt) {
    if (paramInt == paramArrayOfint1[0])
      paramArrayOfint2[0] = paramByteArrayOutputStream.size(); 
    if (paramInt == paramArrayOfint1[1])
      paramArrayOfint2[1] = paramByteArrayOutputStream.size(); 
  }
  
  private static boolean ZY(byte paramByte) {
    return (paramByte < 32 || paramByte >= Byte.MAX_VALUE);
  }
  
  private static void ZN(ByteArrayOutputStream paramByteArrayOutputStream, byte paramByte) {
    paramByteArrayOutputStream.write(37);
    short s = (short)(0xFF & paramByte);
    paramByteArrayOutputStream.write(Ztu.Ze[s / 16]);
    paramByteArrayOutputStream.write(Ztu.Ze[s % 16]);
  }
  
  public byte[] Zp(byte[] paramArrayOfbyte) {
    return Ztu.ZS(paramArrayOfbyte);
  }
  
  public void ZA(char paramChar) {
    this.Ze.add(Byte.valueOf((byte)paramChar));
  }
  
  public void Zq(char paramChar) {
    this.Ze.remove(Byte.valueOf((byte)paramChar));
  }
  
  public static void Zv(Zbqc[] paramArrayOfZbqc) {
    Zf = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZD() {
    return Zf;
  }
  
  static {
    if (ZD() != null)
      Zv(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr21.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
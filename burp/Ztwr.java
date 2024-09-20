package burp;

import java.util.Arrays;
import java.util.function.Supplier;

public class Ztwr {
  private final Supplier<byte[]> ZT;
  
  private Ztwr(Supplier<byte[]> paramSupplier) {
    this.ZT = paramSupplier;
  }
  
  public static Ztwr ZD(byte[] paramArrayOfbyte) {
    return new Ztwr(paramArrayOfbyte::lambda$from$0);
  }
  
  public static Ztwr Zi(Supplier<byte[]> paramSupplier) {
    return new Ztwr(paramSupplier);
  }
  
  public static Ztwr Zc(Zefx paramZefx, Zrec... paramVarArgs) {
    // Byte code:
    //   0: new burp/Ztwr
    //   3: dup
    //   4: aload_1
    //   5: aload_0
    //   6: <illegal opcode> get : ([Lburp/Zrec;Lburp/Zefx;)Ljava/util/function/Supplier;
    //   11: invokespecial <init> : (Ljava/util/function/Supplier;)V
    //   14: areturn
  }
  
  public byte[] Zj() {
    return this.ZT.get();
  }
  
  private static byte[] lambda$from$3(Zrec[] paramArrayOfZrec, Zefx paramZefx) {
    return ((Zefx)Arrays.<Zrec>stream(paramArrayOfZrec).reduce(paramZefx, Ztwr::lambda$from$1, Ztwr::lambda$from$2)).ZD();
  }
  
  private static Zefx lambda$from$2(Zefx paramZefx1, Zefx paramZefx2) {
    return paramZefx2;
  }
  
  private static Zefx lambda$from$1(Zefx paramZefx, Zrec paramZrec) {
    return paramZrec.Zv(paramZefx);
  }
  
  private static byte[] lambda$from$0(byte[] paramArrayOfbyte) {
    return paramArrayOfbyte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztwr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
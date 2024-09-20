package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zkb;
import net.portswigger.Zlz;
import net.portswigger.Zsy;

public class Zg45 implements Zkrr {
  static final List<Zer7> Zv = new Zrqu();
  
  private final Ze3n ZZ;
  
  private final Zbnt ZU;
  
  private final Zsy Zn;
  
  private final Zsoh ZD;
  
  public Zg45(Ze3n paramZe3n, Zbnt paramZbnt, Zsy paramZsy, Zsoh paramZsoh) {
    this.ZZ = paramZe3n;
    this.ZU = paramZbnt;
    this.Zn = paramZsy;
    this.ZD = paramZsoh;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: iconst_3
    //   1: newarray int
    //   3: dup
    //   4: iconst_0
    //   5: iconst_5
    //   6: iastore
    //   7: dup
    //   8: iconst_1
    //   9: bipush #6
    //   11: iastore
    //   12: dup
    //   13: iconst_2
    //   14: bipush #7
    //   16: iastore
    //   17: astore #5
    //   19: invokestatic Zj : ()Z
    //   22: new java/util/concurrent/atomic/AtomicInteger
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore #6
    //   31: istore #4
    //   33: aload_0
    //   34: getfield ZZ : Lburp/Ze3n;
    //   37: invokevirtual ZA : ()Lburp/Zefx;
    //   40: invokeinterface ZF : ()Lburp/Zlit;
    //   45: invokeinterface Zdw : ()Ljava/lang/String;
    //   50: ldc '/'
    //   52: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   55: istore #7
    //   57: new burp/Zrqj
    //   60: dup
    //   61: iconst_1
    //   62: iload #7
    //   64: <illegal opcode> apply : (Z)Ljava/util/function/Function;
    //   69: aload_0
    //   70: getfield ZZ : Lburp/Ze3n;
    //   73: aload_0
    //   74: getfield ZU : Lburp/Zbnt;
    //   77: aload_0
    //   78: getfield ZD : Lburp/Zsoh;
    //   81: aload_2
    //   82: aload_3
    //   83: iload #7
    //   85: <illegal opcode> test : (Z)Ljava/util/function/Predicate;
    //   90: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   95: aload_0
    //   96: aload #5
    //   98: aload #6
    //   100: <illegal opcode> apply : (Lburp/Zg45;[ILjava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Function;
    //   105: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   110: invokespecial <init> : (BLjava/util/function/Function;Lburp/Ze3n;Lburp/Zbnt;Lburp/Zsoh;Lburp/Ztpx;Lburp/Zz4_;Ljava/util/function/Predicate;Ljava/util/function/BiFunction;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   113: invokevirtual ZO : ()V
    //   116: invokestatic Zwu : ()[Lburp/Zbqc;
    //   119: ifnonnull -> 135
    //   122: iload #4
    //   124: ifeq -> 131
    //   127: iconst_0
    //   128: goto -> 132
    //   131: iconst_1
    //   132: invokestatic ZO : (Z)V
    //   135: return
  }
  
  public Zbsl Zp() {
    return Zbsl.APU_BackupFilesAppendExtension;
  }
  
  public String toString() {
    return Zp().toString();
  }
  
  private static byte[] lambda$doCheck$4(String paramString1, String paramString2) {
    String[] arrayOfString = paramString1.split("/");
    String str = arrayOfString[arrayOfString.length - 1];
    int i = str.indexOf('.');
    i = (i == -1) ? str.length() : i;
    arrayOfString[arrayOfString.length - 1] = Zrqj.Zi(paramString2) + Zrqj.Zi(paramString2);
    return Zkb.Zy(String.join("/", (CharSequence[])arrayOfString) + String.join("/", (CharSequence[])arrayOfString));
  }
  
  private byte[] lambda$doCheck$3(int[] paramArrayOfint, AtomicInteger paramAtomicInteger, String paramString) {
    String str = this.Zn.Zi().Zq().ZK(paramArrayOfint[paramAtomicInteger.getAndIncrement() % paramArrayOfint.length]);
    return Zkb.Zy(paramString + "." + paramString);
  }
  
  private static byte[] lambda$doCheck$2(String paramString1, String paramString2) {
    return Zkb.Zy(paramString1 + paramString1);
  }
  
  private static boolean lambda$doCheck$1(boolean paramBoolean, Zzhh paramZzhh) {
    return (Zlz.Zu(paramZzhh.Zx) || paramBoolean);
  }
  
  private static List lambda$doCheck$0(boolean paramBoolean, Zlit paramZlit) {
    ArrayList<Zer7> arrayList = new ArrayList<>(Zv);
    if (!paramBoolean)
      arrayList.addAll(Zkti.ZN); 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg45.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
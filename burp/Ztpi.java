package burp;

import java.io.IOException;
import java.util.stream.IntStream;

public class Ztpi {
  private static String Zg;
  
  private static final String b;
  
  public static void ZG(Zg66 paramZg66, Zs4f paramZs4f) throws IOException {
    Zefg<Zstu> zefg = paramZg66.Zgl();
    byte b = 0;
    String str = Zo();
    while (b < zefg.size()) {
      paramZs4f.Ze("l", zefg.get(b));
      b++;
      if (str == null)
        break; 
    } 
    try {
      paramZs4f.Zb("f", paramZg66.ZgZ());
      paramZs4f.Zb("t", paramZg66.Zgm());
      paramZs4f.Zb("o", paramZg66.ZgN());
      paramZs4f.Zk("u", paramZg66.Zgk());
      paramZs4f.Zk("m", paramZg66.Zgp());
      paramZs4f.Zk("h", paramZg66.Zg7());
      paramZs4f.Zk("m", paramZg66.ZgG());
      paramZs4f.Zk("s", paramZg66.ZgO());
      paramZs4f.Zk("l", paramZg66.ZgU());
      paramZs4f.Zb("m", paramZg66.ZgF());
      paramZs4f.Zb("c", paramZg66.Zgj());
      paramZs4f.Ze("l", paramZg66.ZgE());
      paramZs4f.Zb("n", paramZg66.Zgs());
      paramZs4f.Zb("n", paramZg66.Zg4());
      paramZs4f.Zb("b", paramZg66.ZgB());
      if (Zbqc.Zwu() == null)
        ZN("PbH1zb"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  static void Zr(Zg66 paramZg66) {
    int i = paramZg66.ZgB();
    int j = paramZg66.Zgs();
    if (paramZg66.ZyP() && i > 0 && j != 0)
      paramZg66.ZvH((i + paramZg66.ZgQ().Zpu() - paramZg66.Zg4()) * paramZg66.Zgl().size() / j); 
  }
  
  public static int Zr(Zg66 paramZg66, boolean paramBoolean) {
    String str = Zo();
    if (paramBoolean) {
      int[] arrayOfInt = new int[6];
      byte b = paramZg66.ZgN();
      boolean bool1 = paramZg66.Zg7();
      boolean bool2 = paramZg66.Zgk();
      boolean bool3 = paramZg66.Zgp();
      boolean bool4 = paramZg66.ZgG();
      byte b1 = 0;
      while (b1 < b) {
        arrayOfInt[b1++] = 1;
        if (str == null)
          break; 
      } 
      if (bool2 && !bool3) {
        b1 = 1;
        while (b1 < b) {
          arrayOfInt[b1++] = arrayOfInt[b1++] + 3 * (b1 - 1);
          if (str == null)
            break; 
        } 
      } 
      if (bool2 && bool3) {
        b1 = 1;
        while (b1 < b) {
          arrayOfInt[b1++] = (int)Math.pow(4.0D, (b1 - 1));
          if (str == null)
            break; 
        } 
      } 
      if (bool1 && !bool4) {
        b1 = 0;
        while (b1 < b) {
          arrayOfInt[b1++] = arrayOfInt[b1++] * 5 * b1;
          if (str == null)
            break; 
        } 
      } 
      if (bool1 && bool4) {
        b1 = 0;
        while (b1 < b) {
          arrayOfInt[b1++] = arrayOfInt[b1++] * (int)Math.pow(5.0D, b1);
          if (str == null)
            break; 
        } 
      } 
      paramZg66.ZDO(IntStream.of(arrayOfInt).sum());
    } 
    paramZg66.ZvH(paramZg66.Zgj() * paramZg66.Zgl().size());
    return paramZg66.Zgj();
  }
  
  public static void ZF(Zg66 paramZg66) {
    paramZg66.ZDb(0);
    paramZg66.ZDW(-1);
  }
  
  public static void ZA(Zg66 paramZg66) throws Zs7w {
    try {
      if (paramZg66.Zyv() >= 1)
        try {
          if (paramZg66.ZgF() >= 1)
            return; 
          throw new Zs7w(b);
        } catch (Zs7w zs7w) {
          throw a(null);
        }  
    } catch (Zs7w zs7w) {
      throw a(null);
    } 
    throw new Zs7w(b);
  }
  
  public static void ZN(String paramString) {
    Zg = paramString;
  }
  
  public static String Zo() {
    return Zg;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zo : ()Ljava/lang/String;
    //   3: ifnonnull -> 11
    //   6: ldc 'vELzUc'
    //   8: invokestatic ZN : (Ljava/lang/String;)V
    //   11: bipush #32
    //   13: ldc 's%Oz/[?\\n*_,B6S( Jsf_?Gx!'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Ztpi.b : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #26
    //   94: goto -> 124
    //   97: bipush #107
    //   99: goto -> 124
    //   102: bipush #79
    //   104: goto -> 124
    //   107: bipush #14
    //   109: goto -> 124
    //   112: bipush #54
    //   114: goto -> 124
    //   117: bipush #102
    //   119: goto -> 124
    //   122: bipush #80
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztpi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
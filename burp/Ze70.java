package burp;

import java.util.Map;
import java.util.TreeMap;

public class Ze70 {
  private static Zbqc[] Zq;
  
  public static double Zk(int paramInt1, int paramInt2, int paramInt3) {
    double d = 1.0D;
    int i = paramInt3;
    Zbqc[] arrayOfZbqc = Zq();
    while (paramInt1 > 0) {
      if (paramInt1 - i > 1)
        d /= (paramInt1 - i); 
      if (paramInt1 - i > 0)
        d *= 1.0D - 1.0D / paramInt2; 
      if (paramInt3 > 0 && d > 1.0D) {
        d /= paramInt3;
        d /= paramInt2;
        paramInt3--;
      } 
      d *= paramInt1;
      paramInt1--;
      if (arrayOfZbqc != null)
        break; 
    } 
    while (paramInt3 > 0) {
      d /= paramInt3--;
      d /= paramInt2;
      if (arrayOfZbqc != null)
        break; 
    } 
    return d;
  }
  
  public static Map<Integer, Double> ZT(int paramInt1, int paramInt2) {
    int i = paramInt1 / paramInt2;
    int j = i + 1;
    double d = 0.0D;
    Zbqc[] arrayOfZbqc = Zq();
    TreeMap<Object, Object> treeMap = new TreeMap<>();
    do {
      if (i >= 0) {
        double d2 = Zk(paramInt1, paramInt2, i);
        d += d2;
        treeMap.put(Integer.valueOf(i), Double.valueOf(1.0D - d));
      } 
      if (d > 0.9999995D)
        break; 
      i--;
      double d1 = Zk(paramInt1, paramInt2, j);
      d += d1;
      treeMap.put(Integer.valueOf(j), Double.valueOf(1.0D - d));
      j++;
    } while (d <= 0.9999995D && j < paramInt1 && arrayOfZbqc == null);
    if (Zbqc.Zwu() == null)
      ZT(new Zbqc[3]); 
    return (Map)treeMap;
  }
  
  public static double Zv(double paramDouble) {
    // Byte code:
    //   0: invokestatic Zq : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: dload_0
    //   5: bipush #15
    //   7: invokestatic ZH : (DI)D
    //   10: dstore_3
    //   11: dload_3
    //   12: ldc2_w 0.5
    //   15: dcmpl
    //   16: ifle -> 31
    //   19: dconst_1
    //   20: dload_3
    //   21: dsub
    //   22: ldc2_w 2.0
    //   25: dmul
    //   26: dstore_3
    //   27: aload_2
    //   28: ifnull -> 37
    //   31: dload_3
    //   32: ldc2_w 2.0
    //   35: dmul
    //   36: dstore_3
    //   37: dload_3
    //   38: ldc2_w 1.0E-6
    //   41: dcmpg
    //   42: ifge -> 49
    //   45: ldc2_w 1.0E-6
    //   48: dstore_3
    //   49: dload_3
    //   50: dreturn
  }
  
  public static double ZH(double paramDouble, int paramInt) {
    double d2 = 0.0D;
    double d4 = 0.5723649429247001D;
    double d5 = 0.5641895835477563D;
    Zbqc[] arrayOfZbqc = Zq();
    if (paramDouble <= 0.0D || paramInt < 1)
      return 1.0D; 
    double d1 = 0.5D * paramDouble;
    boolean bool = (0 == (paramInt & 0x1)) ? true : false;
    if (paramInt > 1)
      d2 = Math.exp(-d1); 
    double d3 = bool ? d2 : (2.0D * Z_(-Math.sqrt(paramDouble)));
    if (paramInt > 2) {
      paramDouble = 0.5D * (paramInt - 1.0D);
      double d8 = bool ? 1.0D : 0.5D;
      if (d1 > 20.0D) {
        double d9 = bool ? 0.0D : d4;
        double d10 = Math.log(d1);
        while (d8 <= paramDouble) {
          d9 = Math.log(d8) + d9;
          d3 += Math.exp(d10 * d8 - d1 - d9);
          d8++;
          if (arrayOfZbqc != null)
            break; 
        } 
        return d3;
      } 
      double d6 = bool ? 1.0D : (d5 / Math.sqrt(d1));
      double d7 = 0.0D;
      while (d8 <= paramDouble) {
        d6 *= d1 / d8;
        d7 += d6;
        d8++;
        if (arrayOfZbqc != null)
          break; 
      } 
      return d7 * d2 + d3;
    } 
    return d3;
  }
  
  static double Z_(double paramDouble) {
    // Byte code:
    //   0: invokestatic Zq : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: ldc2_w 6.0
    //   7: dstore #9
    //   9: dload_0
    //   10: dconst_0
    //   11: dcmpl
    //   12: ifne -> 22
    //   15: dconst_0
    //   16: dstore #5
    //   18: aload_2
    //   19: ifnull -> 226
    //   22: ldc2_w 0.5
    //   25: dload_0
    //   26: invokestatic abs : (D)D
    //   29: dmul
    //   30: dstore_3
    //   31: dload_3
    //   32: dload #9
    //   34: ldc2_w 0.5
    //   37: dmul
    //   38: dcmpl
    //   39: iflt -> 49
    //   42: dconst_1
    //   43: dstore #5
    //   45: aload_2
    //   46: ifnull -> 226
    //   49: dload_3
    //   50: dconst_1
    //   51: dcmpg
    //   52: ifge -> 131
    //   55: dload_3
    //   56: dload_3
    //   57: dmul
    //   58: dstore #7
    //   60: ldc2_w 1.24818987E-4
    //   63: dload #7
    //   65: dmul
    //   66: ldc2_w 0.001075204047
    //   69: dsub
    //   70: dload #7
    //   72: dmul
    //   73: ldc2_w 0.005198775019
    //   76: dadd
    //   77: dload #7
    //   79: dmul
    //   80: ldc2_w 0.019198292004
    //   83: dsub
    //   84: dload #7
    //   86: dmul
    //   87: ldc2_w 0.059054035642
    //   90: dadd
    //   91: dload #7
    //   93: dmul
    //   94: ldc2_w 0.151968751364
    //   97: dsub
    //   98: dload #7
    //   100: dmul
    //   101: ldc2_w 0.319152932694
    //   104: dadd
    //   105: dload #7
    //   107: dmul
    //   108: ldc2_w 0.5319230073
    //   111: dsub
    //   112: dload #7
    //   114: dmul
    //   115: ldc2_w 0.797884560593
    //   118: dadd
    //   119: dload_3
    //   120: dmul
    //   121: ldc2_w 2.0
    //   124: dmul
    //   125: dstore #5
    //   127: aload_2
    //   128: ifnull -> 226
    //   131: dload_3
    //   132: ldc2_w 2.0
    //   135: dsub
    //   136: dstore_3
    //   137: ldc2_w -4.5255659E-5
    //   140: dload_3
    //   141: dmul
    //   142: ldc2_w 1.5252929E-4
    //   145: dadd
    //   146: dload_3
    //   147: dmul
    //   148: ldc2_w 1.9538132E-5
    //   151: dsub
    //   152: dload_3
    //   153: dmul
    //   154: ldc2_w 6.76904986E-4
    //   157: dsub
    //   158: dload_3
    //   159: dmul
    //   160: ldc2_w 0.001390604284
    //   163: dadd
    //   164: dload_3
    //   165: dmul
    //   166: ldc2_w 7.9462082E-4
    //   169: dsub
    //   170: dload_3
    //   171: dmul
    //   172: ldc2_w 0.002034254874
    //   175: dsub
    //   176: dload_3
    //   177: dmul
    //   178: ldc2_w 0.006549791214
    //   181: dadd
    //   182: dload_3
    //   183: dmul
    //   184: ldc2_w 0.010557625006
    //   187: dsub
    //   188: dload_3
    //   189: dmul
    //   190: ldc2_w 0.011630447319
    //   193: dadd
    //   194: dload_3
    //   195: dmul
    //   196: ldc2_w 0.009279453341
    //   199: dsub
    //   200: dload_3
    //   201: dmul
    //   202: ldc2_w 0.005353579108
    //   205: dadd
    //   206: dload_3
    //   207: dmul
    //   208: ldc2_w 0.002141268741
    //   211: dsub
    //   212: dload_3
    //   213: dmul
    //   214: ldc2_w 5.35310849E-4
    //   217: dadd
    //   218: dload_3
    //   219: dmul
    //   220: ldc2_w 0.999936657524
    //   223: dadd
    //   224: dstore #5
    //   226: dload_0
    //   227: dconst_0
    //   228: dcmpl
    //   229: ifle -> 243
    //   232: dload #5
    //   234: dconst_1
    //   235: dadd
    //   236: ldc2_w 0.5
    //   239: dmul
    //   240: goto -> 251
    //   243: dconst_1
    //   244: dload #5
    //   246: dsub
    //   247: ldc2_w 0.5
    //   250: dmul
    //   251: dreturn
  }
  
  public static void ZT(Zbqc[] paramArrayOfZbqc) {
    Zq = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zq() {
    return Zq;
  }
  
  static {
    if (Zq() != null)
      ZT(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze70.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
package burp;

import java.util.HashSet;
import java.util.Set;

public class Zxot {
  private static int ZC;
  
  public static Set<Zg52> Zv(Zstu paramZstu) {
    HashSet<Zg52> hashSet = new HashSet();
    int j = paramZstu.Zpu();
    byte b = 0;
    boolean bool = true;
    int i = ZV();
    while (b < j - 10) {
      byte b1 = paramZstu.Zp(b);
      if (bool && Character.isDigit(b1)) {
        byte b2 = b;
        if (Character.isDigit(paramZstu.Zp(++b2)) && Character.isDigit(paramZstu.Zp(++b2)) && ZH(paramZstu.Zp(++b2)) && Character.isDigit(paramZstu.Zp(++b2)) && Character.isDigit(paramZstu.Zp(++b2)) && ZH(paramZstu.Zp(++b2)) && Character.isDigit(paramZstu.Zp(++b2)) && Character.isDigit(paramZstu.Zp(++b2)) && Character.isDigit(paramZstu.Zp(++b2)) && Character.isDigit(paramZstu.Zp(++b2)) && (++b2 == j || !Character.isLetterOrDigit(paramZstu.Zp(b2))) && Zd(paramZstu, b)) {
          String str = Zruv.ZO(paramZstu, b, b2 - b);
          hashSet.add(new Zg52(str, b, b2));
        } 
        bool = false;
        b = b2;
        if (i == 0) {
          Zbqc.Zr(new Zbqc[3]);
        } else {
          continue;
        } 
      } 
      bool = !Character.isLetterOrDigit(b1) ? true : false;
      b++;
      continue;
      if (i == 0)
        break; 
    } 
    return hashSet;
  }
  
  private static boolean Zd(Zstu paramZstu, int paramInt) {
    if (ZY(paramZstu, paramInt))
      return false; 
    byte b = paramZstu.Zp(paramInt + 3);
    return (Zv(paramZstu, paramInt, b) || Zs(paramZstu, paramInt + 11, b)) ? false : ZV(paramZstu, paramInt);
  }
  
  private static boolean ZY(Zstu paramZstu, int paramInt) {
    return (paramZstu.Zp(paramInt + 3) != paramZstu.Zp(paramInt + 6));
  }
  
  private static boolean Zv(Zstu paramZstu, int paramInt, byte paramByte) {
    return (paramInt > 2 && paramZstu.Zp(paramInt - 1) == paramByte && Character.isDigit(paramZstu.Zp(paramInt - 2)));
  }
  
  private static boolean Zs(Zstu paramZstu, int paramInt, byte paramByte) {
    int i = paramZstu.Zpu();
    return (i > paramInt + 1) ? ((paramZstu.Zp(paramInt) == paramByte && Character.isDigit(paramZstu.Zp(paramInt + 1)))) : false;
  }
  
  private static boolean ZV(Zstu paramZstu, int paramInt) {
    int i = Integer.parseInt(Zruv.ZO(paramZstu, paramInt, 3));
    int j = Integer.parseInt(Zruv.ZO(paramZstu, paramInt + 4, 2));
    int k = Integer.parseInt(Zruv.ZO(paramZstu, paramInt + 7, 4));
    return (Zn(i) && Zh(j, k) && Zq(i, j, k));
  }
  
  private static boolean Zn(int paramInt) {
    return (paramInt > 0 && paramInt < 900 && paramInt != 666);
  }
  
  private static boolean Zh(int paramInt1, int paramInt2) {
    return (paramInt1 > 0 && paramInt2 > 0);
  }
  
  private static boolean Zq(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 != 78 || paramInt2 != 5 || paramInt3 != 1120);
  }
  
  private static boolean ZH(byte paramByte) {
    return (paramByte == 32 || paramByte == 45);
  }
  
  public static void ZY(int paramInt) {
    ZC = paramInt;
  }
  
  public static int ZM() {
    return ZC;
  }
  
  public static int ZV() {
    int i = ZM();
    return (i == 0) ? 55 : 0;
  }
  
  static {
    if (ZM() != 0)
      ZY(78); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxot.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
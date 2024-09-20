package burp;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Zgim {
  private final Set<int[]> ZE = (Set)new TreeSet<>((Comparator)ZV);
  
  private static final Comparator<int[]> ZV = new Zb02();
  
  private static int[] Zk;
  
  int[][] Zq() {
    return this.ZE.<int[]>toArray(new int[this.ZE.size()][]);
  }
  
  public void ZO(int paramInt1, int paramInt2) {
    this.ZE.add(new int[] { paramInt1, paramInt2 });
  }
  
  public void ZA(Ztu8 paramZtu8) {
    ZO(paramZtu8.ZlK(), paramZtu8.Zli());
  }
  
  public void ZS(Ztu8 paramZtu8, String paramString) {
    Zs5n zs5n = paramZtu8.ZlP().ZIm(paramString);
    ZQ(zs5n);
  }
  
  public void ZQ(Zs5n paramZs5n) {
    if (paramZs5n != null && Zsw8.ZS(paramZs5n.ZQG()))
      ZO(paramZs5n.ZQs(), paramZs5n.ZQc()); 
  }
  
  public void ZQ(Zs_n paramZs_n) {
    ZO(paramZs_n.ZJU(), paramZs_n.ZJj());
  }
  
  public void Zj(Ztu8 paramZtu8, String... paramVarArgs) {
    String[] arrayOfString = paramVarArgs;
    int i = arrayOfString.length;
    int[] arrayOfInt = ZP();
    byte b = 0;
    while (b < i) {
      String str = arrayOfString[b];
      Zs5n zs5n = paramZtu8.ZlP().ZIm(str);
      if (zs5n != null && Zsw8.ZS(zs5n.ZQG()))
        ZQ(zs5n); 
      b++;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  public static void Zu(int[] paramArrayOfint) {
    Zk = paramArrayOfint;
  }
  
  public static int[] ZP() {
    return Zk;
  }
  
  static {
    if (ZP() != null)
      Zu(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgim.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
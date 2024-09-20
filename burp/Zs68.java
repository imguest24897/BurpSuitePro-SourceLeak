package burp;

import java.util.Collections;
import java.util.List;

public class Zs68 {
  public final int Zs;
  
  public final List<String> ZP;
  
  public final List<Integer> ZR;
  
  public final int Zk;
  
  public final short Zb;
  
  public final String ZT;
  
  public final String Zf;
  
  public final Zk8m ZH;
  
  public final List<Ztu8> Zd;
  
  public final List<Zx8_> ZQ;
  
  public final List<Ztbr> ZN;
  
  public final Zzjh ZM;
  
  private static int Zc;
  
  private Zs68(int paramInt1, List<Integer> paramList, List<String> paramList1, int paramInt2, short paramShort, String paramString1, Zk8m paramZk8m, List<Ztu8> paramList2, List<Zx8_> paramList3, List<Ztbr> paramList4, Zzjh paramZzjh, String paramString2) {
    this.Zs = paramInt1;
    this.ZR = (paramList == null) ? null : Collections.<Integer>unmodifiableList(paramList);
    this.ZP = (paramList1 == null) ? null : Collections.<String>unmodifiableList(paramList1);
    this.Zk = paramInt2;
    this.Zb = paramShort;
    this.ZT = paramString1;
    this.ZH = paramZk8m;
    this.Zd = (paramList2 == null) ? null : Collections.<Ztu8>unmodifiableList(paramList2);
    this.ZQ = (paramList3 == null) ? null : Collections.<Zx8_>unmodifiableList(paramList3);
    this.ZN = (paramList4 == null) ? null : Collections.<Ztbr>unmodifiableList(paramList4);
    this.ZM = paramZzjh;
    this.Zf = paramString2;
  }
  
  public List<String> Zy() {
    return this.ZP;
  }
  
  public int Zd() {
    return this.Zk;
  }
  
  public int Zh() {
    return (this.Zk >= 2) ? (this.Zk - 2) : 0;
  }
  
  public static void Zc(int paramInt) {
    Zc = paramInt;
  }
  
  public static int Zx() {
    return Zc;
  }
  
  public static int Zn() {
    int i = Zx();
    return (i == 0) ? 89 : 0;
  }
  
  static {
    if (Zn() == 0)
      Zc(88); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs68.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
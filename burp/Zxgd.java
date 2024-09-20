package burp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Zxgd {
  private final Zg_n Zy;
  
  private final List<Zrec> ZA;
  
  private final Zsyi ZC;
  
  private static String[] ZT;
  
  private Zxgd(Zg_n paramZg_n, List<Zrec> paramList, Zsyi paramZsyi) {
    this.Zy = paramZg_n;
    this.ZA = paramList;
    this.ZC = paramZsyi;
  }
  
  public static Zxgd ZZ() {
    return new Zxgd((new Ztcd()).ZW(), Collections.emptyList(), Zsyi.ZF());
  }
  
  public static Zxgd Zu(Zrec paramZrec) {
    return new Zxgd((new Ztcd()).ZW(), Collections.singletonList(paramZrec), Zsyi.ZF());
  }
  
  public Zxgd ZY(Zrec paramZrec) {
    LinkedList<Zrec> linkedList = new LinkedList<>(this.ZA);
    linkedList.add(paramZrec);
    String[] arrayOfString = Zi();
    if (Zbqc.Zwu() == null)
      Zm(new String[1]); 
    return new Zxgd(this.Zy, linkedList, this.ZC);
  }
  
  public Zxgd Zp(UnaryOperator<Ztcd> paramUnaryOperator) {
    return new Zxgd(((Ztcd)paramUnaryOperator.apply(this.Zy.ZX())).ZW(), Collections.unmodifiableList(this.ZA), this.ZC);
  }
  
  public Zxgd Zz() {
    return ZT(Ze45.SUPPRESS_HTTP2);
  }
  
  public Zxgd ZV() {
    return new Zxgd(this.Zy, Collections.unmodifiableList(this.ZA), this.ZC.ZG(Zt9y.SUPPRESS_KEEP_ALIVE));
  }
  
  public Zxgd ZN() {
    return new Zxgd(this.Zy, Collections.unmodifiableList(this.ZA), this.ZC.ZG(Zt9y.SUPPRESS_KEEP_ALIVE_BUT_RETAIN_CONNECTION_HEADER));
  }
  
  public Zxgd ZT(Ze45 paramZe45) {
    return new Zxgd(this.Zy, Collections.unmodifiableList(this.ZA), this.ZC.ZK(paramZe45));
  }
  
  public Zxgd ZI(String paramString) {
    return Zg(paramString, true);
  }
  
  public Zxgd Zg(String paramString, boolean paramBoolean) {
    return new Zxgd(this.Zy, Collections.unmodifiableList(this.ZA), this.ZC.ZK(paramString, paramBoolean));
  }
  
  public Zxgd ZE(String paramString) {
    return Zg(paramString, false);
  }
  
  public Zefx Zo(Zefx paramZefx) {
    String[] arrayOfString = Zi();
    for (Zrec zrec : this.ZA) {
      paramZefx = zrec.Zv(paramZefx);
      if (arrayOfString == null) {
        Zbqc.Zr(new Zbqc[4]);
        break;
      } 
    } 
    for (Zrec zrec : this.ZC.ZC()) {
      paramZefx = zrec.Zv(paramZefx);
      if (arrayOfString == null)
        break; 
    } 
    return paramZefx;
  }
  
  public boolean Zh() {
    return this.ZC.Zd();
  }
  
  public Ze45 ZO() {
    return this.ZC.Zs();
  }
  
  public String ZF() {
    return this.ZC.Zg();
  }
  
  public boolean Zb() {
    return this.ZC.Zr();
  }
  
  public Zlgm Zl() {
    return this.Zy.ZK();
  }
  
  public boolean Zs() {
    return this.Zy.ZS();
  }
  
  public Zxgr ZI() {
    return this.Zy.ZC();
  }
  
  public Zi4 ZJ(Zxs7 paramZxs7, boolean paramBoolean) {
    return this.Zy.Zo(paramZxs7, paramBoolean);
  }
  
  public static void Zm(String[] paramArrayOfString) {
    ZT = paramArrayOfString;
  }
  
  public static String[] Zi() {
    return ZT;
  }
  
  static {
    if (Zi() == null)
      Zm(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxgd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
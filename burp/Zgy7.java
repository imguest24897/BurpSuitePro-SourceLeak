package burp;

import javax.swing.SortOrder;

public abstract class Zgy7 implements Zg4f {
  public String ZY;
  
  public String ZS;
  
  public boolean ZL;
  
  public int Zj;
  
  public SortOrder Zk;
  
  public Zlcu Zy;
  
  public boolean Zf;
  
  private static Zbqc[] Zl;
  
  public Zg4f Zm(String paramString) {
    this.ZY = paramString;
    return this;
  }
  
  public Zg4f ZU(String paramString) {
    this.ZS = paramString;
    return this;
  }
  
  public Zg4f ZZ(boolean paramBoolean) {
    this.ZL = paramBoolean;
    return this;
  }
  
  public Zg4f Zu(int paramInt) {
    this.Zj = paramInt;
    return this;
  }
  
  public Zg4f ZR(SortOrder paramSortOrder) {
    this.Zk = paramSortOrder;
    return this;
  }
  
  public Zg4f ZZ(Zlcu paramZlcu) {
    this.Zy = paramZlcu;
    return this;
  }
  
  public Zg4f ZH(boolean paramBoolean) {
    this.Zf = paramBoolean;
    return this;
  }
  
  public static void Zo(Zbqc[] paramArrayOfZbqc) {
    Zl = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZI() {
    return Zl;
  }
  
  static {
    if (ZI() == null)
      Zo(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgy7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
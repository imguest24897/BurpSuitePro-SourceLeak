package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zop;
import net.portswigger.Zqe;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Ztn2 extends Ztn0 {
  private final Zluw Zd;
  
  Ztn2(Ztzq paramZtzq) {
    this.Zd = new Zluw(paramZtzq);
    this.Zf = Zxrt.Za();
    this.ZV = Zxrt.ZI();
    this.Zc = Zxrt.ZT();
    this.Zu = false;
    this.ZZ = 0;
  }
  
  public void Zx(Zbws paramZbws) {
    super.Zx(paramZbws);
    paramZbws.setDefaultRenderer(Zqe.class, new Zm2a(this));
  }
  
  protected String ZQ(Object paramObject, int paramInt1, int paramInt2) {
    return (paramInt2 == 3) ? ((Zqe)paramObject).uiLabel : super.ZQ(paramObject, paramInt1, paramInt2);
  }
  
  public Class<?> getColumnClass(int paramInt) {
    return (paramInt == 3) ? Zqe.class : super.getColumnClass(paramInt);
  }
  
  public int getRowCount() {
    return this.Zd.ZC();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    Zeu1 zeu1 = this.Zd.ZT(paramInt1);
    switch (paramInt2) {
      case 0:
        return Boolean.valueOf(zeu1.ZP());
      case 1:
        return (zeu1.ZS()).displayName;
      case 2:
        return zeu1.ZN();
      case 3:
        return zeu1.Zd().<Zqe>map(Ztn2::lambda$getValueAt$0).orElse(Zqe.LOW);
    } 
    Zuh.Zv(false, Zqf.Zr, paramInt2);
    return "";
  }
  
  public Zeu1 ZU(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zd.ZC())
            try {
              return this.Zd.ZT(paramInt);
            } catch (Exception exception) {
              Zah.Zl(exception, Zk_.UNEXPECTED);
              return null;
            }  
          return null;
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    return null;
  }
  
  public int Zr(Zeu1 paramZeu1) {
    return this.Zd.ZL(paramZeu1);
  }
  
  public void Zc(String paramString) {
    this.Zd.Zn(paramString);
    fireTableDataChanged();
  }
  
  private static Zqe lambda$getValueAt$0(Zop paramZop) {
    return paramZop.ZZ;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztn2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
package burp;

public class Zgfl extends Zg85 {
  private Zln5 Zn = Zln5.ZE;
  
  private String Zm;
  
  private String Zd;
  
  public Zgfl() {
    setEditable(false);
    addMouseListener(new Zl45(this));
  }
  
  public void setEditable(boolean paramBoolean) {}
  
  public void ZO(String paramString1, String paramString2) {
    this.Zm = paramString1;
    this.Zd = paramString2;
  }
  
  public void Zv(Zln5 paramZln5) {
    this.Zn = paramZln5;
  }
  
  private void Zp() {
    Zr7f zr7f = new Zr7f(this, this.Zm, this.Zd, this.Zn);
    String str = zr7f.ZI();
    if (!getText().equals(str)) {
      setText(str);
      setCaretPosition(0);
      this.Zn.ZS(str);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgfl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
package burp;

import java.util.List;

class Zgx5<T> extends Zgxr<T> {
  private final Zln7<T> ZD;
  
  private final List<T> Z_;
  
  private Zgx5(Zln7<T> paramZln7, List<T> paramList) {
    this.ZD = paramZln7;
    this.Z_ = paramList;
  }
  
  public static <T> void ZP(Zln7<T> paramZln7, List<T> paramList) {
    paramZln7.Zb(new Zgx5<>(paramZln7, paramList));
  }
  
  public void ZH() {
    this.ZD.ZA(this);
    this.Z_.clear();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgx5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
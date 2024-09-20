package net.portswigger;

import java.util.Optional;

public class Zvu extends Zvj {
  public final Zl5 Zl;
  
  public Optional<Zif> ZK(Zl5 paramZl5) {
    return this.Zl.equals(paramZl5) ? Optional.<Zif>of(new Znz(this, paramZl5)) : Optional.<Zif>empty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zvu.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */
package net.portswigger;

import java.util.ArrayList;
import java.util.List;

public class Zuq {
  private final List<Zms> Zs = new ArrayList<>();
  
  private String Zp;
  
  private Zms Zb = (new Ztk()).Zk();
  
  private Zms Ze = (new Ztk()).Zk();
  
  private boolean Zx = true;
  
  public Zuq Zb(String paramString) {
    this.Zp = paramString;
    return this;
  }
  
  public Zuq Za(Zms paramZms) {
    this.Zb = paramZms;
    return this;
  }
  
  public Zuq ZT(Zms paramZms) {
    this.Ze = paramZms;
    return this;
  }
  
  public Zuq Zx(List<Zms> paramList) {
    this.Zs.addAll(paramList);
    return this;
  }
  
  public Zuq Zq(boolean paramBoolean) {
    this.Zx = paramBoolean;
    return this;
  }
  
  public Zlw Zu() {
    return new Zlw(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zuq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
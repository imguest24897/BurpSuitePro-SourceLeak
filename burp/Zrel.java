package burp;

public class Zrel implements Zxwj {
  private final Zz4b ZO;
  
  private final Object Zh = new Object();
  
  private int ZA;
  
  public Zrel(Zz4b paramZz4b) {
    this.ZO = paramZz4b;
    this.ZA = ZM(paramZz4b.ZV_());
  }
  
  public int ZL() {
    synchronized (this.Zh) {
      this.ZO.Zk(++this.ZA);
      return this.ZA;
    } 
  }
  
  private int ZM(Zefg<Zgna> paramZefg) {
    synchronized (paramZefg.Zz6()) {
      int i = paramZefg.stream().mapToInt(Zgna::ZPo).max().orElse(0);
      return Math.max(this.ZO.ZVw(), i);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrel.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
package burp;

class Zr85 implements Runnable {
  private final Zg72 Zn;
  
  private final Zmz6 Zk;
  
  private Zr85(Zg72 paramZg72, Zmz6 paramZmz6) {
    this.Zn = paramZg72;
    this.Zk = paramZmz6;
  }
  
  public void run() {
    Zgq<Zgpi> zgq = new Zgq<>();
    zgq.Zu((Zsqx)Zb08.ZT(this.Zn.ZaB(), this.Zn));
    this.Zk.ZB((Zgq)zgq);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr85.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
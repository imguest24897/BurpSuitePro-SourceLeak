package net.portswigger;

class Zse {
  private volatile int Zq = 0;
  
  private synchronized void Zv() {
    this.Zq++;
  }
  
  private synchronized void Ze() {
    this.Zq = 0;
  }
  
  private synchronized int Zp() {
    return this.Zq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zse.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
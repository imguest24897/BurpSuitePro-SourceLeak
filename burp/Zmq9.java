package burp;

class Zmq9 extends Zm23 {
  private Zmq9() {
    setHorizontalTextPosition(11);
    setIconTextGap(10);
  }
  
  protected void Zt(Object paramObject) {
    boolean bool = Zmue.Zm();
    if (paramObject instanceof Zzk1) {
      Zzk1 zzk1 = (Zzk1)paramObject;
      setText(zzk1.ZK);
      setIcon(zzk1.Za);
      if (!bool) {
        setText("");
        return;
      } 
      return;
    } 
    setText("");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmq9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
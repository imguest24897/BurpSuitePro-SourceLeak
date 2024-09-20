package burp;

class Zm26 extends Zm2l {
  private boolean ZK = true;
  
  public void Zz(boolean paramBoolean) {
    this.ZK = paramBoolean;
  }
  
  public void setEnabled(boolean paramBoolean) {
    if (paramBoolean && !this.ZK)
      return; 
    super.setEnabled(paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm26.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
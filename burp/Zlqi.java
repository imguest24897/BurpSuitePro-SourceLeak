package burp;

public class Zlqi {
  private final Zxop ZV;
  
  private final Ze60[] ZK;
  
  public Zlqi(Zxop paramZxop, Ze60... paramVarArgs) {
    this.ZV = paramZxop;
    this.ZK = paramVarArgs;
  }
  
  public void Zp(byte paramByte) {
    int[] arrayOfInt = Zk8m.ZO();
    if (!this.ZV.Zf() && (Character.isLetter(paramByte) || paramByte == 42)) {
      Ze60[] arrayOfZe60 = this.ZK;
      int i = arrayOfZe60.length;
      byte b = 0;
      while (b < i) {
        Ze60 ze60 = arrayOfZe60[b];
        ze60.ZO();
        b++;
        if (arrayOfInt == null)
          break; 
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlqi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
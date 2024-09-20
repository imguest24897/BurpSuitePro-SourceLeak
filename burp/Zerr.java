package burp;

import java.util.Arrays;
import java.util.List;

public class Zerr {
  private Zroa Zw;
  
  private List<Zvow> Zf;
  
  private Zerr(Zroa paramZroa, List<Zvow> paramList) {
    this.Zw = paramZroa;
    this.Zf = paramList;
  }
  
  public static Zerr Zw(Zroa paramZroa, Zvow... paramVarArgs) {
    return new Zerr(paramZroa, Arrays.asList(paramVarArgs));
  }
  
  public Zra_ ZJ() {
    return Zriz.ZG(Ztz3.REQUEST_SMUGGLING_OBSERVED_BEHAVIOUR, String.valueOf(this.Zw.Ze));
  }
  
  public byte ZP() {
    return this.Zw.confidence;
  }
  
  public byte Zt() {
    return this.Zw.severity;
  }
  
  boolean Zy(byte paramByte) {
    return (ZP() >= paramByte);
  }
  
  boolean ZX(byte paramByte) {
    return (Zt() >= paramByte);
  }
  
  public List<Zvow> ZL() {
    return this.Zf;
  }
  
  void ZP(Zroa paramZroa, Zvow... paramVarArgs) {
    this.Zw = paramZroa;
    this.Zf = Arrays.asList(paramVarArgs);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zerr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
package net.portswigger;

import java.util.List;
import java.util.Objects;

@Zsi(value = "ConnectionCheckProgress", ZD = true)
public class Zgj extends Zgx {
  @Zvd(Zp = "connectionCheckResults")
  public final List<Ztq> ZY;
  
  @Zvd(Zp = "recordedSequenceFrames")
  public final List<Zdu> Zk;
  
  @Zvd(Zp = "recordedSequenceResults")
  public final List<Zfx> Zj;
  
  @Zox
  public Zgj(@Zc5(Ze = "taskId") String paramString1, @Zc5(Ze = "scanStatus") Zdc paramZdc, @Zc5(Ze = "message") String paramString2, @Zc5(Ze = "errorCode", ZS = "null") Integer paramInteger, @Zc5(Ze = "connectionCheckResults", ZS = "null") List<Ztq> paramList, @Zc5(Ze = "recordedSequenceFrames", ZS = "null") List<Zdu> paramList1, @Zc5(Ze = "recordedSequenceResults", ZS = "null") List<Zfx> paramList2) {
    super(paramString1, paramZdc, paramString2, paramInteger);
    this.ZY = paramList;
    this.Zk = paramList1;
    this.Zj = paramList2;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    if (!super.equals(paramObject))
      return false; 
    Zgj zgj = (Zgj)paramObject;
    return (Objects.equals(this.ZY, zgj.ZY) && Objects.equals(this.Zk, zgj.Zk) && Objects.equals(this.Zj, zgj.Zj));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.ZY, this.Zk, this.Zj });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zgj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
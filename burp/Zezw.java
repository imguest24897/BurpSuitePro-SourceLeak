package burp;

import java.awt.event.InputEvent;
import java.util.List;

public interface Zezw {
  InputEvent ZZ();
  
  Zeew ZQ();
  
  Zrpb ZR();
  
  int[] ZD();
  
  IHttpRequestResponse[] Zs();
  
  IScanIssue[] ZF();
  
  List<Zlv8> Zy();
  
  default boolean Zc() {
    IScanIssue[] arrayOfIScanIssue = ZF();
    return (arrayOfIScanIssue != null && arrayOfIScanIssue.length > 0);
  }
  
  default boolean ZC() {
    List<Zlv8> list = Zy();
    return (list != null && !list.isEmpty());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zezw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
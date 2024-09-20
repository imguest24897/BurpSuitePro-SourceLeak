package burp;

public class Zmqp extends Zmqz {
  public void Zt(Object paramObject) {
    boolean bool = Zm23.Zt();
    if (paramObject instanceof Number) {
      Number number = (Number)paramObject;
      if (number.longValue() == 0L) {
        setText("");
        if (bool) {
          super.Zt(paramObject);
          return;
        } 
        return;
      } 
    } 
    super.Zt(paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmqp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
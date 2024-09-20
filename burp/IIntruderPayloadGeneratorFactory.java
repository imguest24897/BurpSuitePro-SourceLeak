package burp;

public interface IIntruderPayloadGeneratorFactory {
  String getGeneratorName();
  
  IIntruderPayloadGenerator createNewInstance(IIntruderAttack paramIIntruderAttack);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IIntruderPayloadGeneratorFactory.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
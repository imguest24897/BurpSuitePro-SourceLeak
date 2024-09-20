package burp;

public interface ITempFile {
  byte[] getBuffer();
  
  @Deprecated
  void delete();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\ITempFile.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
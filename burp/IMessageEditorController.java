package burp;

public interface IMessageEditorController {
  IHttpService getHttpService();
  
  byte[] getRequest();
  
  byte[] getResponse();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IMessageEditorController.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
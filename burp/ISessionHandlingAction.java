package burp;

public interface ISessionHandlingAction {
  String getActionName();
  
  void performAction(IHttpRequestResponse paramIHttpRequestResponse, IHttpRequestResponse[] paramArrayOfIHttpRequestResponse);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\ISessionHandlingAction.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
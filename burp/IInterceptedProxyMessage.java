package burp;

import java.net.InetAddress;

public interface IInterceptedProxyMessage {
  public static final int ACTION_FOLLOW_RULES = 0;
  
  public static final int ACTION_DO_INTERCEPT = 1;
  
  public static final int ACTION_DONT_INTERCEPT = 2;
  
  public static final int ACTION_DROP = 3;
  
  public static final int ACTION_FOLLOW_RULES_AND_REHOOK = 16;
  
  public static final int ACTION_DO_INTERCEPT_AND_REHOOK = 17;
  
  public static final int ACTION_DONT_INTERCEPT_AND_REHOOK = 18;
  
  int getMessageReference();
  
  IHttpRequestResponse getMessageInfo();
  
  int getInterceptAction();
  
  void setInterceptAction(int paramInt);
  
  String getListenerInterface();
  
  InetAddress getClientIpAddress();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IInterceptedProxyMessage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
package burp;

import java.awt.event.InputEvent;

public interface IContextMenuInvocation {
  public static final byte CONTEXT_MESSAGE_EDITOR_REQUEST = 0;
  
  public static final byte CONTEXT_MESSAGE_EDITOR_RESPONSE = 1;
  
  public static final byte CONTEXT_MESSAGE_VIEWER_REQUEST = 2;
  
  public static final byte CONTEXT_MESSAGE_VIEWER_RESPONSE = 3;
  
  public static final byte CONTEXT_TARGET_SITE_MAP_TREE = 4;
  
  public static final byte CONTEXT_TARGET_SITE_MAP_TABLE = 5;
  
  public static final byte CONTEXT_PROXY_HISTORY = 6;
  
  public static final byte CONTEXT_SCANNER_RESULTS = 7;
  
  public static final byte CONTEXT_INTRUDER_PAYLOAD_POSITIONS = 8;
  
  public static final byte CONTEXT_INTRUDER_ATTACK_RESULTS = 9;
  
  public static final byte CONTEXT_SEARCH_RESULTS = 10;
  
  InputEvent getInputEvent();
  
  int getToolFlag();
  
  byte getInvocationContext();
  
  int[] getSelectionBounds();
  
  IHttpRequestResponse[] getSelectedMessages();
  
  IScanIssue[] getSelectedIssues();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IContextMenuInvocation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */
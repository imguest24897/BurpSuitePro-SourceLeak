package com.install4j.runtime.installer.helper.console;

import com.install4j.api.context.UserCanceledException;

public interface ConsoleAccess {
  void print(String paramString);
  
  void println(String paramString);
  
  void println();
  
  void flush();
  
  String readLine(String paramString) throws UserCanceledException;
  
  String readPassword(String paramString) throws UserCanceledException;
  
  void cancel();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\console\ConsoleAccess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package com.install4j.api.actions;

import com.install4j.api.context.InstallerContext;
import com.install4j.api.context.UserCanceledException;

public interface InstallAction extends Action {
  boolean install(InstallerContext paramInstallerContext) throws UserCanceledException;
  
  void rollback(InstallerContext paramInstallerContext);
  
  boolean isRollbackSupported();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\actions\InstallAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
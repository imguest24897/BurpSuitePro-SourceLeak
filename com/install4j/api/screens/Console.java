package com.install4j.api.screens;

import com.install4j.api.context.ProgressInterface;
import com.install4j.api.context.UserCanceledException;
import org.jetbrains.annotations.Nls;

public interface Console extends ProgressInterface {
  void print(Object paramObject);
  
  void println(Object paramObject);
  
  void println();
  
  void more(@Nls String paramString) throws UserCanceledException;
  
  String readLine() throws UserCanceledException;
  
  boolean askYesNo(@Nls String paramString) throws UserCanceledException;
  
  boolean askYesNo(@Nls String paramString, boolean paramBoolean) throws UserCanceledException;
  
  boolean askOkCancel(@Nls String paramString) throws UserCanceledException;
  
  boolean askOkCancel(@Nls String paramString, boolean paramBoolean) throws UserCanceledException;
  
  int askOption(@Nls String paramString, @Nls String[] paramArrayOfString1, String[] paramArrayOfString2) throws UserCanceledException;
  
  int askOption(@Nls String paramString, @Nls String[] paramArrayOfString1, String[] paramArrayOfString2, int paramInt) throws UserCanceledException;
  
  int askOption(@Nls String paramString, @Nls String[] paramArrayOfString1, String[] paramArrayOfString2, int paramInt, boolean paramBoolean1, boolean paramBoolean2) throws UserCanceledException;
  
  int askOption(@Nls String paramString, @Nls String[] paramArrayOfString1, String[] paramArrayOfString2, @Nls String[] paramArrayOfString3, int paramInt, boolean paramBoolean1, boolean paramBoolean2) throws UserCanceledException;
  
  int[] askMultipleSelection(@Nls String paramString, @Nls String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfint, boolean paramBoolean) throws UserCanceledException;
  
  String askString(@Nls String paramString1, String paramString2) throws UserCanceledException;
  
  String askPassword(@Nls String paramString1, String paramString2) throws UserCanceledException;
  
  void waitForEnter() throws UserCanceledException;
  
  void printHeader(@Nls String paramString) throws UserCanceledException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\screens\Console.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
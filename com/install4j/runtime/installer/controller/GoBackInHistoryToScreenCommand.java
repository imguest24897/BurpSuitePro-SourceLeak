/*    */ package com.install4j.runtime.installer.controller;
/*    */ 
/*    */ import com.install4j.api.screens.Screen;
/*    */ 
/*    */ public class GoBackInHistoryToScreenCommand
/*    */   extends ControllerCommand {
/*    */   private Screen screen;
/*    */   
/*    */   public GoBackInHistoryToScreenCommand(Screen screen) {
/* 10 */     super("go back in history to " + screen.toString());
/* 11 */     this.screen = screen;
/*    */   }
/*    */   
/*    */   public Screen getScreen() {
/* 15 */     return this.screen;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\GoBackInHistoryToScreenCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
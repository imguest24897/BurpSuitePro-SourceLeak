/*    */ package com.exe4j.runtime.splash;
/*    */ 
/*    */ import com.exe4j.runtime.LauncherEngine;
/*    */ import com.exe4j.runtime.util.ArgumentStack;
/*    */ import java.util.StringTokenizer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TextLineConfig
/*    */ {
/*    */   private String text;
/*    */   private int fontSize;
/*    */   private int fontWeight;
/*    */   private int fontColorR;
/*    */   private int fontColorG;
/*    */   private int fontColorB;
/*    */   private int positionX;
/*    */   private int positionY;
/*    */   
/*    */   TextLineConfig(ArgumentStack argStack) {
/* 24 */     this.text = argStack.popString();
/* 25 */     this.positionX = argStack.popInt();
/* 26 */     this.positionY = argStack.popInt();
/* 27 */     argStack.popString();
/*    */     
/* 29 */     parseColor(argStack.popString());
/*    */     
/* 31 */     this.fontSize = argStack.popInt();
/* 32 */     this.fontWeight = argStack.popInt();
/*    */   }
/*    */   
/*    */   public TextLineConfig(int base) {
/* 36 */     this.text = LauncherEngine.getProperty(base + 2);
/* 37 */     this.positionX = LauncherEngine.getIntProperty(base + 0);
/* 38 */     this.positionY = LauncherEngine.getIntProperty(base + 1);
/*    */     
/* 40 */     parseColor(LauncherEngine.getProperty(base + 5));
/*    */     
/* 42 */     this.fontSize = LauncherEngine.getIntProperty(base + 4);
/* 43 */     this.fontWeight = LauncherEngine.getIntProperty(base + 6);
/*    */   }
/*    */   
/*    */   public TextLineConfig(String text, int positionX, int positionY, String color, int fontSize, int fontWeight) {
/* 47 */     this.text = text;
/* 48 */     this.positionX = positionX;
/* 49 */     this.positionY = positionY;
/* 50 */     parseColor(color);
/* 51 */     this.fontSize = fontSize;
/* 52 */     this.fontWeight = fontWeight;
/*    */   }
/*    */   
/*    */   public int getFontColorR() {
/* 56 */     return this.fontColorR;
/*    */   }
/*    */   
/*    */   public int getFontColorG() {
/* 60 */     return this.fontColorG;
/*    */   }
/*    */   
/*    */   public int getFontColorB() {
/* 64 */     return this.fontColorB;
/*    */   }
/*    */   
/*    */   public int getFontSize() {
/* 68 */     return this.fontSize;
/*    */   }
/*    */   
/*    */   public int getFontWeight() {
/* 72 */     return this.fontWeight;
/*    */   }
/*    */   
/*    */   public String getText() {
/* 76 */     return this.text;
/*    */   }
/*    */   
/*    */   public int getPositionX() {
/* 80 */     return this.positionX;
/*    */   }
/*    */   
/*    */   public int getPositionY() {
/* 84 */     return this.positionY;
/*    */   }
/*    */   
/*    */   private void parseColor(String color) {
/* 88 */     if (color != null) {
/* 89 */       StringTokenizer colorTokenizer = new StringTokenizer(color, ",");
/* 90 */       this.fontColorR = Integer.parseInt(colorTokenizer.nextToken());
/* 91 */       this.fontColorG = Integer.parseInt(colorTokenizer.nextToken());
/* 92 */       this.fontColorB = Integer.parseInt(colorTokenizer.nextToken());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtime\splash\TextLineConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
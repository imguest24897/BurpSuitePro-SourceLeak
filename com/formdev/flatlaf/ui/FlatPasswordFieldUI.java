/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.FlatClientProperties;
/*     */ import com.formdev.flatlaf.icons.FlatCapsLockIcon;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.util.Map;
/*     */ import javax.swing.Action;
/*     */ import javax.swing.ActionMap;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JToggleButton;
/*     */ import javax.swing.LookAndFeel;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.text.Element;
/*     */ import javax.swing.text.JTextComponent;
/*     */ import javax.swing.text.PasswordView;
/*     */ import javax.swing.text.View;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlatPasswordFieldUI
/*     */   extends FlatTextFieldUI
/*     */ {
/*     */   private static final String KEY_REVEAL_SELECTED = "FlatLaf.internal.FlatPasswordFieldUI.revealSelected";
/*     */   private Character echoChar;
/*     */   @Styleable
/*     */   protected boolean showCapsLock;
/*     */   @Styleable
/*     */   protected boolean showRevealButton;
/*     */   protected Icon capsLockIcon;
/*     */   protected Icon revealIcon;
/*     */   private KeyListener capsLockListener;
/*     */   private boolean capsLockIconShared = true;
/*     */   private JToggleButton revealButton;
/*     */   private boolean uninstallEchoChar;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/* 104 */     return new FlatPasswordFieldUI();
/*     */   }
/*     */ 
/*     */   
/*     */   protected String getPropertyPrefix() {
/* 109 */     return "PasswordField";
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/* 114 */     super.installUI(c);
/*     */     
/* 116 */     installRevealButton();
/*     */   }
/*     */ 
/*     */   
/*     */   public void uninstallUI(JComponent c) {
/* 121 */     uninstallRevealButton();
/*     */     
/* 123 */     super.uninstallUI(c);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installDefaults() {
/* 128 */     super.installDefaults();
/*     */     
/* 130 */     String prefix = getPropertyPrefix();
/* 131 */     this.echoChar = (Character)UIManager.get(prefix + ".echoChar");
/* 132 */     if (this.echoChar != null) {
/* 133 */       LookAndFeel.installProperty(getComponent(), "echoChar", this.echoChar);
/*     */     }
/* 135 */     this.showCapsLock = UIManager.getBoolean("PasswordField.showCapsLock");
/* 136 */     this.showRevealButton = UIManager.getBoolean("PasswordField.showRevealButton");
/* 137 */     this.capsLockIcon = UIManager.getIcon("PasswordField.capsLockIcon");
/* 138 */     this.revealIcon = UIManager.getIcon("PasswordField.revealIcon");
/* 139 */     this.capsLockIconShared = true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallDefaults() {
/* 144 */     super.uninstallDefaults();
/*     */     
/* 146 */     this.capsLockIcon = null;
/* 147 */     this.revealIcon = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installListeners() {
/* 152 */     super.installListeners();
/*     */ 
/*     */     
/* 155 */     this.capsLockListener = new KeyAdapter()
/*     */       {
/*     */         public void keyPressed(KeyEvent e) {
/* 158 */           repaint(e);
/*     */         }
/*     */         
/*     */         public void keyReleased(KeyEvent e) {
/* 162 */           repaint(e);
/*     */         }
/*     */         private void repaint(KeyEvent e) {
/* 165 */           if (e.getKeyCode() == 20) {
/* 166 */             e.getComponent().repaint();
/* 167 */             FlatPasswordFieldUI.this.scrollCaretToVisible();
/*     */           } 
/*     */         }
/*     */       };
/*     */     
/* 172 */     getComponent().addKeyListener(this.capsLockListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallListeners() {
/* 177 */     super.uninstallListeners();
/*     */     
/* 179 */     getComponent().removeKeyListener(this.capsLockListener);
/* 180 */     this.capsLockListener = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installKeyboardActions() {
/* 185 */     super.installKeyboardActions();
/*     */ 
/*     */     
/* 188 */     ActionMap map = SwingUtilities.getUIActionMap(getComponent());
/* 189 */     if (map != null && map.get("select-word") != null) {
/* 190 */       Action selectLineAction = map.get("select-line");
/* 191 */       if (selectLineAction != null) {
/* 192 */         map.put("select-word", selectLineAction);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   String getStyleType() {
/* 199 */     return "PasswordField";
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyStyle(Object style) {
/* 204 */     boolean oldShowRevealButton = this.showRevealButton;
/*     */     
/* 206 */     super.applyStyle(style);
/*     */     
/* 208 */     if (this.showRevealButton != oldShowRevealButton) {
/* 209 */       uninstallRevealButton();
/* 210 */       installRevealButton();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected Object applyStyleProperty(String key, Object value) {
/* 217 */     if (key.equals("capsLockIconColor") && this.capsLockIcon instanceof FlatCapsLockIcon) {
/* 218 */       if (this.capsLockIconShared) {
/* 219 */         this.capsLockIcon = FlatStylingSupport.cloneIcon(this.capsLockIcon);
/* 220 */         this.capsLockIconShared = false;
/*     */       } 
/* 222 */       return ((FlatCapsLockIcon)this.capsLockIcon).applyStyleProperty(key, value);
/*     */     } 
/*     */     
/* 225 */     return super.applyStyleProperty(key, value);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 231 */     Map<String, Class<?>> infos = super.getStyleableInfos(c);
/* 232 */     infos.put("capsLockIconColor", Color.class);
/* 233 */     return infos;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getStyleableValue(JComponent c, String key) {
/* 238 */     if (key.equals("capsLockIconColor") && this.capsLockIcon instanceof FlatCapsLockIcon) {
/* 239 */       return ((FlatCapsLockIcon)this.capsLockIcon).getStyleableValue(key);
/*     */     }
/* 241 */     return super.getStyleableValue(c, key);
/*     */   }
/*     */ 
/*     */   
/*     */   public View create(Element elem) {
/* 246 */     return new PasswordView(elem);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void paintIcons(Graphics g, Rectangle r) {
/* 252 */     super.paintIcons(g, r);
/*     */     
/* 254 */     if (isCapsLockVisible()) {
/* 255 */       paintCapsLock(g, r);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void paintCapsLock(Graphics g, Rectangle r) {
/* 260 */     JTextComponent c = getComponent();
/*     */ 
/*     */     
/* 263 */     int x = c.getComponentOrientation().isLeftToRight() ? (r.x + r.width - this.capsLockIcon.getIconWidth()) : r.x;
/* 264 */     int y = r.y + Math.round((r.height - this.capsLockIcon.getIconHeight()) / 2.0F);
/* 265 */     this.capsLockIcon.paintIcon(c, g, x, y);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean hasTrailingIcon() {
/* 271 */     return (super.hasTrailingIcon() || isCapsLockVisible());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected int getTrailingIconWidth() {
/* 277 */     return super.getTrailingIconWidth() + (
/* 278 */       isCapsLockVisible() ? (this.capsLockIcon.getIconWidth() + UIScale.scale(this.iconTextGap)) : 0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean isCapsLockVisible() {
/* 283 */     if (!this.showCapsLock) {
/* 284 */       return false;
/*     */     }
/* 286 */     return (FlatUIUtils.isPermanentFocusOwner(getComponent()) && 
/* 287 */       Toolkit.getDefaultToolkit().getLockingKeyState(20));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installRevealButton() {
/* 292 */     if (this.showRevealButton) {
/* 293 */       this.revealButton = createRevealButton();
/* 294 */       updateRevealButton();
/* 295 */       installLayout();
/* 296 */       getComponent().add(this.revealButton);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected JToggleButton createRevealButton() {
/* 302 */     JPasswordField c = (JPasswordField)getComponent();
/* 303 */     JToggleButton button = new JToggleButton(this.revealIcon, !c.echoCharIsSet());
/* 304 */     button.setName("PasswordField.revealButton");
/* 305 */     prepareLeadingOrTrailingComponent(button);
/* 306 */     button.putClientProperty("FlatLaf.styleClass", "inTextField revealButton");
/* 307 */     if (FlatClientProperties.clientPropertyBoolean(c, "FlatLaf.internal.FlatPasswordFieldUI.revealSelected", false)) {
/* 308 */       button.setSelected(true);
/* 309 */       updateEchoChar(true);
/*     */     } 
/* 311 */     button.addActionListener(e -> {
/*     */           boolean selected = button.isSelected();
/*     */           updateEchoChar(selected);
/*     */           c.putClientProperty("FlatLaf.internal.FlatPasswordFieldUI.revealSelected", Boolean.valueOf(selected));
/*     */         });
/* 316 */     return button;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void updateRevealButton() {
/* 321 */     if (this.revealButton == null) {
/*     */       return;
/*     */     }
/* 324 */     JTextComponent c = getComponent();
/* 325 */     boolean visible = c.isEnabled();
/* 326 */     if (visible != this.revealButton.isVisible()) {
/* 327 */       this.revealButton.setVisible(visible);
/* 328 */       c.revalidate();
/* 329 */       c.repaint();
/*     */       
/* 331 */       if (!visible) {
/* 332 */         this.revealButton.setSelected(false);
/* 333 */         updateEchoChar(false);
/* 334 */         getComponent().putClientProperty("FlatLaf.internal.FlatPasswordFieldUI.revealSelected", (Object)null);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void propertyChange(PropertyChangeEvent e) {
/* 341 */     super.propertyChange(e);
/*     */     
/* 343 */     switch (e.getPropertyName()) {
/*     */       case "enabled":
/* 345 */         updateRevealButton();
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void updateEchoChar(boolean selected) {
/* 353 */     char newEchoChar = selected ? Character.MIN_VALUE : ((this.echoChar != null) ? this.echoChar.charValue() : '*');
/*     */     
/* 355 */     JPasswordField c = (JPasswordField)getComponent();
/* 356 */     if (newEchoChar == c.getEchoChar()) {
/*     */       return;
/*     */     }
/*     */     
/* 360 */     LookAndFeel.installProperty(c, "echoChar", Character.valueOf(newEchoChar));
/*     */ 
/*     */ 
/*     */     
/* 364 */     char actualEchoChar = c.getEchoChar();
/* 365 */     if (actualEchoChar != newEchoChar) {
/* 366 */       if (selected && actualEchoChar != '\000') {
/*     */         
/* 368 */         this.echoChar = Character.valueOf(actualEchoChar);
/* 369 */         this.uninstallEchoChar = true;
/*     */       } 
/*     */       
/* 372 */       c.setEchoChar(newEchoChar);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallRevealButton() {
/* 378 */     if (this.revealButton != null) {
/* 379 */       if (this.uninstallEchoChar && this.revealButton.isSelected()) {
/* 380 */         ((JPasswordField)getComponent()).setEchoChar(this.echoChar.charValue());
/*     */       }
/* 382 */       getComponent().remove(this.revealButton);
/* 383 */       this.revealButton = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected JComponent[] getTrailingComponents() {
/* 389 */     return new JComponent[] { this.trailingComponent, this.revealButton, this.clearButton };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatPasswordFieldUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
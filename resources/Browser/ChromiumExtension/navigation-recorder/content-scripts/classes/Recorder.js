class Recorder {
    recordingDelay = 0;
    maxDelay = 10000;
    tabId = -1;
    frameId = -1;
    lastElement = null;
    lastEvent = null;
    lastEventTime = null;
    #events = [];
    #started = false;
    start(frameId, tabId, delay) {
      console.log("Recorder has started");
      this.#started = true;
      this.recordingDelay = delay;
      document.body.style.border='8px solid red';    
      this.addListeners();
      this.frameId = frameId;
      this.tabId = tabId;
      if(top !== self) {
          this.sendFrameId();
      } else {
          this.addMessageListener();
      }
    }
    isStarted() {
      return this.#started;
    }
    useDefaultStyles(element) {
        element.style.all = 'unset';
        if(element instanceof HTMLHeadingElement && element.tagName === 'H1') {
            element.style.display = 'block';
            element.style.fontSize = "2em";
            element.style.marginTop = "0.67em";
            element.style.marginBottom = "0.67em";
            element.style.marginLeft = "0";
            element.style.marginRight = "0";
            element.fontWeight = "bold";
        } else if(element instanceof HTMLParagraphElement) {
            element.style.display = 'block';
            element.style.marginTop = "1em";
            element.style.marginBottom = "1em";
            element.style.marginLeft = "0";
            element.style.marginRight = "0";
        } else if(element instanceof HTMLUListElement) {
            element.style.display = "block";
            element.style.listStyleType = "disc";
            element.style.marginTop = "1em";
            element.style.marginBottom = "1em";
            element.style.marginLeft = "0";
            element.style.marginRight = "0";
            element.style.paddingLeft = "40px";
        } else if(element instanceof HTMLLIElement) {
            element.style.display = "list-item";
        }
        return element;
    }
    showWarningMessage() {
        let container = document.createElement('div');
        container.style.all = 'unset';
        container.style.display = 'flex';
        container.style.alignItems = 'center';
        container.style.justifyContent = 'center';
        container.style.zIndex = "9999999";
        container.style.position = 'fixed';
        container.style.width = '100%';
        container.style.height = '100%';
        container.style.left = "0";
        container.style.top = "0";
        let div = document.createElement('div');
        div.style.all = 'unset';
        div.style.backgroundColor = '#f8d7da';
        div.style.color = '#721c24';
        div.style.border = '1px solid #f5c6cb';
        div.style.width = '500px';
        div.style.height = '350px';
        div.style.borderRadius = '12px';
        div.style.padding = '10px';
        div.style.fontFamily = 'Arial';
        let heading = document.createElement('h1');
        heading = this.useDefaultStyles(heading);
        heading.textContent = 'Warning';
        div.append(heading);
        let p = document.createElement('p');
        p = this.useDefaultStyles(p);
        p.textContent = "This recording will not work in Burp, as the application uses platform authentication.";
        div.append(p);
        let p2 = document.createElement('p');
        p2 = this.useDefaultStyles(p2);
        p2.textContent = "To configure platform authentication credentials, you need to manually add the username and password in Burp:";
        div.append(p2);
        let ul = this.useDefaultStyles(document.createElement("ul"));
        let li = this.useDefaultStyles(document.createElement("li"));
        li.innerHTML = 'In Burp Suite Professional, do this in the <b>Settings</b> dialog, under <b>Connections &gt; Platform authentication</b>. For more information, see <a href="https://portswigger.net/burp/documentation/desktop/settings/network/connections#platform-authentication" style="all:revert;color:black">Connections - Platform authentication</a>.';
        let li2 = this.useDefaultStyles(document.createElement("li"));
        li2.innerHTML = 'In Burp Suite Enterprise Edition, do this in the <b>Scan settings</b> for your site or folder, under <b>Authentication &gt; Platform authentication</b>. For more information, see <a href="https://portswigger.net/burp/documentation/enterprise/working-with-sites/site-settings/configure-authentication/platform-authentication.html" style="all:revert;color:black">Configuring platform authentication</a>.';
        ul.append(li);
        ul.append(li2);
        div.append(ul);
        container.append(div);
        document.body.append(container);
    }
    sendFrameId() {
        top.postMessage({frameId: this.frameId, messageType: "Burp Suite Navigation Recorder frameId"}, '*');
    }
    getAllAttributesForNode(node) {
        let attributes = {};
        for(let i=0;i<node.attributes.length;i++){
            attributes[node.attributes[i].nodeName] = node.attributes[i].nodeValue;
        }
        return attributes;
    }
    getAllDataAttributesForNode(node) {
        return JSON.stringify(node.dataset);
    }
    addMessageListener() {
        let that = this;
        window.addEventListener('message', function(e){
            let data = e.data;
            if(typeof data === 'object' && e.data.messageType === 'Burp Suite Navigation Recorder frameId') {
                let iframes = document.querySelectorAll('iframe');
                for(let iframe of iframes) {
                    if(iframe.contentWindow === e.source) {
                        chrome.runtime.sendMessage({messageType:'collectIframeInfo', frameId: e.data.frameId, iframeInfo: {
                                xPath: that.getXPath(iframe),
                                tagNodeIndex: that.getTagIndex(iframe),
                                attributes: that.getAllAttributesForNode(iframe),
                                dataAttributes: that.getAllDataAttributesForNode(iframe),
                                iframeIndex: that.getIframeIndex(iframe)
                            }
                        });
                        break;
                    }
                }
            } else if(typeof data === 'object' && e.data.messageType === 'Burp Suite Navigation Recorder collect') {
                that.collectEvents();
            }
        })
    }
    isPasteEvent(e) {
      return e.key === 'v' && (e.ctrlKey || e.metaKey);
    }
    collectEvents(config) {
      if(this.#events.length) {
        if(config && config.triggersNavigation) {
          this.#events[this.#events.length-1].triggersNavigation = true;
        }
        if(config && config.opensNewContext) {
          this.#events[this.#events.length-1].opensNewContext = true;
        }
        if(config && config.createdTab) {
            this.#events[this.#events.length-1].createdTabId = config.tabId;
        }

        if(config && config.createdWindow) {
            this.#events[this.#events.length-1].createdWindowId = config.windowId;
            this.#events[this.#events.length-1].createdTabId = config.tabId;
        }

        if(config && config.windowId) {
          this.#events[this.#events.length - 1].windowId = config.windowId;
        }

        if(config && config.tabId) {
          this.#events[this.#events.length - 1].tabId = config.tabId;
        }
        chrome.runtime.sendMessage({messageType:'collectEvents', isIframe: top!==self, events:this.filterEvents(this.#events)});
        this.#events = [];
      }
    }
    executeXPath(expression) {
      try {
          let it = document.evaluate(expression, document, function (prefix) {
              if (prefix === 'svg') {
                  return 'http://www.w3.org/2000/svg';
              } else {
                  return null;
              }
          }, XPathResult.ANY_TYPE, null);
          return it.iterateNext();
      } catch(e){console.error("Navigation Recorder error invalid xpath:" + e);}
      return;
    }
    filterEvents(events) {
      let filtered = [];
      let chunk = [];
      for(let i=0;i<events.length;i++) {
        let event = events[i];
        delete events[i].element;
        if(event.eventType === 'click' || event.eventType === 'typing' || event.eventType === 'scroll' || event.eventType === 'keyboard') {
          filtered = filtered.concat(chunk);
          filtered.push(event);
          chunk = [];
        } else {
          chunk.push(event);
        }
      }
      return filtered;
    }
    getNamespacePrefix(element) {
        if(element instanceof SVGElement) {
            return "svg:";
        }
        return "";
    }
    getTextFromAccessibleAttributes(element){
        let text = [];

        if(/^input$/i.test(element.tagName) && /^button|submit$/i.test(element.type)) {
            text.push(element.value);
        }

        let ariaLabel = element.getAttribute('aria-label');
        if(ariaLabel !== null) {
            text.push(ariaLabel);
        }

        let alt = element.getAttribute("alt");
        if(alt !== null) {
            text.push(alt);
        }

        let title = element.getAttribute("title");
        if(title !== null) {
            text.push(title);
        }
        return text;
    }
    isCustomElement(element) {
        return element.tagName.includes("-");
    }
    getXPath(element){
        let ele = element;
        let path = [];
        let result;
        while(ele) {
            let pos = 0;
            let sibling = ele.previousElementSibling;
            while(sibling) {
                if(sibling.nodeName === ele.nodeName) {
                    pos++;
                }
                sibling = sibling.previousElementSibling;
            }
            let exp = this.getNamespacePrefix(ele) + ele.nodeName.toLowerCase();
            if(pos > 0) {
                exp = exp + '['+(pos+1)+']';
            } else if(pos === 0 && ele.nextElementSibling && ele.nextElementSibling.nodeName === ele.nodeName) {
                exp = exp + '[1]';
            }

            if(ele !== document) {
                path.unshift(exp);
            }

            ele = ele.parentNode;
        }
        result =  '/' + path.join('/');
        if(this.executeXPath(result) === element) {
            return result;
        }
    }
    complete() {
      chrome.runtime.sendMessage({messageType:'complete'}); 
    }
    saveEvent(event) {
      if(this.recordingDelay) {
          this.addDelay(this.recordingDelay)
      }
      event.url = location+'';
      this.#events.push(event);
    }
    addDelay(delay) {
        if(this.lastEventTime === null) {
            this.lastEventTime = Date.now();
        } else {
            let lastEventTime= this.lastEventTime
            let now = Date.now();
            let durationInMillis = Math.floor(now - lastEventTime);
            if(delay > 1) {
                durationInMillis = this.clamp(Math.floor(durationInMillis * delay), this.maxDelay);
            }
            let delayEvent = {eventType: "wait", durationInMillis};
            this.lastEventTime = now;
            this.#events.push(delayEvent);
        }
    }
    clamp(value, max) {
        return Math.min(value, max);
    }
    addListeners() {
      let that = this;
      document.addEventListener('close', this.dialogClose, true);
      document.addEventListener('contextmenu', this.intercept, true);
      document.addEventListener('paste', this.intercept, true);
      document.addEventListener('keydown', this.intercept, true);
      document.addEventListener('click', this.intercept, true);
      document.addEventListener('scroll', this.intercept, true);
      window.addEventListener('hashchange', this.intercept, true);
      if(top !== self) {
          window.addEventListener('focus', function(){
              top.postMessage({messageType: 'Burp Suite Navigation Recorder collect'}, "*");
          }, true)
          window.addEventListener('blur', function(){
              that.collectEvents();
          }, true);
      }
      window.addEventListener('beforeunload', function(){
        that.collectEvents();
      }, true);
    }
    removeListeners() {
      document.removeEventListener('close', this.dialogClose, true);
      document.removeEventListener('contextmenu', this.intercept, true);
      document.removeEventListener('paste', this.intercept, true);
      document.removeEventListener('keydown', this.intercept, true);
      document.removeEventListener('click', this.intercept, true);
      document.removeEventListener('scroll', this.intercept, true); 
      window.removeEventListener('hashchange', this.intercept, true);    
    }
    finish() {
      this.collectEvents();
      this.complete();
      this.stop();
    }
    stop() {
      if(this.#started) {
        this.#started = false;
        document.body.style.border="none"; 
        this.removeListeners();    
      }
    }
    captureChange(element) {
      element.addEventListener('change', function f(e){
        recorder.createClickEvent(e);
        element.removeEventListener('change', f, true);
      }, true);
    }
    dialogClose(e) {
        let recorder = window.recorder;
        recorder.collectEvents();
    }
    intercept(e) {
        let recorder = window.recorder; 
        if(e.type === 'click') {
          let closestAnchor = e.target.closest("a,button");
          if(closestAnchor) {
              recorder.createClickEvent(e, closestAnchor);
              return;
          }
          let lastEvent = recorder.getLastEvent();    
          if(lastEvent && lastEvent.eventType === 'keyboard' && lastEvent.key === 'Enter' && e.target && e.target.form && !lastEvent.causesFormSubmission) {
            lastEvent.causesFormSubmission = true;
            return;//don't create click events when pressing the return key
          }   
          recorder.createClickEvent(e);
          if(e.target instanceof HTMLSelectElement) {
            recorder.captureChange(e.target);
          }
          recorder.lastEvent = e;
        } else if(e.type === 'hashchange') {        
          let lastEvent = recorder.getLastEvent();           
          if(lastEvent) {
            lastEvent.triggersWithinDocumentNavigation = true;
          }
        } else if(e.type === 'scroll') {
          recorder.createScrollEvent(e);
        } else if(e.type === 'contextmenu') {
          recorder.createClickEvent(e);
        } else if(e.type === 'paste') {
          let text = e.clipboardData.getData('text/plain');
          if(typeof text === 'string' && text.length) {
            recorder.createTypingEvent(e, text);
          }
        } else if (e.type === 'keydown') {
          if(e.key.length === 1 && !recorder.isPasteEvent(e)) {
            recorder.createTypingEvent(e, e.key);
          } else {
            //https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/key/Key_Values
            switch(e.key) {
              //Modifier keys
              //The Alt key is intentially omitted. Since the typing event consoldates all character key presses.
              //case "Alt":
              case "AltGraph":
              //The Capslock key is intentially omitted. Since the typing event consoldates all character key presses.
              //case "CapsLock":
              //We don't want to interfere with copy/paste actions
              //case "Control":
              //case "Meta":
              case "Fn":
              case "FnLock":
              case "Hyper":
              case "NumLock":
              case "ScrollLock":
              //The shift key is intentially omitted. Since the typing event consoldates all character key presses.
              //case "Shift":
              case "Super":
              case "Symbol":
              case "SymbolLock":
              //whitespace keys
              case "Tab":
              case "Enter":          
              //navigation keys
              case "ArrowDown":
              case "ArrowLeft":
              case "ArrowRight":
              case "ArrowUp":
              case "End":
              case "Home":
              case "PageDown":
              case "PageUp":
              //editing keys
              case "Backspace":
              case "Clear":
              case "Copy":
              case "CrSel":
              case "Cut":
              case "Delete":
              case "EraseEof":
              case "ExSel":
              case "Insert":
              case "Paste":
              case "Redo":
              case "Undo":
              case "Accept":
              case "Again":
              case "Attn":
              case "Cancel":
              case "ContextMenu":
              case "Escape":
              case "Execute":
              case "Find":
              case "Finish":
              case "Help":
              case "Pause":
              case "Play":
              case "Props":
              case "Select":
              case "ZoomIn":
              case "ZoomOut":
              //device keys
              case "BrightnessDown":
              case "BrightnessUp":
              case "Eject":
              case "LogOff":
              case "Power":
              case "PowerOff":
              case "PrintScreen":
              case "Hibernate":
              case "Standby":
              case "WakeUp":
                recorder.createKeyboardEvent(e);
              break;
            }
          }
        } 
    }
    createScrollEvent(e) {
        let lastEvent = this.getLastEvent();
        let date = new Date();      
        if(lastEvent && lastEvent.eventType === 'scroll') {
           lastEvent.scrollX = window.scrollX;
           lastEvent.scrollY = window.scrollY;
        } else {         
          let scrollEvent = {
            date: date,
            timestamp: +date,                                            
            eventType: 'scroll',
            scrollX: window.scrollX,
            scrollY: window.scrollY,
            innerWidth: window.innerWidth,
            innerHeight: window.innerHeight       
          };
          this.saveEvent(scrollEvent);
        }
    }
    createTypingEvent(e, text) {
        let lastEvent = this.getLastEvent();
        if(lastEvent && lastEvent.eventType === 'typing' && e.target === this.getLastElement()) {
          lastEvent.typedValue += text;
        } else {        
          let typingEvent = this.createEvent(e.target, 'typing', e);
          typingEvent.typedValue = text;
          this.saveEvent(typingEvent);
        }
        this.lastElement = e.target;
    }
    createEvent(element, type, browserEvent) {
      let host = null;
      let path = browserEvent.composedPath();
      let firstElementInPath = null;
      if(path !== null) {
          firstElementInPath = path.shift();
      }
      let isShadowElement = firstElementInPath === null || element === firstElementInPath ? false : !!element.shadowRoot;
      if(isShadowElement) {
          host = element;
          element = firstElementInPath;
      }
      let date = new Date;
      let event = {
        date: date,
        timestamp: +date,
        windowInnerWidth: window.innerWidth,
        windowInnerHeight: window.innerHeight,
        eventType: type,                     
        frameId: this.frameId,
        tabId: this.tabId,
        triggersNavigation: false,
        triggersWithinDoscumentNavigation: false,
        isShadowElement,
        ...(isShadowElement && {shadowParent: this.generateElementAttributes(host, false)}),
        ...(this.generateElementAttributes(element, isShadowElement, isShadowElement ? host.shadowRoot : null))
      };
      return event;
    }
    generateElementAttributes(element, isShadowElement, shadowRoot) {
        return {
            tagName: element.tagName,
            placeholder: element.placeholder,
            href: this.getAttributeValue(element, 'href'),
            src: this.getAttributeValue(element, 'src'),
            className: element.className,
            name: element.name,
            id: element.id,
            textContent: element?.textContent?.slice(0,100),
            innerHTML: element?.innerHTML?.slice(0,100),
            text: element && element.form && element.tagName === 'SELECT' ? element[element.selectedIndex].text : undefined,
            selectedIndex: element.selectedIndex,
            value: typeof element.value === 'undefined' ? undefined : String(element.value),
            elementType: element.type,
            ariaSelector: this.getAriaSelector(element),
            textNodes: this.getTextNodes(element),
            tagNodeIndex: this.getTagIndex(element, isShadowElement, shadowRoot),
            ...(!isShadowElement && {xPath: this.getXPath(element)})
        };
    }
    getTextNodes(element) {
        return Array.from(element.querySelectorAll("*")).map(element => element.textContent);
    }
    getAriaSelector(element) {
        return Array.from(element.querySelectorAll("[aria-label]")).map(element => element.getAttribute('aria-label'));
    }
    createKeyboardEvent(e) {
        let date = new Date();
        let keyboardEvent = {
          date: date,
          timestamp: +date,                                            
          eventType: 'keyboard', 
          shiftKey: e.shiftKey,
          ctrlKey: e.ctrlKey,
          altKey: e.altKey,
          metaKey: e.metaKey,
          key: e.key, 
          charCode: e.charCode
        };
        this.saveEvent(keyboardEvent);
    }
    createClickEvent(e, otherTarget) {
        let lastEvent = this.getLastEvent();
        let clickEvent = this.createEvent(otherTarget ? otherTarget : e.target, e.type === 'contextmenu' ? 'rightClick' : 'click', e);
        clickEvent.characterPos = e.target.selectionStart;
        clickEvent.shiftKey = e.shiftKey;
        clickEvent.ctrlKey = e.ctrlKey;
        clickEvent.altKey = e.altKey;
        clickEvent.metaKey = e.metaKey;
        clickEvent.element = otherTarget ? otherTarget : e.target;
        if(lastEvent && typeof lastEvent.tagName === 'string' && lastEvent.tagName.toLowerCase() === 'label' && lastEvent.eventType === 'click') {
            let labelElement = lastEvent.element;
            if(clickEvent.element && labelElement && clickEvent.element.labels && clickEvent.element.labels.length && Array.from(clickEvent.element.labels).includes(labelElement)) {
                return;
            }
        }
        this.saveEvent(clickEvent);
    }
    getIframeIndex(element) {
        for(let i=0;i<window.length;i++) {
            if(window[i] === element.contentWindow) {
                return i;
            }
        }
        return -1;
    }
    getAttributeValue(element, attributeName) {
        if(!element.getAttribute) {
            return;
        }
        let value = element.getAttribute(attributeName);
        if(value === null) {
            return;
        }
        return value;
    }
    getTagIndex(element, isShadowElement = false, shadowRoot) {
      let doc = isShadowElement ? shadowRoot : document;
      let tags = doc.querySelectorAll(element.tagName);
      for(let i=0;i<tags.length;i++) {
        if(element === tags[i]) {
          return i;
        }
      }
      return -1;
    }
    getLastElement() {
        return this.lastElement;
    }
    getLastEvent() {
      return this.#events[this.#events.length-1];
    }
}
window.recorder = new Recorder();
const head = document.createElement('head');
const script = document.createElement('script');
script.text = `
    HTMLElement.prototype.attachShadow = function(original) {
        return function(){
            if(arguments[0]) {
                arguments[0].mode = "open";
            }
            return original.apply(this, arguments);
        };
    }(HTMLElement.prototype.attachShadow);
`;
head.appendChild(script);
document.documentElement.appendChild(head);
head.remove();
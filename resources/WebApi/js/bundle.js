/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, {
/******/ 				configurable: false,
/******/ 				enumerable: true,
/******/ 				get: getter
/******/ 			});
/******/ 		}
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = 23);
/******/ })
/************************************************************************/
/******/ ([
/* 0 */
/***/ (function(module, exports) {

module.exports = React;

/***/ }),
/* 1 */
/***/ (function(module, exports) {

// shim for using process in browser
var process = module.exports = {};

// cached from whatever global is present so that test runners that stub it
// don't break things.  But we need to wrap it in a try catch in case it is
// wrapped in strict mode code which doesn't define any globals.  It's inside a
// function because try/catches deoptimize in certain engines.

var cachedSetTimeout;
var cachedClearTimeout;

function defaultSetTimout() {
    throw new Error('setTimeout has not been defined');
}
function defaultClearTimeout () {
    throw new Error('clearTimeout has not been defined');
}
(function () {
    try {
        if (typeof setTimeout === 'function') {
            cachedSetTimeout = setTimeout;
        } else {
            cachedSetTimeout = defaultSetTimout;
        }
    } catch (e) {
        cachedSetTimeout = defaultSetTimout;
    }
    try {
        if (typeof clearTimeout === 'function') {
            cachedClearTimeout = clearTimeout;
        } else {
            cachedClearTimeout = defaultClearTimeout;
        }
    } catch (e) {
        cachedClearTimeout = defaultClearTimeout;
    }
} ())
function runTimeout(fun) {
    if (cachedSetTimeout === setTimeout) {
        //normal enviroments in sane situations
        return setTimeout(fun, 0);
    }
    // if setTimeout wasn't available but was latter defined
    if ((cachedSetTimeout === defaultSetTimout || !cachedSetTimeout) && setTimeout) {
        cachedSetTimeout = setTimeout;
        return setTimeout(fun, 0);
    }
    try {
        // when when somebody has screwed with setTimeout but no I.E. maddness
        return cachedSetTimeout(fun, 0);
    } catch(e){
        try {
            // When we are in I.E. but the script has been evaled so I.E. doesn't trust the global object when called normally
            return cachedSetTimeout.call(null, fun, 0);
        } catch(e){
            // same as above but when it's a version of I.E. that must have the global object for 'this', hopfully our context correct otherwise it will throw a global error
            return cachedSetTimeout.call(this, fun, 0);
        }
    }


}
function runClearTimeout(marker) {
    if (cachedClearTimeout === clearTimeout) {
        //normal enviroments in sane situations
        return clearTimeout(marker);
    }
    // if clearTimeout wasn't available but was latter defined
    if ((cachedClearTimeout === defaultClearTimeout || !cachedClearTimeout) && clearTimeout) {
        cachedClearTimeout = clearTimeout;
        return clearTimeout(marker);
    }
    try {
        // when when somebody has screwed with setTimeout but no I.E. maddness
        return cachedClearTimeout(marker);
    } catch (e){
        try {
            // When we are in I.E. but the script has been evaled so I.E. doesn't  trust the global object when called normally
            return cachedClearTimeout.call(null, marker);
        } catch (e){
            // same as above but when it's a version of I.E. that must have the global object for 'this', hopfully our context correct otherwise it will throw a global error.
            // Some versions of I.E. have different rules for clearTimeout vs setTimeout
            return cachedClearTimeout.call(this, marker);
        }
    }



}
var queue = [];
var draining = false;
var currentQueue;
var queueIndex = -1;

function cleanUpNextTick() {
    if (!draining || !currentQueue) {
        return;
    }
    draining = false;
    if (currentQueue.length) {
        queue = currentQueue.concat(queue);
    } else {
        queueIndex = -1;
    }
    if (queue.length) {
        drainQueue();
    }
}

function drainQueue() {
    if (draining) {
        return;
    }
    var timeout = runTimeout(cleanUpNextTick);
    draining = true;

    var len = queue.length;
    while(len) {
        currentQueue = queue;
        queue = [];
        while (++queueIndex < len) {
            if (currentQueue) {
                currentQueue[queueIndex].run();
            }
        }
        queueIndex = -1;
        len = queue.length;
    }
    currentQueue = null;
    draining = false;
    runClearTimeout(timeout);
}

process.nextTick = function (fun) {
    var args = new Array(arguments.length - 1);
    if (arguments.length > 1) {
        for (var i = 1; i < arguments.length; i++) {
            args[i - 1] = arguments[i];
        }
    }
    queue.push(new Item(fun, args));
    if (queue.length === 1 && !draining) {
        runTimeout(drainQueue);
    }
};

// v8 likes predictible objects
function Item(fun, array) {
    this.fun = fun;
    this.array = array;
}
Item.prototype.run = function () {
    this.fun.apply(null, this.array);
};
process.title = 'browser';
process.browser = true;
process.env = {};
process.argv = [];
process.version = ''; // empty string to avoid regexp issues
process.versions = {};

function noop() {}

process.on = noop;
process.addListener = noop;
process.once = noop;
process.off = noop;
process.removeListener = noop;
process.removeAllListeners = noop;
process.emit = noop;
process.prependListener = noop;
process.prependOnceListener = noop;

process.listeners = function (name) { return [] }

process.binding = function (name) {
    throw new Error('process.binding is not supported');
};

process.cwd = function () { return '/' };
process.chdir = function (dir) {
    throw new Error('process.chdir is not supported');
};
process.umask = function() { return 0; };


/***/ }),
/* 2 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

Object.defineProperty(exports, "__esModule", { value: true });
var get = function (obj, path) {
    var pathCopy = path.slice();
    var v = obj;
    while (pathCopy.length > 0) {
        var k = pathCopy.shift();
        if (k === undefined) {
            continue;
        }
        if (v[k] === null) {
            return null;
        }
        if (pathCopy.length === 0) {
            return v[k];
        }
        else {
            v = v[k];
        }
    }
    throw new Error("Could not find path: " + JSON.stringify(path));
};
var bare = __webpack_require__(65);
bare.get = get;
exports.opi = bare;


/***/ }),
/* 3 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

/*
 * Hacky way to force the typechecker to make switch/if/else exhaustive.
 * Use with switch/if in the default/else.
 *
 * see: https://stackoverflow.com/questions/39419170/how-do-i-check-that-a-switch-block-is-exhaustive-in-typescript
 *
 * e.g.
 *
 * enum Foo = { A, B };
 * const foo = Foo.A;
 * switch (foo) {
 *   case (Foo.A):
 *     break;
 *
 *   default:
 *     assertExhaustive(foo);
 * }
 *
 * const retEg = () : number => {
 *   switch (foo) {
 *     case (Foo.A):
 *       return 1;
 *       break;
 *
 *     default:
 *       return assertExhaustive(foo);
 *   }
 * };
 */
Object.defineProperty(exports, "__esModule", { value: true });
exports.assertExhaustive = function (x) {
    /* istanbul ignore next */
    throw new Error("Shouldn't be able to get here");
};
var STRING_ENCODING = "ascii";
exports.stringToBytes = function (str) {
    return btoa(str);
};
exports.bytesToString = function (bytes) {
    return atob(bytes);
};
exports.padStart = function (len, padding, input) {
    if (padding.length !== 1) {
        throw new Error("Only single-character padding strings are allowed");
    }
    var str = input.toString();
    while (str.length < len) {
        str = "" + padding + str;
    }
    return str;
};
var elementReducer = function (arr, curr) {
    if (arr.length !== 0) {
        arr.push(", ");
    }
    arr.push(curr);
    return arr;
};
exports.joinElements = function (arr) { return arr.reduce(elementReducer, []); };


/***/ }),
/* 4 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

Object.defineProperty(exports, "__esModule", { value: true });
var React = __webpack_require__(0);
var Path_1 = __webpack_require__(2);
var Tools_1 = __webpack_require__(3);
var TypeRepr_1 = __webpack_require__(22);
var ArrayFormChunk = __webpack_require__(66);
var DataFormChunk = __webpack_require__(67);
var EnumFormChunk = __webpack_require__(68);
var MapFormChunk = __webpack_require__(69);
var PolyMorphicFormChunk = __webpack_require__(70);
var PrimitiveFormChunk = __webpack_require__(71);
var FormState;
(function (FormState) {
    FormState["Danger"] = "danger";
    FormState["Warning"] = "warning";
    FormState["Success"] = "success";
})(FormState = exports.FormState || (exports.FormState = {}));
exports.addFormStates = function (a, b) {
    if (a === FormState.Danger || b === FormState.Danger) {
        return FormState.Danger;
    }
    if (a === FormState.Warning || b === FormState.Warning) {
        return FormState.Warning;
    }
    return FormState.Success;
};
exports.label = function (props) { return ({
    state: props.wrapping.state,
    element: React.createElement("div", { className: "form-group" + (props.addGroupState ? " has-" + props.wrapping.state : "") },
        React.createElement("label", { htmlFor: props.labelFor }, props.param.type === props.type
            ? paramAsString(props)
            : React.createElement(TypeRepr_1.TypeReprSummary, { type: props.type, actions: props.actions })),
        props.wrapping.element),
}); };
var formRepr = function (props) {
    var validatingChangeHandler = function (validator, vPath, dPath) { return function (ev) {
        var result = validator(ev.target.value);
        var val;
        var setter = props.actions.toolkitSetValue;
        switch (result.kind) {
            case "InitialValue":
                val = undefined;
                setter = props.actions.toolkitClearValue;
                break;
            case "Revert":
                val = Path_1.opi.get(props.state, vPath);
                if (val === undefined || validator(JSON.stringify(val)).kind === "InitialValue") {
                    setter = props.actions.toolkitClearValue;
                }
                break;
            case "Incomplete":
                val = result.val;
                break;
            case "Valid":
                val = result.val;
                break;
            /* istanbul ignore next */
            default:
                Tools_1.assertExhaustive(result);
        }
        setter(dPath, vPath, val);
    }; };
    switch (props.type) {
        case "Boolean":
        case "Byte":
        case "Short":
        case "Integer":
        case "Long":
        case "Float":
        case "Double":
        case "Character":
        case "String":
        case "Json":
        case "[Byte]": {
            return PrimitiveFormChunk.formChunk(props, validatingChangeHandler);
        }
        default:
            switch (props.type[0]) {
                case "{": {
                    return MapFormChunk.formChunk(props, formRepr);
                }
                case "[": {
                    return ArrayFormChunk.formChunk(props, formRepr);
                }
                default:
                    var tv = props.classRegistry[props.type];
                    if (tv === undefined) {
                        throw new Error("Unknown type: " + props.type);
                    }
                    switch (tv.type) {
                        case "DATA": {
                            return DataFormChunk.formChunk(props, formRepr, tv);
                        }
                        case "POLYMORPHIC_DATA": {
                            return PolyMorphicFormChunk.formChunk(props, validatingChangeHandler, formRepr, tv);
                        }
                        case "ENUM": {
                            return EnumFormChunk.formChunk(props, validatingChangeHandler, tv);
                        }
                        /* istanbul ignore next */
                        default:
                            Tools_1.assertExhaustive(tv);
                            return { state: FormState.Danger, element: React.createElement("div", null) };
                    }
            }
    }
};
var repointTypePath = function (typePath, parts) {
    var copy = typePath.slice();
    var idx;
    switch (typePath[4]) {
        case "value":
            idx = 5;
            break;
        case "params":
            idx = 6;
            break;
        /* istanbul ignore next */
        default:
            throw new Error("Unexpected path part: " + typePath[2]);
    }
    parts.forEach(function (part, i) {
        copy[idx + i] = part;
    });
    return copy;
};
var paramAsString = function (props) {
    return React.createElement("div", { style: { color: Path_1.opi.get(props.state, props.valuePath) === null ? "grey" : "" } },
        React.createElement("span", null,
            props.param.name,
            " : "),
        React.createElement(TypeRepr_1.TypeReprSummary, { type: props.param.type, actions: props.actions }),
        React.createElement("span", null,
            props.param.default !== undefined ? "" : " *",
            nullableCheckbox(props.state, props.actions, props.param, props.parent, props.valuePath, props.dirtyPath)),
        React.createElement("div", null,
            props.param.validator ? validatorString(props.state, props.valuePath, props.param.validator) : "",
            props.param.doc ? React.createElement("small", { className: "text-muted" }, props.param.doc) : ""));
};
var validatorString = function (state, path, validator) {
    if (Path_1.opi.get(state, path) === null) {
        return "";
    }
    switch (validator.type) {
        case "PATTERN":
            return React.createElement("small", { className: "tk-form-validator form-control-feedback" }, "/" + validator.pattern + "/");
        case "RANGE":
            var min = validator.min ? "" + validator.min : "-";
            var max = validator.max ? "" + validator.max : "-";
            return React.createElement("small", { className: "tk-form-validator form-control-feedback" }, "[" + min + "," + max + "]");
        default:
            return "";
    }
};
var nullableCheckbox = function (state, actions, param, parent, path, dirtyPath) {
    if (param.default !== undefined && parent !== null) {
        return React.createElement("input", { id: param.name + "_nullable_checkbox", type: "checkbox", checked: Path_1.opi.get(state, path) !== null, onChange: nullable(actions, param, path, dirtyPath) });
    }
    else {
        return "";
    }
};
var nullable = function (actions, param, path, dirtyPath) { return function (ev) {
    if (ev.target.checked) {
        actions.toolkitProvideValue(dirtyPath, path, param.type);
    }
    else {
        actions.toolkitNullValue(dirtyPath, path);
    }
}; };
exports.Form = function (props) {
    if (props.state.toolkitOpenFor === null) {
        return React.createElement("span", null);
    }
    var endpoint = props.state.endpoints[props.state.toolkitOpenFor];
    if (endpoint === undefined) {
        throw new Error("No endpoint found for index " + props.state.toolkitOpenFor);
    }
    return displayForEndpoint(props, props.state.toolkitOpenFor, endpoint);
};
var displayForEndpoint = function (props, endpointIdx, endpoint) {
    var formContent = function (param, typePath) {
        var valuePath = repointTypePath(typePath, ["user_value"]);
        var dirtyPath = repointTypePath(typePath, ["dirty"]);
        var type = Path_1.opi.get(props.state, typePath);
        return formRepr({
            state: props.state,
            actions: props.actions,
            classRegistry: props.classRegistry,
            param: param,
            parent: undefined,
            typePath: typePath,
            valuePath: valuePath,
            dirtyPath: dirtyPath,
            type: type,
            tabIndex: props.getTabIndex,
        });
    };
    var formContentArr = [];
    var groupState = FormState.Success;
    for (var i = 0; i < endpoint.url_parts.length; i++) {
        var urlPart = endpoint.url_parts[i];
        if (urlPart.type === "ID") {
            var repr = formContent(urlPart.value, ["endpoints", endpointIdx, "url_parts", i, "value", "type"]);
            formContentArr.push(React.createElement("div", { key: formContentArr.length }, repr.element));
            groupState = exports.addFormStates(groupState, repr.state);
        }
        for (var j = 0; j < urlPart.params.length; j++) {
            var param = urlPart.params[j];
            var repr = formContent(param, ["endpoints", endpointIdx, "url_parts", i, "params", j, "type"]);
            formContentArr.push(React.createElement("div", { key: formContentArr.length }, repr.element));
            groupState = exports.addFormStates(groupState, repr.state);
        }
    }
    var hasUserValue = endpoint.url_parts.reduce(function (prev, next) {
        if (prev) {
            return prev;
        }
        if (next.type === "ID") {
            if (next.value.dirty.length > 0) {
                return true;
            }
        }
        for (var _i = 0, _a = next.params; _i < _a.length; _i++) {
            var param = _a[_i];
            if (param.dirty.length > 0) {
                return true;
            }
        }
        return false;
    }, false);
    return (React.createElement("div", null,
        React.createElement("form", { id: "form", className: "form-group", onSubmit: props.onSubmit(groupState) }, formContentArr),
        React.createElement("div", null,
            React.createElement("span", null,
                hasUserValue ? props.clearing() : "",
                groupState === FormState.Success ? props.sending() : ""))));
};


/***/ }),
/* 5 */
/***/ (function(module, exports, __webpack_require__) {

/* WEBPACK VAR INJECTION */(function(process) {/**
 * Copyright (c) 2013-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

if (process.env.NODE_ENV !== 'production') {
  var REACT_ELEMENT_TYPE = (typeof Symbol === 'function' &&
    Symbol.for &&
    Symbol.for('react.element')) ||
    0xeac7;

  var isValidElement = function(object) {
    return typeof object === 'object' &&
      object !== null &&
      object.$$typeof === REACT_ELEMENT_TYPE;
  };

  // By explicitly using `prop-types` you are opting into new development behavior.
  // http://fb.me/prop-types-in-prod
  var throwOnDirectAccess = true;
  module.exports = __webpack_require__(43)(isValidElement, throwOnDirectAccess);
} else {
  // By explicitly using `prop-types` you are opting into new production behavior.
  // http://fb.me/prop-types-in-prod
  module.exports = __webpack_require__(46)();
}

/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(1)))

/***/ }),
/* 6 */
/***/ (function(module, exports) {

module.exports = ReactDOM;

/***/ }),
/* 7 */
/***/ (function(module, exports) {

var g;

// This works in non-strict mode
g = (function() {
	return this;
})();

try {
	// This works if eval is allowed (see CSP)
	g = g || Function("return this")() || (1,eval)("this");
} catch(e) {
	// This works if the window reference is available
	if(typeof window === "object")
		g = window;
}

// g can still be undefined, but nothing to do about it...
// We return undefined, instead of nothing here, so it's
// easier to handle this case. if(!global) { ...}

module.exports = g;


/***/ }),
/* 8 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


/**
 * Copyright (c) 2013-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * 
 */

function makeEmptyFunction(arg) {
  return function () {
    return arg;
  };
}

/**
 * This function accepts and discards inputs; it has no side effects. This is
 * primarily useful idiomatically for overridable function endpoints which
 * always need to be callable, since JS lacks a null-call idiom ala Cocoa.
 */
var emptyFunction = function emptyFunction() {};

emptyFunction.thatReturns = makeEmptyFunction;
emptyFunction.thatReturnsFalse = makeEmptyFunction(false);
emptyFunction.thatReturnsTrue = makeEmptyFunction(true);
emptyFunction.thatReturnsNull = makeEmptyFunction(null);
emptyFunction.thatReturnsThis = function () {
  return this;
};
emptyFunction.thatReturnsArgument = function (arg) {
  return arg;
};

module.exports = emptyFunction;

/***/ }),
/* 9 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
/* WEBPACK VAR INJECTION */(function(process) {/**
 * Copyright (c) 2013-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 */



/**
 * Use invariant() to assert state which your program assumes to be true.
 *
 * Provide sprintf-style format (only %s is supported) and arguments
 * to provide information about what broke and what you were
 * expecting.
 *
 * The invariant message will be stripped in production, but the invariant
 * will remain to ensure logic does not differ in production.
 */

var validateFormat = function validateFormat(format) {};

if (process.env.NODE_ENV !== 'production') {
  validateFormat = function validateFormat(format) {
    if (format === undefined) {
      throw new Error('invariant requires an error message argument');
    }
  };
}

function invariant(condition, format, a, b, c, d, e, f) {
  validateFormat(format);

  if (!condition) {
    var error;
    if (format === undefined) {
      error = new Error('Minified exception occurred; use the non-minified dev environment ' + 'for the full error message and additional helpful warnings.');
    } else {
      var args = [a, b, c, d, e, f];
      var argIndex = 0;
      error = new Error(format.replace(/%s/g, function () {
        return args[argIndex++];
      }));
      error.name = 'Invariant Violation';
    }

    error.framesToPop = 1; // we don't care about invariant's own frame
    throw error;
  }
}

module.exports = invariant;
/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(1)))

/***/ }),
/* 10 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
/**
 * Copyright (c) 2013-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */



var ReactPropTypesSecret = 'SECRET_DO_NOT_PASS_THIS_OR_YOU_WILL_BE_FIRED';

module.exports = ReactPropTypesSecret;


/***/ }),
/* 11 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

var __assign = (this && this.__assign) || Object.assign || function(t) {
    for (var s, i = 1, n = arguments.length; i < n; i++) {
        s = arguments[i];
        for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
            t[p] = s[p];
    }
    return t;
};
Object.defineProperty(exports, "__esModule", { value: true });
var Tools_1 = __webpack_require__(3);
exports.valueInit = function (classRegistry, type) {
    switch (type[0]) {
        case "[":
            if (type === "[Byte]") {
                return "";
            }
            else {
                return [];
            }
        case "{":
            return {};
        default:
            switch (type) {
                case "Boolean":
                case "Byte":
                case "Short":
                case "Integer":
                case "Long":
                case "Float":
                case "Double":
                case "Character":
                case "String":
                case "Json":
                    return undefined;
                default:
                    var tv = classRegistry[type];
                    if (type === undefined) {
                        throw new Error("Unknown type: " + type);
                    }
                    switch (tv.type) {
                        case "DATA":
                            var o = {};
                            for (var _i = 0, _a = tv.constructor; _i < _a.length; _i++) {
                                var param = _a[_i];
                                o[param.name] = exports.paramInit(classRegistry, param);
                            }
                            return o;
                        case "ENUM":
                            return undefined;
                        case "POLYMORPHIC_DATA":
                            return undefined;
                        /* istanbul ignore next */
                        default:
                            Tools_1.assertExhaustive(tv);
                    }
            }
    }
};
exports.paramInit = function (classRegistry, param) {
    if (param.default !== undefined) {
        return null;
    }
    return exports.valueInit(classRegistry, param.type);
};
exports.pathSpecInit = function (classRegistry, s) {
    var s2 = __assign({}, s, { url_parts: [] });
    s.url_parts.forEach(function (up) {
        var params2 = [];
        (up.params || []).forEach(function (p) {
            params2.push(__assign({}, p, { user_value: exports.paramInit(classRegistry, p), dirty: [] }));
        });
        switch (up.type) {
            case "NAME":
                s2.url_parts.push(__assign({}, up, { params: params2 }));
                break;
            case "ID":
                s2.url_parts.push(__assign({}, up, { value: __assign({}, up.value, { user_value: exports.paramInit(classRegistry, up.value), dirty: [] }), params: params2 }));
                break;
        }
    });
    return s2;
};


/***/ }),
/* 12 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ActionTypes; });
/* harmony export (immutable) */ __webpack_exports__["b"] = createStore;
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0_lodash_es_isPlainObject__ = __webpack_require__(13);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_symbol_observable__ = __webpack_require__(33);



/**
 * These are private action types reserved by Redux.
 * For any unknown actions, you must return the current state.
 * If the current state is undefined, you must return the initial state.
 * Do not reference these action types directly in your code.
 */
var ActionTypes = {
  INIT: '@@redux/INIT'

  /**
   * Creates a Redux store that holds the state tree.
   * The only way to change the data in the store is to call `dispatch()` on it.
   *
   * There should only be a single store in your app. To specify how different
   * parts of the state tree respond to actions, you may combine several reducers
   * into a single reducer function by using `combineReducers`.
   *
   * @param {Function} reducer A function that returns the next state tree, given
   * the current state tree and the action to handle.
   *
   * @param {any} [preloadedState] The initial state. You may optionally specify it
   * to hydrate the state from the server in universal apps, or to restore a
   * previously serialized user session.
   * If you use `combineReducers` to produce the root reducer function, this must be
   * an object with the same shape as `combineReducers` keys.
   *
   * @param {Function} [enhancer] The store enhancer. You may optionally specify it
   * to enhance the store with third-party capabilities such as middleware,
   * time travel, persistence, etc. The only store enhancer that ships with Redux
   * is `applyMiddleware()`.
   *
   * @returns {Store} A Redux store that lets you read the state, dispatch actions
   * and subscribe to changes.
   */
};function createStore(reducer, preloadedState, enhancer) {
  var _ref2;

  if (typeof preloadedState === 'function' && typeof enhancer === 'undefined') {
    enhancer = preloadedState;
    preloadedState = undefined;
  }

  if (typeof enhancer !== 'undefined') {
    if (typeof enhancer !== 'function') {
      throw new Error('Expected the enhancer to be a function.');
    }

    return enhancer(createStore)(reducer, preloadedState);
  }

  if (typeof reducer !== 'function') {
    throw new Error('Expected the reducer to be a function.');
  }

  var currentReducer = reducer;
  var currentState = preloadedState;
  var currentListeners = [];
  var nextListeners = currentListeners;
  var isDispatching = false;

  function ensureCanMutateNextListeners() {
    if (nextListeners === currentListeners) {
      nextListeners = currentListeners.slice();
    }
  }

  /**
   * Reads the state tree managed by the store.
   *
   * @returns {any} The current state tree of your application.
   */
  function getState() {
    return currentState;
  }

  /**
   * Adds a change listener. It will be called any time an action is dispatched,
   * and some part of the state tree may potentially have changed. You may then
   * call `getState()` to read the current state tree inside the callback.
   *
   * You may call `dispatch()` from a change listener, with the following
   * caveats:
   *
   * 1. The subscriptions are snapshotted just before every `dispatch()` call.
   * If you subscribe or unsubscribe while the listeners are being invoked, this
   * will not have any effect on the `dispatch()` that is currently in progress.
   * However, the next `dispatch()` call, whether nested or not, will use a more
   * recent snapshot of the subscription list.
   *
   * 2. The listener should not expect to see all state changes, as the state
   * might have been updated multiple times during a nested `dispatch()` before
   * the listener is called. It is, however, guaranteed that all subscribers
   * registered before the `dispatch()` started will be called with the latest
   * state by the time it exits.
   *
   * @param {Function} listener A callback to be invoked on every dispatch.
   * @returns {Function} A function to remove this change listener.
   */
  function subscribe(listener) {
    if (typeof listener !== 'function') {
      throw new Error('Expected listener to be a function.');
    }

    var isSubscribed = true;

    ensureCanMutateNextListeners();
    nextListeners.push(listener);

    return function unsubscribe() {
      if (!isSubscribed) {
        return;
      }

      isSubscribed = false;

      ensureCanMutateNextListeners();
      var index = nextListeners.indexOf(listener);
      nextListeners.splice(index, 1);
    };
  }

  /**
   * Dispatches an action. It is the only way to trigger a state change.
   *
   * The `reducer` function, used to create the store, will be called with the
   * current state tree and the given `action`. Its return value will
   * be considered the **next** state of the tree, and the change listeners
   * will be notified.
   *
   * The base implementation only supports plain object actions. If you want to
   * dispatch a Promise, an Observable, a thunk, or something else, you need to
   * wrap your store creating function into the corresponding middleware. For
   * example, see the documentation for the `redux-thunk` package. Even the
   * middleware will eventually dispatch plain object actions using this method.
   *
   * @param {Object} action A plain object representing “what changed”. It is
   * a good idea to keep actions serializable so you can record and replay user
   * sessions, or use the time travelling `redux-devtools`. An action must have
   * a `type` property which may not be `undefined`. It is a good idea to use
   * string constants for action types.
   *
   * @returns {Object} For convenience, the same action object you dispatched.
   *
   * Note that, if you use a custom middleware, it may wrap `dispatch()` to
   * return something else (for example, a Promise you can await).
   */
  function dispatch(action) {
    if (!Object(__WEBPACK_IMPORTED_MODULE_0_lodash_es_isPlainObject__["a" /* default */])(action)) {
      throw new Error('Actions must be plain objects. ' + 'Use custom middleware for async actions.');
    }

    if (typeof action.type === 'undefined') {
      throw new Error('Actions may not have an undefined "type" property. ' + 'Have you misspelled a constant?');
    }

    if (isDispatching) {
      throw new Error('Reducers may not dispatch actions.');
    }

    try {
      isDispatching = true;
      currentState = currentReducer(currentState, action);
    } finally {
      isDispatching = false;
    }

    var listeners = currentListeners = nextListeners;
    for (var i = 0; i < listeners.length; i++) {
      var listener = listeners[i];
      listener();
    }

    return action;
  }

  /**
   * Replaces the reducer currently used by the store to calculate the state.
   *
   * You might need this if your app implements code splitting and you want to
   * load some of the reducers dynamically. You might also need this if you
   * implement a hot reloading mechanism for Redux.
   *
   * @param {Function} nextReducer The reducer for the store to use instead.
   * @returns {void}
   */
  function replaceReducer(nextReducer) {
    if (typeof nextReducer !== 'function') {
      throw new Error('Expected the nextReducer to be a function.');
    }

    currentReducer = nextReducer;
    dispatch({ type: ActionTypes.INIT });
  }

  /**
   * Interoperability point for observable/reactive libraries.
   * @returns {observable} A minimal observable of state changes.
   * For more information, see the observable proposal:
   * https://github.com/tc39/proposal-observable
   */
  function observable() {
    var _ref;

    var outerSubscribe = subscribe;
    return _ref = {
      /**
       * The minimal observable subscription method.
       * @param {Object} observer Any object that can be used as an observer.
       * The observer object should have a `next` method.
       * @returns {subscription} An object with an `unsubscribe` method that can
       * be used to unsubscribe the observable from the store, and prevent further
       * emission of values from the observable.
       */
      subscribe: function subscribe(observer) {
        if (typeof observer !== 'object') {
          throw new TypeError('Expected the observer to be an object.');
        }

        function observeState() {
          if (observer.next) {
            observer.next(getState());
          }
        }

        observeState();
        var unsubscribe = outerSubscribe(observeState);
        return { unsubscribe: unsubscribe };
      }
    }, _ref[__WEBPACK_IMPORTED_MODULE_1_symbol_observable__["a" /* default */]] = function () {
      return this;
    }, _ref;
  }

  // When a store is created, an "INIT" action is dispatched so that every
  // reducer returns their initial state. This effectively populates
  // the initial state tree.
  dispatch({ type: ActionTypes.INIT });

  return _ref2 = {
    dispatch: dispatch,
    subscribe: subscribe,
    getState: getState,
    replaceReducer: replaceReducer
  }, _ref2[__WEBPACK_IMPORTED_MODULE_1_symbol_observable__["a" /* default */]] = observable, _ref2;
}

/***/ }),
/* 13 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__baseGetTag_js__ = __webpack_require__(25);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__getPrototype_js__ = __webpack_require__(30);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__isObjectLike_js__ = __webpack_require__(32);




/** `Object#toString` result references. */
var objectTag = '[object Object]';

/** Used for built-in method references. */
var funcProto = Function.prototype,
    objectProto = Object.prototype;

/** Used to resolve the decompiled source of functions. */
var funcToString = funcProto.toString;

/** Used to check objects for own properties. */
var hasOwnProperty = objectProto.hasOwnProperty;

/** Used to infer the `Object` constructor. */
var objectCtorString = funcToString.call(Object);

/**
 * Checks if `value` is a plain object, that is, an object created by the
 * `Object` constructor or one with a `[[Prototype]]` of `null`.
 *
 * @static
 * @memberOf _
 * @since 0.8.0
 * @category Lang
 * @param {*} value The value to check.
 * @returns {boolean} Returns `true` if `value` is a plain object, else `false`.
 * @example
 *
 * function Foo() {
 *   this.a = 1;
 * }
 *
 * _.isPlainObject(new Foo);
 * // => false
 *
 * _.isPlainObject([1, 2, 3]);
 * // => false
 *
 * _.isPlainObject({ 'x': 0, 'y': 0 });
 * // => true
 *
 * _.isPlainObject(Object.create(null));
 * // => true
 */
function isPlainObject(value) {
  if (!Object(__WEBPACK_IMPORTED_MODULE_2__isObjectLike_js__["a" /* default */])(value) || Object(__WEBPACK_IMPORTED_MODULE_0__baseGetTag_js__["a" /* default */])(value) != objectTag) {
    return false;
  }
  var proto = Object(__WEBPACK_IMPORTED_MODULE_1__getPrototype_js__["a" /* default */])(value);
  if (proto === null) {
    return true;
  }
  var Ctor = hasOwnProperty.call(proto, 'constructor') && proto.constructor;
  return typeof Ctor == 'function' && Ctor instanceof Ctor &&
    funcToString.call(Ctor) == objectCtorString;
}

/* harmony default export */ __webpack_exports__["a"] = (isPlainObject);


/***/ }),
/* 14 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__root_js__ = __webpack_require__(26);


/** Built-in value references. */
var Symbol = __WEBPACK_IMPORTED_MODULE_0__root_js__["a" /* default */].Symbol;

/* harmony default export */ __webpack_exports__["a"] = (Symbol);


/***/ }),
/* 15 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (immutable) */ __webpack_exports__["a"] = warning;
/**
 * Prints a warning in the console if it exists.
 *
 * @param {String} message The warning message.
 * @returns {void}
 */
function warning(message) {
  /* eslint-disable no-console */
  if (typeof console !== 'undefined' && typeof console.error === 'function') {
    console.error(message);
  }
  /* eslint-enable no-console */
  try {
    // This error was thrown as a convenience so that if you enable
    // "break on all exceptions" in your console,
    // it would pause the execution at this line.
    throw new Error(message);
    /* eslint-disable no-empty */
  } catch (e) {}
  /* eslint-enable no-empty */
}

/***/ }),
/* 16 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (immutable) */ __webpack_exports__["a"] = compose;
/**
 * Composes single-argument functions from right to left. The rightmost
 * function can take multiple arguments as it provides the signature for
 * the resulting composite function.
 *
 * @param {...Function} funcs The functions to compose.
 * @returns {Function} A function obtained by composing the argument functions
 * from right to left. For example, compose(f, g, h) is identical to doing
 * (...args) => f(g(h(...args))).
 */

function compose() {
  for (var _len = arguments.length, funcs = Array(_len), _key = 0; _key < _len; _key++) {
    funcs[_key] = arguments[_key];
  }

  if (funcs.length === 0) {
    return function (arg) {
      return arg;
    };
  }

  if (funcs.length === 1) {
    return funcs[0];
  }

  return funcs.reduce(function (a, b) {
    return function () {
      return a(b.apply(undefined, arguments));
    };
  });
}

/***/ }),
/* 17 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
/* WEBPACK VAR INJECTION */(function(process) {/**
 * Copyright (c) 2014-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 */



var emptyFunction = __webpack_require__(8);

/**
 * Similar to invariant but only logs a warning if the condition is not met.
 * This can be used to log issues in development environments in critical
 * paths. Removing the logging code for production environments will keep the
 * same logic and follow the same code paths.
 */

var warning = emptyFunction;

if (process.env.NODE_ENV !== 'production') {
  var printWarning = function printWarning(format) {
    for (var _len = arguments.length, args = Array(_len > 1 ? _len - 1 : 0), _key = 1; _key < _len; _key++) {
      args[_key - 1] = arguments[_key];
    }

    var argIndex = 0;
    var message = 'Warning: ' + format.replace(/%s/g, function () {
      return args[argIndex++];
    });
    if (typeof console !== 'undefined') {
      console.error(message);
    }
    try {
      // --- Welcome to debugging React ---
      // This error was thrown as a convenience so that you can use this stack
      // to find the callsite that caused this warning to fire.
      throw new Error(message);
    } catch (x) {}
  };

  warning = function warning(condition, format) {
    if (format === undefined) {
      throw new Error('`warning(condition, format, ...args)` requires a warning ' + 'message argument');
    }

    if (format.indexOf('Failed Composite propType: ') === 0) {
      return; // Ignore CompositeComponent proptype check.
    }

    if (!condition) {
      for (var _len2 = arguments.length, args = Array(_len2 > 2 ? _len2 - 2 : 0), _key2 = 2; _key2 < _len2; _key2++) {
        args[_key2 - 2] = arguments[_key2];
      }

      printWarning.apply(undefined, [format].concat(args));
    }
  };
}

module.exports = warning;
/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(1)))

/***/ }),
/* 18 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
/* WEBPACK VAR INJECTION */(function(process) {

exports.__esModule = true;

var _extends = Object.assign || function (target) { for (var i = 1; i < arguments.length; i++) { var source = arguments[i]; for (var key in source) { if (Object.prototype.hasOwnProperty.call(source, key)) { target[key] = source[key]; } } } return target; };

var _chainFunction = __webpack_require__(54);

var _chainFunction2 = _interopRequireDefault(_chainFunction);

var _react = __webpack_require__(0);

var _react2 = _interopRequireDefault(_react);

var _propTypes = __webpack_require__(5);

var _propTypes2 = _interopRequireDefault(_propTypes);

var _warning = __webpack_require__(55);

var _warning2 = _interopRequireDefault(_warning);

var _ChildMapping = __webpack_require__(56);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

function _possibleConstructorReturn(self, call) { if (!self) { throw new ReferenceError("this hasn't been initialised - super() hasn't been called"); } return call && (typeof call === "object" || typeof call === "function") ? call : self; }

function _inherits(subClass, superClass) { if (typeof superClass !== "function" && superClass !== null) { throw new TypeError("Super expression must either be null or a function, not " + typeof superClass); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, enumerable: false, writable: true, configurable: true } }); if (superClass) Object.setPrototypeOf ? Object.setPrototypeOf(subClass, superClass) : subClass.__proto__ = superClass; }

var propTypes = {
  component: _propTypes2.default.any,
  childFactory: _propTypes2.default.func,
  children: _propTypes2.default.node
};

var defaultProps = {
  component: 'span',
  childFactory: function childFactory(child) {
    return child;
  }
};

var TransitionGroup = function (_React$Component) {
  _inherits(TransitionGroup, _React$Component);

  function TransitionGroup(props, context) {
    _classCallCheck(this, TransitionGroup);

    var _this = _possibleConstructorReturn(this, _React$Component.call(this, props, context));

    _this.performAppear = function (key, component) {
      _this.currentlyTransitioningKeys[key] = true;

      if (component.componentWillAppear) {
        component.componentWillAppear(_this._handleDoneAppearing.bind(_this, key, component));
      } else {
        _this._handleDoneAppearing(key, component);
      }
    };

    _this._handleDoneAppearing = function (key, component) {
      if (component.componentDidAppear) {
        component.componentDidAppear();
      }

      delete _this.currentlyTransitioningKeys[key];

      var currentChildMapping = (0, _ChildMapping.getChildMapping)(_this.props.children);

      if (!currentChildMapping || !currentChildMapping.hasOwnProperty(key)) {
        // This was removed before it had fully appeared. Remove it.
        _this.performLeave(key, component);
      }
    };

    _this.performEnter = function (key, component) {
      _this.currentlyTransitioningKeys[key] = true;

      if (component.componentWillEnter) {
        component.componentWillEnter(_this._handleDoneEntering.bind(_this, key, component));
      } else {
        _this._handleDoneEntering(key, component);
      }
    };

    _this._handleDoneEntering = function (key, component) {
      if (component.componentDidEnter) {
        component.componentDidEnter();
      }

      delete _this.currentlyTransitioningKeys[key];

      var currentChildMapping = (0, _ChildMapping.getChildMapping)(_this.props.children);

      if (!currentChildMapping || !currentChildMapping.hasOwnProperty(key)) {
        // This was removed before it had fully entered. Remove it.
        _this.performLeave(key, component);
      }
    };

    _this.performLeave = function (key, component) {
      _this.currentlyTransitioningKeys[key] = true;

      if (component.componentWillLeave) {
        component.componentWillLeave(_this._handleDoneLeaving.bind(_this, key, component));
      } else {
        // Note that this is somewhat dangerous b/c it calls setState()
        // again, effectively mutating the component before all the work
        // is done.
        _this._handleDoneLeaving(key, component);
      }
    };

    _this._handleDoneLeaving = function (key, component) {
      if (component.componentDidLeave) {
        component.componentDidLeave();
      }

      delete _this.currentlyTransitioningKeys[key];

      var currentChildMapping = (0, _ChildMapping.getChildMapping)(_this.props.children);

      if (currentChildMapping && currentChildMapping.hasOwnProperty(key)) {
        // This entered again before it fully left. Add it again.
        _this.keysToEnter.push(key);
      } else {
        _this.setState(function (state) {
          var newChildren = _extends({}, state.children);
          delete newChildren[key];
          return { children: newChildren };
        });
      }
    };

    _this.childRefs = Object.create(null);

    _this.state = {
      children: (0, _ChildMapping.getChildMapping)(props.children)
    };
    return _this;
  }

  TransitionGroup.prototype.componentWillMount = function componentWillMount() {
    this.currentlyTransitioningKeys = {};
    this.keysToEnter = [];
    this.keysToLeave = [];
  };

  TransitionGroup.prototype.componentDidMount = function componentDidMount() {
    var initialChildMapping = this.state.children;
    for (var key in initialChildMapping) {
      if (initialChildMapping[key]) {
        this.performAppear(key, this.childRefs[key]);
      }
    }
  };

  TransitionGroup.prototype.componentWillReceiveProps = function componentWillReceiveProps(nextProps) {
    var nextChildMapping = (0, _ChildMapping.getChildMapping)(nextProps.children);
    var prevChildMapping = this.state.children;

    this.setState({
      children: (0, _ChildMapping.mergeChildMappings)(prevChildMapping, nextChildMapping)
    });

    for (var key in nextChildMapping) {
      var hasPrev = prevChildMapping && prevChildMapping.hasOwnProperty(key);
      if (nextChildMapping[key] && !hasPrev && !this.currentlyTransitioningKeys[key]) {
        this.keysToEnter.push(key);
      }
    }

    for (var _key in prevChildMapping) {
      var hasNext = nextChildMapping && nextChildMapping.hasOwnProperty(_key);
      if (prevChildMapping[_key] && !hasNext && !this.currentlyTransitioningKeys[_key]) {
        this.keysToLeave.push(_key);
      }
    }

    // If we want to someday check for reordering, we could do it here.
  };

  TransitionGroup.prototype.componentDidUpdate = function componentDidUpdate() {
    var _this2 = this;

    var keysToEnter = this.keysToEnter;
    this.keysToEnter = [];
    keysToEnter.forEach(function (key) {
      return _this2.performEnter(key, _this2.childRefs[key]);
    });

    var keysToLeave = this.keysToLeave;
    this.keysToLeave = [];
    keysToLeave.forEach(function (key) {
      return _this2.performLeave(key, _this2.childRefs[key]);
    });
  };

  TransitionGroup.prototype.render = function render() {
    var _this3 = this;

    // TODO: we could get rid of the need for the wrapper node
    // by cloning a single child
    var childrenToRender = [];

    var _loop = function _loop(key) {
      var child = _this3.state.children[key];
      if (child) {
        var isCallbackRef = typeof child.ref !== 'string';
        var factoryChild = _this3.props.childFactory(child);
        var ref = function ref(r) {
          _this3.childRefs[key] = r;
        };

        process.env.NODE_ENV !== 'production' ? (0, _warning2.default)(isCallbackRef, 'string refs are not supported on children of TransitionGroup and will be ignored. ' + 'Please use a callback ref instead: https://facebook.github.io/react/docs/refs-and-the-dom.html#the-ref-callback-attribute') : void 0;

        // Always chaining the refs leads to problems when the childFactory
        // wraps the child. The child ref callback gets called twice with the
        // wrapper and the child. So we only need to chain the ref if the
        // factoryChild is not different from child.
        if (factoryChild === child && isCallbackRef) {
          ref = (0, _chainFunction2.default)(child.ref, ref);
        }

        // You may need to apply reactive updates to a child as it is leaving.
        // The normal React way to do it won't work since the child will have
        // already been removed. In case you need this behavior you can provide
        // a childFactory function to wrap every child, even the ones that are
        // leaving.
        childrenToRender.push(_react2.default.cloneElement(factoryChild, {
          key: key,
          ref: ref
        }));
      }
    };

    for (var key in this.state.children) {
      _loop(key);
    }

    // Do not forward TransitionGroup props to primitive DOM nodes
    var props = _extends({}, this.props);
    delete props.transitionLeave;
    delete props.transitionName;
    delete props.transitionAppear;
    delete props.transitionEnter;
    delete props.childFactory;
    delete props.transitionLeaveTimeout;
    delete props.transitionEnterTimeout;
    delete props.transitionAppearTimeout;
    delete props.component;

    return _react2.default.createElement(this.props.component, props, childrenToRender);
  };

  return TransitionGroup;
}(_react2.default.Component);

TransitionGroup.displayName = 'TransitionGroup';


TransitionGroup.propTypes = process.env.NODE_ENV !== "production" ? propTypes : {};
TransitionGroup.defaultProps = defaultProps;

exports.default = TransitionGroup;
module.exports = exports['default'];
/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(1)))

/***/ }),
/* 19 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.default = !!(typeof window !== 'undefined' && window.document && window.document.createElement);
module.exports = exports['default'];

/***/ }),
/* 20 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


exports.__esModule = true;
exports.nameShape = undefined;
exports.transitionTimeout = transitionTimeout;

var _react = __webpack_require__(0);

var _react2 = _interopRequireDefault(_react);

var _propTypes = __webpack_require__(5);

var _propTypes2 = _interopRequireDefault(_propTypes);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

function transitionTimeout(transitionType) {
  var timeoutPropName = 'transition' + transitionType + 'Timeout';
  var enabledPropName = 'transition' + transitionType;

  return function (props) {
    // If the transition is enabled
    if (props[enabledPropName]) {
      // If no timeout duration is provided
      if (props[timeoutPropName] == null) {
        return new Error(timeoutPropName + ' wasn\'t supplied to CSSTransitionGroup: ' + 'this can cause unreliable animations and won\'t be supported in ' + 'a future version of React. See ' + 'https://fb.me/react-animation-transition-group-timeout for more ' + 'information.');

        // If the duration isn't a number
      } else if (typeof props[timeoutPropName] !== 'number') {
        return new Error(timeoutPropName + ' must be a number (in milliseconds)');
      }
    }

    return null;
  };
}

var nameShape = exports.nameShape = _propTypes2.default.oneOfType([_propTypes2.default.string, _propTypes2.default.shape({
  enter: _propTypes2.default.string,
  leave: _propTypes2.default.string,
  active: _propTypes2.default.string
}), _propTypes2.default.shape({
  enter: _propTypes2.default.string,
  enterActive: _propTypes2.default.string,
  leave: _propTypes2.default.string,
  leaveActive: _propTypes2.default.string,
  appear: _propTypes2.default.string,
  appearActive: _propTypes2.default.string
})]);

/***/ }),
/* 21 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

Object.defineProperty(exports, "__esModule", { value: true });
var Tools_1 = __webpack_require__(3);
exports.requestDataFromEndpointState = function (classRegistry, baseUrl, endpoint) {
    var url = baseUrl;
    var postData = "";
    var postable = endpoint.verb !== "GET";
    var onlyFinalUrlPartHasParams = endpoint.url_parts.reduce(function (accumulator, currentUrlPart, index, array) {
        if (!accumulator) {
            return accumulator;
        }
        var finalPart = index === array.length - 1;
        var hasParams = currentUrlPart.params.length > 0;
        return finalPart ? hasParams : !hasParams;
    }, true);
    for (var i = 0; i < endpoint.url_parts.length; i++) {
        var urlPart = endpoint.url_parts[i];
        var lastPart = i === endpoint.url_parts.length - 1;
        switch (urlPart.type) {
            case "NAME":
                url += "/" + urlPart.value;
                if (lastPart && postable) {
                    postData = paramsAsArgObj(classRegistry, urlPart.params, function (v) { return v; });
                }
                else if (lastPart && onlyFinalUrlPartHasParams) {
                    url += queryParams(classRegistry, urlPart.params);
                }
                else {
                    url += paramsInPath(classRegistry, urlPart.params);
                }
                break;
            case "ID":
                var paramVal = urlPart.value.type === "String"
                    ? urlPart.value.user_value
                    : stringifyWithoutNulls(urlPart.value.user_value, encode);
                if (paramVal === undefined) {
                    throw new Error("Invalid state");
                }
                url += "/" + paramVal;
                if (lastPart && postable) {
                    postData = paramsAsArgObj(classRegistry, urlPart.params);
                }
                else if (lastPart && onlyFinalUrlPartHasParams) {
                    url += queryParams(classRegistry, urlPart.params);
                }
                else {
                    url += paramsInPath(classRegistry, urlPart.params);
                }
                break;
            /* istanbul ignore next */
            default:
                return Tools_1.assertExhaustive(urlPart);
        }
    }
    return ({
        verb: endpoint.verb,
        url: url,
        postData: postData,
    });
};
var paramsAsArgObj = function (classRegistry, params, encoder) {
    if (encoder === void 0) { encoder = escape; }
    if (params.length === 0) {
        return "{}";
    }
    else if (isSingleComplexParam(classRegistry, params)) {
        if (params[0].user_value === undefined || params[0].user_value === null) {
            return "{}";
        }
        else {
            return stringifyWithoutNulls(stripPrefixes(params[0].user_value), encoder);
        }
    }
    else {
        var o = {};
        for (var _i = 0, params_1 = params; _i < params_1.length; _i++) {
            var param = params_1[_i];
            if (param.dirty.length > 0 || isArrayOrMapType(param.type)) {
                o[param.name] = param.user_value;
            }
        }
        return stringifyWithoutNulls(stripPrefixes(o), encoder);
    }
};
var paramsInPath = function (classRegistry, params) {
    if (params.length === 0) {
        return "";
    }
    var serializedParams = paramsAsArgObj(classRegistry, params, encode);
    if (serializedParams === "{}") {
        return "";
    }
    return "!" + serializedParams;
};
var queryParams = function (classRegistry, params) {
    if (params.length === 0) {
        return "";
    }
    var query = "?";
    for (var _i = 0, params_2 = params; _i < params_2.length; _i++) {
        var param = params_2[_i];
        if (param.dirty.length > 0 || isArrayOrMapType(param.type)) {
            var paramRepr = queryParamRepr(classRegistry, param);
            if (paramRepr !== undefined && paramRepr !== null) {
                query += encode(param.name) + "=" + paramRepr + "&";
            }
        }
    }
    return query.slice(0, query.length - 1); // Remove final trailing &
};
var queryParamRepr = function (classRegistry, param) {
    if (param.user_value === null || param.user_value === undefined) {
        return param.user_value;
    }
    if (param.type === "[Byte]") {
        return encode(param.user_value);
    }
    if (isArrayOrMapType(param.type)) {
        return stringifyWithoutNulls(stripPrefixes(param.user_value), encode);
    }
    if (param.type === "Json") {
        return stringifyWithoutNulls(stripPrefixes(param.user_value), encode);
    }
    if (!(param.type in classRegistry)) {
        return encode(param.user_value);
    }
    switch (classRegistry[param.type].type) {
        case "ENUM":
            return encode(param.user_value);
        default:
            return stringifyWithoutNulls(stripPrefixes(param.user_value), encode);
    }
};
var isSingleComplexParam = function (classRegistry, params) {
    return params.length === 1 && (params[0].type in classRegistry || params[0].type[0] === "{");
};
var isArrayOrMapType = function (type) {
    return type[0] === "[" || type[0] === "{";
};
var stringifyWithoutNulls = function (obj, encoder) {
    if (encoder === void 0) { encoder = escape; }
    return JSON.stringify(obj, function (k, v) {
        if (v === null) {
            return undefined;
        }
        return encoder(v);
    });
};
var encode = function (value) {
    if (typeof value === "string") {
        return encodeURIComponent(escape(value));
    }
    else {
        return value;
    }
};
var escape = function (value) {
    if (typeof value === "string") {
        return value.replace(/"/g, '\\"');
    }
    else {
        return value;
    }
};
var CUSTOM_MAP_KEY_PREFIX_PATTERN = /(^\d+_)(.*)/;
var stripPrefixes = function (o) {
    if (o === undefined || o === null) {
        return o;
    }
    if (typeof o !== "object") {
        return o;
    }
    if (Array.isArray(o)) {
        var newArr = [];
        for (var _i = 0, o_1 = o; _i < o_1.length; _i++) {
            var prefix = o_1[_i];
            newArr.push(stripPrefixes(prefix));
        }
        return newArr;
    }
    var newObj = {};
    var sortedKeys = Object.keys(o).sort();
    for (var _a = 0, sortedKeys_1 = sortedKeys; _a < sortedKeys_1.length; _a++) {
        var k = sortedKeys_1[_a];
        var match = k.match(CUSTOM_MAP_KEY_PREFIX_PATTERN);
        var recurse = stripPrefixes(o[k]);
        if (match == null) {
            newObj[k] = recurse;
        }
        else {
            newObj[match[2]] = recurse;
        }
    }
    return newObj;
};


/***/ }),
/* 22 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

var __assign = (this && this.__assign) || Object.assign || function(t) {
    for (var s, i = 1, n = arguments.length; i < n; i++) {
        s = arguments[i];
        for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
            t[p] = s[p];
    }
    return t;
};
Object.defineProperty(exports, "__esModule", { value: true });
var React = __webpack_require__(0);
var Tools_1 = __webpack_require__(3);
var MODAL_DELAY = 350; // controls how long to delay before a sustained mouse-over will pop up the type def
exports.TypeReprSummary = function (props) { return typeRepr(props, props.type); };
var ARRAY_PATTERN = /^\[(.+)\]$/;
var OBJECT_PATTERN = /^\{(.+)\}$/;
var typeRepr = function (props, type) {
    if (type.match(ARRAY_PATTERN)) {
        return React.createElement("span", null,
            "[",
            typeRepr(props, type.substr(1, type.length - 2)),
            "]");
    }
    if (type.match(OBJECT_PATTERN)) {
        return React.createElement("span", null,
            "{",
            typeRepr(props, type.substr(1, type.length - 2)),
            "}");
    }
    switch (type) {
        case "Boolean":
        case "Byte":
        case "Short":
        case "Integer":
        case "Long":
        case "Float":
        case "Double":
        case "Character":
        case "String":
        case "Json":
            return React.createElement("span", null, type);
        default:
            return popover(__assign({}, props, { type: type }));
    }
};
var popover = function (props) {
    return (React.createElement("span", { className: "typedef-trigger", onClick: function (e) { props.actions.openTypeDef(props.type); e.stopPropagation(); } }, props.type));
};
var Cancellable = /** @class */ (function () {
    function Cancellable() {
        this.cancelled = false;
    }
    return Cancellable;
}());
exports.TypeRepr = function (props) {
    return (React.createElement("div", null,
        React.createElement("div", { className: "form-group" }, pseudoJsonRepr(props))));
};
// re-implementation of BrowserApp.generateDoc
// (this one behaves similarly but deals in React elements, including embedding TypeRepr components)
var pseudoJsonRepr = function (props) {
    if (props.state.typeDefOpenFor === null) {
        return React.createElement("span", null, "Empty");
    }
    var tv = props.classRegistry[props.state.typeDefOpenFor];
    if (tv === undefined) {
        throw new Error("Unknown type: " + props.state.typeDefOpenFor);
    }
    switch (tv.type) {
        case "DATA": {
            var preElementArgs = ["pre", {}, "{\n"];
            var largestDef = 0;
            var defns = [];
            for (var i = 0; i < tv.constructor.length; i++) {
                var parameter = tv.constructor[i];
                defns[i] = {
                    textLength: ("\"" + parameter.name + "\": " + parameter.type + "}").length,
                    args: [
                        '"',
                        React.createElement("span", null, parameter.name),
                        '": ',
                        React.createElement(exports.TypeReprSummary, { type: parameter.type, actions: props.actions }),
                    ],
                };
                if (defns[i].textLength > largestDef) {
                    largestDef = defns[i].textLength;
                }
            }
            for (var i = 0; i < tv.constructor.length; i++) {
                var lastParam = i === tv.constructor.length - 1;
                var parameter = tv.constructor[i];
                var def = defns[i];
                preElementArgs.push("  ");
                preElementArgs.push.apply(preElementArgs, def.args);
                if (!lastParam) {
                    preElementArgs.push(",");
                }
                if (parameter.doc !== undefined || parameter.default !== undefined) {
                    if (lastParam) {
                        preElementArgs.push(" ");
                    }
                    for (var j = 0; j < largestDef - def.textLength; j++) {
                        preElementArgs.push(" ");
                    }
                    preElementArgs.push(" // ");
                }
                if (parameter.doc !== undefined) {
                    preElementArgs.push(React.createElement("span", null, parameter.doc.replace(/\s+/g, " ")));
                }
                if (parameter.default !== undefined) {
                    if (parameter.doc !== undefined) {
                        preElementArgs.push(", ");
                    }
                    preElementArgs.push(React.createElement("span", null, "defaults to: " + JSON.stringify(parameter.default)));
                }
                preElementArgs.push("\n");
            }
            preElementArgs.push("}");
            // NB. using React.createElement() to avoid needlessly using lots of sub-elements
            return React.createElement.apply(null, preElementArgs);
        }
        case "ENUM": {
            var preElementArgs = ["pre", {}];
            var largestDef = 0;
            var defns = [];
            for (var i = 0; i < tv.values.length; i++) {
                var value = tv.values[i];
                var enumDef = "\"" + value.name + "\"";
                defns[i] = {
                    textLength: enumDef.length,
                    args: [React.createElement("span", null, enumDef)],
                };
                if (defns[i].textLength > largestDef) {
                    largestDef = defns[i].textLength;
                }
            }
            for (var i = 0; i < tv.values.length; i++) {
                var value = tv.values[i];
                var def = defns[i];
                preElementArgs.push.apply(preElementArgs, def.args);
                if (value.doc !== undefined) {
                    for (var j = 0; j < largestDef - def.textLength; j++) {
                        preElementArgs.push(" ");
                    }
                    preElementArgs.push(" // ");
                    preElementArgs.push(React.createElement("span", null, value.doc.replace(/\s+/g, " ")));
                }
                preElementArgs.push("\n");
            }
            // NB. using React.createElement() to avoid needlessly using lots of sub-elements
            return React.createElement.apply(null, preElementArgs);
        }
        case "POLYMORPHIC_DATA": {
            return React.createElement("pre", null, tv.implementations.map(function (impl) {
                return React.createElement("span", { key: impl },
                    React.createElement(exports.TypeReprSummary, { type: impl, actions: props.actions }),
                    React.createElement("br", null));
            }));
        }
        /* istanbul ignore next */
        default:
            Tools_1.assertExhaustive(tv);
            return React.createElement("pre", null);
    }
};


/***/ }),
/* 23 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

Object.defineProperty(exports, "__esModule", { value: true });
var React = __webpack_require__(0);
var ReactDOM = __webpack_require__(6);
var Redux = __webpack_require__(24);
var App_1 = __webpack_require__(39);
var Endpoints_1 = __webpack_require__(40);
var Reducer_1 = __webpack_require__(72);
var store = Redux.createStore(Reducer_1.reducerFactory(window.CLASS_REGISTRY, window.ENDPOINTS));
var render = function () {
    ReactDOM.render(React.createElement(Endpoints_1.Endpoints, { classRegistry: window.CLASS_REGISTRY, state: store.getState(), actions: new App_1.Actions(store) }), document.getElementById("endpoints"));
};
store.subscribe(render);
render();


/***/ }),
/* 24 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* WEBPACK VAR INJECTION */(function(process) {/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__createStore__ = __webpack_require__(12);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__combineReducers__ = __webpack_require__(36);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__bindActionCreators__ = __webpack_require__(37);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__applyMiddleware__ = __webpack_require__(38);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__compose__ = __webpack_require__(16);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__utils_warning__ = __webpack_require__(15);
/* harmony reexport (binding) */ __webpack_require__.d(__webpack_exports__, "createStore", function() { return __WEBPACK_IMPORTED_MODULE_0__createStore__["b"]; });
/* harmony reexport (binding) */ __webpack_require__.d(__webpack_exports__, "combineReducers", function() { return __WEBPACK_IMPORTED_MODULE_1__combineReducers__["a"]; });
/* harmony reexport (binding) */ __webpack_require__.d(__webpack_exports__, "bindActionCreators", function() { return __WEBPACK_IMPORTED_MODULE_2__bindActionCreators__["a"]; });
/* harmony reexport (binding) */ __webpack_require__.d(__webpack_exports__, "applyMiddleware", function() { return __WEBPACK_IMPORTED_MODULE_3__applyMiddleware__["a"]; });
/* harmony reexport (binding) */ __webpack_require__.d(__webpack_exports__, "compose", function() { return __WEBPACK_IMPORTED_MODULE_4__compose__["a"]; });







/*
* This is a dummy function to check if the function name has been altered by minification.
* If the function has been minified and NODE_ENV !== 'production', warn the user.
*/
function isCrushed() {}

if (process.env.NODE_ENV !== 'production' && typeof isCrushed.name === 'string' && isCrushed.name !== 'isCrushed') {
  Object(__WEBPACK_IMPORTED_MODULE_5__utils_warning__["a" /* default */])('You are currently using minified code outside of NODE_ENV === \'production\'. ' + 'This means that you are running a slower development build of Redux. ' + 'You can use loose-envify (https://github.com/zertosh/loose-envify) for browserify ' + 'or DefinePlugin for webpack (http://stackoverflow.com/questions/30030031) ' + 'to ensure you have the correct code for your production build.');
}


/* WEBPACK VAR INJECTION */}.call(__webpack_exports__, __webpack_require__(1)))

/***/ }),
/* 25 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__Symbol_js__ = __webpack_require__(14);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__getRawTag_js__ = __webpack_require__(28);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__objectToString_js__ = __webpack_require__(29);




/** `Object#toString` result references. */
var nullTag = '[object Null]',
    undefinedTag = '[object Undefined]';

/** Built-in value references. */
var symToStringTag = __WEBPACK_IMPORTED_MODULE_0__Symbol_js__["a" /* default */] ? __WEBPACK_IMPORTED_MODULE_0__Symbol_js__["a" /* default */].toStringTag : undefined;

/**
 * The base implementation of `getTag` without fallbacks for buggy environments.
 *
 * @private
 * @param {*} value The value to query.
 * @returns {string} Returns the `toStringTag`.
 */
function baseGetTag(value) {
  if (value == null) {
    return value === undefined ? undefinedTag : nullTag;
  }
  return (symToStringTag && symToStringTag in Object(value))
    ? Object(__WEBPACK_IMPORTED_MODULE_1__getRawTag_js__["a" /* default */])(value)
    : Object(__WEBPACK_IMPORTED_MODULE_2__objectToString_js__["a" /* default */])(value);
}

/* harmony default export */ __webpack_exports__["a"] = (baseGetTag);


/***/ }),
/* 26 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__freeGlobal_js__ = __webpack_require__(27);


/** Detect free variable `self`. */
var freeSelf = typeof self == 'object' && self && self.Object === Object && self;

/** Used as a reference to the global object. */
var root = __WEBPACK_IMPORTED_MODULE_0__freeGlobal_js__["a" /* default */] || freeSelf || Function('return this')();

/* harmony default export */ __webpack_exports__["a"] = (root);


/***/ }),
/* 27 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* WEBPACK VAR INJECTION */(function(global) {/** Detect free variable `global` from Node.js. */
var freeGlobal = typeof global == 'object' && global && global.Object === Object && global;

/* harmony default export */ __webpack_exports__["a"] = (freeGlobal);

/* WEBPACK VAR INJECTION */}.call(__webpack_exports__, __webpack_require__(7)))

/***/ }),
/* 28 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__Symbol_js__ = __webpack_require__(14);


/** Used for built-in method references. */
var objectProto = Object.prototype;

/** Used to check objects for own properties. */
var hasOwnProperty = objectProto.hasOwnProperty;

/**
 * Used to resolve the
 * [`toStringTag`](http://ecma-international.org/ecma-262/7.0/#sec-object.prototype.tostring)
 * of values.
 */
var nativeObjectToString = objectProto.toString;

/** Built-in value references. */
var symToStringTag = __WEBPACK_IMPORTED_MODULE_0__Symbol_js__["a" /* default */] ? __WEBPACK_IMPORTED_MODULE_0__Symbol_js__["a" /* default */].toStringTag : undefined;

/**
 * A specialized version of `baseGetTag` which ignores `Symbol.toStringTag` values.
 *
 * @private
 * @param {*} value The value to query.
 * @returns {string} Returns the raw `toStringTag`.
 */
function getRawTag(value) {
  var isOwn = hasOwnProperty.call(value, symToStringTag),
      tag = value[symToStringTag];

  try {
    value[symToStringTag] = undefined;
    var unmasked = true;
  } catch (e) {}

  var result = nativeObjectToString.call(value);
  if (unmasked) {
    if (isOwn) {
      value[symToStringTag] = tag;
    } else {
      delete value[symToStringTag];
    }
  }
  return result;
}

/* harmony default export */ __webpack_exports__["a"] = (getRawTag);


/***/ }),
/* 29 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/** Used for built-in method references. */
var objectProto = Object.prototype;

/**
 * Used to resolve the
 * [`toStringTag`](http://ecma-international.org/ecma-262/7.0/#sec-object.prototype.tostring)
 * of values.
 */
var nativeObjectToString = objectProto.toString;

/**
 * Converts `value` to a string using `Object.prototype.toString`.
 *
 * @private
 * @param {*} value The value to convert.
 * @returns {string} Returns the converted string.
 */
function objectToString(value) {
  return nativeObjectToString.call(value);
}

/* harmony default export */ __webpack_exports__["a"] = (objectToString);


/***/ }),
/* 30 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__overArg_js__ = __webpack_require__(31);


/** Built-in value references. */
var getPrototype = Object(__WEBPACK_IMPORTED_MODULE_0__overArg_js__["a" /* default */])(Object.getPrototypeOf, Object);

/* harmony default export */ __webpack_exports__["a"] = (getPrototype);


/***/ }),
/* 31 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/**
 * Creates a unary function that invokes `func` with its argument transformed.
 *
 * @private
 * @param {Function} func The function to wrap.
 * @param {Function} transform The argument transform.
 * @returns {Function} Returns the new function.
 */
function overArg(func, transform) {
  return function(arg) {
    return func(transform(arg));
  };
}

/* harmony default export */ __webpack_exports__["a"] = (overArg);


/***/ }),
/* 32 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/**
 * Checks if `value` is object-like. A value is object-like if it's not `null`
 * and has a `typeof` result of "object".
 *
 * @static
 * @memberOf _
 * @since 4.0.0
 * @category Lang
 * @param {*} value The value to check.
 * @returns {boolean} Returns `true` if `value` is object-like, else `false`.
 * @example
 *
 * _.isObjectLike({});
 * // => true
 *
 * _.isObjectLike([1, 2, 3]);
 * // => true
 *
 * _.isObjectLike(_.noop);
 * // => false
 *
 * _.isObjectLike(null);
 * // => false
 */
function isObjectLike(value) {
  return value != null && typeof value == 'object';
}

/* harmony default export */ __webpack_exports__["a"] = (isObjectLike);


/***/ }),
/* 33 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* WEBPACK VAR INJECTION */(function(global, module) {/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__ponyfill_js__ = __webpack_require__(35);
/* global window */


var root;

if (typeof self !== 'undefined') {
  root = self;
} else if (typeof window !== 'undefined') {
  root = window;
} else if (typeof global !== 'undefined') {
  root = global;
} else if (true) {
  root = module;
} else {
  root = Function('return this')();
}

var result = Object(__WEBPACK_IMPORTED_MODULE_0__ponyfill_js__["a" /* default */])(root);
/* harmony default export */ __webpack_exports__["a"] = (result);

/* WEBPACK VAR INJECTION */}.call(__webpack_exports__, __webpack_require__(7), __webpack_require__(34)(module)))

/***/ }),
/* 34 */
/***/ (function(module, exports) {

module.exports = function(originalModule) {
	if(!originalModule.webpackPolyfill) {
		var module = Object.create(originalModule);
		// module.parent = undefined by default
		if(!module.children) module.children = [];
		Object.defineProperty(module, "loaded", {
			enumerable: true,
			get: function() {
				return module.l;
			}
		});
		Object.defineProperty(module, "id", {
			enumerable: true,
			get: function() {
				return module.i;
			}
		});
		Object.defineProperty(module, "exports", {
			enumerable: true,
		});
		module.webpackPolyfill = 1;
	}
	return module;
};


/***/ }),
/* 35 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (immutable) */ __webpack_exports__["a"] = symbolObservablePonyfill;
function symbolObservablePonyfill(root) {
	var result;
	var Symbol = root.Symbol;

	if (typeof Symbol === 'function') {
		if (Symbol.observable) {
			result = Symbol.observable;
		} else {
			result = Symbol('observable');
			Symbol.observable = result;
		}
	} else {
		result = '@@observable';
	}

	return result;
};


/***/ }),
/* 36 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* WEBPACK VAR INJECTION */(function(process) {/* harmony export (immutable) */ __webpack_exports__["a"] = combineReducers;
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__createStore__ = __webpack_require__(12);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_lodash_es_isPlainObject__ = __webpack_require__(13);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__utils_warning__ = __webpack_require__(15);




function getUndefinedStateErrorMessage(key, action) {
  var actionType = action && action.type;
  var actionName = actionType && '"' + actionType.toString() + '"' || 'an action';

  return 'Given action ' + actionName + ', reducer "' + key + '" returned undefined. ' + 'To ignore an action, you must explicitly return the previous state. ' + 'If you want this reducer to hold no value, you can return null instead of undefined.';
}

function getUnexpectedStateShapeWarningMessage(inputState, reducers, action, unexpectedKeyCache) {
  var reducerKeys = Object.keys(reducers);
  var argumentName = action && action.type === __WEBPACK_IMPORTED_MODULE_0__createStore__["a" /* ActionTypes */].INIT ? 'preloadedState argument passed to createStore' : 'previous state received by the reducer';

  if (reducerKeys.length === 0) {
    return 'Store does not have a valid reducer. Make sure the argument passed ' + 'to combineReducers is an object whose values are reducers.';
  }

  if (!Object(__WEBPACK_IMPORTED_MODULE_1_lodash_es_isPlainObject__["a" /* default */])(inputState)) {
    return 'The ' + argumentName + ' has unexpected type of "' + {}.toString.call(inputState).match(/\s([a-z|A-Z]+)/)[1] + '". Expected argument to be an object with the following ' + ('keys: "' + reducerKeys.join('", "') + '"');
  }

  var unexpectedKeys = Object.keys(inputState).filter(function (key) {
    return !reducers.hasOwnProperty(key) && !unexpectedKeyCache[key];
  });

  unexpectedKeys.forEach(function (key) {
    unexpectedKeyCache[key] = true;
  });

  if (unexpectedKeys.length > 0) {
    return 'Unexpected ' + (unexpectedKeys.length > 1 ? 'keys' : 'key') + ' ' + ('"' + unexpectedKeys.join('", "') + '" found in ' + argumentName + '. ') + 'Expected to find one of the known reducer keys instead: ' + ('"' + reducerKeys.join('", "') + '". Unexpected keys will be ignored.');
  }
}

function assertReducerShape(reducers) {
  Object.keys(reducers).forEach(function (key) {
    var reducer = reducers[key];
    var initialState = reducer(undefined, { type: __WEBPACK_IMPORTED_MODULE_0__createStore__["a" /* ActionTypes */].INIT });

    if (typeof initialState === 'undefined') {
      throw new Error('Reducer "' + key + '" returned undefined during initialization. ' + 'If the state passed to the reducer is undefined, you must ' + 'explicitly return the initial state. The initial state may ' + 'not be undefined. If you don\'t want to set a value for this reducer, ' + 'you can use null instead of undefined.');
    }

    var type = '@@redux/PROBE_UNKNOWN_ACTION_' + Math.random().toString(36).substring(7).split('').join('.');
    if (typeof reducer(undefined, { type: type }) === 'undefined') {
      throw new Error('Reducer "' + key + '" returned undefined when probed with a random type. ' + ('Don\'t try to handle ' + __WEBPACK_IMPORTED_MODULE_0__createStore__["a" /* ActionTypes */].INIT + ' or other actions in "redux/*" ') + 'namespace. They are considered private. Instead, you must return the ' + 'current state for any unknown actions, unless it is undefined, ' + 'in which case you must return the initial state, regardless of the ' + 'action type. The initial state may not be undefined, but can be null.');
    }
  });
}

/**
 * Turns an object whose values are different reducer functions, into a single
 * reducer function. It will call every child reducer, and gather their results
 * into a single state object, whose keys correspond to the keys of the passed
 * reducer functions.
 *
 * @param {Object} reducers An object whose values correspond to different
 * reducer functions that need to be combined into one. One handy way to obtain
 * it is to use ES6 `import * as reducers` syntax. The reducers may never return
 * undefined for any action. Instead, they should return their initial state
 * if the state passed to them was undefined, and the current state for any
 * unrecognized action.
 *
 * @returns {Function} A reducer function that invokes every reducer inside the
 * passed object, and builds a state object with the same shape.
 */
function combineReducers(reducers) {
  var reducerKeys = Object.keys(reducers);
  var finalReducers = {};
  for (var i = 0; i < reducerKeys.length; i++) {
    var key = reducerKeys[i];

    if (process.env.NODE_ENV !== 'production') {
      if (typeof reducers[key] === 'undefined') {
        Object(__WEBPACK_IMPORTED_MODULE_2__utils_warning__["a" /* default */])('No reducer provided for key "' + key + '"');
      }
    }

    if (typeof reducers[key] === 'function') {
      finalReducers[key] = reducers[key];
    }
  }
  var finalReducerKeys = Object.keys(finalReducers);

  var unexpectedKeyCache = void 0;
  if (process.env.NODE_ENV !== 'production') {
    unexpectedKeyCache = {};
  }

  var shapeAssertionError = void 0;
  try {
    assertReducerShape(finalReducers);
  } catch (e) {
    shapeAssertionError = e;
  }

  return function combination() {
    var state = arguments.length > 0 && arguments[0] !== undefined ? arguments[0] : {};
    var action = arguments[1];

    if (shapeAssertionError) {
      throw shapeAssertionError;
    }

    if (process.env.NODE_ENV !== 'production') {
      var warningMessage = getUnexpectedStateShapeWarningMessage(state, finalReducers, action, unexpectedKeyCache);
      if (warningMessage) {
        Object(__WEBPACK_IMPORTED_MODULE_2__utils_warning__["a" /* default */])(warningMessage);
      }
    }

    var hasChanged = false;
    var nextState = {};
    for (var _i = 0; _i < finalReducerKeys.length; _i++) {
      var _key = finalReducerKeys[_i];
      var reducer = finalReducers[_key];
      var previousStateForKey = state[_key];
      var nextStateForKey = reducer(previousStateForKey, action);
      if (typeof nextStateForKey === 'undefined') {
        var errorMessage = getUndefinedStateErrorMessage(_key, action);
        throw new Error(errorMessage);
      }
      nextState[_key] = nextStateForKey;
      hasChanged = hasChanged || nextStateForKey !== previousStateForKey;
    }
    return hasChanged ? nextState : state;
  };
}
/* WEBPACK VAR INJECTION */}.call(__webpack_exports__, __webpack_require__(1)))

/***/ }),
/* 37 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (immutable) */ __webpack_exports__["a"] = bindActionCreators;
function bindActionCreator(actionCreator, dispatch) {
  return function () {
    return dispatch(actionCreator.apply(undefined, arguments));
  };
}

/**
 * Turns an object whose values are action creators, into an object with the
 * same keys, but with every function wrapped into a `dispatch` call so they
 * may be invoked directly. This is just a convenience method, as you can call
 * `store.dispatch(MyActionCreators.doSomething())` yourself just fine.
 *
 * For convenience, you can also pass a single function as the first argument,
 * and get a function in return.
 *
 * @param {Function|Object} actionCreators An object whose values are action
 * creator functions. One handy way to obtain it is to use ES6 `import * as`
 * syntax. You may also pass a single function.
 *
 * @param {Function} dispatch The `dispatch` function available on your Redux
 * store.
 *
 * @returns {Function|Object} The object mimicking the original object, but with
 * every action creator wrapped into the `dispatch` call. If you passed a
 * function as `actionCreators`, the return value will also be a single
 * function.
 */
function bindActionCreators(actionCreators, dispatch) {
  if (typeof actionCreators === 'function') {
    return bindActionCreator(actionCreators, dispatch);
  }

  if (typeof actionCreators !== 'object' || actionCreators === null) {
    throw new Error('bindActionCreators expected an object or a function, instead received ' + (actionCreators === null ? 'null' : typeof actionCreators) + '. ' + 'Did you write "import ActionCreators from" instead of "import * as ActionCreators from"?');
  }

  var keys = Object.keys(actionCreators);
  var boundActionCreators = {};
  for (var i = 0; i < keys.length; i++) {
    var key = keys[i];
    var actionCreator = actionCreators[key];
    if (typeof actionCreator === 'function') {
      boundActionCreators[key] = bindActionCreator(actionCreator, dispatch);
    }
  }
  return boundActionCreators;
}

/***/ }),
/* 38 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (immutable) */ __webpack_exports__["a"] = applyMiddleware;
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__compose__ = __webpack_require__(16);
var _extends = Object.assign || function (target) { for (var i = 1; i < arguments.length; i++) { var source = arguments[i]; for (var key in source) { if (Object.prototype.hasOwnProperty.call(source, key)) { target[key] = source[key]; } } } return target; };



/**
 * Creates a store enhancer that applies middleware to the dispatch method
 * of the Redux store. This is handy for a variety of tasks, such as expressing
 * asynchronous actions in a concise manner, or logging every action payload.
 *
 * See `redux-thunk` package as an example of the Redux middleware.
 *
 * Because middleware is potentially asynchronous, this should be the first
 * store enhancer in the composition chain.
 *
 * Note that each middleware will be given the `dispatch` and `getState` functions
 * as named arguments.
 *
 * @param {...Function} middlewares The middleware chain to be applied.
 * @returns {Function} A store enhancer applying the middleware.
 */
function applyMiddleware() {
  for (var _len = arguments.length, middlewares = Array(_len), _key = 0; _key < _len; _key++) {
    middlewares[_key] = arguments[_key];
  }

  return function (createStore) {
    return function (reducer, preloadedState, enhancer) {
      var store = createStore(reducer, preloadedState, enhancer);
      var _dispatch = store.dispatch;
      var chain = [];

      var middlewareAPI = {
        getState: store.getState,
        dispatch: function dispatch(action) {
          return _dispatch(action);
        }
      };
      chain = middlewares.map(function (middleware) {
        return middleware(middlewareAPI);
      });
      _dispatch = __WEBPACK_IMPORTED_MODULE_0__compose__["a" /* default */].apply(undefined, chain)(store.dispatch);

      return _extends({}, store, {
        dispatch: _dispatch
      });
    };
  };
}

/***/ }),
/* 39 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

Object.defineProperty(exports, "__esModule", { value: true });
var Actions = /** @class */ (function () {
    function Actions(store) {
        var _this = this;
        this.toolkitSetValue = function (dirtyPath, valuePath, value) {
            _this.store.dispatch({
                type: "TOOLKIT_SET_VALUE",
                dirtyPath: dirtyPath,
                valuePath: valuePath,
                value: value,
            });
        };
        this.toolkitClearValue = function (dirtyPath, valuePath, value, reset) {
            if (reset === void 0) { reset = false; }
            _this.store.dispatch({
                type: "TOOLKIT_CLEAR_VALUE",
                dirtyPath: dirtyPath,
                valuePath: valuePath,
                value: value,
                reset: reset,
            });
        };
        this.toolkitNullValue = function (dirtyPath, valuePath) {
            _this.store.dispatch({
                type: "TOOLKIT_NULL_VALUE",
                dirtyPath: dirtyPath,
                valuePath: valuePath,
            });
        };
        this.toolkitProvideValue = function (dirtyPath, valuePath, type) {
            _this.store.dispatch({
                type: "TOOLKIT_PROVIDE_VALUE",
                dirtyPath: dirtyPath,
                valuePath: valuePath,
                value_type: type,
            });
        };
        this.toolkitRenameKey = function (path, key, value) {
            _this.store.dispatch({
                type: "TOOLKIT_RENAME_KEY",
                path: path,
                key: key,
                value: value,
            });
        };
        this.toolkitAddRow = function (dirtyPath, valuePath, type) {
            _this.store.dispatch({
                type: "TOOLKIT_ADD_ROW",
                dirtyPath: dirtyPath,
                valuePath: valuePath,
                row_type: type,
            });
        };
        this.toolkitRemoveRow = function (dirtyPath, valuePath, key) {
            _this.store.dispatch({
                type: "TOOLKIT_REMOVE_ROW",
                dirtyPath: dirtyPath,
                valuePath: valuePath,
                key: key,
            });
        };
        this.openToolkit = function (endpointIndex) {
            _this.store.dispatch({
                type: "OPEN_TOOLKIT",
                endpointIndex: endpointIndex,
            });
        };
        this.closeToolkit = function () {
            _this.store.dispatch({
                type: "CLOSE_TOOLKIT",
            });
        };
        this.openTypeDef = function (type) {
            _this.store.dispatch({
                type: "OPEN_TYPEDEF",
                typeName: type,
            });
        };
        this.closeTypeDef = function () {
            _this.store.dispatch({
                type: "CLOSE_TYPEDEF",
            });
        };
        this.apiResponseReceived = function (endpointIdx, response) {
            _this.store.dispatch({
                type: "API_RESPONSE_RECEIVED",
                endpointIdx: endpointIdx,
                response: response,
            });
        };
        this.apiResponseCleared = function (endpointIdx) {
            _this.store.dispatch({
                type: "API_RESPONSE_RECEIVED",
                endpointIdx: endpointIdx,
            });
        };
        this.store = store;
    }
    return Actions;
}());
exports.Actions = Actions;


/***/ }),
/* 40 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

Object.defineProperty(exports, "__esModule", { value: true });
var React = __webpack_require__(0);
var Tools_1 = __webpack_require__(3);
var HOModal_1 = __webpack_require__(41);
var Toolkit_1 = __webpack_require__(63);
var TypeRepr_1 = __webpack_require__(22);
var endpointPartsToString = function (props, urlParts) {
    var str = [];
    urlParts.forEach(function (urlPart, index) {
        switch (urlPart.type) {
            case "NAME":
                str.push("/" + urlPart.value);
                break;
            case "ID":
                str.push(React.createElement("span", { key: urlPart.value.name + "_" + index }, "/[" + urlPart.value.name + ": "));
                str.push(React.createElement(TypeRepr_1.TypeReprSummary, { key: urlPart.value.type + "_" + index, type: urlPart.value.type, actions: props.actions }));
                str.push("]");
                break;
            /* istanbul ignore next */
            default:
                Tools_1.assertExhaustive(urlPart);
        }
    });
    return React.createElement("span", null, str.reduce(function (current, next) {
        if (typeof next === "string" && typeof current[current.length - 1] === "string") {
            current[current.length - 1] = (current[current.length - 1] + next);
        }
        else {
            current.push(next);
        }
        return current;
    }, []));
};
var endpointPartsToParamsElement = function (props, urlParts) {
    var lastPart = urlParts[urlParts.length - 1];
    switch (lastPart.params.length) {
        case 0:
            return React.createElement("span", { className: "type-wrapper" }, "{ }");
        default:
            return React.createElement("span", null,
                React.createElement("span", { className: "type-wrapper" }, "{"),
                Tools_1.joinElements(lastPart.params.map(function (p, idx) { return React.createElement("span", { key: idx },
                    React.createElement("span", { className: "type-wrapper" }, "\""),
                    React.createElement("span", null, p.name),
                    React.createElement("span", { className: "type-wrapper" }, "\""),
                    ": ",
                    React.createElement(TypeRepr_1.TypeReprSummary, { type: p.type, actions: props.actions })); })),
                React.createElement("span", { className: "type-wrapper" }, "}"));
    }
};
var codeToElement = function (props, retVal) {
    switch (retVal.code) {
        case 200:
            if (!retVal.type) {
                throw new Error("Expected type for a 200 response code");
            }
            return React.createElement("span", null,
                React.createElement("span", null, "200 OK, "),
                React.createElement(TypeRepr_1.TypeReprSummary, { type: retVal.type, actions: props.actions }));
        case 201:
            return React.createElement("span", null, "201 Created, Location header");
        case 202:
            return React.createElement("span", null, "202 Accepted");
        case 204:
            return React.createElement("span", null, "204 No Content");
        default:
            throw new Error("Unexpected code: " + retVal.code);
    }
};
var endpointPartsToReturnElement = function (props, urlParts) {
    var lastPart = urlParts[urlParts.length - 1];
    if (lastPart.ret_val === undefined) {
        throw new Error("Expected a return value on final parameter");
    }
    return React.createElement("span", null, codeToElement(props, lastPart.ret_val));
};
exports.Endpoints = function (props) {
    return (React.createElement("div", null,
        React.createElement(HOModal_1.HOModal, { isOpen: props.state.toolkitOpenFor !== null, toggle: props.actions.closeToolkit, className: "tk-modal", title: "Toolkit" },
            React.createElement(Toolkit_1.Toolkit, { classRegistry: props.classRegistry, state: props.state, actions: props.actions })),
        React.createElement(HOModal_1.HOModal, { isOpen: props.state.typeDefOpenFor !== null, toggle: props.actions.closeTypeDef, className: "td-modal", title: props.state.typeDefOpenFor === null ? "" : props.state.typeDefOpenFor },
            React.createElement(TypeRepr_1.TypeRepr, { classRegistry: props.classRegistry, state: props.state, actions: props.actions })),
        React.createElement("h1", null, "REST API"),
        React.createElement("table", { className: "table table-hover" },
            React.createElement("thead", null,
                React.createElement("tr", null,
                    React.createElement("th", null, "Verb"),
                    React.createElement("th", null, "Endpoint"),
                    React.createElement("th", null, "Parameters"),
                    React.createElement("th", null, "Response"))),
            React.createElement("tbody", null, props.state.endpoints.map(function (endpoint, idx) {
                return (React.createElement("tr", { id: "endpoint" + idx, key: idx, onClick: function () { return props.actions.openToolkit(idx); } },
                    React.createElement("td", null, endpoint.verb),
                    React.createElement("td", null, endpointPartsToString(props, endpoint.url_parts)),
                    React.createElement("td", null, endpointPartsToParamsElement(props, endpoint.url_parts)),
                    React.createElement("td", null, endpointPartsToReturnElement(props, endpoint.url_parts))));
            })))));
};


/***/ }),
/* 41 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

Object.defineProperty(exports, "__esModule", { value: true });
var React = __webpack_require__(0);
var reactstrap_1 = __webpack_require__(42);
exports.HOModal = function (props) {
    return (React.createElement(reactstrap_1.Modal, { isOpen: props.isOpen, toggle: props.toggle, className: props.className, autoFocus: false },
        React.createElement(reactstrap_1.ModalHeader, { toggle: props.toggle }, props.title),
        React.createElement(reactstrap_1.ModalBody, null, props.children)));
};


/***/ }),
/* 42 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Alert", function() { return Alert; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Container", function() { return Container; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Row", function() { return Row; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Col", function() { return Col; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Navbar", function() { return Navbar; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NavbarBrand", function() { return NavbarBrand; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NavbarToggler", function() { return NavbarToggler; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Nav", function() { return Nav; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NavItem", function() { return NavItem; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NavDropdown", function() { return NavDropdown; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NavLink", function() { return NavLink; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Breadcrumb", function() { return Breadcrumb; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BreadcrumbItem", function() { return BreadcrumbItem; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Button", function() { return Button; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ButtonDropdown", function() { return ButtonDropdown; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ButtonGroup", function() { return ButtonGroup; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ButtonToolbar", function() { return ButtonToolbar; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Dropdown", function() { return Dropdown; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DropdownItem", function() { return DropdownItem; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DropdownMenu", function() { return DropdownMenu; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DropdownToggle", function() { return DropdownToggle; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Fade", function() { return Fade; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Badge", function() { return Badge; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Card", function() { return Card; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CardLink", function() { return CardLink; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CardGroup", function() { return CardGroup; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CardDeck", function() { return CardDeck; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CardColumns", function() { return CardColumns; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CardBlock", function() { return CardBlock; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CardFooter", function() { return CardFooter; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CardHeader", function() { return CardHeader; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CardImg", function() { return CardImg; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CardImgOverlay", function() { return CardImgOverlay; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CardSubtitle", function() { return CardSubtitle; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CardText", function() { return CardText; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CardTitle", function() { return CardTitle; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Popover", function() { return Popover; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PopoverContent", function() { return PopoverContent; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PopoverTitle", function() { return PopoverTitle; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Progress", function() { return Progress; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Modal", function() { return Modal; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ModalHeader", function() { return ModalHeader; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ModalBody", function() { return ModalBody; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ModalFooter", function() { return ModalFooter; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "TetherContent", function() { return TetherContent; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Tooltip", function() { return Tooltip; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Table", function() { return Table; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ListGroup", function() { return ListGroup; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Form", function() { return Form; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FormFeedback", function() { return FormFeedback; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FormGroup", function() { return FormGroup; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FormText", function() { return FormText; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Input", function() { return Input; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "InputGroup", function() { return InputGroup; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "InputGroupAddon", function() { return InputGroupAddon; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "InputGroupButton", function() { return InputGroupButton; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Label", function() { return Label; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Media", function() { return Media; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Pagination", function() { return Pagination; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PaginationItem", function() { return PaginationItem; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PaginationLink", function() { return PaginationLink; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "TabContent", function() { return TabContent; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "TabPane", function() { return TabPane; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Jumbotron", function() { return Jumbotron; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Collapse", function() { return Collapse; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ListGroupItem", function() { return ListGroupItem; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ListGroupItemText", function() { return ListGroupItemText; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ListGroupItemHeading", function() { return ListGroupItemHeading; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UncontrolledAlert", function() { return UncontrolledAlert; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UncontrolledButtonDropdown", function() { return UncontrolledButtonDropdown; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UncontrolledDropdown", function() { return UncontrolledDropdown; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UncontrolledNavDropdown", function() { return UncontrolledNavDropdown; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UncontrolledTooltip", function() { return UncontrolledTooltip; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0_react__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0_react___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_0_react__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_prop_types__ = __webpack_require__(5);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_prop_types___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_1_prop_types__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_classnames__ = __webpack_require__(47);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_classnames___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_classnames__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_lodash_isobject__ = __webpack_require__(48);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_lodash_isobject___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_lodash_isobject__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_react_dom__ = __webpack_require__(6);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_react_dom___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_4_react_dom__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_lodash_isfunction__ = __webpack_require__(49);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_lodash_isfunction___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_5_lodash_isfunction__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6_reactstrap_tether__ = __webpack_require__(50);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6_reactstrap_tether___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_6_reactstrap_tether__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7_lodash_tonumber__ = __webpack_require__(51);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7_lodash_tonumber___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_7_lodash_tonumber__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8_react_transition_group__ = __webpack_require__(52);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8_react_transition_group___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_8_react_transition_group__);










function getTetherAttachments(placement) {
  var attachments = {};
  switch (placement) {
    case 'top':
    case 'top center':
      attachments = {
        attachment: 'bottom center',
        targetAttachment: 'top center'
      };
      break;
    case 'bottom':
    case 'bottom center':
      attachments = {
        attachment: 'top center',
        targetAttachment: 'bottom center'
      };
      break;
    case 'left':
    case 'left center':
      attachments = {
        attachment: 'middle right',
        targetAttachment: 'middle left'
      };
      break;
    case 'right':
    case 'right center':
      attachments = {
        attachment: 'middle left',
        targetAttachment: 'middle right'
      };
      break;
    case 'top left':
      attachments = {
        attachment: 'bottom left',
        targetAttachment: 'top left'
      };
      break;
    case 'top right':
      attachments = {
        attachment: 'bottom right',
        targetAttachment: 'top right'
      };
      break;
    case 'bottom left':
      attachments = {
        attachment: 'top left',
        targetAttachment: 'bottom left'
      };
      break;
    case 'bottom right':
      attachments = {
        attachment: 'top right',
        targetAttachment: 'bottom right'
      };
      break;
    case 'right top':
      attachments = {
        attachment: 'top left',
        targetAttachment: 'top right'
      };
      break;
    case 'right bottom':
      attachments = {
        attachment: 'bottom left',
        targetAttachment: 'bottom right'
      };
      break;
    case 'left top':
      attachments = {
        attachment: 'top right',
        targetAttachment: 'top left'
      };
      break;
    case 'left bottom':
      attachments = {
        attachment: 'bottom right',
        targetAttachment: 'bottom left'
      };
      break;
    default:
      attachments = {
        attachment: 'top center',
        targetAttachment: 'bottom center'
      };
  }

  return attachments;
}

var tetherAttachements = ['top', 'bottom', 'left', 'right', 'top left', 'top center', 'top right', 'right top', 'right middle', 'right bottom', 'bottom right', 'bottom center', 'bottom left', 'left top', 'left middle', 'left bottom'];

// https://github.com/twbs/bootstrap/blob/v4.0.0-alpha.4/js/src/modal.js#L436-L443
function getScrollbarWidth() {
  var scrollDiv = document.createElement('div');
  // .modal-scrollbar-measure styles // https://github.com/twbs/bootstrap/blob/v4.0.0-alpha.4/scss/_modal.scss#L106-L113
  scrollDiv.style.position = 'absolute';
  scrollDiv.style.top = '-9999px';
  scrollDiv.style.width = '50px';
  scrollDiv.style.height = '50px';
  scrollDiv.style.overflow = 'scroll';
  document.body.appendChild(scrollDiv);
  var scrollbarWidth = scrollDiv.offsetWidth - scrollDiv.clientWidth;
  document.body.removeChild(scrollDiv);
  return scrollbarWidth;
}

function setScrollbarWidth(padding) {
  document.body.style.paddingRight = padding > 0 ? padding + 'px' : null;
}

function isBodyOverflowing() {
  return document.body.clientWidth < window.innerWidth;
}

function getOriginalBodyPadding() {
  return parseInt(window.getComputedStyle(document.body, null).getPropertyValue('padding-right') || 0, 10);
}

function conditionallyUpdateScrollbar() {
  var scrollbarWidth = getScrollbarWidth();
  // https://github.com/twbs/bootstrap/blob/v4.0.0-alpha.4/js/src/modal.js#L420
  var fixedContent = document.querySelectorAll('.navbar-fixed-top, .navbar-fixed-bottom, .is-fixed')[0];
  var bodyPadding = fixedContent ? parseInt(fixedContent.style.paddingRight || 0, 10) : 0;

  if (isBodyOverflowing()) {
    setScrollbarWidth(bodyPadding + scrollbarWidth);
  }
}

function mapToCssModules(className, cssModule) {
  if (!cssModule) return className;
  return className.split(' ').map(function (c) {
    return cssModule[c] || c;
  }).join(' ');
}

/**
 * Returns a new object with the key/value pairs from `obj` that are not in the array `omitKeys`.
 */
function omit(obj, omitKeys) {
  var result = {};
  Object.keys(obj).forEach(function (key) {
    if (omitKeys.indexOf(key) === -1) {
      result[key] = obj[key];
    }
  });
  return result;
}

var _typeof = typeof Symbol === "function" && typeof Symbol.iterator === "symbol" ? function (obj) {
  return typeof obj;
} : function (obj) {
  return obj && typeof Symbol === "function" && obj.constructor === Symbol && obj !== Symbol.prototype ? "symbol" : typeof obj;
};











var classCallCheck = function (instance, Constructor) {
  if (!(instance instanceof Constructor)) {
    throw new TypeError("Cannot call a class as a function");
  }
};

var createClass = function () {
  function defineProperties(target, props) {
    for (var i = 0; i < props.length; i++) {
      var descriptor = props[i];
      descriptor.enumerable = descriptor.enumerable || false;
      descriptor.configurable = true;
      if ("value" in descriptor) descriptor.writable = true;
      Object.defineProperty(target, descriptor.key, descriptor);
    }
  }

  return function (Constructor, protoProps, staticProps) {
    if (protoProps) defineProperties(Constructor.prototype, protoProps);
    if (staticProps) defineProperties(Constructor, staticProps);
    return Constructor;
  };
}();





var defineProperty = function (obj, key, value) {
  if (key in obj) {
    Object.defineProperty(obj, key, {
      value: value,
      enumerable: true,
      configurable: true,
      writable: true
    });
  } else {
    obj[key] = value;
  }

  return obj;
};

var _extends = Object.assign || function (target) {
  for (var i = 1; i < arguments.length; i++) {
    var source = arguments[i];

    for (var key in source) {
      if (Object.prototype.hasOwnProperty.call(source, key)) {
        target[key] = source[key];
      }
    }
  }

  return target;
};



var inherits = function (subClass, superClass) {
  if (typeof superClass !== "function" && superClass !== null) {
    throw new TypeError("Super expression must either be null or a function, not " + typeof superClass);
  }

  subClass.prototype = Object.create(superClass && superClass.prototype, {
    constructor: {
      value: subClass,
      enumerable: false,
      writable: true,
      configurable: true
    }
  });
  if (superClass) Object.setPrototypeOf ? Object.setPrototypeOf(subClass, superClass) : subClass.__proto__ = superClass;
};









var objectWithoutProperties = function (obj, keys) {
  var target = {};

  for (var i in obj) {
    if (keys.indexOf(i) >= 0) continue;
    if (!Object.prototype.hasOwnProperty.call(obj, i)) continue;
    target[i] = obj[i];
  }

  return target;
};

var possibleConstructorReturn = function (self, call) {
  if (!self) {
    throw new ReferenceError("this hasn't been initialised - super() hasn't been called");
  }

  return call && (typeof call === "object" || typeof call === "function") ? call : self;
};

var propTypes = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  fluid: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps = {
  tag: 'div'
};

var Container = function Container(props) {
  var className = props.className,
      cssModule = props.cssModule,
      fluid = props.fluid,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'fluid', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, fluid ? 'container-fluid' : 'container'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

Container.propTypes = propTypes;
Container.defaultProps = defaultProps;

var propTypes$1 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  noGutters: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$1 = {
  tag: 'div'
};

var Row = function Row(props) {
  var className = props.className,
      cssModule = props.cssModule,
      noGutters = props.noGutters,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'noGutters', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, noGutters ? 'no-gutters' : null, 'row'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

Row.propTypes = propTypes$1;
Row.defaultProps = defaultProps$1;

var colWidths = ['xs', 'sm', 'md', 'lg', 'xl'];
var stringOrNumberProp = __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]);

var columnProps = __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.shape({
  size: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  push: stringOrNumberProp,
  pull: stringOrNumberProp,
  offset: stringOrNumberProp
})]);

var propTypes$2 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  xs: columnProps,
  sm: columnProps,
  md: columnProps,
  lg: columnProps,
  xl: columnProps,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  widths: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.array
};

var defaultProps$2 = {
  tag: 'div',
  widths: colWidths
};

var getColumnSizeClass = function getColumnSizeClass(isXs, colWidth, colSize) {
  if (colSize === true || colSize === '') {
    return isXs ? 'col' : 'col-' + colWidth;
  } else if (colSize === 'auto') {
    return isXs ? 'col-auto' : 'col-' + colWidth + '-auto';
  }

  return isXs ? 'col-' + colSize : 'col-' + colWidth + '-' + colSize;
};

var Col = function Col(props) {
  var className = props.className,
      cssModule = props.cssModule,
      widths = props.widths,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'widths', 'tag']);

  var colClasses = [];

  widths.forEach(function (colWidth, i) {
    var columnProp = props[colWidth];

    if (!i && columnProp === undefined) {
      columnProp = true;
    }

    delete attributes[colWidth];

    if (!columnProp) {
      return;
    }

    var isXs = !i;
    var colClass = void 0;

    if (__WEBPACK_IMPORTED_MODULE_3_lodash_isobject___default()(columnProp)) {
      var _classNames;

      var colSizeInterfix = isXs ? '-' : '-' + colWidth + '-';
      colClass = getColumnSizeClass(isXs, colWidth, columnProp.size);

      colClasses.push(mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()((_classNames = {}, defineProperty(_classNames, colClass, columnProp.size || columnProp.size === ''), defineProperty(_classNames, 'push' + colSizeInterfix + columnProp.push, columnProp.push || columnProp.push === 0), defineProperty(_classNames, 'pull' + colSizeInterfix + columnProp.pull, columnProp.pull || columnProp.pull === 0), defineProperty(_classNames, 'offset' + colSizeInterfix + columnProp.offset, columnProp.offset || columnProp.offset === 0), _classNames))), cssModule);
    } else {
      colClass = getColumnSizeClass(isXs, colWidth, columnProp);
      colClasses.push(colClass);
    }
  });

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, colClasses), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

Col.propTypes = propTypes$2;
Col.defaultProps = defaultProps$2;

var propTypes$3 = {
  light: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  inverse: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  full: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  fixed: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  sticky: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  color: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  role: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  toggleable: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string])
};

var defaultProps$3 = {
  tag: 'nav',
  toggleable: false
};

var getToggleableClass = function getToggleableClass(toggleable) {
  if (toggleable === false) {
    return false;
  } else if (toggleable === true || toggleable === 'xs') {
    return 'navbar-toggleable';
  }

  return 'navbar-toggleable-' + toggleable;
};

var Navbar = function Navbar(props) {
  var _classNames;

  var toggleable = props.toggleable,
      className = props.className,
      cssModule = props.cssModule,
      light = props.light,
      inverse = props.inverse,
      full = props.full,
      fixed = props.fixed,
      sticky = props.sticky,
      color = props.color,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['toggleable', 'className', 'cssModule', 'light', 'inverse', 'full', 'fixed', 'sticky', 'color', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'navbar', getToggleableClass(toggleable), (_classNames = {
    'navbar-light': light,
    'navbar-inverse': inverse
  }, defineProperty(_classNames, 'bg-' + color, color), defineProperty(_classNames, 'navbar-full', full), defineProperty(_classNames, 'fixed-' + fixed, fixed), defineProperty(_classNames, 'sticky-' + sticky, sticky), _classNames)), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

Navbar.propTypes = propTypes$3;
Navbar.defaultProps = defaultProps$3;

var propTypes$4 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$4 = {
  tag: 'a'
};

var NavbarBrand = function NavbarBrand(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'navbar-brand'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

NavbarBrand.propTypes = propTypes$4;
NavbarBrand.defaultProps = defaultProps$4;

var propTypes$5 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  type: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  right: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  left: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool
};

var defaultProps$5 = {
  tag: 'button',
  type: 'button'
};

var navbarToggleIcon = __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement('span', { className: 'navbar-toggler-icon' });

var NavbarToggler = function NavbarToggler(props) {
  var className = props.className,
      cssModule = props.cssModule,
      children = props.children,
      right = props.right,
      left = props.left,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'children', 'right', 'left', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'navbar-toggler', right && 'navbar-toggler-right', left && 'navbar-toggler-left'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
    Tag,
    _extends({}, attributes, { className: classes }),
    children || navbarToggleIcon
  );
};

NavbarToggler.propTypes = propTypes$5;
NavbarToggler.defaultProps = defaultProps$5;

var propTypes$6 = {
  tabs: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  pills: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  vertical: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  navbar: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$6 = {
  tag: 'ul'
};

var Nav = function Nav(props) {
  var className = props.className,
      cssModule = props.cssModule,
      tabs = props.tabs,
      pills = props.pills,
      vertical = props.vertical,
      navbar = props.navbar,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tabs', 'pills', 'vertical', 'navbar', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, navbar ? 'navbar-nav' : 'nav', {
    'nav-tabs': tabs,
    'nav-pills': pills,
    'flex-column': vertical
  }), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

Nav.propTypes = propTypes$6;
Nav.defaultProps = defaultProps$6;

var propTypes$7 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$7 = {
  tag: 'li'
};

var NavItem = function NavItem(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'nav-item'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

NavItem.propTypes = propTypes$7;
NavItem.defaultProps = defaultProps$7;

var propTypes$10 = {
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node.isRequired,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  arrow: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  disabled: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  isOpen: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool.isRequired,
  toggle: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func.isRequired,
  tether: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object.isRequired,
  tetherRef: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  style: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$10 = {
  isOpen: false,
  tetherRef: function tetherRef() {}
};

var TetherContent = function (_React$Component) {
  inherits(TetherContent, _React$Component);

  function TetherContent(props) {
    classCallCheck(this, TetherContent);

    var _this = possibleConstructorReturn(this, (TetherContent.__proto__ || Object.getPrototypeOf(TetherContent)).call(this, props));

    _this.handleDocumentClick = _this.handleDocumentClick.bind(_this);
    _this.toggle = _this.toggle.bind(_this);
    return _this;
  }

  createClass(TetherContent, [{
    key: 'componentDidMount',
    value: function componentDidMount() {
      this.handleProps();
    }
  }, {
    key: 'componentDidUpdate',
    value: function componentDidUpdate(prevProps) {
      if (this.props.isOpen !== prevProps.isOpen) {
        this.handleProps();
      } else if (this._element) {
        // rerender
        this.renderIntoSubtree();
      }
    }
  }, {
    key: 'componentWillUnmount',
    value: function componentWillUnmount() {
      this.hide();
    }
  }, {
    key: 'getTarget',
    value: function getTarget() {
      var target = this.props.tether.target;

      if (__WEBPACK_IMPORTED_MODULE_5_lodash_isfunction___default()(target)) {
        return target();
      }

      return target;
    }
  }, {
    key: 'getTetherConfig',
    value: function getTetherConfig() {
      var config = _extends({}, this.props.tether);

      config.element = this._element;
      config.target = this.getTarget();
      return config;
    }
  }, {
    key: 'handleDocumentClick',
    value: function handleDocumentClick(e) {
      var container = this._element;
      if (e.target === container || !container.contains(e.target)) {
        this.toggle();
      }
    }
  }, {
    key: 'handleProps',
    value: function handleProps() {
      if (this.props.isOpen) {
        this.show();
      } else {
        this.hide();
      }
    }
  }, {
    key: 'hide',
    value: function hide() {
      document.removeEventListener('click', this.handleDocumentClick, true);

      if (this._element) {
        document.body.removeChild(this._element);
        __WEBPACK_IMPORTED_MODULE_4_react_dom___default.a.unmountComponentAtNode(this._element);
        this._element = null;
      }

      if (this._tether) {
        this._tether.destroy();
        this._tether = null;
        this.props.tetherRef(this._tether);
      }
    }
  }, {
    key: 'show',
    value: function show() {
      document.addEventListener('click', this.handleDocumentClick, true);

      this._element = document.createElement('div');
      this._element.className = this.props.className;
      document.body.appendChild(this._element);
      this.renderIntoSubtree();
      this._tether = new __WEBPACK_IMPORTED_MODULE_6_reactstrap_tether___default.a(this.getTetherConfig());
      this.props.tetherRef(this._tether);
      this._tether.position();
      this._element.childNodes[0].focus();
    }
  }, {
    key: 'toggle',
    value: function toggle(e) {
      if (this.props.disabled) {
        return e && e.preventDefault();
      }

      return this.props.toggle();
    }
  }, {
    key: 'renderIntoSubtree',
    value: function renderIntoSubtree() {
      __WEBPACK_IMPORTED_MODULE_4_react_dom___default.a.unstable_renderSubtreeIntoContainer(this, this.renderChildren(), this._element);
    }
  }, {
    key: 'renderChildren',
    value: function renderChildren() {
      var _props = this.props,
          children = _props.children,
          style = _props.style;

      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.cloneElement(children, { style: style });
    }
  }, {
    key: 'render',
    value: function render() {
      return null;
    }
  }]);
  return TetherContent;
}(__WEBPACK_IMPORTED_MODULE_0_react___default.a.Component);

TetherContent.propTypes = propTypes$10;
TetherContent.defaultProps = defaultProps$10;

var propTypes$11 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node.isRequired,
  right: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$11 = {
  tag: 'div'
};

var contextTypes = {
  isOpen: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool.isRequired
};

var DropdownMenu = function DropdownMenu(props, context) {
  var className = props.className,
      cssModule = props.cssModule,
      right = props.right,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'right', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'dropdown-menu', { 'dropdown-menu-right': right }), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { tabIndex: '-1', 'aria-hidden': !context.isOpen, role: 'menu', className: classes }));
};

DropdownMenu.propTypes = propTypes$11;
DropdownMenu.defaultProps = defaultProps$11;
DropdownMenu.contextTypes = contextTypes;

/* eslint react/no-find-dom-node: 0 */
// https://github.com/yannickcr/eslint-plugin-react/blob/master/docs/rules/no-find-dom-node.md

var propTypes$9 = {
  disabled: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  dropup: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  group: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  isOpen: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  size: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  tether: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool]),
  toggle: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$9 = {
  isOpen: false,
  tag: 'div'
};

var childContextTypes = {
  toggle: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func.isRequired,
  isOpen: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool.isRequired
};

var defaultTetherConfig = {
  classPrefix: 'bs-tether',
  classes: { element: 'dropdown', enabled: 'show' },
  constraints: [{ to: 'scrollParent', attachment: 'together none' }, { to: 'window', attachment: 'together none' }]
};

var Dropdown = function (_React$Component) {
  inherits(Dropdown, _React$Component);

  function Dropdown(props) {
    classCallCheck(this, Dropdown);

    var _this = possibleConstructorReturn(this, (Dropdown.__proto__ || Object.getPrototypeOf(Dropdown)).call(this, props));

    _this.addEvents = _this.addEvents.bind(_this);
    _this.getTetherConfig = _this.getTetherConfig.bind(_this);
    _this.handleDocumentClick = _this.handleDocumentClick.bind(_this);
    _this.removeEvents = _this.removeEvents.bind(_this);
    _this.toggle = _this.toggle.bind(_this);
    return _this;
  }

  createClass(Dropdown, [{
    key: 'getChildContext',
    value: function getChildContext() {
      return {
        toggle: this.props.toggle,
        isOpen: this.props.isOpen
      };
    }
  }, {
    key: 'componentDidMount',
    value: function componentDidMount() {
      this.handleProps();
    }
  }, {
    key: 'componentDidUpdate',
    value: function componentDidUpdate(prevProps) {
      if (this.props.isOpen !== prevProps.isOpen) {
        this.handleProps();
      }
    }
  }, {
    key: 'componentWillUnmount',
    value: function componentWillUnmount() {
      this.removeEvents();
    }
  }, {
    key: 'getTetherTarget',
    value: function getTetherTarget() {
      var container = __WEBPACK_IMPORTED_MODULE_4_react_dom___default.a.findDOMNode(this);

      return container.querySelector('[data-toggle="dropdown"]');
    }
  }, {
    key: 'getTetherConfig',
    value: function getTetherConfig(childProps) {
      var _this2 = this;

      var target = function target() {
        return _this2.getTetherTarget();
      };
      var vElementAttach = 'top';
      var hElementAttach = 'left';
      var vTargetAttach = 'bottom';
      var hTargetAttach = 'left';

      if (childProps.right) {
        hElementAttach = 'right';
        hTargetAttach = 'right';
      }

      if (this.props.dropup) {
        vElementAttach = 'bottom';
        vTargetAttach = 'top';
      }

      return _extends({}, defaultTetherConfig, {
        attachment: vElementAttach + ' ' + hElementAttach,
        targetAttachment: vTargetAttach + ' ' + hTargetAttach,
        target: target
      }, this.props.tether);
    }
  }, {
    key: 'addEvents',
    value: function addEvents() {
      document.addEventListener('click', this.handleDocumentClick, true);
    }
  }, {
    key: 'removeEvents',
    value: function removeEvents() {
      document.removeEventListener('click', this.handleDocumentClick, true);
    }
  }, {
    key: 'handleDocumentClick',
    value: function handleDocumentClick(e) {
      var container = __WEBPACK_IMPORTED_MODULE_4_react_dom___default.a.findDOMNode(this);

      if (container.contains(e.target) && container !== e.target) {
        return;
      }

      this.toggle();
    }
  }, {
    key: 'handleProps',
    value: function handleProps() {
      if (this.props.tether) {
        return;
      }

      if (this.props.isOpen) {
        this.addEvents();
      } else {
        this.removeEvents();
      }
    }
  }, {
    key: 'toggle',
    value: function toggle(e) {
      if (this.props.disabled) {
        return e && e.preventDefault();
      }

      return this.props.toggle();
    }
  }, {
    key: 'renderChildren',
    value: function renderChildren() {
      var _this3 = this;

      var _props = this.props,
          tether = _props.tether,
          children = _props.children,
          attrs = objectWithoutProperties(_props, ['tether', 'children']);

      attrs.toggle = this.toggle;

      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.Children.map(__WEBPACK_IMPORTED_MODULE_0_react___default.a.Children.toArray(children), function (child) {
        if (tether && child.type === DropdownMenu) {
          var tetherConfig = _this3.getTetherConfig(child.props);
          return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
            TetherContent,
            _extends({}, attrs, { tether: tetherConfig }),
            child
          );
        }

        return child;
      });
    }
  }, {
    key: 'render',
    value: function render() {
      var _classNames;

      var _omit = omit(this.props, ['toggle', 'tether']),
          className = _omit.className,
          cssModule = _omit.cssModule,
          dropup = _omit.dropup,
          group = _omit.group,
          size = _omit.size,
          Tag = _omit.tag,
          isOpen = _omit.isOpen,
          attributes = objectWithoutProperties(_omit, ['className', 'cssModule', 'dropup', 'group', 'size', 'tag', 'isOpen']);

      var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, (_classNames = {
        'btn-group': group
      }, defineProperty(_classNames, 'btn-group-' + size, !!size), defineProperty(_classNames, 'dropdown', !group), defineProperty(_classNames, 'show', isOpen), defineProperty(_classNames, 'dropup', dropup), _classNames)), cssModule);

      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
        Tag,
        _extends({}, attributes, {
          className: classes
        }),
        this.renderChildren()
      );
    }
  }]);
  return Dropdown;
}(__WEBPACK_IMPORTED_MODULE_0_react___default.a.Component);

Dropdown.propTypes = propTypes$9;
Dropdown.defaultProps = defaultProps$9;
Dropdown.childContextTypes = childContextTypes;

var propTypes$8 = {
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$8 = {
  tag: 'li'
};

var NavDropdown = function NavDropdown(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'nav-item'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Dropdown, _extends({}, attributes, { tag: Tag, className: classes }));
};

NavDropdown.propTypes = propTypes$8;
NavDropdown.defaultProps = defaultProps$8;

var propTypes$12 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  getRef: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  disabled: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  active: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  onClick: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  href: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.any
};

var defaultProps$12 = {
  tag: 'a'
};

var NavLink = function (_React$Component) {
  inherits(NavLink, _React$Component);

  function NavLink(props) {
    classCallCheck(this, NavLink);

    var _this = possibleConstructorReturn(this, (NavLink.__proto__ || Object.getPrototypeOf(NavLink)).call(this, props));

    _this.onClick = _this.onClick.bind(_this);
    return _this;
  }

  createClass(NavLink, [{
    key: 'onClick',
    value: function onClick(e) {
      if (this.props.disabled) {
        e.preventDefault();
        return;
      }

      if (this.props.href === '#') {
        e.preventDefault();
      }

      if (this.props.onClick) {
        this.props.onClick(e);
      }
    }
  }, {
    key: 'render',
    value: function render() {
      var _props = this.props,
          className = _props.className,
          cssModule = _props.cssModule,
          active = _props.active,
          Tag = _props.tag,
          getRef = _props.getRef,
          attributes = objectWithoutProperties(_props, ['className', 'cssModule', 'active', 'tag', 'getRef']);


      var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'nav-link', {
        disabled: attributes.disabled,
        active: active
      }), cssModule);

      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { ref: getRef, onClick: this.onClick, className: classes }));
    }
  }]);
  return NavLink;
}(__WEBPACK_IMPORTED_MODULE_0_react___default.a.Component);

NavLink.propTypes = propTypes$12;
NavLink.defaultProps = defaultProps$12;

var propTypes$13 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$13 = {
  tag: 'ol'
};

var Breadcrumb = function Breadcrumb(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'breadcrumb'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

Breadcrumb.propTypes = propTypes$13;
Breadcrumb.defaultProps = defaultProps$13;

var propTypes$14 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  active: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$14 = {
  tag: 'li'
};

var BreadcrumbItem = function BreadcrumbItem(props) {
  var className = props.className,
      cssModule = props.cssModule,
      active = props.active,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'active', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, active ? 'active' : false, 'breadcrumb-item'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

BreadcrumbItem.propTypes = propTypes$14;
BreadcrumbItem.defaultProps = defaultProps$14;

var propTypes$15 = {
  active: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  block: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  color: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  disabled: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  outline: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  getRef: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  onClick: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  size: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$15 = {
  color: 'secondary',
  tag: 'button'
};

var Button = function (_React$Component) {
  inherits(Button, _React$Component);

  function Button(props) {
    classCallCheck(this, Button);

    var _this = possibleConstructorReturn(this, (Button.__proto__ || Object.getPrototypeOf(Button)).call(this, props));

    _this.onClick = _this.onClick.bind(_this);
    return _this;
  }

  createClass(Button, [{
    key: 'onClick',
    value: function onClick(e) {
      if (this.props.disabled) {
        e.preventDefault();
        return;
      }

      if (this.props.onClick) {
        this.props.onClick(e);
      }
    }
  }, {
    key: 'render',
    value: function render() {
      var _props = this.props,
          active = _props.active,
          block = _props.block,
          className = _props.className,
          cssModule = _props.cssModule,
          color = _props.color,
          outline = _props.outline,
          size = _props.size,
          Tag = _props.tag,
          getRef = _props.getRef,
          attributes = objectWithoutProperties(_props, ['active', 'block', 'className', 'cssModule', 'color', 'outline', 'size', 'tag', 'getRef']);


      var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'btn', 'btn' + (outline ? '-outline' : '') + '-' + color, size ? 'btn-' + size : false, block ? 'btn-block' : false, { active: active, disabled: this.props.disabled }), cssModule);

      if (attributes.href && Tag === 'button') {
        Tag = 'a';
      }

      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({
        type: Tag === 'button' && attributes.onClick ? 'button' : undefined
      }, attributes, {
        className: classes,
        ref: getRef,
        onClick: this.onClick
      }));
    }
  }]);
  return Button;
}(__WEBPACK_IMPORTED_MODULE_0_react___default.a.Component);

Button.propTypes = propTypes$15;
Button.defaultProps = defaultProps$15;

var propTypes$16 = {
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node
};

var ButtonDropdown = function ButtonDropdown(props) {
  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Dropdown, _extends({ group: true }, props));
};

ButtonDropdown.propTypes = propTypes$16;

var propTypes$17 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  'aria-label': __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  role: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  size: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  vertical: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool
};

var defaultProps$16 = {
  tag: 'div',
  role: 'group'
};

var ButtonGroup = function ButtonGroup(props) {
  var className = props.className,
      cssModule = props.cssModule,
      size = props.size,
      vertical = props.vertical,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'size', 'vertical', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, size ? 'btn-group-' + size : false, vertical ? 'btn-group-vertical' : 'btn-group'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

ButtonGroup.propTypes = propTypes$17;
ButtonGroup.defaultProps = defaultProps$16;

var propTypes$18 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  'aria-label': __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  role: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string
};

var defaultProps$17 = {
  tag: 'div',
  role: 'toolbar'
};

var ButtonToolbar = function ButtonToolbar(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'btn-toolbar'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

ButtonToolbar.propTypes = propTypes$18;
ButtonToolbar.defaultProps = defaultProps$17;

var propTypes$19 = {
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  active: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  disabled: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  divider: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  header: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  onClick: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  toggle: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool
};

var contextTypes$1 = {
  toggle: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func
};

var defaultProps$18 = {
  tag: 'button',
  toggle: true
};

var DropdownItem = function (_React$Component) {
  inherits(DropdownItem, _React$Component);

  function DropdownItem(props) {
    classCallCheck(this, DropdownItem);

    var _this = possibleConstructorReturn(this, (DropdownItem.__proto__ || Object.getPrototypeOf(DropdownItem)).call(this, props));

    _this.onClick = _this.onClick.bind(_this);
    _this.getTabIndex = _this.getTabIndex.bind(_this);
    return _this;
  }

  createClass(DropdownItem, [{
    key: 'onClick',
    value: function onClick(e) {
      if (this.props.disabled || this.props.header || this.props.divider) {
        e.preventDefault();
        return;
      }

      if (this.props.onClick) {
        this.props.onClick(e);
      }

      if (this.props.toggle) {
        this.context.toggle();
      }
    }
  }, {
    key: 'getTabIndex',
    value: function getTabIndex() {
      if (this.props.disabled || this.props.header || this.props.divider) {
        return '-1';
      }

      return '0';
    }
  }, {
    key: 'render',
    value: function render() {
      var tabIndex = this.getTabIndex();

      var _omit = omit(this.props, ['toggle']),
          className = _omit.className,
          cssModule = _omit.cssModule,
          divider = _omit.divider,
          Tag = _omit.tag,
          header = _omit.header,
          active = _omit.active,
          props = objectWithoutProperties(_omit, ['className', 'cssModule', 'divider', 'tag', 'header', 'active']);

      var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, {
        disabled: props.disabled,
        'dropdown-item': !divider && !header,
        active: active,
        'dropdown-header': header,
        'dropdown-divider': divider
      }), cssModule);

      if (Tag === 'button') {
        if (header) {
          Tag = 'h6';
        } else if (divider) {
          Tag = 'div';
        } else if (props.href) {
          Tag = 'a';
        }
      }

      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({
        type: Tag === 'button' && (props.onClick || this.props.toggle) ? 'button' : undefined
      }, props, {
        tabIndex: tabIndex,
        className: classes,
        onClick: this.onClick
      }));
    }
  }]);
  return DropdownItem;
}(__WEBPACK_IMPORTED_MODULE_0_react___default.a.Component);

DropdownItem.propTypes = propTypes$19;
DropdownItem.defaultProps = defaultProps$18;
DropdownItem.contextTypes = contextTypes$1;

var propTypes$20 = {
  caret: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  color: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  disabled: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  onClick: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  'data-toggle': __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  'aria-haspopup': __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  split: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  nav: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool
};

var defaultProps$19 = {
  'data-toggle': 'dropdown',
  'aria-haspopup': true,
  color: 'secondary'
};

var contextTypes$2 = {
  isOpen: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool.isRequired,
  toggle: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func.isRequired
};

var DropdownToggle = function (_React$Component) {
  inherits(DropdownToggle, _React$Component);

  function DropdownToggle(props) {
    classCallCheck(this, DropdownToggle);

    var _this = possibleConstructorReturn(this, (DropdownToggle.__proto__ || Object.getPrototypeOf(DropdownToggle)).call(this, props));

    _this.onClick = _this.onClick.bind(_this);
    return _this;
  }

  createClass(DropdownToggle, [{
    key: 'onClick',
    value: function onClick(e) {
      if (this.props.disabled) {
        e.preventDefault();
        return;
      }

      if (this.props.nav && !this.props.tag) {
        e.preventDefault();
      }

      if (this.props.onClick) {
        this.props.onClick(e);
      }

      this.context.toggle();
    }
  }, {
    key: 'render',
    value: function render() {
      var _props = this.props,
          className = _props.className,
          color = _props.color,
          cssModule = _props.cssModule,
          caret = _props.caret,
          split = _props.split,
          nav = _props.nav,
          tag = _props.tag,
          props = objectWithoutProperties(_props, ['className', 'color', 'cssModule', 'caret', 'split', 'nav', 'tag']);

      var ariaLabel = props['aria-label'] || 'Toggle Dropdown';
      var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, {
        'dropdown-toggle': caret || split,
        'dropdown-toggle-split': split,
        active: this.context.isOpen,
        'nav-link': nav
      }), cssModule);
      var children = props.children || __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
        'span',
        { className: 'sr-only' },
        ariaLabel
      );

      var Tag = void 0;

      if (nav && !tag) {
        Tag = 'a';
        props.href = '#';
      } else if (!tag) {
        Tag = Button;
        props.color = color;
      } else {
        Tag = tag;
      }

      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, props, {
        className: classes,
        onClick: this.onClick,
        'aria-haspopup': 'true',
        'aria-expanded': this.context.isOpen,
        children: children
      }));
    }
  }]);
  return DropdownToggle;
}(__WEBPACK_IMPORTED_MODULE_0_react___default.a.Component);

DropdownToggle.propTypes = propTypes$20;
DropdownToggle.defaultProps = defaultProps$19;
DropdownToggle.contextTypes = contextTypes$2;

var propTypes$21 = {
  baseClass: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  baseClassIn: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  transitionAppearTimeout: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number,
  transitionEnterTimeout: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number,
  transitionLeaveTimeout: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number,
  transitionAppear: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  transitionEnter: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  transitionLeave: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  onLeave: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  onEnter: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func
};

var defaultProps$20 = {
  tag: 'div',
  baseClass: 'fade',
  baseClassIn: 'show',
  transitionAppearTimeout: 0,
  transitionEnterTimeout: 0,
  transitionLeaveTimeout: 0,
  transitionAppear: true,
  transitionEnter: true,
  transitionLeave: true
};

var Fade = function (_React$Component) {
  inherits(Fade, _React$Component);

  function Fade(props) {
    classCallCheck(this, Fade);

    var _this = possibleConstructorReturn(this, (Fade.__proto__ || Object.getPrototypeOf(Fade)).call(this, props));

    _this.state = {
      mounted: !props.transitionAppear
    };

    _this.onLeave = _this.onLeave.bind(_this);
    _this.onEnter = _this.onEnter.bind(_this);
    _this.timers = [];
    return _this;
  }

  createClass(Fade, [{
    key: 'componentWillUnmount',
    value: function componentWillUnmount() {
      this.timers.forEach(function (timer) {
        return clearTimeout(timer);
      });
    }
  }, {
    key: 'onEnter',
    value: function onEnter(cb) {
      var _this2 = this;

      return function () {
        cb();
        if (_this2.props.onEnter) {
          _this2.props.onEnter();
        }
      };
    }
  }, {
    key: 'onLeave',
    value: function onLeave(cb) {
      var _this3 = this;

      return function () {
        cb();
        if (_this3.props.onLeave) {
          _this3.props.onLeave();
        }
      };
    }
  }, {
    key: 'componentWillAppear',
    value: function componentWillAppear(cb) {
      if (!this.props.transitionAppear) {
        this.onEnter(cb)();
      }

      this.timers.push(setTimeout(this.onEnter(cb), this.props.transitionAppearTimeout));
    }
  }, {
    key: 'componentDidAppear',
    value: function componentDidAppear() {
      this.setState({
        mounted: true
      });
    }
  }, {
    key: 'componentWillEnter',
    value: function componentWillEnter(cb) {
      if (!this.props.transitionEnter) {
        this.onEnter(cb)();
      }

      this.timers.push(setTimeout(this.onEnter(cb), this.props.transitionEnterTimeout));
    }
  }, {
    key: 'componentDidEnter',
    value: function componentDidEnter() {
      this.setState({
        mounted: true
      });
    }
  }, {
    key: 'componentWillLeave',
    value: function componentWillLeave(cb) {
      this.setState({
        mounted: false
      });

      if (!this.props.transitionLeave) {
        this.onLeave(cb)();
      }

      this.timers.push(setTimeout(this.onLeave(cb), this.props.transitionLeaveTimeout));
    }
  }, {
    key: 'render',
    value: function render() {
      var _props = this.props,
          baseClass = _props.baseClass,
          baseClassIn = _props.baseClassIn,
          className = _props.className,
          cssModule = _props.cssModule,
          Tag = _props.tag;

      var attributes = omit(this.props, Object.keys(propTypes$21));

      var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, baseClass, this.state.mounted ? baseClassIn : false), cssModule);

      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
    }
  }]);
  return Fade;
}(__WEBPACK_IMPORTED_MODULE_0_react___default.a.Component);

Fade.propTypes = propTypes$21;
Fade.defaultProps = defaultProps$20;

var propTypes$22 = {
  color: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  pill: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$21 = {
  color: 'default',
  pill: false,
  tag: 'span'
};

var Badge = function Badge(props) {
  var className = props.className,
      cssModule = props.cssModule,
      color = props.color,
      pill = props.pill,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'color', 'pill', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'badge', 'badge-' + color, pill ? 'badge-pill' : false), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

Badge.propTypes = propTypes$22;
Badge.defaultProps = defaultProps$21;

var propTypes$23 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  inverse: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  color: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  block: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  outline: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$22 = {
  tag: 'div'
};

var Card = function Card(props) {
  var className = props.className,
      cssModule = props.cssModule,
      color = props.color,
      block = props.block,
      inverse = props.inverse,
      outline = props.outline,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'color', 'block', 'inverse', 'outline', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'card', inverse ? 'card-inverse' : false, block ? 'card-block' : false, color ? 'card' + (outline ? '-outline' : '') + '-' + color : false), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

Card.propTypes = propTypes$23;
Card.defaultProps = defaultProps$22;

var propTypes$24 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$23 = {
  tag: 'div'
};

var CardGroup = function CardGroup(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'card-group'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

CardGroup.propTypes = propTypes$24;
CardGroup.defaultProps = defaultProps$23;

var propTypes$25 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$24 = {
  tag: 'div'
};

var CardDeck = function CardDeck(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'card-deck'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

CardDeck.propTypes = propTypes$25;
CardDeck.defaultProps = defaultProps$24;

var propTypes$26 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$25 = {
  tag: 'div'
};

var CardColumns = function CardColumns(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'card-columns'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

CardColumns.propTypes = propTypes$26;
CardColumns.defaultProps = defaultProps$25;

var propTypes$27 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$26 = {
  tag: 'div'
};

var CardBlock = function CardBlock(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'card-block'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

CardBlock.propTypes = propTypes$27;
CardBlock.defaultProps = defaultProps$26;

var propTypes$28 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  getRef: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$27 = {
  tag: 'a'
};

var CardLink = function CardLink(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      getRef = props.getRef,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag', 'getRef']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'card-link'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { ref: getRef, className: classes }));
};

CardLink.propTypes = propTypes$28;
CardLink.defaultProps = defaultProps$27;

var propTypes$29 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$28 = {
  tag: 'div'
};

var CardFooter = function CardFooter(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'card-footer'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

CardFooter.propTypes = propTypes$29;
CardFooter.defaultProps = defaultProps$28;

var propTypes$30 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$29 = {
  tag: 'div'
};

var CardHeader = function CardHeader(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'card-header'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

CardHeader.propTypes = propTypes$30;
CardHeader.defaultProps = defaultProps$29;

var propTypes$31 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  top: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  bottom: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$30 = {
  tag: 'img'
};

var CardImg = function CardImg(props) {
  var className = props.className,
      cssModule = props.cssModule,
      top = props.top,
      bottom = props.bottom,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'top', 'bottom', 'tag']);


  var cardImgClassName = 'card-img';
  if (top) {
    cardImgClassName = 'card-img-top';
  }
  if (bottom) {
    cardImgClassName = 'card-img-bottom';
  }

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, cardImgClassName), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

CardImg.propTypes = propTypes$31;
CardImg.defaultProps = defaultProps$30;

var propTypes$32 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$31 = {
  tag: 'div'
};

var CardImgOverlay = function CardImgOverlay(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'card-img-overlay'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

CardImgOverlay.propTypes = propTypes$32;
CardImgOverlay.defaultProps = defaultProps$31;

var propTypes$33 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$32 = {
  tag: 'h6'
};

var CardSubtitle = function CardSubtitle(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'card-subtitle'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

CardSubtitle.propTypes = propTypes$33;
CardSubtitle.defaultProps = defaultProps$32;

var propTypes$34 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$33 = {
  tag: 'p'
};

var CardText = function CardText(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'card-text'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

CardText.propTypes = propTypes$34;
CardText.defaultProps = defaultProps$33;

var propTypes$35 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$34 = {
  tag: 'h4'
};

var CardTitle = function CardTitle(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'card-title'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

CardTitle.propTypes = propTypes$35;
CardTitle.defaultProps = defaultProps$34;

var propTypes$36 = {
  placement: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOf(tetherAttachements),
  target: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string.isRequired,
  isOpen: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tether: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  tetherRef: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  toggle: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func
};

var defaultProps$35 = {
  isOpen: false,
  placement: 'bottom',
  toggle: function toggle() {}
};

var defaultTetherConfig$1 = {
  classPrefix: 'bs-tether',
  classes: {
    element: false,
    enabled: 'show'
  },
  constraints: [{ to: 'scrollParent', attachment: 'together none' }, { to: 'window', attachment: 'together none' }]
};

var Popover = function (_React$Component) {
  inherits(Popover, _React$Component);

  function Popover(props) {
    classCallCheck(this, Popover);

    var _this = possibleConstructorReturn(this, (Popover.__proto__ || Object.getPrototypeOf(Popover)).call(this, props));

    _this.getTetherConfig = _this.getTetherConfig.bind(_this);
    return _this;
  }

  createClass(Popover, [{
    key: 'getTetherConfig',
    value: function getTetherConfig() {
      var attachments = getTetherAttachments(this.props.placement);
      return _extends({}, defaultTetherConfig$1, attachments, {
        target: '#' + this.props.target
      }, this.props.tether);
    }
  }, {
    key: 'render',
    value: function render() {
      if (!this.props.isOpen) {
        return null;
      }

      var tetherConfig = this.getTetherConfig();

      var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()('popover-inner', this.props.className), this.props.cssModule);

      var attributes = omit(this.props, Object.keys(propTypes$36));

      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
        TetherContent,
        {
          className: mapToCssModules('popover', this.props.cssModule),
          tether: tetherConfig,
          tetherRef: this.props.tetherRef,
          isOpen: this.props.isOpen,
          toggle: this.props.toggle
        },
        __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement('div', _extends({}, attributes, { className: classes }))
      );
    }
  }]);
  return Popover;
}(__WEBPACK_IMPORTED_MODULE_0_react___default.a.Component);

Popover.propTypes = propTypes$36;
Popover.defaultProps = defaultProps$35;

var propTypes$37 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$36 = {
  tag: 'h3'
};

var PopoverTitle = function PopoverTitle(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'popover-title'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

PopoverTitle.propTypes = propTypes$37;
PopoverTitle.defaultProps = defaultProps$36;

var propTypes$38 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$37 = {
  tag: 'div'
};

var PopoverContent = function PopoverContent(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'popover-content'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

PopoverContent.propTypes = propTypes$38;
PopoverContent.defaultProps = defaultProps$37;

var propTypes$39 = {
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  bar: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  multi: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  value: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number]),
  max: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number]),
  animated: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  striped: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  color: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  barClassName: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$38 = {
  tag: 'div',
  value: 0,
  max: 100
};

var Progress = function Progress(props) {
  var children = props.children,
      className = props.className,
      barClassName = props.barClassName,
      cssModule = props.cssModule,
      value = props.value,
      max = props.max,
      animated = props.animated,
      striped = props.striped,
      color = props.color,
      bar = props.bar,
      multi = props.multi,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['children', 'className', 'barClassName', 'cssModule', 'value', 'max', 'animated', 'striped', 'color', 'bar', 'multi', 'tag']);


  var percent = __WEBPACK_IMPORTED_MODULE_7_lodash_tonumber___default()(value) / __WEBPACK_IMPORTED_MODULE_7_lodash_tonumber___default()(max) * 100;

  var progressClasses = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'progress'), cssModule);

  var progressBarClasses = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()('progress-bar', bar ? className || barClassName : barClassName, animated ? 'progress-bar-animated' : null, color ? 'bg-' + color : null, striped || animated ? 'progress-bar-striped' : null), cssModule);

  var ProgressBar = multi ? children : __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement('div', {
    className: progressBarClasses,
    style: { width: percent + '%' },
    role: 'progressbar',
    'aria-valuenow': value,
    'aria-valuemin': '0',
    'aria-valuemax': max,
    children: children
  });

  if (bar) {
    return ProgressBar;
  }

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: progressClasses, children: ProgressBar }));
};

Progress.propTypes = propTypes$39;
Progress.defaultProps = defaultProps$38;

var propTypes$40 = {
  isOpen: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  autoFocus: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  size: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  toggle: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  keyboard: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  backdrop: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOf(['static'])]),
  onEnter: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  onExit: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  wrapClassName: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  modalClassName: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  backdropClassName: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  contentClassName: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  fade: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  zIndex: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  backdropTransitionTimeout: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number,
  backdropTransitionAppearTimeout: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number,
  backdropTransitionEnterTimeout: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number,
  backdropTransitionLeaveTimeout: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number,
  modalTransitionTimeout: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number,
  modalTransitionAppearTimeout: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number,
  modalTransitionEnterTimeout: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number,
  modalTransitionLeaveTimeout: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number
};

var propsToOmit = Object.keys(propTypes$40);

var defaultProps$39 = {
  isOpen: false,
  autoFocus: true,
  backdrop: true,
  keyboard: true,
  zIndex: 1050,
  fade: true,
  modalTransitionTimeout: 300,
  backdropTransitionTimeout: 150
};

var Modal = function (_React$Component) {
  inherits(Modal, _React$Component);

  function Modal(props) {
    classCallCheck(this, Modal);

    var _this = possibleConstructorReturn(this, (Modal.__proto__ || Object.getPrototypeOf(Modal)).call(this, props));

    _this.originalBodyPadding = null;
    _this.isBodyOverflowing = false;
    _this.togglePortal = _this.togglePortal.bind(_this);
    _this.handleBackdropClick = _this.handleBackdropClick.bind(_this);
    _this.handleEscape = _this.handleEscape.bind(_this);
    _this.destroy = _this.destroy.bind(_this);
    _this.onEnter = _this.onEnter.bind(_this);
    _this.onExit = _this.onExit.bind(_this);
    return _this;
  }

  createClass(Modal, [{
    key: 'componentDidMount',
    value: function componentDidMount() {
      if (this.props.isOpen) {
        this.togglePortal();
      }
    }
  }, {
    key: 'componentDidUpdate',
    value: function componentDidUpdate(prevProps) {
      if (this.props.isOpen !== prevProps.isOpen) {
        // handle portal events/dom updates
        this.togglePortal();
      } else if (this._element) {
        // rerender portal
        this.renderIntoSubtree();
      }
    }
  }, {
    key: 'componentWillUnmount',
    value: function componentWillUnmount() {
      this.onExit();
    }
  }, {
    key: 'onEnter',
    value: function onEnter() {
      if (this.props.onEnter) {
        this.props.onEnter();
      }
    }
  }, {
    key: 'onExit',
    value: function onExit() {
      this.destroy();
      if (this.props.onExit) {
        this.props.onExit();
      }
    }
  }, {
    key: 'handleEscape',
    value: function handleEscape(e) {
      if (this.props.keyboard && e.keyCode === 27 && this.props.toggle) {
        this.props.toggle();
      }
    }
  }, {
    key: 'handleBackdropClick',
    value: function handleBackdropClick(e) {
      if (this.props.backdrop !== true) return;

      var container = this._dialog;

      if (e.target && !container.contains(e.target) && this.props.toggle) {
        this.props.toggle();
      }
    }
  }, {
    key: 'hasTransition',
    value: function hasTransition() {
      if (this.props.fade === false) {
        return false;
      }

      return this.props.modalTransitionTimeout > 0;
    }
  }, {
    key: 'togglePortal',
    value: function togglePortal() {
      if (this.props.isOpen) {
        if (this.props.autoFocus) {
          this._focus = true;
        }
        this.show();
        if (!this.hasTransition()) {
          this.onEnter();
        }
      } else {
        this.hide();
        if (!this.hasTransition()) {
          this.onExit();
        }
      }
    }
  }, {
    key: 'destroy',
    value: function destroy() {
      if (this._element) {
        __WEBPACK_IMPORTED_MODULE_4_react_dom___default.a.unmountComponentAtNode(this._element);
        document.body.removeChild(this._element);
        this._element = null;
      }

      // Use regex to prevent matching `modal-open` as part of a different class, e.g. `my-modal-opened`
      var classes = document.body.className.replace(/(^| )modal-open( |$)/, ' ');
      document.body.className = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(classes).trim(), this.props.cssModule);
      setScrollbarWidth(this.originalBodyPadding);
    }
  }, {
    key: 'hide',
    value: function hide() {
      this.renderIntoSubtree();
    }
  }, {
    key: 'show',
    value: function show() {
      var classes = document.body.className;
      this._element = document.createElement('div');
      this._element.setAttribute('tabindex', '-1');
      this._element.style.position = 'relative';
      this._element.style.zIndex = this.props.zIndex;
      this.originalBodyPadding = getOriginalBodyPadding();

      conditionallyUpdateScrollbar();

      document.body.appendChild(this._element);

      document.body.className = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(classes, 'modal-open'), this.props.cssModule);

      this.renderIntoSubtree();
    }
  }, {
    key: 'renderModalDialog',
    value: function renderModalDialog() {
      var _this2 = this;

      var attributes = omit(this.props, propsToOmit);

      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
        'div',
        _extends({
          className: mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()('modal-dialog', this.props.className, defineProperty({}, 'modal-' + this.props.size, this.props.size)), this.props.cssModule),
          role: 'document',
          ref: function ref(c) {
            return _this2._dialog = c;
          }
        }, attributes),
        __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
          'div',
          {
            className: mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()('modal-content', this.props.contentClassName), this.props.cssModule)
          },
          this.props.children
        )
      );
    }
  }, {
    key: 'renderIntoSubtree',
    value: function renderIntoSubtree() {
      __WEBPACK_IMPORTED_MODULE_4_react_dom___default.a.unstable_renderSubtreeIntoContainer(this, this.renderChildren(), this._element);

      // check if modal should receive focus
      if (this._focus) {
        this._dialog.parentNode.focus();
        this._focus = false;
      }
    }
  }, {
    key: 'renderChildren',
    value: function renderChildren() {
      var _props = this.props,
          wrapClassName = _props.wrapClassName,
          modalClassName = _props.modalClassName,
          backdropClassName = _props.backdropClassName,
          cssModule = _props.cssModule,
          isOpen = _props.isOpen,
          backdrop = _props.backdrop,
          modalTransitionTimeout = _props.modalTransitionTimeout,
          backdropTransitionTimeout = _props.backdropTransitionTimeout;


      var modalAttributes = {
        onClickCapture: this.handleBackdropClick,
        onKeyUp: this.handleEscape,
        style: { display: 'block' },
        tabIndex: '-1'
      };

      if (this.hasTransition()) {
        return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
          __WEBPACK_IMPORTED_MODULE_8_react_transition_group__["TransitionGroup"],
          { component: 'div', className: mapToCssModules(wrapClassName) },
          isOpen && __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
            Fade,
            _extends({
              key: 'modal-dialog',
              onEnter: this.onEnter,
              onLeave: this.onExit,
              transitionAppearTimeout: typeof this.props.modalTransitionAppearTimeout === 'number' ? this.props.modalTransitionAppearTimeout : modalTransitionTimeout,
              transitionEnterTimeout: typeof this.props.modalTransitionEnterTimeout === 'number' ? this.props.modalTransitionEnterTimeout : modalTransitionTimeout,
              transitionLeaveTimeout: typeof this.props.modalTransitionLeaveTimeout === 'number' ? this.props.modalTransitionLeaveTimeout : modalTransitionTimeout,
              cssModule: cssModule,
              className: mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()('modal', modalClassName), cssModule)
            }, modalAttributes),
            this.renderModalDialog()
          ),
          isOpen && backdrop && __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Fade, {
            key: 'modal-backdrop',
            transitionAppearTimeout: typeof this.props.backdropTransitionAppearTimeout === 'number' ? this.props.backdropTransitionAppearTimeout : backdropTransitionTimeout,
            transitionEnterTimeout: typeof this.props.backdropTransitionEnterTimeout === 'number' ? this.props.backdropTransitionEnterTimeout : backdropTransitionTimeout,
            transitionLeaveTimeout: typeof this.props.backdropTransitionLeaveTimeout === 'number' ? this.props.backdropTransitionLeaveTimeout : backdropTransitionTimeout,
            cssModule: cssModule,
            className: mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()('modal-backdrop', backdropClassName), cssModule)
          })
        );
      }

      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
        'div',
        { className: mapToCssModules(wrapClassName) },
        isOpen && __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
          'div',
          _extends({
            className: mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()('modal', 'show', modalClassName), cssModule)
          }, modalAttributes),
          this.renderModalDialog()
        ),
        isOpen && backdrop && __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement('div', {
          className: mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()('modal-backdrop', 'show', backdropClassName), cssModule)
        })
      );
    }
  }, {
    key: 'render',
    value: function render() {
      return null;
    }
  }]);
  return Modal;
}(__WEBPACK_IMPORTED_MODULE_0_react___default.a.Component);

Modal.propTypes = propTypes$40;
Modal.defaultProps = defaultProps$39;

var propTypes$41 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  wrapTag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  toggle: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node
};

var defaultProps$40 = {
  tag: 'h4',
  wrapTag: 'div'
};

var ModalHeader = function ModalHeader(props) {
  var closeButton = void 0;
  var className = props.className,
      cssModule = props.cssModule,
      children = props.children,
      toggle = props.toggle,
      Tag = props.tag,
      WrapTag = props.wrapTag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'children', 'toggle', 'tag', 'wrapTag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'modal-header'), cssModule);

  if (toggle) {
    closeButton = __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
      'button',
      { type: 'button', onClick: toggle, className: 'close', 'aria-label': 'Close' },
      __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
        'span',
        { 'aria-hidden': 'true' },
        String.fromCharCode(215)
      )
    );
  }

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
    WrapTag,
    _extends({}, attributes, { className: classes }),
    __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
      Tag,
      { className: mapToCssModules('modal-title', cssModule) },
      children
    ),
    closeButton
  );
};

ModalHeader.propTypes = propTypes$41;
ModalHeader.defaultProps = defaultProps$40;

var propTypes$42 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$41 = {
  tag: 'div'
};

var ModalBody = function ModalBody(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'modal-body'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

ModalBody.propTypes = propTypes$42;
ModalBody.defaultProps = defaultProps$41;

var propTypes$43 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$42 = {
  tag: 'div'
};

var ModalFooter = function ModalFooter(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'modal-footer'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

ModalFooter.propTypes = propTypes$43;
ModalFooter.defaultProps = defaultProps$42;

var propTypes$44 = {
  placement: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOf(tetherAttachements),
  target: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object]).isRequired,
  isOpen: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  disabled: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tether: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  tetherRef: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  toggle: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  autohide: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  delay: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.shape({ show: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number, hide: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number }), __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number])
};

var DEFAULT_DELAYS = {
  show: 0,
  hide: 250
};

var defaultProps$43 = {
  isOpen: false,
  placement: 'bottom',
  delay: DEFAULT_DELAYS,
  autohide: true,
  toggle: function toggle() {}
};

var defaultTetherConfig$2 = {
  classPrefix: 'bs-tether',
  classes: {
    element: false,
    enabled: 'show'
  },
  constraints: [{ to: 'scrollParent', attachment: 'together none' }, { to: 'window', attachment: 'together none' }]
};

var Tooltip = function (_React$Component) {
  inherits(Tooltip, _React$Component);

  function Tooltip(props) {
    classCallCheck(this, Tooltip);

    var _this = possibleConstructorReturn(this, (Tooltip.__proto__ || Object.getPrototypeOf(Tooltip)).call(this, props));

    _this.addTargetEvents = _this.addTargetEvents.bind(_this);
    _this.getTarget = _this.getTarget.bind(_this);
    _this.getTetherConfig = _this.getTetherConfig.bind(_this);
    _this.handleDocumentClick = _this.handleDocumentClick.bind(_this);
    _this.removeTargetEvents = _this.removeTargetEvents.bind(_this);
    _this.toggle = _this.toggle.bind(_this);
    _this.onMouseOverTooltip = _this.onMouseOverTooltip.bind(_this);
    _this.onMouseLeaveTooltip = _this.onMouseLeaveTooltip.bind(_this);
    _this.onMouseOverTooltipContent = _this.onMouseOverTooltipContent.bind(_this);
    _this.onMouseLeaveTooltipContent = _this.onMouseLeaveTooltipContent.bind(_this);
    _this.show = _this.show.bind(_this);
    _this.hide = _this.hide.bind(_this);
    return _this;
  }

  createClass(Tooltip, [{
    key: 'componentDidMount',
    value: function componentDidMount() {
      this._target = this.getTarget();
      this.addTargetEvents();
    }
  }, {
    key: 'componentWillUnmount',
    value: function componentWillUnmount() {
      this.removeTargetEvents();
    }
  }, {
    key: 'onMouseOverTooltip',
    value: function onMouseOverTooltip() {
      if (this._hideTimeout) {
        this.clearHideTimeout();
      }
      this._showTimeout = setTimeout(this.show, this.getDelay('show'));
    }
  }, {
    key: 'onMouseLeaveTooltip',
    value: function onMouseLeaveTooltip() {
      if (this._showTimeout) {
        this.clearShowTimeout();
      }
      this._hideTimeout = setTimeout(this.hide, this.getDelay('hide'));
    }
  }, {
    key: 'onMouseOverTooltipContent',
    value: function onMouseOverTooltipContent() {
      if (this.props.autohide) {
        return;
      }
      if (this._hideTimeout) {
        this.clearHideTimeout();
      }
    }
  }, {
    key: 'onMouseLeaveTooltipContent',
    value: function onMouseLeaveTooltipContent() {
      if (this.props.autohide) {
        return;
      }
      if (this._showTimeout) {
        this.clearShowTimeout();
      }
      this._hideTimeout = setTimeout(this.hide, this.getDelay('hide'));
    }
  }, {
    key: 'getDelay',
    value: function getDelay(key) {
      var delay = this.props.delay;

      if ((typeof delay === 'undefined' ? 'undefined' : _typeof(delay)) === 'object') {
        return isNaN(delay[key]) ? DEFAULT_DELAYS[key] : delay[key];
      }
      return delay;
    }
  }, {
    key: 'getTarget',
    value: function getTarget() {
      var target = this.props.target;

      if ((typeof target === 'undefined' ? 'undefined' : _typeof(target)) === 'object') {
        return target;
      }
      return document.getElementById(target);
    }
  }, {
    key: 'getTetherConfig',
    value: function getTetherConfig() {
      var attachments = getTetherAttachments(this.props.placement);
      return _extends({}, defaultTetherConfig$2, attachments, {
        target: this.getTarget
      }, this.props.tether);
    }
  }, {
    key: 'show',
    value: function show() {
      if (!this.props.isOpen) {
        this.clearShowTimeout();
        this.toggle();
      }
    }
  }, {
    key: 'hide',
    value: function hide() {
      if (this.props.isOpen) {
        this.clearHideTimeout();
        this.toggle();
      }
    }
  }, {
    key: 'clearShowTimeout',
    value: function clearShowTimeout() {
      clearTimeout(this._showTimeout);
      this._showTimeout = undefined;
    }
  }, {
    key: 'clearHideTimeout',
    value: function clearHideTimeout() {
      clearTimeout(this._hideTimeout);
      this._hideTimeout = undefined;
    }
  }, {
    key: 'handleDocumentClick',
    value: function handleDocumentClick(e) {
      if (e.target === this._target || this._target.contains(e.target)) {
        if (this._hideTimeout) {
          this.clearHideTimeout();
        }

        if (!this.props.isOpen) {
          this.toggle();
        }
      }
    }
  }, {
    key: 'addTargetEvents',
    value: function addTargetEvents() {
      this._target.addEventListener('mouseover', this.onMouseOverTooltip, true);
      this._target.addEventListener('mouseout', this.onMouseLeaveTooltip, true);
      document.addEventListener('click', this.handleDocumentClick, true);
    }
  }, {
    key: 'removeTargetEvents',
    value: function removeTargetEvents() {
      this._target.removeEventListener('mouseover', this.onMouseOverTooltip, true);
      this._target.removeEventListener('mouseout', this.onMouseLeaveTooltip, true);
      document.removeEventListener('click', this.handleDocumentClick, true);
    }
  }, {
    key: 'toggle',
    value: function toggle(e) {
      if (this.props.disabled) {
        return e && e.preventDefault();
      }

      return this.props.toggle();
    }
  }, {
    key: 'render',
    value: function render() {
      if (!this.props.isOpen) {
        return null;
      }

      var attributes = omit(this.props, Object.keys(propTypes$44));
      var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()('tooltip-inner', this.props.className), this.props.cssModule);

      var tetherConfig = this.getTetherConfig();

      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
        TetherContent,
        {
          className: 'tooltip',
          tether: tetherConfig,
          tetherRef: this.props.tetherRef,
          isOpen: this.props.isOpen,
          toggle: this.toggle
        },
        __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement('div', _extends({}, attributes, {
          className: classes,
          onMouseOver: this.onMouseOverTooltipContent,
          onMouseLeave: this.onMouseLeaveTooltipContent
        }))
      );
    }
  }]);
  return Tooltip;
}(__WEBPACK_IMPORTED_MODULE_0_react___default.a.Component);

Tooltip.propTypes = propTypes$44;
Tooltip.defaultProps = defaultProps$43;

var propTypes$45 = {
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  size: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  bordered: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  striped: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  inverse: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  hover: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  reflow: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  responsive: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  responsiveTag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string])
};

var defaultProps$44 = {
  tag: 'table',
  responsiveTag: 'div'
};

var Table = function Table(props) {
  var className = props.className,
      cssModule = props.cssModule,
      size = props.size,
      bordered = props.bordered,
      striped = props.striped,
      inverse = props.inverse,
      hover = props.hover,
      reflow = props.reflow,
      responsive = props.responsive,
      Tag = props.tag,
      ResponsiveTag = props.responsiveTag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'size', 'bordered', 'striped', 'inverse', 'hover', 'reflow', 'responsive', 'tag', 'responsiveTag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'table', size ? 'table-' + size : false, bordered ? 'table-bordered' : false, striped ? 'table-striped' : false, inverse ? 'table-inverse' : false, hover ? 'table-hover' : false, reflow ? 'table-reflow' : false), cssModule);

  var table = __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));

  if (responsive) {
    return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
      ResponsiveTag,
      { className: 'table-responsive' },
      table
    );
  }

  return table;
};

Table.propTypes = propTypes$45;
Table.defaultProps = defaultProps$44;

var propTypes$46 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  flush: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$45 = {
  tag: 'ul'
};

var ListGroup = function ListGroup(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      flush = props.flush,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag', 'flush']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'list-group', flush ? 'list-group-flush' : false), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

ListGroup.propTypes = propTypes$46;
ListGroup.defaultProps = defaultProps$45;

var propTypes$47 = {
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  inline: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  getRef: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$46 = {
  tag: 'form'
};

var Form = function Form(props) {
  var className = props.className,
      cssModule = props.cssModule,
      inline = props.inline,
      Tag = props.tag,
      getRef = props.getRef,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'inline', 'tag', 'getRef']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, inline ? 'form-inline' : false), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { ref: getRef, className: classes }));
};

Form.propTypes = propTypes$47;
Form.defaultProps = defaultProps$46;

var propTypes$48 = {
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$47 = {
  tag: 'div'
};

var FormFeedback = function FormFeedback(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'form-control-feedback'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

FormFeedback.propTypes = propTypes$48;
FormFeedback.defaultProps = defaultProps$47;

var propTypes$49 = {
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  row: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  check: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  disabled: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  color: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$48 = {
  tag: 'div'
};

var FormGroup = function FormGroup(props) {
  var className = props.className,
      cssModule = props.cssModule,
      row = props.row,
      disabled = props.disabled,
      color = props.color,
      check = props.check,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'row', 'disabled', 'color', 'check', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, color ? 'has-' + color : false, row ? 'row' : false, check ? 'form-check' : 'form-group', check && disabled ? 'disabled' : false), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

FormGroup.propTypes = propTypes$49;
FormGroup.defaultProps = defaultProps$48;

var propTypes$50 = {
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  inline: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  color: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$49 = {
  tag: 'small'
};

var FormText = function FormText(props) {
  var className = props.className,
      cssModule = props.cssModule,
      inline = props.inline,
      color = props.color,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'inline', 'color', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, !inline ? 'form-text' : false, color ? 'text-' + color : false), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

FormText.propTypes = propTypes$50;
FormText.defaultProps = defaultProps$49;

/* eslint react/prefer-stateless-function: 0 */

var propTypes$51 = {
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  type: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  size: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  state: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  getRef: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  static: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  addon: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$50 = {
  tag: 'p',
  type: 'text'
};

var Input = function (_React$Component) {
  inherits(Input, _React$Component);

  function Input() {
    classCallCheck(this, Input);
    return possibleConstructorReturn(this, (Input.__proto__ || Object.getPrototypeOf(Input)).apply(this, arguments));
  }

  createClass(Input, [{
    key: 'render',
    value: function render() {
      var _props = this.props,
          className = _props.className,
          cssModule = _props.cssModule,
          type = _props.type,
          size = _props.size,
          state = _props.state,
          tag = _props.tag,
          addon = _props.addon,
          staticInput = _props.static,
          getRef = _props.getRef,
          attributes = objectWithoutProperties(_props, ['className', 'cssModule', 'type', 'size', 'state', 'tag', 'addon', 'static', 'getRef']);


      var checkInput = ['radio', 'checkbox'].indexOf(type) > -1;

      var fileInput = type === 'file';
      var textareaInput = type === 'textarea';
      var selectInput = type === 'select';
      var Tag = selectInput || textareaInput ? type : 'input';

      var formControlClass = 'form-control';

      if (staticInput) {
        formControlClass = formControlClass + '-static';
        Tag = tag;
      } else if (fileInput) {
        formControlClass = formControlClass + '-file';
      } else if (checkInput) {
        if (addon) {
          formControlClass = null;
        } else {
          formControlClass = 'form-check-input';
        }
      }

      var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, state ? 'form-control-' + state : false, size ? 'form-control-' + size : false, formControlClass), cssModule);

      if (Tag === 'input') {
        attributes.type = type;
      }

      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { ref: getRef, className: classes }));
    }
  }]);
  return Input;
}(__WEBPACK_IMPORTED_MODULE_0_react___default.a.Component);

Input.propTypes = propTypes$51;
Input.defaultProps = defaultProps$50;

var propTypes$52 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  size: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$51 = {
  tag: 'div'
};

var InputGroup = function InputGroup(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      size = props.size,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag', 'size']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'input-group', size ? 'input-group-' + size : null), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

InputGroup.propTypes = propTypes$52;
InputGroup.defaultProps = defaultProps$51;

var propTypes$53 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$52 = {
  tag: 'div'
};

var InputGroupAddon = function InputGroupAddon(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'input-group-addon'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

InputGroupAddon.propTypes = propTypes$53;
InputGroupAddon.defaultProps = defaultProps$52;

var propTypes$54 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  groupClassName: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  groupAttributes: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$53 = {
  tag: 'div'
};

var InputGroupButton = function InputGroupButton(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      children = props.children,
      groupClassName = props.groupClassName,
      groupAttributes = props.groupAttributes,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag', 'children', 'groupClassName', 'groupAttributes']);


  if (typeof children === 'string') {
    var groupClasses = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(groupClassName, 'input-group-btn'), cssModule);

    return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
      Tag,
      _extends({}, groupAttributes, { className: groupClasses }),
      __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Button, _extends({}, attributes, { className: className, children: children }))
    );
  }

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'input-group-btn'), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes, children: children }));
};

InputGroupButton.propTypes = propTypes$54;
InputGroupButton.defaultProps = defaultProps$53;

var colSizes = ['xs', 'sm', 'md', 'lg', 'xl'];

var stringOrNumberProp$1 = __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]);

var columnProps$1 = __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.shape({
  size: stringOrNumberProp$1,
  push: stringOrNumberProp$1,
  pull: stringOrNumberProp$1,
  offset: stringOrNumberProp$1
})]);

var propTypes$55 = {
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  hidden: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  check: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  inline: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  disabled: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  size: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  for: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  xs: columnProps$1,
  sm: columnProps$1,
  md: columnProps$1,
  lg: columnProps$1,
  xl: columnProps$1
};

var defaultProps$54 = {
  tag: 'label'
};

var Label = function Label(props) {
  var className = props.className,
      cssModule = props.cssModule,
      hidden = props.hidden,
      Tag = props.tag,
      check = props.check,
      inline = props.inline,
      disabled = props.disabled,
      size = props.size,
      htmlFor = props.for,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'hidden', 'tag', 'check', 'inline', 'disabled', 'size', 'for']);


  var colClasses = [];

  colSizes.forEach(function (colSize) {
    var columnProp = props[colSize];
    delete attributes[colSize];

    if (columnProp && columnProp.size) {
      var _classNames;

      colClasses.push(mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()((_classNames = {}, defineProperty(_classNames, 'col-' + colSize + '-' + columnProp.size, columnProp.size), defineProperty(_classNames, 'push-' + colSize + '-' + columnProp.push, columnProp.push), defineProperty(_classNames, 'pull-' + colSize + '-' + columnProp.pull, columnProp.pull), defineProperty(_classNames, 'offset-' + colSize + '-' + columnProp.offset, columnProp.offset), _classNames))), cssModule);
    } else if (columnProp) {
      colClasses.push('col-' + colSize + '-' + columnProp);
    }
  });

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, hidden ? 'sr-only' : false, check ? 'form-check-' + (inline ? 'inline' : 'label') : false, check && inline && disabled ? 'disabled' : false, size ? 'col-form-label-' + size : false, colClasses, colClasses.length ? 'col-form-label' : false, !check && !colClasses.length ? 'form-control-label' : false), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({ htmlFor: htmlFor }, attributes, { className: classes }));
};

Label.propTypes = propTypes$55;
Label.defaultProps = defaultProps$54;

var propTypes$56 = {
  body: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  bottom: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  heading: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  left: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  list: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  middle: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  object: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  right: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  top: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool
};

var Media = function Media(props) {
  var body = props.body,
      bottom = props.bottom,
      className = props.className,
      cssModule = props.cssModule,
      heading = props.heading,
      left = props.left,
      list = props.list,
      middle = props.middle,
      object = props.object,
      right = props.right,
      tag = props.tag,
      top = props.top,
      attributes = objectWithoutProperties(props, ['body', 'bottom', 'className', 'cssModule', 'heading', 'left', 'list', 'middle', 'object', 'right', 'tag', 'top']);


  var defaultTag = void 0;
  if (heading) {
    defaultTag = 'h4';
  } else if (left || right) {
    defaultTag = 'a';
  } else if (object) {
    defaultTag = 'img';
  } else if (list) {
    defaultTag = 'ul';
  } else {
    defaultTag = 'div';
  }
  var Tag = tag || defaultTag;

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, {
    'media-body': body,
    'media-heading': heading,
    'media-left': left,
    'media-right': right,
    'media-top': top,
    'media-bottom': bottom,
    'media-middle': middle,
    'media-object': object,
    'media-list': list,
    media: !body && !heading && !left && !right && !top && !bottom && !middle && !object && !list
  }), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

Media.propTypes = propTypes$56;

var propTypes$57 = {
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  size: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string])
};

var defaultProps$55 = {
  tag: 'ul'
};

var Pagination = function Pagination(props) {
  var className = props.className,
      cssModule = props.cssModule,
      size = props.size,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'size', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'pagination', defineProperty({}, 'pagination-' + size, !!size)), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

Pagination.propTypes = propTypes$57;
Pagination.defaultProps = defaultProps$55;

var propTypes$58 = {
  active: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  disabled: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string])
};

var defaultProps$56 = {
  tag: 'li'
};

var PaginationItem = function PaginationItem(props) {
  var active = props.active,
      className = props.className,
      cssModule = props.cssModule,
      disabled = props.disabled,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['active', 'className', 'cssModule', 'disabled', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'page-item', {
    active: active,
    disabled: disabled
  }), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

PaginationItem.propTypes = propTypes$58;
PaginationItem.defaultProps = defaultProps$56;

var propTypes$59 = {
  'aria-label': __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  next: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  previous: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string])
};

var defaultProps$57 = {
  tag: 'a'
};

var PaginationLink = function PaginationLink(props) {
  var className = props.className,
      cssModule = props.cssModule,
      next = props.next,
      previous = props.previous,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'next', 'previous', 'tag']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'page-link'), cssModule);

  var defaultAriaLabel = void 0;
  if (previous) {
    defaultAriaLabel = 'Previous';
  } else if (next) {
    defaultAriaLabel = 'Next';
  }
  var ariaLabel = props['aria-label'] || defaultAriaLabel;

  var defaultCaret = void 0;
  if (previous) {
    defaultCaret = '\xAB';
  } else if (next) {
    defaultCaret = '\xBB';
  }

  var children = props.children;
  if (previous || next) {
    children = [__WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
      'span',
      {
        'aria-hidden': 'true',
        key: 'caret'
      },
      children || defaultCaret
    ), __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
      'span',
      {
        className: 'sr-only',
        key: 'sr'
      },
      ariaLabel
    )];
  }

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
    Tag,
    _extends({}, attributes, {
      className: classes,
      'aria-label': ariaLabel
    }),
    children
  );
};

PaginationLink.propTypes = propTypes$59;
PaginationLink.defaultProps = defaultProps$57;

var propTypes$60 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  activeTab: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.any,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$58 = {
  tag: 'div'
};

var childContextTypes$1 = {
  activeTabId: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.any
};

var TabContent = function (_Component) {
  inherits(TabContent, _Component);

  function TabContent(props) {
    classCallCheck(this, TabContent);

    var _this = possibleConstructorReturn(this, (TabContent.__proto__ || Object.getPrototypeOf(TabContent)).call(this, props));

    _this.state = {
      activeTab: _this.props.activeTab
    };
    return _this;
  }

  createClass(TabContent, [{
    key: 'getChildContext',
    value: function getChildContext() {
      return {
        activeTabId: this.state.activeTab
      };
    }
  }, {
    key: 'componentWillReceiveProps',
    value: function componentWillReceiveProps(nextProps) {
      if (this.state.activeTab !== nextProps.activeTab) {
        this.setState({
          activeTab: nextProps.activeTab
        });
      }
    }
  }, {
    key: 'render',
    value: function render() {
      var _props = this.props,
          className = _props.className,
          cssModule = _props.cssModule,
          Tag = _props.tag;


      var attributes = omit(this.props, Object.keys(propTypes$60));

      var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()('tab-content', className), cssModule);

      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
    }
  }]);
  return TabContent;
}(__WEBPACK_IMPORTED_MODULE_0_react__["Component"]);

TabContent.propTypes = propTypes$60;
TabContent.defaultProps = defaultProps$58;
TabContent.childContextTypes = childContextTypes$1;

var propTypes$61 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  tabId: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.any
};

var defaultProps$59 = {
  tag: 'div'
};

var contextTypes$3 = {
  activeTabId: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.any
};

function TabPane(props, context) {
  var className = props.className,
      cssModule = props.cssModule,
      tabId = props.tabId,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tabId', 'tag']);

  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()('tab-pane', className, { active: tabId === context.activeTabId }), cssModule);
  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
}
TabPane.propTypes = propTypes$61;
TabPane.defaultProps = defaultProps$59;
TabPane.contextTypes = contextTypes$3;

var propTypes$62 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  fluid: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object
};

var defaultProps$60 = {
  tag: 'div'
};

var Jumbotron = function Jumbotron(props) {
  var className = props.className,
      cssModule = props.cssModule,
      Tag = props.tag,
      fluid = props.fluid,
      attributes = objectWithoutProperties(props, ['className', 'cssModule', 'tag', 'fluid']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'jumbotron', fluid ? 'jumbotron-fluid' : false), cssModule);

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

Jumbotron.propTypes = propTypes$62;
Jumbotron.defaultProps = defaultProps$60;

var FirstChild = function FirstChild(_ref) {
  var children = _ref.children;
  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.Children.toArray(children)[0] || null;
};

var propTypes$63 = {
  children: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  closeClassName: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  color: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  isOpen: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  toggle: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  transitionAppearTimeout: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number,
  transitionEnterTimeout: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number,
  transitionLeaveTimeout: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number
};

var defaultProps$61 = {
  color: 'success',
  isOpen: true,
  tag: 'div',
  transitionAppearTimeout: 150,
  transitionEnterTimeout: 150,
  transitionLeaveTimeout: 150
};

var Alert = function Alert(props) {
  var className = props.className,
      closeClassName = props.closeClassName,
      cssModule = props.cssModule,
      Tag = props.tag,
      color = props.color,
      isOpen = props.isOpen,
      toggle = props.toggle,
      children = props.children,
      transitionAppearTimeout = props.transitionAppearTimeout,
      transitionEnterTimeout = props.transitionEnterTimeout,
      transitionLeaveTimeout = props.transitionLeaveTimeout,
      attributes = objectWithoutProperties(props, ['className', 'closeClassName', 'cssModule', 'tag', 'color', 'isOpen', 'toggle', 'children', 'transitionAppearTimeout', 'transitionEnterTimeout', 'transitionLeaveTimeout']);


  var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'alert', 'alert-' + color, { 'alert-dismissible': toggle }), cssModule);

  var closeClasses = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()('close', closeClassName), cssModule);

  var alert = __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
    Tag,
    _extends({}, attributes, { className: classes, role: 'alert' }),
    toggle ? __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
      'button',
      { type: 'button', className: closeClasses, 'aria-label': 'Close', onClick: toggle },
      __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
        'span',
        { 'aria-hidden': 'true' },
        '\xD7'
      )
    ) : null,
    children
  );

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(
    __WEBPACK_IMPORTED_MODULE_8_react_transition_group__["CSSTransitionGroup"],
    {
      component: FirstChild,
      transitionName: {
        appear: 'fade',
        appearActive: 'show',
        enter: 'fade',
        enterActive: 'show',
        leave: 'fade',
        leaveActive: 'out'
      },
      transitionAppear: transitionAppearTimeout > 0,
      transitionAppearTimeout: transitionAppearTimeout,
      transitionEnter: transitionEnterTimeout > 0,
      transitionEnterTimeout: transitionEnterTimeout,
      transitionLeave: transitionLeaveTimeout > 0,
      transitionLeaveTimeout: transitionLeaveTimeout
    },
    isOpen ? alert : null
  );
};

Alert.propTypes = propTypes$63;
Alert.defaultProps = defaultProps$61;

var SHOW = 'SHOW';
var SHOWN = 'SHOWN';
var HIDE = 'HIDE';
var HIDDEN = 'HIDDEN';

var propTypes$64 = {
  isOpen: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.node,
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  cssModule: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.object,
  navbar: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  delay: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.shape({ show: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number, hide: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number }), __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.number]),
  onOpened: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func,
  onClosed: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func
};

var DEFAULT_DELAYS$1 = {
  show: 350,
  hide: 350
};

var defaultProps$62 = {
  isOpen: false,
  tag: 'div',
  delay: DEFAULT_DELAYS$1,
  onOpened: function onOpened() {},
  onClosed: function onClosed() {}
};

var Collapse = function (_Component) {
  inherits(Collapse, _Component);

  function Collapse(props) {
    classCallCheck(this, Collapse);

    var _this = possibleConstructorReturn(this, (Collapse.__proto__ || Object.getPrototypeOf(Collapse)).call(this, props));

    _this.state = {
      collapse: props.isOpen ? SHOWN : HIDDEN,
      height: null
    };
    _this.element = null;
    return _this;
  }

  createClass(Collapse, [{
    key: 'componentWillReceiveProps',
    value: function componentWillReceiveProps(nextProps) {
      var _this2 = this;

      var willOpen = nextProps.isOpen;
      var collapse = this.state.collapse;

      if (willOpen && collapse === HIDDEN) {
        // will open
        this.setState({ collapse: SHOW }, function () {
          // the height transition will work after class "collapsing" applied
          _this2.setState({ height: _this2.getHeight() });
          _this2.transitionTag = setTimeout(function () {
            _this2.setState({
              collapse: SHOWN,
              height: null
            });
          }, _this2.getDelay('show'));
        });
      } else if (!willOpen && collapse === SHOWN) {
        // will hide
        this.setState({ height: this.getHeight() }, function () {
          _this2.setState({
            collapse: HIDE,
            height: _this2.getHeight()
          }, function () {
            _this2.setState({ height: 0 });
          });
        });

        this.transitionTag = setTimeout(function () {
          _this2.setState({
            collapse: HIDDEN,
            height: null
          });
        }, this.getDelay('hide'));
      }
      // else: do nothing.
    }
  }, {
    key: 'componentDidUpdate',
    value: function componentDidUpdate(prevProps, prevState) {
      if (this.state.collapse === SHOWN && prevState && prevState.collapse !== SHOWN) {
        this.props.onOpened();
      }

      if (this.state.collapse === HIDDEN && prevState && prevState.collapse !== HIDDEN) {
        this.props.onClosed();
      }
    }
  }, {
    key: 'componentWillUnmount',
    value: function componentWillUnmount() {
      clearTimeout(this.transitionTag);
    }
  }, {
    key: 'getDelay',
    value: function getDelay(key) {
      var delay = this.props.delay;

      if ((typeof delay === 'undefined' ? 'undefined' : _typeof(delay)) === 'object') {
        return isNaN(delay[key]) ? DEFAULT_DELAYS$1[key] : delay[key];
      }
      return delay;
    }
  }, {
    key: 'getHeight',
    value: function getHeight() {
      return this.element.scrollHeight;
    }
  }, {
    key: 'render',
    value: function render() {
      var _this3 = this;

      var _omit = omit(this.props, ['isOpen', 'delay', 'onOpened', 'onClosed']),
          navbar = _omit.navbar,
          className = _omit.className,
          cssModule = _omit.cssModule,
          Tag = _omit.tag,
          attributes = objectWithoutProperties(_omit, ['navbar', 'className', 'cssModule', 'tag']);

      var _state = this.state,
          collapse = _state.collapse,
          height = _state.height;

      var collapseClass = void 0;
      switch (collapse) {
        case SHOW:
          collapseClass = 'collapsing';
          break;
        case SHOWN:
          collapseClass = 'collapse show';
          break;
        case HIDE:
          collapseClass = 'collapsing';
          break;
        case HIDDEN:
          collapseClass = 'collapse';
          break;
        default:
          // HIDDEN
          collapseClass = 'collapse';
      }

      var classes = mapToCssModules(__WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, collapseClass, navbar && 'navbar-collapse'), cssModule);
      var style = height === null ? null : { height: height };
      return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, {
        style: _extends({}, attributes.style, style),
        className: classes,
        ref: function ref(c) {
          _this3.element = c;
        }
      }));
    }
  }]);
  return Collapse;
}(__WEBPACK_IMPORTED_MODULE_0_react__["Component"]);

Collapse.propTypes = propTypes$64;
Collapse.defaultProps = defaultProps$62;

var propTypes$65 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  active: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  disabled: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  color: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string,
  action: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.bool,
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.any
};

var defaultProps$63 = {
  tag: 'li'
};

var handleDisabledOnClick = function handleDisabledOnClick(e) {
  e.preventDefault();
};

var ListGroupItem = function ListGroupItem(props) {
  var className = props.className,
      Tag = props.tag,
      active = props.active,
      disabled = props.disabled,
      action = props.action,
      color = props.color,
      attributes = objectWithoutProperties(props, ['className', 'tag', 'active', 'disabled', 'action', 'color']);

  var classes = __WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, active ? 'active' : false, disabled ? 'disabled' : false, action ? 'list-group-item-action' : false, color ? 'list-group-item-' + color : false, 'list-group-item');

  // Prevent click event when disabled.
  if (disabled) {
    attributes.onClick = handleDisabledOnClick;
  }
  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

ListGroupItem.propTypes = propTypes$65;
ListGroupItem.defaultProps = defaultProps$63;

var propTypes$66 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.any
};

var defaultProps$64 = {
  tag: 'h5'
};

var ListGroupItemHeading = function ListGroupItemHeading(props) {
  var className = props.className,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'tag']);

  var classes = __WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'list-group-item-heading');

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

ListGroupItemHeading.propTypes = propTypes$66;
ListGroupItemHeading.defaultProps = defaultProps$64;

var propTypes$67 = {
  tag: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.oneOfType([__WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.func, __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.string]),
  className: __WEBPACK_IMPORTED_MODULE_1_prop_types___default.a.any
};

var defaultProps$65 = {
  tag: 'p'
};

var ListGroupItemText = function ListGroupItemText(props) {
  var className = props.className,
      Tag = props.tag,
      attributes = objectWithoutProperties(props, ['className', 'tag']);

  var classes = __WEBPACK_IMPORTED_MODULE_2_classnames___default()(className, 'list-group-item-text');

  return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({}, attributes, { className: classes }));
};

ListGroupItemText.propTypes = propTypes$67;
ListGroupItemText.defaultProps = defaultProps$65;

var Component$1 = __WEBPACK_IMPORTED_MODULE_0_react___default.a.Component;

var components = {
  UncontrolledAlert: Alert,
  UncontrolledButtonDropdown: ButtonDropdown,
  UncontrolledDropdown: Dropdown,
  UncontrolledNavDropdown: NavDropdown,
  UncontrolledTooltip: Tooltip
};

Object.keys(components).forEach(function (key) {
  var Tag = components[key];
  var defaultValue = Tag === Alert;

  var Uncontrolled = function (_Component) {
    inherits(Uncontrolled, _Component);

    function Uncontrolled(props) {
      classCallCheck(this, Uncontrolled);

      var _this = possibleConstructorReturn(this, (Uncontrolled.__proto__ || Object.getPrototypeOf(Uncontrolled)).call(this, props));

      _this.state = { isOpen: defaultValue };

      _this.toggle = _this.toggle.bind(_this);
      return _this;
    }

    createClass(Uncontrolled, [{
      key: 'toggle',
      value: function toggle() {
        this.setState({ isOpen: !this.state.isOpen });
      }
    }, {
      key: 'render',
      value: function render() {
        return __WEBPACK_IMPORTED_MODULE_0_react___default.a.createElement(Tag, _extends({ isOpen: this.state.isOpen, toggle: this.toggle }, this.props));
      }
    }]);
    return Uncontrolled;
  }(Component$1);

  Uncontrolled.displayName = key;

  components[key] = Uncontrolled;
});

var UncontrolledAlert = components.UncontrolledAlert;
var UncontrolledButtonDropdown = components.UncontrolledButtonDropdown;
var UncontrolledDropdown = components.UncontrolledDropdown;
var UncontrolledNavDropdown = components.UncontrolledNavDropdown;
var UncontrolledTooltip = components.UncontrolledTooltip;




/***/ }),
/* 43 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
/* WEBPACK VAR INJECTION */(function(process) {/**
 * Copyright (c) 2013-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */



var emptyFunction = __webpack_require__(8);
var invariant = __webpack_require__(9);
var warning = __webpack_require__(17);
var assign = __webpack_require__(44);

var ReactPropTypesSecret = __webpack_require__(10);
var checkPropTypes = __webpack_require__(45);

module.exports = function(isValidElement, throwOnDirectAccess) {
  /* global Symbol */
  var ITERATOR_SYMBOL = typeof Symbol === 'function' && Symbol.iterator;
  var FAUX_ITERATOR_SYMBOL = '@@iterator'; // Before Symbol spec.

  /**
   * Returns the iterator method function contained on the iterable object.
   *
   * Be sure to invoke the function with the iterable as context:
   *
   *     var iteratorFn = getIteratorFn(myIterable);
   *     if (iteratorFn) {
   *       var iterator = iteratorFn.call(myIterable);
   *       ...
   *     }
   *
   * @param {?object} maybeIterable
   * @return {?function}
   */
  function getIteratorFn(maybeIterable) {
    var iteratorFn = maybeIterable && (ITERATOR_SYMBOL && maybeIterable[ITERATOR_SYMBOL] || maybeIterable[FAUX_ITERATOR_SYMBOL]);
    if (typeof iteratorFn === 'function') {
      return iteratorFn;
    }
  }

  /**
   * Collection of methods that allow declaration and validation of props that are
   * supplied to React components. Example usage:
   *
   *   var Props = require('ReactPropTypes');
   *   var MyArticle = React.createClass({
   *     propTypes: {
   *       // An optional string prop named "description".
   *       description: Props.string,
   *
   *       // A required enum prop named "category".
   *       category: Props.oneOf(['News','Photos']).isRequired,
   *
   *       // A prop named "dialog" that requires an instance of Dialog.
   *       dialog: Props.instanceOf(Dialog).isRequired
   *     },
   *     render: function() { ... }
   *   });
   *
   * A more formal specification of how these methods are used:
   *
   *   type := array|bool|func|object|number|string|oneOf([...])|instanceOf(...)
   *   decl := ReactPropTypes.{type}(.isRequired)?
   *
   * Each and every declaration produces a function with the same signature. This
   * allows the creation of custom validation functions. For example:
   *
   *  var MyLink = React.createClass({
   *    propTypes: {
   *      // An optional string or URI prop named "href".
   *      href: function(props, propName, componentName) {
   *        var propValue = props[propName];
   *        if (propValue != null && typeof propValue !== 'string' &&
   *            !(propValue instanceof URI)) {
   *          return new Error(
   *            'Expected a string or an URI for ' + propName + ' in ' +
   *            componentName
   *          );
   *        }
   *      }
   *    },
   *    render: function() {...}
   *  });
   *
   * @internal
   */

  var ANONYMOUS = '<<anonymous>>';

  // Important!
  // Keep this list in sync with production version in `./factoryWithThrowingShims.js`.
  var ReactPropTypes = {
    array: createPrimitiveTypeChecker('array'),
    bool: createPrimitiveTypeChecker('boolean'),
    func: createPrimitiveTypeChecker('function'),
    number: createPrimitiveTypeChecker('number'),
    object: createPrimitiveTypeChecker('object'),
    string: createPrimitiveTypeChecker('string'),
    symbol: createPrimitiveTypeChecker('symbol'),

    any: createAnyTypeChecker(),
    arrayOf: createArrayOfTypeChecker,
    element: createElementTypeChecker(),
    instanceOf: createInstanceTypeChecker,
    node: createNodeChecker(),
    objectOf: createObjectOfTypeChecker,
    oneOf: createEnumTypeChecker,
    oneOfType: createUnionTypeChecker,
    shape: createShapeTypeChecker,
    exact: createStrictShapeTypeChecker,
  };

  /**
   * inlined Object.is polyfill to avoid requiring consumers ship their own
   * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is
   */
  /*eslint-disable no-self-compare*/
  function is(x, y) {
    // SameValue algorithm
    if (x === y) {
      // Steps 1-5, 7-10
      // Steps 6.b-6.e: +0 != -0
      return x !== 0 || 1 / x === 1 / y;
    } else {
      // Step 6.a: NaN == NaN
      return x !== x && y !== y;
    }
  }
  /*eslint-enable no-self-compare*/

  /**
   * We use an Error-like object for backward compatibility as people may call
   * PropTypes directly and inspect their output. However, we don't use real
   * Errors anymore. We don't inspect their stack anyway, and creating them
   * is prohibitively expensive if they are created too often, such as what
   * happens in oneOfType() for any type before the one that matched.
   */
  function PropTypeError(message) {
    this.message = message;
    this.stack = '';
  }
  // Make `instanceof Error` still work for returned errors.
  PropTypeError.prototype = Error.prototype;

  function createChainableTypeChecker(validate) {
    if (process.env.NODE_ENV !== 'production') {
      var manualPropTypeCallCache = {};
      var manualPropTypeWarningCount = 0;
    }
    function checkType(isRequired, props, propName, componentName, location, propFullName, secret) {
      componentName = componentName || ANONYMOUS;
      propFullName = propFullName || propName;

      if (secret !== ReactPropTypesSecret) {
        if (throwOnDirectAccess) {
          // New behavior only for users of `prop-types` package
          invariant(
            false,
            'Calling PropTypes validators directly is not supported by the `prop-types` package. ' +
            'Use `PropTypes.checkPropTypes()` to call them. ' +
            'Read more at http://fb.me/use-check-prop-types'
          );
        } else if (process.env.NODE_ENV !== 'production' && typeof console !== 'undefined') {
          // Old behavior for people using React.PropTypes
          var cacheKey = componentName + ':' + propName;
          if (
            !manualPropTypeCallCache[cacheKey] &&
            // Avoid spamming the console because they are often not actionable except for lib authors
            manualPropTypeWarningCount < 3
          ) {
            warning(
              false,
              'You are manually calling a React.PropTypes validation ' +
              'function for the `%s` prop on `%s`. This is deprecated ' +
              'and will throw in the standalone `prop-types` package. ' +
              'You may be seeing this warning due to a third-party PropTypes ' +
              'library. See https://fb.me/react-warning-dont-call-proptypes ' + 'for details.',
              propFullName,
              componentName
            );
            manualPropTypeCallCache[cacheKey] = true;
            manualPropTypeWarningCount++;
          }
        }
      }
      if (props[propName] == null) {
        if (isRequired) {
          if (props[propName] === null) {
            return new PropTypeError('The ' + location + ' `' + propFullName + '` is marked as required ' + ('in `' + componentName + '`, but its value is `null`.'));
          }
          return new PropTypeError('The ' + location + ' `' + propFullName + '` is marked as required in ' + ('`' + componentName + '`, but its value is `undefined`.'));
        }
        return null;
      } else {
        return validate(props, propName, componentName, location, propFullName);
      }
    }

    var chainedCheckType = checkType.bind(null, false);
    chainedCheckType.isRequired = checkType.bind(null, true);

    return chainedCheckType;
  }

  function createPrimitiveTypeChecker(expectedType) {
    function validate(props, propName, componentName, location, propFullName, secret) {
      var propValue = props[propName];
      var propType = getPropType(propValue);
      if (propType !== expectedType) {
        // `propValue` being instance of, say, date/regexp, pass the 'object'
        // check, but we can offer a more precise error message here rather than
        // 'of type `object`'.
        var preciseType = getPreciseType(propValue);

        return new PropTypeError('Invalid ' + location + ' `' + propFullName + '` of type ' + ('`' + preciseType + '` supplied to `' + componentName + '`, expected ') + ('`' + expectedType + '`.'));
      }
      return null;
    }
    return createChainableTypeChecker(validate);
  }

  function createAnyTypeChecker() {
    return createChainableTypeChecker(emptyFunction.thatReturnsNull);
  }

  function createArrayOfTypeChecker(typeChecker) {
    function validate(props, propName, componentName, location, propFullName) {
      if (typeof typeChecker !== 'function') {
        return new PropTypeError('Property `' + propFullName + '` of component `' + componentName + '` has invalid PropType notation inside arrayOf.');
      }
      var propValue = props[propName];
      if (!Array.isArray(propValue)) {
        var propType = getPropType(propValue);
        return new PropTypeError('Invalid ' + location + ' `' + propFullName + '` of type ' + ('`' + propType + '` supplied to `' + componentName + '`, expected an array.'));
      }
      for (var i = 0; i < propValue.length; i++) {
        var error = typeChecker(propValue, i, componentName, location, propFullName + '[' + i + ']', ReactPropTypesSecret);
        if (error instanceof Error) {
          return error;
        }
      }
      return null;
    }
    return createChainableTypeChecker(validate);
  }

  function createElementTypeChecker() {
    function validate(props, propName, componentName, location, propFullName) {
      var propValue = props[propName];
      if (!isValidElement(propValue)) {
        var propType = getPropType(propValue);
        return new PropTypeError('Invalid ' + location + ' `' + propFullName + '` of type ' + ('`' + propType + '` supplied to `' + componentName + '`, expected a single ReactElement.'));
      }
      return null;
    }
    return createChainableTypeChecker(validate);
  }

  function createInstanceTypeChecker(expectedClass) {
    function validate(props, propName, componentName, location, propFullName) {
      if (!(props[propName] instanceof expectedClass)) {
        var expectedClassName = expectedClass.name || ANONYMOUS;
        var actualClassName = getClassName(props[propName]);
        return new PropTypeError('Invalid ' + location + ' `' + propFullName + '` of type ' + ('`' + actualClassName + '` supplied to `' + componentName + '`, expected ') + ('instance of `' + expectedClassName + '`.'));
      }
      return null;
    }
    return createChainableTypeChecker(validate);
  }

  function createEnumTypeChecker(expectedValues) {
    if (!Array.isArray(expectedValues)) {
      process.env.NODE_ENV !== 'production' ? warning(false, 'Invalid argument supplied to oneOf, expected an instance of array.') : void 0;
      return emptyFunction.thatReturnsNull;
    }

    function validate(props, propName, componentName, location, propFullName) {
      var propValue = props[propName];
      for (var i = 0; i < expectedValues.length; i++) {
        if (is(propValue, expectedValues[i])) {
          return null;
        }
      }

      var valuesString = JSON.stringify(expectedValues);
      return new PropTypeError('Invalid ' + location + ' `' + propFullName + '` of value `' + propValue + '` ' + ('supplied to `' + componentName + '`, expected one of ' + valuesString + '.'));
    }
    return createChainableTypeChecker(validate);
  }

  function createObjectOfTypeChecker(typeChecker) {
    function validate(props, propName, componentName, location, propFullName) {
      if (typeof typeChecker !== 'function') {
        return new PropTypeError('Property `' + propFullName + '` of component `' + componentName + '` has invalid PropType notation inside objectOf.');
      }
      var propValue = props[propName];
      var propType = getPropType(propValue);
      if (propType !== 'object') {
        return new PropTypeError('Invalid ' + location + ' `' + propFullName + '` of type ' + ('`' + propType + '` supplied to `' + componentName + '`, expected an object.'));
      }
      for (var key in propValue) {
        if (propValue.hasOwnProperty(key)) {
          var error = typeChecker(propValue, key, componentName, location, propFullName + '.' + key, ReactPropTypesSecret);
          if (error instanceof Error) {
            return error;
          }
        }
      }
      return null;
    }
    return createChainableTypeChecker(validate);
  }

  function createUnionTypeChecker(arrayOfTypeCheckers) {
    if (!Array.isArray(arrayOfTypeCheckers)) {
      process.env.NODE_ENV !== 'production' ? warning(false, 'Invalid argument supplied to oneOfType, expected an instance of array.') : void 0;
      return emptyFunction.thatReturnsNull;
    }

    for (var i = 0; i < arrayOfTypeCheckers.length; i++) {
      var checker = arrayOfTypeCheckers[i];
      if (typeof checker !== 'function') {
        warning(
          false,
          'Invalid argument supplied to oneOfType. Expected an array of check functions, but ' +
          'received %s at index %s.',
          getPostfixForTypeWarning(checker),
          i
        );
        return emptyFunction.thatReturnsNull;
      }
    }

    function validate(props, propName, componentName, location, propFullName) {
      for (var i = 0; i < arrayOfTypeCheckers.length; i++) {
        var checker = arrayOfTypeCheckers[i];
        if (checker(props, propName, componentName, location, propFullName, ReactPropTypesSecret) == null) {
          return null;
        }
      }

      return new PropTypeError('Invalid ' + location + ' `' + propFullName + '` supplied to ' + ('`' + componentName + '`.'));
    }
    return createChainableTypeChecker(validate);
  }

  function createNodeChecker() {
    function validate(props, propName, componentName, location, propFullName) {
      if (!isNode(props[propName])) {
        return new PropTypeError('Invalid ' + location + ' `' + propFullName + '` supplied to ' + ('`' + componentName + '`, expected a ReactNode.'));
      }
      return null;
    }
    return createChainableTypeChecker(validate);
  }

  function createShapeTypeChecker(shapeTypes) {
    function validate(props, propName, componentName, location, propFullName) {
      var propValue = props[propName];
      var propType = getPropType(propValue);
      if (propType !== 'object') {
        return new PropTypeError('Invalid ' + location + ' `' + propFullName + '` of type `' + propType + '` ' + ('supplied to `' + componentName + '`, expected `object`.'));
      }
      for (var key in shapeTypes) {
        var checker = shapeTypes[key];
        if (!checker) {
          continue;
        }
        var error = checker(propValue, key, componentName, location, propFullName + '.' + key, ReactPropTypesSecret);
        if (error) {
          return error;
        }
      }
      return null;
    }
    return createChainableTypeChecker(validate);
  }

  function createStrictShapeTypeChecker(shapeTypes) {
    function validate(props, propName, componentName, location, propFullName) {
      var propValue = props[propName];
      var propType = getPropType(propValue);
      if (propType !== 'object') {
        return new PropTypeError('Invalid ' + location + ' `' + propFullName + '` of type `' + propType + '` ' + ('supplied to `' + componentName + '`, expected `object`.'));
      }
      // We need to check all keys in case some are required but missing from
      // props.
      var allKeys = assign({}, props[propName], shapeTypes);
      for (var key in allKeys) {
        var checker = shapeTypes[key];
        if (!checker) {
          return new PropTypeError(
            'Invalid ' + location + ' `' + propFullName + '` key `' + key + '` supplied to `' + componentName + '`.' +
            '\nBad object: ' + JSON.stringify(props[propName], null, '  ') +
            '\nValid keys: ' +  JSON.stringify(Object.keys(shapeTypes), null, '  ')
          );
        }
        var error = checker(propValue, key, componentName, location, propFullName + '.' + key, ReactPropTypesSecret);
        if (error) {
          return error;
        }
      }
      return null;
    }

    return createChainableTypeChecker(validate);
  }

  function isNode(propValue) {
    switch (typeof propValue) {
      case 'number':
      case 'string':
      case 'undefined':
        return true;
      case 'boolean':
        return !propValue;
      case 'object':
        if (Array.isArray(propValue)) {
          return propValue.every(isNode);
        }
        if (propValue === null || isValidElement(propValue)) {
          return true;
        }

        var iteratorFn = getIteratorFn(propValue);
        if (iteratorFn) {
          var iterator = iteratorFn.call(propValue);
          var step;
          if (iteratorFn !== propValue.entries) {
            while (!(step = iterator.next()).done) {
              if (!isNode(step.value)) {
                return false;
              }
            }
          } else {
            // Iterator will provide entry [k,v] tuples rather than values.
            while (!(step = iterator.next()).done) {
              var entry = step.value;
              if (entry) {
                if (!isNode(entry[1])) {
                  return false;
                }
              }
            }
          }
        } else {
          return false;
        }

        return true;
      default:
        return false;
    }
  }

  function isSymbol(propType, propValue) {
    // Native Symbol.
    if (propType === 'symbol') {
      return true;
    }

    // 19.4.3.5 Symbol.prototype[@@toStringTag] === 'Symbol'
    if (propValue['@@toStringTag'] === 'Symbol') {
      return true;
    }

    // Fallback for non-spec compliant Symbols which are polyfilled.
    if (typeof Symbol === 'function' && propValue instanceof Symbol) {
      return true;
    }

    return false;
  }

  // Equivalent of `typeof` but with special handling for array and regexp.
  function getPropType(propValue) {
    var propType = typeof propValue;
    if (Array.isArray(propValue)) {
      return 'array';
    }
    if (propValue instanceof RegExp) {
      // Old webkits (at least until Android 4.0) return 'function' rather than
      // 'object' for typeof a RegExp. We'll normalize this here so that /bla/
      // passes PropTypes.object.
      return 'object';
    }
    if (isSymbol(propType, propValue)) {
      return 'symbol';
    }
    return propType;
  }

  // This handles more types than `getPropType`. Only used for error messages.
  // See `createPrimitiveTypeChecker`.
  function getPreciseType(propValue) {
    if (typeof propValue === 'undefined' || propValue === null) {
      return '' + propValue;
    }
    var propType = getPropType(propValue);
    if (propType === 'object') {
      if (propValue instanceof Date) {
        return 'date';
      } else if (propValue instanceof RegExp) {
        return 'regexp';
      }
    }
    return propType;
  }

  // Returns a string that is postfixed to a warning about an invalid type.
  // For example, "undefined" or "of type array"
  function getPostfixForTypeWarning(value) {
    var type = getPreciseType(value);
    switch (type) {
      case 'array':
      case 'object':
        return 'an ' + type;
      case 'boolean':
      case 'date':
      case 'regexp':
        return 'a ' + type;
      default:
        return type;
    }
  }

  // Returns class name of the object, if any.
  function getClassName(propValue) {
    if (!propValue.constructor || !propValue.constructor.name) {
      return ANONYMOUS;
    }
    return propValue.constructor.name;
  }

  ReactPropTypes.checkPropTypes = checkPropTypes;
  ReactPropTypes.PropTypes = ReactPropTypes;

  return ReactPropTypes;
};

/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(1)))

/***/ }),
/* 44 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
/*
object-assign
(c) Sindre Sorhus
@license MIT
*/


/* eslint-disable no-unused-vars */
var getOwnPropertySymbols = Object.getOwnPropertySymbols;
var hasOwnProperty = Object.prototype.hasOwnProperty;
var propIsEnumerable = Object.prototype.propertyIsEnumerable;

function toObject(val) {
	if (val === null || val === undefined) {
		throw new TypeError('Object.assign cannot be called with null or undefined');
	}

	return Object(val);
}

function shouldUseNative() {
	try {
		if (!Object.assign) {
			return false;
		}

		// Detect buggy property enumeration order in older V8 versions.

		// https://bugs.chromium.org/p/v8/issues/detail?id=4118
		var test1 = new String('abc');  // eslint-disable-line no-new-wrappers
		test1[5] = 'de';
		if (Object.getOwnPropertyNames(test1)[0] === '5') {
			return false;
		}

		// https://bugs.chromium.org/p/v8/issues/detail?id=3056
		var test2 = {};
		for (var i = 0; i < 10; i++) {
			test2['_' + String.fromCharCode(i)] = i;
		}
		var order2 = Object.getOwnPropertyNames(test2).map(function (n) {
			return test2[n];
		});
		if (order2.join('') !== '0123456789') {
			return false;
		}

		// https://bugs.chromium.org/p/v8/issues/detail?id=3056
		var test3 = {};
		'abcdefghijklmnopqrst'.split('').forEach(function (letter) {
			test3[letter] = letter;
		});
		if (Object.keys(Object.assign({}, test3)).join('') !==
				'abcdefghijklmnopqrst') {
			return false;
		}

		return true;
	} catch (err) {
		// We don't expect any of the above to throw, but better to be safe.
		return false;
	}
}

module.exports = shouldUseNative() ? Object.assign : function (target, source) {
	var from;
	var to = toObject(target);
	var symbols;

	for (var s = 1; s < arguments.length; s++) {
		from = Object(arguments[s]);

		for (var key in from) {
			if (hasOwnProperty.call(from, key)) {
				to[key] = from[key];
			}
		}

		if (getOwnPropertySymbols) {
			symbols = getOwnPropertySymbols(from);
			for (var i = 0; i < symbols.length; i++) {
				if (propIsEnumerable.call(from, symbols[i])) {
					to[symbols[i]] = from[symbols[i]];
				}
			}
		}
	}

	return to;
};


/***/ }),
/* 45 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
/* WEBPACK VAR INJECTION */(function(process) {/**
 * Copyright (c) 2013-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */



if (process.env.NODE_ENV !== 'production') {
  var invariant = __webpack_require__(9);
  var warning = __webpack_require__(17);
  var ReactPropTypesSecret = __webpack_require__(10);
  var loggedTypeFailures = {};
}

/**
 * Assert that the values match with the type specs.
 * Error messages are memorized and will only be shown once.
 *
 * @param {object} typeSpecs Map of name to a ReactPropType
 * @param {object} values Runtime values that need to be type-checked
 * @param {string} location e.g. "prop", "context", "child context"
 * @param {string} componentName Name of the component for error messages.
 * @param {?Function} getStack Returns the component stack.
 * @private
 */
function checkPropTypes(typeSpecs, values, location, componentName, getStack) {
  if (process.env.NODE_ENV !== 'production') {
    for (var typeSpecName in typeSpecs) {
      if (typeSpecs.hasOwnProperty(typeSpecName)) {
        var error;
        // Prop type validation may throw. In case they do, we don't want to
        // fail the render phase where it didn't fail before. So we log it.
        // After these have been cleaned up, we'll let them throw.
        try {
          // This is intentionally an invariant that gets caught. It's the same
          // behavior as without this statement except with a better message.
          invariant(typeof typeSpecs[typeSpecName] === 'function', '%s: %s type `%s` is invalid; it must be a function, usually from ' + 'the `prop-types` package, but received `%s`.', componentName || 'React class', location, typeSpecName, typeof typeSpecs[typeSpecName]);
          error = typeSpecs[typeSpecName](values, typeSpecName, componentName, location, null, ReactPropTypesSecret);
        } catch (ex) {
          error = ex;
        }
        warning(!error || error instanceof Error, '%s: type specification of %s `%s` is invalid; the type checker ' + 'function must return `null` or an `Error` but returned a %s. ' + 'You may have forgotten to pass an argument to the type checker ' + 'creator (arrayOf, instanceOf, objectOf, oneOf, oneOfType, and ' + 'shape all require an argument).', componentName || 'React class', location, typeSpecName, typeof error);
        if (error instanceof Error && !(error.message in loggedTypeFailures)) {
          // Only monitor this failure once because there tends to be a lot of the
          // same error.
          loggedTypeFailures[error.message] = true;

          var stack = getStack ? getStack() : '';

          warning(false, 'Failed %s type: %s%s', location, error.message, stack != null ? stack : '');
        }
      }
    }
  }
}

module.exports = checkPropTypes;

/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(1)))

/***/ }),
/* 46 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
/**
 * Copyright (c) 2013-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */



var emptyFunction = __webpack_require__(8);
var invariant = __webpack_require__(9);
var ReactPropTypesSecret = __webpack_require__(10);

module.exports = function() {
  function shim(props, propName, componentName, location, propFullName, secret) {
    if (secret === ReactPropTypesSecret) {
      // It is still safe when called from React.
      return;
    }
    invariant(
      false,
      'Calling PropTypes validators directly is not supported by the `prop-types` package. ' +
      'Use PropTypes.checkPropTypes() to call them. ' +
      'Read more at http://fb.me/use-check-prop-types'
    );
  };
  shim.isRequired = shim;
  function getShim() {
    return shim;
  };
  // Important!
  // Keep this list in sync with production version in `./factoryWithTypeCheckers.js`.
  var ReactPropTypes = {
    array: shim,
    bool: shim,
    func: shim,
    number: shim,
    object: shim,
    string: shim,
    symbol: shim,

    any: shim,
    arrayOf: getShim,
    element: shim,
    instanceOf: getShim,
    node: shim,
    objectOf: getShim,
    oneOf: getShim,
    oneOfType: getShim,
    shape: getShim,
    exact: getShim
  };

  ReactPropTypes.checkPropTypes = emptyFunction;
  ReactPropTypes.PropTypes = ReactPropTypes;

  return ReactPropTypes;
};


/***/ }),
/* 47 */
/***/ (function(module, exports, __webpack_require__) {

var __WEBPACK_AMD_DEFINE_ARRAY__, __WEBPACK_AMD_DEFINE_RESULT__;/*!
  Copyright (c) 2016 Jed Watson.
  Licensed under the MIT License (MIT), see
  http://jedwatson.github.io/classnames
*/
/* global define */

(function () {
	'use strict';

	var hasOwn = {}.hasOwnProperty;

	function classNames () {
		var classes = [];

		for (var i = 0; i < arguments.length; i++) {
			var arg = arguments[i];
			if (!arg) continue;

			var argType = typeof arg;

			if (argType === 'string' || argType === 'number') {
				classes.push(arg);
			} else if (Array.isArray(arg)) {
				classes.push(classNames.apply(null, arg));
			} else if (argType === 'object') {
				for (var key in arg) {
					if (hasOwn.call(arg, key) && arg[key]) {
						classes.push(key);
					}
				}
			}
		}

		return classes.join(' ');
	}

	if (typeof module !== 'undefined' && module.exports) {
		module.exports = classNames;
	} else if (true) {
		// register as 'classnames', consistent with npm package name
		!(__WEBPACK_AMD_DEFINE_ARRAY__ = [], __WEBPACK_AMD_DEFINE_RESULT__ = (function () {
			return classNames;
		}).apply(exports, __WEBPACK_AMD_DEFINE_ARRAY__),
				__WEBPACK_AMD_DEFINE_RESULT__ !== undefined && (module.exports = __WEBPACK_AMD_DEFINE_RESULT__));
	} else {
		window.classNames = classNames;
	}
}());


/***/ }),
/* 48 */
/***/ (function(module, exports) {

/**
 * lodash 3.0.2 (Custom Build) <https://lodash.com/>
 * Build: `lodash modern modularize exports="npm" -o ./`
 * Copyright 2012-2015 The Dojo Foundation <http://dojofoundation.org/>
 * Based on Underscore.js 1.8.3 <http://underscorejs.org/LICENSE>
 * Copyright 2009-2015 Jeremy Ashkenas, DocumentCloud and Investigative Reporters & Editors
 * Available under MIT license <https://lodash.com/license>
 */

/**
 * Checks if `value` is the [language type](https://es5.github.io/#x8) of `Object`.
 * (e.g. arrays, functions, objects, regexes, `new Number(0)`, and `new String('')`)
 *
 * @static
 * @memberOf _
 * @category Lang
 * @param {*} value The value to check.
 * @returns {boolean} Returns `true` if `value` is an object, else `false`.
 * @example
 *
 * _.isObject({});
 * // => true
 *
 * _.isObject([1, 2, 3]);
 * // => true
 *
 * _.isObject(1);
 * // => false
 */
function isObject(value) {
  // Avoid a V8 JIT bug in Chrome 19-20.
  // See https://code.google.com/p/v8/issues/detail?id=2291 for more details.
  var type = typeof value;
  return !!value && (type == 'object' || type == 'function');
}

module.exports = isObject;


/***/ }),
/* 49 */
/***/ (function(module, exports, __webpack_require__) {

/* WEBPACK VAR INJECTION */(function(global) {/**
 * Lodash (Custom Build) <https://lodash.com/>
 * Build: `lodash modularize exports="npm" -o ./`
 * Copyright JS Foundation and other contributors <https://js.foundation/>
 * Released under MIT license <https://lodash.com/license>
 * Based on Underscore.js 1.8.3 <http://underscorejs.org/LICENSE>
 * Copyright Jeremy Ashkenas, DocumentCloud and Investigative Reporters & Editors
 */

/** `Object#toString` result references. */
var asyncTag = '[object AsyncFunction]',
    funcTag = '[object Function]',
    genTag = '[object GeneratorFunction]',
    nullTag = '[object Null]',
    proxyTag = '[object Proxy]',
    undefinedTag = '[object Undefined]';

/** Detect free variable `global` from Node.js. */
var freeGlobal = typeof global == 'object' && global && global.Object === Object && global;

/** Detect free variable `self`. */
var freeSelf = typeof self == 'object' && self && self.Object === Object && self;

/** Used as a reference to the global object. */
var root = freeGlobal || freeSelf || Function('return this')();

/** Used for built-in method references. */
var objectProto = Object.prototype;

/** Used to check objects for own properties. */
var hasOwnProperty = objectProto.hasOwnProperty;

/**
 * Used to resolve the
 * [`toStringTag`](http://ecma-international.org/ecma-262/7.0/#sec-object.prototype.tostring)
 * of values.
 */
var nativeObjectToString = objectProto.toString;

/** Built-in value references. */
var Symbol = root.Symbol,
    symToStringTag = Symbol ? Symbol.toStringTag : undefined;

/**
 * The base implementation of `getTag` without fallbacks for buggy environments.
 *
 * @private
 * @param {*} value The value to query.
 * @returns {string} Returns the `toStringTag`.
 */
function baseGetTag(value) {
  if (value == null) {
    return value === undefined ? undefinedTag : nullTag;
  }
  return (symToStringTag && symToStringTag in Object(value))
    ? getRawTag(value)
    : objectToString(value);
}

/**
 * A specialized version of `baseGetTag` which ignores `Symbol.toStringTag` values.
 *
 * @private
 * @param {*} value The value to query.
 * @returns {string} Returns the raw `toStringTag`.
 */
function getRawTag(value) {
  var isOwn = hasOwnProperty.call(value, symToStringTag),
      tag = value[symToStringTag];

  try {
    value[symToStringTag] = undefined;
    var unmasked = true;
  } catch (e) {}

  var result = nativeObjectToString.call(value);
  if (unmasked) {
    if (isOwn) {
      value[symToStringTag] = tag;
    } else {
      delete value[symToStringTag];
    }
  }
  return result;
}

/**
 * Converts `value` to a string using `Object.prototype.toString`.
 *
 * @private
 * @param {*} value The value to convert.
 * @returns {string} Returns the converted string.
 */
function objectToString(value) {
  return nativeObjectToString.call(value);
}

/**
 * Checks if `value` is classified as a `Function` object.
 *
 * @static
 * @memberOf _
 * @since 0.1.0
 * @category Lang
 * @param {*} value The value to check.
 * @returns {boolean} Returns `true` if `value` is a function, else `false`.
 * @example
 *
 * _.isFunction(_);
 * // => true
 *
 * _.isFunction(/abc/);
 * // => false
 */
function isFunction(value) {
  if (!isObject(value)) {
    return false;
  }
  // The use of `Object#toString` avoids issues with the `typeof` operator
  // in Safari 9 which returns 'object' for typed arrays and other constructors.
  var tag = baseGetTag(value);
  return tag == funcTag || tag == genTag || tag == asyncTag || tag == proxyTag;
}

/**
 * Checks if `value` is the
 * [language type](http://www.ecma-international.org/ecma-262/7.0/#sec-ecmascript-language-types)
 * of `Object`. (e.g. arrays, functions, objects, regexes, `new Number(0)`, and `new String('')`)
 *
 * @static
 * @memberOf _
 * @since 0.1.0
 * @category Lang
 * @param {*} value The value to check.
 * @returns {boolean} Returns `true` if `value` is an object, else `false`.
 * @example
 *
 * _.isObject({});
 * // => true
 *
 * _.isObject([1, 2, 3]);
 * // => true
 *
 * _.isObject(_.noop);
 * // => true
 *
 * _.isObject(null);
 * // => false
 */
function isObject(value) {
  var type = typeof value;
  return value != null && (type == 'object' || type == 'function');
}

module.exports = isFunction;

/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(7)))

/***/ }),
/* 50 */
/***/ (function(module, exports, __webpack_require__) {

var require;var require;/*! tether 1.3.4 */
(function(f){if(true){module.exports=f()}else if(typeof define==="function"&&define.amd){define([],f)}else{var g;if(typeof window!=="undefined"){g=window}else if(typeof global!=="undefined"){g=global}else if(typeof self!=="undefined"){g=self}else{g=this}g.Tether = f()}})(function(){var define,module,exports;return (function e(t,n,r){function s(o,u){if(!n[o]){if(!t[o]){var a=typeof require=="function"&&require;if(!u&&a)return require(o,!0);if(i)return i(o,!0);var f=new Error("Cannot find module '"+o+"'");throw f.code="MODULE_NOT_FOUND",f}var l=n[o]={exports:{}};t[o][0].call(l.exports,function(e){var n=t[o][1][e];return s(n?n:e)},l,l.exports,e,t,n,r)}return n[o].exports}var i=typeof require=="function"&&require;for(var o=0;o<r.length;o++)s(r[o]);return s})({1:[function(require,module,exports){
'use strict';

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { 'default': obj }; }

var _utils = require('./utils');

var _utils2 = _interopRequireDefault(_utils);

var _TetherBase$Utils = _utils2['default'].Utils;
var getBounds = _TetherBase$Utils.getBounds;
var updateClasses = _TetherBase$Utils.updateClasses;
var defer = _TetherBase$Utils.defer;

_utils2['default'].modules.push({
  position: function position(_ref) {
    var _this = this;

    var top = _ref.top;
    var left = _ref.left;

    var _cache = this.cache('element-bounds', function () {
      return getBounds(_this.element);
    });

    var height = _cache.height;
    var width = _cache.width;

    var targetPos = this.getTargetBounds();

    var bottom = top + height;
    var right = left + width;

    var abutted = [];
    if (top <= targetPos.bottom && bottom >= targetPos.top) {
      ['left', 'right'].forEach(function (side) {
        var targetPosSide = targetPos[side];
        if (targetPosSide === left || targetPosSide === right) {
          abutted.push(side);
        }
      });
    }

    if (left <= targetPos.right && right >= targetPos.left) {
      ['top', 'bottom'].forEach(function (side) {
        var targetPosSide = targetPos[side];
        if (targetPosSide === top || targetPosSide === bottom) {
          abutted.push(side);
        }
      });
    }

    var allClasses = [];
    var addClasses = [];

    var sides = ['left', 'top', 'right', 'bottom'];
    allClasses.push(this.getClass('abutted'));
    sides.forEach(function (side) {
      allClasses.push(_this.getClass('abutted') + '-' + side);
    });

    if (abutted.length) {
      addClasses.push(this.getClass('abutted'));
    }

    abutted.forEach(function (side) {
      addClasses.push(_this.getClass('abutted') + '-' + side);
    });

    defer(function () {
      if (!(_this.options.addTargetClasses === false)) {
        updateClasses(_this.target, addClasses, allClasses);
      }
      updateClasses(_this.element, addClasses, allClasses);
    });

    return true;
  }
});

},{"./utils":5}],2:[function(require,module,exports){
'use strict';

var _slicedToArray = (function () { function sliceIterator(arr, i) { var _arr = []; var _n = true; var _d = false; var _e = undefined; try { for (var _i = arr[Symbol.iterator](), _s; !(_n = (_s = _i.next()).done); _n = true) { _arr.push(_s.value); if (i && _arr.length === i) break; } } catch (err) { _d = true; _e = err; } finally { try { if (!_n && _i['return']) _i['return'](); } finally { if (_d) throw _e; } } return _arr; } return function (arr, i) { if (Array.isArray(arr)) { return arr; } else if (Symbol.iterator in Object(arr)) { return sliceIterator(arr, i); } else { throw new TypeError('Invalid attempt to destructure non-iterable instance'); } }; })();

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { 'default': obj }; }

var _utils = require('./utils');

var _utils2 = _interopRequireDefault(_utils);

var _TetherBase$Utils = _utils2['default'].Utils;
var getBounds = _TetherBase$Utils.getBounds;
var extend = _TetherBase$Utils.extend;
var updateClasses = _TetherBase$Utils.updateClasses;
var defer = _TetherBase$Utils.defer;

var BOUNDS_FORMAT = ['left', 'top', 'right', 'bottom'];

function getBoundingRect(tether, to) {
  if (to === 'scrollParent') {
    to = tether.scrollParents[0];
  } else if (to === 'window') {
    to = [pageXOffset, pageYOffset, innerWidth + pageXOffset, innerHeight + pageYOffset];
  }

  if (to === document) {
    to = to.documentElement;
  }

  if (typeof to.nodeType !== 'undefined') {
    (function () {
      var node = to;
      var size = getBounds(to);
      var pos = size;
      var style = getComputedStyle(to);

      to = [pos.left, pos.top, size.width + pos.left, size.height + pos.top];

      // Account any parent Frames scroll offset
      if (node.ownerDocument !== document) {
        var win = node.ownerDocument.defaultView;
        to[0] += win.pageXOffset;
        to[1] += win.pageYOffset;
        to[2] += win.pageXOffset;
        to[3] += win.pageYOffset;
      }

      BOUNDS_FORMAT.forEach(function (side, i) {
        side = side[0].toUpperCase() + side.substr(1);
        if (side === 'Top' || side === 'Left') {
          to[i] += parseFloat(style['border' + side + 'Width']);
        } else {
          to[i] -= parseFloat(style['border' + side + 'Width']);
        }
      });
    })();
  }

  return to;
}

_utils2['default'].modules.push({
  position: function position(_ref) {
    var _this = this;

    var top = _ref.top;
    var left = _ref.left;
    var targetAttachment = _ref.targetAttachment;

    if (!this.options.constraints) {
      return true;
    }

    var _cache = this.cache('element-bounds', function () {
      return getBounds(_this.element);
    });

    var height = _cache.height;
    var width = _cache.width;

    if (width === 0 && height === 0 && typeof this.lastSize !== 'undefined') {
      var _lastSize = this.lastSize;

      // Handle the item getting hidden as a result of our positioning without glitching
      // the classes in and out
      width = _lastSize.width;
      height = _lastSize.height;
    }

    var targetSize = this.cache('target-bounds', function () {
      return _this.getTargetBounds();
    });

    var targetHeight = targetSize.height;
    var targetWidth = targetSize.width;

    var allClasses = [this.getClass('pinned'), this.getClass('out-of-bounds')];

    this.options.constraints.forEach(function (constraint) {
      var outOfBoundsClass = constraint.outOfBoundsClass;
      var pinnedClass = constraint.pinnedClass;

      if (outOfBoundsClass) {
        allClasses.push(outOfBoundsClass);
      }
      if (pinnedClass) {
        allClasses.push(pinnedClass);
      }
    });

    allClasses.forEach(function (cls) {
      ['left', 'top', 'right', 'bottom'].forEach(function (side) {
        allClasses.push(cls + '-' + side);
      });
    });

    var addClasses = [];

    var tAttachment = extend({}, targetAttachment);
    var eAttachment = extend({}, this.attachment);

    this.options.constraints.forEach(function (constraint) {
      var to = constraint.to;
      var attachment = constraint.attachment;
      var pin = constraint.pin;

      if (typeof attachment === 'undefined') {
        attachment = '';
      }

      var changeAttachX = undefined,
          changeAttachY = undefined;
      if (attachment.indexOf(' ') >= 0) {
        var _attachment$split = attachment.split(' ');

        var _attachment$split2 = _slicedToArray(_attachment$split, 2);

        changeAttachY = _attachment$split2[0];
        changeAttachX = _attachment$split2[1];
      } else {
        changeAttachX = changeAttachY = attachment;
      }

      var bounds = getBoundingRect(_this, to);

      if (changeAttachY === 'target' || changeAttachY === 'both') {
        if (top < bounds[1] && tAttachment.top === 'top') {
          top += targetHeight;
          tAttachment.top = 'bottom';
        }

        if (top + height > bounds[3] && tAttachment.top === 'bottom') {
          top -= targetHeight;
          tAttachment.top = 'top';
        }
      }

      if (changeAttachY === 'together') {
        if (tAttachment.top === 'top') {
          if (eAttachment.top === 'bottom' && top < bounds[1]) {
            top += targetHeight;
            tAttachment.top = 'bottom';

            top += height;
            eAttachment.top = 'top';
          } else if (eAttachment.top === 'top' && top + height > bounds[3] && top - (height - targetHeight) >= bounds[1]) {
            top -= height - targetHeight;
            tAttachment.top = 'bottom';

            eAttachment.top = 'bottom';
          }
        }

        if (tAttachment.top === 'bottom') {
          if (eAttachment.top === 'top' && top + height > bounds[3]) {
            top -= targetHeight;
            tAttachment.top = 'top';

            top -= height;
            eAttachment.top = 'bottom';
          } else if (eAttachment.top === 'bottom' && top < bounds[1] && top + (height * 2 - targetHeight) <= bounds[3]) {
            top += height - targetHeight;
            tAttachment.top = 'top';

            eAttachment.top = 'top';
          }
        }

        if (tAttachment.top === 'middle') {
          if (top + height > bounds[3] && eAttachment.top === 'top') {
            top -= height;
            eAttachment.top = 'bottom';
          } else if (top < bounds[1] && eAttachment.top === 'bottom') {
            top += height;
            eAttachment.top = 'top';
          }
        }
      }

      if (changeAttachX === 'target' || changeAttachX === 'both') {
        if (left < bounds[0] && tAttachment.left === 'left') {
          left += targetWidth;
          tAttachment.left = 'right';
        }

        if (left + width > bounds[2] && tAttachment.left === 'right') {
          left -= targetWidth;
          tAttachment.left = 'left';
        }
      }

      if (changeAttachX === 'together') {
        if (left < bounds[0] && tAttachment.left === 'left') {
          if (eAttachment.left === 'right') {
            left += targetWidth;
            tAttachment.left = 'right';

            left += width;
            eAttachment.left = 'left';
          } else if (eAttachment.left === 'left') {
            left += targetWidth;
            tAttachment.left = 'right';

            left -= width;
            eAttachment.left = 'right';
          }
        } else if (left + width > bounds[2] && tAttachment.left === 'right') {
          if (eAttachment.left === 'left') {
            left -= targetWidth;
            tAttachment.left = 'left';

            left -= width;
            eAttachment.left = 'right';
          } else if (eAttachment.left === 'right') {
            left -= targetWidth;
            tAttachment.left = 'left';

            left += width;
            eAttachment.left = 'left';
          }
        } else if (tAttachment.left === 'center') {
          if (left + width > bounds[2] && eAttachment.left === 'left') {
            left -= width;
            eAttachment.left = 'right';
          } else if (left < bounds[0] && eAttachment.left === 'right') {
            left += width;
            eAttachment.left = 'left';
          }
        }
      }

      if (changeAttachY === 'element' || changeAttachY === 'both') {
        if (top < bounds[1] && eAttachment.top === 'bottom') {
          top += height;
          eAttachment.top = 'top';
        }

        if (top + height > bounds[3] && eAttachment.top === 'top') {
          top -= height;
          eAttachment.top = 'bottom';
        }
      }

      if (changeAttachX === 'element' || changeAttachX === 'both') {
        if (left < bounds[0]) {
          if (eAttachment.left === 'right') {
            left += width;
            eAttachment.left = 'left';
          } else if (eAttachment.left === 'center') {
            left += width / 2;
            eAttachment.left = 'left';
          }
        }

        if (left + width > bounds[2]) {
          if (eAttachment.left === 'left') {
            left -= width;
            eAttachment.left = 'right';
          } else if (eAttachment.left === 'center') {
            left -= width / 2;
            eAttachment.left = 'right';
          }
        }
      }

      if (typeof pin === 'string') {
        pin = pin.split(',').map(function (p) {
          return p.trim();
        });
      } else if (pin === true) {
        pin = ['top', 'left', 'right', 'bottom'];
      }

      pin = pin || [];

      var pinned = [];
      var oob = [];

      if (top < bounds[1]) {
        if (pin.indexOf('top') >= 0) {
          top = bounds[1];
          pinned.push('top');
        } else {
          oob.push('top');
        }
      }

      if (top + height > bounds[3]) {
        if (pin.indexOf('bottom') >= 0) {
          top = bounds[3] - height;
          pinned.push('bottom');
        } else {
          oob.push('bottom');
        }
      }

      if (left < bounds[0]) {
        if (pin.indexOf('left') >= 0) {
          left = bounds[0];
          pinned.push('left');
        } else {
          oob.push('left');
        }
      }

      if (left + width > bounds[2]) {
        if (pin.indexOf('right') >= 0) {
          left = bounds[2] - width;
          pinned.push('right');
        } else {
          oob.push('right');
        }
      }

      if (pinned.length) {
        (function () {
          var pinnedClass = undefined;
          if (typeof _this.options.pinnedClass !== 'undefined') {
            pinnedClass = _this.options.pinnedClass;
          } else {
            pinnedClass = _this.getClass('pinned');
          }

          addClasses.push(pinnedClass);
          pinned.forEach(function (side) {
            addClasses.push(pinnedClass + '-' + side);
          });
        })();
      }

      if (oob.length) {
        (function () {
          var oobClass = undefined;
          if (typeof _this.options.outOfBoundsClass !== 'undefined') {
            oobClass = _this.options.outOfBoundsClass;
          } else {
            oobClass = _this.getClass('out-of-bounds');
          }

          addClasses.push(oobClass);
          oob.forEach(function (side) {
            addClasses.push(oobClass + '-' + side);
          });
        })();
      }

      if (pinned.indexOf('left') >= 0 || pinned.indexOf('right') >= 0) {
        eAttachment.left = tAttachment.left = false;
      }
      if (pinned.indexOf('top') >= 0 || pinned.indexOf('bottom') >= 0) {
        eAttachment.top = tAttachment.top = false;
      }

      if (tAttachment.top !== targetAttachment.top || tAttachment.left !== targetAttachment.left || eAttachment.top !== _this.attachment.top || eAttachment.left !== _this.attachment.left) {
        _this.updateAttachClasses(eAttachment, tAttachment);
        _this.trigger('update', {
          attachment: eAttachment,
          targetAttachment: tAttachment
        });
      }
    });

    defer(function () {
      if (!(_this.options.addTargetClasses === false)) {
        updateClasses(_this.target, addClasses, allClasses);
      }
      updateClasses(_this.element, addClasses, allClasses);
    });

    return { top: top, left: left };
  }
});

},{"./utils":5}],3:[function(require,module,exports){
'use strict';

var _slicedToArray = (function () { function sliceIterator(arr, i) { var _arr = []; var _n = true; var _d = false; var _e = undefined; try { for (var _i = arr[Symbol.iterator](), _s; !(_n = (_s = _i.next()).done); _n = true) { _arr.push(_s.value); if (i && _arr.length === i) break; } } catch (err) { _d = true; _e = err; } finally { try { if (!_n && _i['return']) _i['return'](); } finally { if (_d) throw _e; } } return _arr; } return function (arr, i) { if (Array.isArray(arr)) { return arr; } else if (Symbol.iterator in Object(arr)) { return sliceIterator(arr, i); } else { throw new TypeError('Invalid attempt to destructure non-iterable instance'); } }; })();

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { 'default': obj }; }

var _utils = require('./utils');

var _utils2 = _interopRequireDefault(_utils);

_utils2['default'].modules.push({
  position: function position(_ref) {
    var top = _ref.top;
    var left = _ref.left;

    if (!this.options.shift) {
      return;
    }

    var shift = this.options.shift;
    if (typeof this.options.shift === 'function') {
      shift = this.options.shift.call(this, { top: top, left: left });
    }

    var shiftTop = undefined,
        shiftLeft = undefined;
    if (typeof shift === 'string') {
      shift = shift.split(' ');
      shift[1] = shift[1] || shift[0];

      var _shift = shift;

      var _shift2 = _slicedToArray(_shift, 2);

      shiftTop = _shift2[0];
      shiftLeft = _shift2[1];

      shiftTop = parseFloat(shiftTop, 10);
      shiftLeft = parseFloat(shiftLeft, 10);
    } else {
      shiftTop = shift.top;
      shiftLeft = shift.left;
    }

    top += shiftTop;
    left += shiftLeft;

    return { top: top, left: left };
  }
});

},{"./utils":5}],4:[function(require,module,exports){
/* globals performance */

'use strict';

Object.defineProperty(exports, '__esModule', {
  value: true
});

var _slicedToArray = (function () { function sliceIterator(arr, i) { var _arr = []; var _n = true; var _d = false; var _e = undefined; try { for (var _i = arr[Symbol.iterator](), _s; !(_n = (_s = _i.next()).done); _n = true) { _arr.push(_s.value); if (i && _arr.length === i) break; } } catch (err) { _d = true; _e = err; } finally { try { if (!_n && _i['return']) _i['return'](); } finally { if (_d) throw _e; } } return _arr; } return function (arr, i) { if (Array.isArray(arr)) { return arr; } else if (Symbol.iterator in Object(arr)) { return sliceIterator(arr, i); } else { throw new TypeError('Invalid attempt to destructure non-iterable instance'); } }; })();

var _createClass = (function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ('value' in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; })();

var _get = function get(_x6, _x7, _x8) { var _again = true; _function: while (_again) { var object = _x6, property = _x7, receiver = _x8; _again = false; if (object === null) object = Function.prototype; var desc = Object.getOwnPropertyDescriptor(object, property); if (desc === undefined) { var parent = Object.getPrototypeOf(object); if (parent === null) { return undefined; } else { _x6 = parent; _x7 = property; _x8 = receiver; _again = true; desc = parent = undefined; continue _function; } } else if ('value' in desc) { return desc.value; } else { var getter = desc.get; if (getter === undefined) { return undefined; } return getter.call(receiver); } } };

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { 'default': obj }; }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError('Cannot call a class as a function'); } }

function _inherits(subClass, superClass) { if (typeof superClass !== 'function' && superClass !== null) { throw new TypeError('Super expression must either be null or a function, not ' + typeof superClass); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, enumerable: false, writable: true, configurable: true } }); if (superClass) Object.setPrototypeOf ? Object.setPrototypeOf(subClass, superClass) : subClass.__proto__ = superClass; }

var _utils = require('./utils');

var _utils2 = _interopRequireDefault(_utils);

require('./constraint');

require('./abutment');

require('./shift');

var _TetherBase$Utils = _utils2['default'].Utils;
var getScrollParents = _TetherBase$Utils.getScrollParents;
var getBounds = _TetherBase$Utils.getBounds;
var getOffsetParent = _TetherBase$Utils.getOffsetParent;
var extend = _TetherBase$Utils.extend;
var addClass = _TetherBase$Utils.addClass;
var removeClass = _TetherBase$Utils.removeClass;
var updateClasses = _TetherBase$Utils.updateClasses;
var defer = _TetherBase$Utils.defer;
var flush = _TetherBase$Utils.flush;
var getScrollBarSize = _TetherBase$Utils.getScrollBarSize;
var removeUtilElements = _TetherBase$Utils.removeUtilElements;
var Evented = _TetherBase$Utils.Evented;

function within(a, b) {
  var diff = arguments.length <= 2 || arguments[2] === undefined ? 1 : arguments[2];

  return a + diff >= b && b >= a - diff;
}

var transformKey = (function () {
  if (typeof document === 'undefined') {
    return '';
  }
  var el = document.createElement('div');

  var transforms = ['transform', 'WebkitTransform', 'OTransform', 'MozTransform', 'msTransform'];
  for (var i = 0; i < transforms.length; ++i) {
    var key = transforms[i];
    if (el.style[key] !== undefined) {
      return key;
    }
  }
})();

var tethers = [];

var position = function position() {
  tethers.forEach(function (tether) {
    tether.position(false);
  });
  flush();
};

function now() {
  if (typeof performance !== 'undefined' && typeof performance.now !== 'undefined') {
    return performance.now();
  }
  return +new Date();
}

(function () {
  var lastCall = null;
  var lastDuration = null;
  var pendingTimeout = null;

  var tick = function tick() {
    if (typeof lastDuration !== 'undefined' && lastDuration > 16) {
      // We voluntarily throttle ourselves if we can't manage 60fps
      lastDuration = Math.min(lastDuration - 16, 250);

      // Just in case this is the last event, remember to position just once more
      pendingTimeout = setTimeout(tick, 250);
      return;
    }

    if (typeof lastCall !== 'undefined' && now() - lastCall < 10) {
      // Some browsers call events a little too frequently, refuse to run more than is reasonable
      return;
    }

    if (pendingTimeout != null) {
      clearTimeout(pendingTimeout);
      pendingTimeout = null;
    }

    lastCall = now();
    position();
    lastDuration = now() - lastCall;
  };

  if (typeof window !== 'undefined' && typeof window.addEventListener !== 'undefined') {
    ['resize', 'scroll', 'touchmove'].forEach(function (event) {
      window.addEventListener(event, tick);
    });
  }
})();

var MIRROR_LR = {
  center: 'center',
  left: 'right',
  right: 'left'
};

var MIRROR_TB = {
  middle: 'middle',
  top: 'bottom',
  bottom: 'top'
};

var OFFSET_MAP = {
  top: 0,
  left: 0,
  middle: '50%',
  center: '50%',
  bottom: '100%',
  right: '100%'
};

var autoToFixedAttachment = function autoToFixedAttachment(attachment, relativeToAttachment) {
  var left = attachment.left;
  var top = attachment.top;

  if (left === 'auto') {
    left = MIRROR_LR[relativeToAttachment.left];
  }

  if (top === 'auto') {
    top = MIRROR_TB[relativeToAttachment.top];
  }

  return { left: left, top: top };
};

var attachmentToOffset = function attachmentToOffset(attachment) {
  var left = attachment.left;
  var top = attachment.top;

  if (typeof OFFSET_MAP[attachment.left] !== 'undefined') {
    left = OFFSET_MAP[attachment.left];
  }

  if (typeof OFFSET_MAP[attachment.top] !== 'undefined') {
    top = OFFSET_MAP[attachment.top];
  }

  return { left: left, top: top };
};

function addOffset() {
  var out = { top: 0, left: 0 };

  for (var _len = arguments.length, offsets = Array(_len), _key = 0; _key < _len; _key++) {
    offsets[_key] = arguments[_key];
  }

  offsets.forEach(function (_ref) {
    var top = _ref.top;
    var left = _ref.left;

    if (typeof top === 'string') {
      top = parseFloat(top, 10);
    }
    if (typeof left === 'string') {
      left = parseFloat(left, 10);
    }

    out.top += top;
    out.left += left;
  });

  return out;
}

function offsetToPx(offset, size) {
  if (typeof offset.left === 'string' && offset.left.indexOf('%') !== -1) {
    offset.left = parseFloat(offset.left, 10) / 100 * size.width;
  }
  if (typeof offset.top === 'string' && offset.top.indexOf('%') !== -1) {
    offset.top = parseFloat(offset.top, 10) / 100 * size.height;
  }

  return offset;
}

var parseOffset = function parseOffset(value) {
  var _value$split = value.split(' ');

  var _value$split2 = _slicedToArray(_value$split, 2);

  var top = _value$split2[0];
  var left = _value$split2[1];

  return { top: top, left: left };
};
var parseAttachment = parseOffset;

var TetherClass = (function (_Evented) {
  _inherits(TetherClass, _Evented);

  function TetherClass(options) {
    var _this = this;

    _classCallCheck(this, TetherClass);

    _get(Object.getPrototypeOf(TetherClass.prototype), 'constructor', this).call(this);
    this.position = this.position.bind(this);

    tethers.push(this);

    this.history = [];

    this.setOptions(options, false);

    _utils2['default'].modules.forEach(function (module) {
      if (typeof module.initialize !== 'undefined') {
        module.initialize.call(_this);
      }
    });

    this.position();
  }

  _createClass(TetherClass, [{
    key: 'getClass',
    value: function getClass() {
      var key = arguments.length <= 0 || arguments[0] === undefined ? '' : arguments[0];
      var classes = this.options.classes;

      if (typeof classes !== 'undefined' && classes[key]) {
        return this.options.classes[key];
      } else if (this.options.classPrefix) {
        return this.options.classPrefix + '-' + key;
      } else {
        return key;
      }
    }
  }, {
    key: 'setOptions',
    value: function setOptions(options) {
      var _this2 = this;

      var pos = arguments.length <= 1 || arguments[1] === undefined ? true : arguments[1];

      var defaults = {
        offset: '0 0',
        targetOffset: '0 0',
        targetAttachment: 'auto auto',
        classPrefix: 'tether'
      };

      this.options = extend(defaults, options);

      var _options = this.options;
      var element = _options.element;
      var target = _options.target;
      var targetModifier = _options.targetModifier;

      this.element = element;
      this.target = target;
      this.targetModifier = targetModifier;

      if (this.target === 'viewport') {
        this.target = document.body;
        this.targetModifier = 'visible';
      } else if (this.target === 'scroll-handle') {
        this.target = document.body;
        this.targetModifier = 'scroll-handle';
      }

      ['element', 'target'].forEach(function (key) {
        if (typeof _this2[key] === 'undefined') {
          throw new Error('Tether Error: Both element and target must be defined');
        }

        if (typeof _this2[key].jquery !== 'undefined') {
          _this2[key] = _this2[key][0];
        } else if (typeof _this2[key] === 'string') {
          _this2[key] = document.querySelector(_this2[key]);
        }
      });

      addClass(this.element, this.getClass('element'));
      if (!(this.options.addTargetClasses === false)) {
        addClass(this.target, this.getClass('target'));
      }

      if (!this.options.attachment) {
        throw new Error('Tether Error: You must provide an attachment');
      }

      this.targetAttachment = parseAttachment(this.options.targetAttachment);
      this.attachment = parseAttachment(this.options.attachment);
      this.offset = parseOffset(this.options.offset);
      this.targetOffset = parseOffset(this.options.targetOffset);

      if (typeof this.scrollParents !== 'undefined') {
        this.disable();
      }

      if (this.targetModifier === 'scroll-handle') {
        this.scrollParents = [this.target];
      } else {
        this.scrollParents = getScrollParents(this.target);
      }

      if (!(this.options.enabled === false)) {
        this.enable(pos);
      }
    }
  }, {
    key: 'getTargetBounds',
    value: function getTargetBounds() {
      if (typeof this.targetModifier !== 'undefined') {
        if (this.targetModifier === 'visible') {
          if (this.target === document.body) {
            return { top: pageYOffset, left: pageXOffset, height: innerHeight, width: innerWidth };
          } else {
            var bounds = getBounds(this.target);

            var out = {
              height: bounds.height,
              width: bounds.width,
              top: bounds.top,
              left: bounds.left
            };

            out.height = Math.min(out.height, bounds.height - (pageYOffset - bounds.top));
            out.height = Math.min(out.height, bounds.height - (bounds.top + bounds.height - (pageYOffset + innerHeight)));
            out.height = Math.min(innerHeight, out.height);
            out.height -= 2;

            out.width = Math.min(out.width, bounds.width - (pageXOffset - bounds.left));
            out.width = Math.min(out.width, bounds.width - (bounds.left + bounds.width - (pageXOffset + innerWidth)));
            out.width = Math.min(innerWidth, out.width);
            out.width -= 2;

            if (out.top < pageYOffset) {
              out.top = pageYOffset;
            }
            if (out.left < pageXOffset) {
              out.left = pageXOffset;
            }

            return out;
          }
        } else if (this.targetModifier === 'scroll-handle') {
          var bounds = undefined;
          var target = this.target;
          if (target === document.body) {
            target = document.documentElement;

            bounds = {
              left: pageXOffset,
              top: pageYOffset,
              height: innerHeight,
              width: innerWidth
            };
          } else {
            bounds = getBounds(target);
          }

          var style = getComputedStyle(target);

          var hasBottomScroll = target.scrollWidth > target.clientWidth || [style.overflow, style.overflowX].indexOf('scroll') >= 0 || this.target !== document.body;

          var scrollBottom = 0;
          if (hasBottomScroll) {
            scrollBottom = 15;
          }

          var height = bounds.height - parseFloat(style.borderTopWidth) - parseFloat(style.borderBottomWidth) - scrollBottom;

          var out = {
            width: 15,
            height: height * 0.975 * (height / target.scrollHeight),
            left: bounds.left + bounds.width - parseFloat(style.borderLeftWidth) - 15
          };

          var fitAdj = 0;
          if (height < 408 && this.target === document.body) {
            fitAdj = -0.00011 * Math.pow(height, 2) - 0.00727 * height + 22.58;
          }

          if (this.target !== document.body) {
            out.height = Math.max(out.height, 24);
          }

          var scrollPercentage = this.target.scrollTop / (target.scrollHeight - height);
          out.top = scrollPercentage * (height - out.height - fitAdj) + bounds.top + parseFloat(style.borderTopWidth);

          if (this.target === document.body) {
            out.height = Math.max(out.height, 24);
          }

          return out;
        }
      } else {
        return getBounds(this.target);
      }
    }
  }, {
    key: 'clearCache',
    value: function clearCache() {
      this._cache = {};
    }
  }, {
    key: 'cache',
    value: function cache(k, getter) {
      // More than one module will often need the same DOM info, so
      // we keep a cache which is cleared on each position call
      if (typeof this._cache === 'undefined') {
        this._cache = {};
      }

      if (typeof this._cache[k] === 'undefined') {
        this._cache[k] = getter.call(this);
      }

      return this._cache[k];
    }
  }, {
    key: 'enable',
    value: function enable() {
      var _this3 = this;

      var pos = arguments.length <= 0 || arguments[0] === undefined ? true : arguments[0];

      if (!(this.options.addTargetClasses === false)) {
        addClass(this.target, this.getClass('enabled'));
      }
      addClass(this.element, this.getClass('enabled'));
      this.enabled = true;

      this.scrollParents.forEach(function (parent) {
        if (parent !== _this3.target.ownerDocument) {
          parent.addEventListener('scroll', _this3.position);
        }
      });

      if (pos) {
        this.position();
      }
    }
  }, {
    key: 'disable',
    value: function disable() {
      var _this4 = this;

      removeClass(this.target, this.getClass('enabled'));
      removeClass(this.element, this.getClass('enabled'));
      this.enabled = false;

      if (typeof this.scrollParents !== 'undefined') {
        this.scrollParents.forEach(function (parent) {
          parent.removeEventListener('scroll', _this4.position);
        });
      }
    }
  }, {
    key: 'destroy',
    value: function destroy() {
      var _this5 = this;

      this.disable();

      tethers.forEach(function (tether, i) {
        if (tether === _this5) {
          tethers.splice(i, 1);
        }
      });

      // Remove any elements we were using for convenience from the DOM
      if (tethers.length === 0) {
        removeUtilElements();
      }
    }
  }, {
    key: 'updateAttachClasses',
    value: function updateAttachClasses(elementAttach, targetAttach) {
      var _this6 = this;

      elementAttach = elementAttach || this.attachment;
      targetAttach = targetAttach || this.targetAttachment;
      var sides = ['left', 'top', 'bottom', 'right', 'middle', 'center'];

      if (typeof this._addAttachClasses !== 'undefined' && this._addAttachClasses.length) {
        // updateAttachClasses can be called more than once in a position call, so
        // we need to clean up after ourselves such that when the last defer gets
        // ran it doesn't add any extra classes from previous calls.
        this._addAttachClasses.splice(0, this._addAttachClasses.length);
      }

      if (typeof this._addAttachClasses === 'undefined') {
        this._addAttachClasses = [];
      }
      var add = this._addAttachClasses;

      if (elementAttach.top) {
        add.push(this.getClass('element-attached') + '-' + elementAttach.top);
      }
      if (elementAttach.left) {
        add.push(this.getClass('element-attached') + '-' + elementAttach.left);
      }
      if (targetAttach.top) {
        add.push(this.getClass('target-attached') + '-' + targetAttach.top);
      }
      if (targetAttach.left) {
        add.push(this.getClass('target-attached') + '-' + targetAttach.left);
      }

      var all = [];
      sides.forEach(function (side) {
        all.push(_this6.getClass('element-attached') + '-' + side);
        all.push(_this6.getClass('target-attached') + '-' + side);
      });

      defer(function () {
        if (!(typeof _this6._addAttachClasses !== 'undefined')) {
          return;
        }

        updateClasses(_this6.element, _this6._addAttachClasses, all);
        if (!(_this6.options.addTargetClasses === false)) {
          updateClasses(_this6.target, _this6._addAttachClasses, all);
        }

        delete _this6._addAttachClasses;
      });
    }
  }, {
    key: 'position',
    value: function position() {
      var _this7 = this;

      var flushChanges = arguments.length <= 0 || arguments[0] === undefined ? true : arguments[0];

      // flushChanges commits the changes immediately, leave true unless you are positioning multiple
      // tethers (in which case call Tether.Utils.flush yourself when you're done)

      if (!this.enabled) {
        return;
      }

      this.clearCache();

      // Turn 'auto' attachments into the appropriate corner or edge
      var targetAttachment = autoToFixedAttachment(this.targetAttachment, this.attachment);

      this.updateAttachClasses(this.attachment, targetAttachment);

      var elementPos = this.cache('element-bounds', function () {
        return getBounds(_this7.element);
      });

      var width = elementPos.width;
      var height = elementPos.height;

      if (width === 0 && height === 0 && typeof this.lastSize !== 'undefined') {
        var _lastSize = this.lastSize;

        // We cache the height and width to make it possible to position elements that are
        // getting hidden.
        width = _lastSize.width;
        height = _lastSize.height;
      } else {
        this.lastSize = { width: width, height: height };
      }

      var targetPos = this.cache('target-bounds', function () {
        return _this7.getTargetBounds();
      });
      var targetSize = targetPos;

      // Get an actual px offset from the attachment
      var offset = offsetToPx(attachmentToOffset(this.attachment), { width: width, height: height });
      var targetOffset = offsetToPx(attachmentToOffset(targetAttachment), targetSize);

      var manualOffset = offsetToPx(this.offset, { width: width, height: height });
      var manualTargetOffset = offsetToPx(this.targetOffset, targetSize);

      // Add the manually provided offset
      offset = addOffset(offset, manualOffset);
      targetOffset = addOffset(targetOffset, manualTargetOffset);

      // It's now our goal to make (element position + offset) == (target position + target offset)
      var left = targetPos.left + targetOffset.left - offset.left;
      var top = targetPos.top + targetOffset.top - offset.top;

      for (var i = 0; i < _utils2['default'].modules.length; ++i) {
        var _module2 = _utils2['default'].modules[i];
        var ret = _module2.position.call(this, {
          left: left,
          top: top,
          targetAttachment: targetAttachment,
          targetPos: targetPos,
          elementPos: elementPos,
          offset: offset,
          targetOffset: targetOffset,
          manualOffset: manualOffset,
          manualTargetOffset: manualTargetOffset,
          scrollbarSize: scrollbarSize,
          attachment: this.attachment
        });

        if (ret === false) {
          return false;
        } else if (typeof ret === 'undefined' || typeof ret !== 'object') {
          continue;
        } else {
          top = ret.top;
          left = ret.left;
        }
      }

      // We describe the position three different ways to give the optimizer
      // a chance to decide the best possible way to position the element
      // with the fewest repaints.
      var next = {
        // It's position relative to the page (absolute positioning when
        // the element is a child of the body)
        page: {
          top: top,
          left: left
        },

        // It's position relative to the viewport (fixed positioning)
        viewport: {
          top: top - pageYOffset,
          bottom: pageYOffset - top - height + innerHeight,
          left: left - pageXOffset,
          right: pageXOffset - left - width + innerWidth
        }
      };

      var doc = this.target.ownerDocument;
      var win = doc.defaultView;

      var scrollbarSize = undefined;
      if (doc.body.scrollWidth > win.innerWidth) {
        scrollbarSize = this.cache('scrollbar-size', getScrollBarSize);
        next.viewport.bottom -= scrollbarSize.height;
      }

      if (doc.body.scrollHeight > win.innerHeight) {
        scrollbarSize = this.cache('scrollbar-size', getScrollBarSize);
        next.viewport.right -= scrollbarSize.width;
      }

      if (['', 'static'].indexOf(doc.body.style.position) === -1 || ['', 'static'].indexOf(doc.body.parentElement.style.position) === -1) {
        // Absolute positioning in the body will be relative to the page, not the 'initial containing block'
        next.page.bottom = doc.body.scrollHeight - top - height;
        next.page.right = doc.body.scrollWidth - left - width;
      }

      if (typeof this.options.optimizations !== 'undefined' && this.options.optimizations.moveElement !== false && !(typeof this.targetModifier !== 'undefined')) {
        (function () {
          var offsetParent = _this7.cache('target-offsetparent', function () {
            return getOffsetParent(_this7.target);
          });
          var offsetPosition = _this7.cache('target-offsetparent-bounds', function () {
            return getBounds(offsetParent);
          });
          var offsetParentStyle = getComputedStyle(offsetParent);
          var offsetParentSize = offsetPosition;

          var offsetBorder = {};
          ['Top', 'Left', 'Bottom', 'Right'].forEach(function (side) {
            offsetBorder[side.toLowerCase()] = parseFloat(offsetParentStyle['border' + side + 'Width']);
          });

          offsetPosition.right = doc.body.scrollWidth - offsetPosition.left - offsetParentSize.width + offsetBorder.right;
          offsetPosition.bottom = doc.body.scrollHeight - offsetPosition.top - offsetParentSize.height + offsetBorder.bottom;

          if (next.page.top >= offsetPosition.top + offsetBorder.top && next.page.bottom >= offsetPosition.bottom) {
            if (next.page.left >= offsetPosition.left + offsetBorder.left && next.page.right >= offsetPosition.right) {
              // We're within the visible part of the target's scroll parent
              var scrollTop = offsetParent.scrollTop;
              var scrollLeft = offsetParent.scrollLeft;

              // It's position relative to the target's offset parent (absolute positioning when
              // the element is moved to be a child of the target's offset parent).
              next.offset = {
                top: next.page.top - offsetPosition.top + scrollTop - offsetBorder.top,
                left: next.page.left - offsetPosition.left + scrollLeft - offsetBorder.left
              };
            }
          }
        })();
      }

      // We could also travel up the DOM and try each containing context, rather than only
      // looking at the body, but we're gonna get diminishing returns.

      this.move(next);

      this.history.unshift(next);

      if (this.history.length > 3) {
        this.history.pop();
      }

      if (flushChanges) {
        flush();
      }

      return true;
    }

    // THE ISSUE
  }, {
    key: 'move',
    value: function move(pos) {
      var _this8 = this;

      if (!(typeof this.element.parentNode !== 'undefined')) {
        return;
      }

      var same = {};

      for (var type in pos) {
        same[type] = {};

        for (var key in pos[type]) {
          var found = false;

          for (var i = 0; i < this.history.length; ++i) {
            var point = this.history[i];
            if (typeof point[type] !== 'undefined' && !within(point[type][key], pos[type][key])) {
              found = true;
              break;
            }
          }

          if (!found) {
            same[type][key] = true;
          }
        }
      }

      var css = { top: '', left: '', right: '', bottom: '' };

      var transcribe = function transcribe(_same, _pos) {
        var hasOptimizations = typeof _this8.options.optimizations !== 'undefined';
        var gpu = hasOptimizations ? _this8.options.optimizations.gpu : null;
        if (gpu !== false) {
          var yPos = undefined,
              xPos = undefined;
          if (_same.top) {
            css.top = 0;
            yPos = _pos.top;
          } else {
            css.bottom = 0;
            yPos = -_pos.bottom;
          }

          if (_same.left) {
            css.left = 0;
            xPos = _pos.left;
          } else {
            css.right = 0;
            xPos = -_pos.right;
          }

          css[transformKey] = 'translateX(' + Math.round(xPos) + 'px) translateY(' + Math.round(yPos) + 'px)';

          if (transformKey !== 'msTransform') {
            // The Z transform will keep this in the GPU (faster, and prevents artifacts),
            // but IE9 doesn't support 3d transforms and will choke.
            css[transformKey] += " translateZ(0)";
          }
        } else {
          if (_same.top) {
            css.top = _pos.top + 'px';
          } else {
            css.bottom = _pos.bottom + 'px';
          }

          if (_same.left) {
            css.left = _pos.left + 'px';
          } else {
            css.right = _pos.right + 'px';
          }
        }
      };

      var moved = false;
      if ((same.page.top || same.page.bottom) && (same.page.left || same.page.right)) {
        css.position = 'absolute';
        transcribe(same.page, pos.page);
      } else if ((same.viewport.top || same.viewport.bottom) && (same.viewport.left || same.viewport.right)) {
        css.position = 'fixed';
        transcribe(same.viewport, pos.viewport);
      } else if (typeof same.offset !== 'undefined' && same.offset.top && same.offset.left) {
        (function () {
          css.position = 'absolute';
          var offsetParent = _this8.cache('target-offsetparent', function () {
            return getOffsetParent(_this8.target);
          });

          if (getOffsetParent(_this8.element) !== offsetParent) {
            defer(function () {
              _this8.element.parentNode.removeChild(_this8.element);
              offsetParent.appendChild(_this8.element);
            });
          }

          transcribe(same.offset, pos.offset);
          moved = true;
        })();
      } else {
        css.position = 'absolute';
        transcribe({ top: true, left: true }, pos.page);
      }

      if (!moved) {
        var offsetParentIsBody = true;
        var currentNode = this.element.parentNode;
        while (currentNode && currentNode.nodeType === 1 && currentNode.tagName !== 'BODY') {
          if (getComputedStyle(currentNode).position !== 'static') {
            offsetParentIsBody = false;
            break;
          }

          currentNode = currentNode.parentNode;
        }

        if (!offsetParentIsBody) {
          this.element.parentNode.removeChild(this.element);
          this.element.ownerDocument.body.appendChild(this.element);
        }
      }

      // Any css change will trigger a repaint, so let's avoid one if nothing changed
      var writeCSS = {};
      var write = false;
      for (var key in css) {
        var val = css[key];
        var elVal = this.element.style[key];

        if (elVal !== val) {
          write = true;
          writeCSS[key] = val;
        }
      }

      if (write) {
        defer(function () {
          extend(_this8.element.style, writeCSS);
          _this8.trigger('repositioned');
        });
      }
    }
  }]);

  return TetherClass;
})(Evented);

TetherClass.modules = [];

_utils2['default'].position = position;

var Tether = extend(TetherClass, _utils2['default']);

exports['default'] = Tether;
module.exports = exports['default'];

},{"./abutment":1,"./constraint":2,"./shift":3,"./utils":5}],5:[function(require,module,exports){
'use strict';

Object.defineProperty(exports, '__esModule', {
  value: true
});

var _createClass = (function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ('value' in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; })();

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError('Cannot call a class as a function'); } }

var TetherBase = { modules: [] };

var zeroElement = null;

// Same as native getBoundingClientRect, except it takes into account parent <frame> offsets
// if the element lies within a nested document (<frame> or <iframe>-like).
function getActualBoundingClientRect(node) {
  var boundingRect = node.getBoundingClientRect();

  // The original object returned by getBoundingClientRect is immutable, so we clone it
  // We can't use extend because the properties are not considered part of the object by hasOwnProperty in IE9
  var rect = {};
  for (var k in boundingRect) {
    rect[k] = boundingRect[k];
  }

  if (node.ownerDocument !== document) {
    var _frameElement = node.ownerDocument.defaultView.frameElement;
    if (_frameElement) {
      var frameRect = getActualBoundingClientRect(_frameElement);
      rect.top += frameRect.top;
      rect.bottom += frameRect.top;
      rect.left += frameRect.left;
      rect.right += frameRect.left;
    }
  }

  return rect;
}

function getScrollParents(el) {
  // In firefox if the el is inside an iframe with display: none; window.getComputedStyle() will return null;
  // https://bugzilla.mozilla.org/show_bug.cgi?id=548397
  var computedStyle = getComputedStyle(el) || {};
  var position = computedStyle.position;
  var parents = [];

  if (position === 'fixed') {
    return [el];
  }

  var parent = el;
  while ((parent = parent.parentNode) && parent && parent.nodeType === 1) {
    var style = undefined;
    try {
      style = getComputedStyle(parent);
    } catch (err) {}

    if (typeof style === 'undefined' || style === null) {
      parents.push(parent);
      return parents;
    }

    var _style = style;
    var overflow = _style.overflow;
    var overflowX = _style.overflowX;
    var overflowY = _style.overflowY;

    if (/(auto|scroll)/.test(overflow + overflowY + overflowX)) {
      if (position !== 'absolute' || ['relative', 'absolute', 'fixed'].indexOf(style.position) >= 0) {
        parents.push(parent);
      }
    }
  }

  parents.push(el.ownerDocument.body);

  // If the node is within a frame, account for the parent window scroll
  if (el.ownerDocument !== document) {
    parents.push(el.ownerDocument.defaultView);
  }

  return parents;
}

var uniqueId = (function () {
  var id = 0;
  return function () {
    return ++id;
  };
})();

var zeroPosCache = {};
var getOrigin = function getOrigin() {
  // getBoundingClientRect is unfortunately too accurate.  It introduces a pixel or two of
  // jitter as the user scrolls that messes with our ability to detect if two positions
  // are equivilant or not.  We place an element at the top left of the page that will
  // get the same jitter, so we can cancel the two out.
  var node = zeroElement;
  if (!node) {
    node = document.createElement('div');
    node.setAttribute('data-tether-id', uniqueId());
    extend(node.style, {
      top: 0,
      left: 0,
      position: 'absolute'
    });

    document.body.appendChild(node);

    zeroElement = node;
  }

  var id = node.getAttribute('data-tether-id');
  if (typeof zeroPosCache[id] === 'undefined') {
    zeroPosCache[id] = getActualBoundingClientRect(node);

    // Clear the cache when this position call is done
    defer(function () {
      delete zeroPosCache[id];
    });
  }

  return zeroPosCache[id];
};

function removeUtilElements() {
  if (zeroElement) {
    document.body.removeChild(zeroElement);
  }
  zeroElement = null;
};

function getBounds(el) {
  var doc = undefined;
  if (el === document) {
    doc = document;
    el = document.documentElement;
  } else {
    doc = el.ownerDocument;
  }

  var docEl = doc.documentElement;

  var box = getActualBoundingClientRect(el);

  var origin = getOrigin();

  box.top -= origin.top;
  box.left -= origin.left;

  if (typeof box.width === 'undefined') {
    box.width = document.body.scrollWidth - box.left - box.right;
  }
  if (typeof box.height === 'undefined') {
    box.height = document.body.scrollHeight - box.top - box.bottom;
  }

  box.top = box.top - docEl.clientTop;
  box.left = box.left - docEl.clientLeft;
  box.right = doc.body.clientWidth - box.width - box.left;
  box.bottom = doc.body.clientHeight - box.height - box.top;

  return box;
}

function getOffsetParent(el) {
  return el.offsetParent || document.documentElement;
}

function getScrollBarSize() {
  var inner = document.createElement('div');
  inner.style.width = '100%';
  inner.style.height = '200px';

  var outer = document.createElement('div');
  extend(outer.style, {
    position: 'absolute',
    top: 0,
    left: 0,
    pointerEvents: 'none',
    visibility: 'hidden',
    width: '200px',
    height: '150px',
    overflow: 'hidden'
  });

  outer.appendChild(inner);

  document.body.appendChild(outer);

  var widthContained = inner.offsetWidth;
  outer.style.overflow = 'scroll';
  var widthScroll = inner.offsetWidth;

  if (widthContained === widthScroll) {
    widthScroll = outer.clientWidth;
  }

  document.body.removeChild(outer);

  var width = widthContained - widthScroll;

  return { width: width, height: width };
}

function extend() {
  var out = arguments.length <= 0 || arguments[0] === undefined ? {} : arguments[0];

  var args = [];

  Array.prototype.push.apply(args, arguments);

  args.slice(1).forEach(function (obj) {
    if (obj) {
      for (var key in obj) {
        if (({}).hasOwnProperty.call(obj, key)) {
          out[key] = obj[key];
        }
      }
    }
  });

  return out;
}

function removeClass(el, name) {
  if (typeof el.classList !== 'undefined') {
    name.split(' ').forEach(function (cls) {
      if (cls.trim()) {
        el.classList.remove(cls);
      }
    });
  } else {
    var regex = new RegExp('(^| )' + name.split(' ').join('|') + '( |$)', 'gi');
    var className = getClassName(el).replace(regex, ' ');
    setClassName(el, className);
  }
}

function addClass(el, name) {
  if (typeof el.classList !== 'undefined') {
    name.split(' ').forEach(function (cls) {
      if (cls.trim()) {
        el.classList.add(cls);
      }
    });
  } else {
    removeClass(el, name);
    var cls = getClassName(el) + (' ' + name);
    setClassName(el, cls);
  }
}

function hasClass(el, name) {
  if (typeof el.classList !== 'undefined') {
    return el.classList.contains(name);
  }
  var className = getClassName(el);
  return new RegExp('(^| )' + name + '( |$)', 'gi').test(className);
}

function getClassName(el) {
  // Can't use just SVGAnimatedString here since nodes within a Frame in IE have
  // completely separately SVGAnimatedString base classes
  if (el.className instanceof el.ownerDocument.defaultView.SVGAnimatedString) {
    return el.className.baseVal;
  }
  return el.className;
}

function setClassName(el, className) {
  el.setAttribute('class', className);
}

function updateClasses(el, add, all) {
  // Of the set of 'all' classes, we need the 'add' classes, and only the
  // 'add' classes to be set.
  all.forEach(function (cls) {
    if (add.indexOf(cls) === -1 && hasClass(el, cls)) {
      removeClass(el, cls);
    }
  });

  add.forEach(function (cls) {
    if (!hasClass(el, cls)) {
      addClass(el, cls);
    }
  });
}

var deferred = [];

var defer = function defer(fn) {
  deferred.push(fn);
};

var flush = function flush() {
  var fn = undefined;
  while (fn = deferred.pop()) {
    fn();
  }
};

var Evented = (function () {
  function Evented() {
    _classCallCheck(this, Evented);
  }

  _createClass(Evented, [{
    key: 'on',
    value: function on(event, handler, ctx) {
      var once = arguments.length <= 3 || arguments[3] === undefined ? false : arguments[3];

      if (typeof this.bindings === 'undefined') {
        this.bindings = {};
      }
      if (typeof this.bindings[event] === 'undefined') {
        this.bindings[event] = [];
      }
      this.bindings[event].push({ handler: handler, ctx: ctx, once: once });
    }
  }, {
    key: 'once',
    value: function once(event, handler, ctx) {
      this.on(event, handler, ctx, true);
    }
  }, {
    key: 'off',
    value: function off(event, handler) {
      if (typeof this.bindings === 'undefined' || typeof this.bindings[event] === 'undefined') {
        return;
      }

      if (typeof handler === 'undefined') {
        delete this.bindings[event];
      } else {
        var i = 0;
        while (i < this.bindings[event].length) {
          if (this.bindings[event][i].handler === handler) {
            this.bindings[event].splice(i, 1);
          } else {
            ++i;
          }
        }
      }
    }
  }, {
    key: 'trigger',
    value: function trigger(event) {
      if (typeof this.bindings !== 'undefined' && this.bindings[event]) {
        var i = 0;

        for (var _len = arguments.length, args = Array(_len > 1 ? _len - 1 : 0), _key = 1; _key < _len; _key++) {
          args[_key - 1] = arguments[_key];
        }

        while (i < this.bindings[event].length) {
          var _bindings$event$i = this.bindings[event][i];
          var handler = _bindings$event$i.handler;
          var ctx = _bindings$event$i.ctx;
          var once = _bindings$event$i.once;

          var context = ctx;
          if (typeof context === 'undefined') {
            context = this;
          }

          handler.apply(context, args);

          if (once) {
            this.bindings[event].splice(i, 1);
          } else {
            ++i;
          }
        }
      }
    }
  }]);

  return Evented;
})();

TetherBase.Utils = {
  getActualBoundingClientRect: getActualBoundingClientRect,
  getScrollParents: getScrollParents,
  getBounds: getBounds,
  getOffsetParent: getOffsetParent,
  extend: extend,
  addClass: addClass,
  removeClass: removeClass,
  hasClass: hasClass,
  updateClasses: updateClasses,
  defer: defer,
  flush: flush,
  uniqueId: uniqueId,
  Evented: Evented,
  getScrollBarSize: getScrollBarSize,
  removeUtilElements: removeUtilElements
};

exports['default'] = TetherBase;
module.exports = exports['default'];

},{}]},{},[4])(4)
});

/***/ }),
/* 51 */
/***/ (function(module, exports) {

/**
 * lodash (Custom Build) <https://lodash.com/>
 * Build: `lodash modularize exports="npm" -o ./`
 * Copyright jQuery Foundation and other contributors <https://jquery.org/>
 * Released under MIT license <https://lodash.com/license>
 * Based on Underscore.js 1.8.3 <http://underscorejs.org/LICENSE>
 * Copyright Jeremy Ashkenas, DocumentCloud and Investigative Reporters & Editors
 */

/** Used as references for various `Number` constants. */
var NAN = 0 / 0;

/** `Object#toString` result references. */
var symbolTag = '[object Symbol]';

/** Used to match leading and trailing whitespace. */
var reTrim = /^\s+|\s+$/g;

/** Used to detect bad signed hexadecimal string values. */
var reIsBadHex = /^[-+]0x[0-9a-f]+$/i;

/** Used to detect binary string values. */
var reIsBinary = /^0b[01]+$/i;

/** Used to detect octal string values. */
var reIsOctal = /^0o[0-7]+$/i;

/** Built-in method references without a dependency on `root`. */
var freeParseInt = parseInt;

/** Used for built-in method references. */
var objectProto = Object.prototype;

/**
 * Used to resolve the
 * [`toStringTag`](http://ecma-international.org/ecma-262/7.0/#sec-object.prototype.tostring)
 * of values.
 */
var objectToString = objectProto.toString;

/**
 * Checks if `value` is the
 * [language type](http://www.ecma-international.org/ecma-262/7.0/#sec-ecmascript-language-types)
 * of `Object`. (e.g. arrays, functions, objects, regexes, `new Number(0)`, and `new String('')`)
 *
 * @static
 * @memberOf _
 * @since 0.1.0
 * @category Lang
 * @param {*} value The value to check.
 * @returns {boolean} Returns `true` if `value` is an object, else `false`.
 * @example
 *
 * _.isObject({});
 * // => true
 *
 * _.isObject([1, 2, 3]);
 * // => true
 *
 * _.isObject(_.noop);
 * // => true
 *
 * _.isObject(null);
 * // => false
 */
function isObject(value) {
  var type = typeof value;
  return !!value && (type == 'object' || type == 'function');
}

/**
 * Checks if `value` is object-like. A value is object-like if it's not `null`
 * and has a `typeof` result of "object".
 *
 * @static
 * @memberOf _
 * @since 4.0.0
 * @category Lang
 * @param {*} value The value to check.
 * @returns {boolean} Returns `true` if `value` is object-like, else `false`.
 * @example
 *
 * _.isObjectLike({});
 * // => true
 *
 * _.isObjectLike([1, 2, 3]);
 * // => true
 *
 * _.isObjectLike(_.noop);
 * // => false
 *
 * _.isObjectLike(null);
 * // => false
 */
function isObjectLike(value) {
  return !!value && typeof value == 'object';
}

/**
 * Checks if `value` is classified as a `Symbol` primitive or object.
 *
 * @static
 * @memberOf _
 * @since 4.0.0
 * @category Lang
 * @param {*} value The value to check.
 * @returns {boolean} Returns `true` if `value` is a symbol, else `false`.
 * @example
 *
 * _.isSymbol(Symbol.iterator);
 * // => true
 *
 * _.isSymbol('abc');
 * // => false
 */
function isSymbol(value) {
  return typeof value == 'symbol' ||
    (isObjectLike(value) && objectToString.call(value) == symbolTag);
}

/**
 * Converts `value` to a number.
 *
 * @static
 * @memberOf _
 * @since 4.0.0
 * @category Lang
 * @param {*} value The value to process.
 * @returns {number} Returns the number.
 * @example
 *
 * _.toNumber(3.2);
 * // => 3.2
 *
 * _.toNumber(Number.MIN_VALUE);
 * // => 5e-324
 *
 * _.toNumber(Infinity);
 * // => Infinity
 *
 * _.toNumber('3.2');
 * // => 3.2
 */
function toNumber(value) {
  if (typeof value == 'number') {
    return value;
  }
  if (isSymbol(value)) {
    return NAN;
  }
  if (isObject(value)) {
    var other = typeof value.valueOf == 'function' ? value.valueOf() : value;
    value = isObject(other) ? (other + '') : other;
  }
  if (typeof value != 'string') {
    return value === 0 ? value : +value;
  }
  value = value.replace(reTrim, '');
  var isBinary = reIsBinary.test(value);
  return (isBinary || reIsOctal.test(value))
    ? freeParseInt(value.slice(2), isBinary ? 2 : 8)
    : (reIsBadHex.test(value) ? NAN : +value);
}

module.exports = toNumber;


/***/ }),
/* 52 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


var _CSSTransitionGroup = __webpack_require__(53);

var _CSSTransitionGroup2 = _interopRequireDefault(_CSSTransitionGroup);

var _TransitionGroup = __webpack_require__(18);

var _TransitionGroup2 = _interopRequireDefault(_TransitionGroup);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

module.exports = {
  TransitionGroup: _TransitionGroup2.default,
  CSSTransitionGroup: _CSSTransitionGroup2.default
};

/***/ }),
/* 53 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
/* WEBPACK VAR INJECTION */(function(process) {

exports.__esModule = true;

var _extends = Object.assign || function (target) { for (var i = 1; i < arguments.length; i++) { var source = arguments[i]; for (var key in source) { if (Object.prototype.hasOwnProperty.call(source, key)) { target[key] = source[key]; } } } return target; };

var _react = __webpack_require__(0);

var _react2 = _interopRequireDefault(_react);

var _propTypes = __webpack_require__(5);

var _propTypes2 = _interopRequireDefault(_propTypes);

var _TransitionGroup = __webpack_require__(18);

var _TransitionGroup2 = _interopRequireDefault(_TransitionGroup);

var _CSSTransitionGroupChild = __webpack_require__(57);

var _CSSTransitionGroupChild2 = _interopRequireDefault(_CSSTransitionGroupChild);

var _PropTypes = __webpack_require__(20);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

function _possibleConstructorReturn(self, call) { if (!self) { throw new ReferenceError("this hasn't been initialised - super() hasn't been called"); } return call && (typeof call === "object" || typeof call === "function") ? call : self; }

function _inherits(subClass, superClass) { if (typeof superClass !== "function" && superClass !== null) { throw new TypeError("Super expression must either be null or a function, not " + typeof superClass); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, enumerable: false, writable: true, configurable: true } }); if (superClass) Object.setPrototypeOf ? Object.setPrototypeOf(subClass, superClass) : subClass.__proto__ = superClass; }

var propTypes = {
  transitionName: _PropTypes.nameShape.isRequired,

  transitionAppear: _propTypes2.default.bool,
  transitionEnter: _propTypes2.default.bool,
  transitionLeave: _propTypes2.default.bool,
  transitionAppearTimeout: (0, _PropTypes.transitionTimeout)('Appear'),
  transitionEnterTimeout: (0, _PropTypes.transitionTimeout)('Enter'),
  transitionLeaveTimeout: (0, _PropTypes.transitionTimeout)('Leave')
};

var defaultProps = {
  transitionAppear: false,
  transitionEnter: true,
  transitionLeave: true
};

var CSSTransitionGroup = function (_React$Component) {
  _inherits(CSSTransitionGroup, _React$Component);

  function CSSTransitionGroup() {
    var _temp, _this, _ret;

    _classCallCheck(this, CSSTransitionGroup);

    for (var _len = arguments.length, args = Array(_len), _key = 0; _key < _len; _key++) {
      args[_key] = arguments[_key];
    }

    return _ret = (_temp = (_this = _possibleConstructorReturn(this, _React$Component.call.apply(_React$Component, [this].concat(args))), _this), _this._wrapChild = function (child) {
      return _react2.default.createElement(_CSSTransitionGroupChild2.default, {
        name: _this.props.transitionName,
        appear: _this.props.transitionAppear,
        enter: _this.props.transitionEnter,
        leave: _this.props.transitionLeave,
        appearTimeout: _this.props.transitionAppearTimeout,
        enterTimeout: _this.props.transitionEnterTimeout,
        leaveTimeout: _this.props.transitionLeaveTimeout
      }, child);
    }, _temp), _possibleConstructorReturn(_this, _ret);
  }

  // We need to provide this childFactory so that
  // ReactCSSTransitionGroupChild can receive updates to name, enter, and
  // leave while it is leaving.


  CSSTransitionGroup.prototype.render = function render() {
    return _react2.default.createElement(_TransitionGroup2.default, _extends({}, this.props, { childFactory: this._wrapChild }));
  };

  return CSSTransitionGroup;
}(_react2.default.Component);

CSSTransitionGroup.displayName = 'CSSTransitionGroup';


CSSTransitionGroup.propTypes = process.env.NODE_ENV !== "production" ? propTypes : {};
CSSTransitionGroup.defaultProps = defaultProps;

exports.default = CSSTransitionGroup;
module.exports = exports['default'];
/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(1)))

/***/ }),
/* 54 */
/***/ (function(module, exports) {


module.exports = function chain(){
  var len = arguments.length
  var args = [];

  for (var i = 0; i < len; i++)
    args[i] = arguments[i]

  args = args.filter(function(fn){ return fn != null })

  if (args.length === 0) return undefined
  if (args.length === 1) return args[0]

  return args.reduce(function(current, next){
    return function chainedFunction() {
      current.apply(this, arguments);
      next.apply(this, arguments);
    };
  })
}


/***/ }),
/* 55 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
/* WEBPACK VAR INJECTION */(function(process) {/**
 * Copyright 2014-2015, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */



/**
 * Similar to invariant but only logs a warning if the condition is not met.
 * This can be used to log issues in development environments in critical
 * paths. Removing the logging code for production environments will keep the
 * same logic and follow the same code paths.
 */

var warning = function() {};

if (process.env.NODE_ENV !== 'production') {
  warning = function(condition, format, args) {
    var len = arguments.length;
    args = new Array(len > 2 ? len - 2 : 0);
    for (var key = 2; key < len; key++) {
      args[key - 2] = arguments[key];
    }
    if (format === undefined) {
      throw new Error(
        '`warning(condition, format, ...args)` requires a warning ' +
        'message argument'
      );
    }

    if (format.length < 10 || (/^[s\W]*$/).test(format)) {
      throw new Error(
        'The warning format should be able to uniquely identify this ' +
        'warning. Please, use a more descriptive format than: ' + format
      );
    }

    if (!condition) {
      var argIndex = 0;
      var message = 'Warning: ' +
        format.replace(/%s/g, function() {
          return args[argIndex++];
        });
      if (typeof console !== 'undefined') {
        console.error(message);
      }
      try {
        // This error was thrown as a convenience so that you can use this stack
        // to find the callsite that caused this warning to fire.
        throw new Error(message);
      } catch(x) {}
    }
  };
}

module.exports = warning;

/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(1)))

/***/ }),
/* 56 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


exports.__esModule = true;
exports.getChildMapping = getChildMapping;
exports.mergeChildMappings = mergeChildMappings;

var _react = __webpack_require__(0);

/**
 * Given `this.props.children`, return an object mapping key to child.
 *
 * @param {*} children `this.props.children`
 * @return {object} Mapping of key to child
 */
function getChildMapping(children) {
  if (!children) {
    return children;
  }
  var result = {};
  _react.Children.map(children, function (child) {
    return child;
  }).forEach(function (child) {
    result[child.key] = child;
  });
  return result;
}

/**
 * When you're adding or removing children some may be added or removed in the
 * same render pass. We want to show *both* since we want to simultaneously
 * animate elements in and out. This function takes a previous set of keys
 * and a new set of keys and merges them with its best guess of the correct
 * ordering. In the future we may expose some of the utilities in
 * ReactMultiChild to make this easy, but for now React itself does not
 * directly have this concept of the union of prevChildren and nextChildren
 * so we implement it here.
 *
 * @param {object} prev prev children as returned from
 * `ReactTransitionChildMapping.getChildMapping()`.
 * @param {object} next next children as returned from
 * `ReactTransitionChildMapping.getChildMapping()`.
 * @return {object} a key set that contains all keys in `prev` and all keys
 * in `next` in a reasonable order.
 */
function mergeChildMappings(prev, next) {
  prev = prev || {};
  next = next || {};

  function getValueForKey(key) {
    if (next.hasOwnProperty(key)) {
      return next[key];
    }

    return prev[key];
  }

  // For each key of `next`, the list of keys to insert before that key in
  // the combined list
  var nextKeysPending = {};

  var pendingKeys = [];
  for (var prevKey in prev) {
    if (next.hasOwnProperty(prevKey)) {
      if (pendingKeys.length) {
        nextKeysPending[prevKey] = pendingKeys;
        pendingKeys = [];
      }
    } else {
      pendingKeys.push(prevKey);
    }
  }

  var i = void 0;
  var childMapping = {};
  for (var nextKey in next) {
    if (nextKeysPending.hasOwnProperty(nextKey)) {
      for (i = 0; i < nextKeysPending[nextKey].length; i++) {
        var pendingNextKey = nextKeysPending[nextKey][i];
        childMapping[nextKeysPending[nextKey][i]] = getValueForKey(pendingNextKey);
      }
    }
    childMapping[nextKey] = getValueForKey(nextKey);
  }

  // Finally, add the keys which didn't appear before any key in `next`
  for (i = 0; i < pendingKeys.length; i++) {
    childMapping[pendingKeys[i]] = getValueForKey(pendingKeys[i]);
  }

  return childMapping;
}

/***/ }),
/* 57 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
/* WEBPACK VAR INJECTION */(function(process) {

exports.__esModule = true;

var _extends = Object.assign || function (target) { for (var i = 1; i < arguments.length; i++) { var source = arguments[i]; for (var key in source) { if (Object.prototype.hasOwnProperty.call(source, key)) { target[key] = source[key]; } } } return target; };

var _addClass = __webpack_require__(58);

var _addClass2 = _interopRequireDefault(_addClass);

var _removeClass = __webpack_require__(60);

var _removeClass2 = _interopRequireDefault(_removeClass);

var _requestAnimationFrame = __webpack_require__(61);

var _requestAnimationFrame2 = _interopRequireDefault(_requestAnimationFrame);

var _properties = __webpack_require__(62);

var _react = __webpack_require__(0);

var _react2 = _interopRequireDefault(_react);

var _propTypes = __webpack_require__(5);

var _propTypes2 = _interopRequireDefault(_propTypes);

var _reactDom = __webpack_require__(6);

var _PropTypes = __webpack_require__(20);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

function _possibleConstructorReturn(self, call) { if (!self) { throw new ReferenceError("this hasn't been initialised - super() hasn't been called"); } return call && (typeof call === "object" || typeof call === "function") ? call : self; }

function _inherits(subClass, superClass) { if (typeof superClass !== "function" && superClass !== null) { throw new TypeError("Super expression must either be null or a function, not " + typeof superClass); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, enumerable: false, writable: true, configurable: true } }); if (superClass) Object.setPrototypeOf ? Object.setPrototypeOf(subClass, superClass) : subClass.__proto__ = superClass; }

var events = [];
if (_properties.transitionEnd) events.push(_properties.transitionEnd);
if (_properties.animationEnd) events.push(_properties.animationEnd);

function addEndListener(node, listener) {
  if (events.length) {
    events.forEach(function (e) {
      return node.addEventListener(e, listener, false);
    });
  } else {
    setTimeout(listener, 0);
  }

  return function () {
    if (!events.length) return;
    events.forEach(function (e) {
      return node.removeEventListener(e, listener, false);
    });
  };
}

var propTypes = {
  children: _propTypes2.default.node,
  name: _PropTypes.nameShape.isRequired,

  // Once we require timeouts to be specified, we can remove the
  // boolean flags (appear etc.) and just accept a number
  // or a bool for the timeout flags (appearTimeout etc.)
  appear: _propTypes2.default.bool,
  enter: _propTypes2.default.bool,
  leave: _propTypes2.default.bool,
  appearTimeout: _propTypes2.default.number,
  enterTimeout: _propTypes2.default.number,
  leaveTimeout: _propTypes2.default.number
};

var CSSTransitionGroupChild = function (_React$Component) {
  _inherits(CSSTransitionGroupChild, _React$Component);

  function CSSTransitionGroupChild() {
    var _temp, _this, _ret;

    _classCallCheck(this, CSSTransitionGroupChild);

    for (var _len = arguments.length, args = Array(_len), _key = 0; _key < _len; _key++) {
      args[_key] = arguments[_key];
    }

    return _ret = (_temp = (_this = _possibleConstructorReturn(this, _React$Component.call.apply(_React$Component, [this].concat(args))), _this), _this.componentWillAppear = function (done) {
      if (_this.props.appear) {
        _this.transition('appear', done, _this.props.appearTimeout);
      } else {
        done();
      }
    }, _this.componentWillEnter = function (done) {
      if (_this.props.enter) {
        _this.transition('enter', done, _this.props.enterTimeout);
      } else {
        done();
      }
    }, _this.componentWillLeave = function (done) {
      if (_this.props.leave) {
        _this.transition('leave', done, _this.props.leaveTimeout);
      } else {
        done();
      }
    }, _temp), _possibleConstructorReturn(_this, _ret);
  }

  CSSTransitionGroupChild.prototype.componentWillMount = function componentWillMount() {
    this.classNameAndNodeQueue = [];
    this.transitionTimeouts = [];
  };

  CSSTransitionGroupChild.prototype.componentWillUnmount = function componentWillUnmount() {
    this.unmounted = true;

    if (this.timeout) {
      clearTimeout(this.timeout);
    }
    this.transitionTimeouts.forEach(function (timeout) {
      clearTimeout(timeout);
    });

    this.classNameAndNodeQueue.length = 0;
  };

  CSSTransitionGroupChild.prototype.transition = function transition(animationType, finishCallback, timeout) {
    var node = (0, _reactDom.findDOMNode)(this);

    if (!node) {
      if (finishCallback) {
        finishCallback();
      }
      return;
    }

    var className = this.props.name[animationType] || this.props.name + '-' + animationType;
    var activeClassName = this.props.name[animationType + 'Active'] || className + '-active';
    var timer = null;
    var removeListeners = void 0;

    (0, _addClass2.default)(node, className);

    // Need to do this to actually trigger a transition.
    this.queueClassAndNode(activeClassName, node);

    // Clean-up the animation after the specified delay
    var finish = function finish(e) {
      if (e && e.target !== node) {
        return;
      }

      clearTimeout(timer);
      if (removeListeners) removeListeners();

      (0, _removeClass2.default)(node, className);
      (0, _removeClass2.default)(node, activeClassName);

      if (removeListeners) removeListeners();

      // Usually this optional callback is used for informing an owner of
      // a leave animation and telling it to remove the child.
      if (finishCallback) {
        finishCallback();
      }
    };

    if (timeout) {
      timer = setTimeout(finish, timeout);
      this.transitionTimeouts.push(timer);
    } else if (_properties.transitionEnd) {
      removeListeners = addEndListener(node, finish);
    }
  };

  CSSTransitionGroupChild.prototype.queueClassAndNode = function queueClassAndNode(className, node) {
    var _this2 = this;

    this.classNameAndNodeQueue.push({
      className: className,
      node: node
    });

    if (!this.rafHandle) {
      this.rafHandle = (0, _requestAnimationFrame2.default)(function () {
        return _this2.flushClassNameAndNodeQueue();
      });
    }
  };

  CSSTransitionGroupChild.prototype.flushClassNameAndNodeQueue = function flushClassNameAndNodeQueue() {
    if (!this.unmounted) {
      this.classNameAndNodeQueue.forEach(function (obj) {
        // This is for to force a repaint,
        // which is necessary in order to transition styles when adding a class name.
        /* eslint-disable no-unused-expressions */
        obj.node.scrollTop;
        /* eslint-enable no-unused-expressions */
        (0, _addClass2.default)(obj.node, obj.className);
      });
    }
    this.classNameAndNodeQueue.length = 0;
    this.rafHandle = null;
  };

  CSSTransitionGroupChild.prototype.render = function render() {
    var props = _extends({}, this.props);
    delete props.name;
    delete props.appear;
    delete props.enter;
    delete props.leave;
    delete props.appearTimeout;
    delete props.enterTimeout;
    delete props.leaveTimeout;
    delete props.children;
    return _react2.default.cloneElement(_react2.default.Children.only(this.props.children), props);
  };

  return CSSTransitionGroupChild;
}(_react2.default.Component);

CSSTransitionGroupChild.displayName = 'CSSTransitionGroupChild';


CSSTransitionGroupChild.propTypes = process.env.NODE_ENV !== "production" ? propTypes : {};

exports.default = CSSTransitionGroupChild;
module.exports = exports['default'];
/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(1)))

/***/ }),
/* 58 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.default = addClass;

var _hasClass = __webpack_require__(59);

var _hasClass2 = _interopRequireDefault(_hasClass);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

function addClass(element, className) {
  if (element.classList) element.classList.add(className);else if (!(0, _hasClass2.default)(element, className)) if (typeof element.className === 'string') element.className = element.className + ' ' + className;else element.setAttribute('class', (element.className && element.className.baseVal || '') + ' ' + className);
}
module.exports = exports['default'];

/***/ }),
/* 59 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.default = hasClass;
function hasClass(element, className) {
  if (element.classList) return !!className && element.classList.contains(className);else return (" " + (element.className.baseVal || element.className) + " ").indexOf(" " + className + " ") !== -1;
}
module.exports = exports["default"];

/***/ }),
/* 60 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


function replaceClassName(origClass, classToRemove) {
  return origClass.replace(new RegExp('(^|\\s)' + classToRemove + '(?:\\s|$)', 'g'), '$1').replace(/\s+/g, ' ').replace(/^\s*|\s*$/g, '');
}

module.exports = function removeClass(element, className) {
  if (element.classList) element.classList.remove(className);else if (typeof element.className === 'string') element.className = replaceClassName(element.className, className);else element.setAttribute('class', replaceClassName(element.className && element.className.baseVal || '', className));
};

/***/ }),
/* 61 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


Object.defineProperty(exports, "__esModule", {
  value: true
});

var _inDOM = __webpack_require__(19);

var _inDOM2 = _interopRequireDefault(_inDOM);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var vendors = ['', 'webkit', 'moz', 'o', 'ms'];
var cancel = 'clearTimeout';
var raf = fallback;
var compatRaf = void 0;

var getKey = function getKey(vendor, k) {
  return vendor + (!vendor ? k : k[0].toUpperCase() + k.substr(1)) + 'AnimationFrame';
};

if (_inDOM2.default) {
  vendors.some(function (vendor) {
    var rafKey = getKey(vendor, 'request');

    if (rafKey in window) {
      cancel = getKey(vendor, 'cancel');
      return raf = function raf(cb) {
        return window[rafKey](cb);
      };
    }
  });
}

/* https://github.com/component/raf */
var prev = new Date().getTime();
function fallback(fn) {
  var curr = new Date().getTime(),
      ms = Math.max(0, 16 - (curr - prev)),
      req = setTimeout(fn, ms);

  prev = curr;
  return req;
}

compatRaf = function compatRaf(cb) {
  return raf(cb);
};
compatRaf.cancel = function (id) {
  window[cancel] && typeof window[cancel] === 'function' && window[cancel](id);
};
exports.default = compatRaf;
module.exports = exports['default'];

/***/ }),
/* 62 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.animationEnd = exports.animationDelay = exports.animationTiming = exports.animationDuration = exports.animationName = exports.transitionEnd = exports.transitionDuration = exports.transitionDelay = exports.transitionTiming = exports.transitionProperty = exports.transform = undefined;

var _inDOM = __webpack_require__(19);

var _inDOM2 = _interopRequireDefault(_inDOM);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var transform = 'transform';
var prefix = void 0,
    transitionEnd = void 0,
    animationEnd = void 0;
var transitionProperty = void 0,
    transitionDuration = void 0,
    transitionTiming = void 0,
    transitionDelay = void 0;
var animationName = void 0,
    animationDuration = void 0,
    animationTiming = void 0,
    animationDelay = void 0;

if (_inDOM2.default) {
  var _getTransitionPropert = getTransitionProperties();

  prefix = _getTransitionPropert.prefix;
  exports.transitionEnd = transitionEnd = _getTransitionPropert.transitionEnd;
  exports.animationEnd = animationEnd = _getTransitionPropert.animationEnd;


  exports.transform = transform = prefix + '-' + transform;
  exports.transitionProperty = transitionProperty = prefix + '-transition-property';
  exports.transitionDuration = transitionDuration = prefix + '-transition-duration';
  exports.transitionDelay = transitionDelay = prefix + '-transition-delay';
  exports.transitionTiming = transitionTiming = prefix + '-transition-timing-function';

  exports.animationName = animationName = prefix + '-animation-name';
  exports.animationDuration = animationDuration = prefix + '-animation-duration';
  exports.animationTiming = animationTiming = prefix + '-animation-delay';
  exports.animationDelay = animationDelay = prefix + '-animation-timing-function';
}

exports.transform = transform;
exports.transitionProperty = transitionProperty;
exports.transitionTiming = transitionTiming;
exports.transitionDelay = transitionDelay;
exports.transitionDuration = transitionDuration;
exports.transitionEnd = transitionEnd;
exports.animationName = animationName;
exports.animationDuration = animationDuration;
exports.animationTiming = animationTiming;
exports.animationDelay = animationDelay;
exports.animationEnd = animationEnd;
exports.default = {
  transform: transform,
  end: transitionEnd,
  property: transitionProperty,
  timing: transitionTiming,
  delay: transitionDelay,
  duration: transitionDuration
};


function getTransitionProperties() {
  var style = document.createElement('div').style;

  var vendorMap = {
    O: function O(e) {
      return 'o' + e.toLowerCase();
    },
    Moz: function Moz(e) {
      return e.toLowerCase();
    },
    Webkit: function Webkit(e) {
      return 'webkit' + e;
    },
    ms: function ms(e) {
      return 'MS' + e;
    }
  };

  var vendors = Object.keys(vendorMap);

  var transitionEnd = void 0,
      animationEnd = void 0;
  var prefix = '';

  for (var i = 0; i < vendors.length; i++) {
    var vendor = vendors[i];

    if (vendor + 'TransitionProperty' in style) {
      prefix = '-' + vendor.toLowerCase();
      transitionEnd = vendorMap[vendor]('TransitionEnd');
      animationEnd = vendorMap[vendor]('AnimationEnd');
      break;
    }
  }

  if (!transitionEnd && 'transitionProperty' in style) transitionEnd = 'transitionend';

  if (!animationEnd && 'animationName' in style) animationEnd = 'animationend';

  style = null;

  return { animationEnd: animationEnd, transitionEnd: transitionEnd, prefix: prefix };
}

/***/ }),
/* 63 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

Object.defineProperty(exports, "__esModule", { value: true });
var React = __webpack_require__(0);
var Endpoint_1 = __webpack_require__(11);
var Serialization_1 = __webpack_require__(21);
var CurlCommand_1 = __webpack_require__(64);
var Form_1 = __webpack_require__(4);
exports.Toolkit = function (props) {
    if (props.state.toolkitOpenFor === null) {
        return React.createElement("span", null);
    }
    var endpoint = props.state.endpoints[props.state.toolkitOpenFor];
    if (endpoint === undefined) {
        throw new Error("No endpoint found for index " + props.state.toolkitOpenFor);
    }
    return displayForEndpoint(props, props.state.toolkitOpenFor, endpoint);
};
var displayForEndpoint = function (props, endpointIdx, endpoint) {
    var tabIndex = 0;
    var getTabIndex = function () {
        tabIndex += 1;
        return tabIndex;
    };
    var onSubmit = function (state) { return function (ev) {
        if (state === Form_1.FormState.Success) {
            makeReq(props, endpointIdx, endpoint);
            ev.preventDefault();
        }
    }; };
    var requestSending = function () {
        return (React.createElement("div", null,
            React.createElement(CurlCommand_1.CurlCommand, { classRegistry: props.classRegistry, baseUrl: normalizedBrowserUrl(), endpoint: endpoint }),
            React.createElement("div", { className: "tk-request-sender" },
                React.createElement("button", { type: "button", className: "btn btn-primary", onClick: function () { return makeReq(props, endpointIdx, endpoint); }, id: "request", tabIndex: getTabIndex() }, "Send Request"),
                endpoint.response === undefined ? "" : responseView(endpoint.response))));
    };
    var formClearing = function () {
        return (React.createElement("div", null,
            React.createElement("div", { className: "tk-request-sender" },
                React.createElement("button", { type: "button", className: "btn btn-danger", onClick: function () { return clearForm(props, endpointIdx, endpoint); }, id: "clear", tabIndex: getTabIndex() }, "Clear"))));
    };
    return (React.createElement("div", null,
        React.createElement("h2", null, endpoint.verb),
        React.createElement(Form_1.Form, { classRegistry: props.classRegistry, actions: props.actions, state: props.state, onSubmit: onSubmit, getTabIndex: getTabIndex, sending: requestSending, clearing: formClearing })));
};
var normalizedBrowserUrl = function () { return window.location.href.replace(/#.*/, "").replace(/\/*$/, ""); };
var clearForm = function (props, endpointIdx, endpoint) {
    props.actions.apiResponseCleared(endpointIdx);
    endpoint.url_parts.forEach(function (part, i) {
        var path = ["endpoints", endpointIdx, "url_parts", i];
        if (part.type === "ID") {
            props.actions.toolkitClearValue(path.concat(["value", "dirty"]), path.concat(["value", "user_value"]), Endpoint_1.paramInit(props.classRegistry, part.value), true);
        }
        for (var j = 0; j < part.params.length; j++) {
            var param = part.params[j];
            props.actions.toolkitClearValue(path.concat(["params", j, "dirty"]), path.concat(["params", j, "user_value"]), Endpoint_1.paramInit(props.classRegistry, param), true);
        }
    });
};
var makeReq = function (props, endpointIdx, endpoint) {
    var data = Serialization_1.requestDataFromEndpointState(props.classRegistry, normalizedBrowserUrl(), endpoint);
    var req = exports.requestSupplier.get();
    req.onreadystatechange = function () {
        if (req.readyState !== XMLHttpRequest.DONE) {
            return;
        }
        props.actions.apiResponseReceived(endpointIdx, {
            status: req.status,
            statusText: "" + req.statusText,
            headers: req.getAllResponseHeaders(),
            body: req.responseText,
        });
    };
    req.open(data.verb, data.url.replace(/\\/g, "%5c"), true);
    req.setRequestHeader("Content-Type", "application/json");
    req.send(data.postData);
};
exports.requestSupplier = {
    get: function () { return new XMLHttpRequest(); },
};
var prettyPrintJson = function (body) {
    try {
        return JSON.stringify(JSON.parse(body), null, 2);
    }
    catch (e) {
        return body;
    }
};
var responseView = function (res) {
    return (React.createElement("div", null,
        React.createElement("div", { className: "form-group row" },
            React.createElement("label", { htmlFor: "response-status", className: "col-1 col-form-label" }, "Status"),
            React.createElement("pre", { className: "col-11 " + (okResponse(res) ? "ok-response" : badResponse(res) ? "bad-response" : ""), id: "response-status" },
                res.status,
                " ",
                res.statusText)),
        React.createElement("div", { className: "form-group row" },
            React.createElement("label", { htmlFor: "response-headers", className: "col-1 col-form-label" }, "Headers"),
            React.createElement("pre", { className: "col-11", id: "response-headers" }, res.headers)),
        React.createElement("div", { className: "form-group row" },
            React.createElement("label", { htmlFor: "response-body", className: "col-1 col-form-label" }, "Body"),
            React.createElement("pre", { className: "col-11", id: "response-body" }, prettyPrintJson(res.body)))));
};
var okResponse = function (res) {
    return (res.status >= 200 && res.status < 300);
};
var badResponse = function (res) {
    return (res.status >= 400 && res.status < 600);
};


/***/ }),
/* 64 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

Object.defineProperty(exports, "__esModule", { value: true });
var React = __webpack_require__(0);
var Serialization_1 = __webpack_require__(21);
var breakOnComma = function (input) {
    var output = [];
    var from = 0;
    var commaIdx = -1;
    while (true) {
        commaIdx = input.indexOf(",");
        if (commaIdx === -1) {
            output.push(input);
            break;
        }
        from = commaIdx + 1;
        output.push(input.substring(0, from));
        output.push(React.createElement("wbr", { key: output.length }));
        input = input.substring(from);
    }
    return output;
};
exports.CurlCommand = function (props) {
    return React.createElement("code", { className: "tk-curl" }, breakOnComma(exports.curlCommand(props.classRegistry, props.baseUrl, props.endpoint)));
};
var unicodeRepr = function (codepoint) {
    return "\\u" + ("000" + codepoint.toString(16).toUpperCase()).substr(-4);
};
var curlEsc = function (input) {
    var output = "";
    for (var i = 0; i < input.length; i++) {
        var cp = input.charCodeAt(i);
        if (cp === 39) {
            output += "'\"'\"'";
        }
        else {
            output += cp <= 128
                ? input.charAt(i)
                : unicodeRepr(cp);
        }
    }
    return output;
};
exports.curlCommand = function (classRegistry, baseUrl, endpoint) {
    var reqData = Serialization_1.requestDataFromEndpointState(classRegistry, baseUrl, endpoint);
    return "curl -vgw \"\\n\" -X " + reqData.verb + " '" + curlEsc(reqData.url) + "'" + ((reqData.postData === "" || reqData.postData === undefined || reqData.postData === null)
        ? ""
        : " -d '" + curlEsc(reqData.postData) + "'");
};


/***/ }),
/* 65 */
/***/ (function(module, exports, __webpack_require__) {

var __WEBPACK_AMD_DEFINE_FACTORY__, __WEBPACK_AMD_DEFINE_ARRAY__, __WEBPACK_AMD_DEFINE_RESULT__;/* globals define */

(function (root, factory) {
  'use strict'

  /* istanbul ignore next:cant test */
  if (typeof module === 'object' && typeof module.exports === 'object') {
    module.exports = factory()
  } else if (true) {
    // AMD. Register as an anonymous module.
    !(__WEBPACK_AMD_DEFINE_ARRAY__ = [], __WEBPACK_AMD_DEFINE_FACTORY__ = (factory),
				__WEBPACK_AMD_DEFINE_RESULT__ = (typeof __WEBPACK_AMD_DEFINE_FACTORY__ === 'function' ?
				(__WEBPACK_AMD_DEFINE_FACTORY__.apply(exports, __WEBPACK_AMD_DEFINE_ARRAY__)) : __WEBPACK_AMD_DEFINE_FACTORY__),
				__WEBPACK_AMD_DEFINE_RESULT__ !== undefined && (module.exports = __WEBPACK_AMD_DEFINE_RESULT__))
  } else {
    // Browser globals
    root.objectPath = factory()
  }
})(this, function () {
  'use strict'
  var _hasOwnProperty = Object.prototype.hasOwnProperty

  function isEmpty (value) {
    if (!value) {
      return true
    }
    if (isArray(value) && value.length === 0) {
      return true
    } else if (!isString(value)) {
      for (var i in value) {
        if (_hasOwnProperty.call(value, i)) {
          return false
        }
      }
      return true
    }
    return false
  }

  function isNumber (value) {
    return typeof value === 'number'
  }

  function isString (obj) {
    return typeof obj === 'string'
  }

  function isArray (obj) {
    return Array.isArray(obj)
  }

  function getKey (key) {
    var intKey = parseInt(key)
    if (intKey.toString() === key) {
      return intKey
    }
    return key
  }

  var objectPathImmutable = function (src) {
    var dest = src
    var committed = false

    var transaction = Object.keys(api).reduce(function (proxy, prop) {
      /* istanbul ignore else */
      if (typeof api[prop] === 'function') {
        proxy[prop] = function () {
          var args = [dest, src].concat(Array.prototype.slice.call(arguments))

          if (committed) {
            throw new Error('Cannot call ' + prop + ' after `value`')
          }

          dest = api[prop].apply(null, args)

          return transaction
        }
      }

      return proxy
    }, {})

    transaction.value = function () {
      committed = true
      return dest
    }

    return transaction
  }

  function clone (obj, createIfEmpty, assumeArray) {
    if (obj == null) {
      if (createIfEmpty) {
        if (assumeArray) {
          return []
        }

        return {}
      }

      return obj
    } else if (isArray(obj)) {
      return obj.slice()
    }

    var res = {}
    for (var key in obj) {
      if (obj.hasOwnProperty(key)) {
        res[key] = obj[key]
      }
    }

    return res
  }

  function changeImmutable (dest, src, path, changeCallback) {
    if (isNumber(path)) {
      path = [path]
    }
    if (isEmpty(path)) {
      return src
    }
    if (isString(path)) {
      return changeImmutable(dest, src, path.split('.').map(getKey), changeCallback)
    }
    var currentPath = path[0]

    if (!dest || dest === src) {
      dest = clone(src, true, isNumber(currentPath))
    }

    if (path.length === 1) {
      return changeCallback(dest, currentPath)
    }

    if (src != null) {
      src = src[currentPath]
    }

    dest[currentPath] = changeImmutable(dest[currentPath], src, path.slice(1), changeCallback)

    return dest
  }

  var api = {}
  api.set = function set (dest, src, path, value) {
    return changeImmutable(dest, src, path, function (clonedObj, finalPath) {
      clonedObj[finalPath] = value
      return clonedObj
    })
  }

  api.update = function update (dest, src, path, updater) {
    return changeImmutable(dest, src, path, function (clonedObj, finalPath) {
      clonedObj[finalPath] = updater(clonedObj[finalPath])
      return clonedObj
    })
  }

  api.push = function push (dest, src, path /*, values */) {
    var values = Array.prototype.slice.call(arguments, 3)
    return changeImmutable(dest, src, path, function (clonedObj, finalPath) {
      if (!isArray(clonedObj[finalPath])) {
        clonedObj[finalPath] = values
      } else {
        clonedObj[finalPath] = clonedObj[finalPath].concat(values)
      }
      return clonedObj
    })
  }

  api.insert = function insert (dest, src, path, value, at) {
    at = ~~at
    return changeImmutable(dest, src, path, function (clonedObj, finalPath) {
      var arr = clonedObj[finalPath]
      if (!isArray(arr)) {
        if (arr != null && typeof arr !== 'undefined') {
          throw new Error('Expected ' + path + 'to be an array. Instead got ' + typeof path)
        }
        arr = []
      }

      var first = arr.slice(0, at)
      first.push(value)
      clonedObj[finalPath] = first.concat(arr.slice(at))
      return clonedObj
    })
  }

  api.del = function del (dest, src, path, value, at) {
    return changeImmutable(dest, src, path, function (clonedObj, finalPath) {
      if (Array.isArray(clonedObj)) {
        if (clonedObj[finalPath] !== undefined) {
          clonedObj.splice(finalPath, 1)
        }
      } else {
        if (clonedObj.hasOwnProperty(finalPath)) {
          delete clonedObj[finalPath]
        }
      }
      return clonedObj
    })
  }

  api.assign = function assign (dest, src, path, source) {
    return changeImmutable(dest, src, path, function (clonedObj, finalPath) {
      source = Object(source)
      var target = clone(clonedObj[finalPath], true)

      for (var key in source) {
        if (_hasOwnProperty.call(source, key)) {
          target[key] = source[key]
        }
      }

      clonedObj[finalPath] = target
      return clonedObj
    })
  }

  return Object.keys(api).reduce(function (objectPathImmutable, method) {
    objectPathImmutable[method] = api[method].bind(null, null)

    return objectPathImmutable
  }, objectPathImmutable)
})


/***/ }),
/* 66 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

var __assign = (this && this.__assign) || Object.assign || function(t) {
    for (var s, i = 1, n = arguments.length; i < n; i++) {
        s = arguments[i];
        for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
            t[p] = s[p];
    }
    return t;
};
Object.defineProperty(exports, "__esModule", { value: true });
var React = __webpack_require__(0);
var Path_1 = __webpack_require__(2);
var Form_1 = __webpack_require__(4);
var PLUS = "icon-add-circle";
var MINUS = "icon-minus-circle";
exports.formChunk = function (props, recurse) {
    var inputName = JSON.stringify(props.typePath);
    var val = Path_1.opi.get(props.state, props.valuePath);
    var length = val ? val.length : 0;
    var rows = [];
    var wrappedType = props.type.substr(1, props.type.length - 2);
    var groupState = Form_1.FormState.Success;
    var _loop_1 = function (i) {
        var repr = recurse(__assign({}, props, { valuePath: props.valuePath.concat([i]), type: wrappedType }));
        rows.push(React.createElement("div", { key: rows.length },
            React.createElement("span", { className: "tk-row-remove" },
                React.createElement("span", { className: MINUS, onClick: function (e) { return props.actions.toolkitRemoveRow(props.dirtyPath, props.valuePath, i); }, id: "array-remove" })),
            React.createElement("span", { className: "tk-custom-array-value" }, repr.element)));
        groupState = Form_1.addFormStates(groupState, repr.state);
    };
    for (var i = 0; i < length; i++) {
        _loop_1(i);
    }
    var groupRepr = {
        state: groupState,
        element: React.createElement("span", null,
            React.createElement("span", null, "  ["),
            React.createElement("div", { className: "form-group has-" + groupState },
                val !== null ? React.createElement("span", { className: "tk-row-add left-indent " + PLUS, onClick: function (e) { return props.actions.toolkitAddRow(props.dirtyPath, props.valuePath, wrappedType); }, id: "array-add" }, "Add array item") : "",
                React.createElement("div", { className: "tk-custom-array left-indent" }, rows),
                "]")),
    };
    if (props.param.type !== props.type) {
        return groupRepr;
    }
    return Form_1.label(__assign({}, props, { labelFor: inputName, wrapping: groupRepr, addGroupState: false }));
};


/***/ }),
/* 67 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

var __assign = (this && this.__assign) || Object.assign || function(t) {
    for (var s, i = 1, n = arguments.length; i < n; i++) {
        s = arguments[i];
        for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
            t[p] = s[p];
    }
    return t;
};
Object.defineProperty(exports, "__esModule", { value: true });
var React = __webpack_require__(0);
var Path_1 = __webpack_require__(2);
var Form_1 = __webpack_require__(4);
exports.formChunk = function (props, recurse, tv) {
    var inputName = JSON.stringify(props.typePath);
    var value = Path_1.opi.get(props.state, props.valuePath);
    if (value === null) {
        return Form_1.label(__assign({}, props, { labelFor: inputName, wrapping: {
                state: Form_1.FormState.Success,
                element: React.createElement("div", { className: "form-group tk-nested-null" }),
            }, addGroupState: true }));
    }
    switch (tv.constructor.length) {
        case 0:
            throw new Error("Constructor must have params: " + props.type);
        case 1:
            var repr = recurse(__assign({}, props, { param: tv.constructor[0], parent: value, valuePath: props.valuePath.concat([tv.constructor[0].name]), type: tv.constructor[0].type }));
            return Form_1.label(__assign({}, props, { labelFor: inputName, wrapping: {
                    state: repr.state,
                    element: React.createElement("div", { className: "form-group " + (value === null ? "tk-nested-null" : "tk-nested") }, repr.element),
                }, addGroupState: true }));
        default:
            var group = [];
            var groupState = Form_1.FormState.Success;
            for (var _i = 0, _a = tv.constructor; _i < _a.length; _i++) {
                var constructorParam = _a[_i];
                var constructorRepr = recurse(__assign({}, props, { param: constructorParam, parent: value, typePath: props.typePath.concat([constructorParam.name]), valuePath: props.valuePath.concat([constructorParam.name]), type: constructorParam.type }));
                group.push(React.createElement("div", { key: group.length }, constructorRepr.element));
                groupState = Form_1.addFormStates(groupState, constructorRepr.state);
            }
            return Form_1.label(__assign({}, props, { labelFor: inputName, wrapping: {
                    state: groupState,
                    element: React.createElement("div", { className: "form-group " + (value === null ? "tk-nested-null" : "tk-nested") }, group),
                }, addGroupState: false }));
    }
};


/***/ }),
/* 68 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

var __assign = (this && this.__assign) || Object.assign || function(t) {
    for (var s, i = 1, n = arguments.length; i < n; i++) {
        s = arguments[i];
        for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
            t[p] = s[p];
    }
    return t;
};
Object.defineProperty(exports, "__esModule", { value: true });
var React = __webpack_require__(0);
var Path_1 = __webpack_require__(2);
var Form_1 = __webpack_require__(4);
var ENUM_VALIDATOR = function (e) { return function (v) {
    if (e.values.map(function (x) { return x.name; }).indexOf(v) === -1) {
        return { kind: "InitialValue" };
    }
    return { kind: "Valid", val: v };
}; };
exports.formChunk = function (props, onChange, tv) {
    var inputName = JSON.stringify(props.typePath);
    var selected = Path_1.opi.get(props.state, props.valuePath);
    var index = props.tabIndex();
    var defaultValue = (props.param.default && props.parent !== null && selected === null)
        ? " (" + props.param.default + ")"
        : "";
    var formState = selected !== null && tv.values.map(function (x) { return x.name; }).indexOf(selected) === -1
        ? Form_1.FormState.Warning
        : Form_1.FormState.Success;
    return Form_1.label(__assign({}, props, { labelFor: inputName, wrapping: {
            state: formState,
            element: React.createElement("select", { className: "form-control form-control-" + formState, name: inputName, onChange: onChange(ENUM_VALIDATOR(tv), props.valuePath, props.dirtyPath), id: props.param.name, value: (selected) ? selected : "unset", tabIndex: index, autoFocus: index === 1, hidden: selected === null }, [React.createElement("option", { value: "unset", key: "unset" }, "unset" + defaultValue)]
                .concat(tv.values.map(function (val) { return React.createElement("option", { value: val.name, key: val.name }, val.name); }))),
        }, addGroupState: true }));
};


/***/ }),
/* 69 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

var __assign = (this && this.__assign) || Object.assign || function(t) {
    for (var s, i = 1, n = arguments.length; i < n; i++) {
        s = arguments[i];
        for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
            t[p] = s[p];
    }
    return t;
};
Object.defineProperty(exports, "__esModule", { value: true });
var React = __webpack_require__(0);
var Path_1 = __webpack_require__(2);
var Form_1 = __webpack_require__(4);
var PLUS = "icon-add-circle";
var MINUS = "icon-minus-circle";
var validity = function (val) {
    if (val === null) {
        return Form_1.FormState.Success;
    }
    if (val === undefined || val.length === 0) {
        return Form_1.FormState.Warning;
    }
    return Form_1.FormState.Success;
};
exports.formChunk = function (props, recurse) {
    var inputName = JSON.stringify(props.typePath);
    var customMapKeyRepr = function (customMapValuePath, k, keyVal, isDuplicateKey, classes) {
        if (classes === void 0) { classes = undefined; }
        var keyPrefix = k.replace(/^(\d+_).*$/, "\$1");
        var keyState = Form_1.addFormStates(validity(keyVal), isDuplicateKey ? Form_1.FormState.Warning : Form_1.FormState.Success);
        var index = props.tabIndex();
        return Form_1.label(__assign({}, props, { labelFor: inputName, wrapping: {
                state: keyState,
                element: React.createElement("input", { className: "form-control form-control-" + keyState + (classes === undefined ? "" : " " + classes), type: "text", onChange: function (e) { return props.actions.toolkitRenameKey(customMapValuePath, k, keyPrefix + e.target.value); }, value: keyVal, autoComplete: "off", id: "key", tabIndex: index, autoFocus: index === 1 }),
            }, addGroupState: true, type: "String" }));
    };
    var val = Path_1.opi.get(props.state, props.valuePath);
    var rows = [];
    var wrappedType = props.type.substr(1, props.type.length - 2);
    var sortedKeys = val !== null ? Object.keys(val).sort() : [];
    var sortedKeysWithoutPrefixes = sortedKeys.map(function (k) { return k.replace(/^\d+_/, ""); });
    var groupState = Form_1.FormState.Success;
    var _loop_1 = function (i) {
        var k = sortedKeys[i];
        var keyVal = sortedKeysWithoutPrefixes[i];
        var isDuplicateKey = sortedKeysWithoutPrefixes.filter(function (key) { return key === keyVal; }).length > 1;
        var keyRepr = customMapKeyRepr(props.valuePath, k, keyVal, isDuplicateKey);
        var valRepr = recurse(__assign({}, props, { valuePath: props.valuePath.concat([k]), type: wrappedType }));
        var rowState = Form_1.addFormStates(keyRepr.state, valRepr.state);
        rows.push(React.createElement("div", { key: rows.length, className: "form-group has-" + rowState },
            React.createElement("span", { className: "tk-row-remove" },
                React.createElement("span", { className: MINUS, onClick: function (e) { return props.actions.toolkitRemoveRow(props.dirtyPath, props.valuePath, k); }, id: "map-remove" })),
            React.createElement("span", { className: "tk-custom-map-key" }, keyRepr.element),
            React.createElement("span", { className: "tk-custom-map-colon" },
                React.createElement("span", null, ":")),
            React.createElement("span", { className: "tk-custom-map-value" }, valRepr.element)));
        groupState = Form_1.addFormStates(groupState, rowState);
    };
    for (var i = 0; i < sortedKeys.length; i++) {
        _loop_1(i);
    }
    var groupRepr = {
        state: groupState,
        element: React.createElement("div", { className: "form-group has-" + groupState },
            React.createElement("span", null, "{ "),
            val !== null ? React.createElement("span", { className: "tk-row-add " + PLUS, onClick: function (e) { return props.actions.toolkitAddRow(props.dirtyPath, props.valuePath, wrappedType); }, id: "map-add" }, "Add map item") :
                "",
            React.createElement("div", { className: "tk-custom-map" }, rows),
            "}"),
    };
    if (props.param.type !== props.type) {
        return groupRepr;
    }
    return Form_1.label(__assign({}, props, { labelFor: inputName, wrapping: groupRepr, addGroupState: true }));
};


/***/ }),
/* 70 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

var __assign = (this && this.__assign) || Object.assign || function(t) {
    for (var s, i = 1, n = arguments.length; i < n; i++) {
        s = arguments[i];
        for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
            t[p] = s[p];
    }
    return t;
};
Object.defineProperty(exports, "__esModule", { value: true });
var React = __webpack_require__(0);
var Endpoint_1 = __webpack_require__(11);
var Path_1 = __webpack_require__(2);
var Form_1 = __webpack_require__(4);
var INTERFACE_VALIDATOR = function (classRegistry, i) { return function (v) {
    if (i.implementations.indexOf(v) === -1) {
        return { kind: "InitialValue" };
    }
    var o = Endpoint_1.valueInit(classRegistry, v);
    o[i.discriminator] = v;
    return { kind: "Valid", val: o };
}; };
exports.formChunk = function (props, onChange, recurse, tv) {
    var inputName = JSON.stringify(props.typePath);
    var impl = Path_1.opi.get(props.state, props.valuePath);
    if (impl === null) {
        return Form_1.label(__assign({}, props, { labelFor: inputName, wrapping: {
                state: Form_1.FormState.Success,
                element: React.createElement("div", null),
            }, addGroupState: true }));
    }
    var implType = (impl) ? impl[tv.discriminator] : undefined;
    var formState = (implType === undefined || tv.implementations.indexOf(implType) === -1)
        ? Form_1.FormState.Warning
        : Form_1.FormState.Success;
    var index = props.tabIndex();
    var chunk = implType === undefined
        ? { state: Form_1.FormState.Warning, element: React.createElement("span", null) }
        : recurse(__assign({}, props, { param: __assign({}, props.param, { default: undefined }), type: implType }));
    return Form_1.label(__assign({}, props, { labelFor: inputName, wrapping: {
            state: Form_1.addFormStates(formState, chunk.state),
            element: React.createElement("div", null,
                React.createElement("select", { className: "form-control form-control-" + formState, name: inputName, onChange: onChange(INTERFACE_VALIDATOR(props.classRegistry, tv), props.valuePath, props.dirtyPath), id: props.param.name, value: (implType) ? implType : "unset", tabIndex: index, autoFocus: index === 1, disabled: impl === null }, [React.createElement("option", { value: "unset", key: "unset" }, "unset")]
                    .concat(tv.implementations.map(function (val) { return React.createElement("option", { value: val, key: val }, val); }))),
                chunk.element),
        }, addGroupState: true }));
};


/***/ }),
/* 71 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

var __assign = (this && this.__assign) || Object.assign || function(t) {
    for (var s, i = 1, n = arguments.length; i < n; i++) {
        s = arguments[i];
        for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
            t[p] = s[p];
    }
    return t;
};
Object.defineProperty(exports, "__esModule", { value: true });
var React = __webpack_require__(0);
var Path_1 = __webpack_require__(2);
var Tools_1 = __webpack_require__(3);
var Form_1 = __webpack_require__(4);
var BOOLEAN_VALIDATOR = function (v) {
    switch (v) {
        case "unset":
            return { kind: "InitialValue" };
        case "true":
            return { kind: "Valid", val: true };
        case "false":
            return { kind: "Valid", val: false };
        default:
            return { kind: "Revert" };
    }
};
var id = function (x) { return x; };
var INT_PATTERN = /^-?[0-9]+$/;
var intValidatorFactory = function (bits, mutator) {
    if (mutator === void 0) { mutator = id; }
    // reduce by one to account for minus bit
    // - see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    bits -= 1;
    var min = Math.pow(-2, bits);
    var max = Math.pow(2, bits) - 1;
    return function (v) {
        if (v === "") {
            return { kind: "InitialValue" };
        }
        if (v === "-") {
            return { kind: "Incomplete", val: v };
        }
        if (!v.match(INT_PATTERN)) {
            return { kind: "Revert" };
        }
        var i = parseInt(v, 10);
        if (i < min || i > max) {
            return { kind: "Revert" };
        }
        return { kind: "Valid", val: mutator(i) };
    };
};
var BYTE_VALIDATOR = intValidatorFactory(8);
var SHORT_VALIDATOR = intValidatorFactory(16);
var INTEGER_VALIDATOR = intValidatorFactory(32);
var LONG_VALIDATOR = intValidatorFactory(64, function (x) { return "" + x; });
var FLOAT_PATTERN = /^-?[0-9]*\.?[0-9]*$/;
var FLOAT_IN_PROGRESS_PATTERN = /\.$/;
var FLOAT_VALIDATOR = function (v) {
    if (v === "") {
        return { kind: "InitialValue" };
    }
    if (v === "-") {
        return { kind: "Incomplete", val: v };
    }
    if (!v.match(FLOAT_PATTERN)) {
        return { kind: "Revert" };
    }
    if (v.match(FLOAT_IN_PROGRESS_PATTERN)) {
        return { kind: "Incomplete", val: v };
    }
    return { kind: "Valid", val: parseFloat(v) };
};
var DOUBLE_VALIDATOR = FLOAT_VALIDATOR; // Could be more precise here, but it doesn't seem worth the work
var CHARACTER_VALIDATOR = function (v) {
    if (v === "") {
        return { kind: "InitialValue" };
    }
    if (v.length > 1) {
        return { kind: "Revert" };
    }
    return { kind: "Valid", val: v };
};
var STRING_VALIDATOR = function (v) {
    return v.length === 0
        ? { kind: "InitialValue" }
        : { kind: "Valid", val: v };
};
var JSON_VALIDATOR = function (v) {
    if (v.length === 0) {
        return { kind: "InitialValue" };
    }
    try {
        var j = JSON.parse(v);
        if (typeof j === "string") {
            return { kind: "Valid", val: v };
        }
        else {
            return { kind: "Valid", val: j };
        }
    }
    catch (err) {
        return { kind: "Incomplete", val: v };
    }
};
var BYTE_ARRAY_VALIDATOR = function (v) { return ({ kind: "Valid", val: Tools_1.stringToBytes(v) }); };
var defaultToEmptyString = function (v) { return (v === undefined || v === null) ? "" : v.toString(); };
var validity = function (type, val, validator) {
    var validateNumber = function (v) {
        if (validator && validator.type === "RANGE") {
            if (validator.min !== undefined && v < validator.min) {
                return false;
            }
            if (validator.max !== undefined && v > validator.max) {
                return false;
            }
        }
        return true;
    };
    var validateString = function (v) {
        if (validator && validator.type === "PATTERN") {
            return v.match(validator.pattern) !== null;
        }
        return true;
    };
    if (val === null) {
        return Form_1.FormState.Success;
    }
    switch (type) {
        case "Boolean":
        case "Byte":
        case "Short":
        case "Integer":
        case "Float":
        case "Double":
            switch (typeof val) {
                case "string":
                    return Form_1.FormState.Danger;
                case "undefined":
                    return Form_1.FormState.Warning;
                case "number":
                    if (!validateNumber(val)) {
                        return Form_1.FormState.Danger;
                    }
            }
            break;
        case "Long":
            if (val === undefined || val.length === 0) {
                return Form_1.FormState.Warning;
            }
            if (val === "-") {
                return Form_1.FormState.Danger;
            }
            var i = parseInt(val, 10);
            if (!validateNumber(i)) {
                return Form_1.FormState.Danger;
            }
            break;
        case "Character":
            if (val === undefined || val.length !== 1) {
                return Form_1.FormState.Warning;
            }
            break;
        case "Json":
            if (val === undefined) {
                return Form_1.FormState.Warning;
            }
            if (typeof val === "string") {
                return Form_1.FormState.Danger;
            }
            break;
        case "String":
            if (val === undefined || val.length === 0) {
                return Form_1.FormState.Warning;
            }
            if (!validateString(val)) {
                return Form_1.FormState.Danger;
            }
            break;
    }
    return Form_1.FormState.Success;
};
exports.formChunk = function (props, onChange) {
    var inputName = JSON.stringify(props.typePath);
    var defaultFormChunk = defaultFormChunkCreator(props, onChange, inputName);
    switch (props.type) {
        case "Boolean":
            return booleanFormChunk(props, onChange, inputName);
        case "Byte":
            return defaultFormChunk(BYTE_VALIDATOR);
        case "Short":
            return defaultFormChunk(SHORT_VALIDATOR);
        case "Integer":
            return defaultFormChunk(INTEGER_VALIDATOR);
        case "Long":
            return defaultFormChunk(LONG_VALIDATOR);
        case "Float":
            return defaultFormChunk(FLOAT_VALIDATOR);
        case "Double":
            return defaultFormChunk(DOUBLE_VALIDATOR);
        case "Character":
            return defaultFormChunk(CHARACTER_VALIDATOR);
        case "String":
            return defaultFormChunk(STRING_VALIDATOR);
        case "Json":
            return untypedJsonFormChunk(props, onChange, inputName);
        case "[Byte]": {
            return byteArrayFormChunk(props, onChange, inputName);
        }
    }
    return { state: Form_1.FormState.Danger, element: React.createElement("div", null) };
};
var booleanFormChunk = function (props, onChange, inputName) {
    var val = Path_1.opi.get(props.state, props.valuePath);
    var formState = validity(props.type, val, props.param.validator);
    var index = props.tabIndex();
    var defaultValue = (props.param.default && props.parent !== null && val === null)
        ? " (" + props.param.default + ")"
        : "";
    return Form_1.label(__assign({}, props, { labelFor: inputName, wrapping: {
            state: formState,
            element: React.createElement("select", { className: "form-control form-control-" + formState, name: inputName, onChange: onChange(BOOLEAN_VALIDATOR, props.valuePath, props.dirtyPath), id: props.param.name, tabIndex: index, autoFocus: index === 1, value: (val === undefined || val === null) ? "unset" : val, disabled: val === null },
                React.createElement("option", { value: "unset", key: "unset" }, "unset" + defaultValue),
                React.createElement("option", { value: "true", key: "true" }, "true"),
                React.createElement("option", { value: "false", key: "false" }, "false")),
        }, addGroupState: true }));
};
var byteArrayFormChunk = function (props, onChange, inputName) {
    var val = Path_1.opi.get(props.state, props.valuePath);
    var formState = Form_1.FormState.Success;
    var index = props.tabIndex();
    return Form_1.label(__assign({}, props, { labelFor: inputName, wrapping: {
            state: Form_1.FormState.Success,
            element: React.createElement("textarea", { className: "form-control form-control-" + formState, name: inputName, onChange: onChange(BYTE_ARRAY_VALIDATOR, props.valuePath, props.dirtyPath), value: defaultToEmptyString(Tools_1.bytesToString(val)), placeholder: (props.param.default && props.parent !== null && val === null)
                    ? defaultToEmptyString(Tools_1.bytesToString(props.param.default))
                    : "", id: props.param.name, tabIndex: index, autoFocus: index === 1, readOnly: val === null }),
        }, addGroupState: true }));
};
var untypedJsonFormChunk = function (props, onChange, inputName) {
    var val = Path_1.opi.get(props.state, props.valuePath);
    var formState = validity(props.type, val, props.param.validator);
    var inputVal = val ? (typeof val === "string" ? val : JSON.stringify(val)) : val;
    var index = props.tabIndex();
    return Form_1.label(__assign({}, props, { labelFor: inputName, wrapping: {
            state: formState,
            element: React.createElement("textarea", { className: "form-control form-control-" + formState, name: inputName, onChange: onChange(JSON_VALIDATOR, props.valuePath, props.dirtyPath), value: defaultToEmptyString(inputVal), placeholder: (props.param.default && props.parent !== null && inputVal === null)
                    ? defaultToEmptyString(props.param.default)
                    : "", id: props.param.name, tabIndex: index, autoFocus: index === 1, readOnly: inputVal === null }),
        }, addGroupState: true }));
};
var defaultFormChunkCreator = function (props, onChange, inputName) { return function (validator) {
    var val = Path_1.opi.get(props.state, props.valuePath);
    var formState = validity(props.type, val, props.param.validator);
    var index = props.tabIndex();
    return Form_1.label(__assign({}, props, { labelFor: inputName, wrapping: {
            state: formState,
            element: React.createElement("input", { className: "form-control form-control-" + formState, name: inputName, value: defaultToEmptyString(val), onChange: onChange(validator, props.valuePath, props.dirtyPath), autoComplete: "off", placeholder: (props.param.default && props.parent !== null && val === null) ? props.param.default : "", id: props.param.name, tabIndex: index, autoFocus: index === 1, readOnly: val === null }),
        }, addGroupState: true }));
}; };


/***/ }),
/* 72 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";

var __assign = (this && this.__assign) || Object.assign || function(t) {
    for (var s, i = 1, n = arguments.length; i < n; i++) {
        s = arguments[i];
        for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
            t[p] = s[p];
    }
    return t;
};
Object.defineProperty(exports, "__esModule", { value: true });
var Endpoint_1 = __webpack_require__(11);
var Path_1 = __webpack_require__(2);
var Tools_1 = __webpack_require__(3);
exports.reducerFactory = function (classRegistry, endpoints) { return function (state, action) {
    if (state === void 0) { state = {
        endpoints: endpoints.map(Endpoint_1.pathSpecInit.bind(null, classRegistry)),
        toolkitOpenFor: null,
        typeDefOpenFor: null,
    }; }
    switch (action.type) {
        case "TOOLKIT_SET_VALUE":
            var dirtiness = Path_1.opi.get(state, action.dirtyPath);
            if (dirtiness.indexOf(JSON.stringify(action.valuePath)) === -1) {
                var dirtyState = Path_1.opi.set(state, action.dirtyPath, dirtiness.concat(JSON.stringify(action.valuePath)));
                return Path_1.opi.set(dirtyState, action.valuePath, action.value);
            }
            return Path_1.opi.set(state, action.valuePath, action.value);
        case "TOOLKIT_CLEAR_VALUE":
            if (action.reset) {
                var cleanState = Path_1.opi.set(state, action.dirtyPath, []);
                return Path_1.opi.set(cleanState, action.valuePath, action.value);
            }
            else {
                var cleanness = Path_1.opi.get(state, action.dirtyPath);
                var index = cleanness.indexOf(JSON.stringify(action.valuePath));
                if (index !== -1) {
                    cleanness.splice(index, 1);
                    var cleanState = Path_1.opi.set(state, action.dirtyPath, cleanness);
                    return Path_1.opi.set(cleanState, action.valuePath, action.value);
                }
                else {
                    return Path_1.opi.set(state, action.valuePath, action.value);
                }
            }
        case "TOOLKIT_NULL_VALUE":
            var provideCleanness = Path_1.opi.get(state, action.dirtyPath);
            var provideIndex = provideCleanness.indexOf(JSON.stringify(action.valuePath));
            if (provideIndex !== -1) {
                provideCleanness.splice(provideIndex, 1);
                var cleanState = Path_1.opi.set(state, action.dirtyPath, provideCleanness);
                return Path_1.opi.set(cleanState, action.valuePath, null);
            }
            else {
                return Path_1.opi.set(state, action.valuePath, null);
            }
        case "TOOLKIT_PROVIDE_VALUE":
            var nullDirtiness = Path_1.opi.get(state, action.dirtyPath);
            if (nullDirtiness.indexOf(JSON.stringify(action.valuePath)) === -1) {
                var dirtyState = Path_1.opi.set(state, action.dirtyPath, nullDirtiness.concat(JSON.stringify(action.valuePath)));
                return Path_1.opi.set(dirtyState, action.valuePath, Endpoint_1.valueInit(classRegistry, action.value_type));
            }
            return Path_1.opi.set(state, action.valuePath, Endpoint_1.valueInit(classRegistry, action.value_type));
        case "TOOLKIT_RENAME_KEY": {
            var o = Path_1.opi.get(state, action.path);
            if (o === undefined) {
                throw new Error("Object should not be undefined");
            }
            var val = o[action.key];
            delete o[action.key];
            o[action.value] = val;
            return Path_1.opi.set(state, action.path, o);
        }
        case "TOOLKIT_ADD_ROW": {
            var o = Path_1.opi.get(state, action.valuePath);
            if (o === undefined) {
                throw new Error("Object should not be undefined");
            }
            if (Array.isArray(o)) {
                o.push(Endpoint_1.valueInit(classRegistry, action.row_type));
            }
            else {
                o[Tools_1.padStart(5, "0", Object.keys(o).length) + "_"] = Endpoint_1.valueInit(classRegistry, action.row_type);
            }
            var addDirtiness = Path_1.opi.get(state, action.dirtyPath);
            if (addDirtiness.indexOf(JSON.stringify(action.valuePath)) === -1) {
                var dirtyState = Path_1.opi.set(state, action.dirtyPath, addDirtiness.concat(JSON.stringify(action.valuePath)));
                return Path_1.opi.set(dirtyState, action.valuePath, o);
            }
            return Path_1.opi.set(state, action.valuePath, o);
        }
        case "TOOLKIT_REMOVE_ROW": {
            var o = Path_1.opi.get(state, action.valuePath);
            if (o === undefined) {
                throw new Error("Object should not be undefined");
            }
            if (Array.isArray(o)) {
                var newArr = [];
                for (var i = 0; i < o.length; i++) {
                    if (i === action.key) {
                        continue;
                    }
                    newArr.push(o[i]);
                }
                o = newArr;
            }
            else {
                delete o[action.key];
            }
            var removeCleanness = Path_1.opi.get(state, action.dirtyPath);
            var removeIndex = removeCleanness.indexOf(JSON.stringify(action.valuePath));
            if (removeIndex !== -1) {
                removeCleanness.splice(removeIndex, 1);
                var cleanState = Path_1.opi.set(state, action.dirtyPath, removeCleanness);
                return Path_1.opi.set(cleanState, action.valuePath, o);
            }
            else {
                return Path_1.opi.set(state, action.valuePath, o);
            }
        }
        case "OPEN_TOOLKIT":
            return __assign({}, state, { toolkitOpenFor: action.endpointIndex });
        case "CLOSE_TOOLKIT":
            return __assign({}, state, { toolkitOpenFor: null });
        case "OPEN_TYPEDEF":
            return __assign({}, state, { typeDefOpenFor: action.typeName });
        case "CLOSE_TYPEDEF":
            return __assign({}, state, { typeDefOpenFor: null });
        case "API_RESPONSE_RECEIVED":
            return Path_1.opi.set(state, ["endpoints", action.endpointIdx, "response"], action.response);
        case "API_RESPONSE_CLEARED":
            return Path_1.opi.set(state, ["endpoints", action.endpointIdx, "response"], undefined);
        default:
            return state;
    }
}; };


/***/ })
/******/ ]);
//// removes from global namespace
//(function() {
//
////     format val to n number of decimal places
////     modified version of Danny Goodman's (JS Bible)
////    function formatDecimal(val, n) {
////        n = n || 2;
////        var str = "" + Math.round ( parseFloat(val) * Math.pow(10, n) );
////        while (str.length <= n) {
////            str = "0" + str;
////        }
////        var pt = str.length - n;
////        return str.slice(0,pt) + "." + str.slice(pt);
////    }
//
//    function getRadioVal(form, name) {
//        var radios = form.elements[name];
//        var val;
//
//        for (var i=0, len=radios.length; i<len; i++) {
//            if ( radios[i].checked == true ) {
//                val = radios[i].value;
//                break;
//            }
//        }
//        return val;
//    }
//
//    function getToppingsTotal(e) {
//        var form = this.form;
//        var val = parseFloat( form.elements['toppings_tot'].value );
//
//        if ( this.checked == true ) {
//            val += parseFloat(this.value);
//        } else {
//            val -= parseFloat(this.value);
//        }
//
//        form.elements['toppings_tot'].value = formatDecimal(val);
//        updateRamenTotal(form);
//    }
//
//    function getBrothPrice(e) {
//        this.form.elements['broth_tot'].value = parseFloat( this.value );
//        updateRamenTotal(this.form);
//    }
//
//    function getNoodlePrice(e) {
//        this.form.elements['noodle_tot'].value = parseFloat( this.value );
//        updateRamenTotal(this.form);
//    }
//
//    function updateRamenTotal(form) {
//        var broth_tot = parseFloat( form.elements['broth_tot'].value );
//        var noodle_tot = parseFloat( form.elements['noodle_tot'].value);
//        var toppings_tot = parseFloat( form.elements['toppings_tot'].value );
//        form.elements['total'].value = formatDecimal( broth_tot + noodle_tot + toppings_tot );
//    }
//
//
//
//    var form = document.getElementById('ramenForm');
//
//    var el = document.getElementById('ramen_toppings');
//
//    // input in toppings container element
//    var tops = el.getElementsByTagName('input');
//
//    for (var i=0, len=tops.length; i<len; i++) {
//        if ( tops[i].type === 'checkbox' ) {
//            tops[i].onclick = getToppingsTotal;
//        }
//    }
//
//    var broth = form.elements['broth'];
//
//    for (var i=0, len=broth.length; i<len; i++) {
//        broth[i].onclick = getbrothPrice;
//    }
//
//    var noodle = form.elements['broth'];
//
//    for (var i=0, len=noodle.length; i<len; i++) {
//        broth[i].onclick = getnoodlePrice;
//    }
//
//
//    // set sz_tot to value of selected
//    form.elements['broth_tot'].value = formatDecimal( parseFloat( getRadioVal(form, 'broth') ) );
//    updatePizzaTotal(form);
//
//    form.elements['noodle_tot'].value = formatDecimal( parseFloat( getRadioVal(form, 'noodle') ) );
//    updatePizzaTotal(form);
//
//}());
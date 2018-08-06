package com.babosamo.rx.turorial

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater

class ObservableView : ConstraintLayout {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}


    // http://reactivex.io/documentation/observable.html

    //Creating Observables
    //Transforming Observables
    //Filtering Observables
    //Combining Observables
    //Conditional and Boolean Operators
    //Mathematical and Aggregate Operators
    //Backpressure Operators

    init {
        LayoutInflater.from(context).inflate(R.layout.layout_view_observable, this, true)
    }

}



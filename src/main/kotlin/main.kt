package com.linxuedesign.handyman

/**
 * Created by Brandon Elam Barker on 4/5/2015.
 */

import kotlin.js.dom.html.document

fun main(args: Array<String>) {

    val el = document.createElement("div")
    el.appendChild(document.createTextNode("Hello!"))
    document.body.appendChild(el)

    document.getElementById("email").setAttribute(
            "value", "hello@kotlinlang.org"
    )

}
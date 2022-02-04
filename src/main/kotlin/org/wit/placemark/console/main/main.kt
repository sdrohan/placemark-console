package org.wit.placemark.console.main

import mu.KotlinLogging
import org.wit.placemark.console.controllers.PlacemarkController

private val logger = KotlinLogging.logger {}

/* Entry point into the program
   The start function in PlacemarkController is kicked off.
 */

fun main(args: Array<String>) {
    PlacemarkController().start()
}



package org.wit.placemark.console.models

/* This class is the Model class i.e. determines the data and types
   for each property being stored in a Placemark.
 */
data class PlacemarkModel(var id: Long = 0,
                          var title: String = "",
                          var description: String = "")

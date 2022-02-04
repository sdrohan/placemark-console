package org.wit.placemark.console.models

/* This is the interface for the class, PlacemarkMemStore.
   It identifies the methods that much be included in the class.
 */
interface PlacemarkStore {
    fun findAll(): List<PlacemarkModel>
    fun findOne(id: Long): PlacemarkModel?
    fun create(placemark: PlacemarkModel)
    fun update(placemark: PlacemarkModel)
}

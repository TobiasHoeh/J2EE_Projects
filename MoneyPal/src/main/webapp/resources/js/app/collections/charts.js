/**
 * Module for the Charts collection
 */
define([
    // Backbone and the collection element type are dependencies
    'backbone',
    'app/models/chart'
], function (Backbone, Chart) {
    /**
     *  Here we define the Bookings collection
     *  We will use it for CRUD operations on Bookings
     */
    var Charts = Backbone.Collection.extend({
        url:"rest/charts", // the URL for performing CRUD operations
        model: Chart,
        id:"id", // the 'id' property of the model is the identifier
        comparator:function (model) {
            return model.get('series');
        }
    });
    return Charts;
});
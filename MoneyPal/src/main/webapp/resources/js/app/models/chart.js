/**
 * Module for the Chart model
 */
define([
    'backbone' // depends and imports Backbone
], function (Backbone) {
    /**
     * The Event model class definition
     * Used for CRUD operations against individual events
     */
    var Chart = Backbone.Model.extend({
        urlRoot:'rest/charts' // the URL for perfoming CRUD operations
    });
    // export the Event class
    return Chart;
});
/**
 * A module for the router of the desktop application
 */
define("router", [
    'jquery',
    'underscore',
    'backbone',
    'app/collections/events',
    'app/views/desktop/events',
],function ($,
            _,
            Backbone,
            Events,
            EventsView) {

    /**
     * The Router class contains all the routes within the application -
     * i.e. URLs and the actions that will be taken as a result.
     *
     * @type {Router}
     */

    var Router = Backbone.Router.extend({
        routes:{
            "":"events", // listen to #events
            "events":"events" // listen to #events
        },
        events:function () {
                //initialize the events collection
            var events = new Events();
            // create an events view
            var eventsView = new EventsView({model:events, el:$("#content")});
            // render the view when the collection elements are fetched from the
            // RESTful service
            events.bind("reset",
                function () {
                    eventsView.render();
            }).fetch();
        }});

    // Create a router instance
    var router = new Router();

    // Begin routing
    Backbone.history.start();

    return router;
});
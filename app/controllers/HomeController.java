package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        // Render the index view (index.scala.html)
        return ok(index.render());
    }

    public Result about() {
        // Render the about view (about.scala.html)
        return ok(about.render());
    }

    public Result services() {
        // Render the services view (services.scala.html)
        return ok(services.render());
    }

    public Result clients() {
        // Render the clients view (clients.scala.html)
        return ok(clients.render());
    }

    public Result contact() {
        // Render the contact view (contact.scala.html)
        return ok(contact.render());
    }
}

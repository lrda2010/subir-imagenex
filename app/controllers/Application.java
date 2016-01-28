package controllers;

import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.subir;

import java.io.File;
import java.io.IOException;

public class Application extends Controller {

    public static Result index() {

        return ok(subir.render());
    }

    public static Result subirImagen() throws IOException {

        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart picture = body.getFile("file");
        if (picture != null) {
            File file = picture.getFile();
            CloudAPI cloud = new CloudAPI();
            cloud.subida(file);
            return ok(subir.render());
        } else {
            flash("error", "Missing file");
            return redirect(controllers.routes.Application.index());
        }
    }



}

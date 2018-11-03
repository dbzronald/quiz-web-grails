package quiz.web.grails

class Eventos implements Serializable {

    private static final long serialVersionUID = 1;

    String nombre;
    String descripcion;
    String fecha_ini;
    String fecha_fin;
    String edad;

    static constraints = {
        edad min: 18
    }
}

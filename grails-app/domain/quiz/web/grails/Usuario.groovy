package quiz.web.grails

import grails.compiler.GrailsCompileStatic
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode(includes='mail')
@ToString(includes='mail', includeNames=true, includePackage=false)
class Usuario implements Serializable {

    private static final long serialVersionUID = 1;

    String nombre;
    String pass;
    String apellidos;
    String cedula;
    String mail;
    String fecha_Nacimiento;


    static constraints = {
        pass nullable: false, blank: false, password: true
        mail nullable: false, blank: false, unique: true
    }
}
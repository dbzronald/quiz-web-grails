package quiz.web.grails

import grails.gorm.DetachedCriteria
import groovy.transform.ToString

import org.codehaus.groovy.util.HashCodeHelper
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
@ToString(cache=true, includeNames=true, includePackage=false)
class RolUsuario implements Serializable {

    private static final long serialVersionUID = 1

    Usuario user
    Rol role

    @Override
    boolean equals(otro) {
        if (otro instanceof RolUsuario) {
            otro.userId == user?.id && otro.roleId == role?.id
        }
    }

    @Override
    int hashCode() {
        int hashCode = HashCodeHelper.initHash()
        if (user) {
            hashCode = HashCodeHelper.updateHash(hashCode, user.id)
        }
        if (role) {
            hashCode = HashCodeHelper.updateHash(hashCode, role.id)
        }
        hashCode
    }

    static RolUsuario get(long userId, long roleId) {
        criteriaFor(userId, roleId).get()
    }

    static boolean exists(long userId, long roleId) {
        criteriaFor(userId, roleId).count()
    }

    private static DetachedCriteria criteriaFor(long userId, long roleId) {
        RolUsuario.where {
            user == User.load(userId) &&
                    role == Role.load(roleId)
        }
    }

    static RolUsuario create(Usuario user, Rol role, boolean flush = true)
    {
        def instance = new RolUsuario(user: user, role: role)
        instance.save(flush: flush)
        instance
    }

    static constraints = {
        user nullable: false
        role nullable: false, validator: { Rol r, RolUsuario ru ->
            if (ru.user?.id) {
                if (RolUsuario.exists(ru.user.id, r.id)) {
                    return ['userRole.exists']
                }
            }
        }
    }

    static mapping = {
        id composite: ['user', 'role']
        version false
    }
}

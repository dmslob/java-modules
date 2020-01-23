module com.dmslob.dao {
    requires transitive com.dmslob.entity;
    uses com.dmslob.entity.internal.Admin;
    exports com.dmslob.dao;
}
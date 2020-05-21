package app.sakai.tororoimo.databaserealm

import io.realm.RealmObject

open class Memo (
    open var title: String = "",
    open var content: String = ""
) : RealmObject()



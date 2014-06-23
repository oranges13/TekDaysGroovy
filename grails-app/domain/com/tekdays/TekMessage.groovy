package com.tekdays

class TekMessage {
    
    String subject
    String contents
    TekMessage parent
    TekEvent event
    TekUser author
    
    String toString() {
        "$subject by $author"
    }

    static constraints = {
        subject blank: false
        contents blank: false, maxSize: 2000
        parent nullable: true
        author nullable: false
    }
    
    static belongsTo = TekEvent
}

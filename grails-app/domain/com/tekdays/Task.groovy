package com.tekdays

class Task {
    
    String title
    String notes
    TekUser assignedTo
    Date dueDate
    TekEvent event
    
    String toString() {
        title
    }

    static constraints = {
        title blank: false
        notes blank: false, nullable: true, maxSize: 5000
        assignedTo nullable: false
        dueDate nullable: false
    }
    
    static belongsTo = TekEvent
}

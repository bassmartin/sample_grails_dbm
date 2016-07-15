databaseChangeLog = {

    changeSet(author: "smartin (generated)", id: "1468611106640-1") {
        addColumn(tableName: "car") {
            column(name: "door_count2", type: "integer") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "smartin (generated)", id: "1468611106640-2") {
        addColumn(tableName: "car") {
            column(name: "manufacturing_time2", type: "timestamptz") {
                constraints(nullable: "false")
            }
        }
    }
}

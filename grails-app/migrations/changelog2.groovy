databaseChangeLog = {

    changeSet(author: "smartin (generated)", id: "1468611383698-1") {
        createTable(tableName: "car") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "carPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "door_count", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "door_count2", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "manufacturing_time", type: "timestamp") {
                constraints(nullable: "false")
            }

            column(name: "manufacturing_time2", type: "timestamp") {
                constraints(nullable: "false")
            }
        }
    }
}

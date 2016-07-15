databaseChangeLog = {

    changeSet(author: "smartin (generated)", id: "1468610517085-1") {
        createTable(tableName: "CAR") {
            column(autoIncrement: "true", name: "ID", type: "BIGINT(19)") {
                constraints(primaryKey: "true", primaryKeyName: "CONSTRAINT_1")
            }

            column(name: "VERSION", type: "BIGINT(19)") {
                constraints(nullable: "false")
            }

            column(name: "DOOR_COUNT", type: "INT(10)") {
                constraints(nullable: "false")
            }

            column(name: "MANUFACTURING_TIME", type: "TIMESTAMP") {
                constraints(nullable: "false")
            }
        }
    }
}

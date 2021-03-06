package com.fujitsu.archmsa.apibase.config

import org.flywaydb.core.Flyway
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy

class CustomFlywayMigrationStrategy: FlywayMigrationStrategy {

    override fun migrate(flyway: Flyway?) {
        flyway?.clean()
        flyway?.migrate()
    }
}
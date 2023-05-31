package net.konohana.sakuya.phacelia.repositories.enju

import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.repository.reactive.ReactorCrudRepository
import net.konohana.sakuya.phacelia.models.enju.EnjuRW09FareDist
import reactor.core.publisher.Mono

@R2dbcRepository(dialect = Dialect.POSTGRES)
interface EnjuRW09FareDistRepository : ReactorCrudRepository<EnjuRW09FareDist, Int> {
    fun findByStaCode(staCode: String): Mono<EnjuRW09FareDist>
}

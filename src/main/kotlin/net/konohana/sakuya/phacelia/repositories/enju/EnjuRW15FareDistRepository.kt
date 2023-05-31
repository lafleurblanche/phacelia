package net.konohana.sakuya.phacelia.repositories.enju

import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.repository.reactive.ReactorCrudRepository
import net.konohana.sakuya.phacelia.models.enju.EnjuRW15FareDist
import reactor.core.publisher.Mono

@R2dbcRepository(dialect = Dialect.POSTGRES)
interface EnjuRW15FareDistRepository : ReactorCrudRepository<EnjuRW15FareDist, Int> {
    fun findByStaCode(staCode: String): Mono<EnjuRW15FareDist>
}

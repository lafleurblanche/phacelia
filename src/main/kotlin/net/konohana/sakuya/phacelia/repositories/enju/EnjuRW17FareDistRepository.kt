package net.konohana.sakuya.phacelia.repositories.enju

import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.repository.reactive.ReactorCrudRepository
import net.konohana.sakuya.phacelia.models.enju.EnjuRW17FareDist
import reactor.core.publisher.Mono

@R2dbcRepository(dialect = Dialect.POSTGRES)
interface EnjuRW17FareDistRepository : ReactorCrudRepository<EnjuRW17FareDist, Int> {
    fun findByStaCode(staCode: String): Mono<EnjuRW17FareDist>
}

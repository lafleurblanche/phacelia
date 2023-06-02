package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW06FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW06FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW06FareDistコントローラ
 * @author lafleurblanche
 */
@Controller("/enjurw06faredist")
class EnjuRW06FareDistController(
    private val enjuRW06FareDistRepository: EnjuRW06FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW06FareDist> {
        return enjuRW06FareDistRepository.findByStaCode(staCode)
    }
}
